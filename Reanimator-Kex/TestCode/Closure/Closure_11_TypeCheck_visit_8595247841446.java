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

public class TypeCheck_visit_8595247841446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443821;
     Object term443891;

    public TypeCheck_visit_8595247841446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443821 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term443891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term444127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term443891, term443891.getClass(), "type", 19);
        setField(term443961, term443961.getClass(), "jsType", term444057);
        setField(term443891, term443891.getClass(), "first", term443961);
        setField(term443891, term443891.getClass(), "last", term444127);
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
        args[1] = term443891;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term443821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


