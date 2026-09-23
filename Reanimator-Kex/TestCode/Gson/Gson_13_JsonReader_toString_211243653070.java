package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonReader_toString_211243653070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4557;
     Object term16031;

    public JsonReader_toString_211243653070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4557 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4559 = (char[]) newCharArray(8);
        int[] term4587 = (int[]) newIntArray(5);
        Object[] term4594 = (Object[]) newArray("java.lang.String", 6);
        int[] term4667 = (int[]) newIntArray(3);
        setField(term4557, term4557.getClass(), "in", null);
        setBooleanField(term4557, term4557.getClass(), "lenient", true);
        setCharElement(term4559, 0, 'V');
        setCharElement(term4559, 1, 'c');
        setCharElement(term4559, 2, 'I');
        setCharElement(term4559, 3, 'n');
        setCharElement(term4559, 4, 'Y');
        setCharElement(term4559, 5, 'n');
        setCharElement(term4559, 6, 'L');
        setCharElement(term4559, 7, 'W');
        setField(term4557, term4557.getClass(), "buffer", term4559);
        setIntField(term4557, term4557.getClass(), "pos", -138239905);
        setIntField(term4557, term4557.getClass(), "limit", 1709474063);
        setIntField(term4557, term4557.getClass(), "lineNumber", 1406617209);
        setIntField(term4557, term4557.getClass(), "lineStart", 1706047059);
        setIntField(term4557, term4557.getClass(), "peeked", 590451710);
        setLongField(term4557, term4557.getClass(), "peekedLong", -5892135042702373494L);
        setIntField(term4557, term4557.getClass(), "peekedNumberLength", -1999787419);
        setField(term4557, term4557.getClass(), "peekedString", "HzqpegHiRq");
        setIntElement(term4587, 0, -1224443634);
        setIntElement(term4587, 1, 1048451946);
        setIntElement(term4587, 2, 5603560);
        setIntElement(term4587, 3, -1079020032);
        setIntElement(term4587, 4, -1973791064);
        setField(term4557, term4557.getClass(), "stack", term4587);
        setIntField(term4557, term4557.getClass(), "stackSize", -2072158633);
        setElement(term4594, 0, "jwsfVjMoJT");
        setElement(term4594, 1, "ZfdXfCCFDf");
        setElement(term4594, 2, "MwwjNtdOFT");
        setElement(term4594, 3, "VYkqXKVlAJ");
        setElement(term4594, 4, "XkIoWJRNwN");
        setElement(term4594, 5, "aNWLJdrZMq");
        setField(term4557, term4557.getClass(), "pathNames", term4594);
        setIntElement(term4667, 0, -355469363);
        setIntElement(term4667, 1, 1465188553);
        setIntElement(term4667, 2, 1633913667);
        setField(term4557, term4557.getClass(), "pathIndices", term4667);
        term16031 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term16032 = (char[]) newCharArray(8);
        int[] term16035 = (int[]) newIntArray(5);
        Object[] term16036 = (Object[]) newArray("java.lang.String", 6);
        int[] term16049 = (int[]) newIntArray(3);
        setField(term16031, term16031.getClass(), "in", null);
        setBooleanField(term16031, term16031.getClass(), "lenient", true);
        setCharElement(term16032, 0, 'V');
        setCharElement(term16032, 1, 'c');
        setCharElement(term16032, 2, 'I');
        setCharElement(term16032, 3, 'n');
        setCharElement(term16032, 4, 'Y');
        setCharElement(term16032, 5, 'n');
        setCharElement(term16032, 6, 'L');
        setCharElement(term16032, 7, 'W');
        setField(term16031, term16031.getClass(), "buffer", term16032);
        setIntField(term16031, term16031.getClass(), "pos", -138239905);
        setIntField(term16031, term16031.getClass(), "limit", 1709474063);
        setIntField(term16031, term16031.getClass(), "lineNumber", 1406617209);
        setIntField(term16031, term16031.getClass(), "lineStart", 1706047059);
        setIntField(term16031, term16031.getClass(), "peeked", 590451710);
        setLongField(term16031, term16031.getClass(), "peekedLong", -5892135042702373494L);
        setIntField(term16031, term16031.getClass(), "peekedNumberLength", -1999787419);
        setField(term16031, term16031.getClass(), "peekedString", "HzqpegHiRq");
        setIntElement(term16035, 0, -1224443634);
        setIntElement(term16035, 1, 1048451946);
        setIntElement(term16035, 2, 5603560);
        setIntElement(term16035, 3, -1079020032);
        setIntElement(term16035, 4, -1973791064);
        setField(term16031, term16031.getClass(), "stack", term16035);
        setIntField(term16031, term16031.getClass(), "stackSize", -2072158633);
        setElement(term16036, 0, "jwsfVjMoJT");
        setElement(term16036, 1, "ZfdXfCCFDf");
        setElement(term16036, 2, "MwwjNtdOFT");
        setElement(term16036, 3, "VYkqXKVlAJ");
        setElement(term16036, 4, "XkIoWJRNwN");
        setElement(term16036, 5, "aNWLJdrZMq");
        setField(term16031, term16031.getClass(), "pathNames", term16036);
        setIntElement(term16049, 0, -355469363);
        setIntElement(term16049, 1, 1465188553);
        setIntElement(term16049, 2, 1633913667);
        setField(term16031, term16031.getClass(), "pathIndices", term16049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term4557, args);
        assertTrue(recursiveEquals(term4557, term16031));
        assertTrue(recursiveEquals(retValue, "JsonReader at line 1406617210 column -1844286963 path $"));
    }

};


