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

public class CharacterReader_init_39390631741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5277;

    public CharacterReader_init_39390631741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5277 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5278 = (char[]) newCharArray(10);
        Object term5279 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term5282 = (Object[]) newArray("java.lang.String", 512);
        setCharElement(term5278, 0, 'P');
        setCharElement(term5278, 1, 'A');
        setCharElement(term5278, 2, 'E');
        setCharElement(term5278, 3, 'B');
        setCharElement(term5278, 4, 't');
        setCharElement(term5278, 5, 'n');
        setCharElement(term5278, 6, 'Z');
        setCharElement(term5278, 7, 't');
        setCharElement(term5278, 8, 'T');
        setCharElement(term5278, 9, 'D');
        setField(term5277, term5277.getClass(), "charBuf", term5278);
        setField(term5279, term5279.getClass(), "str", "PAEBtnZtTD");
        setIntField(term5279, term5279.getClass(), "length", 10);
        setIntField(term5279, term5279.getClass(), "next", 0);
        setIntField(term5279, term5279.getClass(), "mark", 0);
        setField(term5279, term5279.getClass(), "lock", term5279);
        setField(term5279, term5279.getClass(), "skipBuffer", null);
        setField(term5277, term5277.getClass(), "reader", term5279);
        setIntField(term5277, term5277.getClass(), "bufLength", 10);
        setIntField(term5277, term5277.getClass(), "bufSplitPoint", 10);
        setIntField(term5277, term5277.getClass(), "bufPos", 0);
        setIntField(term5277, term5277.getClass(), "readerPos", 0);
        setIntField(term5277, term5277.getClass(), "bufMark", 0);
        setField(term5277, term5277.getClass(), "stringCache", term5282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5277));
    }

};


