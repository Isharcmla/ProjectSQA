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

public class CharacterReader_isEmpty_80380485132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term656;

    public CharacterReader_isEmpty_80380485132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term39 = (char[]) newCharArray(4);
        setCharElement(term39, 0, 'n');
        setCharElement(term39, 1, 'Z');
        setCharElement(term39, 2, 't');
        setCharElement(term39, 3, 'T');
        setField(term38, term38.getClass(), "input", term39);
        setIntField(term38, term38.getClass(), "length", 391863371);
        setIntField(term38, term38.getClass(), "pos", -1922583790);
        setIntField(term38, term38.getClass(), "mark", -616727354);
        term656 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term657 = (char[]) newCharArray(4);
        setCharElement(term657, 0, 'n');
        setCharElement(term657, 1, 'Z');
        setCharElement(term657, 2, 't');
        setCharElement(term657, 3, 'T');
        setField(term656, term656.getClass(), "input", term657);
        setIntField(term656, term656.getClass(), "length", 391863371);
        setIntField(term656, term656.getClass(), "pos", -1922583790);
        setIntField(term656, term656.getClass(), "mark", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term38, args);
        assertTrue(recursiveEquals(term38, term656));
        assertTrue(recursiveEquals(retValue, false));
    }

};


