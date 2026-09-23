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

public class CharacterReader_init_39390631742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5050;

    public CharacterReader_init_39390631742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5050 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5051 = (char[]) newCharArray(10);
        Object term5052 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term5055 = (Object[]) newArray("java.lang.String", 512);
        setCharElement(term5051, 0, 'P');
        setCharElement(term5051, 1, 'A');
        setCharElement(term5051, 2, 'E');
        setCharElement(term5051, 3, 'B');
        setCharElement(term5051, 4, 't');
        setCharElement(term5051, 5, 'n');
        setCharElement(term5051, 6, 'Z');
        setCharElement(term5051, 7, 't');
        setCharElement(term5051, 8, 'T');
        setCharElement(term5051, 9, 'D');
        setField(term5050, term5050.getClass(), "charBuf", term5051);
        setField(term5052, term5052.getClass(), "str", "PAEBtnZtTD");
        setIntField(term5052, term5052.getClass(), "length", 10);
        setIntField(term5052, term5052.getClass(), "next", 0);
        setIntField(term5052, term5052.getClass(), "mark", 0);
        setField(term5052, term5052.getClass(), "lock", term5052);
        setField(term5052, term5052.getClass(), "skipBuffer", null);
        setField(term5050, term5050.getClass(), "reader", term5052);
        setIntField(term5050, term5050.getClass(), "bufLength", 10);
        setIntField(term5050, term5050.getClass(), "bufSplitPoint", 10);
        setIntField(term5050, term5050.getClass(), "bufPos", 0);
        setIntField(term5050, term5050.getClass(), "readerPos", 0);
        setIntField(term5050, term5050.getClass(), "bufMark", 0);
        setField(term5050, term5050.getClass(), "stringCache", term5055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5050));
    }

};


