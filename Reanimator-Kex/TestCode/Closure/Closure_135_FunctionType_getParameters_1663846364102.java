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

public class FunctionType_getParameters_1663846364102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56361;
     Object term57274;
     Object term57273;

    public FunctionType_getParameters_1663846364102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term57274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term57274, term57274.getClass(), "this$0", null);
        setField(term57274, term57274.getClass(), "call", null);
        setField(term57274, term57274.getClass(), "prototype", null);
        setField(term57274, term57274.getClass(), "kind", null);
        setField(term57274, term57274.getClass(), "typeOfThis", null);
        setField(term57274, term57274.getClass(), "source", null);
        setField(term57274, term57274.getClass(), "implementedInterfaces", null);
        setField(term57274, term57274.getClass(), "subTypes", null);
        setField(term57274, term57274.getClass(), "templateTypeName", null);
        setField(term57274, term57274.getClass(), "className", null);
        setField(term57274, term57274.getClass(), "properties", null);
        setField(term57274, term57274.getClass(), "implicitPrototype", null);
        setBooleanField(term57274, term57274.getClass(), "nativeType", false);
        setBooleanField(term57274, term57274.getClass(), "visited", false);
        setField(term57274, term57274.getClass(), "docInfo", null);
        setBooleanField(term57274, term57274.getClass(), "unknown", false);
        setBooleanField(term57274, term57274.getClass(), "resolved", false);
        setField(term57274, term57274.getClass(), "resolveResult", null);
        setField(term57274, term57274.getClass(), "registry", null);
        term57273 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term56361, args);
        assertTrue(recursiveEquals(term56361, term57274));
        assertTrue(recursiveEquals(retValue, term57273));
    }

};


