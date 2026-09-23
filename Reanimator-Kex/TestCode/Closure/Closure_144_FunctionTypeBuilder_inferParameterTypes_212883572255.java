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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_212883572255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117863;
     Object term117933;
     Object term118013;

    public FunctionTypeBuilder_inferParameterTypes_212883572255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117863 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term117863, term117863.getClass(), "typeRegistry", null);
        term117933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term117933, term117933.getClass(), "first", null);
        HashMap term118185 = new HashMap();
        term118013 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term118137 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term118137, term118137.getClass(), "parameters", term118185);
        setField(term118013, term118013.getClass(), "info", term118137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term117933;
        args[1] = term118013;
        callMethod(klass, "inferParameterTypes", argTypes, term117863, args);
    }

};


