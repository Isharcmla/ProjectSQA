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

public class ReferenceCollectingCallback_visit_87227317451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9665;
     Object term9751;
     Object term9837;
     Object term10071;
     Object term10072;
     Object term10073;

    public ReferenceCollectingCallback_visit_87227317451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9665 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term9751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term9751, term9751.getClass(), "type", -39);
        term9837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term10071 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term10071, term10071.getClass(), "referenceMap", null);
        setField(term10071, term10071.getClass(), "blockStack", null);
        setField(term10071, term10071.getClass(), "behavior", null);
        setField(term10071, term10071.getClass(), "compiler", null);
        setField(term10071, term10071.getClass(), "varFilter", null);
        term10072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10072, term10072.getClass(), "functionName", null);
        setBooleanField(term10072, term10072.getClass(), "itsNeedsActivation", false);
        setIntField(term10072, term10072.getClass(), "itsFunctionType", 0);
        setBooleanField(term10072, term10072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10072, term10072.getClass(), "encodedSourceStart", 0);
        setIntField(term10072, term10072.getClass(), "encodedSourceEnd", 0);
        setField(term10072, term10072.getClass(), "sourceName", null);
        setIntField(term10072, term10072.getClass(), "baseLineno", 0);
        setIntField(term10072, term10072.getClass(), "endLineno", 0);
        setField(term10072, term10072.getClass(), "functions", null);
        setField(term10072, term10072.getClass(), "regexps", null);
        setField(term10072, term10072.getClass(), "itsVariables", null);
        setField(term10072, term10072.getClass(), "itsConst", null);
        setField(term10072, term10072.getClass(), "itsVariableNames", null);
        setIntField(term10072, term10072.getClass(), "varStart", 0);
        setField(term10072, term10072.getClass(), "compilerData", null);
        setIntField(term10072, term10072.getClass(), "type", -39);
        setField(term10072, term10072.getClass(), "next", null);
        setField(term10072, term10072.getClass(), "first", null);
        setField(term10072, term10072.getClass(), "last", null);
        setField(term10072, term10072.getClass(), "propListHead", null);
        setIntField(term10072, term10072.getClass(), "sourcePosition", 0);
        setField(term10072, term10072.getClass(), "jsType", null);
        setField(term10072, term10072.getClass(), "parent", null);
        term10073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10073, term10073.getClass(), "functionName", null);
        setBooleanField(term10073, term10073.getClass(), "itsNeedsActivation", false);
        setIntField(term10073, term10073.getClass(), "itsFunctionType", 0);
        setBooleanField(term10073, term10073.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10073, term10073.getClass(), "encodedSourceStart", 0);
        setIntField(term10073, term10073.getClass(), "encodedSourceEnd", 0);
        setField(term10073, term10073.getClass(), "sourceName", null);
        setIntField(term10073, term10073.getClass(), "baseLineno", 0);
        setIntField(term10073, term10073.getClass(), "endLineno", 0);
        setField(term10073, term10073.getClass(), "functions", null);
        setField(term10073, term10073.getClass(), "regexps", null);
        setField(term10073, term10073.getClass(), "itsVariables", null);
        setField(term10073, term10073.getClass(), "itsConst", null);
        setField(term10073, term10073.getClass(), "itsVariableNames", null);
        setIntField(term10073, term10073.getClass(), "varStart", 0);
        setField(term10073, term10073.getClass(), "compilerData", null);
        setIntField(term10073, term10073.getClass(), "type", 0);
        setField(term10073, term10073.getClass(), "next", null);
        setField(term10073, term10073.getClass(), "first", null);
        setField(term10073, term10073.getClass(), "last", null);
        setField(term10073, term10073.getClass(), "propListHead", null);
        setIntField(term10073, term10073.getClass(), "sourcePosition", 0);
        setField(term10073, term10073.getClass(), "jsType", null);
        setField(term10073, term10073.getClass(), "parent", null);
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
        args[1] = term9751;
        args[2] = term9837;
        callMethod(klass, "visit", argTypes, term9665, args);
        assertTrue(recursiveEquals(term9665, term10071));
        assertTrue(recursiveEquals(term9751, term10073));
        assertTrue(recursiveEquals(term9837, null));
    }

};


