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

public class PrototypeObjectType_setOwnerFunction_184534475390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12151;
     Object term12180;

    public PrototypeObjectType_setOwnerFunction_184534475390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term12151, term12151.getClass(), "ownerFunction", null);
        term12180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term12180, term12180.getClass(), "className", null);
        setField(term12180, term12180.getClass(), "properties", null);
        setBooleanField(term12180, term12180.getClass(), "nativeType", false);
        setField(term12180, term12180.getClass(), "implicitPrototypeFallback", null);
        setField(term12180, term12180.getClass(), "ownerFunction", null);
        setBooleanField(term12180, term12180.getClass(), "prettyPrint", false);
        setBooleanField(term12180, term12180.getClass(), "visited", false);
        setField(term12180, term12180.getClass(), "docInfo", null);
        setBooleanField(term12180, term12180.getClass(), "unknown", false);
        setBooleanField(term12180, term12180.getClass(), "resolved", false);
        setField(term12180, term12180.getClass(), "resolveResult", null);
        setField(term12180, term12180.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOwnerFunction", argTypes, term12151, args);
        assertTrue(recursiveEquals(term12151, term12180));
    }

};


