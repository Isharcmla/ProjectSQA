package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_getLeastSupertype_170245581720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;

    public ArrowType_getLeastSupertype_170245581720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term364, term364.getClass(), "type", 1063420942);
        setIntField(term366, term366.getClass(), "type", 1375330971);
        setIntField(term368, term368.getClass(), "type", -478195677);
        setIntField(term370, term370.getClass(), "type", 972867650);
        setField(term370, term370.getClass(), "next", null);
        setField(term370, term370.getClass(), "first", null);
        setField(term370, term370.getClass(), "last", null);
        setField(term370, term370.getClass(), "propListHead", null);
        setIntField(term370, term370.getClass(), "sourcePosition", 0);
        setField(term370, term370.getClass(), "jsType", null);
        setField(term370, term370.getClass(), "parent", null);
        setField(term368, term368.getClass(), "next", term370);
        setIntField(term373, term373.getClass(), "type", -1465035361);
        setField(term373, term373.getClass(), "next", null);
        setField(term373, term373.getClass(), "first", term364);
        setField(term373, term373.getClass(), "last", null);
        setField(term373, term373.getClass(), "propListHead", null);
        setIntField(term373, term373.getClass(), "sourcePosition", 0);
        setField(term373, term373.getClass(), "jsType", null);
        setField(term373, term373.getClass(), "parent", null);
        setField(term368, term368.getClass(), "first", term373);
        setIntField(term376, term376.getClass(), "type", -481533957);
        setField(term376, term376.getClass(), "next", null);
        setField(term376, term376.getClass(), "first", term366);
        setField(term376, term376.getClass(), "last", null);
        setField(term376, term376.getClass(), "propListHead", null);
        setIntField(term376, term376.getClass(), "sourcePosition", 0);
        setField(term376, term376.getClass(), "jsType", null);
        setField(term376, term376.getClass(), "parent", null);
        setField(term368, term368.getClass(), "last", term376);
        setField(term368, term368.getClass(), "propListHead", null);
        setIntField(term368, term368.getClass(), "sourcePosition", 0);
        setField(term368, term368.getClass(), "jsType", null);
        setField(term368, term368.getClass(), "parent", null);
        setField(term366, term366.getClass(), "next", term368);
        setField(term366, term366.getClass(), "first", term368);
        setIntField(term380, term380.getClass(), "type", 1655935355);
        setField(term380, term380.getClass(), "next", term376);
        setField(term380, term380.getClass(), "first", term373);
        setField(term380, term380.getClass(), "last", term373);
        setField(term380, term380.getClass(), "propListHead", null);
        setIntField(term380, term380.getClass(), "sourcePosition", 0);
        setField(term380, term380.getClass(), "jsType", null);
        setField(term380, term380.getClass(), "parent", null);
        setField(term366, term366.getClass(), "last", term380);
        setField(term366, term366.getClass(), "propListHead", null);
        setIntField(term366, term366.getClass(), "sourcePosition", 0);
        setField(term366, term366.getClass(), "jsType", null);
        setField(term366, term366.getClass(), "parent", null);
        setField(term364, term364.getClass(), "next", term366);
        setField(term364, term364.getClass(), "first", term373);
        setIntField(term384, term384.getClass(), "type", 0);
        setField(term384, term384.getClass(), "next", null);
        setField(term384, term384.getClass(), "first", null);
        setField(term384, term384.getClass(), "last", null);
        setField(term384, term384.getClass(), "propListHead", null);
        setIntField(term384, term384.getClass(), "sourcePosition", 0);
        setField(term384, term384.getClass(), "jsType", null);
        setField(term384, term384.getClass(), "parent", null);
        setField(term364, term364.getClass(), "last", term384);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term363, term363.getClass(), "parameters", term364);
        setField(term363, term363.getClass(), "returnType", null);
        setBooleanField(term363, term363.getClass(), "returnTypeInferred", false);
        setBooleanField(term363, term363.getClass(), "resolved", false);
        setField(term363, term363.getClass(), "resolveResult", null);
        setField(term363, term363.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term363, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


