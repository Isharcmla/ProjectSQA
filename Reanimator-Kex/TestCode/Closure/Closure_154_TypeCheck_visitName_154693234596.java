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

public class TypeCheck_visitName_154693234596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27410;
     Object term27611;
     Object term27859;
     Object term27860;
     Object term27862;

    public TypeCheck_visitName_154693234596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27410 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term27611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term27611, term27611.getClass(), "type", 0);
        setField(term27611, term27611.getClass(), "jsType", term27659);
        term27859 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term27859, term27859.getClass(), "compiler", null);
        setField(term27859, term27859.getClass(), "validator", null);
        setField(term27859, term27859.getClass(), "reverseInterpreter", null);
        setField(term27859, term27859.getClass(), "typeRegistry", null);
        setField(term27859, term27859.getClass(), "topScope", null);
        setField(term27859, term27859.getClass(), "scopeCreator", null);
        setField(term27859, term27859.getClass(), "reportMissingOverride", null);
        setField(term27859, term27859.getClass(), "reportUnknownTypes", null);
        setBooleanField(term27859, term27859.getClass(), "reportMissingProperties", false);
        setField(term27859, term27859.getClass(), "inferJSDocInfo", null);
        setIntField(term27859, term27859.getClass(), "typedCount", 0);
        setIntField(term27859, term27859.getClass(), "nullCount", 0);
        setIntField(term27859, term27859.getClass(), "unknownCount", 0);
        setBooleanField(term27859, term27859.getClass(), "inExterns", false);
        setIntField(term27859, term27859.getClass(), "noTypeCheckSection", 0);
        term27860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term27860, term27860.getClass(), "type", 0);
        setField(term27860, term27860.getClass(), "next", null);
        setField(term27860, term27860.getClass(), "first", null);
        setField(term27860, term27860.getClass(), "last", null);
        setField(term27860, term27860.getClass(), "propListHead", null);
        setIntField(term27860, term27860.getClass(), "sourcePosition", 0);
        setBooleanField(term27861, term27861.getClass(), "resolved", false);
        setField(term27861, term27861.getClass(), "resolveResult", null);
        setField(term27861, term27861.getClass(), "registry", null);
        setField(term27860, term27860.getClass(), "jsType", term27861);
        setField(term27860, term27860.getClass(), "parent", null);
        term27862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term27862, term27862.getClass(), "type", 0);
        setField(term27862, term27862.getClass(), "next", null);
        setField(term27862, term27862.getClass(), "first", null);
        setField(term27862, term27862.getClass(), "last", null);
        setField(term27862, term27862.getClass(), "propListHead", null);
        setIntField(term27862, term27862.getClass(), "sourcePosition", 0);
        setBooleanField(term27863, term27863.getClass(), "resolved", false);
        setField(term27863, term27863.getClass(), "resolveResult", null);
        setField(term27863, term27863.getClass(), "registry", null);
        setField(term27862, term27862.getClass(), "jsType", term27863);
        setField(term27862, term27862.getClass(), "parent", null);
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
        args[1] = term27611;
        args[2] = term27611;
        Object retValue = callMethod(klass, "visitName", argTypes, term27410, args);
        assertTrue(recursiveEquals(term27410, term27859));
        assertTrue(recursiveEquals(term27611, term27862));
        assertTrue(recursiveEquals(term27611, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


