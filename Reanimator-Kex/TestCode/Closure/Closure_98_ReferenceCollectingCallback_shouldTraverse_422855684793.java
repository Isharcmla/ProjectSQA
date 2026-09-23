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

public class ReferenceCollectingCallback_shouldTraverse_422855684793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211016;
     Object term211102;
     Object term211194;
     Object term211237;
     Object term211238;
     Object term211239;

    public ReferenceCollectingCallback_shouldTraverse_422855684793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211016 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term211102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term211194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term211194, term211194.getClass(), "type", 4);
        term211237 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term211237, term211237.getClass(), "referenceMap", null);
        setField(term211237, term211237.getClass(), "blockStack", null);
        setField(term211237, term211237.getClass(), "behavior", null);
        setField(term211237, term211237.getClass(), "compiler", null);
        setField(term211237, term211237.getClass(), "varFilter", null);
        term211238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211238, term211238.getClass(), "str", null);
        setIntField(term211238, term211238.getClass(), "type", 4);
        setField(term211238, term211238.getClass(), "next", null);
        setField(term211238, term211238.getClass(), "first", null);
        setField(term211238, term211238.getClass(), "last", null);
        setField(term211238, term211238.getClass(), "propListHead", null);
        setIntField(term211238, term211238.getClass(), "sourcePosition", 0);
        setField(term211238, term211238.getClass(), "jsType", null);
        setField(term211238, term211238.getClass(), "parent", null);
        term211239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211239, term211239.getClass(), "functionName", null);
        setBooleanField(term211239, term211239.getClass(), "itsNeedsActivation", false);
        setIntField(term211239, term211239.getClass(), "itsFunctionType", 0);
        setBooleanField(term211239, term211239.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211239, term211239.getClass(), "encodedSourceStart", 0);
        setIntField(term211239, term211239.getClass(), "encodedSourceEnd", 0);
        setField(term211239, term211239.getClass(), "sourceName", null);
        setIntField(term211239, term211239.getClass(), "baseLineno", 0);
        setIntField(term211239, term211239.getClass(), "endLineno", 0);
        setField(term211239, term211239.getClass(), "functions", null);
        setField(term211239, term211239.getClass(), "regexps", null);
        setField(term211239, term211239.getClass(), "itsVariables", null);
        setField(term211239, term211239.getClass(), "itsConst", null);
        setField(term211239, term211239.getClass(), "itsVariableNames", null);
        setIntField(term211239, term211239.getClass(), "varStart", 0);
        setField(term211239, term211239.getClass(), "compilerData", null);
        setIntField(term211239, term211239.getClass(), "type", 0);
        setField(term211239, term211239.getClass(), "next", null);
        setField(term211239, term211239.getClass(), "first", null);
        setField(term211239, term211239.getClass(), "last", null);
        setField(term211239, term211239.getClass(), "propListHead", null);
        setIntField(term211239, term211239.getClass(), "sourcePosition", 0);
        setField(term211239, term211239.getClass(), "jsType", null);
        setField(term211239, term211239.getClass(), "parent", null);
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
        args[1] = term211102;
        args[2] = term211194;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term211016, args);
        assertTrue(recursiveEquals(term211016, term211237));
        assertTrue(recursiveEquals(term211102, term211239));
        assertTrue(recursiveEquals(term211194, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


