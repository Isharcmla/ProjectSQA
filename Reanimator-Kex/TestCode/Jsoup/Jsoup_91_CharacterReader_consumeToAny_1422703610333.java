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

public class CharacterReader_consumeToAny_1422703610333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73656;
     Object term73522;
     Object term73977;
     Object term73982;

    public CharacterReader_consumeToAny_1422703610333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73656 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term73526 = (char[]) newCharArray(9);
        Object[] term73545 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term73656, term73656.getClass(), "bufPos", 0);
        setIntField(term73656, term73656.getClass(), "bufSplitPoint", 1);
        setIntField(term73656, term73656.getClass(), "bufLength", 1);
        setField(term73656, term73656.getClass(), "charBuf", term73526);
        setField(term73656, term73656.getClass(), "stringCache", term73545);
        term73522 = (char[]) newCharArray(0);
        term73977 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term73978 = (char[]) newCharArray(9);
        Object[] term73979 = (Object[]) newArray("java.lang.String", 17);
        setField(term73977, term73977.getClass(), "charBuf", term73978);
        setField(term73977, term73977.getClass(), "reader", null);
        setIntField(term73977, term73977.getClass(), "bufLength", 1);
        setIntField(term73977, term73977.getClass(), "bufSplitPoint", 1);
        setIntField(term73977, term73977.getClass(), "bufPos", 1);
        setIntField(term73977, term73977.getClass(), "readerPos", 0);
        setIntField(term73977, term73977.getClass(), "bufMark", 0);
        setElement(term73979, 0, " ");
        setField(term73977, term73977.getClass(), "stringCache", term73979);
        term73982 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term73522;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term73656, args);
        assertTrue(recursiveEquals(term73656, term73977));
        assertTrue(recursiveEquals(term73522, term73982));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


