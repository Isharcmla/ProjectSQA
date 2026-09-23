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

public class ReferenceCollectingCallback_visit_872273174738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193830;
     Object term193916;
     Object term194040;
     Object term194041;

    public ReferenceCollectingCallback_visit_872273174738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193830 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term193916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term194040 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term194040, term194040.getClass(), "referenceMap", null);
        setField(term194040, term194040.getClass(), "blockStack", null);
        setField(term194040, term194040.getClass(), "behavior", null);
        setField(term194040, term194040.getClass(), "compiler", null);
        setField(term194040, term194040.getClass(), "varFilter", null);
        term194041 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term194041, term194041.getClass(), "functionName", null);
        setBooleanField(term194041, term194041.getClass(), "itsNeedsActivation", false);
        setIntField(term194041, term194041.getClass(), "itsFunctionType", 0);
        setBooleanField(term194041, term194041.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term194041, term194041.getClass(), "encodedSourceStart", 0);
        setIntField(term194041, term194041.getClass(), "encodedSourceEnd", 0);
        setField(term194041, term194041.getClass(), "sourceName", null);
        setIntField(term194041, term194041.getClass(), "baseLineno", 0);
        setIntField(term194041, term194041.getClass(), "endLineno", 0);
        setField(term194041, term194041.getClass(), "functions", null);
        setField(term194041, term194041.getClass(), "regexps", null);
        setField(term194041, term194041.getClass(), "itsVariables", null);
        setField(term194041, term194041.getClass(), "itsConst", null);
        setField(term194041, term194041.getClass(), "itsVariableNames", null);
        setIntField(term194041, term194041.getClass(), "varStart", 0);
        setField(term194041, term194041.getClass(), "compilerData", null);
        setIntField(term194041, term194041.getClass(), "type", 0);
        setField(term194041, term194041.getClass(), "next", null);
        setField(term194041, term194041.getClass(), "first", null);
        setField(term194041, term194041.getClass(), "last", null);
        setField(term194041, term194041.getClass(), "propListHead", null);
        setIntField(term194041, term194041.getClass(), "sourcePosition", 0);
        setField(term194041, term194041.getClass(), "jsType", null);
        setField(term194041, term194041.getClass(), "parent", null);
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
        args[1] = term193916;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term193830, args);
        assertTrue(recursiveEquals(term193830, term194040));
        assertTrue(recursiveEquals(term193916, null));
    }

};


