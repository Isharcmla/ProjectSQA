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

public class TypeValidator_getReadableJSTypeName_850599436220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70623;
     Object term70693;

    public TypeValidator_getReadableJSTypeName_850599436220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70623 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term70693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term70957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70693, term70693.getClass(), "type", 33);
        setField(term70763, term70763.getClass(), "jsType", term70887);
        setField(term70693, term70693.getClass(), "first", term70763);
        setField(term70693, term70693.getClass(), "last", term70957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70693;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term70623, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


