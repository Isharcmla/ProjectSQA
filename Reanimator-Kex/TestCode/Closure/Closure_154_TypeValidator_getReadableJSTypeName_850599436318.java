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

public class TypeValidator_getReadableJSTypeName_850599436318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114347;
     Object term114437;

    public TypeValidator_getReadableJSTypeName_850599436318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114347 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term114437 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term114507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term114711 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term114437, term114437.getClass(), "type", 33);
        setField(term114507, term114507.getClass(), "jsType", term114621);
        setField(term114437, term114437.getClass(), "first", term114507);
        setField(term114437, term114437.getClass(), "last", term114711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term114437;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term114347, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


