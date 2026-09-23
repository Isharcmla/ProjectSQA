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
import java.util.HashMap;

public class NamedType_handleUnresolvedType_206329762161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38786;
     Object term39034;

    public NamedType_handleUnresolvedType_206329762161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term38890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term38890, term38890.getClass(), "lastGeneration", true);
        setField(term38786, term38786.getClass(), "registry", term38890);
        setField(term38786, term38786.getClass(), "reference", null);
        setField(term38786, term38786.getClass(), "sourceName", null);
        setIntField(term38786, term38786.getClass(), "lineno", 0);
        setIntField(term38786, term38786.getClass(), "charno", 0);
        HashMap term39082 = new HashMap();
        term39034 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
        setField(term39034, term39034.getClass(), "compiler", null);
        setField(term39034, term39034.getClass(), "typeMap", term39082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term39034;
        args[1] = false;
        try {
            callMethod(klass, "handleUnresolvedType", argTypes, term38786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


