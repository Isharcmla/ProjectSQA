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
import java.util.ArrayList;
import java.lang.Object;

public class FunctionType_resolveInternal_5807426569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458419;
     Object term458586;

    public FunctionType_resolveInternal_5807426569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term458571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList term458471 = new ArrayList();
        ((ArrayList) term458471).add(term458571);
        term458419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term458419, term458419.getClass(), "call", null);
        setField(term458419, term458419.getClass(), "prototype", null);
        setField(term458419, term458419.getClass(), "typeOfThis", null);
        setField(term458419, term458419.getClass(), "implementedInterfaces", term458471);
        Object term458589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term458589, term458589.getClass(), "call", null);
        setField(term458589, term458589.getClass(), "prototype", null);
        setField(term458589, term458589.getClass(), "kind", null);
        setField(term458589, term458589.getClass(), "typeOfThis", null);
        setField(term458589, term458589.getClass(), "source", null);
        setField(term458589, term458589.getClass(), "implementedInterfaces", null);
        setField(term458589, term458589.getClass(), "subTypes", null);
        setField(term458589, term458589.getClass(), "templateTypeName", null);
        setField(term458589, term458589.getClass(), "className", null);
        setField(term458589, term458589.getClass(), "properties", null);
        setField(term458589, term458589.getClass(), "implicitPrototype", null);
        setBooleanField(term458589, term458589.getClass(), "nativeType", false);
        setBooleanField(term458589, term458589.getClass(), "visited", false);
        setField(term458589, term458589.getClass(), "docInfo", null);
        setBooleanField(term458589, term458589.getClass(), "unknown", false);
        setBooleanField(term458589, term458589.getClass(), "resolved", false);
        setField(term458589, term458589.getClass(), "resolveResult", null);
        setField(term458589, term458589.getClass(), "registry", null);
        ArrayList term458587 = new ArrayList();
        ((ArrayList) term458587).add(term458589);
        term458586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term458586, term458586.getClass(), "leastSupertypeVisitor", null);
        setField(term458586, term458586.getClass(), "greatestSubtypeVisitor", null);
        setField(term458586, term458586.getClass(), "call", null);
        setField(term458586, term458586.getClass(), "prototype", null);
        setField(term458586, term458586.getClass(), "kind", null);
        setField(term458586, term458586.getClass(), "typeOfThis", null);
        setField(term458586, term458586.getClass(), "source", null);
        setField(term458586, term458586.getClass(), "implementedInterfaces", term458587);
        setField(term458586, term458586.getClass(), "subTypes", null);
        setField(term458586, term458586.getClass(), "templateTypeName", null);
        setField(term458586, term458586.getClass(), "className", null);
        setField(term458586, term458586.getClass(), "properties", null);
        setField(term458586, term458586.getClass(), "implicitPrototype", null);
        setBooleanField(term458586, term458586.getClass(), "nativeType", false);
        setBooleanField(term458586, term458586.getClass(), "visited", false);
        setField(term458586, term458586.getClass(), "docInfo", null);
        setBooleanField(term458586, term458586.getClass(), "unknown", false);
        setBooleanField(term458586, term458586.getClass(), "resolved", false);
        setField(term458586, term458586.getClass(), "resolveResult", null);
        setField(term458586, term458586.getClass(), "registry", null);
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
        callMethod(klass, "resolveInternal", argTypes, term458419, args);
        assertTrue(recursiveEquals(term458419, term458586));
    }

};


