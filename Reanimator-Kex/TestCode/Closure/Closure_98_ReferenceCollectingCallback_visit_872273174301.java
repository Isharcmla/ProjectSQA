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

public class ReferenceCollectingCallback_visit_872273174301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76524;
     Object term76748;
     Object term76702;
     Object term77137;
     Object term77138;
     Object term77139;

    public ReferenceCollectingCallback_visit_872273174301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76524 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term76748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term76748, term76748.getClass(), "type", 0);
        term76702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term76702, term76702.getClass(), "type", 101);
        setField(term76702, term76702.getClass(), "first", term76748);
        term77137 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term77137, term77137.getClass(), "referenceMap", null);
        setField(term77137, term77137.getClass(), "blockStack", null);
        setField(term77137, term77137.getClass(), "behavior", null);
        setField(term77137, term77137.getClass(), "compiler", null);
        setField(term77137, term77137.getClass(), "varFilter", null);
        term77138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term77138, term77138.getClass(), "str", null);
        setIntField(term77138, term77138.getClass(), "type", 0);
        setField(term77138, term77138.getClass(), "next", null);
        setField(term77138, term77138.getClass(), "first", null);
        setField(term77138, term77138.getClass(), "last", null);
        setField(term77138, term77138.getClass(), "propListHead", null);
        setIntField(term77138, term77138.getClass(), "sourcePosition", 0);
        setField(term77138, term77138.getClass(), "jsType", null);
        setField(term77138, term77138.getClass(), "parent", null);
        term77139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term77139, term77139.getClass(), "functionName", null);
        setBooleanField(term77139, term77139.getClass(), "itsNeedsActivation", false);
        setIntField(term77139, term77139.getClass(), "itsFunctionType", 0);
        setBooleanField(term77139, term77139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77139, term77139.getClass(), "encodedSourceStart", 0);
        setIntField(term77139, term77139.getClass(), "encodedSourceEnd", 0);
        setField(term77139, term77139.getClass(), "sourceName", null);
        setIntField(term77139, term77139.getClass(), "baseLineno", 0);
        setIntField(term77139, term77139.getClass(), "endLineno", 0);
        setField(term77139, term77139.getClass(), "functions", null);
        setField(term77139, term77139.getClass(), "regexps", null);
        setField(term77139, term77139.getClass(), "itsVariables", null);
        setField(term77139, term77139.getClass(), "itsConst", null);
        setField(term77139, term77139.getClass(), "itsVariableNames", null);
        setIntField(term77139, term77139.getClass(), "varStart", 0);
        setField(term77139, term77139.getClass(), "compilerData", null);
        setIntField(term77139, term77139.getClass(), "type", 101);
        setField(term77139, term77139.getClass(), "next", null);
        setField(term77140, term77140.getClass(), "str", null);
        setIntField(term77140, term77140.getClass(), "type", 0);
        setField(term77140, term77140.getClass(), "next", null);
        setField(term77140, term77140.getClass(), "first", null);
        setField(term77140, term77140.getClass(), "last", null);
        setField(term77140, term77140.getClass(), "propListHead", null);
        setIntField(term77140, term77140.getClass(), "sourcePosition", 0);
        setField(term77140, term77140.getClass(), "jsType", null);
        setField(term77140, term77140.getClass(), "parent", null);
        setField(term77139, term77139.getClass(), "first", term77140);
        setField(term77139, term77139.getClass(), "last", null);
        setField(term77139, term77139.getClass(), "propListHead", null);
        setIntField(term77139, term77139.getClass(), "sourcePosition", 0);
        setField(term77139, term77139.getClass(), "jsType", null);
        setField(term77139, term77139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term76748;
        args[2] = term76702;
        callMethod(klass, "visit", argTypes, term76524, args);
        assertTrue(recursiveEquals(term76524, term77137));
        assertTrue(recursiveEquals(term76748, term77139));
        assertTrue(recursiveEquals(term76702, null));
    }

};


