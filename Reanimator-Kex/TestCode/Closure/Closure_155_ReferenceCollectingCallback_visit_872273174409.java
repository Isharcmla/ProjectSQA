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

public class ReferenceCollectingCallback_visit_872273174409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98412;
     Object term98627;
     Object term98584;
     Object term99333;
     Object term99334;
     Object term99335;

    public ReferenceCollectingCallback_visit_872273174409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98412 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term98627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term98627, term98627.getClass(), "type", 100);
        term98584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term98584, term98584.getClass(), "type", 100);
        setField(term98584, term98584.getClass(), "first", term98627);
        term99333 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term99333, term99333.getClass(), "referenceMap", null);
        setField(term99333, term99333.getClass(), "blockStack", null);
        setField(term99333, term99333.getClass(), "behavior", null);
        setField(term99333, term99333.getClass(), "compiler", null);
        setField(term99333, term99333.getClass(), "varFilter", null);
        term99334 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term99334, term99334.getClass(), "functionName", null);
        setBooleanField(term99334, term99334.getClass(), "itsNeedsActivation", false);
        setIntField(term99334, term99334.getClass(), "itsFunctionType", 0);
        setBooleanField(term99334, term99334.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99334, term99334.getClass(), "encodedSourceStart", 0);
        setIntField(term99334, term99334.getClass(), "encodedSourceEnd", 0);
        setField(term99334, term99334.getClass(), "sourceName", null);
        setIntField(term99334, term99334.getClass(), "baseLineno", 0);
        setIntField(term99334, term99334.getClass(), "endLineno", 0);
        setField(term99334, term99334.getClass(), "functions", null);
        setField(term99334, term99334.getClass(), "regexps", null);
        setField(term99334, term99334.getClass(), "itsVariables", null);
        setField(term99334, term99334.getClass(), "itsConst", null);
        setField(term99334, term99334.getClass(), "itsVariableNames", null);
        setIntField(term99334, term99334.getClass(), "varStart", 0);
        setField(term99334, term99334.getClass(), "compilerData", null);
        setIntField(term99334, term99334.getClass(), "type", 100);
        setField(term99334, term99334.getClass(), "next", null);
        setField(term99334, term99334.getClass(), "first", null);
        setField(term99334, term99334.getClass(), "last", null);
        setField(term99334, term99334.getClass(), "propListHead", null);
        setIntField(term99334, term99334.getClass(), "sourcePosition", 0);
        setField(term99334, term99334.getClass(), "jsType", null);
        setField(term99334, term99334.getClass(), "parent", null);
        term99335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99336 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term99335, term99335.getClass(), "functionName", null);
        setBooleanField(term99335, term99335.getClass(), "itsNeedsActivation", false);
        setIntField(term99335, term99335.getClass(), "itsFunctionType", 0);
        setBooleanField(term99335, term99335.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99335, term99335.getClass(), "encodedSourceStart", 0);
        setIntField(term99335, term99335.getClass(), "encodedSourceEnd", 0);
        setField(term99335, term99335.getClass(), "sourceName", null);
        setIntField(term99335, term99335.getClass(), "baseLineno", 0);
        setIntField(term99335, term99335.getClass(), "endLineno", 0);
        setField(term99335, term99335.getClass(), "functions", null);
        setField(term99335, term99335.getClass(), "regexps", null);
        setField(term99335, term99335.getClass(), "itsVariables", null);
        setField(term99335, term99335.getClass(), "itsConst", null);
        setField(term99335, term99335.getClass(), "itsVariableNames", null);
        setIntField(term99335, term99335.getClass(), "varStart", 0);
        setField(term99335, term99335.getClass(), "compilerData", null);
        setIntField(term99335, term99335.getClass(), "type", 100);
        setField(term99335, term99335.getClass(), "next", null);
        setField(term99336, term99336.getClass(), "functionName", null);
        setBooleanField(term99336, term99336.getClass(), "itsNeedsActivation", false);
        setIntField(term99336, term99336.getClass(), "itsFunctionType", 0);
        setBooleanField(term99336, term99336.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99336, term99336.getClass(), "encodedSourceStart", 0);
        setIntField(term99336, term99336.getClass(), "encodedSourceEnd", 0);
        setField(term99336, term99336.getClass(), "sourceName", null);
        setIntField(term99336, term99336.getClass(), "baseLineno", 0);
        setIntField(term99336, term99336.getClass(), "endLineno", 0);
        setField(term99336, term99336.getClass(), "functions", null);
        setField(term99336, term99336.getClass(), "regexps", null);
        setField(term99336, term99336.getClass(), "itsVariables", null);
        setField(term99336, term99336.getClass(), "itsConst", null);
        setField(term99336, term99336.getClass(), "itsVariableNames", null);
        setIntField(term99336, term99336.getClass(), "varStart", 0);
        setField(term99336, term99336.getClass(), "compilerData", null);
        setIntField(term99336, term99336.getClass(), "type", 100);
        setField(term99336, term99336.getClass(), "next", null);
        setField(term99336, term99336.getClass(), "first", null);
        setField(term99336, term99336.getClass(), "last", null);
        setField(term99336, term99336.getClass(), "propListHead", null);
        setIntField(term99336, term99336.getClass(), "sourcePosition", 0);
        setField(term99336, term99336.getClass(), "jsType", null);
        setField(term99336, term99336.getClass(), "parent", null);
        setField(term99335, term99335.getClass(), "first", term99336);
        setField(term99335, term99335.getClass(), "last", null);
        setField(term99335, term99335.getClass(), "propListHead", null);
        setIntField(term99335, term99335.getClass(), "sourcePosition", 0);
        setField(term99335, term99335.getClass(), "jsType", null);
        setField(term99335, term99335.getClass(), "parent", null);
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
        args[1] = term98627;
        args[2] = term98584;
        callMethod(klass, "visit", argTypes, term98412, args);
        assertTrue(recursiveEquals(term98412, term99333));
        assertTrue(recursiveEquals(term98627, term99335));
        assertTrue(recursiveEquals(term98584, null));
    }

};


