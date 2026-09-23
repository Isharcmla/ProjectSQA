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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644877;
     Object term2644963;
     Object term2645996;
     Object term2645997;
     Object term2645922;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644877 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2644963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2645055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2645125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2644963, term2644963.getClass(), "type", 37);
        setIntField(term2645055, term2645055.getClass(), "type", 35);
        setField(term2645125, term2645125.getClass(), "next", term2645217);
        setIntField(term2645125, term2645125.getClass(), "type", 40);
        setField(term2645055, term2645055.getClass(), "first", term2645125);
        setField(term2644963, term2644963.getClass(), "first", term2645055);
        term2645996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2645996, term2645996.getClass(), "currentTraversal", null);
        term2645997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2645998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2645999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2645997, term2645997.getClass(), "functionName", null);
        setBooleanField(term2645997, term2645997.getClass(), "itsNeedsActivation", false);
        setIntField(term2645997, term2645997.getClass(), "itsFunctionType", 0);
        setBooleanField(term2645997, term2645997.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2645997, term2645997.getClass(), "encodedSourceStart", 0);
        setIntField(term2645997, term2645997.getClass(), "encodedSourceEnd", 0);
        setField(term2645997, term2645997.getClass(), "sourceName", null);
        setIntField(term2645997, term2645997.getClass(), "baseLineno", 0);
        setIntField(term2645997, term2645997.getClass(), "endLineno", 0);
        setField(term2645997, term2645997.getClass(), "functions", null);
        setField(term2645997, term2645997.getClass(), "regexps", null);
        setField(term2645997, term2645997.getClass(), "itsVariables", null);
        setField(term2645997, term2645997.getClass(), "itsConst", null);
        setField(term2645997, term2645997.getClass(), "itsVariableNames", null);
        setIntField(term2645997, term2645997.getClass(), "varStart", 0);
        setField(term2645997, term2645997.getClass(), "compilerData", null);
        setIntField(term2645997, term2645997.getClass(), "type", 37);
        setField(term2645997, term2645997.getClass(), "next", null);
        setDoubleField(term2645998, term2645998.getClass(), "number", 0.0);
        setIntField(term2645998, term2645998.getClass(), "type", 35);
        setField(term2645998, term2645998.getClass(), "next", null);
        setIntField(term2645999, term2645999.getClass(), "type", 40);
        setDoubleField(term2646000, term2646000.getClass(), "number", 0.0);
        setIntField(term2646000, term2646000.getClass(), "type", 0);
        setField(term2646000, term2646000.getClass(), "next", null);
        setField(term2646000, term2646000.getClass(), "first", null);
        setField(term2646000, term2646000.getClass(), "last", null);
        setField(term2646000, term2646000.getClass(), "propListHead", null);
        setIntField(term2646000, term2646000.getClass(), "sourcePosition", 0);
        setField(term2646000, term2646000.getClass(), "jsType", null);
        setField(term2646000, term2646000.getClass(), "parent", null);
        setField(term2645999, term2645999.getClass(), "next", term2646000);
        setField(term2645999, term2645999.getClass(), "first", null);
        setField(term2645999, term2645999.getClass(), "last", null);
        setField(term2645999, term2645999.getClass(), "propListHead", null);
        setIntField(term2645999, term2645999.getClass(), "sourcePosition", 0);
        setField(term2645999, term2645999.getClass(), "jsType", null);
        setField(term2645999, term2645999.getClass(), "parent", null);
        setField(term2645998, term2645998.getClass(), "first", term2645999);
        setField(term2645998, term2645998.getClass(), "last", null);
        setField(term2645998, term2645998.getClass(), "propListHead", null);
        setIntField(term2645998, term2645998.getClass(), "sourcePosition", 0);
        setField(term2645998, term2645998.getClass(), "jsType", null);
        setField(term2645998, term2645998.getClass(), "parent", null);
        setField(term2645997, term2645997.getClass(), "first", term2645998);
        setField(term2645997, term2645997.getClass(), "last", null);
        setField(term2645997, term2645997.getClass(), "propListHead", null);
        setIntField(term2645997, term2645997.getClass(), "sourcePosition", 0);
        setField(term2645997, term2645997.getClass(), "jsType", null);
        setField(term2645997, term2645997.getClass(), "parent", null);
        term2645922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2645932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2645935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2645922, term2645922.getClass(), "functionName", null);
        setBooleanField(term2645922, term2645922.getClass(), "itsNeedsActivation", false);
        setIntField(term2645922, term2645922.getClass(), "itsFunctionType", 0);
        setBooleanField(term2645922, term2645922.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2645922, term2645922.getClass(), "encodedSourceStart", 0);
        setIntField(term2645922, term2645922.getClass(), "encodedSourceEnd", 0);
        setField(term2645922, term2645922.getClass(), "sourceName", null);
        setIntField(term2645922, term2645922.getClass(), "baseLineno", 0);
        setIntField(term2645922, term2645922.getClass(), "endLineno", 0);
        setField(term2645922, term2645922.getClass(), "functions", null);
        setField(term2645922, term2645922.getClass(), "regexps", null);
        setField(term2645922, term2645922.getClass(), "itsVariables", null);
        setField(term2645922, term2645922.getClass(), "itsConst", null);
        setField(term2645922, term2645922.getClass(), "itsVariableNames", null);
        setIntField(term2645922, term2645922.getClass(), "varStart", 0);
        setField(term2645922, term2645922.getClass(), "compilerData", null);
        setIntField(term2645922, term2645922.getClass(), "type", 37);
        setField(term2645922, term2645922.getClass(), "next", null);
        setDoubleField(term2645932, term2645932.getClass(), "number", 0.0);
        setIntField(term2645932, term2645932.getClass(), "type", 35);
        setField(term2645932, term2645932.getClass(), "next", null);
        setIntField(term2645935, term2645935.getClass(), "type", 40);
        setDoubleField(term2645937, term2645937.getClass(), "number", 0.0);
        setIntField(term2645937, term2645937.getClass(), "type", 0);
        setField(term2645937, term2645937.getClass(), "next", null);
        setField(term2645937, term2645937.getClass(), "first", null);
        setField(term2645937, term2645937.getClass(), "last", null);
        setField(term2645937, term2645937.getClass(), "propListHead", null);
        setIntField(term2645937, term2645937.getClass(), "sourcePosition", 0);
        setField(term2645937, term2645937.getClass(), "jsType", null);
        setField(term2645937, term2645937.getClass(), "parent", null);
        setField(term2645935, term2645935.getClass(), "next", term2645937);
        setField(term2645935, term2645935.getClass(), "first", null);
        setField(term2645935, term2645935.getClass(), "last", null);
        setField(term2645935, term2645935.getClass(), "propListHead", null);
        setIntField(term2645935, term2645935.getClass(), "sourcePosition", 0);
        setField(term2645935, term2645935.getClass(), "jsType", null);
        setField(term2645935, term2645935.getClass(), "parent", null);
        setField(term2645932, term2645932.getClass(), "first", term2645935);
        setField(term2645932, term2645932.getClass(), "last", null);
        setField(term2645932, term2645932.getClass(), "propListHead", null);
        setIntField(term2645932, term2645932.getClass(), "sourcePosition", 0);
        setField(term2645932, term2645932.getClass(), "jsType", null);
        setField(term2645932, term2645932.getClass(), "parent", null);
        setField(term2645922, term2645922.getClass(), "first", term2645932);
        setField(term2645922, term2645922.getClass(), "last", null);
        setField(term2645922, term2645922.getClass(), "propListHead", null);
        setIntField(term2645922, term2645922.getClass(), "sourcePosition", 0);
        setField(term2645922, term2645922.getClass(), "jsType", null);
        setField(term2645922, term2645922.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2644963;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2644877, args);
        assertTrue(recursiveEquals(term2644877, term2645996));
        assertTrue(recursiveEquals(term2644963, term2645997));
        assertTrue(recursiveEquals(retValue, term2645922));
    }

};


