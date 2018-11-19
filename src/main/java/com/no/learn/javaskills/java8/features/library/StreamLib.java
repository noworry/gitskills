package com.no.learn.javaskills.java8.features.library;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/19.
 */
public class StreamLib implements FeatureDemo {
    @Override
    public void run() {

        final Collection<Task> tasks = Arrays.asList(
            new Task(Status.OPEN, 5),
            new Task(Status.OPEN, 13),
            new Task(Status.CLOSED, 8)
        );

        // Calculate total points of all active tasks using sum()
        final long totalPointsOfOpenTasks = tasks
            .stream()
            .filter(task -> task.getStatus() == Status.OPEN)
            .mapToInt(Task::getPoints)
            .sum();
        System.out.println("Total points: " + totalPointsOfOpenTasks);

        // Calculate total points of all tasks
        final double totalPoints = tasks
            .stream()
            .parallel()
            .map(task -> task.getPoints())
            .reduce(0, Integer::sum);
        System.out.println("Total points (all tasks): " + totalPoints);

        // Group tasks by their status
        final Map<Status, List<Task>> map = tasks
            .stream()
            .collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);

        // Calculate the weight of each tasks (as percent of total points)
        final Collection<String> result = tasks
            // Stream< String >
            .stream()
            // IntStream
            .mapToInt(Task::getPoints)
            // LongStream
            .asLongStream()
            // DoubleStream
            .mapToDouble(points -> points / totalPoints)
            //  Stream< Double >
            .boxed()
            // LongStream
            .mapToLong(weight -> (long)(weight * 100))
            // Stream< String>
            .mapToObj(percentage -> percentage + "%")
            // List< String >
            .collect(Collectors.toList());
        System.out.println(result);

    }

    private enum Status {
        OPEN,
        CLOSED
    }

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }

}
