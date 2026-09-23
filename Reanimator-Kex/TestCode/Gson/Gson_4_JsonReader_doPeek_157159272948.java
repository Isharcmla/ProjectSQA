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

public class JsonReader_doPeek_157159272948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395;

    public JsonReader_doPeek_157159272948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1395 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1397 = (char[]) newCharArray(2);
        int[] term1419 = (int[]) newIntArray(5);
        Object[] term1426 = (Object[]) newArray("java.lang.String", 3);
        int[] term1463 = (int[]) newIntArray(5);
        setField(term1395, term1395.getClass(), "in", null);
        setBooleanField(term1395, term1395.getClass(), "lenient", true);
        setCharElement(term1397, 0, 't');
        setCharElement(term1397, 1, 'l');
        setField(term1395, term1395.getClass(), "buffer", term1397);
        setIntField(term1395, term1395.getClass(), "pos", 96566506);
        setIntField(term1395, term1395.getClass(), "limit", -343325701);
        setIntField(term1395, term1395.getClass(), "lineNumber", 107945604);
        setIntField(term1395, term1395.getClass(), "lineStart", -1963464809);
        setIntField(term1395, term1395.getClass(), "peeked", 71190297);
        setLongField(term1395, term1395.getClass(), "peekedLong", -7237588299778557629L);
        setIntField(term1395, term1395.getClass(), "peekedNumberLength", 1202361360);
        setField(term1395, term1395.getClass(), "peekedString", "nGKItKLYNC");
        setIntElement(term1419, 0, -2015048153);
        setIntElement(term1419, 1, -2063457669);
        setIntElement(term1419, 2, -1222006000);
        setIntElement(term1419, 3, 2095798786);
        setIntElement(term1419, 4, -1565502840);
        setField(term1395, term1395.getClass(), "stack", term1419);
        setIntField(term1395, term1395.getClass(), "stackSize", 344323424);
        setElement(term1426, 0, "UiUYnPrcCi");
        setElement(term1426, 1, "UoYtihxVaS");
        setElement(term1426, 2, "JDswTTCZHV");
        setField(term1395, term1395.getClass(), "pathNames", term1426);
        setIntElement(term1463, 0, 9726679);
        setIntElement(term1463, 1, -25637976);
        setIntElement(term1463, 2, 1555897383);
        setIntElement(term1463, 3, 202001407);
        setIntElement(term1463, 4, 158873461);
        setField(term1395, term1395.getClass(), "pathIndices", term1463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doPeek", argTypes, term1395, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


