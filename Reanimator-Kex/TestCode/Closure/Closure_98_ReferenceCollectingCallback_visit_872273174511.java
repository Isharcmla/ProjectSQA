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

public class ReferenceCollectingCallback_visit_872273174511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139435;
     Object term139656;
     Object term139613;
     Object term140007;
     Object term140008;
     Object term140009;

    public ReferenceCollectingCallback_visit_872273174511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139435 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term139656 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term139656, term139656.getClass(), "type", 0);
        term139613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term139613, term139613.getClass(), "type", 98);
        setField(term139613, term139613.getClass(), "first", term139656);
        term140007 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term140007, term140007.getClass(), "referenceMap", null);
        setField(term140007, term140007.getClass(), "blockStack", null);
        setField(term140007, term140007.getClass(), "behavior", null);
        setField(term140007, term140007.getClass(), "compiler", null);
        setField(term140007, term140007.getClass(), "varFilter", null);
        term140008 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140008, term140008.getClass(), "functionName", null);
        setBooleanField(term140008, term140008.getClass(), "itsNeedsActivation", false);
        setIntField(term140008, term140008.getClass(), "itsFunctionType", 0);
        setBooleanField(term140008, term140008.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140008, term140008.getClass(), "encodedSourceStart", 0);
        setIntField(term140008, term140008.getClass(), "encodedSourceEnd", 0);
        setField(term140008, term140008.getClass(), "sourceName", null);
        setIntField(term140008, term140008.getClass(), "baseLineno", 0);
        setIntField(term140008, term140008.getClass(), "endLineno", 0);
        setField(term140008, term140008.getClass(), "functions", null);
        setField(term140008, term140008.getClass(), "regexps", null);
        setField(term140008, term140008.getClass(), "itsVariables", null);
        setField(term140008, term140008.getClass(), "itsConst", null);
        setField(term140008, term140008.getClass(), "itsVariableNames", null);
        setIntField(term140008, term140008.getClass(), "varStart", 0);
        setField(term140008, term140008.getClass(), "compilerData", null);
        setIntField(term140008, term140008.getClass(), "type", 0);
        setField(term140008, term140008.getClass(), "next", null);
        setField(term140008, term140008.getClass(), "first", null);
        setField(term140008, term140008.getClass(), "last", null);
        setField(term140008, term140008.getClass(), "propListHead", null);
        setIntField(term140008, term140008.getClass(), "sourcePosition", 0);
        setField(term140008, term140008.getClass(), "jsType", null);
        setField(term140008, term140008.getClass(), "parent", null);
        term140009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140009, term140009.getClass(), "str", null);
        setIntField(term140009, term140009.getClass(), "type", 98);
        setField(term140009, term140009.getClass(), "next", null);
        setField(term140010, term140010.getClass(), "functionName", null);
        setBooleanField(term140010, term140010.getClass(), "itsNeedsActivation", false);
        setIntField(term140010, term140010.getClass(), "itsFunctionType", 0);
        setBooleanField(term140010, term140010.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140010, term140010.getClass(), "encodedSourceStart", 0);
        setIntField(term140010, term140010.getClass(), "encodedSourceEnd", 0);
        setField(term140010, term140010.getClass(), "sourceName", null);
        setIntField(term140010, term140010.getClass(), "baseLineno", 0);
        setIntField(term140010, term140010.getClass(), "endLineno", 0);
        setField(term140010, term140010.getClass(), "functions", null);
        setField(term140010, term140010.getClass(), "regexps", null);
        setField(term140010, term140010.getClass(), "itsVariables", null);
        setField(term140010, term140010.getClass(), "itsConst", null);
        setField(term140010, term140010.getClass(), "itsVariableNames", null);
        setIntField(term140010, term140010.getClass(), "varStart", 0);
        setField(term140010, term140010.getClass(), "compilerData", null);
        setIntField(term140010, term140010.getClass(), "type", 0);
        setField(term140010, term140010.getClass(), "next", null);
        setField(term140010, term140010.getClass(), "first", null);
        setField(term140010, term140010.getClass(), "last", null);
        setField(term140010, term140010.getClass(), "propListHead", null);
        setIntField(term140010, term140010.getClass(), "sourcePosition", 0);
        setField(term140010, term140010.getClass(), "jsType", null);
        setField(term140010, term140010.getClass(), "parent", null);
        setField(term140009, term140009.getClass(), "first", term140010);
        setField(term140009, term140009.getClass(), "last", null);
        setField(term140009, term140009.getClass(), "propListHead", null);
        setIntField(term140009, term140009.getClass(), "sourcePosition", 0);
        setField(term140009, term140009.getClass(), "jsType", null);
        setField(term140009, term140009.getClass(), "parent", null);
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
        args[1] = term139656;
        args[2] = term139613;
        callMethod(klass, "visit", argTypes, term139435, args);
        assertTrue(recursiveEquals(term139435, term140007));
        assertTrue(recursiveEquals(term139656, term140009));
        assertTrue(recursiveEquals(term139613, null));
    }

};


