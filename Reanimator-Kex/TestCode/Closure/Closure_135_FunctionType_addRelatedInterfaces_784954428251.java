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

public class FunctionType_addRelatedInterfaces_784954428251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125914;
     Object term126022;
     Object term126034;
     Object term126035;

    public FunctionType_addRelatedInterfaces_784954428251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term126022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        term126034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term126034, term126034.getClass(), "this$0", null);
        setField(term126034, term126034.getClass(), "call", null);
        setField(term126034, term126034.getClass(), "prototype", null);
        setField(term126034, term126034.getClass(), "kind", null);
        setField(term126034, term126034.getClass(), "typeOfThis", null);
        setField(term126034, term126034.getClass(), "source", null);
        setField(term126034, term126034.getClass(), "implementedInterfaces", null);
        setField(term126034, term126034.getClass(), "subTypes", null);
        setField(term126034, term126034.getClass(), "templateTypeName", null);
        setField(term126034, term126034.getClass(), "className", null);
        setField(term126034, term126034.getClass(), "properties", null);
        setField(term126034, term126034.getClass(), "implicitPrototype", null);
        setBooleanField(term126034, term126034.getClass(), "nativeType", false);
        setBooleanField(term126034, term126034.getClass(), "visited", false);
        setField(term126034, term126034.getClass(), "docInfo", null);
        setBooleanField(term126034, term126034.getClass(), "unknown", false);
        setBooleanField(term126034, term126034.getClass(), "resolved", false);
        setField(term126034, term126034.getClass(), "resolveResult", null);
        setField(term126034, term126034.getClass(), "registry", null);
        term126035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term126035, term126035.getClass(), "this$0", null);
        setField(term126035, term126035.getClass(), "call", null);
        setField(term126035, term126035.getClass(), "prototype", null);
        setField(term126035, term126035.getClass(), "kind", null);
        setField(term126035, term126035.getClass(), "typeOfThis", null);
        setField(term126035, term126035.getClass(), "source", null);
        setField(term126035, term126035.getClass(), "implementedInterfaces", null);
        setField(term126035, term126035.getClass(), "subTypes", null);
        setField(term126035, term126035.getClass(), "templateTypeName", null);
        setField(term126035, term126035.getClass(), "className", null);
        setField(term126035, term126035.getClass(), "properties", null);
        setField(term126035, term126035.getClass(), "implicitPrototype", null);
        setBooleanField(term126035, term126035.getClass(), "nativeType", false);
        setBooleanField(term126035, term126035.getClass(), "visited", false);
        setField(term126035, term126035.getClass(), "docInfo", null);
        setBooleanField(term126035, term126035.getClass(), "unknown", false);
        setBooleanField(term126035, term126035.getClass(), "resolved", false);
        setField(term126035, term126035.getClass(), "resolveResult", null);
        setField(term126035, term126035.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term126022;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term125914, args);
        assertTrue(recursiveEquals(term125914, term126034));
        assertTrue(recursiveEquals(term126022, term126035));
    }

};


