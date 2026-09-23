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

public class CharacterReader_consumeToAny_142270361044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term231;
     Object term2617;
     Object term2619;

    public CharacterReader_consumeToAny_142270361044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term225 = (char[]) newCharArray(2);
        setCharElement(term225, 0, 'S');
        setCharElement(term225, 1, 'S');
        setField(term224, term224.getClass(), "input", term225);
        setIntField(term224, term224.getClass(), "length", 679763016);
        setIntField(term224, term224.getClass(), "pos", 1962444399);
        setIntField(term224, term224.getClass(), "mark", 767834723);
        term231 = (char[]) newCharArray(3);
        setCharElement(term231, 0, 'b');
        setCharElement(term231, 1, 'S');
        setCharElement(term231, 2, 'z');
        term2617 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2618 = (char[]) newCharArray(2);
        setCharElement(term2618, 0, 'S');
        setCharElement(term2618, 1, 'S');
        setField(term2617, term2617.getClass(), "input", term2618);
        setIntField(term2617, term2617.getClass(), "length", 679763016);
        setIntField(term2617, term2617.getClass(), "pos", 1962444399);
        setIntField(term2617, term2617.getClass(), "mark", 767834723);
        term2619 = (char[]) newCharArray(3);
        setCharElement(term2619, 0, 'b');
        setCharElement(term2619, 1, 'S');
        setCharElement(term2619, 2, 'z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term231;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term224, args);
        assertTrue(recursiveEquals(term224, term2617));
        assertTrue(recursiveEquals(term231, term2619));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


