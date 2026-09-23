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

public class ReferenceCollectingCallback_visit_87227317480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14010;
     Object term14096;
     Object term14182;
     Object term14819;
     Object term14820;
     Object term14821;

    public ReferenceCollectingCallback_visit_87227317480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14010 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term14096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term14096, term14096.getClass(), "type", -39);
        term14182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term14819 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term14819, term14819.getClass(), "referenceMap", null);
        setField(term14819, term14819.getClass(), "blockStack", null);
        setField(term14819, term14819.getClass(), "behavior", null);
        setField(term14819, term14819.getClass(), "compiler", null);
        setField(term14819, term14819.getClass(), "varFilter", null);
        term14820 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14820, term14820.getClass(), "functionName", null);
        setBooleanField(term14820, term14820.getClass(), "itsNeedsActivation", false);
        setIntField(term14820, term14820.getClass(), "itsFunctionType", 0);
        setBooleanField(term14820, term14820.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14820, term14820.getClass(), "encodedSourceStart", 0);
        setIntField(term14820, term14820.getClass(), "encodedSourceEnd", 0);
        setField(term14820, term14820.getClass(), "sourceName", null);
        setIntField(term14820, term14820.getClass(), "baseLineno", 0);
        setIntField(term14820, term14820.getClass(), "endLineno", 0);
        setField(term14820, term14820.getClass(), "functions", null);
        setField(term14820, term14820.getClass(), "regexps", null);
        setField(term14820, term14820.getClass(), "itsVariables", null);
        setField(term14820, term14820.getClass(), "itsConst", null);
        setField(term14820, term14820.getClass(), "itsVariableNames", null);
        setIntField(term14820, term14820.getClass(), "varStart", 0);
        setField(term14820, term14820.getClass(), "compilerData", null);
        setIntField(term14820, term14820.getClass(), "type", -39);
        setField(term14820, term14820.getClass(), "next", null);
        setField(term14820, term14820.getClass(), "first", null);
        setField(term14820, term14820.getClass(), "last", null);
        setField(term14820, term14820.getClass(), "propListHead", null);
        setIntField(term14820, term14820.getClass(), "sourcePosition", 0);
        setField(term14820, term14820.getClass(), "jsType", null);
        setField(term14820, term14820.getClass(), "parent", null);
        term14821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14821, term14821.getClass(), "functionName", null);
        setBooleanField(term14821, term14821.getClass(), "itsNeedsActivation", false);
        setIntField(term14821, term14821.getClass(), "itsFunctionType", 0);
        setBooleanField(term14821, term14821.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14821, term14821.getClass(), "encodedSourceStart", 0);
        setIntField(term14821, term14821.getClass(), "encodedSourceEnd", 0);
        setField(term14821, term14821.getClass(), "sourceName", null);
        setIntField(term14821, term14821.getClass(), "baseLineno", 0);
        setIntField(term14821, term14821.getClass(), "endLineno", 0);
        setField(term14821, term14821.getClass(), "functions", null);
        setField(term14821, term14821.getClass(), "regexps", null);
        setField(term14821, term14821.getClass(), "itsVariables", null);
        setField(term14821, term14821.getClass(), "itsConst", null);
        setField(term14821, term14821.getClass(), "itsVariableNames", null);
        setIntField(term14821, term14821.getClass(), "varStart", 0);
        setField(term14821, term14821.getClass(), "compilerData", null);
        setIntField(term14821, term14821.getClass(), "type", 0);
        setField(term14821, term14821.getClass(), "next", null);
        setField(term14821, term14821.getClass(), "first", null);
        setField(term14821, term14821.getClass(), "last", null);
        setField(term14821, term14821.getClass(), "propListHead", null);
        setIntField(term14821, term14821.getClass(), "sourcePosition", 0);
        setField(term14821, term14821.getClass(), "jsType", null);
        setField(term14821, term14821.getClass(), "parent", null);
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
        args[1] = term14096;
        args[2] = term14182;
        callMethod(klass, "visit", argTypes, term14010, args);
        assertTrue(recursiveEquals(term14010, term14819));
        assertTrue(recursiveEquals(term14096, term14821));
        assertTrue(recursiveEquals(term14182, null));
    }

};


