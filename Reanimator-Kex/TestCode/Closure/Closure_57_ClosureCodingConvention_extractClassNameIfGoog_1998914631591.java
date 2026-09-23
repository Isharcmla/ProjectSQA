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

public class ClosureCodingConvention_extractClassNameIfGoog_1998914631591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207949;
     Object term208035;
     Object term208184;
     Object term208186;

    public ClosureCodingConvention_extractClassNameIfGoog_1998914631591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term208035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term208035, term208035.getClass(), "type", 130);
        setIntField(term208121, term208121.getClass(), "type", 37);
        setField(term208035, term208035.getClass(), "first", term208121);
        term208184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term208184, term208184.getClass(), "functionName", null);
        setBooleanField(term208184, term208184.getClass(), "itsNeedsActivation", false);
        setIntField(term208184, term208184.getClass(), "itsFunctionType", 0);
        setBooleanField(term208184, term208184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208184, term208184.getClass(), "encodedSourceStart", 0);
        setIntField(term208184, term208184.getClass(), "encodedSourceEnd", 0);
        setField(term208184, term208184.getClass(), "sourceName", null);
        setIntField(term208184, term208184.getClass(), "baseLineno", 0);
        setIntField(term208184, term208184.getClass(), "endLineno", 0);
        setField(term208184, term208184.getClass(), "functions", null);
        setField(term208184, term208184.getClass(), "regexps", null);
        setField(term208184, term208184.getClass(), "itsVariables", null);
        setField(term208184, term208184.getClass(), "itsConst", null);
        setField(term208184, term208184.getClass(), "itsVariableNames", null);
        setIntField(term208184, term208184.getClass(), "varStart", 0);
        setField(term208184, term208184.getClass(), "compilerData", null);
        setIntField(term208184, term208184.getClass(), "type", 130);
        setField(term208184, term208184.getClass(), "next", null);
        setField(term208185, term208185.getClass(), "functionName", null);
        setBooleanField(term208185, term208185.getClass(), "itsNeedsActivation", false);
        setIntField(term208185, term208185.getClass(), "itsFunctionType", 0);
        setBooleanField(term208185, term208185.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208185, term208185.getClass(), "encodedSourceStart", 0);
        setIntField(term208185, term208185.getClass(), "encodedSourceEnd", 0);
        setField(term208185, term208185.getClass(), "sourceName", null);
        setIntField(term208185, term208185.getClass(), "baseLineno", 0);
        setIntField(term208185, term208185.getClass(), "endLineno", 0);
        setField(term208185, term208185.getClass(), "functions", null);
        setField(term208185, term208185.getClass(), "regexps", null);
        setField(term208185, term208185.getClass(), "itsVariables", null);
        setField(term208185, term208185.getClass(), "itsConst", null);
        setField(term208185, term208185.getClass(), "itsVariableNames", null);
        setIntField(term208185, term208185.getClass(), "varStart", 0);
        setField(term208185, term208185.getClass(), "compilerData", null);
        setIntField(term208185, term208185.getClass(), "type", 37);
        setField(term208185, term208185.getClass(), "next", null);
        setField(term208185, term208185.getClass(), "first", null);
        setField(term208185, term208185.getClass(), "last", null);
        setField(term208185, term208185.getClass(), "propListHead", null);
        setIntField(term208185, term208185.getClass(), "sourcePosition", 0);
        setField(term208185, term208185.getClass(), "jsType", null);
        setField(term208185, term208185.getClass(), "parent", null);
        setField(term208184, term208184.getClass(), "first", term208185);
        setField(term208184, term208184.getClass(), "last", null);
        setField(term208184, term208184.getClass(), "propListHead", null);
        setIntField(term208184, term208184.getClass(), "sourcePosition", 0);
        setField(term208184, term208184.getClass(), "jsType", null);
        setField(term208184, term208184.getClass(), "parent", null);
        term208186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term208186, term208186.getClass(), "functionName", null);
        setBooleanField(term208186, term208186.getClass(), "itsNeedsActivation", false);
        setIntField(term208186, term208186.getClass(), "itsFunctionType", 0);
        setBooleanField(term208186, term208186.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208186, term208186.getClass(), "encodedSourceStart", 0);
        setIntField(term208186, term208186.getClass(), "encodedSourceEnd", 0);
        setField(term208186, term208186.getClass(), "sourceName", null);
        setIntField(term208186, term208186.getClass(), "baseLineno", 0);
        setIntField(term208186, term208186.getClass(), "endLineno", 0);
        setField(term208186, term208186.getClass(), "functions", null);
        setField(term208186, term208186.getClass(), "regexps", null);
        setField(term208186, term208186.getClass(), "itsVariables", null);
        setField(term208186, term208186.getClass(), "itsConst", null);
        setField(term208186, term208186.getClass(), "itsVariableNames", null);
        setIntField(term208186, term208186.getClass(), "varStart", 0);
        setField(term208186, term208186.getClass(), "compilerData", null);
        setIntField(term208186, term208186.getClass(), "type", 0);
        setField(term208186, term208186.getClass(), "next", null);
        setField(term208186, term208186.getClass(), "first", null);
        setField(term208186, term208186.getClass(), "last", null);
        setField(term208186, term208186.getClass(), "propListHead", null);
        setIntField(term208186, term208186.getClass(), "sourcePosition", 0);
        setField(term208186, term208186.getClass(), "jsType", null);
        setField(term208186, term208186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term207949;
        args[1] = term208035;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term207949, term208184));
        assertTrue(recursiveEquals(term208035, term208186));
        assertTrue(recursiveEquals(retValue, null));
    }

};


