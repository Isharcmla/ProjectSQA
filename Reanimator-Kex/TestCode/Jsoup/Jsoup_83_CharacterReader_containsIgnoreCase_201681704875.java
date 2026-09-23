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

public class CharacterReader_containsIgnoreCase_201681704875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3883;
     Object term14226;

    public CharacterReader_containsIgnoreCase_201681704875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3883 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3884 = (char[]) newCharArray(5);
        Object[] term3895 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term3884, 0, 'b');
        setCharElement(term3884, 1, 'c');
        setCharElement(term3884, 2, 'd');
        setCharElement(term3884, 3, 'z');
        setCharElement(term3884, 4, 'j');
        setField(term3883, term3883.getClass(), "charBuf", term3884);
        setField(term3883, term3883.getClass(), "reader", null);
        setIntField(term3883, term3883.getClass(), "bufLength", -523949691);
        setIntField(term3883, term3883.getClass(), "bufSplitPoint", 1398204340);
        setIntField(term3883, term3883.getClass(), "bufPos", 229204365);
        setIntField(term3883, term3883.getClass(), "readerPos", -461771056);
        setIntField(term3883, term3883.getClass(), "bufMark", -243422082);
        setElement(term3895, 0, "HzqpegHiRq");
        setField(term3883, term3883.getClass(), "stringCache", term3895);
        term14226 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term14227 = (char[]) newCharArray(5);
        Object[] term14228 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term14227, 0, 'b');
        setCharElement(term14227, 1, 'c');
        setCharElement(term14227, 2, 'd');
        setCharElement(term14227, 3, 'z');
        setCharElement(term14227, 4, 'j');
        setField(term14226, term14226.getClass(), "charBuf", term14227);
        setField(term14226, term14226.getClass(), "reader", null);
        setIntField(term14226, term14226.getClass(), "bufLength", -523949691);
        setIntField(term14226, term14226.getClass(), "bufSplitPoint", 1398204340);
        setIntField(term14226, term14226.getClass(), "bufPos", 229204365);
        setIntField(term14226, term14226.getClass(), "readerPos", -461771056);
        setIntField(term14226, term14226.getClass(), "bufMark", -243422082);
        setElement(term14228, 0, "HzqpegHiRq");
        setField(term14226, term14226.getClass(), "stringCache", term14228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwsfVjMoJT";
        Object retValue = callMethod(klass, "containsIgnoreCase", argTypes, term3883, args);
        assertTrue(recursiveEquals(term3883, term14226));
        assertTrue(recursiveEquals(retValue, false));
    }

};


