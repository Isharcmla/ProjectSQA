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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3510974;
     Object term3511066;
     Object term3511879;
     Object term3511880;
     Object term3511549;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3510974 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3511066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511158 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3511158, term3511158.getClass(), "type", 35);
        setIntField(term3511342, term3511342.getClass(), "type", 40);
        setField(term3511342, term3511342.getClass(), "str", "charAt");
        setField(term3511250, term3511250.getClass(), "next", term3511342);
        setIntField(term3511250, term3511250.getClass(), "type", 40);
        setField(term3511158, term3511158.getClass(), "first", term3511250);
        setIntField(term3511466, term3511466.getClass(), "type", 41);
        setField(term3511158, term3511158.getClass(), "next", term3511466);
        setField(term3511066, term3511066.getClass(), "first", term3511158);
        setIntField(term3511066, term3511066.getClass(), "type", 37);
        term3511879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3511879, term3511879.getClass(), "currentTraversal", null);
        term3511880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511882 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3511883 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3511880, term3511880.getClass(), "str", null);
        setIntField(term3511880, term3511880.getClass(), "type", 37);
        setField(term3511880, term3511880.getClass(), "next", null);
        setField(term3511881, term3511881.getClass(), "str", null);
        setIntField(term3511881, term3511881.getClass(), "type", 35);
        setField(term3511882, term3511882.getClass(), "functionName", null);
        setBooleanField(term3511882, term3511882.getClass(), "itsNeedsActivation", false);
        setIntField(term3511882, term3511882.getClass(), "itsFunctionType", 0);
        setBooleanField(term3511882, term3511882.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3511882, term3511882.getClass(), "encodedSourceStart", 0);
        setIntField(term3511882, term3511882.getClass(), "encodedSourceEnd", 0);
        setField(term3511882, term3511882.getClass(), "sourceName", null);
        setIntField(term3511882, term3511882.getClass(), "baseLineno", 0);
        setIntField(term3511882, term3511882.getClass(), "endLineno", 0);
        setField(term3511882, term3511882.getClass(), "functions", null);
        setField(term3511882, term3511882.getClass(), "regexps", null);
        setField(term3511882, term3511882.getClass(), "itsVariables", null);
        setField(term3511882, term3511882.getClass(), "itsConst", null);
        setField(term3511882, term3511882.getClass(), "itsVariableNames", null);
        setIntField(term3511882, term3511882.getClass(), "varStart", 0);
        setField(term3511882, term3511882.getClass(), "compilerData", null);
        setIntField(term3511882, term3511882.getClass(), "type", 41);
        setField(term3511882, term3511882.getClass(), "next", null);
        setField(term3511882, term3511882.getClass(), "first", null);
        setField(term3511882, term3511882.getClass(), "last", null);
        setField(term3511882, term3511882.getClass(), "propListHead", null);
        setIntField(term3511882, term3511882.getClass(), "sourcePosition", 0);
        setField(term3511882, term3511882.getClass(), "jsType", null);
        setField(term3511882, term3511882.getClass(), "parent", null);
        setField(term3511881, term3511881.getClass(), "next", term3511882);
        setField(term3511883, term3511883.getClass(), "str", null);
        setIntField(term3511883, term3511883.getClass(), "type", 40);
        setField(term3511884, term3511884.getClass(), "str", "");
        setIntField(term3511884, term3511884.getClass(), "type", 40);
        setField(term3511884, term3511884.getClass(), "next", null);
        setField(term3511884, term3511884.getClass(), "first", null);
        setField(term3511884, term3511884.getClass(), "last", null);
        setField(term3511884, term3511884.getClass(), "propListHead", null);
        setIntField(term3511884, term3511884.getClass(), "sourcePosition", 0);
        setField(term3511884, term3511884.getClass(), "jsType", null);
        setField(term3511884, term3511884.getClass(), "parent", null);
        setField(term3511883, term3511883.getClass(), "next", term3511884);
        setField(term3511883, term3511883.getClass(), "first", null);
        setField(term3511883, term3511883.getClass(), "last", null);
        setField(term3511883, term3511883.getClass(), "propListHead", null);
        setIntField(term3511883, term3511883.getClass(), "sourcePosition", 0);
        setField(term3511883, term3511883.getClass(), "jsType", null);
        setField(term3511883, term3511883.getClass(), "parent", null);
        setField(term3511881, term3511881.getClass(), "first", term3511883);
        setField(term3511881, term3511881.getClass(), "last", null);
        setField(term3511881, term3511881.getClass(), "propListHead", null);
        setIntField(term3511881, term3511881.getClass(), "sourcePosition", 0);
        setField(term3511881, term3511881.getClass(), "jsType", null);
        setField(term3511881, term3511881.getClass(), "parent", null);
        setField(term3511880, term3511880.getClass(), "first", term3511881);
        setField(term3511880, term3511880.getClass(), "last", null);
        setField(term3511880, term3511880.getClass(), "propListHead", null);
        setIntField(term3511880, term3511880.getClass(), "sourcePosition", 0);
        setField(term3511880, term3511880.getClass(), "jsType", null);
        setField(term3511880, term3511880.getClass(), "parent", null);
        term3511549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3511564 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3511566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3511549, term3511549.getClass(), "str", null);
        setIntField(term3511549, term3511549.getClass(), "type", 37);
        setField(term3511549, term3511549.getClass(), "next", null);
        setField(term3511551, term3511551.getClass(), "str", null);
        setIntField(term3511551, term3511551.getClass(), "type", 35);
        setField(term3511553, term3511553.getClass(), "functionName", null);
        setBooleanField(term3511553, term3511553.getClass(), "itsNeedsActivation", false);
        setIntField(term3511553, term3511553.getClass(), "itsFunctionType", 0);
        setBooleanField(term3511553, term3511553.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3511553, term3511553.getClass(), "encodedSourceStart", 0);
        setIntField(term3511553, term3511553.getClass(), "encodedSourceEnd", 0);
        setField(term3511553, term3511553.getClass(), "sourceName", null);
        setIntField(term3511553, term3511553.getClass(), "baseLineno", 0);
        setIntField(term3511553, term3511553.getClass(), "endLineno", 0);
        setField(term3511553, term3511553.getClass(), "functions", null);
        setField(term3511553, term3511553.getClass(), "regexps", null);
        setField(term3511553, term3511553.getClass(), "itsVariables", null);
        setField(term3511553, term3511553.getClass(), "itsConst", null);
        setField(term3511553, term3511553.getClass(), "itsVariableNames", null);
        setIntField(term3511553, term3511553.getClass(), "varStart", 0);
        setField(term3511553, term3511553.getClass(), "compilerData", null);
        setIntField(term3511553, term3511553.getClass(), "type", 41);
        setField(term3511553, term3511553.getClass(), "next", null);
        setField(term3511553, term3511553.getClass(), "first", null);
        setField(term3511553, term3511553.getClass(), "last", null);
        setField(term3511553, term3511553.getClass(), "propListHead", null);
        setIntField(term3511553, term3511553.getClass(), "sourcePosition", 0);
        setField(term3511553, term3511553.getClass(), "jsType", null);
        setField(term3511553, term3511553.getClass(), "parent", null);
        setField(term3511551, term3511551.getClass(), "next", term3511553);
        setField(term3511564, term3511564.getClass(), "str", null);
        setIntField(term3511564, term3511564.getClass(), "type", 40);
        setField(term3511566, term3511566.getClass(), "str", "");
        setIntField(term3511566, term3511566.getClass(), "type", 40);
        setField(term3511566, term3511566.getClass(), "next", null);
        setField(term3511566, term3511566.getClass(), "first", null);
        setField(term3511566, term3511566.getClass(), "last", null);
        setField(term3511566, term3511566.getClass(), "propListHead", null);
        setIntField(term3511566, term3511566.getClass(), "sourcePosition", 0);
        setField(term3511566, term3511566.getClass(), "jsType", null);
        setField(term3511566, term3511566.getClass(), "parent", null);
        setField(term3511564, term3511564.getClass(), "next", term3511566);
        setField(term3511564, term3511564.getClass(), "first", null);
        setField(term3511564, term3511564.getClass(), "last", null);
        setField(term3511564, term3511564.getClass(), "propListHead", null);
        setIntField(term3511564, term3511564.getClass(), "sourcePosition", 0);
        setField(term3511564, term3511564.getClass(), "jsType", null);
        setField(term3511564, term3511564.getClass(), "parent", null);
        setField(term3511551, term3511551.getClass(), "first", term3511564);
        setField(term3511551, term3511551.getClass(), "last", null);
        setField(term3511551, term3511551.getClass(), "propListHead", null);
        setIntField(term3511551, term3511551.getClass(), "sourcePosition", 0);
        setField(term3511551, term3511551.getClass(), "jsType", null);
        setField(term3511551, term3511551.getClass(), "parent", null);
        setField(term3511549, term3511549.getClass(), "first", term3511551);
        setField(term3511549, term3511549.getClass(), "last", null);
        setField(term3511549, term3511549.getClass(), "propListHead", null);
        setIntField(term3511549, term3511549.getClass(), "sourcePosition", 0);
        setField(term3511549, term3511549.getClass(), "jsType", null);
        setField(term3511549, term3511549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3511066;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3510974, args);
        assertTrue(recursiveEquals(term3510974, term3511879));
        assertTrue(recursiveEquals(term3511066, term3511880));
        assertTrue(recursiveEquals(retValue, term3511549));
    }

};


