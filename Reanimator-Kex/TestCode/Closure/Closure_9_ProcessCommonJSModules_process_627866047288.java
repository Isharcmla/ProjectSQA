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

public class ProcessCommonJSModules_process_627866047288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147418;
     Object term147510;
     Object term148921;
     Object term148922;

    public ProcessCommonJSModules_process_627866047288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147418 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term147418, term147418.getClass(), "compiler", null);
        term147510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term147510, term147510.getClass(), "type", 0);
        setField(term147510, term147510.getClass(), "parent", null);
        setField(term147764, term147764.getClass(), "next", null);
        setIntField(term147764, term147764.getClass(), "type", 0);
        setField(term147764, term147764.getClass(), "first", null);
        setField(term147694, term147694.getClass(), "next", term147764);
        setIntField(term147694, term147694.getClass(), "type", 37);
        setField(term147694, term147694.getClass(), "first", null);
        setField(term147602, term147602.getClass(), "next", term147694);
        setIntField(term147602, term147602.getClass(), "type", 37);
        setField(term147856, term147856.getClass(), "next", null);
        setIntField(term147856, term147856.getClass(), "type", 0);
        setField(term147856, term147856.getClass(), "first", null);
        setField(term147602, term147602.getClass(), "first", term147856);
        setField(term147510, term147510.getClass(), "first", term147602);
        term148921 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term148921, term148921.getClass(), "compiler", null);
        setField(term148921, term148921.getClass(), "filenamePrefix", null);
        setBooleanField(term148921, term148921.getClass(), "reportDependencies", false);
        setField(term148921, term148921.getClass(), "module", null);
        term148922 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term148925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term148922, term148922.getClass(), "number", 0.0);
        setIntField(term148922, term148922.getClass(), "type", 0);
        setField(term148922, term148922.getClass(), "next", null);
        setDoubleField(term148923, term148923.getClass(), "number", 0.0);
        setIntField(term148923, term148923.getClass(), "type", 37);
        setDoubleField(term148924, term148924.getClass(), "number", 0.0);
        setIntField(term148924, term148924.getClass(), "type", 37);
        setIntField(term148925, term148925.getClass(), "type", 0);
        setField(term148925, term148925.getClass(), "next", null);
        setField(term148925, term148925.getClass(), "first", null);
        setField(term148925, term148925.getClass(), "last", null);
        setField(term148925, term148925.getClass(), "propListHead", null);
        setIntField(term148925, term148925.getClass(), "sourcePosition", 0);
        setField(term148925, term148925.getClass(), "jsType", null);
        setField(term148925, term148925.getClass(), "parent", null);
        setField(term148924, term148924.getClass(), "next", term148925);
        setField(term148924, term148924.getClass(), "first", null);
        setField(term148924, term148924.getClass(), "last", null);
        setField(term148924, term148924.getClass(), "propListHead", null);
        setIntField(term148924, term148924.getClass(), "sourcePosition", 0);
        setField(term148924, term148924.getClass(), "jsType", null);
        setField(term148924, term148924.getClass(), "parent", null);
        setField(term148923, term148923.getClass(), "next", term148924);
        setDoubleField(term148926, term148926.getClass(), "number", 0.0);
        setIntField(term148926, term148926.getClass(), "type", 0);
        setField(term148926, term148926.getClass(), "next", null);
        setField(term148926, term148926.getClass(), "first", null);
        setField(term148926, term148926.getClass(), "last", null);
        setField(term148926, term148926.getClass(), "propListHead", null);
        setIntField(term148926, term148926.getClass(), "sourcePosition", 0);
        setField(term148926, term148926.getClass(), "jsType", null);
        setField(term148926, term148926.getClass(), "parent", null);
        setField(term148923, term148923.getClass(), "first", term148926);
        setField(term148923, term148923.getClass(), "last", null);
        setField(term148923, term148923.getClass(), "propListHead", null);
        setIntField(term148923, term148923.getClass(), "sourcePosition", 0);
        setField(term148923, term148923.getClass(), "jsType", null);
        setField(term148923, term148923.getClass(), "parent", null);
        setField(term148922, term148922.getClass(), "first", term148923);
        setField(term148922, term148922.getClass(), "last", null);
        setField(term148922, term148922.getClass(), "propListHead", null);
        setIntField(term148922, term148922.getClass(), "sourcePosition", 0);
        setField(term148922, term148922.getClass(), "jsType", null);
        setField(term148922, term148922.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term147510;
        callMethod(klass, "process", argTypes, term147418, args);
        assertTrue(recursiveEquals(term147418, term148921));
        assertTrue(recursiveEquals(term147510, null));
    }

};


