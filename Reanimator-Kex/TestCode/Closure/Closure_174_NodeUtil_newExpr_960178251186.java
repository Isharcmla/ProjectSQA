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

public class NodeUtil_newExpr_960178251186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;

    public NodeUtil_newExpr_960178251186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term484, term484.getClass(), "type", -1498296052);
        setIntField(term486, term486.getClass(), "type", 2098647989);
        setIntField(term488, term488.getClass(), "type", 1598895173);
        setIntField(term490, term490.getClass(), "type", 1830648570);
        setIntField(term492, term492.getClass(), "type", -227365013);
        setField(term492, term492.getClass(), "next", null);
        setField(term492, term492.getClass(), "first", null);
        setField(term492, term492.getClass(), "last", null);
        setField(term492, term492.getClass(), "propListHead", null);
        setIntField(term492, term492.getClass(), "sourcePosition", 0);
        setField(term492, term492.getClass(), "jsType", null);
        setField(term492, term492.getClass(), "parent", null);
        setField(term490, term490.getClass(), "next", term492);
        setIntField(term495, term495.getClass(), "type", 11724947);
        setField(term495, term495.getClass(), "next", null);
        setField(term495, term495.getClass(), "first", null);
        setField(term495, term495.getClass(), "last", term492);
        setField(term495, term495.getClass(), "propListHead", null);
        setIntField(term495, term495.getClass(), "sourcePosition", 0);
        setField(term495, term495.getClass(), "jsType", null);
        setField(term495, term495.getClass(), "parent", null);
        setField(term490, term490.getClass(), "first", term495);
        setField(term490, term490.getClass(), "last", term488);
        setField(term490, term490.getClass(), "propListHead", null);
        setIntField(term490, term490.getClass(), "sourcePosition", 0);
        setField(term490, term490.getClass(), "jsType", null);
        setField(term490, term490.getClass(), "parent", null);
        setField(term488, term488.getClass(), "next", term490);
        setField(term488, term488.getClass(), "first", term492);
        setIntField(term499, term499.getClass(), "type", 1283079251);
        setIntField(term501, term501.getClass(), "type", -523949691);
        setField(term501, term501.getClass(), "next", null);
        setField(term501, term501.getClass(), "first", term495);
        setField(term501, term501.getClass(), "last", term490);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term499, term499.getClass(), "next", term501);
        setField(term499, term499.getClass(), "first", term486);
        setField(term499, term499.getClass(), "last", term486);
        setField(term499, term499.getClass(), "propListHead", null);
        setIntField(term499, term499.getClass(), "sourcePosition", 0);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
        setField(term488, term488.getClass(), "last", term499);
        setField(term488, term488.getClass(), "propListHead", null);
        setIntField(term488, term488.getClass(), "sourcePosition", 0);
        setField(term488, term488.getClass(), "jsType", null);
        setField(term488, term488.getClass(), "parent", null);
        setField(term486, term486.getClass(), "next", term488);
        setIntField(term506, term506.getClass(), "type", 1398204340);
        setField(term506, term506.getClass(), "next", term499);
        setField(term506, term506.getClass(), "first", term501);
        setField(term506, term506.getClass(), "last", term484);
        setField(term506, term506.getClass(), "propListHead", null);
        setIntField(term506, term506.getClass(), "sourcePosition", 0);
        setField(term506, term506.getClass(), "jsType", null);
        setField(term506, term506.getClass(), "parent", null);
        setField(term486, term486.getClass(), "first", term506);
        setField(term486, term486.getClass(), "last", term506);
        setField(term486, term486.getClass(), "propListHead", null);
        setIntField(term486, term486.getClass(), "sourcePosition", 0);
        setField(term486, term486.getClass(), "jsType", null);
        setField(term486, term486.getClass(), "parent", null);
        setField(term484, term484.getClass(), "next", term486);
        setField(term484, term484.getClass(), "first", term490);
        setField(term484, term484.getClass(), "last", term492);
        setField(term484, term484.getClass(), "propListHead", null);
        setIntField(term484, term484.getClass(), "sourcePosition", 0);
        setField(term484, term484.getClass(), "jsType", null);
        setField(term484, term484.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term484;
        try {
            callMethod(klass, "newExpr", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


