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

public class TypeCheck_visit_8595247841384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421025;
     Object term421117;

    public TypeCheck_visit_8595247841384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421025 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term421117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term421395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term421117, term421117.getClass(), "type", 12);
        setIntField(term421209, term421209.getClass(), "type", 12);
        setField(term421209, term421209.getClass(), "jsType", term421303);
        setField(term421117, term421117.getClass(), "first", term421209);
        setIntField(term421395, term421395.getClass(), "type", 12);
        setField(term421117, term421117.getClass(), "last", term421395);
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
        args[1] = term421117;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term421025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


