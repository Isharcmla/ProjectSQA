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

public class FunctionType_addRelatedInterfaces_784954428405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308459;
     Object term308577;
     Object term308591;
     Object term308592;

    public FunctionType_addRelatedInterfaces_784954428405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term308577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        term308591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term308591, term308591.getClass(), "call", null);
        setField(term308591, term308591.getClass(), "prototype", null);
        setField(term308591, term308591.getClass(), "kind", null);
        setField(term308591, term308591.getClass(), "typeOfThis", null);
        setField(term308591, term308591.getClass(), "source", null);
        setField(term308591, term308591.getClass(), "implementedInterfaces", null);
        setField(term308591, term308591.getClass(), "subTypes", null);
        setField(term308591, term308591.getClass(), "templateTypeName", null);
        setField(term308591, term308591.getClass(), "className", null);
        setField(term308591, term308591.getClass(), "properties", null);
        setBooleanField(term308591, term308591.getClass(), "nativeType", false);
        setField(term308591, term308591.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term308591, term308591.getClass(), "prettyPrint", false);
        setBooleanField(term308591, term308591.getClass(), "visited", false);
        setField(term308591, term308591.getClass(), "docInfo", null);
        setBooleanField(term308591, term308591.getClass(), "unknown", false);
        setBooleanField(term308591, term308591.getClass(), "resolved", false);
        setField(term308591, term308591.getClass(), "resolveResult", null);
        setField(term308591, term308591.getClass(), "registry", null);
        term308592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term308592, term308592.getClass(), "ownerFunction", null);
        setField(term308592, term308592.getClass(), "className", null);
        setField(term308592, term308592.getClass(), "properties", null);
        setBooleanField(term308592, term308592.getClass(), "nativeType", false);
        setField(term308592, term308592.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term308592, term308592.getClass(), "prettyPrint", false);
        setBooleanField(term308592, term308592.getClass(), "visited", false);
        setField(term308592, term308592.getClass(), "docInfo", null);
        setBooleanField(term308592, term308592.getClass(), "unknown", false);
        setBooleanField(term308592, term308592.getClass(), "resolved", false);
        setField(term308592, term308592.getClass(), "resolveResult", null);
        setField(term308592, term308592.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term308577;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term308459, args);
        assertTrue(recursiveEquals(term308459, term308591));
        assertTrue(recursiveEquals(term308577, term308592));
    }

};


