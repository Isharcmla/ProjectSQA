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

public class ReferenceCollectingCallback_visit_872273174208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51296;
     Object term51520;
     Object term51474;
     Object term52085;
     Object term52086;
     Object term52087;

    public ReferenceCollectingCallback_visit_872273174208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51296 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term51520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term51520, term51520.getClass(), "type", 0);
        term51474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term51474, term51474.getClass(), "type", 108);
        setField(term51474, term51474.getClass(), "first", term51520);
        term52085 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term52085, term52085.getClass(), "referenceMap", null);
        setField(term52085, term52085.getClass(), "blockStack", null);
        setField(term52085, term52085.getClass(), "behavior", null);
        setField(term52085, term52085.getClass(), "compiler", null);
        setField(term52085, term52085.getClass(), "varFilter", null);
        term52086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52086, term52086.getClass(), "str", null);
        setIntField(term52086, term52086.getClass(), "type", 0);
        setField(term52086, term52086.getClass(), "next", null);
        setField(term52086, term52086.getClass(), "first", null);
        setField(term52086, term52086.getClass(), "last", null);
        setField(term52086, term52086.getClass(), "propListHead", null);
        setIntField(term52086, term52086.getClass(), "sourcePosition", 0);
        setField(term52086, term52086.getClass(), "jsType", null);
        setField(term52086, term52086.getClass(), "parent", null);
        term52087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term52088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52087, term52087.getClass(), "functionName", null);
        setBooleanField(term52087, term52087.getClass(), "itsNeedsActivation", false);
        setIntField(term52087, term52087.getClass(), "itsFunctionType", 0);
        setBooleanField(term52087, term52087.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term52087, term52087.getClass(), "encodedSourceStart", 0);
        setIntField(term52087, term52087.getClass(), "encodedSourceEnd", 0);
        setField(term52087, term52087.getClass(), "sourceName", null);
        setIntField(term52087, term52087.getClass(), "baseLineno", 0);
        setIntField(term52087, term52087.getClass(), "endLineno", 0);
        setField(term52087, term52087.getClass(), "functions", null);
        setField(term52087, term52087.getClass(), "regexps", null);
        setField(term52087, term52087.getClass(), "itsVariables", null);
        setField(term52087, term52087.getClass(), "itsConst", null);
        setField(term52087, term52087.getClass(), "itsVariableNames", null);
        setIntField(term52087, term52087.getClass(), "varStart", 0);
        setField(term52087, term52087.getClass(), "compilerData", null);
        setIntField(term52087, term52087.getClass(), "type", 108);
        setField(term52087, term52087.getClass(), "next", null);
        setField(term52088, term52088.getClass(), "str", null);
        setIntField(term52088, term52088.getClass(), "type", 0);
        setField(term52088, term52088.getClass(), "next", null);
        setField(term52088, term52088.getClass(), "first", null);
        setField(term52088, term52088.getClass(), "last", null);
        setField(term52088, term52088.getClass(), "propListHead", null);
        setIntField(term52088, term52088.getClass(), "sourcePosition", 0);
        setField(term52088, term52088.getClass(), "jsType", null);
        setField(term52088, term52088.getClass(), "parent", null);
        setField(term52087, term52087.getClass(), "first", term52088);
        setField(term52087, term52087.getClass(), "last", null);
        setField(term52087, term52087.getClass(), "propListHead", null);
        setIntField(term52087, term52087.getClass(), "sourcePosition", 0);
        setField(term52087, term52087.getClass(), "jsType", null);
        setField(term52087, term52087.getClass(), "parent", null);
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
        args[1] = term51520;
        args[2] = term51474;
        callMethod(klass, "visit", argTypes, term51296, args);
        assertTrue(recursiveEquals(term51296, term52085));
        assertTrue(recursiveEquals(term51520, term52087));
        assertTrue(recursiveEquals(term51474, null));
    }

};


