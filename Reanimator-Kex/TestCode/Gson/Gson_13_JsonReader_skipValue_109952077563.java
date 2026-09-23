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

public class JsonReader_skipValue_109952077563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3809;

    public JsonReader_skipValue_109952077563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3809 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3811 = (char[]) newCharArray(7);
        int[] term3838 = (int[]) newIntArray(6);
        Object[] term3846 = (Object[]) newArray("java.lang.String", 5);
        int[] term3907 = (int[]) newIntArray(3);
        setField(term3809, term3809.getClass(), "in", null);
        setBooleanField(term3809, term3809.getClass(), "lenient", false);
        setCharElement(term3811, 0, 'g');
        setCharElement(term3811, 1, 'E');
        setCharElement(term3811, 2, 'T');
        setCharElement(term3811, 3, 'm');
        setCharElement(term3811, 4, 'J');
        setCharElement(term3811, 5, 'M');
        setCharElement(term3811, 6, 'x');
        setField(term3809, term3809.getClass(), "buffer", term3811);
        setIntField(term3809, term3809.getClass(), "pos", 200252898);
        setIntField(term3809, term3809.getClass(), "limit", -1831826725);
        setIntField(term3809, term3809.getClass(), "lineNumber", 752152965);
        setIntField(term3809, term3809.getClass(), "lineStart", -1577069773);
        setIntField(term3809, term3809.getClass(), "peeked", -266625190);
        setLongField(term3809, term3809.getClass(), "peekedLong", 2486810210675247493L);
        setIntField(term3809, term3809.getClass(), "peekedNumberLength", 489201218);
        setField(term3809, term3809.getClass(), "peekedString", "xIeFjkHkOe");
        setIntElement(term3838, 0, 464181937);
        setIntElement(term3838, 1, -1455526612);
        setIntElement(term3838, 2, -941356098);
        setIntElement(term3838, 3, -201517446);
        setIntElement(term3838, 4, -97742366);
        setIntElement(term3838, 5, 1638851942);
        setField(term3809, term3809.getClass(), "stack", term3838);
        setIntField(term3809, term3809.getClass(), "stackSize", 1374790203);
        setElement(term3846, 0, "SdCKLMIYnX");
        setElement(term3846, 1, "OJJtVNPyKZ");
        setElement(term3846, 2, "AKNapTAfmD");
        setElement(term3846, 3, "xJgPlLxpgC");
        setElement(term3846, 4, "EYtfuJaxiM");
        setField(term3809, term3809.getClass(), "pathNames", term3846);
        setIntElement(term3907, 0, 1160010161);
        setIntElement(term3907, 1, -423900705);
        setIntElement(term3907, 2, -525570815);
        setField(term3809, term3809.getClass(), "pathIndices", term3907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipValue", argTypes, term3809, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


