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
import java.util.ArrayList;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32453;
     Object term32505;
     Object term32575;
     Object term99148;
     Object term99149;
     Object term99151;

    public CoalesceVariableNames_checkRanges_118307546586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32453 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term32453, term32453.getClass(), "compiler", null);
        term32505 = new ArrayList();
        term32575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32575, term32575.getClass(), "type", 0);
        setField(term32645, term32645.getClass(), "next", null);
        setIntField(term32645, term32645.getClass(), "type", 132);
        setField(term32645, term32645.getClass(), "propListHead", null);
        setField(term32645, term32645.getClass(), "parent", term32715);
        setField(term32575, term32575.getClass(), "first", term32645);
        term99148 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term99148, term99148.getClass(), "compiler", null);
        setField(term99148, term99148.getClass(), "colorings", null);
        setBooleanField(term99148, term99148.getClass(), "usePseudoNames", false);
        term99149 = new ArrayList();
        term99151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99151, term99151.getClass(), "type", 0);
        setField(term99151, term99151.getClass(), "next", null);
        setIntField(term99152, term99152.getClass(), "type", 132);
        setField(term99152, term99152.getClass(), "next", null);
        setField(term99152, term99152.getClass(), "first", null);
        setField(term99152, term99152.getClass(), "last", null);
        setField(term99152, term99152.getClass(), "propListHead", null);
        setIntField(term99152, term99152.getClass(), "sourcePosition", 0);
        setField(term99152, term99152.getClass(), "jsType", null);
        setIntField(term99153, term99153.getClass(), "type", 0);
        setField(term99153, term99153.getClass(), "next", null);
        setField(term99153, term99153.getClass(), "first", null);
        setField(term99153, term99153.getClass(), "last", null);
        setField(term99153, term99153.getClass(), "propListHead", null);
        setIntField(term99153, term99153.getClass(), "sourcePosition", 0);
        setField(term99153, term99153.getClass(), "jsType", null);
        setField(term99153, term99153.getClass(), "parent", null);
        setField(term99152, term99152.getClass(), "parent", term99153);
        setField(term99151, term99151.getClass(), "first", term99152);
        setField(term99151, term99151.getClass(), "last", null);
        setField(term99151, term99151.getClass(), "propListHead", null);
        setIntField(term99151, term99151.getClass(), "sourcePosition", 0);
        setField(term99151, term99151.getClass(), "jsType", null);
        setField(term99151, term99151.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term32505;
        args[1] = term32575;
        callMethod(klass, "checkRanges", argTypes, term32453, args);
        assertTrue(recursiveEquals(term32453, term99148));
        assertTrue(recursiveEquals(term32505, term99149));
        assertTrue(recursiveEquals(term32575, term99151));
    }

};


