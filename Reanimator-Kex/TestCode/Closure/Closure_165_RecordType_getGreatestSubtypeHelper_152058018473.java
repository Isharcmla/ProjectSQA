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

public class RecordType_getGreatestSubtypeHelper_152058018473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13664;
     Object term13800;

    public RecordType_getGreatestSubtypeHelper_152058018473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term13704 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13664, term13664.getClass(), "registry", null);
        setField(term13664, term13664.getClass(), "properties", term13704);
        term13800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term13840 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13800, term13800.getClass(), "properties", term13840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term13800;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term13664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


