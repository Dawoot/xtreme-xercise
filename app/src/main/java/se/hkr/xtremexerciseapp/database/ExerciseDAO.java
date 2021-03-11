package se.hkr.xtremexerciseapp.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ExerciseDAO {

    @Query("SELECT * FROM exercise")
    List<Exercise> getAllExercises();

    @Insert
    void insertExercise(Exercise... exercises);

    @Delete
    void deleteExercise(Exercise exercise);

    @Query("SELECT * FROM routine")
    List<Routine> getAllRoutines();

    @Insert
    void insertRoutine(Routine... routine);

    @Delete
    void deleteRoutine(Routine routine);

    @Query("UPDATE Routine SET Exercise_List = :exerciseList WHERE id = :id")
    void updateExerciseList(int id, String exerciseList);

    // Unsure if this is correct
    @Query("SELECT * FROM exercise WHERE category = :category")
    List<Exercise> getCategoryExercises(int category);

    @Query("SELECT * FROM Routine WHERE id = :id")
    Routine getRoutineById(int id);
}
