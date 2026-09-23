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

public class CodeGenerator_addNonEmptyStatement_42379450544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620;
     Object term621;
     Object enum9;
     Object term665;

    public CodeGenerator_addNonEmptyStatement_42379450544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term620, term620.getClass(), "cc", null);
        setField(term620, term620.getClass(), "outputCharsetEncoder", null);
        term621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term634 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term621, term621.getClass(), "type", 679763016);
        setIntField(term623, term623.getClass(), "type", -157887805);
        setIntField(term625, term625.getClass(), "type", 0);
        setField(term625, term625.getClass(), "next", null);
        setField(term625, term625.getClass(), "first", null);
        setField(term625, term625.getClass(), "last", null);
        setField(term625, term625.getClass(), "propListHead", null);
        setIntField(term625, term625.getClass(), "sourcePosition", 0);
        setField(term625, term625.getClass(), "jsType", null);
        setField(term625, term625.getClass(), "parent", null);
        setField(term623, term623.getClass(), "next", term625);
        setIntField(term628, term628.getClass(), "type", 0);
        setField(term628, term628.getClass(), "next", null);
        setField(term628, term628.getClass(), "first", null);
        setField(term628, term628.getClass(), "last", null);
        setField(term628, term628.getClass(), "propListHead", null);
        setIntField(term628, term628.getClass(), "sourcePosition", 0);
        setField(term628, term628.getClass(), "jsType", null);
        setField(term628, term628.getClass(), "parent", null);
        setField(term623, term623.getClass(), "first", term628);
        setIntField(term631, term631.getClass(), "type", 0);
        setField(term631, term631.getClass(), "next", null);
        setField(term631, term631.getClass(), "first", null);
        setField(term631, term631.getClass(), "last", null);
        setField(term631, term631.getClass(), "propListHead", null);
        setIntField(term631, term631.getClass(), "sourcePosition", 0);
        setField(term631, term631.getClass(), "jsType", null);
        setField(term631, term631.getClass(), "parent", null);
        setField(term623, term623.getClass(), "last", term631);
        setField(term634, term634.getClass(), "next", null);
        setIntField(term634, term634.getClass(), "type", 0);
        setIntField(term634, term634.getClass(), "intValue", 0);
        setField(term634, term634.getClass(), "objectValue", null);
        setField(term623, term623.getClass(), "propListHead", term634);
        setIntField(term623, term623.getClass(), "sourcePosition", -1016503459);
        setField(term623, term623.getClass(), "jsType", null);
        setField(term623, term623.getClass(), "parent", null);
        setField(term621, term621.getClass(), "next", term623);
        setIntField(term638, term638.getClass(), "type", 0);
        setField(term638, term638.getClass(), "next", null);
        setField(term638, term638.getClass(), "first", null);
        setField(term638, term638.getClass(), "last", null);
        setField(term638, term638.getClass(), "propListHead", null);
        setIntField(term638, term638.getClass(), "sourcePosition", 0);
        setField(term638, term638.getClass(), "jsType", null);
        setField(term638, term638.getClass(), "parent", null);
        setField(term621, term621.getClass(), "first", term638);
        setIntField(term641, term641.getClass(), "type", 0);
        setField(term641, term641.getClass(), "next", null);
        setField(term641, term641.getClass(), "first", null);
        setField(term641, term641.getClass(), "last", null);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term621, term621.getClass(), "last", term641);
        setField(term644, term644.getClass(), "next", null);
        setIntField(term644, term644.getClass(), "type", 0);
        setIntField(term644, term644.getClass(), "intValue", 0);
        setField(term644, term644.getClass(), "objectValue", null);
        setField(term621, term621.getClass(), "propListHead", term644);
        setIntField(term621, term621.getClass(), "sourcePosition", -1968847291);
        setField(term621, term621.getClass(), "jsType", null);
        setField(term621, term621.getClass(), "parent", null);
        Class<? extends Object> term5440 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5439 = ((Class) term5440).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5439).setAccessible(true);
        enum9 = ((Field) term5439).get((Object) null);
        term665 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term621;
        args[1] = enum9;
        args[2] = term665;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term620, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


