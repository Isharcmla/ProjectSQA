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

public class CharacterReader_consumeToAny_1422703610383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119205;
     Object term117560;
     Object term121523;
     Object term121528;

    public CharacterReader_consumeToAny_1422703610383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119205 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term117564 = (char[]) newCharArray(761);
        Object[] term119087 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term119205, term119205.getClass(), "bufPos", 721);
        setIntField(term119205, term119205.getClass(), "bufSplitPoint", 722);
        setIntField(term119205, term119205.getClass(), "bufLength", 722);
        setField(term119205, term119205.getClass(), "charBuf", term117564);
        setField(term119205, term119205.getClass(), "stringCache", term119087);
        term117560 = (char[]) newCharArray(0);
        term121523 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term121524 = (char[]) newCharArray(761);
        Object[] term121525 = (Object[]) newArray("java.lang.String", 489);
        setField(term121523, term121523.getClass(), "charBuf", term121524);
        setField(term121523, term121523.getClass(), "reader", null);
        setIntField(term121523, term121523.getClass(), "bufLength", 722);
        setIntField(term121523, term121523.getClass(), "bufSplitPoint", 722);
        setIntField(term121523, term121523.getClass(), "bufPos", 722);
        setIntField(term121523, term121523.getClass(), "readerPos", 0);
        setIntField(term121523, term121523.getClass(), "bufMark", 0);
        setElement(term121525, 0, " ");
        setField(term121523, term121523.getClass(), "stringCache", term121525);
        term121528 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term117560;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term119205, args);
        assertTrue(recursiveEquals(term119205, term121523));
        assertTrue(recursiveEquals(term117560, term121528));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


