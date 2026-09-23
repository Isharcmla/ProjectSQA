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

public class ProcessClosurePrimitives_visit_1582589868225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65008;
     Object term65098;
     Object term65168;

    public ProcessClosurePrimitives_visit_1582589868225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65008 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term65098 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term65168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65168, term65168.getClass(), "type", 130);
        setField(term65238, term65238.getClass(), "propListHead", null);
        setField(term65168, term65168.getClass(), "first", term65238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term65098;
        args[1] = term65168;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term65008, args);
    }

};


