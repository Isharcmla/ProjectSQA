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

public class NamedType_handleUnresolvedType_206329762207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56915;
     Object term57163;

    public NamedType_handleUnresolvedType_206329762207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term57019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term57019, term57019.getClass(), "lastGeneration", true);
        setField(term56915, term56915.getClass(), "registry", term57019);
        setField(term56915, term56915.getClass(), "reference", null);
        setField(term56915, term56915.getClass(), "sourceName", null);
        setIntField(term56915, term56915.getClass(), "lineno", 0);
        setIntField(term56915, term56915.getClass(), "charno", 0);
        HashMap term57291 = new HashMap();
        term57163 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
        Object term57243 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term57163, term57163.getClass(), "compiler", term57243);
        setField(term57163, term57163.getClass(), "typeMap", term57291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57163;
        args[1] = false;
        try {
            callMethod(klass, "handleUnresolvedType", argTypes, term56915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


