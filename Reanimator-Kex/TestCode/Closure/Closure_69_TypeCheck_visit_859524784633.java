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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_859524784633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202566;
     Object term202740;

    public TypeCheck_visit_859524784633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202566 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term202670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term202566, term202566.getClass(), "typeRegistry", term202670);
        term202740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term202740, term202740.getClass(), "type", 37);
        setField(term202810, term202810.getClass(), "jsType", null);
        setField(term202740, term202740.getClass(), "first", term202810);
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
        args[1] = term202740;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term202566, args);
    }

};


