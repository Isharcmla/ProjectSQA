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

public class CharacterReader_matches_2014332895653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2372549;
     Object term2768503;

    public CharacterReader_matches_2014332895653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2372549 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2372448 = (char[]) newCharArray(8);
        setIntField(term2372549, term2372549.getClass(), "bufPos", 6);
        setIntField(term2372549, term2372549.getClass(), "bufLength", 7);
        setCharElement(term2372448, 0, (char) 65535);
        setCharElement(term2372448, 1, (char) 65535);
        setCharElement(term2372448, 2, (char) 65535);
        setCharElement(term2372448, 3, (char) 65535);
        setCharElement(term2372448, 4, (char) 65535);
        setCharElement(term2372448, 5, (char) 65535);
        setCharElement(term2372448, 6, (char) 65535);
        setCharElement(term2372448, 7, (char) 65535);
        setField(term2372549, term2372549.getClass(), "charBuf", term2372448);
        term2768503 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2768535 = (char[]) newCharArray(8);
        setCharElement(term2768535, 0, (char) 65535);
        setCharElement(term2768535, 1, (char) 65535);
        setCharElement(term2768535, 2, (char) 65535);
        setCharElement(term2768535, 3, (char) 65535);
        setCharElement(term2768535, 4, (char) 65535);
        setCharElement(term2768535, 5, (char) 65535);
        setCharElement(term2768535, 6, (char) 65535);
        setCharElement(term2768535, 7, (char) 65535);
        setField(term2768503, term2768503.getClass(), "charBuf", term2768535);
        setField(term2768503, term2768503.getClass(), "reader", null);
        setIntField(term2768503, term2768503.getClass(), "bufLength", 7);
        setIntField(term2768503, term2768503.getClass(), "bufSplitPoint", 0);
        setIntField(term2768503, term2768503.getClass(), "bufPos", 6);
        setIntField(term2768503, term2768503.getClass(), "readerPos", 0);
        setIntField(term2768503, term2768503.getClass(), "bufMark", 0);
        setField(term2768503, term2768503.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "matches", argTypes, term2372549, args);
        assertTrue(recursiveEquals(term2372549, term2768503));
        assertTrue(recursiveEquals(retValue, false));
    }

};


