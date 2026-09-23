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
import java.lang.Boolean;

public class FunctionToBlockMutator_makeLocalNamesUnique_153145884716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term133;
     Object term160;

    public FunctionToBlockMutator_makeLocalNamesUnique_153145884716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term132, term132.getClass(), "compiler", null);
        setField(term132, term132.getClass(), "safeNameIdSupplier", null);
        term133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term133, term133.getClass(), "type", 679763016);
        setIntField(term135, term135.getClass(), "type", -157887805);
        setIntField(term137, term137.getClass(), "type", 0);
        setField(term137, term137.getClass(), "next", null);
        setField(term137, term137.getClass(), "first", null);
        setField(term137, term137.getClass(), "last", null);
        setField(term137, term137.getClass(), "propListHead", null);
        setIntField(term137, term137.getClass(), "sourcePosition", 0);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term135, term135.getClass(), "next", term137);
        setIntField(term140, term140.getClass(), "type", 0);
        setField(term140, term140.getClass(), "next", null);
        setField(term140, term140.getClass(), "first", null);
        setField(term140, term140.getClass(), "last", null);
        setField(term140, term140.getClass(), "propListHead", null);
        setIntField(term140, term140.getClass(), "sourcePosition", 0);
        setField(term140, term140.getClass(), "jsType", null);
        setField(term140, term140.getClass(), "parent", null);
        setField(term135, term135.getClass(), "first", term140);
        setIntField(term143, term143.getClass(), "type", 0);
        setField(term143, term143.getClass(), "next", null);
        setField(term143, term143.getClass(), "first", null);
        setField(term143, term143.getClass(), "last", null);
        setField(term143, term143.getClass(), "propListHead", null);
        setIntField(term143, term143.getClass(), "sourcePosition", 0);
        setField(term143, term143.getClass(), "jsType", null);
        setField(term143, term143.getClass(), "parent", null);
        setField(term135, term135.getClass(), "last", term143);
        setField(term146, term146.getClass(), "next", null);
        setIntField(term146, term146.getClass(), "type", 0);
        setIntField(term146, term146.getClass(), "intValue", 0);
        setField(term146, term146.getClass(), "objectValue", null);
        setField(term135, term135.getClass(), "propListHead", term146);
        setIntField(term135, term135.getClass(), "sourcePosition", -1016503459);
        setField(term135, term135.getClass(), "jsType", null);
        setField(term135, term135.getClass(), "parent", null);
        setField(term133, term133.getClass(), "next", term135);
        setIntField(term150, term150.getClass(), "type", 0);
        setField(term150, term150.getClass(), "next", null);
        setField(term150, term150.getClass(), "first", null);
        setField(term150, term150.getClass(), "last", null);
        setField(term150, term150.getClass(), "propListHead", null);
        setIntField(term150, term150.getClass(), "sourcePosition", 0);
        setField(term150, term150.getClass(), "jsType", null);
        setField(term150, term150.getClass(), "parent", null);
        setField(term133, term133.getClass(), "first", term150);
        setIntField(term153, term153.getClass(), "type", 0);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", null);
        setField(term153, term153.getClass(), "last", null);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term133, term133.getClass(), "last", term153);
        setField(term156, term156.getClass(), "next", null);
        setIntField(term156, term156.getClass(), "type", 0);
        setIntField(term156, term156.getClass(), "intValue", 0);
        setField(term156, term156.getClass(), "objectValue", null);
        setField(term133, term133.getClass(), "propListHead", term156);
        setIntField(term133, term133.getClass(), "sourcePosition", -1968847291);
        setField(term133, term133.getClass(), "jsType", null);
        setField(term133, term133.getClass(), "parent", null);
        term160 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term133;
        args[1] = term160;
        try {
            callMethod(klass, "makeLocalNamesUnique", argTypes, term132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


