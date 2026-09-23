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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371942;
     Object term372034;
     Object term372467;
     Object term372468;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371942 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term372034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term372126 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term372218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term372314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term372034, term372034.getClass(), "type", 111);
        setIntField(term372218, term372218.getClass(), "type", -112);
        setField(term372218, term372218.getClass(), "jsType", term372314);
        setField(term372126, term372126.getClass(), "first", term372218);
        setField(term372034, term372034.getClass(), "parent", term372126);
        setField(term372034, term372034.getClass(), "first", term372034);
        setField(term372034, term372034.getClass(), "jsType", null);
        term372467 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term372467, term372467.getClass(), "INEQ", null);
        setField(term372467, term372467.getClass(), "convention", null);
        setField(term372467, term372467.getClass(), "typeRegistry", null);
        setField(term372467, term372467.getClass(), "firstLink", null);
        setField(term372467, term372467.getClass(), "nextLink", null);
        setField(term372467, term372467.getClass(), "restrictUndefinedVisitor", null);
        setField(term372467, term372467.getClass(), "restrictNullVisitor", null);
        term372468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term372469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term372470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term372471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setDoubleField(term372468, term372468.getClass(), "number", 0.0);
        setIntField(term372468, term372468.getClass(), "type", 111);
        setField(term372468, term372468.getClass(), "next", null);
        setField(term372468, term372468.getClass(), "first", term372468);
        setField(term372468, term372468.getClass(), "last", null);
        setField(term372468, term372468.getClass(), "propListHead", null);
        setIntField(term372468, term372468.getClass(), "sourcePosition", 0);
        setField(term372468, term372468.getClass(), "jsType", null);
        setDoubleField(term372469, term372469.getClass(), "number", 0.0);
        setIntField(term372469, term372469.getClass(), "type", 0);
        setField(term372469, term372469.getClass(), "next", null);
        setField(term372470, term372470.getClass(), "str", null);
        setIntField(term372470, term372470.getClass(), "type", -112);
        setField(term372470, term372470.getClass(), "next", null);
        setField(term372470, term372470.getClass(), "first", null);
        setField(term372470, term372470.getClass(), "last", null);
        setField(term372470, term372470.getClass(), "propListHead", null);
        setIntField(term372470, term372470.getClass(), "sourcePosition", 0);
        setBooleanField(term372471, term372471.getClass(), "resolved", false);
        setField(term372471, term372471.getClass(), "resolveResult", null);
        setBooleanField(term372471, term372471.getClass(), "inTemplatedCheckVisit", false);
        setField(term372471, term372471.getClass(), "registry", null);
        setField(term372470, term372470.getClass(), "jsType", term372471);
        setField(term372470, term372470.getClass(), "parent", null);
        setField(term372469, term372469.getClass(), "first", term372470);
        setField(term372469, term372469.getClass(), "last", null);
        setField(term372469, term372469.getClass(), "propListHead", null);
        setIntField(term372469, term372469.getClass(), "sourcePosition", 0);
        setField(term372469, term372469.getClass(), "jsType", null);
        setField(term372469, term372469.getClass(), "parent", null);
        setField(term372468, term372468.getClass(), "parent", term372469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term372034;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term371942, args);
        assertTrue(recursiveEquals(term371942, term372467));
        assertTrue(recursiveEquals(term372034, term372468));
        assertTrue(recursiveEquals(retValue, null));
    }

};


