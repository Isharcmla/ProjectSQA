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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3542388;
     Object term3542480;
     Object term3544452;
     Object term3544453;
     Object term3544191;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3542388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3542480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542572 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542880 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3542572, term3542572.getClass(), "type", 35);
        setIntField(term3542756, term3542756.getClass(), "type", 40);
        setField(term3542756, term3542756.getClass(), "str", "");
        setField(term3542664, term3542664.getClass(), "next", term3542756);
        setIntField(term3542664, term3542664.getClass(), "type", 40);
        setField(term3542572, term3542572.getClass(), "first", term3542664);
        setIntField(term3542880, term3542880.getClass(), "type", 44);
        setField(term3542572, term3542572.getClass(), "next", term3542880);
        setField(term3542480, term3542480.getClass(), "first", term3542572);
        setIntField(term3542480, term3542480.getClass(), "type", 37);
        term3544452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3544452, term3544452.getClass(), "currentTraversal", null);
        term3544453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3544456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3544453, term3544453.getClass(), "str", null);
        setIntField(term3544453, term3544453.getClass(), "type", 37);
        setField(term3544453, term3544453.getClass(), "next", null);
        setField(term3544454, term3544454.getClass(), "str", null);
        setIntField(term3544454, term3544454.getClass(), "type", 35);
        setField(term3544455, term3544455.getClass(), "functionName", null);
        setBooleanField(term3544455, term3544455.getClass(), "itsNeedsActivation", false);
        setIntField(term3544455, term3544455.getClass(), "itsFunctionType", 0);
        setBooleanField(term3544455, term3544455.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3544455, term3544455.getClass(), "encodedSourceStart", 0);
        setIntField(term3544455, term3544455.getClass(), "encodedSourceEnd", 0);
        setField(term3544455, term3544455.getClass(), "sourceName", null);
        setIntField(term3544455, term3544455.getClass(), "baseLineno", 0);
        setIntField(term3544455, term3544455.getClass(), "endLineno", 0);
        setField(term3544455, term3544455.getClass(), "functions", null);
        setField(term3544455, term3544455.getClass(), "regexps", null);
        setField(term3544455, term3544455.getClass(), "itsVariables", null);
        setField(term3544455, term3544455.getClass(), "itsConst", null);
        setField(term3544455, term3544455.getClass(), "itsVariableNames", null);
        setIntField(term3544455, term3544455.getClass(), "varStart", 0);
        setField(term3544455, term3544455.getClass(), "compilerData", null);
        setIntField(term3544455, term3544455.getClass(), "type", 44);
        setField(term3544455, term3544455.getClass(), "next", null);
        setField(term3544455, term3544455.getClass(), "first", null);
        setField(term3544455, term3544455.getClass(), "last", null);
        setField(term3544455, term3544455.getClass(), "propListHead", null);
        setIntField(term3544455, term3544455.getClass(), "sourcePosition", 0);
        setField(term3544455, term3544455.getClass(), "jsType", null);
        setField(term3544455, term3544455.getClass(), "parent", null);
        setField(term3544454, term3544454.getClass(), "next", term3544455);
        setField(term3544456, term3544456.getClass(), "str", null);
        setIntField(term3544456, term3544456.getClass(), "type", 40);
        setField(term3544457, term3544457.getClass(), "str", "");
        setIntField(term3544457, term3544457.getClass(), "type", 40);
        setField(term3544457, term3544457.getClass(), "next", null);
        setField(term3544457, term3544457.getClass(), "first", null);
        setField(term3544457, term3544457.getClass(), "last", null);
        setField(term3544457, term3544457.getClass(), "propListHead", null);
        setIntField(term3544457, term3544457.getClass(), "sourcePosition", 0);
        setField(term3544457, term3544457.getClass(), "jsType", null);
        setField(term3544457, term3544457.getClass(), "parent", null);
        setField(term3544456, term3544456.getClass(), "next", term3544457);
        setField(term3544456, term3544456.getClass(), "first", null);
        setField(term3544456, term3544456.getClass(), "last", null);
        setField(term3544456, term3544456.getClass(), "propListHead", null);
        setIntField(term3544456, term3544456.getClass(), "sourcePosition", 0);
        setField(term3544456, term3544456.getClass(), "jsType", null);
        setField(term3544456, term3544456.getClass(), "parent", null);
        setField(term3544454, term3544454.getClass(), "first", term3544456);
        setField(term3544454, term3544454.getClass(), "last", null);
        setField(term3544454, term3544454.getClass(), "propListHead", null);
        setIntField(term3544454, term3544454.getClass(), "sourcePosition", 0);
        setField(term3544454, term3544454.getClass(), "jsType", null);
        setField(term3544454, term3544454.getClass(), "parent", null);
        setField(term3544453, term3544453.getClass(), "first", term3544454);
        setField(term3544453, term3544453.getClass(), "last", null);
        setField(term3544453, term3544453.getClass(), "propListHead", null);
        setIntField(term3544453, term3544453.getClass(), "sourcePosition", 0);
        setField(term3544453, term3544453.getClass(), "jsType", null);
        setField(term3544453, term3544453.getClass(), "parent", null);
        term3544191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3544206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3544208 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3544191, term3544191.getClass(), "str", null);
        setIntField(term3544191, term3544191.getClass(), "type", 37);
        setField(term3544191, term3544191.getClass(), "next", null);
        setField(term3544193, term3544193.getClass(), "str", null);
        setIntField(term3544193, term3544193.getClass(), "type", 35);
        setField(term3544195, term3544195.getClass(), "functionName", null);
        setBooleanField(term3544195, term3544195.getClass(), "itsNeedsActivation", false);
        setIntField(term3544195, term3544195.getClass(), "itsFunctionType", 0);
        setBooleanField(term3544195, term3544195.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3544195, term3544195.getClass(), "encodedSourceStart", 0);
        setIntField(term3544195, term3544195.getClass(), "encodedSourceEnd", 0);
        setField(term3544195, term3544195.getClass(), "sourceName", null);
        setIntField(term3544195, term3544195.getClass(), "baseLineno", 0);
        setIntField(term3544195, term3544195.getClass(), "endLineno", 0);
        setField(term3544195, term3544195.getClass(), "functions", null);
        setField(term3544195, term3544195.getClass(), "regexps", null);
        setField(term3544195, term3544195.getClass(), "itsVariables", null);
        setField(term3544195, term3544195.getClass(), "itsConst", null);
        setField(term3544195, term3544195.getClass(), "itsVariableNames", null);
        setIntField(term3544195, term3544195.getClass(), "varStart", 0);
        setField(term3544195, term3544195.getClass(), "compilerData", null);
        setIntField(term3544195, term3544195.getClass(), "type", 44);
        setField(term3544195, term3544195.getClass(), "next", null);
        setField(term3544195, term3544195.getClass(), "first", null);
        setField(term3544195, term3544195.getClass(), "last", null);
        setField(term3544195, term3544195.getClass(), "propListHead", null);
        setIntField(term3544195, term3544195.getClass(), "sourcePosition", 0);
        setField(term3544195, term3544195.getClass(), "jsType", null);
        setField(term3544195, term3544195.getClass(), "parent", null);
        setField(term3544193, term3544193.getClass(), "next", term3544195);
        setField(term3544206, term3544206.getClass(), "str", null);
        setIntField(term3544206, term3544206.getClass(), "type", 40);
        setField(term3544208, term3544208.getClass(), "str", "");
        setIntField(term3544208, term3544208.getClass(), "type", 40);
        setField(term3544208, term3544208.getClass(), "next", null);
        setField(term3544208, term3544208.getClass(), "first", null);
        setField(term3544208, term3544208.getClass(), "last", null);
        setField(term3544208, term3544208.getClass(), "propListHead", null);
        setIntField(term3544208, term3544208.getClass(), "sourcePosition", 0);
        setField(term3544208, term3544208.getClass(), "jsType", null);
        setField(term3544208, term3544208.getClass(), "parent", null);
        setField(term3544206, term3544206.getClass(), "next", term3544208);
        setField(term3544206, term3544206.getClass(), "first", null);
        setField(term3544206, term3544206.getClass(), "last", null);
        setField(term3544206, term3544206.getClass(), "propListHead", null);
        setIntField(term3544206, term3544206.getClass(), "sourcePosition", 0);
        setField(term3544206, term3544206.getClass(), "jsType", null);
        setField(term3544206, term3544206.getClass(), "parent", null);
        setField(term3544193, term3544193.getClass(), "first", term3544206);
        setField(term3544193, term3544193.getClass(), "last", null);
        setField(term3544193, term3544193.getClass(), "propListHead", null);
        setIntField(term3544193, term3544193.getClass(), "sourcePosition", 0);
        setField(term3544193, term3544193.getClass(), "jsType", null);
        setField(term3544193, term3544193.getClass(), "parent", null);
        setField(term3544191, term3544191.getClass(), "first", term3544193);
        setField(term3544191, term3544191.getClass(), "last", null);
        setField(term3544191, term3544191.getClass(), "propListHead", null);
        setIntField(term3544191, term3544191.getClass(), "sourcePosition", 0);
        setField(term3544191, term3544191.getClass(), "jsType", null);
        setField(term3544191, term3544191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3542480;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3542388, args);
        assertTrue(recursiveEquals(term3542388, term3544452));
        assertTrue(recursiveEquals(term3542480, term3544453));
        assertTrue(recursiveEquals(retValue, term3544191));
    }

};


