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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110315;
     Object term110401;
     Object term110419;
     Object term110420;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110315 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term110401 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term110401, term110401.getClass(), "type", -34);
        term110419 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term110419, term110419.getClass(), "propertyTestFunctions", null);
        term110420 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term110420, term110420.getClass(), "functionName", null);
        setBooleanField(term110420, term110420.getClass(), "itsNeedsActivation", false);
        setIntField(term110420, term110420.getClass(), "itsFunctionType", 0);
        setBooleanField(term110420, term110420.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term110420, term110420.getClass(), "encodedSourceStart", 0);
        setIntField(term110420, term110420.getClass(), "encodedSourceEnd", 0);
        setField(term110420, term110420.getClass(), "sourceName", null);
        setIntField(term110420, term110420.getClass(), "baseLineno", 0);
        setIntField(term110420, term110420.getClass(), "endLineno", 0);
        setField(term110420, term110420.getClass(), "functions", null);
        setField(term110420, term110420.getClass(), "regexps", null);
        setField(term110420, term110420.getClass(), "itsVariables", null);
        setField(term110420, term110420.getClass(), "itsConst", null);
        setField(term110420, term110420.getClass(), "itsVariableNames", null);
        setIntField(term110420, term110420.getClass(), "varStart", 0);
        setField(term110420, term110420.getClass(), "compilerData", null);
        setIntField(term110420, term110420.getClass(), "type", -34);
        setField(term110420, term110420.getClass(), "next", null);
        setField(term110420, term110420.getClass(), "first", null);
        setField(term110420, term110420.getClass(), "last", null);
        setField(term110420, term110420.getClass(), "propListHead", null);
        setIntField(term110420, term110420.getClass(), "sourcePosition", 0);
        setField(term110420, term110420.getClass(), "jsType", null);
        setField(term110420, term110420.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110401;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term110315, args);
        assertTrue(recursiveEquals(term110315, term110419));
        assertTrue(recursiveEquals(term110401, term110420));
        assertTrue(recursiveEquals(retValue, null));
    }

};


