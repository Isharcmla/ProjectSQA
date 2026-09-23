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

public class CharacterReader_pos_150665043031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term633;

    public CharacterReader_pos_150665043031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term24 = (char[]) newCharArray(5);
        setCharElement(term24, 0, 'P');
        setCharElement(term24, 1, 'A');
        setCharElement(term24, 2, 'E');
        setCharElement(term24, 3, 'B');
        setCharElement(term24, 4, 't');
        setField(term23, term23.getClass(), "input", term24);
        setIntField(term23, term23.getClass(), "length", 568599855);
        setIntField(term23, term23.getClass(), "pos", 1162663216);
        setIntField(term23, term23.getClass(), "mark", 1484323161);
        term633 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term634 = (char[]) newCharArray(5);
        setCharElement(term634, 0, 'P');
        setCharElement(term634, 1, 'A');
        setCharElement(term634, 2, 'E');
        setCharElement(term634, 3, 'B');
        setCharElement(term634, 4, 't');
        setField(term633, term633.getClass(), "input", term634);
        setIntField(term633, term633.getClass(), "length", 568599855);
        setIntField(term633, term633.getClass(), "pos", 1162663216);
        setIntField(term633, term633.getClass(), "mark", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "pos", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term633));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


