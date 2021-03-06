
/*
 * Created on 30 oct. 2014 ( Time 13:59:49 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package main.java.org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import main.java.org.demo.bean.jpa.EventsEntity;
import main.java.org.demo.mock.tool.MockValues;

public class EventsEntityMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public EventsEntity createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public EventsEntity createInstance( Integer id ) {
		EventsEntity entity = new EventsEntity();
		// Init Primary Key fields
		entity.setId( id) ;
		// Init Data fields
		entity.setName( mockValues.nextString(100) ) ; // java.lang.String 
		entity.setPublication( mockValues.nextInteger() ) ; // java.lang.Integer 
		entity.setAdresse( mockValues.nextString(255) ) ; // java.lang.String 
		entity.setDateDebut( mockValues.nextDate() ) ; // java.util.Date 
		entity.setHeureDebut( mockValues.nextDate() ) ; // java.util.Date 
		entity.setDateFin( mockValues.nextDate() ) ; // java.util.Date 
		entity.setHeureFin( mockValues.nextDate() ) ; // java.util.Date 
		// Init Link fields (if any)
		// setListOfParticipations( TODO ) ; // List<Participations> 
		// setOrganizers( TODO ) ; // Organizers 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<EventsEntity> createList(int count) {
		List<EventsEntity> list = new LinkedList<EventsEntity>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
