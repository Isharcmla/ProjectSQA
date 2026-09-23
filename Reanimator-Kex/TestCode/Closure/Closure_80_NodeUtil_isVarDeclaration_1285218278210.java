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

public class NodeUtil_isVarDeclaration_1285218278210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;
     Object term11785;

    public NodeUtil_isVarDeclaration_1285218278210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1473 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1483 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1460, term1460.getClass(), "type", -706253892);
        setIntField(term1462, term1462.getClass(), "type", -1244386281);
        setIntField(term1464, term1464.getClass(), "type", 0);
        setField(term1464, term1464.getClass(), "next", null);
        setField(term1464, term1464.getClass(), "first", null);
        setField(term1464, term1464.getClass(), "last", null);
        setField(term1464, term1464.getClass(), "propListHead", null);
        setIntField(term1464, term1464.getClass(), "sourcePosition", 0);
        setField(term1464, term1464.getClass(), "jsType", null);
        setField(term1464, term1464.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "next", term1464);
        setIntField(term1467, term1467.getClass(), "type", 0);
        setField(term1467, term1467.getClass(), "next", null);
        setField(term1467, term1467.getClass(), "first", null);
        setField(term1467, term1467.getClass(), "last", null);
        setField(term1467, term1467.getClass(), "propListHead", null);
        setIntField(term1467, term1467.getClass(), "sourcePosition", 0);
        setField(term1467, term1467.getClass(), "jsType", null);
        setField(term1467, term1467.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "first", term1467);
        setIntField(term1470, term1470.getClass(), "type", 0);
        setField(term1470, term1470.getClass(), "next", null);
        setField(term1470, term1470.getClass(), "first", null);
        setField(term1470, term1470.getClass(), "last", null);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "last", term1470);
        setField(term1473, term1473.getClass(), "next", null);
        setIntField(term1473, term1473.getClass(), "type", 0);
        setIntField(term1473, term1473.getClass(), "intValue", 0);
        setField(term1473, term1473.getClass(), "objectValue", null);
        setField(term1462, term1462.getClass(), "propListHead", term1473);
        setIntField(term1462, term1462.getClass(), "sourcePosition", -1551355284);
        setField(term1462, term1462.getClass(), "jsType", null);
        setField(term1462, term1462.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "next", term1462);
        setIntField(term1477, term1477.getClass(), "type", 0);
        setField(term1477, term1477.getClass(), "next", null);
        setField(term1477, term1477.getClass(), "first", null);
        setField(term1477, term1477.getClass(), "last", null);
        setField(term1477, term1477.getClass(), "propListHead", null);
        setIntField(term1477, term1477.getClass(), "sourcePosition", 0);
        setField(term1477, term1477.getClass(), "jsType", null);
        setField(term1477, term1477.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "first", term1477);
        setIntField(term1480, term1480.getClass(), "type", 0);
        setField(term1480, term1480.getClass(), "next", null);
        setField(term1480, term1480.getClass(), "first", null);
        setField(term1480, term1480.getClass(), "last", null);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "last", term1480);
        setField(term1483, term1483.getClass(), "next", null);
        setIntField(term1483, term1483.getClass(), "type", 0);
        setIntField(term1483, term1483.getClass(), "intValue", 0);
        setField(term1483, term1483.getClass(), "objectValue", null);
        setField(term1460, term1460.getClass(), "propListHead", term1483);
        setIntField(term1460, term1460.getClass(), "sourcePosition", -1381970335);
        setField(term1460, term1460.getClass(), "jsType", null);
        setField(term1460, term1460.getClass(), "parent", null);
        term11785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11790 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11793 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11785, term11785.getClass(), "type", -706253892);
        setIntField(term11786, term11786.getClass(), "type", -1244386281);
        setIntField(term11787, term11787.getClass(), "type", 0);
        setField(term11787, term11787.getClass(), "next", null);
        setField(term11787, term11787.getClass(), "first", null);
        setField(term11787, term11787.getClass(), "last", null);
        setField(term11787, term11787.getClass(), "propListHead", null);
        setIntField(term11787, term11787.getClass(), "sourcePosition", 0);
        setField(term11787, term11787.getClass(), "jsType", null);
        setField(term11787, term11787.getClass(), "parent", null);
        setField(term11786, term11786.getClass(), "next", term11787);
        setIntField(term11788, term11788.getClass(), "type", 0);
        setField(term11788, term11788.getClass(), "next", null);
        setField(term11788, term11788.getClass(), "first", null);
        setField(term11788, term11788.getClass(), "last", null);
        setField(term11788, term11788.getClass(), "propListHead", null);
        setIntField(term11788, term11788.getClass(), "sourcePosition", 0);
        setField(term11788, term11788.getClass(), "jsType", null);
        setField(term11788, term11788.getClass(), "parent", null);
        setField(term11786, term11786.getClass(), "first", term11788);
        setIntField(term11789, term11789.getClass(), "type", 0);
        setField(term11789, term11789.getClass(), "next", null);
        setField(term11789, term11789.getClass(), "first", null);
        setField(term11789, term11789.getClass(), "last", null);
        setField(term11789, term11789.getClass(), "propListHead", null);
        setIntField(term11789, term11789.getClass(), "sourcePosition", 0);
        setField(term11789, term11789.getClass(), "jsType", null);
        setField(term11789, term11789.getClass(), "parent", null);
        setField(term11786, term11786.getClass(), "last", term11789);
        setField(term11790, term11790.getClass(), "next", null);
        setIntField(term11790, term11790.getClass(), "type", 0);
        setIntField(term11790, term11790.getClass(), "intValue", 0);
        setField(term11790, term11790.getClass(), "objectValue", null);
        setField(term11786, term11786.getClass(), "propListHead", term11790);
        setIntField(term11786, term11786.getClass(), "sourcePosition", -1551355284);
        setField(term11786, term11786.getClass(), "jsType", null);
        setField(term11786, term11786.getClass(), "parent", null);
        setField(term11785, term11785.getClass(), "next", term11786);
        setIntField(term11791, term11791.getClass(), "type", 0);
        setField(term11791, term11791.getClass(), "next", null);
        setField(term11791, term11791.getClass(), "first", null);
        setField(term11791, term11791.getClass(), "last", null);
        setField(term11791, term11791.getClass(), "propListHead", null);
        setIntField(term11791, term11791.getClass(), "sourcePosition", 0);
        setField(term11791, term11791.getClass(), "jsType", null);
        setField(term11791, term11791.getClass(), "parent", null);
        setField(term11785, term11785.getClass(), "first", term11791);
        setIntField(term11792, term11792.getClass(), "type", 0);
        setField(term11792, term11792.getClass(), "next", null);
        setField(term11792, term11792.getClass(), "first", null);
        setField(term11792, term11792.getClass(), "last", null);
        setField(term11792, term11792.getClass(), "propListHead", null);
        setIntField(term11792, term11792.getClass(), "sourcePosition", 0);
        setField(term11792, term11792.getClass(), "jsType", null);
        setField(term11792, term11792.getClass(), "parent", null);
        setField(term11785, term11785.getClass(), "last", term11792);
        setField(term11793, term11793.getClass(), "next", null);
        setIntField(term11793, term11793.getClass(), "type", 0);
        setIntField(term11793, term11793.getClass(), "intValue", 0);
        setField(term11793, term11793.getClass(), "objectValue", null);
        setField(term11785, term11785.getClass(), "propListHead", term11793);
        setIntField(term11785, term11785.getClass(), "sourcePosition", -1381970335);
        setField(term11785, term11785.getClass(), "jsType", null);
        setField(term11785, term11785.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1460;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1460, term11785));
        assertTrue(recursiveEquals(retValue, false));
    }

};


