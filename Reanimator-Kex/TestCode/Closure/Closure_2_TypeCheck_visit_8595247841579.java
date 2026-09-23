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
import java.lang.String;

public class TypeCheck_visit_8595247841579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524383;
     Object term524475;

    public TypeCheck_visit_8595247841579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524383 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Class<? extends Object> term525731 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term525730 = ((Class) term525731).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term525730).setAccessible(true);
        Object enum57 = ((Field) term525730).get((Object) null);
        term524475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term524567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term524667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term524475, term524475.getClass(), "type", 37);
        setField(term524667, term524667.getClass(), "docInfo", null);
        setField(term524667, term524667.getClass(), "implicitPrototypeFallback", null);
        setField(term524667, term524667.getClass(), "kind", enum57);
        setField(term524567, term524567.getClass(), "jsType", term524667);
        setField(term524475, term524475.getClass(), "first", term524567);
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
        args[1] = term524475;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term524383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


