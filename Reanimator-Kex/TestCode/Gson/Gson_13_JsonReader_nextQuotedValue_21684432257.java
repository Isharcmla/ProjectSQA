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
import java.lang.IndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class JsonReader_nextQuotedValue_21684432257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2859;
     Object term2940;

    public JsonReader_nextQuotedValue_21684432257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2859 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2861 = (char[]) newCharArray(5);
        int[] term2886 = (int[]) newIntArray(1);
        Object[] term2889 = (Object[]) newArray("java.lang.String", 4);
        int[] term2938 = (int[]) newIntArray(1);
        setField(term2859, term2859.getClass(), "in", null);
        setBooleanField(term2859, term2859.getClass(), "lenient", false);
        setCharElement(term2861, 0, 'I');
        setCharElement(term2861, 1, 'r');
        setCharElement(term2861, 2, 'c');
        setCharElement(term2861, 3, 'R');
        setCharElement(term2861, 4, 'M');
        setField(term2859, term2859.getClass(), "buffer", term2861);
        setIntField(term2859, term2859.getClass(), "pos", 2007134147);
        setIntField(term2859, term2859.getClass(), "limit", 993388358);
        setIntField(term2859, term2859.getClass(), "lineNumber", -765191335);
        setIntField(term2859, term2859.getClass(), "lineStart", -1697741155);
        setIntField(term2859, term2859.getClass(), "peeked", 1295839803);
        setLongField(term2859, term2859.getClass(), "peekedLong", -6573104506744284592L);
        setIntField(term2859, term2859.getClass(), "peekedNumberLength", -1891015523);
        setField(term2859, term2859.getClass(), "peekedString", "XqgfKFvPSD");
        setIntElement(term2886, 0, -1560631747);
        setField(term2859, term2859.getClass(), "stack", term2886);
        setIntField(term2859, term2859.getClass(), "stackSize", 1215150180);
        setElement(term2889, 0, "JiVRgTZvKc");
        setElement(term2889, 1, "XPKmummaqg");
        setElement(term2889, 2, "BKLfkLiZTH");
        setElement(term2889, 3, "SPpkrGcPRr");
        setField(term2859, term2859.getClass(), "pathNames", term2889);
        setIntElement(term2938, 0, -1422859977);
        setField(term2859, term2859.getClass(), "pathIndices", term2938);
        term2940 = new Character('F');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2940;
        try {
            callMethod(klass, "nextQuotedValue", argTypes, term2859, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


