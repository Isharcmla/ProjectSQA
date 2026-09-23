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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8055;
     Object term8125;
     Object term8577;
     Object term8578;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8055 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term8125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8221 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8221, term8221.getClass(), "type", -30);
        setField(term8221, term8221.getClass(), "next", null);
        setField(term8125, term8125.getClass(), "propListHead", term8221);
        setIntField(term8291, term8291.getClass(), "type", 86);
        setField(term8125, term8125.getClass(), "parent", term8291);
        term8577 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term8577, term8577.getClass(), "compiler", null);
        setField(term8577, term8577.getClass(), "level", null);
        setField(term8577, term8577.getClass(), "assignLhsChild", null);
        term8578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8579 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8578, term8578.getClass(), "type", 0);
        setField(term8578, term8578.getClass(), "next", null);
        setField(term8578, term8578.getClass(), "first", null);
        setField(term8578, term8578.getClass(), "last", null);
        setField(term8579, term8579.getClass(), "next", null);
        setIntField(term8579, term8579.getClass(), "type", -30);
        setIntField(term8579, term8579.getClass(), "intValue", 0);
        setField(term8579, term8579.getClass(), "objectValue", null);
        setField(term8578, term8578.getClass(), "propListHead", term8579);
        setIntField(term8578, term8578.getClass(), "sourcePosition", 0);
        setField(term8578, term8578.getClass(), "jsType", null);
        setIntField(term8580, term8580.getClass(), "type", 86);
        setField(term8580, term8580.getClass(), "next", null);
        setField(term8580, term8580.getClass(), "first", null);
        setField(term8580, term8580.getClass(), "last", null);
        setField(term8580, term8580.getClass(), "propListHead", null);
        setIntField(term8580, term8580.getClass(), "sourcePosition", 0);
        setField(term8580, term8580.getClass(), "jsType", null);
        setField(term8580, term8580.getClass(), "parent", null);
        setField(term8578, term8578.getClass(), "parent", term8580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8125;
        Object retValue = callMethod(klass, "getFunctionJsDocInfo", argTypes, term8055, args);
        assertTrue(recursiveEquals(term8055, term8577));
        assertTrue(recursiveEquals(term8125, term8578));
        assertTrue(recursiveEquals(retValue, null));
    }

};


