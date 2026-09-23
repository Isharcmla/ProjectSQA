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

public class CharacterReader_consumeHexSequence_393737519433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2370786;
     Object term2624144;

    public CharacterReader_consumeHexSequence_393737519433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2370786 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2370633 = (char[]) newCharArray(17);
        Object[] term2370669 = (Object[]) newArray("java.lang.String", 16);
        setIntField(term2370786, term2370786.getClass(), "pos", 0);
        setIntField(term2370786, term2370786.getClass(), "length", 1);
        setCharElement(term2370633, 0, 'c');
        setCharElement(term2370633, 1, 'c');
        setCharElement(term2370633, 2, 'c');
        setCharElement(term2370633, 3, 'c');
        setCharElement(term2370633, 4, 'c');
        setCharElement(term2370633, 5, 'c');
        setCharElement(term2370633, 6, 'c');
        setCharElement(term2370633, 7, 'c');
        setCharElement(term2370633, 8, 'c');
        setCharElement(term2370633, 9, 'c');
        setCharElement(term2370633, 10, 'c');
        setCharElement(term2370633, 11, 'c');
        setCharElement(term2370633, 12, 'c');
        setCharElement(term2370633, 13, 'c');
        setCharElement(term2370633, 14, 'c');
        setCharElement(term2370633, 15, 'c');
        setCharElement(term2370633, 16, 'c');
        setField(term2370786, term2370786.getClass(), "input", term2370633);
        setField(term2370786, term2370786.getClass(), "stringCache", term2370669);
        term2624144 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2624145 = (char[]) newCharArray(17);
        Object[] term2624146 = (Object[]) newArray("java.lang.String", 16);
        setCharElement(term2624145, 0, 'c');
        setCharElement(term2624145, 1, 'c');
        setCharElement(term2624145, 2, 'c');
        setCharElement(term2624145, 3, 'c');
        setCharElement(term2624145, 4, 'c');
        setCharElement(term2624145, 5, 'c');
        setCharElement(term2624145, 6, 'c');
        setCharElement(term2624145, 7, 'c');
        setCharElement(term2624145, 8, 'c');
        setCharElement(term2624145, 9, 'c');
        setCharElement(term2624145, 10, 'c');
        setCharElement(term2624145, 11, 'c');
        setCharElement(term2624145, 12, 'c');
        setCharElement(term2624145, 13, 'c');
        setCharElement(term2624145, 14, 'c');
        setCharElement(term2624145, 15, 'c');
        setCharElement(term2624145, 16, 'c');
        setField(term2624144, term2624144.getClass(), "input", term2624145);
        setIntField(term2624144, term2624144.getClass(), "length", 1);
        setIntField(term2624144, term2624144.getClass(), "pos", 1);
        setIntField(term2624144, term2624144.getClass(), "mark", 0);
        setElement(term2624146, 3, "c");
        setField(term2624144, term2624144.getClass(), "stringCache", term2624146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term2370786, args);
        assertTrue(recursiveEquals(term2370786, term2624144));
        assertTrue(recursiveEquals(retValue, "c"));
    }

};


