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

public class JsonReader_nextUnquotedValue_205027097958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2999;

    public JsonReader_nextUnquotedValue_205027097958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2999 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3001 = (char[]) newCharArray(1);
        int[] term3022 = (int[]) newIntArray(6);
        Object[] term3030 = (Object[]) newArray("java.lang.String", 7);
        int[] term3115 = (int[]) newIntArray(0);
        setField(term2999, term2999.getClass(), "in", null);
        setBooleanField(term2999, term2999.getClass(), "lenient", true);
        setCharElement(term3001, 0, 'I');
        setField(term2999, term2999.getClass(), "buffer", term3001);
        setIntField(term2999, term2999.getClass(), "pos", -220791533);
        setIntField(term2999, term2999.getClass(), "limit", 1741500243);
        setIntField(term2999, term2999.getClass(), "lineNumber", -2070466617);
        setIntField(term2999, term2999.getClass(), "lineStart", -1127721881);
        setIntField(term2999, term2999.getClass(), "peeked", 1074848808);
        setLongField(term2999, term2999.getClass(), "peekedLong", -4920224193275732920L);
        setIntField(term2999, term2999.getClass(), "peekedNumberLength", -146054762);
        setField(term2999, term2999.getClass(), "peekedString", "sEccwbJKYE");
        setIntElement(term3022, 0, 798043553);
        setIntElement(term3022, 1, 533197381);
        setIntElement(term3022, 2, 1048271679);
        setIntElement(term3022, 3, -1529797673);
        setIntElement(term3022, 4, -868676396);
        setIntElement(term3022, 5, 1922684808);
        setField(term2999, term2999.getClass(), "stack", term3022);
        setIntField(term2999, term2999.getClass(), "stackSize", -2005784375);
        setElement(term3030, 0, "AWRooQKkdW");
        setElement(term3030, 1, "vjxIhXHxGR");
        setElement(term3030, 2, "QXzGXbEXMu");
        setElement(term3030, 3, "qxSDVejjiY");
        setElement(term3030, 4, "xBsXSDjXYK");
        setElement(term3030, 5, "sEnIVFtZuQ");
        setElement(term3030, 6, "ZVecLZMLHF");
        setField(term2999, term2999.getClass(), "pathNames", term3030);
        setField(term2999, term2999.getClass(), "pathIndices", term3115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextUnquotedValue", argTypes, term2999, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


