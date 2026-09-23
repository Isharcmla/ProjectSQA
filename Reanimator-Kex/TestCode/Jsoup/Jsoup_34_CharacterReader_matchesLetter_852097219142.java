package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_matchesLetter_852097219142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20043;
     Object term20163;

    public CharacterReader_matchesLetter_852097219142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20043 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term19942 = (char[]) newCharArray(8);
        setIntField(term20043, term20043.getClass(), "pos", 6);
        setIntField(term20043, term20043.getClass(), "length", 7);
        setCharElement(term19942, 0, (char) 96);
        setCharElement(term19942, 1, (char) 96);
        setCharElement(term19942, 2, (char) 96);
        setCharElement(term19942, 3, (char) 96);
        setCharElement(term19942, 4, (char) 96);
        setCharElement(term19942, 5, (char) 96);
        setCharElement(term19942, 6, (char) 96);
        setCharElement(term19942, 7, (char) 96);
        setField(term20043, term20043.getClass(), "input", term19942);
        term20163 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term20164 = (char[]) newCharArray(8);
        setCharElement(term20164, 0, (char) 96);
        setCharElement(term20164, 1, (char) 96);
        setCharElement(term20164, 2, (char) 96);
        setCharElement(term20164, 3, (char) 96);
        setCharElement(term20164, 4, (char) 96);
        setCharElement(term20164, 5, (char) 96);
        setCharElement(term20164, 6, (char) 96);
        setCharElement(term20164, 7, (char) 96);
        setField(term20163, term20163.getClass(), "input", term20164);
        setIntField(term20163, term20163.getClass(), "length", 7);
        setIntField(term20163, term20163.getClass(), "pos", 6);
        setIntField(term20163, term20163.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term20043, args);
        assertTrue(recursiveEquals(term20043, term20163));
        assertTrue(recursiveEquals(retValue, false));
    }

};


