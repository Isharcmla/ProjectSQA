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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5102;
     Object term5172;
     Object term5620;
     Object term5621;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5102 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5268 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5268, term5268.getClass(), "type", -30);
        setField(term5268, term5268.getClass(), "next", null);
        setField(term5172, term5172.getClass(), "propListHead", term5268);
        setField(term5172, term5172.getClass(), "parent", term5338);
        term5620 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term5620, term5620.getClass(), "compiler", null);
        setField(term5620, term5620.getClass(), "level", null);
        setField(term5620, term5620.getClass(), "assignLhsChild", null);
        term5621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5621, term5621.getClass(), "type", 0);
        setField(term5621, term5621.getClass(), "next", null);
        setField(term5621, term5621.getClass(), "first", null);
        setField(term5621, term5621.getClass(), "last", null);
        setField(term5622, term5622.getClass(), "next", null);
        setIntField(term5622, term5622.getClass(), "type", -30);
        setIntField(term5622, term5622.getClass(), "intValue", 0);
        setField(term5622, term5622.getClass(), "objectValue", null);
        setField(term5621, term5621.getClass(), "propListHead", term5622);
        setIntField(term5621, term5621.getClass(), "sourcePosition", 0);
        setField(term5621, term5621.getClass(), "jsType", null);
        setIntField(term5623, term5623.getClass(), "type", 0);
        setField(term5623, term5623.getClass(), "next", null);
        setField(term5623, term5623.getClass(), "first", null);
        setField(term5623, term5623.getClass(), "last", null);
        setField(term5623, term5623.getClass(), "propListHead", null);
        setIntField(term5623, term5623.getClass(), "sourcePosition", 0);
        setField(term5623, term5623.getClass(), "jsType", null);
        setField(term5623, term5623.getClass(), "parent", null);
        setField(term5621, term5621.getClass(), "parent", term5623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5172;
        Object retValue = callMethod(klass, "getFunctionJsDocInfo", argTypes, term5102, args);
        assertTrue(recursiveEquals(term5102, term5620));
        assertTrue(recursiveEquals(term5172, term5621));
        assertTrue(recursiveEquals(retValue, null));
    }

};


