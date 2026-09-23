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

public class TypeCheck_visit_859524784179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86661;
     Object term86731;
     Object term87354;
     Object term87355;

    public TypeCheck_visit_859524784179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86661 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term86731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86731, term86731.getClass(), "type", 114);
        term87354 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term87354, term87354.getClass(), "compiler", null);
        setField(term87354, term87354.getClass(), "validator", null);
        setField(term87354, term87354.getClass(), "reverseInterpreter", null);
        setField(term87354, term87354.getClass(), "typeRegistry", null);
        setField(term87354, term87354.getClass(), "topScope", null);
        setField(term87354, term87354.getClass(), "scopeCreator", null);
        setField(term87354, term87354.getClass(), "reportMissingOverride", null);
        setField(term87354, term87354.getClass(), "reportUnknownTypes", null);
        setBooleanField(term87354, term87354.getClass(), "reportMissingProperties", false);
        setField(term87354, term87354.getClass(), "inferJSDocInfo", null);
        setIntField(term87354, term87354.getClass(), "typedCount", 0);
        setIntField(term87354, term87354.getClass(), "nullCount", 0);
        setIntField(term87354, term87354.getClass(), "unknownCount", 0);
        setBooleanField(term87354, term87354.getClass(), "inExterns", false);
        setIntField(term87354, term87354.getClass(), "noTypeCheckSection", 0);
        term87355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87355, term87355.getClass(), "type", 114);
        setField(term87355, term87355.getClass(), "next", null);
        setField(term87355, term87355.getClass(), "first", null);
        setField(term87355, term87355.getClass(), "last", null);
        setField(term87355, term87355.getClass(), "propListHead", null);
        setIntField(term87355, term87355.getClass(), "sourcePosition", 0);
        setField(term87355, term87355.getClass(), "jsType", null);
        setField(term87355, term87355.getClass(), "parent", null);
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
        args[1] = term86731;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term86661, args);
        assertTrue(recursiveEquals(term86661, term87354));
        assertTrue(recursiveEquals(term86731, null));
    }

};


