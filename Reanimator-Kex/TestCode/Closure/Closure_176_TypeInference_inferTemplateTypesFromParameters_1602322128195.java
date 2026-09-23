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

public class TypeInference_inferTemplateTypesFromParameters_1602322128195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91990;
     Object term92090;

    public TypeInference_inferTemplateTypesFromParameters_1602322128195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91990 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term92090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(term92090, term92090.getClass(), "templateTypeMap", term92196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term92090;
        args[1] = null;
        try {
            callMethod(klass, "inferTemplateTypesFromParameters", argTypes, term91990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


