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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3809076;
     Object term3809168;
     Object term3810591;
     Object term3810592;
     Object term3810263;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3809076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3809168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3809260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3809352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3809444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3809568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3809260, term3809260.getClass(), "type", 35);
        setIntField(term3809444, term3809444.getClass(), "type", 40);
        setField(term3809444, term3809444.getClass(), "str", "substr");
        setField(term3809352, term3809352.getClass(), "next", term3809444);
        setIntField(term3809352, term3809352.getClass(), "type", 40);
        setField(term3809260, term3809260.getClass(), "first", term3809352);
        setIntField(term3809568, term3809568.getClass(), "type", 43);
        setField(term3809260, term3809260.getClass(), "next", term3809568);
        setField(term3809168, term3809168.getClass(), "first", term3809260);
        setIntField(term3809168, term3809168.getClass(), "type", 37);
        term3810591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3810591, term3810591.getClass(), "currentTraversal", null);
        term3810592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3810595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810596 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3810592, term3810592.getClass(), "str", null);
        setIntField(term3810592, term3810592.getClass(), "type", 37);
        setField(term3810592, term3810592.getClass(), "next", null);
        setField(term3810593, term3810593.getClass(), "str", null);
        setIntField(term3810593, term3810593.getClass(), "type", 35);
        setField(term3810594, term3810594.getClass(), "functionName", null);
        setBooleanField(term3810594, term3810594.getClass(), "itsNeedsActivation", false);
        setIntField(term3810594, term3810594.getClass(), "itsFunctionType", 0);
        setBooleanField(term3810594, term3810594.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3810594, term3810594.getClass(), "encodedSourceStart", 0);
        setIntField(term3810594, term3810594.getClass(), "encodedSourceEnd", 0);
        setField(term3810594, term3810594.getClass(), "sourceName", null);
        setIntField(term3810594, term3810594.getClass(), "baseLineno", 0);
        setIntField(term3810594, term3810594.getClass(), "endLineno", 0);
        setField(term3810594, term3810594.getClass(), "functions", null);
        setField(term3810594, term3810594.getClass(), "regexps", null);
        setField(term3810594, term3810594.getClass(), "itsVariables", null);
        setField(term3810594, term3810594.getClass(), "itsConst", null);
        setField(term3810594, term3810594.getClass(), "itsVariableNames", null);
        setIntField(term3810594, term3810594.getClass(), "varStart", 0);
        setField(term3810594, term3810594.getClass(), "compilerData", null);
        setIntField(term3810594, term3810594.getClass(), "type", 43);
        setField(term3810594, term3810594.getClass(), "next", null);
        setField(term3810594, term3810594.getClass(), "first", null);
        setField(term3810594, term3810594.getClass(), "last", null);
        setField(term3810594, term3810594.getClass(), "propListHead", null);
        setIntField(term3810594, term3810594.getClass(), "sourcePosition", 0);
        setField(term3810594, term3810594.getClass(), "jsType", null);
        setField(term3810594, term3810594.getClass(), "parent", null);
        setField(term3810593, term3810593.getClass(), "next", term3810594);
        setField(term3810595, term3810595.getClass(), "str", null);
        setIntField(term3810595, term3810595.getClass(), "type", 40);
        setField(term3810596, term3810596.getClass(), "str", "");
        setIntField(term3810596, term3810596.getClass(), "type", 40);
        setField(term3810596, term3810596.getClass(), "next", null);
        setField(term3810596, term3810596.getClass(), "first", null);
        setField(term3810596, term3810596.getClass(), "last", null);
        setField(term3810596, term3810596.getClass(), "propListHead", null);
        setIntField(term3810596, term3810596.getClass(), "sourcePosition", 0);
        setField(term3810596, term3810596.getClass(), "jsType", null);
        setField(term3810596, term3810596.getClass(), "parent", null);
        setField(term3810595, term3810595.getClass(), "next", term3810596);
        setField(term3810595, term3810595.getClass(), "first", null);
        setField(term3810595, term3810595.getClass(), "last", null);
        setField(term3810595, term3810595.getClass(), "propListHead", null);
        setIntField(term3810595, term3810595.getClass(), "sourcePosition", 0);
        setField(term3810595, term3810595.getClass(), "jsType", null);
        setField(term3810595, term3810595.getClass(), "parent", null);
        setField(term3810593, term3810593.getClass(), "first", term3810595);
        setField(term3810593, term3810593.getClass(), "last", null);
        setField(term3810593, term3810593.getClass(), "propListHead", null);
        setIntField(term3810593, term3810593.getClass(), "sourcePosition", 0);
        setField(term3810593, term3810593.getClass(), "jsType", null);
        setField(term3810593, term3810593.getClass(), "parent", null);
        setField(term3810592, term3810592.getClass(), "first", term3810593);
        setField(term3810592, term3810592.getClass(), "last", null);
        setField(term3810592, term3810592.getClass(), "propListHead", null);
        setIntField(term3810592, term3810592.getClass(), "sourcePosition", 0);
        setField(term3810592, term3810592.getClass(), "jsType", null);
        setField(term3810592, term3810592.getClass(), "parent", null);
        term3810263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810267 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3810278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3810280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3810263, term3810263.getClass(), "str", null);
        setIntField(term3810263, term3810263.getClass(), "type", 37);
        setField(term3810263, term3810263.getClass(), "next", null);
        setField(term3810265, term3810265.getClass(), "str", null);
        setIntField(term3810265, term3810265.getClass(), "type", 35);
        setField(term3810267, term3810267.getClass(), "functionName", null);
        setBooleanField(term3810267, term3810267.getClass(), "itsNeedsActivation", false);
        setIntField(term3810267, term3810267.getClass(), "itsFunctionType", 0);
        setBooleanField(term3810267, term3810267.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3810267, term3810267.getClass(), "encodedSourceStart", 0);
        setIntField(term3810267, term3810267.getClass(), "encodedSourceEnd", 0);
        setField(term3810267, term3810267.getClass(), "sourceName", null);
        setIntField(term3810267, term3810267.getClass(), "baseLineno", 0);
        setIntField(term3810267, term3810267.getClass(), "endLineno", 0);
        setField(term3810267, term3810267.getClass(), "functions", null);
        setField(term3810267, term3810267.getClass(), "regexps", null);
        setField(term3810267, term3810267.getClass(), "itsVariables", null);
        setField(term3810267, term3810267.getClass(), "itsConst", null);
        setField(term3810267, term3810267.getClass(), "itsVariableNames", null);
        setIntField(term3810267, term3810267.getClass(), "varStart", 0);
        setField(term3810267, term3810267.getClass(), "compilerData", null);
        setIntField(term3810267, term3810267.getClass(), "type", 43);
        setField(term3810267, term3810267.getClass(), "next", null);
        setField(term3810267, term3810267.getClass(), "first", null);
        setField(term3810267, term3810267.getClass(), "last", null);
        setField(term3810267, term3810267.getClass(), "propListHead", null);
        setIntField(term3810267, term3810267.getClass(), "sourcePosition", 0);
        setField(term3810267, term3810267.getClass(), "jsType", null);
        setField(term3810267, term3810267.getClass(), "parent", null);
        setField(term3810265, term3810265.getClass(), "next", term3810267);
        setField(term3810278, term3810278.getClass(), "str", null);
        setIntField(term3810278, term3810278.getClass(), "type", 40);
        setField(term3810280, term3810280.getClass(), "str", "");
        setIntField(term3810280, term3810280.getClass(), "type", 40);
        setField(term3810280, term3810280.getClass(), "next", null);
        setField(term3810280, term3810280.getClass(), "first", null);
        setField(term3810280, term3810280.getClass(), "last", null);
        setField(term3810280, term3810280.getClass(), "propListHead", null);
        setIntField(term3810280, term3810280.getClass(), "sourcePosition", 0);
        setField(term3810280, term3810280.getClass(), "jsType", null);
        setField(term3810280, term3810280.getClass(), "parent", null);
        setField(term3810278, term3810278.getClass(), "next", term3810280);
        setField(term3810278, term3810278.getClass(), "first", null);
        setField(term3810278, term3810278.getClass(), "last", null);
        setField(term3810278, term3810278.getClass(), "propListHead", null);
        setIntField(term3810278, term3810278.getClass(), "sourcePosition", 0);
        setField(term3810278, term3810278.getClass(), "jsType", null);
        setField(term3810278, term3810278.getClass(), "parent", null);
        setField(term3810265, term3810265.getClass(), "first", term3810278);
        setField(term3810265, term3810265.getClass(), "last", null);
        setField(term3810265, term3810265.getClass(), "propListHead", null);
        setIntField(term3810265, term3810265.getClass(), "sourcePosition", 0);
        setField(term3810265, term3810265.getClass(), "jsType", null);
        setField(term3810265, term3810265.getClass(), "parent", null);
        setField(term3810263, term3810263.getClass(), "first", term3810265);
        setField(term3810263, term3810263.getClass(), "last", null);
        setField(term3810263, term3810263.getClass(), "propListHead", null);
        setIntField(term3810263, term3810263.getClass(), "sourcePosition", 0);
        setField(term3810263, term3810263.getClass(), "jsType", null);
        setField(term3810263, term3810263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3809168;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3809076, args);
        assertTrue(recursiveEquals(term3809076, term3810591));
        assertTrue(recursiveEquals(term3809168, term3810592));
        assertTrue(recursiveEquals(retValue, term3810263));
    }

};


