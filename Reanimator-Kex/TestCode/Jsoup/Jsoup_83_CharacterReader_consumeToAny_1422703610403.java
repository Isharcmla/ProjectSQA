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

public class CharacterReader_consumeToAny_1422703610403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98784;
     Object term97138;
     Object term101410;
     Object term101415;

    public CharacterReader_consumeToAny_1422703610403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98784 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term97142 = (char[]) newCharArray(761);
        Object[] term98665 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term98784, term98784.getClass(), "bufPos", 721);
        setIntField(term98784, term98784.getClass(), "bufSplitPoint", 722);
        setIntField(term98784, term98784.getClass(), "bufLength", 722);
        setField(term98784, term98784.getClass(), "charBuf", term97142);
        setField(term98784, term98784.getClass(), "stringCache", term98665);
        term97138 = (char[]) newCharArray(0);
        term101410 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term101411 = (char[]) newCharArray(761);
        Object[] term101412 = (Object[]) newArray("java.lang.String", 489);
        setField(term101410, term101410.getClass(), "charBuf", term101411);
        setField(term101410, term101410.getClass(), "reader", null);
        setIntField(term101410, term101410.getClass(), "bufLength", 722);
        setIntField(term101410, term101410.getClass(), "bufSplitPoint", 722);
        setIntField(term101410, term101410.getClass(), "bufPos", 722);
        setIntField(term101410, term101410.getClass(), "readerPos", 0);
        setIntField(term101410, term101410.getClass(), "bufMark", 0);
        setElement(term101412, 0, " ");
        setField(term101410, term101410.getClass(), "stringCache", term101412);
        term101415 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term97138;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term98784, args);
        assertTrue(recursiveEquals(term98784, term101410));
        assertTrue(recursiveEquals(term97138, term101415));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


