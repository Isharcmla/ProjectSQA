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

public class TypeCheck_visit_8595247841415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447048;
     Object term447230;

    public TypeCheck_visit_8595247841415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447048 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term447138 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term447048, term447048.getClass(), "validator", term447138);
        term447230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term447344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term447230, term447230.getClass(), "type", 28);
        setField(term447230, term447230.getClass(), "first", term447230);
        setField(term447230, term447230.getClass(), "jsType", term447344);
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
        args[1] = term447230;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term447048, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


