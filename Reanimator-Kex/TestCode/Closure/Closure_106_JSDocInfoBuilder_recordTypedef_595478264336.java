package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JSDocInfoBuilder_recordTypedef_595478264336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141429;
     Object term141827;

    public JSDocInfoBuilder_recordTypedef_595478264336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term141681 = new HashMap();
        term141429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term141509 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term141633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term141509, term141509.getClass(), "bitset", -1073741824);
        setField(term141633, term141633.getClass(), "parameters", term141681);
        setField(term141633, term141633.getClass(), "baseType", null);
        setField(term141509, term141509.getClass(), "info", term141633);
        setField(term141509, term141509.getClass(), "thisType", null);
        setField(term141429, term141429.getClass(), "currentInfo", term141509);
        term141827 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term141827;
        try {
            callMethod(klass, "recordTypedef", argTypes, term141429, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


