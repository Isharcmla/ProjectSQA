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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99442;
     Object term99550;
     Object term99630;

    public FunctionTypeBuilder_inferParameterTypes_212883572221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99442 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term99442, term99442.getClass(), "typeRegistry", null);
        setField(term99442, term99442.getClass(), "templateTypeName", "");
        term99550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99550, term99550.getClass(), "first", null);
        term99630 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term99754 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term99754, term99754.getClass(), "parameters", null);
        setField(term99630, term99630.getClass(), "info", term99754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term99550;
        args[1] = term99630;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term99442, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


