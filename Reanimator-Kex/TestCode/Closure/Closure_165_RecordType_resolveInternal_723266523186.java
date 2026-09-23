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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_resolveInternal_723266523186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60630;

    public RecordType_resolveInternal_723266523186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term60670 = newInstance(Class.forName("java.util.TreeMap"));
        Object term60774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term60169 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term60630, term60630.getClass(), "properties", term60670);
        setField(term60630, term60630.getClass(), "resolveResult", null);
        setBooleanField(term60630, term60630.getClass(), "resolved", false);
        setField(term60774, term60774.getClass(), "nativeTypes", term60169);
        setField(term60630, term60630.getClass(), "registry", term60774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term60630, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


