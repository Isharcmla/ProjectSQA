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

public class FunctionTypeBuilder_inferTemplateTypeName_58810598165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48836;
     Object term49020;

    public FunctionTypeBuilder_inferTemplateTypeName_58810598165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48836 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term48836, term48836.getClass(), "templateTypeName", null);
        setField(term48836, term48836.getClass(), "typeRegistry", term48940);
        term49020 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term49020, term49020.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term49020;
        try {
            callMethod(klass, "inferTemplateTypeName", argTypes, term48836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


