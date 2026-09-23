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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_removeDuplicateDeclarations_17191129787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term85;

    public Normalize_removeDuplicateDeclarations_17191129787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term83, term83.getClass(), "compiler", null);
        setBooleanField(term83, term83.getClass(), "assertOnChange", false);
        term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term85, term85.getClass(), "type", 865208305);
        setIntField(term87, term87.getClass(), "type", -1179120542);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "next", term89);
        setIntField(term92, term92.getClass(), "type", 0);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term87, term87.getClass(), "first", term92);
        setIntField(term95, term95.getClass(), "type", 0);
        setField(term95, term95.getClass(), "next", null);
        setField(term95, term95.getClass(), "first", null);
        setField(term95, term95.getClass(), "last", null);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term87, term87.getClass(), "last", term95);
        setField(term98, term98.getClass(), "next", null);
        setIntField(term98, term98.getClass(), "type", 0);
        setIntField(term98, term98.getClass(), "intValue", 0);
        setField(term98, term98.getClass(), "objectValue", null);
        setField(term87, term87.getClass(), "propListHead", term98);
        setIntField(term87, term87.getClass(), "sourcePosition", 1193880199);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term85, term85.getClass(), "next", term87);
        setIntField(term102, term102.getClass(), "type", 0);
        setField(term102, term102.getClass(), "next", null);
        setField(term102, term102.getClass(), "first", null);
        setField(term102, term102.getClass(), "last", null);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term85, term85.getClass(), "first", term102);
        setIntField(term105, term105.getClass(), "type", 0);
        setField(term105, term105.getClass(), "next", null);
        setField(term105, term105.getClass(), "first", null);
        setField(term105, term105.getClass(), "last", null);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term85, term85.getClass(), "last", term105);
        setField(term108, term108.getClass(), "next", null);
        setIntField(term108, term108.getClass(), "type", 0);
        setIntField(term108, term108.getClass(), "intValue", 0);
        setField(term108, term108.getClass(), "objectValue", null);
        setField(term85, term85.getClass(), "propListHead", term108);
        setIntField(term85, term85.getClass(), "sourcePosition", -1087774327);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85;
        try {
            callMethod(klass, "removeDuplicateDeclarations", argTypes, term83, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


