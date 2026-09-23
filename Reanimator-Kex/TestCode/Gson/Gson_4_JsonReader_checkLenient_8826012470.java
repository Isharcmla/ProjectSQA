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

public class JsonReader_checkLenient_8826012470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4359;
     Object term15464;

    public JsonReader_checkLenient_8826012470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4359 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term4361 = (char[]) newCharArray(3);
        int[] term4384 = (int[]) newIntArray(4);
        Object[] term4390 = (Object[]) newArray("java.lang.String", 5);
        int[] term4451 = (int[]) newIntArray(8);
        setField(term4359, term4359.getClass(), "in", null);
        setBooleanField(term4359, term4359.getClass(), "lenient", true);
        setCharElement(term4361, 0, 'X');
        setCharElement(term4361, 1, 'R');
        setCharElement(term4361, 2, 'o');
        setField(term4359, term4359.getClass(), "buffer", term4361);
        setIntField(term4359, term4359.getClass(), "pos", -1945635750);
        setIntField(term4359, term4359.getClass(), "limit", -1622760744);
        setIntField(term4359, term4359.getClass(), "lineNumber", 2068435279);
        setIntField(term4359, term4359.getClass(), "lineStart", -1556527718);
        setIntField(term4359, term4359.getClass(), "peeked", 895255351);
        setLongField(term4359, term4359.getClass(), "peekedLong", 6855071767938501807L);
        setIntField(term4359, term4359.getClass(), "peekedNumberLength", -1317044799);
        setField(term4359, term4359.getClass(), "peekedString", "mvrkADEgpp");
        setIntElement(term4384, 0, -1428063820);
        setIntElement(term4384, 1, -1271375703);
        setIntElement(term4384, 2, 1136208236);
        setIntElement(term4384, 3, -1220630391);
        setField(term4359, term4359.getClass(), "stack", term4384);
        setIntField(term4359, term4359.getClass(), "stackSize", -995822131);
        setElement(term4390, 0, "pXOkjyeIRb");
        setElement(term4390, 1, "GgZWSjxjyE");
        setElement(term4390, 2, "EeBVbzjcCI");
        setElement(term4390, 3, "UfQtPRyWRC");
        setElement(term4390, 4, "FPvxVzzSvD");
        setField(term4359, term4359.getClass(), "pathNames", term4390);
        setIntElement(term4451, 0, -687282231);
        setIntElement(term4451, 1, 1200440315);
        setIntElement(term4451, 2, 40571662);
        setIntElement(term4451, 3, 1863910269);
        setIntElement(term4451, 4, 864645689);
        setIntElement(term4451, 5, 279384872);
        setIntElement(term4451, 6, 1427305953);
        setIntElement(term4451, 7, -781832877);
        setField(term4359, term4359.getClass(), "pathIndices", term4451);
        term15464 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term15465 = (char[]) newCharArray(3);
        int[] term15468 = (int[]) newIntArray(4);
        Object[] term15469 = (Object[]) newArray("java.lang.String", 5);
        int[] term15480 = (int[]) newIntArray(8);
        setField(term15464, term15464.getClass(), "in", null);
        setBooleanField(term15464, term15464.getClass(), "lenient", true);
        setCharElement(term15465, 0, 'X');
        setCharElement(term15465, 1, 'R');
        setCharElement(term15465, 2, 'o');
        setField(term15464, term15464.getClass(), "buffer", term15465);
        setIntField(term15464, term15464.getClass(), "pos", -1945635750);
        setIntField(term15464, term15464.getClass(), "limit", -1622760744);
        setIntField(term15464, term15464.getClass(), "lineNumber", 2068435279);
        setIntField(term15464, term15464.getClass(), "lineStart", -1556527718);
        setIntField(term15464, term15464.getClass(), "peeked", 895255351);
        setLongField(term15464, term15464.getClass(), "peekedLong", 6855071767938501807L);
        setIntField(term15464, term15464.getClass(), "peekedNumberLength", -1317044799);
        setField(term15464, term15464.getClass(), "peekedString", "mvrkADEgpp");
        setIntElement(term15468, 0, -1428063820);
        setIntElement(term15468, 1, -1271375703);
        setIntElement(term15468, 2, 1136208236);
        setIntElement(term15468, 3, -1220630391);
        setField(term15464, term15464.getClass(), "stack", term15468);
        setIntField(term15464, term15464.getClass(), "stackSize", -995822131);
        setElement(term15469, 0, "pXOkjyeIRb");
        setElement(term15469, 1, "GgZWSjxjyE");
        setElement(term15469, 2, "EeBVbzjcCI");
        setElement(term15469, 3, "UfQtPRyWRC");
        setElement(term15469, 4, "FPvxVzzSvD");
        setField(term15464, term15464.getClass(), "pathNames", term15469);
        setIntElement(term15480, 0, -687282231);
        setIntElement(term15480, 1, 1200440315);
        setIntElement(term15480, 2, 40571662);
        setIntElement(term15480, 3, 1863910269);
        setIntElement(term15480, 4, 864645689);
        setIntElement(term15480, 5, 279384872);
        setIntElement(term15480, 6, 1427305953);
        setIntElement(term15480, 7, -781832877);
        setField(term15464, term15464.getClass(), "pathIndices", term15480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkLenient", argTypes, term4359, args);
        assertTrue(recursiveEquals(term4359, term15464));
    }

};


