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

public class NodeUtil_newHasLocalResult_548645321181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;

    public NodeUtil_newHasLocalResult_548645321181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term725, term725.getClass(), "type", 1166710220);
        setIntField(term727, term727.getClass(), "type", 1768204942);
        setIntField(term729, term729.getClass(), "type", 0);
        setField(term729, term729.getClass(), "next", null);
        setField(term729, term729.getClass(), "first", null);
        setField(term729, term729.getClass(), "last", null);
        setField(term729, term729.getClass(), "propListHead", null);
        setIntField(term729, term729.getClass(), "sourcePosition", 0);
        setField(term729, term729.getClass(), "jsType", null);
        setField(term729, term729.getClass(), "parent", null);
        setField(term727, term727.getClass(), "next", term729);
        setIntField(term732, term732.getClass(), "type", 0);
        setField(term732, term732.getClass(), "next", null);
        setField(term732, term732.getClass(), "first", null);
        setField(term732, term732.getClass(), "last", null);
        setField(term732, term732.getClass(), "propListHead", null);
        setIntField(term732, term732.getClass(), "sourcePosition", 0);
        setField(term732, term732.getClass(), "jsType", null);
        setField(term732, term732.getClass(), "parent", null);
        setField(term727, term727.getClass(), "first", term732);
        setIntField(term735, term735.getClass(), "type", 0);
        setField(term735, term735.getClass(), "next", null);
        setField(term735, term735.getClass(), "first", null);
        setField(term735, term735.getClass(), "last", null);
        setField(term735, term735.getClass(), "propListHead", null);
        setIntField(term735, term735.getClass(), "sourcePosition", 0);
        setField(term735, term735.getClass(), "jsType", null);
        setField(term735, term735.getClass(), "parent", null);
        setField(term727, term727.getClass(), "last", term735);
        setField(term738, term738.getClass(), "next", null);
        setIntField(term738, term738.getClass(), "type", 0);
        setIntField(term738, term738.getClass(), "intValue", 0);
        setField(term738, term738.getClass(), "objectValue", null);
        setField(term727, term727.getClass(), "propListHead", term738);
        setIntField(term727, term727.getClass(), "sourcePosition", -310528004);
        setField(term727, term727.getClass(), "jsType", null);
        setField(term727, term727.getClass(), "parent", null);
        setField(term725, term725.getClass(), "next", term727);
        setIntField(term742, term742.getClass(), "type", 0);
        setField(term742, term742.getClass(), "next", null);
        setField(term742, term742.getClass(), "first", null);
        setField(term742, term742.getClass(), "last", null);
        setField(term742, term742.getClass(), "propListHead", null);
        setIntField(term742, term742.getClass(), "sourcePosition", 0);
        setField(term742, term742.getClass(), "jsType", null);
        setField(term742, term742.getClass(), "parent", null);
        setField(term725, term725.getClass(), "first", term742);
        setIntField(term745, term745.getClass(), "type", 0);
        setField(term745, term745.getClass(), "next", null);
        setField(term745, term745.getClass(), "first", null);
        setField(term745, term745.getClass(), "last", null);
        setField(term745, term745.getClass(), "propListHead", null);
        setIntField(term745, term745.getClass(), "sourcePosition", 0);
        setField(term745, term745.getClass(), "jsType", null);
        setField(term745, term745.getClass(), "parent", null);
        setField(term725, term725.getClass(), "last", term745);
        setField(term748, term748.getClass(), "next", null);
        setIntField(term748, term748.getClass(), "type", 0);
        setIntField(term748, term748.getClass(), "intValue", 0);
        setField(term748, term748.getClass(), "objectValue", null);
        setField(term725, term725.getClass(), "propListHead", term748);
        setIntField(term725, term725.getClass(), "sourcePosition", -634976996);
        setField(term725, term725.getClass(), "jsType", null);
        setField(term725, term725.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term725;
        try {
            callMethod(klass, "newHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


