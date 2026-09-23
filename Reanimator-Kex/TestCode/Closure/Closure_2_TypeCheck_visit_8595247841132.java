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

public class TypeCheck_visit_8595247841132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324802;
     Object term324872;

    public TypeCheck_visit_8595247841132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324802 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term324872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term325034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term325104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term324872, term324872.getClass(), "type", 89);
        setIntField(term324942, term324942.getClass(), "type", 89);
        setField(term324942, term324942.getClass(), "jsType", term325034);
        setField(term324872, term324872.getClass(), "first", term324942);
        setField(term324872, term324872.getClass(), "last", term325104);
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
        args[1] = term324872;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term324802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


