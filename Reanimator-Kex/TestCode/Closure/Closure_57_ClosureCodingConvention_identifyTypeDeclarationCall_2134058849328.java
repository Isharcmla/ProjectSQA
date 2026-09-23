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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128767;
     Object term128857;
     Object term129292;
     Object term129293;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128767 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term128857 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term128947 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term128857, term128857.getClass(), "first", term128947);
        term129292 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term129292, term129292.getClass(), "propertyTestFunctions", null);
        term129293 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term129294 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term129293, term129293.getClass(), "encodedSourceStart", 0);
        setIntField(term129293, term129293.getClass(), "encodedSourceEnd", 0);
        setField(term129293, term129293.getClass(), "sourceName", null);
        setIntField(term129293, term129293.getClass(), "baseLineno", 0);
        setIntField(term129293, term129293.getClass(), "endLineno", 0);
        setField(term129293, term129293.getClass(), "functions", null);
        setField(term129293, term129293.getClass(), "regexps", null);
        setField(term129293, term129293.getClass(), "itsVariables", null);
        setField(term129293, term129293.getClass(), "itsConst", null);
        setField(term129293, term129293.getClass(), "itsVariableNames", null);
        setIntField(term129293, term129293.getClass(), "varStart", 0);
        setField(term129293, term129293.getClass(), "compilerData", null);
        setIntField(term129293, term129293.getClass(), "type", 0);
        setField(term129293, term129293.getClass(), "next", null);
        setIntField(term129294, term129294.getClass(), "encodedSourceStart", 0);
        setIntField(term129294, term129294.getClass(), "encodedSourceEnd", 0);
        setField(term129294, term129294.getClass(), "sourceName", null);
        setIntField(term129294, term129294.getClass(), "baseLineno", 0);
        setIntField(term129294, term129294.getClass(), "endLineno", 0);
        setField(term129294, term129294.getClass(), "functions", null);
        setField(term129294, term129294.getClass(), "regexps", null);
        setField(term129294, term129294.getClass(), "itsVariables", null);
        setField(term129294, term129294.getClass(), "itsConst", null);
        setField(term129294, term129294.getClass(), "itsVariableNames", null);
        setIntField(term129294, term129294.getClass(), "varStart", 0);
        setField(term129294, term129294.getClass(), "compilerData", null);
        setIntField(term129294, term129294.getClass(), "type", 0);
        setField(term129294, term129294.getClass(), "next", null);
        setField(term129294, term129294.getClass(), "first", null);
        setField(term129294, term129294.getClass(), "last", null);
        setField(term129294, term129294.getClass(), "propListHead", null);
        setIntField(term129294, term129294.getClass(), "sourcePosition", 0);
        setField(term129294, term129294.getClass(), "jsType", null);
        setField(term129294, term129294.getClass(), "parent", null);
        setField(term129293, term129293.getClass(), "first", term129294);
        setField(term129293, term129293.getClass(), "last", null);
        setField(term129293, term129293.getClass(), "propListHead", null);
        setIntField(term129293, term129293.getClass(), "sourcePosition", 0);
        setField(term129293, term129293.getClass(), "jsType", null);
        setField(term129293, term129293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128857;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term128767, args);
        assertTrue(recursiveEquals(term128767, term129292));
        assertTrue(recursiveEquals(term128857, term129293));
        assertTrue(recursiveEquals(retValue, null));
    }

};


