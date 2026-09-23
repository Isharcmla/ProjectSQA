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

public class ReferenceCollectingCallback_shouldTraverse_4228556841000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254308;
     Object term254394;
     Object term254480;
     Object term254535;
     Object term254536;
     Object term254537;

    public ReferenceCollectingCallback_shouldTraverse_4228556841000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254308 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term254394 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term254480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term254480, term254480.getClass(), "type", 4);
        term254535 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term254535, term254535.getClass(), "referenceMap", null);
        setField(term254535, term254535.getClass(), "blockStack", null);
        setField(term254535, term254535.getClass(), "behavior", null);
        setField(term254535, term254535.getClass(), "compiler", null);
        setField(term254535, term254535.getClass(), "varFilter", null);
        term254536 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term254536, term254536.getClass(), "functionName", null);
        setBooleanField(term254536, term254536.getClass(), "itsNeedsActivation", false);
        setIntField(term254536, term254536.getClass(), "itsFunctionType", 0);
        setBooleanField(term254536, term254536.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term254536, term254536.getClass(), "encodedSourceStart", 0);
        setIntField(term254536, term254536.getClass(), "encodedSourceEnd", 0);
        setField(term254536, term254536.getClass(), "sourceName", null);
        setIntField(term254536, term254536.getClass(), "baseLineno", 0);
        setIntField(term254536, term254536.getClass(), "endLineno", 0);
        setField(term254536, term254536.getClass(), "functions", null);
        setField(term254536, term254536.getClass(), "regexps", null);
        setField(term254536, term254536.getClass(), "itsVariables", null);
        setField(term254536, term254536.getClass(), "itsConst", null);
        setField(term254536, term254536.getClass(), "itsVariableNames", null);
        setIntField(term254536, term254536.getClass(), "varStart", 0);
        setField(term254536, term254536.getClass(), "compilerData", null);
        setIntField(term254536, term254536.getClass(), "type", 4);
        setField(term254536, term254536.getClass(), "next", null);
        setField(term254536, term254536.getClass(), "first", null);
        setField(term254536, term254536.getClass(), "last", null);
        setField(term254536, term254536.getClass(), "propListHead", null);
        setIntField(term254536, term254536.getClass(), "sourcePosition", 0);
        setField(term254536, term254536.getClass(), "jsType", null);
        setField(term254536, term254536.getClass(), "parent", null);
        term254537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term254537, term254537.getClass(), "functionName", null);
        setBooleanField(term254537, term254537.getClass(), "itsNeedsActivation", false);
        setIntField(term254537, term254537.getClass(), "itsFunctionType", 0);
        setBooleanField(term254537, term254537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term254537, term254537.getClass(), "encodedSourceStart", 0);
        setIntField(term254537, term254537.getClass(), "encodedSourceEnd", 0);
        setField(term254537, term254537.getClass(), "sourceName", null);
        setIntField(term254537, term254537.getClass(), "baseLineno", 0);
        setIntField(term254537, term254537.getClass(), "endLineno", 0);
        setField(term254537, term254537.getClass(), "functions", null);
        setField(term254537, term254537.getClass(), "regexps", null);
        setField(term254537, term254537.getClass(), "itsVariables", null);
        setField(term254537, term254537.getClass(), "itsConst", null);
        setField(term254537, term254537.getClass(), "itsVariableNames", null);
        setIntField(term254537, term254537.getClass(), "varStart", 0);
        setField(term254537, term254537.getClass(), "compilerData", null);
        setIntField(term254537, term254537.getClass(), "type", 0);
        setField(term254537, term254537.getClass(), "next", null);
        setField(term254537, term254537.getClass(), "first", null);
        setField(term254537, term254537.getClass(), "last", null);
        setField(term254537, term254537.getClass(), "propListHead", null);
        setIntField(term254537, term254537.getClass(), "sourcePosition", 0);
        setField(term254537, term254537.getClass(), "jsType", null);
        setField(term254537, term254537.getClass(), "parent", null);
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
        args[1] = term254394;
        args[2] = term254480;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term254308, args);
        assertTrue(recursiveEquals(term254308, term254535));
        assertTrue(recursiveEquals(term254394, term254537));
        assertTrue(recursiveEquals(term254480, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


