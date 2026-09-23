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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191431;
     Object term191523;
     Object term191947;
     Object term191948;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191431 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term191523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term191803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term191523, term191523.getClass(), "type", 46);
        setIntField(term191615, term191615.getClass(), "type", 46);
        setField(term191615, term191615.getClass(), "jsType", term191711);
        setField(term191523, term191523.getClass(), "first", term191615);
        setIntField(term191803, term191803.getClass(), "type", 0);
        setField(term191803, term191803.getClass(), "jsType", null);
        setField(term191523, term191523.getClass(), "last", term191803);
        term191947 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term191947, term191947.getClass(), "INEQ", null);
        setField(term191947, term191947.getClass(), "convention", null);
        setField(term191947, term191947.getClass(), "typeRegistry", null);
        setField(term191947, term191947.getClass(), "firstLink", null);
        setField(term191947, term191947.getClass(), "nextLink", null);
        setField(term191947, term191947.getClass(), "restrictUndefinedVisitor", null);
        setField(term191947, term191947.getClass(), "restrictNullVisitor", null);
        term191948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term191951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term191948, term191948.getClass(), "str", null);
        setIntField(term191948, term191948.getClass(), "type", 46);
        setField(term191948, term191948.getClass(), "next", null);
        setField(term191949, term191949.getClass(), "str", null);
        setIntField(term191949, term191949.getClass(), "type", 46);
        setField(term191949, term191949.getClass(), "next", null);
        setField(term191949, term191949.getClass(), "first", null);
        setField(term191949, term191949.getClass(), "last", null);
        setField(term191949, term191949.getClass(), "propListHead", null);
        setIntField(term191949, term191949.getClass(), "sourcePosition", 0);
        setField(term191950, term191950.getClass(), "properties", null);
        setBooleanField(term191950, term191950.getClass(), "declared", false);
        setBooleanField(term191950, term191950.getClass(), "isFrozen", false);
        setField(term191950, term191950.getClass(), "className", null);
        setField(term191950, term191950.getClass(), "properties", null);
        setBooleanField(term191950, term191950.getClass(), "nativeType", false);
        setField(term191950, term191950.getClass(), "implicitPrototypeFallback", null);
        setField(term191950, term191950.getClass(), "ownerFunction", null);
        setBooleanField(term191950, term191950.getClass(), "prettyPrint", false);
        setBooleanField(term191950, term191950.getClass(), "visited", false);
        setField(term191950, term191950.getClass(), "docInfo", null);
        setBooleanField(term191950, term191950.getClass(), "unknown", false);
        setBooleanField(term191950, term191950.getClass(), "resolved", false);
        setField(term191950, term191950.getClass(), "resolveResult", null);
        setBooleanField(term191950, term191950.getClass(), "inTemplatedCheckVisit", false);
        setField(term191950, term191950.getClass(), "registry", null);
        setField(term191949, term191949.getClass(), "jsType", term191950);
        setField(term191949, term191949.getClass(), "parent", null);
        setField(term191948, term191948.getClass(), "first", term191949);
        setDoubleField(term191951, term191951.getClass(), "number", 0.0);
        setIntField(term191951, term191951.getClass(), "type", 0);
        setField(term191951, term191951.getClass(), "next", null);
        setField(term191951, term191951.getClass(), "first", null);
        setField(term191951, term191951.getClass(), "last", null);
        setField(term191951, term191951.getClass(), "propListHead", null);
        setIntField(term191951, term191951.getClass(), "sourcePosition", 0);
        setField(term191951, term191951.getClass(), "jsType", null);
        setField(term191951, term191951.getClass(), "parent", null);
        setField(term191948, term191948.getClass(), "last", term191951);
        setField(term191948, term191948.getClass(), "propListHead", null);
        setIntField(term191948, term191948.getClass(), "sourcePosition", 0);
        setField(term191948, term191948.getClass(), "jsType", null);
        setField(term191948, term191948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term191523;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term191431, args);
        assertTrue(recursiveEquals(term191431, term191947));
        assertTrue(recursiveEquals(term191523, term191948));
        assertTrue(recursiveEquals(retValue, null));
    }

};


