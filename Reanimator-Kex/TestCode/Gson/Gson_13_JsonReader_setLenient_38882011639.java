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
import java.lang.Boolean;

public class JsonReader_setLenient_38882011639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term76;
     Object term6126;

    public JsonReader_setLenient_38882011639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3 = (char[]) newCharArray(5);
        int[] term28 = (int[]) newIntArray(4);
        Object[] term34 = (Object[]) newArray("java.lang.String", 3);
        int[] term71 = (int[]) newIntArray(4);
        setField(term1, term1.getClass(), "in", null);
        setBooleanField(term1, term1.getClass(), "lenient", false);
        setCharElement(term3, 0, 'P');
        setCharElement(term3, 1, 'A');
        setCharElement(term3, 2, 'E');
        setCharElement(term3, 3, 'B');
        setCharElement(term3, 4, 't');
        setField(term1, term1.getClass(), "buffer", term3);
        setIntField(term1, term1.getClass(), "pos", 1484323161);
        setIntField(term1, term1.getClass(), "limit", 391863371);
        setIntField(term1, term1.getClass(), "lineNumber", -1922583790);
        setIntField(term1, term1.getClass(), "lineStart", -616727354);
        setIntField(term1, term1.getClass(), "peeked", -1955890973);
        setLongField(term1, term1.getClass(), "peekedLong", 2442117782898005296L);
        setIntField(term1, term1.getClass(), "peekedNumberLength", -2038273078);
        setField(term1, term1.getClass(), "peekedString", "PAEBtnZtTD");
        setIntElement(term28, 0, 1227103734);
        setIntElement(term28, 1, -1339778481);
        setIntElement(term28, 2, 1725571209);
        setIntElement(term28, 3, -522618178);
        setField(term1, term1.getClass(), "stack", term28);
        setIntField(term1, term1.getClass(), "stackSize", 1134449235);
        setElement(term34, 0, "sjlJAEtRrb");
        setElement(term34, 1, "MuLcgQHgqz");
        setElement(term34, 2, "xxtlPwDYFs");
        setField(term1, term1.getClass(), "pathNames", term34);
        setIntElement(term71, 0, -883034806);
        setIntElement(term71, 1, 1585847225);
        setIntElement(term71, 2, 597278769);
        setIntElement(term71, 3, -1685132342);
        setField(term1, term1.getClass(), "pathIndices", term71);
        term76 = new Boolean(false);
        term6126 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term6127 = (char[]) newCharArray(5);
        int[] term6130 = (int[]) newIntArray(4);
        Object[] term6131 = (Object[]) newArray("java.lang.String", 3);
        int[] term6138 = (int[]) newIntArray(4);
        setField(term6126, term6126.getClass(), "in", null);
        setBooleanField(term6126, term6126.getClass(), "lenient", false);
        setCharElement(term6127, 0, 'P');
        setCharElement(term6127, 1, 'A');
        setCharElement(term6127, 2, 'E');
        setCharElement(term6127, 3, 'B');
        setCharElement(term6127, 4, 't');
        setField(term6126, term6126.getClass(), "buffer", term6127);
        setIntField(term6126, term6126.getClass(), "pos", 1484323161);
        setIntField(term6126, term6126.getClass(), "limit", 391863371);
        setIntField(term6126, term6126.getClass(), "lineNumber", -1922583790);
        setIntField(term6126, term6126.getClass(), "lineStart", -616727354);
        setIntField(term6126, term6126.getClass(), "peeked", -1955890973);
        setLongField(term6126, term6126.getClass(), "peekedLong", 2442117782898005296L);
        setIntField(term6126, term6126.getClass(), "peekedNumberLength", -2038273078);
        setField(term6126, term6126.getClass(), "peekedString", "PAEBtnZtTD");
        setIntElement(term6130, 0, 1227103734);
        setIntElement(term6130, 1, -1339778481);
        setIntElement(term6130, 2, 1725571209);
        setIntElement(term6130, 3, -522618178);
        setField(term6126, term6126.getClass(), "stack", term6130);
        setIntField(term6126, term6126.getClass(), "stackSize", 1134449235);
        setElement(term6131, 0, "sjlJAEtRrb");
        setElement(term6131, 1, "MuLcgQHgqz");
        setElement(term6131, 2, "xxtlPwDYFs");
        setField(term6126, term6126.getClass(), "pathNames", term6131);
        setIntElement(term6138, 0, -883034806);
        setIntElement(term6138, 1, 1585847225);
        setIntElement(term6138, 2, 597278769);
        setIntElement(term6138, 3, -1685132342);
        setField(term6126, term6126.getClass(), "pathIndices", term6138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "setLenient", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term6126));
        assertTrue(recursiveEquals(term76, false));
    }

};


