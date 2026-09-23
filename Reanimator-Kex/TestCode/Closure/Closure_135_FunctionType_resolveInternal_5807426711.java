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
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659274;
     Object term659624;

    public FunctionType_resolveInternal_5807426711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term659608 = new ArrayList();
        term659274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term659368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term659462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term659556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setBooleanField(term659368, term659368.getClass(), "resolved", false);
        setBooleanField(term659462, term659462.getClass(), "resolved", false);
        setField(term659462, term659462.getClass(), "returnType", null);
        setField(term659462, term659462.getClass(), "parameters", null);
        setField(term659462, term659462.getClass(), "resolveResult", null);
        setField(term659368, term659368.getClass(), "returnType", term659462);
        setField(term659368, term659368.getClass(), "parameters", null);
        setField(term659368, term659368.getClass(), "resolveResult", term659556);
        setField(term659274, term659274.getClass(), "call", term659368);
        setField(term659274, term659274.getClass(), "prototype", null);
        setField(term659274, term659274.getClass(), "typeOfThis", null);
        setField(term659274, term659274.getClass(), "implementedInterfaces", term659608);
        ArrayList term659628 = new ArrayList();
        term659624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term659625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term659626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term659627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term659624, term659624.getClass(), "leastSupertypeVisitor", null);
        setField(term659624, term659624.getClass(), "greatestSubtypeVisitor", null);
        setField(term659625, term659625.getClass(), "parameters", null);
        setField(term659626, term659626.getClass(), "parameters", null);
        setField(term659626, term659626.getClass(), "returnType", null);
        setBooleanField(term659626, term659626.getClass(), "resolved", false);
        setField(term659626, term659626.getClass(), "resolveResult", null);
        setField(term659626, term659626.getClass(), "registry", null);
        setField(term659625, term659625.getClass(), "returnType", term659626);
        setBooleanField(term659625, term659625.getClass(), "resolved", false);
        setField(term659627, term659627.getClass(), "parameters", null);
        setField(term659627, term659627.getClass(), "returnType", null);
        setBooleanField(term659627, term659627.getClass(), "resolved", false);
        setField(term659627, term659627.getClass(), "resolveResult", null);
        setField(term659627, term659627.getClass(), "registry", null);
        setField(term659625, term659625.getClass(), "resolveResult", term659627);
        setField(term659625, term659625.getClass(), "registry", null);
        setField(term659624, term659624.getClass(), "call", term659625);
        setField(term659624, term659624.getClass(), "prototype", null);
        setField(term659624, term659624.getClass(), "kind", null);
        setField(term659624, term659624.getClass(), "typeOfThis", null);
        setField(term659624, term659624.getClass(), "source", null);
        setField(term659624, term659624.getClass(), "implementedInterfaces", term659628);
        setField(term659624, term659624.getClass(), "subTypes", null);
        setField(term659624, term659624.getClass(), "templateTypeName", null);
        setField(term659624, term659624.getClass(), "className", null);
        setField(term659624, term659624.getClass(), "properties", null);
        setField(term659624, term659624.getClass(), "implicitPrototype", null);
        setBooleanField(term659624, term659624.getClass(), "nativeType", false);
        setBooleanField(term659624, term659624.getClass(), "visited", false);
        setField(term659624, term659624.getClass(), "docInfo", null);
        setBooleanField(term659624, term659624.getClass(), "unknown", false);
        setBooleanField(term659624, term659624.getClass(), "resolved", false);
        setField(term659624, term659624.getClass(), "resolveResult", null);
        setField(term659624, term659624.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term659274, args);
        assertTrue(recursiveEquals(term659274, term659624));
    }

};


