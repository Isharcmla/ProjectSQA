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

public class TypeCheck_visit_859524784698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188868;
     Object term188938;

    public TypeCheck_visit_859524784698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188868 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term188938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term189188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term188938, term188938.getClass(), "type", 45);
        setIntField(term189008, term189008.getClass(), "type", 45);
        setField(term189008, term189008.getClass(), "jsType", term189118);
        setField(term188938, term188938.getClass(), "first", term189008);
        setIntField(term189188, term189188.getClass(), "type", 45);
        setField(term188938, term188938.getClass(), "last", term189188);
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
        args[1] = term188938;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term188868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


