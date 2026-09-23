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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_179693505629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4776;
     Object term4846;
     Object term5509;
     Object term5510;

    public MustBeReachingVariableDef_computeMustDef_179693505629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4776 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term4846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4846, term4846.getClass(), "type", 1265463001);
        setIntField(term4916, term4916.getClass(), "type", -2027534003);
        setIntField(term4986, term4986.getClass(), "type", 1375330971);
        setField(term4986, term4986.getClass(), "first", null);
        setField(term4986, term4986.getClass(), "next", null);
        setField(term4916, term4916.getClass(), "first", term4986);
        setIntField(term5056, term5056.getClass(), "type", 99);
        setField(term4916, term4916.getClass(), "next", term5056);
        setField(term4846, term4846.getClass(), "first", term4916);
        term5509 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term5509, term5509.getClass(), "jsScope", null);
        setField(term5509, term5509.getClass(), "compiler", null);
        setField(term5509, term5509.getClass(), "escaped", null);
        setField(term5509, term5509.getClass(), "cfg", null);
        setField(term5509, term5509.getClass(), "joinOp", null);
        setField(term5509, term5509.getClass(), "orderedWorkSet", null);
        term5510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5510, term5510.getClass(), "type", 1265463001);
        setField(term5510, term5510.getClass(), "next", null);
        setIntField(term5511, term5511.getClass(), "type", -2027534003);
        setIntField(term5512, term5512.getClass(), "type", 99);
        setField(term5512, term5512.getClass(), "next", null);
        setField(term5512, term5512.getClass(), "first", null);
        setField(term5512, term5512.getClass(), "last", null);
        setField(term5512, term5512.getClass(), "propListHead", null);
        setIntField(term5512, term5512.getClass(), "sourcePosition", 0);
        setField(term5512, term5512.getClass(), "jsType", null);
        setField(term5512, term5512.getClass(), "parent", null);
        setField(term5511, term5511.getClass(), "next", term5512);
        setIntField(term5513, term5513.getClass(), "type", 1375330971);
        setField(term5513, term5513.getClass(), "next", null);
        setField(term5513, term5513.getClass(), "first", null);
        setField(term5513, term5513.getClass(), "last", null);
        setField(term5513, term5513.getClass(), "propListHead", null);
        setIntField(term5513, term5513.getClass(), "sourcePosition", 0);
        setField(term5513, term5513.getClass(), "jsType", null);
        setField(term5513, term5513.getClass(), "parent", null);
        setField(term5511, term5511.getClass(), "first", term5513);
        setField(term5511, term5511.getClass(), "last", null);
        setField(term5511, term5511.getClass(), "propListHead", null);
        setIntField(term5511, term5511.getClass(), "sourcePosition", 0);
        setField(term5511, term5511.getClass(), "jsType", null);
        setField(term5511, term5511.getClass(), "parent", null);
        setField(term5510, term5510.getClass(), "first", term5511);
        setField(term5510, term5510.getClass(), "last", null);
        setField(term5510, term5510.getClass(), "propListHead", null);
        setIntField(term5510, term5510.getClass(), "sourcePosition", 0);
        setField(term5510, term5510.getClass(), "jsType", null);
        setField(term5510, term5510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term4846;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term4776, args);
        assertTrue(recursiveEquals(term4776, term5509));
        assertTrue(recursiveEquals(term4846, term5510));
    }

};


