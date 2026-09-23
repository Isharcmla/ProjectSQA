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

public class JsonReader_peekKeyword_16285886349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521;

    public JsonReader_peekKeyword_16285886349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1521 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term1523 = (char[]) newCharArray(5);
        int[] term1548 = (int[]) newIntArray(1);
        Object[] term1551 = (Object[]) newArray("java.lang.String", 0);
        int[] term1552 = (int[]) newIntArray(9);
        setField(term1521, term1521.getClass(), "in", null);
        setBooleanField(term1521, term1521.getClass(), "lenient", false);
        setCharElement(term1523, 0, 'P');
        setCharElement(term1523, 1, 'w');
        setCharElement(term1523, 2, 'D');
        setCharElement(term1523, 3, 'Y');
        setCharElement(term1523, 4, 'F');
        setField(term1521, term1521.getClass(), "buffer", term1523);
        setIntField(term1521, term1521.getClass(), "pos", 98922530);
        setIntField(term1521, term1521.getClass(), "limit", -1388471422);
        setIntField(term1521, term1521.getClass(), "lineNumber", -1498296052);
        setIntField(term1521, term1521.getClass(), "lineStart", 2098647989);
        setIntField(term1521, term1521.getClass(), "peeked", 1598895173);
        setLongField(term1521, term1521.getClass(), "peekedLong", 6967924379644551255L);
        setIntField(term1521, term1521.getClass(), "peekedNumberLength", 1830648570);
        setField(term1521, term1521.getClass(), "peekedString", "onpbIeEKoi");
        setIntElement(term1548, 0, -227365013);
        setField(term1521, term1521.getClass(), "stack", term1548);
        setIntField(term1521, term1521.getClass(), "stackSize", 11724947);
        setField(term1521, term1521.getClass(), "pathNames", term1551);
        setIntElement(term1552, 0, 1953277050);
        setIntElement(term1552, 1, 1283079251);
        setIntElement(term1552, 2, -523949691);
        setIntElement(term1552, 3, 1398204340);
        setIntElement(term1552, 4, 229204365);
        setIntElement(term1552, 5, -461771056);
        setIntElement(term1552, 6, -243422082);
        setIntElement(term1552, 7, 1384592638);
        setIntElement(term1552, 8, -1002370457);
        setField(term1521, term1521.getClass(), "pathIndices", term1552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "peekKeyword", argTypes, term1521, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


