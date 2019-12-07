package com.myprojects.kursspring.services;

import com.myprojects.kursspring.domain.Quest;
import com.myprojects.kursspring.repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class QuestFormatter implements Formatter<Quest> {

    @Autowired
    QuestRepository questRepository;

    @Override
    public Quest parse(String s, Locale locale) throws ParseException {
        Integer id = Integer.parseInt(s);
        return questRepository.getQuest(id);
    }

    @Override
    public String print(Quest quest, Locale locale) {
        return quest.toString();
    }
}
