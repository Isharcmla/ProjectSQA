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

public class TypeCheck_visit_859524784631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169817;
     Object term169909;
     Object term170091;
     Object term170722;
     Object term170723;
     Object term170725;

    public TypeCheck_visit_859524784631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169817 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term169909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term169909, term169909.getClass(), "type", 38);
        setField(term169909, term169909.getClass(), "jsType", term169999);
        term170091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term170091, term170091.getClass(), "type", 38);
        term170722 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term170722, term170722.getClass(), "compiler", null);
        setField(term170722, term170722.getClass(), "validator", null);
        setField(term170722, term170722.getClass(), "reverseInterpreter", null);
        setField(term170722, term170722.getClass(), "typeRegistry", null);
        setField(term170722, term170722.getClass(), "topScope", null);
        setField(term170722, term170722.getClass(), "scopeCreator", null);
        setField(term170722, term170722.getClass(), "reportMissingOverride", null);
        setBooleanField(term170722, term170722.getClass(), "reportUnknownTypes", false);
        setBooleanField(term170722, term170722.getClass(), "reportMissingProperties", false);
        setField(term170722, term170722.getClass(), "inferJSDocInfo", null);
        setIntField(term170722, term170722.getClass(), "typedCount", 1);
        setIntField(term170722, term170722.getClass(), "nullCount", 0);
        setIntField(term170722, term170722.getClass(), "unknownCount", 0);
        setBooleanField(term170722, term170722.getClass(), "inExterns", false);
        setIntField(term170722, term170722.getClass(), "noTypeCheckSection", 0);
        setField(term170722, term170722.getClass(), "editDistance", null);
        term170723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term170723, term170723.getClass(), "str", null);
        setIntField(term170723, term170723.getClass(), "type", 38);
        setField(term170723, term170723.getClass(), "next", null);
        setField(term170723, term170723.getClass(), "first", null);
        setField(term170723, term170723.getClass(), "last", null);
        setField(term170723, term170723.getClass(), "propListHead", null);
        setIntField(term170723, term170723.getClass(), "sourcePosition", 0);
        setBooleanField(term170724, term170724.getClass(), "resolved", false);
        setField(term170724, term170724.getClass(), "resolveResult", null);
        setField(term170724, term170724.getClass(), "templateTypeMap", null);
        setBooleanField(term170724, term170724.getClass(), "inTemplatedCheckVisit", false);
        setField(term170724, term170724.getClass(), "registry", null);
        setField(term170723, term170723.getClass(), "jsType", term170724);
        setField(term170723, term170723.getClass(), "parent", null);
        term170725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term170725, term170725.getClass(), "str", null);
        setIntField(term170725, term170725.getClass(), "type", 38);
        setField(term170725, term170725.getClass(), "next", null);
        setField(term170725, term170725.getClass(), "first", null);
        setField(term170725, term170725.getClass(), "last", null);
        setField(term170725, term170725.getClass(), "propListHead", null);
        setIntField(term170725, term170725.getClass(), "sourcePosition", 0);
        setField(term170725, term170725.getClass(), "jsType", null);
        setField(term170725, term170725.getClass(), "parent", null);
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
        args[1] = term169909;
        args[2] = term170091;
        callMethod(klass, "visit", argTypes, term169817, args);
        assertTrue(recursiveEquals(term169817, term170722));
        assertTrue(recursiveEquals(term169909, term170725));
        assertTrue(recursiveEquals(term170091, null));
    }

};


