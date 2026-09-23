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

public class JsonReader_getLineNumber_127410853267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;
     Object term14852;

    public JsonReader_getLineNumber_127410853267() {
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
        term14852 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term14853 = (char[]) newCharArray(3);
        int[] term14856 = (int[]) newIntArray(2);
        Object[] term14857 = (Object[]) newArray("java.lang.String", 2);
        int[] term14862 = (int[]) newIntArray(5);
        setField(term14852, term14852.getClass(), "in", null);
        setBooleanField(term14852, term14852.getClass(), "lenient", true);
        setCharElement(term14853, 0, 'z');
        setCharElement(term14853, 1, 'R');
        setCharElement(term14853, 2, 'f');
        setField(term14852, term14852.getClass(), "buffer", term14853);
        setIntField(term14852, term14852.getClass(), "pos", -197820800);
        setIntField(term14852, term14852.getClass(), "limit", 723812297);
        setIntField(term14852, term14852.getClass(), "lineNumber", 1639448749);
        setIntField(term14852, term14852.getClass(), "lineStart", 873659088);
        setIntField(term14852, term14852.getClass(), "peeked", -975748721);
        setLongField(term14852, term14852.getClass(), "peekedLong", -4502405999831680926L);
        setIntField(term14852, term14852.getClass(), "peekedNumberLength", 433248783);
        setField(term14852, term14852.getClass(), "peekedString", "VMeAzAHwZj");
        setIntElement(term14856, 0, -507944154);
        setIntElement(term14856, 1, -1736183862);
        setField(term14852, term14852.getClass(), "stack", term14856);
        setIntField(term14852, term14852.getClass(), "stackSize", 897010381);
        setElement(term14857, 0, "PznxWXsZME");
        setElement(term14857, 1, "ZzIujlwVsw");
        setField(term14852, term14852.getClass(), "pathNames", term14857);
        setIntElement(term14862, 0, -15712667);
        setIntElement(term14862, 1, 1964967720);
        setIntElement(term14862, 2, 1351900243);
        setIntElement(term14862, 3, -330897705);
        setIntElement(term14862, 4, 1065595802);
        setField(term14852, term14852.getClass(), "pathIndices", term14862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLineNumber", argTypes, term4129, args);
        assertTrue(recursiveEquals(term4129, term14852));
        assertTrue(recursiveEquals(retValue, 1639448750));
    }

};


