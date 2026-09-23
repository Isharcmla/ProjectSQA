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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100357;
     Object term100443;
     Object term100680;
     Object term100681;
     Object term100614;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100357 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term100443 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100529 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100529, term100529.getClass(), "next", term100599);
        setField(term100443, term100443.getClass(), "first", term100529);
        setIntField(term100443, term100443.getClass(), "type", 45);
        term100680 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term100680, term100680.getClass(), "currentTraversal", null);
        term100681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100681, term100681.getClass(), "functionName", null);
        setBooleanField(term100681, term100681.getClass(), "itsNeedsActivation", false);
        setIntField(term100681, term100681.getClass(), "itsFunctionType", 0);
        setBooleanField(term100681, term100681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100681, term100681.getClass(), "encodedSourceStart", 0);
        setIntField(term100681, term100681.getClass(), "encodedSourceEnd", 0);
        setField(term100681, term100681.getClass(), "sourceName", null);
        setIntField(term100681, term100681.getClass(), "baseLineno", 0);
        setIntField(term100681, term100681.getClass(), "endLineno", 0);
        setField(term100681, term100681.getClass(), "functions", null);
        setField(term100681, term100681.getClass(), "regexps", null);
        setField(term100681, term100681.getClass(), "itsVariables", null);
        setField(term100681, term100681.getClass(), "itsConst", null);
        setField(term100681, term100681.getClass(), "itsVariableNames", null);
        setIntField(term100681, term100681.getClass(), "varStart", 0);
        setField(term100681, term100681.getClass(), "compilerData", null);
        setIntField(term100681, term100681.getClass(), "type", 45);
        setField(term100681, term100681.getClass(), "next", null);
        setField(term100682, term100682.getClass(), "functionName", null);
        setBooleanField(term100682, term100682.getClass(), "itsNeedsActivation", false);
        setIntField(term100682, term100682.getClass(), "itsFunctionType", 0);
        setBooleanField(term100682, term100682.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100682, term100682.getClass(), "encodedSourceStart", 0);
        setIntField(term100682, term100682.getClass(), "encodedSourceEnd", 0);
        setField(term100682, term100682.getClass(), "sourceName", null);
        setIntField(term100682, term100682.getClass(), "baseLineno", 0);
        setIntField(term100682, term100682.getClass(), "endLineno", 0);
        setField(term100682, term100682.getClass(), "functions", null);
        setField(term100682, term100682.getClass(), "regexps", null);
        setField(term100682, term100682.getClass(), "itsVariables", null);
        setField(term100682, term100682.getClass(), "itsConst", null);
        setField(term100682, term100682.getClass(), "itsVariableNames", null);
        setIntField(term100682, term100682.getClass(), "varStart", 0);
        setField(term100682, term100682.getClass(), "compilerData", null);
        setIntField(term100682, term100682.getClass(), "type", 0);
        setIntField(term100683, term100683.getClass(), "type", 0);
        setField(term100683, term100683.getClass(), "next", null);
        setField(term100683, term100683.getClass(), "first", null);
        setField(term100683, term100683.getClass(), "last", null);
        setField(term100683, term100683.getClass(), "propListHead", null);
        setIntField(term100683, term100683.getClass(), "sourcePosition", 0);
        setField(term100683, term100683.getClass(), "jsType", null);
        setField(term100683, term100683.getClass(), "parent", null);
        setField(term100682, term100682.getClass(), "next", term100683);
        setField(term100682, term100682.getClass(), "first", null);
        setField(term100682, term100682.getClass(), "last", null);
        setField(term100682, term100682.getClass(), "propListHead", null);
        setIntField(term100682, term100682.getClass(), "sourcePosition", 0);
        setField(term100682, term100682.getClass(), "jsType", null);
        setField(term100682, term100682.getClass(), "parent", null);
        setField(term100681, term100681.getClass(), "first", term100682);
        setField(term100681, term100681.getClass(), "last", null);
        setField(term100681, term100681.getClass(), "propListHead", null);
        setIntField(term100681, term100681.getClass(), "sourcePosition", 0);
        setField(term100681, term100681.getClass(), "jsType", null);
        setField(term100681, term100681.getClass(), "parent", null);
        term100614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100624 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100614, term100614.getClass(), "functionName", null);
        setBooleanField(term100614, term100614.getClass(), "itsNeedsActivation", false);
        setIntField(term100614, term100614.getClass(), "itsFunctionType", 0);
        setBooleanField(term100614, term100614.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100614, term100614.getClass(), "encodedSourceStart", 0);
        setIntField(term100614, term100614.getClass(), "encodedSourceEnd", 0);
        setField(term100614, term100614.getClass(), "sourceName", null);
        setIntField(term100614, term100614.getClass(), "baseLineno", 0);
        setIntField(term100614, term100614.getClass(), "endLineno", 0);
        setField(term100614, term100614.getClass(), "functions", null);
        setField(term100614, term100614.getClass(), "regexps", null);
        setField(term100614, term100614.getClass(), "itsVariables", null);
        setField(term100614, term100614.getClass(), "itsConst", null);
        setField(term100614, term100614.getClass(), "itsVariableNames", null);
        setIntField(term100614, term100614.getClass(), "varStart", 0);
        setField(term100614, term100614.getClass(), "compilerData", null);
        setIntField(term100614, term100614.getClass(), "type", 45);
        setField(term100614, term100614.getClass(), "next", null);
        setField(term100624, term100624.getClass(), "functionName", null);
        setBooleanField(term100624, term100624.getClass(), "itsNeedsActivation", false);
        setIntField(term100624, term100624.getClass(), "itsFunctionType", 0);
        setBooleanField(term100624, term100624.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100624, term100624.getClass(), "encodedSourceStart", 0);
        setIntField(term100624, term100624.getClass(), "encodedSourceEnd", 0);
        setField(term100624, term100624.getClass(), "sourceName", null);
        setIntField(term100624, term100624.getClass(), "baseLineno", 0);
        setIntField(term100624, term100624.getClass(), "endLineno", 0);
        setField(term100624, term100624.getClass(), "functions", null);
        setField(term100624, term100624.getClass(), "regexps", null);
        setField(term100624, term100624.getClass(), "itsVariables", null);
        setField(term100624, term100624.getClass(), "itsConst", null);
        setField(term100624, term100624.getClass(), "itsVariableNames", null);
        setIntField(term100624, term100624.getClass(), "varStart", 0);
        setField(term100624, term100624.getClass(), "compilerData", null);
        setIntField(term100624, term100624.getClass(), "type", 0);
        setIntField(term100634, term100634.getClass(), "type", 0);
        setField(term100634, term100634.getClass(), "next", null);
        setField(term100634, term100634.getClass(), "first", null);
        setField(term100634, term100634.getClass(), "last", null);
        setField(term100634, term100634.getClass(), "propListHead", null);
        setIntField(term100634, term100634.getClass(), "sourcePosition", 0);
        setField(term100634, term100634.getClass(), "jsType", null);
        setField(term100634, term100634.getClass(), "parent", null);
        setField(term100624, term100624.getClass(), "next", term100634);
        setField(term100624, term100624.getClass(), "first", null);
        setField(term100624, term100624.getClass(), "last", null);
        setField(term100624, term100624.getClass(), "propListHead", null);
        setIntField(term100624, term100624.getClass(), "sourcePosition", 0);
        setField(term100624, term100624.getClass(), "jsType", null);
        setField(term100624, term100624.getClass(), "parent", null);
        setField(term100614, term100614.getClass(), "first", term100624);
        setField(term100614, term100614.getClass(), "last", null);
        setField(term100614, term100614.getClass(), "propListHead", null);
        setIntField(term100614, term100614.getClass(), "sourcePosition", 0);
        setField(term100614, term100614.getClass(), "jsType", null);
        setField(term100614, term100614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100443;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term100357, args);
        assertTrue(recursiveEquals(term100357, term100680));
        assertTrue(recursiveEquals(term100443, term100681));
        assertTrue(recursiveEquals(retValue, term100614));
    }

};


