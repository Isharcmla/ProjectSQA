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

public class TypeCheck_visit_8595247841450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461980;
     Object term462072;

    public TypeCheck_visit_8595247841450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461980 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term462072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term462164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term462262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term462072, term462072.getClass(), "type", 95);
        setIntField(term462164, term462164.getClass(), "type", 95);
        setField(term462164, term462164.getClass(), "jsType", term462262);
        setField(term462072, term462072.getClass(), "first", term462164);
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
        args[1] = term462072;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term461980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


