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

public class CharacterReader_consumeToAny_142270361039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;
     Object term349;
     Object term2473;
     Object term2476;

    public CharacterReader_consumeToAny_142270361039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term333, term333.getClass(), "input", "LQFpaHEwXR");
        setIntField(term333, term333.getClass(), "length", -226514366);
        setIntField(term333, term333.getClass(), "pos", 1193880199);
        setIntField(term333, term333.getClass(), "mark", -1087774327);
        term349 = (char[]) newCharArray(5);
        setCharElement(term349, 0, 'A');
        setCharElement(term349, 1, 'E');
        setCharElement(term349, 2, 'B');
        setCharElement(term349, 3, 't');
        setCharElement(term349, 4, 'n');
        term2473 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term2473, term2473.getClass(), "input", "LQFpaHEwXR");
        setIntField(term2473, term2473.getClass(), "length", -226514366);
        setIntField(term2473, term2473.getClass(), "pos", 1193880199);
        setIntField(term2473, term2473.getClass(), "mark", -1087774327);
        term2476 = (char[]) newCharArray(5);
        setCharElement(term2476, 0, 'A');
        setCharElement(term2476, 1, 'E');
        setCharElement(term2476, 2, 'B');
        setCharElement(term2476, 3, 't');
        setCharElement(term2476, 4, 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term349;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term333, args);
        assertTrue(recursiveEquals(term333, term2473));
        assertTrue(recursiveEquals(term349, term2476));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


