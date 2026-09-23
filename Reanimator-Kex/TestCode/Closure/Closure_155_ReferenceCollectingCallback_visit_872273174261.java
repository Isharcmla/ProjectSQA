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

public class ReferenceCollectingCallback_visit_872273174261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62604;
     Object term62690;
     Object term62776;
     Object term63029;
     Object term63030;
     Object term63031;

    public ReferenceCollectingCallback_visit_872273174261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62604 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term62690 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term62690, term62690.getClass(), "type", -39);
        term62776 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term63029 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term63029, term63029.getClass(), "referenceMap", null);
        setField(term63029, term63029.getClass(), "blockStack", null);
        setField(term63029, term63029.getClass(), "behavior", null);
        setField(term63029, term63029.getClass(), "compiler", null);
        setField(term63029, term63029.getClass(), "varFilter", null);
        term63030 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term63030, term63030.getClass(), "functionName", null);
        setBooleanField(term63030, term63030.getClass(), "itsNeedsActivation", false);
        setIntField(term63030, term63030.getClass(), "itsFunctionType", 0);
        setBooleanField(term63030, term63030.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term63030, term63030.getClass(), "encodedSourceStart", 0);
        setIntField(term63030, term63030.getClass(), "encodedSourceEnd", 0);
        setField(term63030, term63030.getClass(), "sourceName", null);
        setIntField(term63030, term63030.getClass(), "baseLineno", 0);
        setIntField(term63030, term63030.getClass(), "endLineno", 0);
        setField(term63030, term63030.getClass(), "functions", null);
        setField(term63030, term63030.getClass(), "regexps", null);
        setField(term63030, term63030.getClass(), "itsVariables", null);
        setField(term63030, term63030.getClass(), "itsConst", null);
        setField(term63030, term63030.getClass(), "itsVariableNames", null);
        setIntField(term63030, term63030.getClass(), "varStart", 0);
        setField(term63030, term63030.getClass(), "compilerData", null);
        setIntField(term63030, term63030.getClass(), "type", -39);
        setField(term63030, term63030.getClass(), "next", null);
        setField(term63030, term63030.getClass(), "first", null);
        setField(term63030, term63030.getClass(), "last", null);
        setField(term63030, term63030.getClass(), "propListHead", null);
        setIntField(term63030, term63030.getClass(), "sourcePosition", 0);
        setField(term63030, term63030.getClass(), "jsType", null);
        setField(term63030, term63030.getClass(), "parent", null);
        term63031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term63031, term63031.getClass(), "functionName", null);
        setBooleanField(term63031, term63031.getClass(), "itsNeedsActivation", false);
        setIntField(term63031, term63031.getClass(), "itsFunctionType", 0);
        setBooleanField(term63031, term63031.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term63031, term63031.getClass(), "encodedSourceStart", 0);
        setIntField(term63031, term63031.getClass(), "encodedSourceEnd", 0);
        setField(term63031, term63031.getClass(), "sourceName", null);
        setIntField(term63031, term63031.getClass(), "baseLineno", 0);
        setIntField(term63031, term63031.getClass(), "endLineno", 0);
        setField(term63031, term63031.getClass(), "functions", null);
        setField(term63031, term63031.getClass(), "regexps", null);
        setField(term63031, term63031.getClass(), "itsVariables", null);
        setField(term63031, term63031.getClass(), "itsConst", null);
        setField(term63031, term63031.getClass(), "itsVariableNames", null);
        setIntField(term63031, term63031.getClass(), "varStart", 0);
        setField(term63031, term63031.getClass(), "compilerData", null);
        setIntField(term63031, term63031.getClass(), "type", 0);
        setField(term63031, term63031.getClass(), "next", null);
        setField(term63031, term63031.getClass(), "first", null);
        setField(term63031, term63031.getClass(), "last", null);
        setField(term63031, term63031.getClass(), "propListHead", null);
        setIntField(term63031, term63031.getClass(), "sourcePosition", 0);
        setField(term63031, term63031.getClass(), "jsType", null);
        setField(term63031, term63031.getClass(), "parent", null);
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
        args[1] = term62690;
        args[2] = term62776;
        callMethod(klass, "visit", argTypes, term62604, args);
        assertTrue(recursiveEquals(term62604, term63029));
        assertTrue(recursiveEquals(term62690, term63031));
        assertTrue(recursiveEquals(term62776, null));
    }

};


