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

public class CharacterReader_matchesAny_42275714747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term614;
     Object term4316;
     Object term4319;

    public CharacterReader_matchesAny_42275714747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term598, term598.getClass(), "input", "eZFUvlxvGV");
        setIntField(term598, term598.getClass(), "length", -184153539);
        setIntField(term598, term598.getClass(), "pos", 493620644);
        setIntField(term598, term598.getClass(), "mark", 1328271830);
        term614 = (char[]) newCharArray(4);
        setCharElement(term614, 0, 't');
        setCharElement(term614, 1, 'T');
        setCharElement(term614, 2, 'D');
        setCharElement(term614, 3, 's');
        term4316 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4316, term4316.getClass(), "input", "eZFUvlxvGV");
        setIntField(term4316, term4316.getClass(), "length", -184153539);
        setIntField(term4316, term4316.getClass(), "pos", 493620644);
        setIntField(term4316, term4316.getClass(), "mark", 1328271830);
        term4319 = (char[]) newCharArray(4);
        setCharElement(term4319, 0, 't');
        setCharElement(term4319, 1, 'T');
        setCharElement(term4319, 2, 'D');
        setCharElement(term4319, 3, 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term614;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term598, args);
        assertTrue(recursiveEquals(term598, term4316));
        assertTrue(recursiveEquals(term614, term4319));
        assertTrue(recursiveEquals(retValue, false));
    }

};


