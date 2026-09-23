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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255995;
     Object term256087;
     Object term256489;
     Object term256490;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255995 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term256087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term256179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term256345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256087, term256087.getClass(), "type", 45);
        setIntField(term256179, term256179.getClass(), "type", -458798);
        setField(term256179, term256179.getClass(), "jsType", term256275);
        setField(term256087, term256087.getClass(), "first", term256179);
        setIntField(term256345, term256345.getClass(), "type", 45);
        setField(term256345, term256345.getClass(), "jsType", null);
        setField(term256087, term256087.getClass(), "last", term256345);
        term256489 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term256489, term256489.getClass(), "INEQ", null);
        setField(term256489, term256489.getClass(), "convention", null);
        setField(term256489, term256489.getClass(), "typeRegistry", null);
        setField(term256489, term256489.getClass(), "firstLink", null);
        setField(term256489, term256489.getClass(), "nextLink", null);
        setField(term256489, term256489.getClass(), "restrictUndefinedVisitor", null);
        setField(term256489, term256489.getClass(), "restrictNullVisitor", null);
        term256490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term256491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term256493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term256490, term256490.getClass(), "str", null);
        setIntField(term256490, term256490.getClass(), "type", 45);
        setField(term256490, term256490.getClass(), "next", null);
        setDoubleField(term256491, term256491.getClass(), "number", 0.0);
        setIntField(term256491, term256491.getClass(), "type", -458798);
        setField(term256491, term256491.getClass(), "next", null);
        setField(term256491, term256491.getClass(), "first", null);
        setField(term256491, term256491.getClass(), "last", null);
        setField(term256491, term256491.getClass(), "propListHead", null);
        setIntField(term256491, term256491.getClass(), "sourcePosition", 0);
        setField(term256492, term256492.getClass(), "properties", null);
        setBooleanField(term256492, term256492.getClass(), "declared", false);
        setBooleanField(term256492, term256492.getClass(), "isFrozen", false);
        setField(term256492, term256492.getClass(), "className", null);
        setField(term256492, term256492.getClass(), "properties", null);
        setBooleanField(term256492, term256492.getClass(), "nativeType", false);
        setField(term256492, term256492.getClass(), "implicitPrototypeFallback", null);
        setField(term256492, term256492.getClass(), "ownerFunction", null);
        setBooleanField(term256492, term256492.getClass(), "prettyPrint", false);
        setBooleanField(term256492, term256492.getClass(), "visited", false);
        setField(term256492, term256492.getClass(), "docInfo", null);
        setBooleanField(term256492, term256492.getClass(), "unknown", false);
        setBooleanField(term256492, term256492.getClass(), "resolved", false);
        setField(term256492, term256492.getClass(), "resolveResult", null);
        setBooleanField(term256492, term256492.getClass(), "inTemplatedCheckVisit", false);
        setField(term256492, term256492.getClass(), "registry", null);
        setField(term256491, term256491.getClass(), "jsType", term256492);
        setField(term256491, term256491.getClass(), "parent", null);
        setField(term256490, term256490.getClass(), "first", term256491);
        setIntField(term256493, term256493.getClass(), "type", 45);
        setField(term256493, term256493.getClass(), "next", null);
        setField(term256493, term256493.getClass(), "first", null);
        setField(term256493, term256493.getClass(), "last", null);
        setField(term256493, term256493.getClass(), "propListHead", null);
        setIntField(term256493, term256493.getClass(), "sourcePosition", 0);
        setField(term256493, term256493.getClass(), "jsType", null);
        setField(term256493, term256493.getClass(), "parent", null);
        setField(term256490, term256490.getClass(), "last", term256493);
        setField(term256490, term256490.getClass(), "propListHead", null);
        setIntField(term256490, term256490.getClass(), "sourcePosition", 0);
        setField(term256490, term256490.getClass(), "jsType", null);
        setField(term256490, term256490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term256087;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term255995, args);
        assertTrue(recursiveEquals(term255995, term256489));
        assertTrue(recursiveEquals(term256087, term256490));
        assertTrue(recursiveEquals(retValue, null));
    }

};


