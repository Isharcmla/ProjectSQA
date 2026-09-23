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

public class ReferenceCollectingCallback_visit_872273174512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139795;
     Object term139887;
     Object term139973;
     Object term140035;
     Object term140036;
     Object term140037;

    public ReferenceCollectingCallback_visit_872273174512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139795 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term139887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term139887, term139887.getClass(), "type", -39);
        term139973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term140035 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term140035, term140035.getClass(), "referenceMap", null);
        setField(term140035, term140035.getClass(), "blockStack", null);
        setField(term140035, term140035.getClass(), "behavior", null);
        setField(term140035, term140035.getClass(), "compiler", null);
        setField(term140035, term140035.getClass(), "varFilter", null);
        term140036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term140036, term140036.getClass(), "number", 0.0);
        setIntField(term140036, term140036.getClass(), "type", -39);
        setField(term140036, term140036.getClass(), "next", null);
        setField(term140036, term140036.getClass(), "first", null);
        setField(term140036, term140036.getClass(), "last", null);
        setField(term140036, term140036.getClass(), "propListHead", null);
        setIntField(term140036, term140036.getClass(), "sourcePosition", 0);
        setField(term140036, term140036.getClass(), "jsType", null);
        setField(term140036, term140036.getClass(), "parent", null);
        term140037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140037, term140037.getClass(), "functionName", null);
        setBooleanField(term140037, term140037.getClass(), "itsNeedsActivation", false);
        setIntField(term140037, term140037.getClass(), "itsFunctionType", 0);
        setBooleanField(term140037, term140037.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140037, term140037.getClass(), "encodedSourceStart", 0);
        setIntField(term140037, term140037.getClass(), "encodedSourceEnd", 0);
        setField(term140037, term140037.getClass(), "sourceName", null);
        setIntField(term140037, term140037.getClass(), "baseLineno", 0);
        setIntField(term140037, term140037.getClass(), "endLineno", 0);
        setField(term140037, term140037.getClass(), "functions", null);
        setField(term140037, term140037.getClass(), "regexps", null);
        setField(term140037, term140037.getClass(), "itsVariables", null);
        setField(term140037, term140037.getClass(), "itsConst", null);
        setField(term140037, term140037.getClass(), "itsVariableNames", null);
        setIntField(term140037, term140037.getClass(), "varStart", 0);
        setField(term140037, term140037.getClass(), "compilerData", null);
        setIntField(term140037, term140037.getClass(), "type", 0);
        setField(term140037, term140037.getClass(), "next", null);
        setField(term140037, term140037.getClass(), "first", null);
        setField(term140037, term140037.getClass(), "last", null);
        setField(term140037, term140037.getClass(), "propListHead", null);
        setIntField(term140037, term140037.getClass(), "sourcePosition", 0);
        setField(term140037, term140037.getClass(), "jsType", null);
        setField(term140037, term140037.getClass(), "parent", null);
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
        args[1] = term139887;
        args[2] = term139973;
        callMethod(klass, "visit", argTypes, term139795, args);
        assertTrue(recursiveEquals(term139795, term140035));
        assertTrue(recursiveEquals(term139887, term140037));
        assertTrue(recursiveEquals(term139973, null));
    }

};


