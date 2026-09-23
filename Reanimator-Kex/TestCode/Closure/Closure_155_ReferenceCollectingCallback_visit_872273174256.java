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

public class ReferenceCollectingCallback_visit_872273174256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61546;
     Object term61632;
     Object term61724;
     Object term62384;
     Object term62385;
     Object term62386;

    public ReferenceCollectingCallback_visit_872273174256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61546 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term61632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term61632, term61632.getClass(), "type", -39);
        term61724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term62384 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term62384, term62384.getClass(), "referenceMap", null);
        setField(term62384, term62384.getClass(), "blockStack", null);
        setField(term62384, term62384.getClass(), "behavior", null);
        setField(term62384, term62384.getClass(), "compiler", null);
        setField(term62384, term62384.getClass(), "varFilter", null);
        term62385 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62385, term62385.getClass(), "functionName", null);
        setBooleanField(term62385, term62385.getClass(), "itsNeedsActivation", false);
        setIntField(term62385, term62385.getClass(), "itsFunctionType", 0);
        setBooleanField(term62385, term62385.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62385, term62385.getClass(), "encodedSourceStart", 0);
        setIntField(term62385, term62385.getClass(), "encodedSourceEnd", 0);
        setField(term62385, term62385.getClass(), "sourceName", null);
        setIntField(term62385, term62385.getClass(), "baseLineno", 0);
        setIntField(term62385, term62385.getClass(), "endLineno", 0);
        setField(term62385, term62385.getClass(), "functions", null);
        setField(term62385, term62385.getClass(), "regexps", null);
        setField(term62385, term62385.getClass(), "itsVariables", null);
        setField(term62385, term62385.getClass(), "itsConst", null);
        setField(term62385, term62385.getClass(), "itsVariableNames", null);
        setIntField(term62385, term62385.getClass(), "varStart", 0);
        setField(term62385, term62385.getClass(), "compilerData", null);
        setIntField(term62385, term62385.getClass(), "type", -39);
        setField(term62385, term62385.getClass(), "next", null);
        setField(term62385, term62385.getClass(), "first", null);
        setField(term62385, term62385.getClass(), "last", null);
        setField(term62385, term62385.getClass(), "propListHead", null);
        setIntField(term62385, term62385.getClass(), "sourcePosition", 0);
        setField(term62385, term62385.getClass(), "jsType", null);
        setField(term62385, term62385.getClass(), "parent", null);
        term62386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62386, term62386.getClass(), "number", 0.0);
        setIntField(term62386, term62386.getClass(), "type", 0);
        setField(term62386, term62386.getClass(), "next", null);
        setField(term62386, term62386.getClass(), "first", null);
        setField(term62386, term62386.getClass(), "last", null);
        setField(term62386, term62386.getClass(), "propListHead", null);
        setIntField(term62386, term62386.getClass(), "sourcePosition", 0);
        setField(term62386, term62386.getClass(), "jsType", null);
        setField(term62386, term62386.getClass(), "parent", null);
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
        args[1] = term61632;
        args[2] = term61724;
        callMethod(klass, "visit", argTypes, term61546, args);
        assertTrue(recursiveEquals(term61546, term62384));
        assertTrue(recursiveEquals(term61632, term62386));
        assertTrue(recursiveEquals(term61724, null));
    }

};


