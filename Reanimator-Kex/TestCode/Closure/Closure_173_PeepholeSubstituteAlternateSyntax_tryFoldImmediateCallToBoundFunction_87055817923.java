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

public class PeepholeSubstituteAlternateSyntax_tryFoldImmediateCallToBoundFunction_87055817923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term63;

    public PeepholeSubstituteAlternateSyntax_tryFoldImmediateCallToBoundFunction_87055817923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term61, term61.getClass(), "late", false);
        setField(term61, term61.getClass(), "compiler", null);
        term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63, term63.getClass(), "type", -655067527);
        setIntField(term65, term65.getClass(), "type", -6029667);
        setIntField(term67, term67.getClass(), "type", -2068769794);
        setIntField(term69, term69.getClass(), "type", -117576464);
        setIntField(term71, term71.getClass(), "type", -1007160944);
        setField(term71, term71.getClass(), "next", null);
        setField(term71, term71.getClass(), "first", null);
        setField(term71, term71.getClass(), "last", null);
        setField(term71, term71.getClass(), "propListHead", null);
        setIntField(term71, term71.getClass(), "sourcePosition", 0);
        setField(term71, term71.getClass(), "jsType", null);
        setField(term71, term71.getClass(), "parent", null);
        setField(term69, term69.getClass(), "next", term71);
        setIntField(term74, term74.getClass(), "type", 1135664017);
        setField(term74, term74.getClass(), "next", null);
        setField(term74, term74.getClass(), "first", null);
        setField(term74, term74.getClass(), "last", term71);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term69, term69.getClass(), "first", term74);
        setField(term69, term69.getClass(), "last", term67);
        setField(term69, term69.getClass(), "propListHead", null);
        setIntField(term69, term69.getClass(), "sourcePosition", 0);
        setField(term69, term69.getClass(), "jsType", null);
        setField(term69, term69.getClass(), "parent", null);
        setField(term67, term67.getClass(), "next", term69);
        setField(term67, term67.getClass(), "first", term71);
        setIntField(term78, term78.getClass(), "type", 865208305);
        setIntField(term80, term80.getClass(), "type", -1275173084);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", term74);
        setField(term80, term80.getClass(), "last", term69);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term78, term78.getClass(), "next", term80);
        setField(term78, term78.getClass(), "first", term65);
        setField(term78, term78.getClass(), "last", term65);
        setField(term78, term78.getClass(), "propListHead", null);
        setIntField(term78, term78.getClass(), "sourcePosition", 0);
        setField(term78, term78.getClass(), "jsType", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term67, term67.getClass(), "last", term78);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term65, term65.getClass(), "next", term67);
        setIntField(term85, term85.getClass(), "type", -244121226);
        setField(term85, term85.getClass(), "next", term78);
        setField(term85, term85.getClass(), "first", term80);
        setField(term85, term85.getClass(), "last", term63);
        setField(term85, term85.getClass(), "propListHead", null);
        setIntField(term85, term85.getClass(), "sourcePosition", 0);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term65, term65.getClass(), "first", term85);
        setField(term65, term65.getClass(), "last", term85);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term63, term63.getClass(), "next", term65);
        setField(term63, term63.getClass(), "first", term69);
        setField(term63, term63.getClass(), "last", term71);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63;
        try {
            callMethod(klass, "tryFoldImmediateCallToBoundFunction", argTypes, term61, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


