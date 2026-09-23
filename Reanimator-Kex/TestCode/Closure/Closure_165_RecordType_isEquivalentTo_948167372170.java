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

public class RecordType_isEquivalentTo_948167372170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53386;
     Object term53524;

    public RecordType_isEquivalentTo_948167372170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term53426 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term53386, term53386.getClass(), "properties", term53426);
        term53524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term53620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term53524, term53524.getClass(), "referencedType", term53620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term53524;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term53386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


