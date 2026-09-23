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

public class ReferenceCollectingCallback_visit_872273174636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172962;
     Object term173183;
     Object term173140;
     Object term173789;
     Object term173790;
     Object term173791;

    public ReferenceCollectingCallback_visit_872273174636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172962 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term173183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term173183, term173183.getClass(), "type", 0);
        term173140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173140, term173140.getClass(), "type", 108);
        setField(term173140, term173140.getClass(), "first", term173183);
        term173789 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term173789, term173789.getClass(), "referenceMap", null);
        setField(term173789, term173789.getClass(), "blockStack", null);
        setField(term173789, term173789.getClass(), "behavior", null);
        setField(term173789, term173789.getClass(), "compiler", null);
        setField(term173789, term173789.getClass(), "varFilter", null);
        term173790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term173790, term173790.getClass(), "functionName", null);
        setBooleanField(term173790, term173790.getClass(), "itsNeedsActivation", false);
        setIntField(term173790, term173790.getClass(), "itsFunctionType", 0);
        setBooleanField(term173790, term173790.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173790, term173790.getClass(), "encodedSourceStart", 0);
        setIntField(term173790, term173790.getClass(), "encodedSourceEnd", 0);
        setField(term173790, term173790.getClass(), "sourceName", null);
        setIntField(term173790, term173790.getClass(), "baseLineno", 0);
        setIntField(term173790, term173790.getClass(), "endLineno", 0);
        setField(term173790, term173790.getClass(), "functions", null);
        setField(term173790, term173790.getClass(), "regexps", null);
        setField(term173790, term173790.getClass(), "itsVariables", null);
        setField(term173790, term173790.getClass(), "itsConst", null);
        setField(term173790, term173790.getClass(), "itsVariableNames", null);
        setIntField(term173790, term173790.getClass(), "varStart", 0);
        setField(term173790, term173790.getClass(), "compilerData", null);
        setIntField(term173790, term173790.getClass(), "type", 0);
        setField(term173790, term173790.getClass(), "next", null);
        setField(term173790, term173790.getClass(), "first", null);
        setField(term173790, term173790.getClass(), "last", null);
        setField(term173790, term173790.getClass(), "propListHead", null);
        setIntField(term173790, term173790.getClass(), "sourcePosition", 0);
        setField(term173790, term173790.getClass(), "jsType", null);
        setField(term173790, term173790.getClass(), "parent", null);
        term173791 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173792 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term173791, term173791.getClass(), "str", null);
        setIntField(term173791, term173791.getClass(), "type", 108);
        setField(term173791, term173791.getClass(), "next", null);
        setField(term173792, term173792.getClass(), "functionName", null);
        setBooleanField(term173792, term173792.getClass(), "itsNeedsActivation", false);
        setIntField(term173792, term173792.getClass(), "itsFunctionType", 0);
        setBooleanField(term173792, term173792.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173792, term173792.getClass(), "encodedSourceStart", 0);
        setIntField(term173792, term173792.getClass(), "encodedSourceEnd", 0);
        setField(term173792, term173792.getClass(), "sourceName", null);
        setIntField(term173792, term173792.getClass(), "baseLineno", 0);
        setIntField(term173792, term173792.getClass(), "endLineno", 0);
        setField(term173792, term173792.getClass(), "functions", null);
        setField(term173792, term173792.getClass(), "regexps", null);
        setField(term173792, term173792.getClass(), "itsVariables", null);
        setField(term173792, term173792.getClass(), "itsConst", null);
        setField(term173792, term173792.getClass(), "itsVariableNames", null);
        setIntField(term173792, term173792.getClass(), "varStart", 0);
        setField(term173792, term173792.getClass(), "compilerData", null);
        setIntField(term173792, term173792.getClass(), "type", 0);
        setField(term173792, term173792.getClass(), "next", null);
        setField(term173792, term173792.getClass(), "first", null);
        setField(term173792, term173792.getClass(), "last", null);
        setField(term173792, term173792.getClass(), "propListHead", null);
        setIntField(term173792, term173792.getClass(), "sourcePosition", 0);
        setField(term173792, term173792.getClass(), "jsType", null);
        setField(term173792, term173792.getClass(), "parent", null);
        setField(term173791, term173791.getClass(), "first", term173792);
        setField(term173791, term173791.getClass(), "last", null);
        setField(term173791, term173791.getClass(), "propListHead", null);
        setIntField(term173791, term173791.getClass(), "sourcePosition", 0);
        setField(term173791, term173791.getClass(), "jsType", null);
        setField(term173791, term173791.getClass(), "parent", null);
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
        args[1] = term173183;
        args[2] = term173140;
        callMethod(klass, "visit", argTypes, term172962, args);
        assertTrue(recursiveEquals(term172962, term173789));
        assertTrue(recursiveEquals(term173183, term173791));
        assertTrue(recursiveEquals(term173140, null));
    }

};


