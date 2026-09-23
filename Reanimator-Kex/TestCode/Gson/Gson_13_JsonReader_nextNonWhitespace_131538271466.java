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
import java.lang.Boolean;

public class JsonReader_nextNonWhitespace_131538271466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;
     Object term4189;

    public JsonReader_nextNonWhitespace_131538271466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4129 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4131 = (char[]) newCharArray(3);
        int[] term4154 = (int[]) newIntArray(2);
        Object[] term4158 = (Object[]) newArray("java.lang.String", 2);
        int[] term4183 = (int[]) newIntArray(5);
        setField(term4129, term4129.getClass(), "in", null);
        setBooleanField(term4129, term4129.getClass(), "lenient", true);
        setCharElement(term4131, 0, 'z');
        setCharElement(term4131, 1, 'R');
        setCharElement(term4131, 2, 'f');
        setField(term4129, term4129.getClass(), "buffer", term4131);
        setIntField(term4129, term4129.getClass(), "pos", -197820800);
        setIntField(term4129, term4129.getClass(), "limit", 723812297);
        setIntField(term4129, term4129.getClass(), "lineNumber", 1639448749);
        setIntField(term4129, term4129.getClass(), "lineStart", 873659088);
        setIntField(term4129, term4129.getClass(), "peeked", -975748721);
        setLongField(term4129, term4129.getClass(), "peekedLong", -4502405999831680926L);
        setIntField(term4129, term4129.getClass(), "peekedNumberLength", 433248783);
        setField(term4129, term4129.getClass(), "peekedString", "VMeAzAHwZj");
        setIntElement(term4154, 0, -507944154);
        setIntElement(term4154, 1, -1736183862);
        setField(term4129, term4129.getClass(), "stack", term4154);
        setIntField(term4129, term4129.getClass(), "stackSize", 897010381);
        setElement(term4158, 0, "PznxWXsZME");
        setElement(term4158, 1, "ZzIujlwVsw");
        setField(term4129, term4129.getClass(), "pathNames", term4158);
        setIntElement(term4183, 0, -15712667);
        setIntElement(term4183, 1, 1964967720);
        setIntElement(term4183, 2, 1351900243);
        setIntElement(term4183, 3, -330897705);
        setIntElement(term4183, 4, 1065595802);
        setField(term4129, term4129.getClass(), "pathIndices", term4183);
        term4189 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4189;
        try {
            callMethod(klass, "nextNonWhitespace", argTypes, term4129, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


