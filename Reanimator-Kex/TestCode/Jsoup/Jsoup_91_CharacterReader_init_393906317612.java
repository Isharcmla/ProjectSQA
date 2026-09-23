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

public class CharacterReader_init_393906317612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157752;

    public CharacterReader_init_393906317612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term157364 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term157244 = (Object[]) newArray("java.lang.String", 0);
        Object term157408 = newInstance(Class.forName("java.io.PipedReader"));
        char[] term157247 = (char[]) newCharArray(0);
        setIntField(term157364, term157364.getClass(), "bufMark", 0);
        setField(term157364, term157364.getClass(), "stringCache", term157244);
        setField(term157364, term157364.getClass(), "reader", term157408);
        setField(term157364, term157364.getClass(), "charBuf", term157247);
        setIntField(term157364, term157364.getClass(), "bufPos", -2147483648);
        setIntField(term157364, term157364.getClass(), "bufSplitPoint", -2147483648);
        term157752 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term157753 = (char[]) newCharArray(0);
        Object term157754 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term157757 = (Object[]) newArray("java.lang.String", 512);
        setField(term157752, term157752.getClass(), "charBuf", term157753);
        setField(term157754, term157754.getClass(), "str", "");
        setIntField(term157754, term157754.getClass(), "length", 0);
        setIntField(term157754, term157754.getClass(), "next", 0);
        setIntField(term157754, term157754.getClass(), "mark", 0);
        setField(term157754, term157754.getClass(), "lock", term157754);
        setField(term157754, term157754.getClass(), "skipBuffer", null);
        setField(term157752, term157752.getClass(), "reader", term157754);
        setIntField(term157752, term157752.getClass(), "bufLength", 0);
        setIntField(term157752, term157752.getClass(), "bufSplitPoint", 0);
        setIntField(term157752, term157752.getClass(), "bufPos", 0);
        setIntField(term157752, term157752.getClass(), "readerPos", 0);
        setIntField(term157752, term157752.getClass(), "bufMark", -1);
        setField(term157752, term157752.getClass(), "stringCache", term157757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term157752));
    }

};


