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

public class TypeCheck_visit_8595247841378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427398;
     Object term427572;

    public TypeCheck_visit_8595247841378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427398 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term427502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term427398, term427398.getClass(), "typeRegistry", term427502);
        term427572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term427820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term427572, term427572.getClass(), "type", 12);
        setIntField(term427642, term427642.getClass(), "type", 0);
        setField(term427642, term427642.getClass(), "jsType", term427750);
        setField(term427572, term427572.getClass(), "first", term427642);
        setIntField(term427820, term427820.getClass(), "type", 0);
        setField(term427820, term427820.getClass(), "jsType", null);
        setField(term427572, term427572.getClass(), "last", term427820);
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
        args[1] = term427572;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term427398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


