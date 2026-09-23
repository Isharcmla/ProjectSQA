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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_skipToEndOfLine_12813446571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4535;

    public JsonReader_skipToEndOfLine_12813446571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4535 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4537 = (char[]) newCharArray(8);
        int[] term4565 = (int[]) newIntArray(5);
        Object[] term4572 = (Object[]) newArray("java.lang.String", 6);
        int[] term4645 = (int[]) newIntArray(3);
        setField(term4535, term4535.getClass(), "in", null);
        setBooleanField(term4535, term4535.getClass(), "lenient", true);
        setCharElement(term4537, 0, 'V');
        setCharElement(term4537, 1, 'c');
        setCharElement(term4537, 2, 'I');
        setCharElement(term4537, 3, 'n');
        setCharElement(term4537, 4, 'Y');
        setCharElement(term4537, 5, 'n');
        setCharElement(term4537, 6, 'L');
        setCharElement(term4537, 7, 'W');
        setField(term4535, term4535.getClass(), "buffer", term4537);
        setIntField(term4535, term4535.getClass(), "pos", -138239905);
        setIntField(term4535, term4535.getClass(), "limit", 1709474063);
        setIntField(term4535, term4535.getClass(), "lineNumber", 1406617209);
        setIntField(term4535, term4535.getClass(), "lineStart", 1706047059);
        setIntField(term4535, term4535.getClass(), "peeked", 590451710);
        setLongField(term4535, term4535.getClass(), "peekedLong", -5892135042702373494L);
        setIntField(term4535, term4535.getClass(), "peekedNumberLength", -1999787419);
        setField(term4535, term4535.getClass(), "peekedString", "WHcwFgsGFC");
        setIntElement(term4565, 0, -1224443634);
        setIntElement(term4565, 1, 1048451946);
        setIntElement(term4565, 2, 5603560);
        setIntElement(term4565, 3, -1079020032);
        setIntElement(term4565, 4, -1973791064);
        setField(term4535, term4535.getClass(), "stack", term4565);
        setIntField(term4535, term4535.getClass(), "stackSize", -2072158633);
        setElement(term4572, 0, "HzqpegHiRq");
        setElement(term4572, 1, "jwsfVjMoJT");
        setElement(term4572, 2, "ZfdXfCCFDf");
        setElement(term4572, 3, "MwwjNtdOFT");
        setElement(term4572, 4, "VYkqXKVlAJ");
        setElement(term4572, 5, "XkIoWJRNwN");
        setField(term4535, term4535.getClass(), "pathNames", term4572);
        setIntElement(term4645, 0, -355469363);
        setIntElement(term4645, 1, 1465188553);
        setIntElement(term4645, 2, 1633913667);
        setField(term4535, term4535.getClass(), "pathIndices", term4645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipToEndOfLine", argTypes, term4535, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


