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

public class JsonReader_syntaxError_82493016074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5339;

    public JsonReader_syntaxError_82493016074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5339 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term5341 = (char[]) newCharArray(8);
        int[] term5369 = (int[]) newIntArray(7);
        Object[] term5378 = (Object[]) newArray("java.lang.String", 2);
        int[] term5403 = (int[]) newIntArray(2);
        setField(term5339, term5339.getClass(), "in", null);
        setBooleanField(term5339, term5339.getClass(), "lenient", true);
        setCharElement(term5341, 0, 'C');
        setCharElement(term5341, 1, 'F');
        setCharElement(term5341, 2, 'V');
        setCharElement(term5341, 3, 't');
        setCharElement(term5341, 4, 'F');
        setCharElement(term5341, 5, 'Z');
        setCharElement(term5341, 6, 'i');
        setCharElement(term5341, 7, 'a');
        setField(term5339, term5339.getClass(), "buffer", term5341);
        setIntField(term5339, term5339.getClass(), "pos", -1551355284);
        setIntField(term5339, term5339.getClass(), "limit", -1381970335);
        setIntField(term5339, term5339.getClass(), "lineNumber", 1213549815);
        setIntField(term5339, term5339.getClass(), "lineStart", -1518419301);
        setIntField(term5339, term5339.getClass(), "peeked", 674879025);
        setLongField(term5339, term5339.getClass(), "peekedLong", 1233889271256172047L);
        setIntField(term5339, term5339.getClass(), "peekedNumberLength", -1538936030);
        setField(term5339, term5339.getClass(), "peekedString", "igCAtimmYB");
        setIntElement(term5369, 0, -752870423);
        setIntElement(term5369, 1, -1698809299);
        setIntElement(term5369, 2, 401512128);
        setIntElement(term5369, 3, -2069930777);
        setIntElement(term5369, 4, 1543696412);
        setIntElement(term5369, 5, -1385748168);
        setIntElement(term5369, 6, -270592367);
        setField(term5339, term5339.getClass(), "stack", term5369);
        setIntField(term5339, term5339.getClass(), "stackSize", 178847646);
        setElement(term5378, 0, "DyiXbeYIaN");
        setElement(term5378, 1, "VGizxZnyHX");
        setField(term5339, term5339.getClass(), "pathNames", term5378);
        setIntElement(term5403, 0, 273590437);
        setIntElement(term5403, 1, -348612876);
        setField(term5339, term5339.getClass(), "pathIndices", term5403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        try {
            callMethod(klass, "syntaxError", argTypes, term5339, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


