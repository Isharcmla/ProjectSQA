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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126037;
     Object term126129;
     Object term126544;
     Object term126545;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126037 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term126129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term126221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term126413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term126129, term126129.getClass(), "type", 46);
        setIntField(term126221, term126221.getClass(), "type", 1078385728);
        setField(term126221, term126221.getClass(), "jsType", term126321);
        setField(term126129, term126129.getClass(), "first", term126221);
        setIntField(term126413, term126413.getClass(), "type", -1078385729);
        setField(term126413, term126413.getClass(), "jsType", null);
        setField(term126129, term126129.getClass(), "last", term126413);
        term126544 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term126544, term126544.getClass(), "INEQ", null);
        setField(term126544, term126544.getClass(), "convention", null);
        setField(term126544, term126544.getClass(), "typeRegistry", null);
        setField(term126544, term126544.getClass(), "firstLink", null);
        setField(term126544, term126544.getClass(), "nextLink", null);
        setField(term126544, term126544.getClass(), "restrictUndefinedVisitor", null);
        setField(term126544, term126544.getClass(), "restrictNullVisitor", null);
        term126545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term126546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term126548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term126545, term126545.getClass(), "str", null);
        setIntField(term126545, term126545.getClass(), "type", 46);
        setField(term126545, term126545.getClass(), "next", null);
        setDoubleField(term126546, term126546.getClass(), "number", 0.0);
        setIntField(term126546, term126546.getClass(), "type", 1078385728);
        setField(term126546, term126546.getClass(), "next", null);
        setField(term126546, term126546.getClass(), "first", null);
        setField(term126546, term126546.getClass(), "last", null);
        setField(term126546, term126546.getClass(), "propListHead", null);
        setIntField(term126546, term126546.getClass(), "sourcePosition", 0);
        setField(term126547, term126547.getClass(), "call", null);
        setField(term126547, term126547.getClass(), "prototypeSlot", null);
        setField(term126547, term126547.getClass(), "kind", null);
        setField(term126547, term126547.getClass(), "typeOfThis", null);
        setField(term126547, term126547.getClass(), "source", null);
        setField(term126547, term126547.getClass(), "implementedInterfaces", null);
        setField(term126547, term126547.getClass(), "extendedInterfaces", null);
        setField(term126547, term126547.getClass(), "subTypes", null);
        setField(term126547, term126547.getClass(), "templateTypeNames", null);
        setField(term126547, term126547.getClass(), "className", null);
        setField(term126547, term126547.getClass(), "properties", null);
        setBooleanField(term126547, term126547.getClass(), "nativeType", false);
        setField(term126547, term126547.getClass(), "implicitPrototypeFallback", null);
        setField(term126547, term126547.getClass(), "ownerFunction", null);
        setBooleanField(term126547, term126547.getClass(), "prettyPrint", false);
        setBooleanField(term126547, term126547.getClass(), "visited", false);
        setField(term126547, term126547.getClass(), "docInfo", null);
        setBooleanField(term126547, term126547.getClass(), "unknown", false);
        setBooleanField(term126547, term126547.getClass(), "resolved", false);
        setField(term126547, term126547.getClass(), "resolveResult", null);
        setBooleanField(term126547, term126547.getClass(), "inTemplatedCheckVisit", false);
        setField(term126547, term126547.getClass(), "registry", null);
        setField(term126546, term126546.getClass(), "jsType", term126547);
        setField(term126546, term126546.getClass(), "parent", null);
        setField(term126545, term126545.getClass(), "first", term126546);
        setDoubleField(term126548, term126548.getClass(), "number", 0.0);
        setIntField(term126548, term126548.getClass(), "type", -1078385729);
        setField(term126548, term126548.getClass(), "next", null);
        setField(term126548, term126548.getClass(), "first", null);
        setField(term126548, term126548.getClass(), "last", null);
        setField(term126548, term126548.getClass(), "propListHead", null);
        setIntField(term126548, term126548.getClass(), "sourcePosition", 0);
        setField(term126548, term126548.getClass(), "jsType", null);
        setField(term126548, term126548.getClass(), "parent", null);
        setField(term126545, term126545.getClass(), "last", term126548);
        setField(term126545, term126545.getClass(), "propListHead", null);
        setIntField(term126545, term126545.getClass(), "sourcePosition", 0);
        setField(term126545, term126545.getClass(), "jsType", null);
        setField(term126545, term126545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term126129;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term126037, args);
        assertTrue(recursiveEquals(term126037, term126544));
        assertTrue(recursiveEquals(term126129, term126545));
        assertTrue(recursiveEquals(retValue, null));
    }

};


