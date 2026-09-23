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
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113564;
     Object term113860;
     Object term113940;

    public FunctionTypeBuilder_inferParameterTypes_212883572298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113564 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term113650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term113736 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term113650, term113650.getClass(), "first", term113736);
        setField(term113564, term113564.getClass(), "parametersNode", term113650);
        setField(term113564, term113564.getClass(), "typeRegistry", null);
        setField(term113564, term113564.getClass(), "templateTypeName", "");
        term113860 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term113860, term113860.getClass(), "first", null);
        term113940 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term113940, term113940.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term113860;
        args[1] = term113940;
        callMethod(klass, "inferParameterTypes", argTypes, term113564, args);
    }

};


