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

public class ClosureCodingConvention_describeFunctionBind_91621925870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43880;
     Object term43966;
     Object term44555;
     Object term44556;

    public ClosureCodingConvention_describeFunctionBind_91621925870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43880 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term43966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term44555 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term44555, term44555.getClass(), "propertyTestFunctions", null);
        term44556 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44556, term44556.getClass(), "functionName", null);
        setBooleanField(term44556, term44556.getClass(), "itsNeedsActivation", false);
        setIntField(term44556, term44556.getClass(), "itsFunctionType", 0);
        setBooleanField(term44556, term44556.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44556, term44556.getClass(), "encodedSourceStart", 0);
        setIntField(term44556, term44556.getClass(), "encodedSourceEnd", 0);
        setField(term44556, term44556.getClass(), "sourceName", null);
        setIntField(term44556, term44556.getClass(), "baseLineno", 0);
        setIntField(term44556, term44556.getClass(), "endLineno", 0);
        setField(term44556, term44556.getClass(), "functions", null);
        setField(term44556, term44556.getClass(), "regexps", null);
        setField(term44556, term44556.getClass(), "itsVariables", null);
        setField(term44556, term44556.getClass(), "itsConst", null);
        setField(term44556, term44556.getClass(), "itsVariableNames", null);
        setIntField(term44556, term44556.getClass(), "varStart", 0);
        setField(term44556, term44556.getClass(), "compilerData", null);
        setIntField(term44556, term44556.getClass(), "type", 0);
        setField(term44556, term44556.getClass(), "next", null);
        setField(term44556, term44556.getClass(), "first", null);
        setField(term44556, term44556.getClass(), "last", null);
        setField(term44556, term44556.getClass(), "propListHead", null);
        setIntField(term44556, term44556.getClass(), "sourcePosition", 0);
        setField(term44556, term44556.getClass(), "jsType", null);
        setField(term44556, term44556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43966;
        Object retValue = callMethod(klass, "describeFunctionBind", argTypes, term43880, args);
        assertTrue(recursiveEquals(term43880, term44555));
        assertTrue(recursiveEquals(term43966, term44556));
        assertTrue(recursiveEquals(retValue, null));
    }

};


