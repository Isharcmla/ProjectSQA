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

public class TypeCheck_visit_8595247841058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302224;
     Object term302294;

    public TypeCheck_visit_8595247841058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302224 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term302294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term302294, term302294.getClass(), "type", 89);
        setIntField(term302364, term302364.getClass(), "type", 89);
        setField(term302364, term302364.getClass(), "jsType", term302460);
        setField(term302294, term302294.getClass(), "first", term302364);
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
        args[1] = term302294;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term302224, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


