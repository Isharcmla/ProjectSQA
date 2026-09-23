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

public class TypeCheck_visit_859524784713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189742;
     Object term189902;

    public TypeCheck_visit_859524784713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189742 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term189832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term189742, term189742.getClass(), "validator", term189832);
        term189902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term189902, term189902.getClass(), "type", 29);
        setField(term189902, term189902.getClass(), "first", term189902);
        setField(term189902, term189902.getClass(), "jsType", term190002);
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
        args[1] = term189902;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term189742, args);
    }

};


