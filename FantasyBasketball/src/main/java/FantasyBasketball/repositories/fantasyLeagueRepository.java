package FantasyBasketball.repositories;

import FantasyBasketball.models.FantasyLeague;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/*
    CrudRepository already has the following functions:
        (in the form): function_name(parameter:parameter_type):return_type
        save(entity:S):S
        saveAll(entities:Iterable<S>):Iterable<S>
        findById(id:ID):Optional<T>
        existsById(id:ID):boolean
        findAll():Iterable<T>
        findAllById(ids:Iterable<ID>)Iterable<T>
        count():long
        deleteById(idLID):void
        delete(entity:T):void
        deleteAllById(ids:Iterable<? extends ID>):void
        deleteAll(entities:Iterable<? extends T>):void
        deleteAll():void

    All functions below extend the CrudRepository
 */

@Repository
public interface fantasyLeagueRepository extends CrudRepository<FantasyLeague, Integer> {

    @Query (value = "select * from fantasy_league where ((:league_id is NULL or league_id = :league_id) and\n" +
            "                          (:league_name is NULL or league_name LIKE %:league_name%) and\n" +
            "                          (:admin_id is NULL or admin_id = :admin_id) and\n" +
            "                          (:league_size is NULL or league_size = :league_size) and\n" +
            "                          (:league_start_date is NULL or league_start_date = :league_start_date and\n" +
            "                          (:league_end_date is NULL or league_end_date = :league_end_date))",
            nativeQuery = true)
    List<FantasyLeague> findByTemplate(@Param ("league_id") Integer league_id,
                              @Param("league_name") String league_name,
                              @Param("admin_id") Integer admin_id,
                              @Param("league_size") Integer league_size,
                              @Param("league_start_date") Date league_start_date,
                              @Param("league_end_date") Date league_end_date);
}
