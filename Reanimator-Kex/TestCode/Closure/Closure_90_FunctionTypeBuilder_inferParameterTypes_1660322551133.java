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

public class FunctionTypeBuilder_inferParameterTypes_1660322551133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56734;
     Object term57096;

    public FunctionTypeBuilder_inferParameterTypes_1660322551133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56734 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term56804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56804, term56804.getClass(), "first", term56874);
        setField(term56734, term56734.getClass(), "parametersNode", term56804);
        setField(term56734, term56734.getClass(), "typeRegistry", term56978);
        setField(term56734, term56734.getClass(), "templateTypeName", "");
        term57096 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term57096, term57096.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term57096;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term56734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


