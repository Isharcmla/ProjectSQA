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

public class TypeCheck_visit_8595247841390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434681;
     Object term434773;

    public TypeCheck_visit_8595247841390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434681 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term434773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term434865 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term434965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term434773, term434773.getClass(), "type", 37);
        setField(term434865, term434865.getClass(), "jsType", term434965);
        setField(term434773, term434773.getClass(), "first", term434865);
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
        args[1] = term434773;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term434681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


