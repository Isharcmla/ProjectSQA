package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378975;
     Object term379067;
     Object term379882;
     Object term379883;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378975 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term379067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term379159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term379255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term379325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term379067, term379067.getClass(), "type", 46);
        setIntField(term379159, term379159.getClass(), "type", 1);
        setField(term379159, term379159.getClass(), "jsType", term379255);
        setField(term379067, term379067.getClass(), "first", term379159);
        setIntField(term379325, term379325.getClass(), "type", -16386);
        setField(term379325, term379325.getClass(), "jsType", term379425);
        setField(term379067, term379067.getClass(), "last", term379325);
        term379882 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term379882, term379882.getClass(), "INEQ", null);
        setField(term379882, term379882.getClass(), "convention", null);
        setField(term379882, term379882.getClass(), "typeRegistry", null);
        setField(term379882, term379882.getClass(), "firstLink", null);
        setField(term379882, term379882.getClass(), "nextLink", null);
        setField(term379882, term379882.getClass(), "restrictUndefinedVisitor", null);
        setField(term379882, term379882.getClass(), "restrictNullVisitor", null);
        term379883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term379884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term379885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term379886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setDoubleField(term379883, term379883.getClass(), "number", 0.0);
        setIntField(term379883, term379883.getClass(), "type", 46);
        setField(term379883, term379883.getClass(), "next", null);
        setField(term379884, term379884.getClass(), "str", null);
        setIntField(term379884, term379884.getClass(), "type", 1);
        setField(term379884, term379884.getClass(), "next", null);
        setField(term379884, term379884.getClass(), "first", null);
        setField(term379884, term379884.getClass(), "last", null);
        setField(term379884, term379884.getClass(), "propListHead", null);
        setIntField(term379884, term379884.getClass(), "sourcePosition", 0);
        setBooleanField(term379885, term379885.getClass(), "resolved", false);
        setField(term379885, term379885.getClass(), "resolveResult", null);
        setBooleanField(term379885, term379885.getClass(), "inTemplatedCheckVisit", false);
        setField(term379885, term379885.getClass(), "registry", null);
        setField(term379884, term379884.getClass(), "jsType", term379885);
        setField(term379884, term379884.getClass(), "parent", null);
        setField(term379883, term379883.getClass(), "first", term379884);
        setIntField(term379886, term379886.getClass(), "type", -16386);
        setField(term379886, term379886.getClass(), "next", null);
        setField(term379886, term379886.getClass(), "first", null);
        setField(term379886, term379886.getClass(), "last", null);
        setField(term379886, term379886.getClass(), "propListHead", null);
        setIntField(term379886, term379886.getClass(), "sourcePosition", 0);
        setField(term379887, term379887.getClass(), "call", null);
        setField(term379887, term379887.getClass(), "prototypeSlot", null);
        setField(term379887, term379887.getClass(), "kind", null);
        setField(term379887, term379887.getClass(), "typeOfThis", null);
        setField(term379887, term379887.getClass(), "source", null);
        setField(term379887, term379887.getClass(), "implementedInterfaces", null);
        setField(term379887, term379887.getClass(), "extendedInterfaces", null);
        setField(term379887, term379887.getClass(), "subTypes", null);
        setField(term379887, term379887.getClass(), "templateTypeNames", null);
        setField(term379887, term379887.getClass(), "className", null);
        setField(term379887, term379887.getClass(), "properties", null);
        setBooleanField(term379887, term379887.getClass(), "nativeType", false);
        setField(term379887, term379887.getClass(), "implicitPrototypeFallback", null);
        setField(term379887, term379887.getClass(), "ownerFunction", null);
        setBooleanField(term379887, term379887.getClass(), "prettyPrint", false);
        setBooleanField(term379887, term379887.getClass(), "visited", false);
        setField(term379887, term379887.getClass(), "docInfo", null);
        setBooleanField(term379887, term379887.getClass(), "unknown", false);
        setBooleanField(term379887, term379887.getClass(), "resolved", false);
        setField(term379887, term379887.getClass(), "resolveResult", null);
        setBooleanField(term379887, term379887.getClass(), "inTemplatedCheckVisit", false);
        setField(term379887, term379887.getClass(), "registry", null);
        setField(term379886, term379886.getClass(), "jsType", term379887);
        setField(term379886, term379886.getClass(), "parent", null);
        setField(term379883, term379883.getClass(), "last", term379886);
        setField(term379883, term379883.getClass(), "propListHead", null);
        setIntField(term379883, term379883.getClass(), "sourcePosition", 0);
        setField(term379883, term379883.getClass(), "jsType", null);
        setField(term379883, term379883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term379067;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term378975, args);
        assertTrue(recursiveEquals(term378975, term379882));
        assertTrue(recursiveEquals(term379067, term379883));
        assertTrue(recursiveEquals(retValue, null));
    }

};


