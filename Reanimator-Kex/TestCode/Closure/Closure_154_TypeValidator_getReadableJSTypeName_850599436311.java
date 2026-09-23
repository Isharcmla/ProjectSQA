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

public class TypeValidator_getReadableJSTypeName_850599436311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110515;
     Object term110605;

    public TypeValidator_getReadableJSTypeName_850599436311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110515 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term110605 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term110695 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term110819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term110909 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term110605, term110605.getClass(), "type", 33);
        setField(term110695, term110695.getClass(), "jsType", term110819);
        setField(term110605, term110605.getClass(), "first", term110695);
        setField(term110605, term110605.getClass(), "last", term110909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term110605;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term110515, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


