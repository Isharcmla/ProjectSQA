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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_nextLong_95145352057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2799;

    public JsonReader_nextLong_95145352057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2799 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2801 = (char[]) newCharArray(5);
        int[] term2826 = (int[]) newIntArray(1);
        Object[] term2829 = (Object[]) newArray("java.lang.String", 0);
        int[] term2830 = (int[]) newIntArray(6);
        setField(term2799, term2799.getClass(), "in", null);
        setBooleanField(term2799, term2799.getClass(), "lenient", false);
        setCharElement(term2801, 0, 'N');
        setCharElement(term2801, 1, 'S');
        setCharElement(term2801, 2, 'z');
        setCharElement(term2801, 3, 'Y');
        setCharElement(term2801, 4, 'Y');
        setField(term2799, term2799.getClass(), "buffer", term2801);
        setIntField(term2799, term2799.getClass(), "pos", 76929641);
        setIntField(term2799, term2799.getClass(), "limit", -2003192918);
        setIntField(term2799, term2799.getClass(), "lineNumber", -1362856620);
        setIntField(term2799, term2799.getClass(), "lineStart", -1835839814);
        setIntField(term2799, term2799.getClass(), "peeked", -1404350380);
        setLongField(term2799, term2799.getClass(), "peekedLong", 5127676408959197577L);
        setIntField(term2799, term2799.getClass(), "peekedNumberLength", -2013924238);
        setField(term2799, term2799.getClass(), "peekedString", "DfISiziTgG");
        setIntElement(term2826, 0, 579006268);
        setField(term2799, term2799.getClass(), "stack", term2826);
        setIntField(term2799, term2799.getClass(), "stackSize", -1694747156);
        setField(term2799, term2799.getClass(), "pathNames", term2829);
        setIntElement(term2830, 0, 1466373988);
        setIntElement(term2830, 1, -358526505);
        setIntElement(term2830, 2, 1843268026);
        setIntElement(term2830, 3, 954660603);
        setIntElement(term2830, 4, -1351605385);
        setIntElement(term2830, 5, 278355793);
        setField(term2799, term2799.getClass(), "pathIndices", term2830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term2799, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


