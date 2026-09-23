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

public class VarCheck_visit_166282470143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12386;
     Object term12472;
     Object term12496;
     Object term12497;

    public VarCheck_visit_166282470143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12386 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        term12472 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term12496 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setField(term12496, term12496.getClass(), "synthesizedExternsInput", null);
        setField(term12496, term12496.getClass(), "synthesizedExternsRoot", null);
        setField(term12496, term12496.getClass(), "varsToDeclareInExterns", null);
        setField(term12496, term12496.getClass(), "compiler", null);
        setBooleanField(term12496, term12496.getClass(), "sanityCheck", false);
        setBooleanField(term12496, term12496.getClass(), "strictExternCheck", false);
        term12497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term12497, term12497.getClass(), "functionName", null);
        setBooleanField(term12497, term12497.getClass(), "itsNeedsActivation", false);
        setIntField(term12497, term12497.getClass(), "itsFunctionType", 0);
        setBooleanField(term12497, term12497.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term12497, term12497.getClass(), "encodedSourceStart", 0);
        setIntField(term12497, term12497.getClass(), "encodedSourceEnd", 0);
        setField(term12497, term12497.getClass(), "sourceName", null);
        setIntField(term12497, term12497.getClass(), "baseLineno", 0);
        setIntField(term12497, term12497.getClass(), "endLineno", 0);
        setField(term12497, term12497.getClass(), "functions", null);
        setField(term12497, term12497.getClass(), "regexps", null);
        setField(term12497, term12497.getClass(), "itsVariables", null);
        setField(term12497, term12497.getClass(), "itsConst", null);
        setField(term12497, term12497.getClass(), "itsVariableNames", null);
        setIntField(term12497, term12497.getClass(), "varStart", 0);
        setField(term12497, term12497.getClass(), "compilerData", null);
        setIntField(term12497, term12497.getClass(), "type", 0);
        setField(term12497, term12497.getClass(), "next", null);
        setField(term12497, term12497.getClass(), "first", null);
        setField(term12497, term12497.getClass(), "last", null);
        setField(term12497, term12497.getClass(), "propListHead", null);
        setIntField(term12497, term12497.getClass(), "sourcePosition", 0);
        setField(term12497, term12497.getClass(), "jsType", null);
        setField(term12497, term12497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term12472;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term12386, args);
        assertTrue(recursiveEquals(term12386, term12496));
        assertTrue(recursiveEquals(term12472, null));
    }

};


