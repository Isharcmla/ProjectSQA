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

public class TypeValidator_getReadableJSTypeName_850599436264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85524;
     Object term85614;

    public TypeValidator_getReadableJSTypeName_850599436264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85524 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term85614 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term85704 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term85828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term85918 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term85614, term85614.getClass(), "type", 33);
        setField(term85704, term85704.getClass(), "jsType", term85828);
        setField(term85614, term85614.getClass(), "first", term85704);
        setField(term85614, term85614.getClass(), "last", term85918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term85614;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term85524, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


