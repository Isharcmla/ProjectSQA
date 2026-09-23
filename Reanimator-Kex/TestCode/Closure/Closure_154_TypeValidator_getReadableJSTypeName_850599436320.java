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

public class TypeValidator_getReadableJSTypeName_850599436320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115796;
     Object term115882;

    public TypeValidator_getReadableJSTypeName_850599436320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115796 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term115882 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term115968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term116092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term116178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term115882, term115882.getClass(), "type", 33);
        setField(term115968, term115968.getClass(), "jsType", term116092);
        setField(term115882, term115882.getClass(), "first", term115968);
        setField(term115882, term115882.getClass(), "last", term116178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term115882;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term115796, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


