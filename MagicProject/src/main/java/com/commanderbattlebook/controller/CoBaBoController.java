package com.commanderbattlebook.controller;

import java.util.List;

import com.commanderbattlebook.model.CoBaBo;
import com.commanderbattlebook.service.CoBaBoService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/CommanderBattleBook")
public class CoBaBoController {
	
	private CoBaBoService service = new CoBaBoService();

    
    @DELETE
    @Path("/{idValue}")
    public CoBaBo deleteGameByID(@PathParam("idValue") Integer id) {
        return service.deleteGameByID(id);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public CoBaBo updateGame(CoBaBo updateGame) {
        return service.updateGame(updateGame);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public CoBaBo createMovie(CoBaBo newGame) {
        return service.createGame(newGame);
    }

    @GET
    public List<CoBaBo> getGames() {
        return service.getGames();
    }

    @GET
    @Path("/{idValue}")
    public List<CoBaBo> getGameById(@PathParam("idValue") Integer id) {
        return service.getGameById(id);
    }

    @GET
    @Path("/deck/{deckName}") 
    public List<CoBaBo> getGameByDeckName(@PathParam("deckName") String name) {
        return service.getGameByDeckName(name);
    }

    @GET
    @Path("/gameWinner/{winner}") 
    public List<CoBaBo> getGameWinner(@PathParam("winner") Boolean gameWinner) {
        return service.getGameWinner(gameWinner);
    }
}


