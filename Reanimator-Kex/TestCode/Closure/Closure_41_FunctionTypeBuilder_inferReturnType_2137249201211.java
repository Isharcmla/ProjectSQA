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

public class FunctionTypeBuilder_inferReturnType_2137249201211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66610;
     Object term66828;

    public FunctionTypeBuilder_inferReturnType_2137249201211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66610 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term66610, term66610.getClass(), "templateTypeName", "");
        setField(term66610, term66610.getClass(), "returnType", term66748);
        term66828 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term66828, term66828.getClass(), "bitset", -1610612736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term66828;
        try {
            callMethod(klass, "inferReturnType", argTypes, term66610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


