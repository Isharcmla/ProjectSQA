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
import java.lang.Object;

public class CharacterReader_consumeHexSequence_393737519370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108648;
     Object term2108944;

    public CharacterReader_consumeHexSequence_393737519370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2108648 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2108512 = (char[]) newCharArray(9);
        Object[] term2108532 = (Object[]) newArray("java.lang.String", 9);
        setIntField(term2108648, term2108648.getClass(), "pos", 0);
        setIntField(term2108648, term2108648.getClass(), "length", 1);
        setCharElement(term2108512, 0, 'D');
        setCharElement(term2108512, 1, 'D');
        setCharElement(term2108512, 2, 'D');
        setCharElement(term2108512, 3, 'D');
        setCharElement(term2108512, 4, 'D');
        setCharElement(term2108512, 5, 'D');
        setCharElement(term2108512, 6, 'D');
        setCharElement(term2108512, 7, 'D');
        setCharElement(term2108512, 8, 'D');
        setField(term2108648, term2108648.getClass(), "input", term2108512);
        setField(term2108648, term2108648.getClass(), "stringCache", term2108532);
        term2108944 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2108945 = (char[]) newCharArray(9);
        Object[] term2108946 = (Object[]) newArray("java.lang.String", 9);
        setCharElement(term2108945, 0, 'D');
        setCharElement(term2108945, 1, 'D');
        setCharElement(term2108945, 2, 'D');
        setCharElement(term2108945, 3, 'D');
        setCharElement(term2108945, 4, 'D');
        setCharElement(term2108945, 5, 'D');
        setCharElement(term2108945, 6, 'D');
        setCharElement(term2108945, 7, 'D');
        setCharElement(term2108945, 8, 'D');
        setField(term2108944, term2108944.getClass(), "input", term2108945);
        setIntField(term2108944, term2108944.getClass(), "length", 1);
        setIntField(term2108944, term2108944.getClass(), "pos", 1);
        setIntField(term2108944, term2108944.getClass(), "mark", 0);
        setElement(term2108946, 0, "D");
        setField(term2108944, term2108944.getClass(), "stringCache", term2108946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term2108648, args);
        assertTrue(recursiveEquals(term2108648, term2108944));
        assertTrue(recursiveEquals(retValue, "D"));
    }

};


