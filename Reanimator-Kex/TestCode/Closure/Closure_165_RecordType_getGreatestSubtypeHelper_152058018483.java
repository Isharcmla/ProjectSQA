package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_getGreatestSubtypeHelper_152058018483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17885;
     Object term18021;

    public RecordType_getGreatestSubtypeHelper_152058018483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term17925 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term17885, term17885.getClass(), "registry", null);
        setField(term17885, term17885.getClass(), "properties", term17925);
        term18021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term18061 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term18021, term18021.getClass(), "properties", term18061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term18021;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term17885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


