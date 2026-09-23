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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187780;
     Object term187866;
     Object term188103;
     Object term188104;
     Object term188037;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term187866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term187952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term187952, term187952.getClass(), "next", term188022);
        setField(term187866, term187866.getClass(), "first", term187952);
        setIntField(term187866, term187866.getClass(), "type", 46);
        term188103 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term188103, term188103.getClass(), "currentTraversal", null);
        term188104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term188104, term188104.getClass(), "functionName", null);
        setBooleanField(term188104, term188104.getClass(), "itsNeedsActivation", false);
        setIntField(term188104, term188104.getClass(), "itsFunctionType", 0);
        setBooleanField(term188104, term188104.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188104, term188104.getClass(), "encodedSourceStart", 0);
        setIntField(term188104, term188104.getClass(), "encodedSourceEnd", 0);
        setField(term188104, term188104.getClass(), "sourceName", null);
        setIntField(term188104, term188104.getClass(), "baseLineno", 0);
        setIntField(term188104, term188104.getClass(), "endLineno", 0);
        setField(term188104, term188104.getClass(), "functions", null);
        setField(term188104, term188104.getClass(), "regexps", null);
        setField(term188104, term188104.getClass(), "itsVariables", null);
        setField(term188104, term188104.getClass(), "itsConst", null);
        setField(term188104, term188104.getClass(), "itsVariableNames", null);
        setIntField(term188104, term188104.getClass(), "varStart", 0);
        setField(term188104, term188104.getClass(), "compilerData", null);
        setIntField(term188104, term188104.getClass(), "type", 46);
        setField(term188104, term188104.getClass(), "next", null);
        setField(term188105, term188105.getClass(), "functionName", null);
        setBooleanField(term188105, term188105.getClass(), "itsNeedsActivation", false);
        setIntField(term188105, term188105.getClass(), "itsFunctionType", 0);
        setBooleanField(term188105, term188105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188105, term188105.getClass(), "encodedSourceStart", 0);
        setIntField(term188105, term188105.getClass(), "encodedSourceEnd", 0);
        setField(term188105, term188105.getClass(), "sourceName", null);
        setIntField(term188105, term188105.getClass(), "baseLineno", 0);
        setIntField(term188105, term188105.getClass(), "endLineno", 0);
        setField(term188105, term188105.getClass(), "functions", null);
        setField(term188105, term188105.getClass(), "regexps", null);
        setField(term188105, term188105.getClass(), "itsVariables", null);
        setField(term188105, term188105.getClass(), "itsConst", null);
        setField(term188105, term188105.getClass(), "itsVariableNames", null);
        setIntField(term188105, term188105.getClass(), "varStart", 0);
        setField(term188105, term188105.getClass(), "compilerData", null);
        setIntField(term188105, term188105.getClass(), "type", 0);
        setIntField(term188106, term188106.getClass(), "type", 0);
        setField(term188106, term188106.getClass(), "next", null);
        setField(term188106, term188106.getClass(), "first", null);
        setField(term188106, term188106.getClass(), "last", null);
        setField(term188106, term188106.getClass(), "propListHead", null);
        setIntField(term188106, term188106.getClass(), "sourcePosition", 0);
        setField(term188106, term188106.getClass(), "jsType", null);
        setField(term188106, term188106.getClass(), "parent", null);
        setField(term188105, term188105.getClass(), "next", term188106);
        setField(term188105, term188105.getClass(), "first", null);
        setField(term188105, term188105.getClass(), "last", null);
        setField(term188105, term188105.getClass(), "propListHead", null);
        setIntField(term188105, term188105.getClass(), "sourcePosition", 0);
        setField(term188105, term188105.getClass(), "jsType", null);
        setField(term188105, term188105.getClass(), "parent", null);
        setField(term188104, term188104.getClass(), "first", term188105);
        setField(term188104, term188104.getClass(), "last", null);
        setField(term188104, term188104.getClass(), "propListHead", null);
        setIntField(term188104, term188104.getClass(), "sourcePosition", 0);
        setField(term188104, term188104.getClass(), "jsType", null);
        setField(term188104, term188104.getClass(), "parent", null);
        term188037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188047 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term188057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term188037, term188037.getClass(), "functionName", null);
        setBooleanField(term188037, term188037.getClass(), "itsNeedsActivation", false);
        setIntField(term188037, term188037.getClass(), "itsFunctionType", 0);
        setBooleanField(term188037, term188037.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188037, term188037.getClass(), "encodedSourceStart", 0);
        setIntField(term188037, term188037.getClass(), "encodedSourceEnd", 0);
        setField(term188037, term188037.getClass(), "sourceName", null);
        setIntField(term188037, term188037.getClass(), "baseLineno", 0);
        setIntField(term188037, term188037.getClass(), "endLineno", 0);
        setField(term188037, term188037.getClass(), "functions", null);
        setField(term188037, term188037.getClass(), "regexps", null);
        setField(term188037, term188037.getClass(), "itsVariables", null);
        setField(term188037, term188037.getClass(), "itsConst", null);
        setField(term188037, term188037.getClass(), "itsVariableNames", null);
        setIntField(term188037, term188037.getClass(), "varStart", 0);
        setField(term188037, term188037.getClass(), "compilerData", null);
        setIntField(term188037, term188037.getClass(), "type", 46);
        setField(term188037, term188037.getClass(), "next", null);
        setField(term188047, term188047.getClass(), "functionName", null);
        setBooleanField(term188047, term188047.getClass(), "itsNeedsActivation", false);
        setIntField(term188047, term188047.getClass(), "itsFunctionType", 0);
        setBooleanField(term188047, term188047.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188047, term188047.getClass(), "encodedSourceStart", 0);
        setIntField(term188047, term188047.getClass(), "encodedSourceEnd", 0);
        setField(term188047, term188047.getClass(), "sourceName", null);
        setIntField(term188047, term188047.getClass(), "baseLineno", 0);
        setIntField(term188047, term188047.getClass(), "endLineno", 0);
        setField(term188047, term188047.getClass(), "functions", null);
        setField(term188047, term188047.getClass(), "regexps", null);
        setField(term188047, term188047.getClass(), "itsVariables", null);
        setField(term188047, term188047.getClass(), "itsConst", null);
        setField(term188047, term188047.getClass(), "itsVariableNames", null);
        setIntField(term188047, term188047.getClass(), "varStart", 0);
        setField(term188047, term188047.getClass(), "compilerData", null);
        setIntField(term188047, term188047.getClass(), "type", 0);
        setIntField(term188057, term188057.getClass(), "type", 0);
        setField(term188057, term188057.getClass(), "next", null);
        setField(term188057, term188057.getClass(), "first", null);
        setField(term188057, term188057.getClass(), "last", null);
        setField(term188057, term188057.getClass(), "propListHead", null);
        setIntField(term188057, term188057.getClass(), "sourcePosition", 0);
        setField(term188057, term188057.getClass(), "jsType", null);
        setField(term188057, term188057.getClass(), "parent", null);
        setField(term188047, term188047.getClass(), "next", term188057);
        setField(term188047, term188047.getClass(), "first", null);
        setField(term188047, term188047.getClass(), "last", null);
        setField(term188047, term188047.getClass(), "propListHead", null);
        setIntField(term188047, term188047.getClass(), "sourcePosition", 0);
        setField(term188047, term188047.getClass(), "jsType", null);
        setField(term188047, term188047.getClass(), "parent", null);
        setField(term188037, term188037.getClass(), "first", term188047);
        setField(term188037, term188037.getClass(), "last", null);
        setField(term188037, term188037.getClass(), "propListHead", null);
        setIntField(term188037, term188037.getClass(), "sourcePosition", 0);
        setField(term188037, term188037.getClass(), "jsType", null);
        setField(term188037, term188037.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term187866;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term187780, args);
        assertTrue(recursiveEquals(term187780, term188103));
        assertTrue(recursiveEquals(term187866, term188104));
        assertTrue(recursiveEquals(retValue, term188037));
    }

};


