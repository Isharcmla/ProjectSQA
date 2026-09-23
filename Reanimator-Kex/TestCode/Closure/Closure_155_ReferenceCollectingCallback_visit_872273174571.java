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

public class ReferenceCollectingCallback_visit_872273174571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146987;
     Object term147208;
     Object term147165;
     Object term147961;
     Object term147962;
     Object term147963;

    public ReferenceCollectingCallback_visit_872273174571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146987 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term147208 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term147208, term147208.getClass(), "type", 0);
        term147165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term147165, term147165.getClass(), "type", 101);
        setField(term147165, term147165.getClass(), "first", term147208);
        term147961 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term147961, term147961.getClass(), "referenceMap", null);
        setField(term147961, term147961.getClass(), "blockStack", null);
        setField(term147961, term147961.getClass(), "behavior", null);
        setField(term147961, term147961.getClass(), "compiler", null);
        setField(term147961, term147961.getClass(), "varFilter", null);
        term147962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term147962, term147962.getClass(), "functionName", null);
        setBooleanField(term147962, term147962.getClass(), "itsNeedsActivation", false);
        setIntField(term147962, term147962.getClass(), "itsFunctionType", 0);
        setBooleanField(term147962, term147962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147962, term147962.getClass(), "encodedSourceStart", 0);
        setIntField(term147962, term147962.getClass(), "encodedSourceEnd", 0);
        setField(term147962, term147962.getClass(), "sourceName", null);
        setIntField(term147962, term147962.getClass(), "baseLineno", 0);
        setIntField(term147962, term147962.getClass(), "endLineno", 0);
        setField(term147962, term147962.getClass(), "functions", null);
        setField(term147962, term147962.getClass(), "regexps", null);
        setField(term147962, term147962.getClass(), "itsVariables", null);
        setField(term147962, term147962.getClass(), "itsConst", null);
        setField(term147962, term147962.getClass(), "itsVariableNames", null);
        setIntField(term147962, term147962.getClass(), "varStart", 0);
        setField(term147962, term147962.getClass(), "compilerData", null);
        setIntField(term147962, term147962.getClass(), "type", 0);
        setField(term147962, term147962.getClass(), "next", null);
        setField(term147962, term147962.getClass(), "first", null);
        setField(term147962, term147962.getClass(), "last", null);
        setField(term147962, term147962.getClass(), "propListHead", null);
        setIntField(term147962, term147962.getClass(), "sourcePosition", 0);
        setField(term147962, term147962.getClass(), "jsType", null);
        setField(term147962, term147962.getClass(), "parent", null);
        term147963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term147963, term147963.getClass(), "str", null);
        setIntField(term147963, term147963.getClass(), "type", 101);
        setField(term147963, term147963.getClass(), "next", null);
        setField(term147964, term147964.getClass(), "functionName", null);
        setBooleanField(term147964, term147964.getClass(), "itsNeedsActivation", false);
        setIntField(term147964, term147964.getClass(), "itsFunctionType", 0);
        setBooleanField(term147964, term147964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147964, term147964.getClass(), "encodedSourceStart", 0);
        setIntField(term147964, term147964.getClass(), "encodedSourceEnd", 0);
        setField(term147964, term147964.getClass(), "sourceName", null);
        setIntField(term147964, term147964.getClass(), "baseLineno", 0);
        setIntField(term147964, term147964.getClass(), "endLineno", 0);
        setField(term147964, term147964.getClass(), "functions", null);
        setField(term147964, term147964.getClass(), "regexps", null);
        setField(term147964, term147964.getClass(), "itsVariables", null);
        setField(term147964, term147964.getClass(), "itsConst", null);
        setField(term147964, term147964.getClass(), "itsVariableNames", null);
        setIntField(term147964, term147964.getClass(), "varStart", 0);
        setField(term147964, term147964.getClass(), "compilerData", null);
        setIntField(term147964, term147964.getClass(), "type", 0);
        setField(term147964, term147964.getClass(), "next", null);
        setField(term147964, term147964.getClass(), "first", null);
        setField(term147964, term147964.getClass(), "last", null);
        setField(term147964, term147964.getClass(), "propListHead", null);
        setIntField(term147964, term147964.getClass(), "sourcePosition", 0);
        setField(term147964, term147964.getClass(), "jsType", null);
        setField(term147964, term147964.getClass(), "parent", null);
        setField(term147963, term147963.getClass(), "first", term147964);
        setField(term147963, term147963.getClass(), "last", null);
        setField(term147963, term147963.getClass(), "propListHead", null);
        setIntField(term147963, term147963.getClass(), "sourcePosition", 0);
        setField(term147963, term147963.getClass(), "jsType", null);
        setField(term147963, term147963.getClass(), "parent", null);
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
        args[1] = term147208;
        args[2] = term147165;
        callMethod(klass, "visit", argTypes, term146987, args);
        assertTrue(recursiveEquals(term146987, term147961));
        assertTrue(recursiveEquals(term147208, term147963));
        assertTrue(recursiveEquals(term147165, null));
    }

};


