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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115104;
     Object term115196;
     Object term116276;
     Object term116277;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115104 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term115196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term115568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term115196, term115196.getClass(), "type", 111);
        setIntField(term115380, term115380.getClass(), "type", 0);
        setField(term115380, term115380.getClass(), "jsType", term115476);
        setField(term115288, term115288.getClass(), "first", term115380);
        setField(term115196, term115196.getClass(), "parent", term115288);
        setIntField(term115568, term115568.getClass(), "type", 0);
        setField(term115568, term115568.getClass(), "jsType", null);
        setField(term115196, term115196.getClass(), "first", term115568);
        term116276 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term116276, term116276.getClass(), "INEQ", null);
        setField(term116276, term116276.getClass(), "convention", null);
        setField(term116276, term116276.getClass(), "typeRegistry", null);
        setField(term116276, term116276.getClass(), "firstLink", null);
        setField(term116276, term116276.getClass(), "nextLink", null);
        setField(term116276, term116276.getClass(), "restrictUndefinedVisitor", null);
        setField(term116276, term116276.getClass(), "restrictNullVisitor", null);
        term116277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term116278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term116280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term116281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term116277, term116277.getClass(), "str", null);
        setIntField(term116277, term116277.getClass(), "type", 111);
        setField(term116277, term116277.getClass(), "next", null);
        setDoubleField(term116278, term116278.getClass(), "number", 0.0);
        setIntField(term116278, term116278.getClass(), "type", 0);
        setField(term116278, term116278.getClass(), "next", null);
        setField(term116278, term116278.getClass(), "first", null);
        setField(term116278, term116278.getClass(), "last", null);
        setField(term116278, term116278.getClass(), "propListHead", null);
        setIntField(term116278, term116278.getClass(), "sourcePosition", 0);
        setField(term116278, term116278.getClass(), "jsType", null);
        setField(term116278, term116278.getClass(), "parent", null);
        setField(term116277, term116277.getClass(), "first", term116278);
        setField(term116277, term116277.getClass(), "last", null);
        setField(term116277, term116277.getClass(), "propListHead", null);
        setIntField(term116277, term116277.getClass(), "sourcePosition", 0);
        setField(term116277, term116277.getClass(), "jsType", null);
        setField(term116279, term116279.getClass(), "str", null);
        setIntField(term116279, term116279.getClass(), "type", 0);
        setField(term116279, term116279.getClass(), "next", null);
        setField(term116280, term116280.getClass(), "str", null);
        setIntField(term116280, term116280.getClass(), "type", 0);
        setField(term116280, term116280.getClass(), "next", null);
        setField(term116280, term116280.getClass(), "first", null);
        setField(term116280, term116280.getClass(), "last", null);
        setField(term116280, term116280.getClass(), "propListHead", null);
        setIntField(term116280, term116280.getClass(), "sourcePosition", 0);
        setField(term116281, term116281.getClass(), "properties", null);
        setBooleanField(term116281, term116281.getClass(), "declared", false);
        setBooleanField(term116281, term116281.getClass(), "isFrozen", false);
        setField(term116281, term116281.getClass(), "className", null);
        setField(term116281, term116281.getClass(), "properties", null);
        setBooleanField(term116281, term116281.getClass(), "nativeType", false);
        setField(term116281, term116281.getClass(), "implicitPrototypeFallback", null);
        setField(term116281, term116281.getClass(), "ownerFunction", null);
        setBooleanField(term116281, term116281.getClass(), "prettyPrint", false);
        setBooleanField(term116281, term116281.getClass(), "visited", false);
        setField(term116281, term116281.getClass(), "docInfo", null);
        setBooleanField(term116281, term116281.getClass(), "unknown", false);
        setBooleanField(term116281, term116281.getClass(), "resolved", false);
        setField(term116281, term116281.getClass(), "resolveResult", null);
        setBooleanField(term116281, term116281.getClass(), "inTemplatedCheckVisit", false);
        setField(term116281, term116281.getClass(), "registry", null);
        setField(term116280, term116280.getClass(), "jsType", term116281);
        setField(term116280, term116280.getClass(), "parent", null);
        setField(term116279, term116279.getClass(), "first", term116280);
        setField(term116279, term116279.getClass(), "last", null);
        setField(term116279, term116279.getClass(), "propListHead", null);
        setIntField(term116279, term116279.getClass(), "sourcePosition", 0);
        setField(term116279, term116279.getClass(), "jsType", null);
        setField(term116279, term116279.getClass(), "parent", null);
        setField(term116277, term116277.getClass(), "parent", term116279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term115196;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term115104, args);
        assertTrue(recursiveEquals(term115104, term116276));
        assertTrue(recursiveEquals(term115196, term116277));
        assertTrue(recursiveEquals(retValue, null));
    }

};


