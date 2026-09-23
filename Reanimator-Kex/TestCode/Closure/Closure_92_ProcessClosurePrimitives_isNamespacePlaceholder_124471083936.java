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

public class ProcessClosurePrimitives_isNamespacePlaceholder_124471083936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6786;
     Object term21164;

    public ProcessClosurePrimitives_isNamespacePlaceholder_124471083936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6799 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6809 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6786, term6786.getClass(), "type", 291864719);
        setIntField(term6788, term6788.getClass(), "type", 723812297);
        setIntField(term6790, term6790.getClass(), "type", 0);
        setField(term6790, term6790.getClass(), "next", null);
        setField(term6790, term6790.getClass(), "first", null);
        setField(term6790, term6790.getClass(), "last", null);
        setField(term6790, term6790.getClass(), "propListHead", null);
        setIntField(term6790, term6790.getClass(), "sourcePosition", 0);
        setField(term6790, term6790.getClass(), "jsType", null);
        setField(term6790, term6790.getClass(), "parent", null);
        setField(term6788, term6788.getClass(), "next", term6790);
        setIntField(term6793, term6793.getClass(), "type", 0);
        setField(term6793, term6793.getClass(), "next", null);
        setField(term6793, term6793.getClass(), "first", null);
        setField(term6793, term6793.getClass(), "last", null);
        setField(term6793, term6793.getClass(), "propListHead", null);
        setIntField(term6793, term6793.getClass(), "sourcePosition", 0);
        setField(term6793, term6793.getClass(), "jsType", null);
        setField(term6793, term6793.getClass(), "parent", null);
        setField(term6788, term6788.getClass(), "first", term6793);
        setIntField(term6796, term6796.getClass(), "type", 0);
        setField(term6796, term6796.getClass(), "next", null);
        setField(term6796, term6796.getClass(), "first", null);
        setField(term6796, term6796.getClass(), "last", null);
        setField(term6796, term6796.getClass(), "propListHead", null);
        setIntField(term6796, term6796.getClass(), "sourcePosition", 0);
        setField(term6796, term6796.getClass(), "jsType", null);
        setField(term6796, term6796.getClass(), "parent", null);
        setField(term6788, term6788.getClass(), "last", term6796);
        setField(term6799, term6799.getClass(), "next", null);
        setIntField(term6799, term6799.getClass(), "type", 0);
        setIntField(term6799, term6799.getClass(), "intValue", 0);
        setField(term6799, term6799.getClass(), "objectValue", null);
        setField(term6788, term6788.getClass(), "propListHead", term6799);
        setIntField(term6788, term6788.getClass(), "sourcePosition", -975748721);
        setField(term6788, term6788.getClass(), "jsType", null);
        setField(term6788, term6788.getClass(), "parent", null);
        setField(term6786, term6786.getClass(), "next", term6788);
        setIntField(term6803, term6803.getClass(), "type", 0);
        setField(term6803, term6803.getClass(), "next", null);
        setField(term6803, term6803.getClass(), "first", null);
        setField(term6803, term6803.getClass(), "last", null);
        setField(term6803, term6803.getClass(), "propListHead", null);
        setIntField(term6803, term6803.getClass(), "sourcePosition", 0);
        setField(term6803, term6803.getClass(), "jsType", null);
        setField(term6803, term6803.getClass(), "parent", null);
        setField(term6786, term6786.getClass(), "first", term6803);
        setIntField(term6806, term6806.getClass(), "type", 0);
        setField(term6806, term6806.getClass(), "next", null);
        setField(term6806, term6806.getClass(), "first", null);
        setField(term6806, term6806.getClass(), "last", null);
        setField(term6806, term6806.getClass(), "propListHead", null);
        setIntField(term6806, term6806.getClass(), "sourcePosition", 0);
        setField(term6806, term6806.getClass(), "jsType", null);
        setField(term6806, term6806.getClass(), "parent", null);
        setField(term6786, term6786.getClass(), "last", term6806);
        setField(term6809, term6809.getClass(), "next", null);
        setIntField(term6809, term6809.getClass(), "type", 0);
        setIntField(term6809, term6809.getClass(), "intValue", 0);
        setField(term6809, term6809.getClass(), "objectValue", null);
        setField(term6786, term6786.getClass(), "propListHead", term6809);
        setIntField(term6786, term6786.getClass(), "sourcePosition", 433248783);
        setField(term6786, term6786.getClass(), "jsType", null);
        setField(term6786, term6786.getClass(), "parent", null);
        term21164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21169 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term21164, term21164.getClass(), "type", 291864719);
        setIntField(term21165, term21165.getClass(), "type", 723812297);
        setIntField(term21166, term21166.getClass(), "type", 0);
        setField(term21166, term21166.getClass(), "next", null);
        setField(term21166, term21166.getClass(), "first", null);
        setField(term21166, term21166.getClass(), "last", null);
        setField(term21166, term21166.getClass(), "propListHead", null);
        setIntField(term21166, term21166.getClass(), "sourcePosition", 0);
        setField(term21166, term21166.getClass(), "jsType", null);
        setField(term21166, term21166.getClass(), "parent", null);
        setField(term21165, term21165.getClass(), "next", term21166);
        setIntField(term21167, term21167.getClass(), "type", 0);
        setField(term21167, term21167.getClass(), "next", null);
        setField(term21167, term21167.getClass(), "first", null);
        setField(term21167, term21167.getClass(), "last", null);
        setField(term21167, term21167.getClass(), "propListHead", null);
        setIntField(term21167, term21167.getClass(), "sourcePosition", 0);
        setField(term21167, term21167.getClass(), "jsType", null);
        setField(term21167, term21167.getClass(), "parent", null);
        setField(term21165, term21165.getClass(), "first", term21167);
        setIntField(term21168, term21168.getClass(), "type", 0);
        setField(term21168, term21168.getClass(), "next", null);
        setField(term21168, term21168.getClass(), "first", null);
        setField(term21168, term21168.getClass(), "last", null);
        setField(term21168, term21168.getClass(), "propListHead", null);
        setIntField(term21168, term21168.getClass(), "sourcePosition", 0);
        setField(term21168, term21168.getClass(), "jsType", null);
        setField(term21168, term21168.getClass(), "parent", null);
        setField(term21165, term21165.getClass(), "last", term21168);
        setField(term21169, term21169.getClass(), "next", null);
        setIntField(term21169, term21169.getClass(), "type", 0);
        setIntField(term21169, term21169.getClass(), "intValue", 0);
        setField(term21169, term21169.getClass(), "objectValue", null);
        setField(term21165, term21165.getClass(), "propListHead", term21169);
        setIntField(term21165, term21165.getClass(), "sourcePosition", -975748721);
        setField(term21165, term21165.getClass(), "jsType", null);
        setField(term21165, term21165.getClass(), "parent", null);
        setField(term21164, term21164.getClass(), "next", term21165);
        setIntField(term21170, term21170.getClass(), "type", 0);
        setField(term21170, term21170.getClass(), "next", null);
        setField(term21170, term21170.getClass(), "first", null);
        setField(term21170, term21170.getClass(), "last", null);
        setField(term21170, term21170.getClass(), "propListHead", null);
        setIntField(term21170, term21170.getClass(), "sourcePosition", 0);
        setField(term21170, term21170.getClass(), "jsType", null);
        setField(term21170, term21170.getClass(), "parent", null);
        setField(term21164, term21164.getClass(), "first", term21170);
        setIntField(term21171, term21171.getClass(), "type", 0);
        setField(term21171, term21171.getClass(), "next", null);
        setField(term21171, term21171.getClass(), "first", null);
        setField(term21171, term21171.getClass(), "last", null);
        setField(term21171, term21171.getClass(), "propListHead", null);
        setIntField(term21171, term21171.getClass(), "sourcePosition", 0);
        setField(term21171, term21171.getClass(), "jsType", null);
        setField(term21171, term21171.getClass(), "parent", null);
        setField(term21164, term21164.getClass(), "last", term21171);
        setField(term21172, term21172.getClass(), "next", null);
        setIntField(term21172, term21172.getClass(), "type", 0);
        setIntField(term21172, term21172.getClass(), "intValue", 0);
        setField(term21172, term21172.getClass(), "objectValue", null);
        setField(term21164, term21164.getClass(), "propListHead", term21172);
        setIntField(term21164, term21164.getClass(), "sourcePosition", 433248783);
        setField(term21164, term21164.getClass(), "jsType", null);
        setField(term21164, term21164.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6786;
        Object retValue = callMethod(klass, "isNamespacePlaceholder", argTypes, null, args);
        assertTrue(recursiveEquals(term6786, term21164));
        assertTrue(recursiveEquals(retValue, false));
    }

};


