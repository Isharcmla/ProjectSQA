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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3532025;
     Object term3532117;
     Object term3533418;
     Object term3533419;
     Object term3533090;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3532025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3532117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3532209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3532301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3532393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3532517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3532209, term3532209.getClass(), "type", 35);
        setIntField(term3532393, term3532393.getClass(), "type", 40);
        setField(term3532393, term3532393.getClass(), "str", "substr");
        setField(term3532301, term3532301.getClass(), "next", term3532393);
        setIntField(term3532301, term3532301.getClass(), "type", 40);
        setField(term3532209, term3532209.getClass(), "first", term3532301);
        setIntField(term3532517, term3532517.getClass(), "type", 41);
        setField(term3532209, term3532209.getClass(), "next", term3532517);
        setField(term3532117, term3532117.getClass(), "first", term3532209);
        setIntField(term3532117, term3532117.getClass(), "type", 37);
        term3533418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3533418, term3533418.getClass(), "currentTraversal", null);
        term3533419 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3533422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3533419, term3533419.getClass(), "str", null);
        setIntField(term3533419, term3533419.getClass(), "type", 37);
        setField(term3533419, term3533419.getClass(), "next", null);
        setField(term3533420, term3533420.getClass(), "str", null);
        setIntField(term3533420, term3533420.getClass(), "type", 35);
        setField(term3533421, term3533421.getClass(), "functionName", null);
        setBooleanField(term3533421, term3533421.getClass(), "itsNeedsActivation", false);
        setIntField(term3533421, term3533421.getClass(), "itsFunctionType", 0);
        setBooleanField(term3533421, term3533421.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3533421, term3533421.getClass(), "encodedSourceStart", 0);
        setIntField(term3533421, term3533421.getClass(), "encodedSourceEnd", 0);
        setField(term3533421, term3533421.getClass(), "sourceName", null);
        setIntField(term3533421, term3533421.getClass(), "baseLineno", 0);
        setIntField(term3533421, term3533421.getClass(), "endLineno", 0);
        setField(term3533421, term3533421.getClass(), "functions", null);
        setField(term3533421, term3533421.getClass(), "regexps", null);
        setField(term3533421, term3533421.getClass(), "itsVariables", null);
        setField(term3533421, term3533421.getClass(), "itsConst", null);
        setField(term3533421, term3533421.getClass(), "itsVariableNames", null);
        setIntField(term3533421, term3533421.getClass(), "varStart", 0);
        setField(term3533421, term3533421.getClass(), "compilerData", null);
        setIntField(term3533421, term3533421.getClass(), "type", 41);
        setField(term3533421, term3533421.getClass(), "next", null);
        setField(term3533421, term3533421.getClass(), "first", null);
        setField(term3533421, term3533421.getClass(), "last", null);
        setField(term3533421, term3533421.getClass(), "propListHead", null);
        setIntField(term3533421, term3533421.getClass(), "sourcePosition", 0);
        setField(term3533421, term3533421.getClass(), "jsType", null);
        setField(term3533421, term3533421.getClass(), "parent", null);
        setField(term3533420, term3533420.getClass(), "next", term3533421);
        setField(term3533422, term3533422.getClass(), "str", null);
        setIntField(term3533422, term3533422.getClass(), "type", 40);
        setField(term3533423, term3533423.getClass(), "str", "");
        setIntField(term3533423, term3533423.getClass(), "type", 40);
        setField(term3533423, term3533423.getClass(), "next", null);
        setField(term3533423, term3533423.getClass(), "first", null);
        setField(term3533423, term3533423.getClass(), "last", null);
        setField(term3533423, term3533423.getClass(), "propListHead", null);
        setIntField(term3533423, term3533423.getClass(), "sourcePosition", 0);
        setField(term3533423, term3533423.getClass(), "jsType", null);
        setField(term3533423, term3533423.getClass(), "parent", null);
        setField(term3533422, term3533422.getClass(), "next", term3533423);
        setField(term3533422, term3533422.getClass(), "first", null);
        setField(term3533422, term3533422.getClass(), "last", null);
        setField(term3533422, term3533422.getClass(), "propListHead", null);
        setIntField(term3533422, term3533422.getClass(), "sourcePosition", 0);
        setField(term3533422, term3533422.getClass(), "jsType", null);
        setField(term3533422, term3533422.getClass(), "parent", null);
        setField(term3533420, term3533420.getClass(), "first", term3533422);
        setField(term3533420, term3533420.getClass(), "last", null);
        setField(term3533420, term3533420.getClass(), "propListHead", null);
        setIntField(term3533420, term3533420.getClass(), "sourcePosition", 0);
        setField(term3533420, term3533420.getClass(), "jsType", null);
        setField(term3533420, term3533420.getClass(), "parent", null);
        setField(term3533419, term3533419.getClass(), "first", term3533420);
        setField(term3533419, term3533419.getClass(), "last", null);
        setField(term3533419, term3533419.getClass(), "propListHead", null);
        setIntField(term3533419, term3533419.getClass(), "sourcePosition", 0);
        setField(term3533419, term3533419.getClass(), "jsType", null);
        setField(term3533419, term3533419.getClass(), "parent", null);
        term3533090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3533105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3533107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3533090, term3533090.getClass(), "str", null);
        setIntField(term3533090, term3533090.getClass(), "type", 37);
        setField(term3533090, term3533090.getClass(), "next", null);
        setField(term3533092, term3533092.getClass(), "str", null);
        setIntField(term3533092, term3533092.getClass(), "type", 35);
        setField(term3533094, term3533094.getClass(), "functionName", null);
        setBooleanField(term3533094, term3533094.getClass(), "itsNeedsActivation", false);
        setIntField(term3533094, term3533094.getClass(), "itsFunctionType", 0);
        setBooleanField(term3533094, term3533094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3533094, term3533094.getClass(), "encodedSourceStart", 0);
        setIntField(term3533094, term3533094.getClass(), "encodedSourceEnd", 0);
        setField(term3533094, term3533094.getClass(), "sourceName", null);
        setIntField(term3533094, term3533094.getClass(), "baseLineno", 0);
        setIntField(term3533094, term3533094.getClass(), "endLineno", 0);
        setField(term3533094, term3533094.getClass(), "functions", null);
        setField(term3533094, term3533094.getClass(), "regexps", null);
        setField(term3533094, term3533094.getClass(), "itsVariables", null);
        setField(term3533094, term3533094.getClass(), "itsConst", null);
        setField(term3533094, term3533094.getClass(), "itsVariableNames", null);
        setIntField(term3533094, term3533094.getClass(), "varStart", 0);
        setField(term3533094, term3533094.getClass(), "compilerData", null);
        setIntField(term3533094, term3533094.getClass(), "type", 41);
        setField(term3533094, term3533094.getClass(), "next", null);
        setField(term3533094, term3533094.getClass(), "first", null);
        setField(term3533094, term3533094.getClass(), "last", null);
        setField(term3533094, term3533094.getClass(), "propListHead", null);
        setIntField(term3533094, term3533094.getClass(), "sourcePosition", 0);
        setField(term3533094, term3533094.getClass(), "jsType", null);
        setField(term3533094, term3533094.getClass(), "parent", null);
        setField(term3533092, term3533092.getClass(), "next", term3533094);
        setField(term3533105, term3533105.getClass(), "str", null);
        setIntField(term3533105, term3533105.getClass(), "type", 40);
        setField(term3533107, term3533107.getClass(), "str", "");
        setIntField(term3533107, term3533107.getClass(), "type", 40);
        setField(term3533107, term3533107.getClass(), "next", null);
        setField(term3533107, term3533107.getClass(), "first", null);
        setField(term3533107, term3533107.getClass(), "last", null);
        setField(term3533107, term3533107.getClass(), "propListHead", null);
        setIntField(term3533107, term3533107.getClass(), "sourcePosition", 0);
        setField(term3533107, term3533107.getClass(), "jsType", null);
        setField(term3533107, term3533107.getClass(), "parent", null);
        setField(term3533105, term3533105.getClass(), "next", term3533107);
        setField(term3533105, term3533105.getClass(), "first", null);
        setField(term3533105, term3533105.getClass(), "last", null);
        setField(term3533105, term3533105.getClass(), "propListHead", null);
        setIntField(term3533105, term3533105.getClass(), "sourcePosition", 0);
        setField(term3533105, term3533105.getClass(), "jsType", null);
        setField(term3533105, term3533105.getClass(), "parent", null);
        setField(term3533092, term3533092.getClass(), "first", term3533105);
        setField(term3533092, term3533092.getClass(), "last", null);
        setField(term3533092, term3533092.getClass(), "propListHead", null);
        setIntField(term3533092, term3533092.getClass(), "sourcePosition", 0);
        setField(term3533092, term3533092.getClass(), "jsType", null);
        setField(term3533092, term3533092.getClass(), "parent", null);
        setField(term3533090, term3533090.getClass(), "first", term3533092);
        setField(term3533090, term3533090.getClass(), "last", null);
        setField(term3533090, term3533090.getClass(), "propListHead", null);
        setIntField(term3533090, term3533090.getClass(), "sourcePosition", 0);
        setField(term3533090, term3533090.getClass(), "jsType", null);
        setField(term3533090, term3533090.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3532117;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3532025, args);
        assertTrue(recursiveEquals(term3532025, term3533418));
        assertTrue(recursiveEquals(term3532117, term3533419));
        assertTrue(recursiveEquals(retValue, term3533090));
    }

};


