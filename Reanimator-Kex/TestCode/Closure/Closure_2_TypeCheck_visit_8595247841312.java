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

public class TypeCheck_visit_8595247841312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396357;
     Object term396427;

    public TypeCheck_visit_8595247841312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396357 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term396427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term396497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term396597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term396427, term396427.getClass(), "type", 30);
        setField(term396497, term396497.getClass(), "jsType", term396597);
        setField(term396427, term396427.getClass(), "first", term396497);
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
        args[1] = term396427;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term396357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


