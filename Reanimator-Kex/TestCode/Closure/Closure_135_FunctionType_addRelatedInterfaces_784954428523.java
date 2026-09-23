package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class FunctionType_addRelatedInterfaces_784954428523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393369;
     Object term393479;
     Object term393491;
     Object term393492;

    public FunctionType_addRelatedInterfaces_784954428523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term393479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term393491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term393491, term393491.getClass(), "call", null);
        setField(term393491, term393491.getClass(), "prototype", null);
        setField(term393491, term393491.getClass(), "kind", null);
        setField(term393491, term393491.getClass(), "typeOfThis", null);
        setField(term393491, term393491.getClass(), "source", null);
        setField(term393491, term393491.getClass(), "implementedInterfaces", null);
        setField(term393491, term393491.getClass(), "subTypes", null);
        setField(term393491, term393491.getClass(), "templateTypeName", null);
        setField(term393491, term393491.getClass(), "className", null);
        setField(term393491, term393491.getClass(), "properties", null);
        setField(term393491, term393491.getClass(), "implicitPrototype", null);
        setBooleanField(term393491, term393491.getClass(), "nativeType", false);
        setBooleanField(term393491, term393491.getClass(), "visited", false);
        setField(term393491, term393491.getClass(), "docInfo", null);
        setBooleanField(term393491, term393491.getClass(), "unknown", false);
        setBooleanField(term393491, term393491.getClass(), "resolved", false);
        setField(term393491, term393491.getClass(), "resolveResult", null);
        setField(term393491, term393491.getClass(), "registry", null);
        term393492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term393492, term393492.getClass(), "call", null);
        setField(term393492, term393492.getClass(), "prototype", null);
        setField(term393492, term393492.getClass(), "kind", null);
        setField(term393492, term393492.getClass(), "typeOfThis", null);
        setField(term393492, term393492.getClass(), "source", null);
        setField(term393492, term393492.getClass(), "implementedInterfaces", null);
        setField(term393492, term393492.getClass(), "subTypes", null);
        setField(term393492, term393492.getClass(), "templateTypeName", null);
        setField(term393492, term393492.getClass(), "className", null);
        setField(term393492, term393492.getClass(), "properties", null);
        setField(term393492, term393492.getClass(), "implicitPrototype", null);
        setBooleanField(term393492, term393492.getClass(), "nativeType", false);
        setBooleanField(term393492, term393492.getClass(), "visited", false);
        setField(term393492, term393492.getClass(), "docInfo", null);
        setBooleanField(term393492, term393492.getClass(), "unknown", false);
        setBooleanField(term393492, term393492.getClass(), "resolved", false);
        setField(term393492, term393492.getClass(), "resolveResult", null);
        setField(term393492, term393492.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term393479;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term393369, args);
        assertTrue(recursiveEquals(term393369, term393491));
        assertTrue(recursiveEquals(term393479, term393492));
    }

};


