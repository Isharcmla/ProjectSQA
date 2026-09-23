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

public class TypeCheck_visit_8595247841553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513630;
     Object term513700;

    public TypeCheck_visit_8595247841553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513630 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term513700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term513770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term513870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term513940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term513700, term513700.getClass(), "type", 88);
        setIntField(term513770, term513770.getClass(), "type", 88);
        setField(term513770, term513770.getClass(), "jsType", term513870);
        setField(term513700, term513700.getClass(), "first", term513770);
        setField(term513700, term513700.getClass(), "last", term513940);
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
        args[1] = term513700;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term513630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


