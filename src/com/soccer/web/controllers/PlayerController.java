package com.soccer.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.domains.TeamBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PlayerBean player = new PlayerBean();
		player = null;
				
		switch(request.getParameter("action")) {
		case "move" :
			System.out.println("move 읽음");
			break;
			
		case "position":
			request.setAttribute("positions",PlayerServiceImpl.getInstance().findPositions());
			break;
		
		case "find":
			System.out.println("find 읽음");
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			request.setAttribute("player",PlayerServiceImpl.getInstance().findByTeamIdPosition(player));
			break;
			
		case "findbyheightnameplayerinfo":
			System.out.println("findbyheightnameplayerinfo 읽음");
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			player.setPlayerName(request.getParameter("playerName"));
			request.setAttribute("player5",PlayerServiceImpl.getInstance().findByHeightPlayerName(player));
			break;
		}
		
		request.getRequestDispatcher
		(String.format(Constants.VIEW_PATH,
				"player",
				request.getParameter("page")))
		.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
