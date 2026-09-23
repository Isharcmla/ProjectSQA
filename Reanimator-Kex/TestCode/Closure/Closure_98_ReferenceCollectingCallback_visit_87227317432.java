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

public class ReferenceCollectingCallback_visit_87227317432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5031;
     Object term5117;
     Object term5203;
     Object term5770;
     Object term5771;
     Object term5772;

    public ReferenceCollectingCallback_visit_87227317432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5031 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term5117 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term5117, term5117.getClass(), "type", -39);
        term5203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term5770 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term5770, term5770.getClass(), "referenceMap", null);
        setField(term5770, term5770.getClass(), "blockStack", null);
        setField(term5770, term5770.getClass(), "behavior", null);
        setField(term5770, term5770.getClass(), "compiler", null);
        setField(term5770, term5770.getClass(), "varFilter", null);
        term5771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5771, term5771.getClass(), "functionName", null);
        setBooleanField(term5771, term5771.getClass(), "itsNeedsActivation", false);
        setIntField(term5771, term5771.getClass(), "itsFunctionType", 0);
        setBooleanField(term5771, term5771.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5771, term5771.getClass(), "encodedSourceStart", 0);
        setIntField(term5771, term5771.getClass(), "encodedSourceEnd", 0);
        setField(term5771, term5771.getClass(), "sourceName", null);
        setIntField(term5771, term5771.getClass(), "baseLineno", 0);
        setIntField(term5771, term5771.getClass(), "endLineno", 0);
        setField(term5771, term5771.getClass(), "functions", null);
        setField(term5771, term5771.getClass(), "regexps", null);
        setField(term5771, term5771.getClass(), "itsVariables", null);
        setField(term5771, term5771.getClass(), "itsConst", null);
        setField(term5771, term5771.getClass(), "itsVariableNames", null);
        setIntField(term5771, term5771.getClass(), "varStart", 0);
        setField(term5771, term5771.getClass(), "compilerData", null);
        setIntField(term5771, term5771.getClass(), "type", -39);
        setField(term5771, term5771.getClass(), "next", null);
        setField(term5771, term5771.getClass(), "first", null);
        setField(term5771, term5771.getClass(), "last", null);
        setField(term5771, term5771.getClass(), "propListHead", null);
        setIntField(term5771, term5771.getClass(), "sourcePosition", 0);
        setField(term5771, term5771.getClass(), "jsType", null);
        setField(term5771, term5771.getClass(), "parent", null);
        term5772 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5772, term5772.getClass(), "functionName", null);
        setBooleanField(term5772, term5772.getClass(), "itsNeedsActivation", false);
        setIntField(term5772, term5772.getClass(), "itsFunctionType", 0);
        setBooleanField(term5772, term5772.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5772, term5772.getClass(), "encodedSourceStart", 0);
        setIntField(term5772, term5772.getClass(), "encodedSourceEnd", 0);
        setField(term5772, term5772.getClass(), "sourceName", null);
        setIntField(term5772, term5772.getClass(), "baseLineno", 0);
        setIntField(term5772, term5772.getClass(), "endLineno", 0);
        setField(term5772, term5772.getClass(), "functions", null);
        setField(term5772, term5772.getClass(), "regexps", null);
        setField(term5772, term5772.getClass(), "itsVariables", null);
        setField(term5772, term5772.getClass(), "itsConst", null);
        setField(term5772, term5772.getClass(), "itsVariableNames", null);
        setIntField(term5772, term5772.getClass(), "varStart", 0);
        setField(term5772, term5772.getClass(), "compilerData", null);
        setIntField(term5772, term5772.getClass(), "type", 0);
        setField(term5772, term5772.getClass(), "next", null);
        setField(term5772, term5772.getClass(), "first", null);
        setField(term5772, term5772.getClass(), "last", null);
        setField(term5772, term5772.getClass(), "propListHead", null);
        setIntField(term5772, term5772.getClass(), "sourcePosition", 0);
        setField(term5772, term5772.getClass(), "jsType", null);
        setField(term5772, term5772.getClass(), "parent", null);
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
        args[1] = term5117;
        args[2] = term5203;
        callMethod(klass, "visit", argTypes, term5031, args);
        assertTrue(recursiveEquals(term5031, term5770));
        assertTrue(recursiveEquals(term5117, term5772));
        assertTrue(recursiveEquals(term5203, null));
    }

};


