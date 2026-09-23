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

public class CharacterReader_init_393906317344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74779;

    public CharacterReader_init_393906317344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74233 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term74112 = (Object[]) newArray("java.lang.String", 0);
        Object term74283 = newInstance(Class.forName("java.io.PushbackReader"));
        char[] term74115 = (char[]) newCharArray(0);
        setField(term74233, term74233.getClass(), "stringCache", term74112);
        setField(term74233, term74233.getClass(), "reader", term74283);
        setField(term74233, term74233.getClass(), "charBuf", term74115);
        setIntField(term74233, term74233.getClass(), "bufPos", -2147483648);
        setIntField(term74233, term74233.getClass(), "bufSplitPoint", -2147483648);
        term74779 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term74780 = (char[]) newCharArray(0);
        Object term74781 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term74784 = (Object[]) newArray("java.lang.String", 512);
        setField(term74779, term74779.getClass(), "charBuf", term74780);
        setField(term74781, term74781.getClass(), "str", "");
        setIntField(term74781, term74781.getClass(), "length", 0);
        setIntField(term74781, term74781.getClass(), "next", 0);
        setIntField(term74781, term74781.getClass(), "mark", 0);
        setField(term74781, term74781.getClass(), "lock", term74781);
        setField(term74781, term74781.getClass(), "skipBuffer", null);
        setField(term74779, term74779.getClass(), "reader", term74781);
        setIntField(term74779, term74779.getClass(), "bufLength", 0);
        setIntField(term74779, term74779.getClass(), "bufSplitPoint", 0);
        setIntField(term74779, term74779.getClass(), "bufPos", 0);
        setIntField(term74779, term74779.getClass(), "readerPos", 0);
        setIntField(term74779, term74779.getClass(), "bufMark", 0);
        setField(term74779, term74779.getClass(), "stringCache", term74784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term74779));
    }

};


