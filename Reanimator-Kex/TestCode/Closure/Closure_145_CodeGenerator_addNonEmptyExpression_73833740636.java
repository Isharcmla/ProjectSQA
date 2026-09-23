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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyExpression_73833740636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;
     Object term548;
     Object enum9;
     Object term592;

    public CodeGenerator_addNonEmptyExpression_73833740636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term547, term547.getClass(), "cc", null);
        setField(term547, term547.getClass(), "outputCharsetEncoder", null);
        term548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term561 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term571 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term548, term548.getClass(), "type", 865208305);
        setIntField(term550, term550.getClass(), "type", -1179120542);
        setIntField(term552, term552.getClass(), "type", 0);
        setField(term552, term552.getClass(), "next", null);
        setField(term552, term552.getClass(), "first", null);
        setField(term552, term552.getClass(), "last", null);
        setField(term552, term552.getClass(), "propListHead", null);
        setIntField(term552, term552.getClass(), "sourcePosition", 0);
        setField(term552, term552.getClass(), "jsType", null);
        setField(term552, term552.getClass(), "parent", null);
        setField(term550, term550.getClass(), "next", term552);
        setIntField(term555, term555.getClass(), "type", 0);
        setField(term555, term555.getClass(), "next", null);
        setField(term555, term555.getClass(), "first", null);
        setField(term555, term555.getClass(), "last", null);
        setField(term555, term555.getClass(), "propListHead", null);
        setIntField(term555, term555.getClass(), "sourcePosition", 0);
        setField(term555, term555.getClass(), "jsType", null);
        setField(term555, term555.getClass(), "parent", null);
        setField(term550, term550.getClass(), "first", term555);
        setIntField(term558, term558.getClass(), "type", 0);
        setField(term558, term558.getClass(), "next", null);
        setField(term558, term558.getClass(), "first", null);
        setField(term558, term558.getClass(), "last", null);
        setField(term558, term558.getClass(), "propListHead", null);
        setIntField(term558, term558.getClass(), "sourcePosition", 0);
        setField(term558, term558.getClass(), "jsType", null);
        setField(term558, term558.getClass(), "parent", null);
        setField(term550, term550.getClass(), "last", term558);
        setField(term561, term561.getClass(), "next", null);
        setIntField(term561, term561.getClass(), "type", 0);
        setIntField(term561, term561.getClass(), "intValue", 0);
        setField(term561, term561.getClass(), "objectValue", null);
        setField(term550, term550.getClass(), "propListHead", term561);
        setIntField(term550, term550.getClass(), "sourcePosition", 1193880199);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        setField(term548, term548.getClass(), "next", term550);
        setIntField(term565, term565.getClass(), "type", 0);
        setField(term565, term565.getClass(), "next", null);
        setField(term565, term565.getClass(), "first", null);
        setField(term565, term565.getClass(), "last", null);
        setField(term565, term565.getClass(), "propListHead", null);
        setIntField(term565, term565.getClass(), "sourcePosition", 0);
        setField(term565, term565.getClass(), "jsType", null);
        setField(term565, term565.getClass(), "parent", null);
        setField(term548, term548.getClass(), "first", term565);
        setIntField(term568, term568.getClass(), "type", 0);
        setField(term568, term568.getClass(), "next", null);
        setField(term568, term568.getClass(), "first", null);
        setField(term568, term568.getClass(), "last", null);
        setField(term568, term568.getClass(), "propListHead", null);
        setIntField(term568, term568.getClass(), "sourcePosition", 0);
        setField(term568, term568.getClass(), "jsType", null);
        setField(term568, term568.getClass(), "parent", null);
        setField(term548, term548.getClass(), "last", term568);
        setField(term571, term571.getClass(), "next", null);
        setIntField(term571, term571.getClass(), "type", 0);
        setIntField(term571, term571.getClass(), "intValue", 0);
        setField(term571, term571.getClass(), "objectValue", null);
        setField(term548, term548.getClass(), "propListHead", term571);
        setIntField(term548, term548.getClass(), "sourcePosition", -1087774327);
        setField(term548, term548.getClass(), "jsType", null);
        setField(term548, term548.getClass(), "parent", null);
        Class<? extends Object> term5043 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5042 = ((Class) term5043).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5042).setAccessible(true);
        enum9 = ((Field) term5042).get((Object) null);
        term592 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term548;
        args[1] = enum9;
        args[2] = term592;
        try {
            callMethod(klass, "addNonEmptyExpression", argTypes, term547, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


