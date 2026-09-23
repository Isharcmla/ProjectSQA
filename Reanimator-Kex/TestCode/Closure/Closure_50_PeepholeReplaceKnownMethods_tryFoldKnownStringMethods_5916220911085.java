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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4836103;
     Object term4836195;
     Object term4839832;
     Object term4839833;
     Object term4839759;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4836103 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4836195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4836287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4836373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4836195, term4836195.getClass(), "type", 37);
        setIntField(term4836287, term4836287.getClass(), "type", 35);
        setField(term4836287, term4836287.getClass(), "first", term4836373);
        setField(term4836195, term4836195.getClass(), "first", term4836287);
        term4839832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4839832, term4839832.getClass(), "currentTraversal", null);
        term4839833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4839834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4839835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term4839833, term4839833.getClass(), "number", 0.0);
        setIntField(term4839833, term4839833.getClass(), "type", 37);
        setField(term4839833, term4839833.getClass(), "next", null);
        setDoubleField(term4839834, term4839834.getClass(), "number", 0.0);
        setIntField(term4839834, term4839834.getClass(), "type", 35);
        setField(term4839834, term4839834.getClass(), "next", null);
        setField(term4839835, term4839835.getClass(), "functionName", null);
        setBooleanField(term4839835, term4839835.getClass(), "itsNeedsActivation", false);
        setIntField(term4839835, term4839835.getClass(), "itsFunctionType", 0);
        setBooleanField(term4839835, term4839835.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4839835, term4839835.getClass(), "encodedSourceStart", 0);
        setIntField(term4839835, term4839835.getClass(), "encodedSourceEnd", 0);
        setField(term4839835, term4839835.getClass(), "sourceName", null);
        setIntField(term4839835, term4839835.getClass(), "baseLineno", 0);
        setIntField(term4839835, term4839835.getClass(), "endLineno", 0);
        setField(term4839835, term4839835.getClass(), "functions", null);
        setField(term4839835, term4839835.getClass(), "regexps", null);
        setField(term4839835, term4839835.getClass(), "itsVariables", null);
        setField(term4839835, term4839835.getClass(), "itsConst", null);
        setField(term4839835, term4839835.getClass(), "itsVariableNames", null);
        setIntField(term4839835, term4839835.getClass(), "varStart", 0);
        setField(term4839835, term4839835.getClass(), "compilerData", null);
        setIntField(term4839835, term4839835.getClass(), "type", 0);
        setField(term4839835, term4839835.getClass(), "next", null);
        setField(term4839835, term4839835.getClass(), "first", null);
        setField(term4839835, term4839835.getClass(), "last", null);
        setField(term4839835, term4839835.getClass(), "propListHead", null);
        setIntField(term4839835, term4839835.getClass(), "sourcePosition", 0);
        setField(term4839835, term4839835.getClass(), "jsType", null);
        setField(term4839835, term4839835.getClass(), "parent", null);
        setField(term4839834, term4839834.getClass(), "first", term4839835);
        setField(term4839834, term4839834.getClass(), "last", null);
        setField(term4839834, term4839834.getClass(), "propListHead", null);
        setIntField(term4839834, term4839834.getClass(), "sourcePosition", 0);
        setField(term4839834, term4839834.getClass(), "jsType", null);
        setField(term4839834, term4839834.getClass(), "parent", null);
        setField(term4839833, term4839833.getClass(), "first", term4839834);
        setField(term4839833, term4839833.getClass(), "last", null);
        setField(term4839833, term4839833.getClass(), "propListHead", null);
        setIntField(term4839833, term4839833.getClass(), "sourcePosition", 0);
        setField(term4839833, term4839833.getClass(), "jsType", null);
        setField(term4839833, term4839833.getClass(), "parent", null);
        term4839759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4839762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4839765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term4839759, term4839759.getClass(), "number", 0.0);
        setIntField(term4839759, term4839759.getClass(), "type", 37);
        setField(term4839759, term4839759.getClass(), "next", null);
        setDoubleField(term4839762, term4839762.getClass(), "number", 0.0);
        setIntField(term4839762, term4839762.getClass(), "type", 35);
        setField(term4839762, term4839762.getClass(), "next", null);
        setField(term4839765, term4839765.getClass(), "functionName", null);
        setBooleanField(term4839765, term4839765.getClass(), "itsNeedsActivation", false);
        setIntField(term4839765, term4839765.getClass(), "itsFunctionType", 0);
        setBooleanField(term4839765, term4839765.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4839765, term4839765.getClass(), "encodedSourceStart", 0);
        setIntField(term4839765, term4839765.getClass(), "encodedSourceEnd", 0);
        setField(term4839765, term4839765.getClass(), "sourceName", null);
        setIntField(term4839765, term4839765.getClass(), "baseLineno", 0);
        setIntField(term4839765, term4839765.getClass(), "endLineno", 0);
        setField(term4839765, term4839765.getClass(), "functions", null);
        setField(term4839765, term4839765.getClass(), "regexps", null);
        setField(term4839765, term4839765.getClass(), "itsVariables", null);
        setField(term4839765, term4839765.getClass(), "itsConst", null);
        setField(term4839765, term4839765.getClass(), "itsVariableNames", null);
        setIntField(term4839765, term4839765.getClass(), "varStart", 0);
        setField(term4839765, term4839765.getClass(), "compilerData", null);
        setIntField(term4839765, term4839765.getClass(), "type", 0);
        setField(term4839765, term4839765.getClass(), "next", null);
        setField(term4839765, term4839765.getClass(), "first", null);
        setField(term4839765, term4839765.getClass(), "last", null);
        setField(term4839765, term4839765.getClass(), "propListHead", null);
        setIntField(term4839765, term4839765.getClass(), "sourcePosition", 0);
        setField(term4839765, term4839765.getClass(), "jsType", null);
        setField(term4839765, term4839765.getClass(), "parent", null);
        setField(term4839762, term4839762.getClass(), "first", term4839765);
        setField(term4839762, term4839762.getClass(), "last", null);
        setField(term4839762, term4839762.getClass(), "propListHead", null);
        setIntField(term4839762, term4839762.getClass(), "sourcePosition", 0);
        setField(term4839762, term4839762.getClass(), "jsType", null);
        setField(term4839762, term4839762.getClass(), "parent", null);
        setField(term4839759, term4839759.getClass(), "first", term4839762);
        setField(term4839759, term4839759.getClass(), "last", null);
        setField(term4839759, term4839759.getClass(), "propListHead", null);
        setIntField(term4839759, term4839759.getClass(), "sourcePosition", 0);
        setField(term4839759, term4839759.getClass(), "jsType", null);
        setField(term4839759, term4839759.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4836195;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4836103, args);
        assertTrue(recursiveEquals(term4836103, term4839832));
        assertTrue(recursiveEquals(term4836195, term4839833));
        assertTrue(recursiveEquals(retValue, term4839759));
    }

};


