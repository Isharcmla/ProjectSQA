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

public class ReferenceCollectingCallback_visit_87227317497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20413;
     Object term20628;
     Object term20585;
     Object term21254;
     Object term21255;
     Object term21256;

    public ReferenceCollectingCallback_visit_87227317497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20413 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term20628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20628, term20628.getClass(), "type", 108);
        term20585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20585, term20585.getClass(), "type", 108);
        setField(term20585, term20585.getClass(), "first", term20628);
        term21254 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term21254, term21254.getClass(), "referenceMap", null);
        setField(term21254, term21254.getClass(), "blockStack", null);
        setField(term21254, term21254.getClass(), "behavior", null);
        setField(term21254, term21254.getClass(), "compiler", null);
        setField(term21254, term21254.getClass(), "varFilter", null);
        term21255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term21255, term21255.getClass(), "functionName", null);
        setBooleanField(term21255, term21255.getClass(), "itsNeedsActivation", false);
        setIntField(term21255, term21255.getClass(), "itsFunctionType", 0);
        setBooleanField(term21255, term21255.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term21255, term21255.getClass(), "encodedSourceStart", 0);
        setIntField(term21255, term21255.getClass(), "encodedSourceEnd", 0);
        setField(term21255, term21255.getClass(), "sourceName", null);
        setIntField(term21255, term21255.getClass(), "baseLineno", 0);
        setIntField(term21255, term21255.getClass(), "endLineno", 0);
        setField(term21255, term21255.getClass(), "functions", null);
        setField(term21255, term21255.getClass(), "regexps", null);
        setField(term21255, term21255.getClass(), "itsVariables", null);
        setField(term21255, term21255.getClass(), "itsConst", null);
        setField(term21255, term21255.getClass(), "itsVariableNames", null);
        setIntField(term21255, term21255.getClass(), "varStart", 0);
        setField(term21255, term21255.getClass(), "compilerData", null);
        setIntField(term21255, term21255.getClass(), "type", 108);
        setField(term21255, term21255.getClass(), "next", null);
        setField(term21255, term21255.getClass(), "first", null);
        setField(term21255, term21255.getClass(), "last", null);
        setField(term21255, term21255.getClass(), "propListHead", null);
        setIntField(term21255, term21255.getClass(), "sourcePosition", 0);
        setField(term21255, term21255.getClass(), "jsType", null);
        setField(term21255, term21255.getClass(), "parent", null);
        term21256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term21257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term21256, term21256.getClass(), "functionName", null);
        setBooleanField(term21256, term21256.getClass(), "itsNeedsActivation", false);
        setIntField(term21256, term21256.getClass(), "itsFunctionType", 0);
        setBooleanField(term21256, term21256.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term21256, term21256.getClass(), "encodedSourceStart", 0);
        setIntField(term21256, term21256.getClass(), "encodedSourceEnd", 0);
        setField(term21256, term21256.getClass(), "sourceName", null);
        setIntField(term21256, term21256.getClass(), "baseLineno", 0);
        setIntField(term21256, term21256.getClass(), "endLineno", 0);
        setField(term21256, term21256.getClass(), "functions", null);
        setField(term21256, term21256.getClass(), "regexps", null);
        setField(term21256, term21256.getClass(), "itsVariables", null);
        setField(term21256, term21256.getClass(), "itsConst", null);
        setField(term21256, term21256.getClass(), "itsVariableNames", null);
        setIntField(term21256, term21256.getClass(), "varStart", 0);
        setField(term21256, term21256.getClass(), "compilerData", null);
        setIntField(term21256, term21256.getClass(), "type", 108);
        setField(term21256, term21256.getClass(), "next", null);
        setField(term21257, term21257.getClass(), "functionName", null);
        setBooleanField(term21257, term21257.getClass(), "itsNeedsActivation", false);
        setIntField(term21257, term21257.getClass(), "itsFunctionType", 0);
        setBooleanField(term21257, term21257.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term21257, term21257.getClass(), "encodedSourceStart", 0);
        setIntField(term21257, term21257.getClass(), "encodedSourceEnd", 0);
        setField(term21257, term21257.getClass(), "sourceName", null);
        setIntField(term21257, term21257.getClass(), "baseLineno", 0);
        setIntField(term21257, term21257.getClass(), "endLineno", 0);
        setField(term21257, term21257.getClass(), "functions", null);
        setField(term21257, term21257.getClass(), "regexps", null);
        setField(term21257, term21257.getClass(), "itsVariables", null);
        setField(term21257, term21257.getClass(), "itsConst", null);
        setField(term21257, term21257.getClass(), "itsVariableNames", null);
        setIntField(term21257, term21257.getClass(), "varStart", 0);
        setField(term21257, term21257.getClass(), "compilerData", null);
        setIntField(term21257, term21257.getClass(), "type", 108);
        setField(term21257, term21257.getClass(), "next", null);
        setField(term21257, term21257.getClass(), "first", null);
        setField(term21257, term21257.getClass(), "last", null);
        setField(term21257, term21257.getClass(), "propListHead", null);
        setIntField(term21257, term21257.getClass(), "sourcePosition", 0);
        setField(term21257, term21257.getClass(), "jsType", null);
        setField(term21257, term21257.getClass(), "parent", null);
        setField(term21256, term21256.getClass(), "first", term21257);
        setField(term21256, term21256.getClass(), "last", null);
        setField(term21256, term21256.getClass(), "propListHead", null);
        setIntField(term21256, term21256.getClass(), "sourcePosition", 0);
        setField(term21256, term21256.getClass(), "jsType", null);
        setField(term21256, term21256.getClass(), "parent", null);
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
        args[1] = term20628;
        args[2] = term20585;
        callMethod(klass, "visit", argTypes, term20413, args);
        assertTrue(recursiveEquals(term20413, term21254));
        assertTrue(recursiveEquals(term20628, term21256));
        assertTrue(recursiveEquals(term20585, null));
    }

};


