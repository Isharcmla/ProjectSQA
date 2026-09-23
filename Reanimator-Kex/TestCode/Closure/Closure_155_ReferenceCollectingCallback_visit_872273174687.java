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

public class ReferenceCollectingCallback_visit_872273174687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180345;
     Object term180566;
     Object term180523;
     Object term180985;
     Object term180986;
     Object term180987;

    public ReferenceCollectingCallback_visit_872273174687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180345 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term180566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180566, term180566.getClass(), "type", 0);
        term180523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term180523, term180523.getClass(), "type", 100);
        setField(term180523, term180523.getClass(), "first", term180566);
        term180985 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180985, term180985.getClass(), "referenceMap", null);
        setField(term180985, term180985.getClass(), "blockStack", null);
        setField(term180985, term180985.getClass(), "behavior", null);
        setField(term180985, term180985.getClass(), "compiler", null);
        setField(term180985, term180985.getClass(), "varFilter", null);
        term180986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180986, term180986.getClass(), "functionName", null);
        setBooleanField(term180986, term180986.getClass(), "itsNeedsActivation", false);
        setIntField(term180986, term180986.getClass(), "itsFunctionType", 0);
        setBooleanField(term180986, term180986.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180986, term180986.getClass(), "encodedSourceStart", 0);
        setIntField(term180986, term180986.getClass(), "encodedSourceEnd", 0);
        setField(term180986, term180986.getClass(), "sourceName", null);
        setIntField(term180986, term180986.getClass(), "baseLineno", 0);
        setIntField(term180986, term180986.getClass(), "endLineno", 0);
        setField(term180986, term180986.getClass(), "functions", null);
        setField(term180986, term180986.getClass(), "regexps", null);
        setField(term180986, term180986.getClass(), "itsVariables", null);
        setField(term180986, term180986.getClass(), "itsConst", null);
        setField(term180986, term180986.getClass(), "itsVariableNames", null);
        setIntField(term180986, term180986.getClass(), "varStart", 0);
        setField(term180986, term180986.getClass(), "compilerData", null);
        setIntField(term180986, term180986.getClass(), "type", 0);
        setField(term180986, term180986.getClass(), "next", null);
        setField(term180986, term180986.getClass(), "first", null);
        setField(term180986, term180986.getClass(), "last", null);
        setField(term180986, term180986.getClass(), "propListHead", null);
        setIntField(term180986, term180986.getClass(), "sourcePosition", 0);
        setField(term180986, term180986.getClass(), "jsType", null);
        setField(term180986, term180986.getClass(), "parent", null);
        term180987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180987, term180987.getClass(), "str", null);
        setIntField(term180987, term180987.getClass(), "type", 100);
        setField(term180987, term180987.getClass(), "next", null);
        setField(term180988, term180988.getClass(), "functionName", null);
        setBooleanField(term180988, term180988.getClass(), "itsNeedsActivation", false);
        setIntField(term180988, term180988.getClass(), "itsFunctionType", 0);
        setBooleanField(term180988, term180988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180988, term180988.getClass(), "encodedSourceStart", 0);
        setIntField(term180988, term180988.getClass(), "encodedSourceEnd", 0);
        setField(term180988, term180988.getClass(), "sourceName", null);
        setIntField(term180988, term180988.getClass(), "baseLineno", 0);
        setIntField(term180988, term180988.getClass(), "endLineno", 0);
        setField(term180988, term180988.getClass(), "functions", null);
        setField(term180988, term180988.getClass(), "regexps", null);
        setField(term180988, term180988.getClass(), "itsVariables", null);
        setField(term180988, term180988.getClass(), "itsConst", null);
        setField(term180988, term180988.getClass(), "itsVariableNames", null);
        setIntField(term180988, term180988.getClass(), "varStart", 0);
        setField(term180988, term180988.getClass(), "compilerData", null);
        setIntField(term180988, term180988.getClass(), "type", 0);
        setField(term180988, term180988.getClass(), "next", null);
        setField(term180988, term180988.getClass(), "first", null);
        setField(term180988, term180988.getClass(), "last", null);
        setField(term180988, term180988.getClass(), "propListHead", null);
        setIntField(term180988, term180988.getClass(), "sourcePosition", 0);
        setField(term180988, term180988.getClass(), "jsType", null);
        setField(term180988, term180988.getClass(), "parent", null);
        setField(term180987, term180987.getClass(), "first", term180988);
        setField(term180987, term180987.getClass(), "last", null);
        setField(term180987, term180987.getClass(), "propListHead", null);
        setIntField(term180987, term180987.getClass(), "sourcePosition", 0);
        setField(term180987, term180987.getClass(), "jsType", null);
        setField(term180987, term180987.getClass(), "parent", null);
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
        args[1] = term180566;
        args[2] = term180523;
        callMethod(klass, "visit", argTypes, term180345, args);
        assertTrue(recursiveEquals(term180345, term180985));
        assertTrue(recursiveEquals(term180566, term180987));
        assertTrue(recursiveEquals(term180523, null));
    }

};


