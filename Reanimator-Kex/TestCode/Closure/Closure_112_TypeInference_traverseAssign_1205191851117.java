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

public class TypeInference_traverseAssign_1205191851117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65846;
     Object term65916;

    public TypeInference_traverseAssign_1205191851117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65846 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term65916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65916, term65916.getClass(), "first", term65916);
        setField(term65916, term65916.getClass(), "last", term65986);
        setIntField(term65916, term65916.getClass(), "type", 1072005683);
        setIntField(term66056, term66056.getClass(), "type", 10);
        setField(term65916, term65916.getClass(), "next", term66056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term65916;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term65846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


