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

public class ClosureCodingConvention_getObjectLiteralCast_148496234139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64469;
     Object term64559;
     Object term64691;
     Object term64692;

    public ClosureCodingConvention_getObjectLiteralCast_148496234139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64469 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term64559 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term64649 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term64559, term64559.getClass(), "type", 37);
        setField(term64559, term64559.getClass(), "first", term64649);
        term64691 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term64691, term64691.getClass(), "propertyTestFunctions", null);
        term64692 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term64693 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term64692, term64692.getClass(), "encodedSourceStart", 0);
        setIntField(term64692, term64692.getClass(), "encodedSourceEnd", 0);
        setField(term64692, term64692.getClass(), "sourceName", null);
        setIntField(term64692, term64692.getClass(), "baseLineno", 0);
        setIntField(term64692, term64692.getClass(), "endLineno", 0);
        setField(term64692, term64692.getClass(), "functions", null);
        setField(term64692, term64692.getClass(), "regexps", null);
        setField(term64692, term64692.getClass(), "itsVariables", null);
        setField(term64692, term64692.getClass(), "itsConst", null);
        setField(term64692, term64692.getClass(), "itsVariableNames", null);
        setIntField(term64692, term64692.getClass(), "varStart", 0);
        setField(term64692, term64692.getClass(), "compilerData", null);
        setIntField(term64692, term64692.getClass(), "type", 37);
        setField(term64692, term64692.getClass(), "next", null);
        setIntField(term64693, term64693.getClass(), "encodedSourceStart", 0);
        setIntField(term64693, term64693.getClass(), "encodedSourceEnd", 0);
        setField(term64693, term64693.getClass(), "sourceName", null);
        setIntField(term64693, term64693.getClass(), "baseLineno", 0);
        setIntField(term64693, term64693.getClass(), "endLineno", 0);
        setField(term64693, term64693.getClass(), "functions", null);
        setField(term64693, term64693.getClass(), "regexps", null);
        setField(term64693, term64693.getClass(), "itsVariables", null);
        setField(term64693, term64693.getClass(), "itsConst", null);
        setField(term64693, term64693.getClass(), "itsVariableNames", null);
        setIntField(term64693, term64693.getClass(), "varStart", 0);
        setField(term64693, term64693.getClass(), "compilerData", null);
        setIntField(term64693, term64693.getClass(), "type", 0);
        setField(term64693, term64693.getClass(), "next", null);
        setField(term64693, term64693.getClass(), "first", null);
        setField(term64693, term64693.getClass(), "last", null);
        setField(term64693, term64693.getClass(), "propListHead", null);
        setIntField(term64693, term64693.getClass(), "sourcePosition", 0);
        setField(term64693, term64693.getClass(), "jsType", null);
        setField(term64693, term64693.getClass(), "parent", null);
        setField(term64692, term64692.getClass(), "first", term64693);
        setField(term64692, term64692.getClass(), "last", null);
        setField(term64692, term64692.getClass(), "propListHead", null);
        setIntField(term64692, term64692.getClass(), "sourcePosition", 0);
        setField(term64692, term64692.getClass(), "jsType", null);
        setField(term64692, term64692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64559;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term64469, args);
        assertTrue(recursiveEquals(term64469, term64691));
        assertTrue(recursiveEquals(term64559, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


