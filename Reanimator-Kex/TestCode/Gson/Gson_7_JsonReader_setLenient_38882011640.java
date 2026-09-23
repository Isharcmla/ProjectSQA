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

public class JsonReader_setLenient_38882011640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term76;
     Object term6242;

    public JsonReader_setLenient_38882011640() {
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
        term6242 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term6243 = (char[]) newCharArray(5);
        int[] term6246 = (int[]) newIntArray(4);
        Object[] term6247 = (Object[]) newArray("java.lang.String", 3);
        int[] term6254 = (int[]) newIntArray(4);
        setField(term6242, term6242.getClass(), "in", null);
        setBooleanField(term6242, term6242.getClass(), "lenient", false);
        setCharElement(term6243, 0, 'P');
        setCharElement(term6243, 1, 'A');
        setCharElement(term6243, 2, 'E');
        setCharElement(term6243, 3, 'B');
        setCharElement(term6243, 4, 't');
        setField(term6242, term6242.getClass(), "buffer", term6243);
        setIntField(term6242, term6242.getClass(), "pos", 1484323161);
        setIntField(term6242, term6242.getClass(), "limit", 391863371);
        setIntField(term6242, term6242.getClass(), "lineNumber", -1922583790);
        setIntField(term6242, term6242.getClass(), "lineStart", -616727354);
        setIntField(term6242, term6242.getClass(), "peeked", -1955890973);
        setLongField(term6242, term6242.getClass(), "peekedLong", 2442117782898005296L);
        setIntField(term6242, term6242.getClass(), "peekedNumberLength", -2038273078);
        setField(term6242, term6242.getClass(), "peekedString", "PAEBtnZtTD");
        setIntElement(term6246, 0, 1227103734);
        setIntElement(term6246, 1, -1339778481);
        setIntElement(term6246, 2, 1725571209);
        setIntElement(term6246, 3, -522618178);
        setField(term6242, term6242.getClass(), "stack", term6246);
        setIntField(term6242, term6242.getClass(), "stackSize", 1134449235);
        setElement(term6247, 0, "sjlJAEtRrb");
        setElement(term6247, 1, "MuLcgQHgqz");
        setElement(term6247, 2, "xxtlPwDYFs");
        setField(term6242, term6242.getClass(), "pathNames", term6247);
        setIntElement(term6254, 0, -883034806);
        setIntElement(term6254, 1, 1585847225);
        setIntElement(term6254, 2, 597278769);
        setIntElement(term6254, 3, -1685132342);
        setField(term6242, term6242.getClass(), "pathIndices", term6254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "setLenient", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term6242));
        assertTrue(recursiveEquals(term76, false));
    }

};


