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

public class ProcessCommonJSModules_process_627866047338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176347;
     Object term176417;
     Object term178225;
     Object term178226;

    public ProcessCommonJSModules_process_627866047338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176347 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term176347, term176347.getClass(), "compiler", null);
        term176417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term176417, term176417.getClass(), "type", 33);
        setField(term176417, term176417.getClass(), "parent", null);
        setField(term176671, term176671.getClass(), "next", null);
        setIntField(term176671, term176671.getClass(), "type", 0);
        setField(term176671, term176671.getClass(), "first", null);
        setField(term176601, term176601.getClass(), "next", term176671);
        setIntField(term176601, term176601.getClass(), "type", 37);
        setField(term176601, term176601.getClass(), "first", null);
        setField(term176509, term176509.getClass(), "next", term176601);
        setIntField(term176509, term176509.getClass(), "type", 0);
        setField(term176855, term176855.getClass(), "next", null);
        setIntField(term176855, term176855.getClass(), "type", 0);
        setField(term176855, term176855.getClass(), "first", null);
        setField(term176763, term176763.getClass(), "next", term176855);
        setIntField(term176763, term176763.getClass(), "type", 0);
        setField(term176763, term176763.getClass(), "first", null);
        setField(term176509, term176509.getClass(), "first", term176763);
        setField(term176417, term176417.getClass(), "first", term176509);
        term178225 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term178225, term178225.getClass(), "compiler", null);
        setField(term178225, term178225.getClass(), "filenamePrefix", null);
        setBooleanField(term178225, term178225.getClass(), "reportDependencies", false);
        setField(term178225, term178225.getClass(), "module", null);
        term178226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term178226, term178226.getClass(), "type", 33);
        setField(term178226, term178226.getClass(), "next", null);
        setDoubleField(term178227, term178227.getClass(), "number", 0.0);
        setIntField(term178227, term178227.getClass(), "type", 0);
        setDoubleField(term178228, term178228.getClass(), "number", 0.0);
        setIntField(term178228, term178228.getClass(), "type", 37);
        setIntField(term178229, term178229.getClass(), "type", 0);
        setField(term178229, term178229.getClass(), "next", null);
        setField(term178229, term178229.getClass(), "first", null);
        setField(term178229, term178229.getClass(), "last", null);
        setField(term178229, term178229.getClass(), "propListHead", null);
        setIntField(term178229, term178229.getClass(), "sourcePosition", 0);
        setField(term178229, term178229.getClass(), "jsType", null);
        setField(term178229, term178229.getClass(), "parent", null);
        setField(term178228, term178228.getClass(), "next", term178229);
        setField(term178228, term178228.getClass(), "first", null);
        setField(term178228, term178228.getClass(), "last", null);
        setField(term178228, term178228.getClass(), "propListHead", null);
        setIntField(term178228, term178228.getClass(), "sourcePosition", 0);
        setField(term178228, term178228.getClass(), "jsType", null);
        setField(term178228, term178228.getClass(), "parent", null);
        setField(term178227, term178227.getClass(), "next", term178228);
        setDoubleField(term178230, term178230.getClass(), "number", 0.0);
        setIntField(term178230, term178230.getClass(), "type", 0);
        setDoubleField(term178231, term178231.getClass(), "number", 0.0);
        setIntField(term178231, term178231.getClass(), "type", 0);
        setField(term178231, term178231.getClass(), "next", null);
        setField(term178231, term178231.getClass(), "first", null);
        setField(term178231, term178231.getClass(), "last", null);
        setField(term178231, term178231.getClass(), "propListHead", null);
        setIntField(term178231, term178231.getClass(), "sourcePosition", 0);
        setField(term178231, term178231.getClass(), "jsType", null);
        setField(term178231, term178231.getClass(), "parent", null);
        setField(term178230, term178230.getClass(), "next", term178231);
        setField(term178230, term178230.getClass(), "first", null);
        setField(term178230, term178230.getClass(), "last", null);
        setField(term178230, term178230.getClass(), "propListHead", null);
        setIntField(term178230, term178230.getClass(), "sourcePosition", 0);
        setField(term178230, term178230.getClass(), "jsType", null);
        setField(term178230, term178230.getClass(), "parent", null);
        setField(term178227, term178227.getClass(), "first", term178230);
        setField(term178227, term178227.getClass(), "last", null);
        setField(term178227, term178227.getClass(), "propListHead", null);
        setIntField(term178227, term178227.getClass(), "sourcePosition", 0);
        setField(term178227, term178227.getClass(), "jsType", null);
        setField(term178227, term178227.getClass(), "parent", null);
        setField(term178226, term178226.getClass(), "first", term178227);
        setField(term178226, term178226.getClass(), "last", null);
        setField(term178226, term178226.getClass(), "propListHead", null);
        setIntField(term178226, term178226.getClass(), "sourcePosition", 0);
        setField(term178226, term178226.getClass(), "jsType", null);
        setField(term178226, term178226.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term176417;
        callMethod(klass, "process", argTypes, term176347, args);
        assertTrue(recursiveEquals(term176347, term178225));
        assertTrue(recursiveEquals(term176417, null));
    }

};


