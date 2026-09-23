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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4949;
     Object term5019;
     Object term5469;
     Object term5470;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4949 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term5019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5115 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5115, term5115.getClass(), "type", -30);
        setField(term5115, term5115.getClass(), "next", null);
        setField(term5019, term5019.getClass(), "propListHead", term5115);
        setField(term5019, term5019.getClass(), "parent", term5185);
        term5469 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term5469, term5469.getClass(), "compiler", null);
        setField(term5469, term5469.getClass(), "level", null);
        setField(term5469, term5469.getClass(), "assignLhsChild", null);
        term5470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5471 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5470, term5470.getClass(), "type", 0);
        setField(term5470, term5470.getClass(), "next", null);
        setField(term5470, term5470.getClass(), "first", null);
        setField(term5470, term5470.getClass(), "last", null);
        setField(term5471, term5471.getClass(), "next", null);
        setIntField(term5471, term5471.getClass(), "type", -30);
        setIntField(term5471, term5471.getClass(), "intValue", 0);
        setField(term5471, term5471.getClass(), "objectValue", null);
        setField(term5470, term5470.getClass(), "propListHead", term5471);
        setIntField(term5470, term5470.getClass(), "sourcePosition", 0);
        setField(term5470, term5470.getClass(), "jsType", null);
        setIntField(term5472, term5472.getClass(), "type", 0);
        setField(term5472, term5472.getClass(), "next", null);
        setField(term5472, term5472.getClass(), "first", null);
        setField(term5472, term5472.getClass(), "last", null);
        setField(term5472, term5472.getClass(), "propListHead", null);
        setIntField(term5472, term5472.getClass(), "sourcePosition", 0);
        setField(term5472, term5472.getClass(), "jsType", null);
        setField(term5472, term5472.getClass(), "parent", null);
        setField(term5470, term5470.getClass(), "parent", term5472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5019;
        Object retValue = callMethod(klass, "getFunctionJsDocInfo", argTypes, term4949, args);
        assertTrue(recursiveEquals(term4949, term5469));
        assertTrue(recursiveEquals(term5019, term5470));
        assertTrue(recursiveEquals(retValue, null));
    }

};


