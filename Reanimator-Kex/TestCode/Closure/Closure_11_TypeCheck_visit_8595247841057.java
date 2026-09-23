package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_8595247841057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300865;
     Object term301039;
     Object term301109;

    public TypeCheck_visit_8595247841057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300865 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term300969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term300865, term300865.getClass(), "typeRegistry", term300969);
        term301039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301039, term301039.getClass(), "type", 64);
        setField(term301039, term301039.getClass(), "jsType", null);
        term301109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term301109, term301109.getClass(), "jsType", term301205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term301039;
        args[2] = term301109;
        try {
            callMethod(klass, "visit", argTypes, term300865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


