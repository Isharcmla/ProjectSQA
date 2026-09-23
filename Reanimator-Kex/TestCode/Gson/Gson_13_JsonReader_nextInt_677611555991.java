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
import java.lang.Object;

public class JsonReader_nextInt_677611555991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1407825;

    public JsonReader_nextInt_677611555991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1407825 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1407100 = (int[]) newIntArray(512);
        Object[] term1407614 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1407825, term1407825.getClass(), "peeked", 4);
        setIntField(term1407825, term1407825.getClass(), "lineNumber", 0);
        setIntField(term1407825, term1407825.getClass(), "pos", 0);
        setIntField(term1407825, term1407825.getClass(), "lineStart", 0);
        setIntField(term1407825, term1407825.getClass(), "stackSize", 1);
        setIntElement(term1407100, 0, 4);
        setField(term1407825, term1407825.getClass(), "stack", term1407100);
        setField(term1407825, term1407825.getClass(), "pathNames", term1407614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term1407825, args);
    }

};


