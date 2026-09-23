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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464112;
     Object term464204;
     Object term464962;
     Object term464963;
     Object term464854;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term464204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term464290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term464376, term464376.getClass(), "type", 47);
        setField(term464290, term464290.getClass(), "next", term464376);
        setIntField(term464290, term464290.getClass(), "type", 0);
        setField(term464204, term464204.getClass(), "first", term464290);
        setIntField(term464204, term464204.getClass(), "type", 101);
        setField(term464204, term464204.getClass(), "parent", term464446);
        term464962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term464962, term464962.getClass(), "currentTraversal", null);
        term464963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term464964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term464963, term464963.getClass(), "str", null);
        setIntField(term464963, term464963.getClass(), "type", 101);
        setField(term464963, term464963.getClass(), "next", null);
        setField(term464964, term464964.getClass(), "functionName", null);
        setBooleanField(term464964, term464964.getClass(), "itsNeedsActivation", false);
        setIntField(term464964, term464964.getClass(), "itsFunctionType", 0);
        setBooleanField(term464964, term464964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term464964, term464964.getClass(), "encodedSourceStart", 0);
        setIntField(term464964, term464964.getClass(), "encodedSourceEnd", 0);
        setField(term464964, term464964.getClass(), "sourceName", null);
        setIntField(term464964, term464964.getClass(), "baseLineno", 0);
        setIntField(term464964, term464964.getClass(), "endLineno", 0);
        setField(term464964, term464964.getClass(), "functions", null);
        setField(term464964, term464964.getClass(), "regexps", null);
        setField(term464964, term464964.getClass(), "itsVariables", null);
        setField(term464964, term464964.getClass(), "itsConst", null);
        setField(term464964, term464964.getClass(), "itsVariableNames", null);
        setIntField(term464964, term464964.getClass(), "varStart", 0);
        setField(term464964, term464964.getClass(), "compilerData", null);
        setIntField(term464964, term464964.getClass(), "type", 0);
        setField(term464965, term464965.getClass(), "functionName", null);
        setBooleanField(term464965, term464965.getClass(), "itsNeedsActivation", false);
        setIntField(term464965, term464965.getClass(), "itsFunctionType", 0);
        setBooleanField(term464965, term464965.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term464965, term464965.getClass(), "encodedSourceStart", 0);
        setIntField(term464965, term464965.getClass(), "encodedSourceEnd", 0);
        setField(term464965, term464965.getClass(), "sourceName", null);
        setIntField(term464965, term464965.getClass(), "baseLineno", 0);
        setIntField(term464965, term464965.getClass(), "endLineno", 0);
        setField(term464965, term464965.getClass(), "functions", null);
        setField(term464965, term464965.getClass(), "regexps", null);
        setField(term464965, term464965.getClass(), "itsVariables", null);
        setField(term464965, term464965.getClass(), "itsConst", null);
        setField(term464965, term464965.getClass(), "itsVariableNames", null);
        setIntField(term464965, term464965.getClass(), "varStart", 0);
        setField(term464965, term464965.getClass(), "compilerData", null);
        setIntField(term464965, term464965.getClass(), "type", 47);
        setField(term464965, term464965.getClass(), "next", null);
        setField(term464965, term464965.getClass(), "first", null);
        setField(term464965, term464965.getClass(), "last", null);
        setField(term464965, term464965.getClass(), "propListHead", null);
        setIntField(term464965, term464965.getClass(), "sourcePosition", 0);
        setField(term464965, term464965.getClass(), "jsType", null);
        setField(term464965, term464965.getClass(), "parent", null);
        setField(term464964, term464964.getClass(), "next", term464965);
        setField(term464964, term464964.getClass(), "first", null);
        setField(term464964, term464964.getClass(), "last", null);
        setField(term464964, term464964.getClass(), "propListHead", null);
        setIntField(term464964, term464964.getClass(), "sourcePosition", 0);
        setField(term464964, term464964.getClass(), "jsType", null);
        setField(term464964, term464964.getClass(), "parent", null);
        setField(term464963, term464963.getClass(), "first", term464964);
        setField(term464963, term464963.getClass(), "last", null);
        setField(term464963, term464963.getClass(), "propListHead", null);
        setIntField(term464963, term464963.getClass(), "sourcePosition", 0);
        setField(term464963, term464963.getClass(), "jsType", null);
        setIntField(term464966, term464966.getClass(), "type", 0);
        setField(term464966, term464966.getClass(), "next", null);
        setField(term464966, term464966.getClass(), "first", null);
        setField(term464966, term464966.getClass(), "last", null);
        setField(term464966, term464966.getClass(), "propListHead", null);
        setIntField(term464966, term464966.getClass(), "sourcePosition", 0);
        setField(term464966, term464966.getClass(), "jsType", null);
        setField(term464966, term464966.getClass(), "parent", null);
        setField(term464963, term464963.getClass(), "parent", term464966);
        term464854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term464856 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term464879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term464854, term464854.getClass(), "str", null);
        setIntField(term464854, term464854.getClass(), "type", 101);
        setField(term464854, term464854.getClass(), "next", null);
        setField(term464856, term464856.getClass(), "functionName", null);
        setBooleanField(term464856, term464856.getClass(), "itsNeedsActivation", false);
        setIntField(term464856, term464856.getClass(), "itsFunctionType", 0);
        setBooleanField(term464856, term464856.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term464856, term464856.getClass(), "encodedSourceStart", 0);
        setIntField(term464856, term464856.getClass(), "encodedSourceEnd", 0);
        setField(term464856, term464856.getClass(), "sourceName", null);
        setIntField(term464856, term464856.getClass(), "baseLineno", 0);
        setIntField(term464856, term464856.getClass(), "endLineno", 0);
        setField(term464856, term464856.getClass(), "functions", null);
        setField(term464856, term464856.getClass(), "regexps", null);
        setField(term464856, term464856.getClass(), "itsVariables", null);
        setField(term464856, term464856.getClass(), "itsConst", null);
        setField(term464856, term464856.getClass(), "itsVariableNames", null);
        setIntField(term464856, term464856.getClass(), "varStart", 0);
        setField(term464856, term464856.getClass(), "compilerData", null);
        setIntField(term464856, term464856.getClass(), "type", 0);
        setField(term464866, term464866.getClass(), "functionName", null);
        setBooleanField(term464866, term464866.getClass(), "itsNeedsActivation", false);
        setIntField(term464866, term464866.getClass(), "itsFunctionType", 0);
        setBooleanField(term464866, term464866.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term464866, term464866.getClass(), "encodedSourceStart", 0);
        setIntField(term464866, term464866.getClass(), "encodedSourceEnd", 0);
        setField(term464866, term464866.getClass(), "sourceName", null);
        setIntField(term464866, term464866.getClass(), "baseLineno", 0);
        setIntField(term464866, term464866.getClass(), "endLineno", 0);
        setField(term464866, term464866.getClass(), "functions", null);
        setField(term464866, term464866.getClass(), "regexps", null);
        setField(term464866, term464866.getClass(), "itsVariables", null);
        setField(term464866, term464866.getClass(), "itsConst", null);
        setField(term464866, term464866.getClass(), "itsVariableNames", null);
        setIntField(term464866, term464866.getClass(), "varStart", 0);
        setField(term464866, term464866.getClass(), "compilerData", null);
        setIntField(term464866, term464866.getClass(), "type", 47);
        setField(term464866, term464866.getClass(), "next", null);
        setField(term464866, term464866.getClass(), "first", null);
        setField(term464866, term464866.getClass(), "last", null);
        setField(term464866, term464866.getClass(), "propListHead", null);
        setIntField(term464866, term464866.getClass(), "sourcePosition", 0);
        setField(term464866, term464866.getClass(), "jsType", null);
        setField(term464866, term464866.getClass(), "parent", null);
        setField(term464856, term464856.getClass(), "next", term464866);
        setField(term464856, term464856.getClass(), "first", null);
        setField(term464856, term464856.getClass(), "last", null);
        setField(term464856, term464856.getClass(), "propListHead", null);
        setIntField(term464856, term464856.getClass(), "sourcePosition", 0);
        setField(term464856, term464856.getClass(), "jsType", null);
        setField(term464856, term464856.getClass(), "parent", null);
        setField(term464854, term464854.getClass(), "first", term464856);
        setField(term464854, term464854.getClass(), "last", null);
        setField(term464854, term464854.getClass(), "propListHead", null);
        setIntField(term464854, term464854.getClass(), "sourcePosition", 0);
        setField(term464854, term464854.getClass(), "jsType", null);
        setIntField(term464879, term464879.getClass(), "type", 0);
        setField(term464879, term464879.getClass(), "next", null);
        setField(term464879, term464879.getClass(), "first", null);
        setField(term464879, term464879.getClass(), "last", null);
        setField(term464879, term464879.getClass(), "propListHead", null);
        setIntField(term464879, term464879.getClass(), "sourcePosition", 0);
        setField(term464879, term464879.getClass(), "jsType", null);
        setField(term464879, term464879.getClass(), "parent", null);
        setField(term464854, term464854.getClass(), "parent", term464879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term464204;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term464112, args);
        assertTrue(recursiveEquals(term464112, term464962));
        assertTrue(recursiveEquals(term464204, term464963));
        assertTrue(recursiveEquals(retValue, term464854));
    }

};


