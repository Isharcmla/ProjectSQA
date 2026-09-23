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

public class JsonReader_nextBoolean_207559393054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2187;

    public JsonReader_nextBoolean_207559393054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2187 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2189 = (char[]) newCharArray(7);
        int[] term2216 = (int[]) newIntArray(2);
        Object[] term2220 = (Object[]) newArray("java.lang.String", 9);
        int[] term2329 = (int[]) newIntArray(7);
        setField(term2187, term2187.getClass(), "in", null);
        setBooleanField(term2187, term2187.getClass(), "lenient", false);
        setCharElement(term2189, 0, 'V');
        setCharElement(term2189, 1, 'p');
        setCharElement(term2189, 2, 'O');
        setCharElement(term2189, 3, 'Q');
        setCharElement(term2189, 4, 'T');
        setCharElement(term2189, 5, 'y');
        setCharElement(term2189, 6, 'S');
        setField(term2187, term2187.getClass(), "buffer", term2189);
        setIntField(term2187, term2187.getClass(), "pos", 477625804);
        setIntField(term2187, term2187.getClass(), "limit", 252575029);
        setIntField(term2187, term2187.getClass(), "lineNumber", 57189932);
        setIntField(term2187, term2187.getClass(), "lineStart", 1460722225);
        setIntField(term2187, term2187.getClass(), "peeked", 1743224434);
        setLongField(term2187, term2187.getClass(), "peekedLong", -5476826692763582090L);
        setIntField(term2187, term2187.getClass(), "peekedNumberLength", 842904495);
        setField(term2187, term2187.getClass(), "peekedString", "HqBOwkVqjD");
        setIntElement(term2216, 0, 1008080511);
        setIntElement(term2216, 1, 1935707624);
        setField(term2187, term2187.getClass(), "stack", term2216);
        setIntField(term2187, term2187.getClass(), "stackSize", 1507074215);
        setElement(term2220, 0, "MAcUBcBckh");
        setElement(term2220, 1, "oVgzLbrsFr");
        setElement(term2220, 2, "vQVyKLdtaz");
        setElement(term2220, 3, "OWKQODBLzb");
        setElement(term2220, 4, "wGmYcqUkgE");
        setElement(term2220, 5, "idgaQsnJpQ");
        setElement(term2220, 6, "VgZnGoIFwQ");
        setElement(term2220, 7, "jUbSRrkrYZ");
        setElement(term2220, 8, "bWWfajKbEX");
        setField(term2187, term2187.getClass(), "pathNames", term2220);
        setIntElement(term2329, 0, -282881827);
        setIntElement(term2329, 1, -1183353915);
        setIntElement(term2329, 2, -420030135);
        setIntElement(term2329, 3, 267763294);
        setIntElement(term2329, 4, -1497710478);
        setIntElement(term2329, 5, 49950830);
        setIntElement(term2329, 6, -525257914);
        setField(term2187, term2187.getClass(), "pathIndices", term2329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term2187, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


