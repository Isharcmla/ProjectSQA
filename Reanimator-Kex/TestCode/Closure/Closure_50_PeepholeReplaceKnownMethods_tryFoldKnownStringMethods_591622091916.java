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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3764530;
     Object term3764616;
     Object term3765038;
     Object term3765039;
     Object term3764946;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3764530 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3764616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3764708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3764800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3764908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3764616, term3764616.getClass(), "type", 37);
        setIntField(term3764708, term3764708.getClass(), "type", 33);
        setField(term3764800, term3764800.getClass(), "next", term3764800);
        setIntField(term3764800, term3764800.getClass(), "type", 40);
        setField(term3764800, term3764800.getClass(), "str", "");
        setField(term3764708, term3764708.getClass(), "first", term3764800);
        setIntField(term3764908, term3764908.getClass(), "type", 41);
        setField(term3764708, term3764708.getClass(), "next", term3764908);
        setField(term3764616, term3764616.getClass(), "first", term3764708);
        term3765038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3765038, term3765038.getClass(), "currentTraversal", null);
        term3765039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3765040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3765041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3765042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3765039, term3765039.getClass(), "functionName", null);
        setBooleanField(term3765039, term3765039.getClass(), "itsNeedsActivation", false);
        setIntField(term3765039, term3765039.getClass(), "itsFunctionType", 0);
        setBooleanField(term3765039, term3765039.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3765039, term3765039.getClass(), "encodedSourceStart", 0);
        setIntField(term3765039, term3765039.getClass(), "encodedSourceEnd", 0);
        setField(term3765039, term3765039.getClass(), "sourceName", null);
        setIntField(term3765039, term3765039.getClass(), "baseLineno", 0);
        setIntField(term3765039, term3765039.getClass(), "endLineno", 0);
        setField(term3765039, term3765039.getClass(), "functions", null);
        setField(term3765039, term3765039.getClass(), "regexps", null);
        setField(term3765039, term3765039.getClass(), "itsVariables", null);
        setField(term3765039, term3765039.getClass(), "itsConst", null);
        setField(term3765039, term3765039.getClass(), "itsVariableNames", null);
        setIntField(term3765039, term3765039.getClass(), "varStart", 0);
        setField(term3765039, term3765039.getClass(), "compilerData", null);
        setIntField(term3765039, term3765039.getClass(), "type", 37);
        setField(term3765039, term3765039.getClass(), "next", null);
        setField(term3765040, term3765040.getClass(), "str", null);
        setIntField(term3765040, term3765040.getClass(), "type", 33);
        setIntField(term3765041, term3765041.getClass(), "type", 41);
        setField(term3765041, term3765041.getClass(), "next", null);
        setField(term3765041, term3765041.getClass(), "first", null);
        setField(term3765041, term3765041.getClass(), "last", null);
        setField(term3765041, term3765041.getClass(), "propListHead", null);
        setIntField(term3765041, term3765041.getClass(), "sourcePosition", 0);
        setField(term3765041, term3765041.getClass(), "jsType", null);
        setField(term3765041, term3765041.getClass(), "parent", null);
        setField(term3765040, term3765040.getClass(), "next", term3765041);
        setField(term3765042, term3765042.getClass(), "str", "");
        setIntField(term3765042, term3765042.getClass(), "type", 40);
        setField(term3765042, term3765042.getClass(), "next", term3765042);
        setField(term3765042, term3765042.getClass(), "first", null);
        setField(term3765042, term3765042.getClass(), "last", null);
        setField(term3765042, term3765042.getClass(), "propListHead", null);
        setIntField(term3765042, term3765042.getClass(), "sourcePosition", 0);
        setField(term3765042, term3765042.getClass(), "jsType", null);
        setField(term3765042, term3765042.getClass(), "parent", null);
        setField(term3765040, term3765040.getClass(), "first", term3765042);
        setField(term3765040, term3765040.getClass(), "last", null);
        setField(term3765040, term3765040.getClass(), "propListHead", null);
        setIntField(term3765040, term3765040.getClass(), "sourcePosition", 0);
        setField(term3765040, term3765040.getClass(), "jsType", null);
        setField(term3765040, term3765040.getClass(), "parent", null);
        setField(term3765039, term3765039.getClass(), "first", term3765040);
        setField(term3765039, term3765039.getClass(), "last", null);
        setField(term3765039, term3765039.getClass(), "propListHead", null);
        setIntField(term3765039, term3765039.getClass(), "sourcePosition", 0);
        setField(term3765039, term3765039.getClass(), "jsType", null);
        setField(term3765039, term3765039.getClass(), "parent", null);
        term3764946 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3764956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3764958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3764961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3764946, term3764946.getClass(), "functionName", null);
        setBooleanField(term3764946, term3764946.getClass(), "itsNeedsActivation", false);
        setIntField(term3764946, term3764946.getClass(), "itsFunctionType", 0);
        setBooleanField(term3764946, term3764946.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3764946, term3764946.getClass(), "encodedSourceStart", 0);
        setIntField(term3764946, term3764946.getClass(), "encodedSourceEnd", 0);
        setField(term3764946, term3764946.getClass(), "sourceName", null);
        setIntField(term3764946, term3764946.getClass(), "baseLineno", 0);
        setIntField(term3764946, term3764946.getClass(), "endLineno", 0);
        setField(term3764946, term3764946.getClass(), "functions", null);
        setField(term3764946, term3764946.getClass(), "regexps", null);
        setField(term3764946, term3764946.getClass(), "itsVariables", null);
        setField(term3764946, term3764946.getClass(), "itsConst", null);
        setField(term3764946, term3764946.getClass(), "itsVariableNames", null);
        setIntField(term3764946, term3764946.getClass(), "varStart", 0);
        setField(term3764946, term3764946.getClass(), "compilerData", null);
        setIntField(term3764946, term3764946.getClass(), "type", 37);
        setField(term3764946, term3764946.getClass(), "next", null);
        setField(term3764956, term3764956.getClass(), "str", null);
        setIntField(term3764956, term3764956.getClass(), "type", 33);
        setIntField(term3764958, term3764958.getClass(), "type", 41);
        setField(term3764958, term3764958.getClass(), "next", null);
        setField(term3764958, term3764958.getClass(), "first", null);
        setField(term3764958, term3764958.getClass(), "last", null);
        setField(term3764958, term3764958.getClass(), "propListHead", null);
        setIntField(term3764958, term3764958.getClass(), "sourcePosition", 0);
        setField(term3764958, term3764958.getClass(), "jsType", null);
        setField(term3764958, term3764958.getClass(), "parent", null);
        setField(term3764956, term3764956.getClass(), "next", term3764958);
        setField(term3764961, term3764961.getClass(), "str", "");
        setIntField(term3764961, term3764961.getClass(), "type", 40);
        setField(term3764961, term3764961.getClass(), "next", term3764961);
        setField(term3764961, term3764961.getClass(), "first", null);
        setField(term3764961, term3764961.getClass(), "last", null);
        setField(term3764961, term3764961.getClass(), "propListHead", null);
        setIntField(term3764961, term3764961.getClass(), "sourcePosition", 0);
        setField(term3764961, term3764961.getClass(), "jsType", null);
        setField(term3764961, term3764961.getClass(), "parent", null);
        setField(term3764956, term3764956.getClass(), "first", term3764961);
        setField(term3764956, term3764956.getClass(), "last", null);
        setField(term3764956, term3764956.getClass(), "propListHead", null);
        setIntField(term3764956, term3764956.getClass(), "sourcePosition", 0);
        setField(term3764956, term3764956.getClass(), "jsType", null);
        setField(term3764956, term3764956.getClass(), "parent", null);
        setField(term3764946, term3764946.getClass(), "first", term3764956);
        setField(term3764946, term3764946.getClass(), "last", null);
        setField(term3764946, term3764946.getClass(), "propListHead", null);
        setIntField(term3764946, term3764946.getClass(), "sourcePosition", 0);
        setField(term3764946, term3764946.getClass(), "jsType", null);
        setField(term3764946, term3764946.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3764616;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3764530, args);
        assertTrue(recursiveEquals(term3764530, term3765038));
        assertTrue(recursiveEquals(term3764616, term3765039));
        assertTrue(recursiveEquals(retValue, term3764946));
    }

};


