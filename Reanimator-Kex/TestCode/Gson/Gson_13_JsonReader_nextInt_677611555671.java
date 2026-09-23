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

public class JsonReader_nextInt_677611555671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1232305;

    public JsonReader_nextInt_677611555671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1232305 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1231611 = (int[]) newIntArray(489);
        setIntField(term1232305, term1232305.getClass(), "peeked", 4);
        setIntField(term1232305, term1232305.getClass(), "lineNumber", 0);
        setIntField(term1232305, term1232305.getClass(), "pos", 0);
        setIntField(term1232305, term1232305.getClass(), "lineStart", 0);
        setIntField(term1232305, term1232305.getClass(), "stackSize", 1);
        setIntElement(term1231611, 0, 69);
        setIntElement(term1231611, 1, 120);
        setIntElement(term1231611, 2, 112);
        setIntElement(term1231611, 3, 101);
        setIntElement(term1231611, 4, 99);
        setIntElement(term1231611, 5, 116);
        setIntElement(term1231611, 6, 101);
        setIntElement(term1231611, 7, 100);
        setIntElement(term1231611, 8, 32);
        setIntElement(term1231611, 9, 97);
        setIntElement(term1231611, 10, 110);
        setIntElement(term1231611, 11, 32);
        setIntElement(term1231611, 12, 105);
        setIntElement(term1231611, 13, 110);
        setIntElement(term1231611, 14, 116);
        setIntElement(term1231611, 15, 32);
        setIntElement(term1231611, 16, 98);
        setIntElement(term1231611, 17, 117);
        setIntElement(term1231611, 18, 116);
        setIntElement(term1231611, 19, 32);
        setIntElement(term1231611, 20, 119);
        setIntElement(term1231611, 21, 97);
        setIntElement(term1231611, 22, 115);
        setIntElement(term1231611, 23, 32);
        setField(term1232305, term1232305.getClass(), "stack", term1231611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1232305, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


