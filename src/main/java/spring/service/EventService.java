package spring.service;

import org.springframework.stereotype.Service;
import spring.domain.Event;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    static final ArrayList<Event> events = new ArrayList<Event>(){{
        add(new Event("Opera", "London"));
        add(new Event("Violin concert", "Prague"));
        add(new Event("Jazz concert", "Berlin"));
        add(new Event("Art exhibition", "London"));
    }};

    public List<Event> findAll() {
        return events;
    }

    public void add(Event event) {
        events.add(event);
    }

    public List<String> findAllCity(){
        List<String> cities = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
           cities.add(events.get(i).getCity());
        }
        return cities;
    }
}
