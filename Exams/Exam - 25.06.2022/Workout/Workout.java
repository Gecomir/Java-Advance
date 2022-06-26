package Examp.Problem3;


import java.util.ArrayList;
import java.util.List;

public class Workout<addExercise> {
    private String type;
    private int exerciseCount;
    private List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (this.exercises.size() < this.exerciseCount) {
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return exercises.removeIf(e -> e.getName().equals(name) && e.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        return exercises.stream()
                .filter(person -> person.getName().equals(name) && person.getMuscle().equals(muscle))
                .findFirst()
                .orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise() {
        Exercise bestExercise = null;
        int max = -1;
        for (Exercise exercise : exercises) {
            if (exercise.getBurnedCalories() > max) {
                max = exercise.getBurnedCalories();
                bestExercise = exercise;
            }
        }
        return bestExercise;
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout: %s%n", this.type));

        for (Exercise exercise : exercises) {
            sb.append(String.format("Exercise: %s%n", exercise));
        }
        return sb.toString();
    }
}
