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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100397;
     Object term100571;
     Object term100721;

    public FunctionTypeBuilder_inferParameterTypes_212883572223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100397 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term100397, term100397.getClass(), "typeRegistry", term100501);
        term100571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100571, term100571.getClass(), "first", term100641);
        term100721 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term100845 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term100845, term100845.getClass(), "parameters", null);
        setField(term100721, term100721.getClass(), "info", term100845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term100571;
        args[1] = term100721;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term100397, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


