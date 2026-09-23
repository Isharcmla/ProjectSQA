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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128845;
     Object term128937;
     Object term130197;
     Object term130198;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128845 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term128937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term129231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term128937, term128937.getClass(), "type", 13);
        setIntField(term129029, term129029.getClass(), "type", 13);
        setField(term129029, term129029.getClass(), "jsType", term129139);
        setField(term128937, term128937.getClass(), "first", term129029);
        setIntField(term129231, term129231.getClass(), "type", 0);
        setField(term129231, term129231.getClass(), "jsType", null);
        setField(term128937, term128937.getClass(), "last", term129231);
        term130197 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term130197, term130197.getClass(), "INEQ", null);
        setField(term130197, term130197.getClass(), "convention", null);
        setField(term130197, term130197.getClass(), "typeRegistry", null);
        setField(term130197, term130197.getClass(), "firstLink", null);
        setField(term130197, term130197.getClass(), "nextLink", null);
        setField(term130197, term130197.getClass(), "restrictUndefinedVisitor", null);
        setField(term130197, term130197.getClass(), "restrictNullVisitor", null);
        term130198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term130201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term130198, term130198.getClass(), "number", 0.0);
        setIntField(term130198, term130198.getClass(), "type", 13);
        setField(term130198, term130198.getClass(), "next", null);
        setDoubleField(term130199, term130199.getClass(), "number", 0.0);
        setIntField(term130199, term130199.getClass(), "type", 13);
        setField(term130199, term130199.getClass(), "next", null);
        setField(term130199, term130199.getClass(), "first", null);
        setField(term130199, term130199.getClass(), "last", null);
        setField(term130199, term130199.getClass(), "propListHead", null);
        setIntField(term130199, term130199.getClass(), "sourcePosition", 0);
        setField(term130200, term130200.getClass(), "call", null);
        setField(term130200, term130200.getClass(), "prototypeSlot", null);
        setField(term130200, term130200.getClass(), "kind", null);
        setField(term130200, term130200.getClass(), "typeOfThis", null);
        setField(term130200, term130200.getClass(), "source", null);
        setField(term130200, term130200.getClass(), "implementedInterfaces", null);
        setField(term130200, term130200.getClass(), "extendedInterfaces", null);
        setField(term130200, term130200.getClass(), "subTypes", null);
        setField(term130200, term130200.getClass(), "templateTypeNames", null);
        setField(term130200, term130200.getClass(), "className", null);
        setField(term130200, term130200.getClass(), "properties", null);
        setBooleanField(term130200, term130200.getClass(), "nativeType", false);
        setField(term130200, term130200.getClass(), "implicitPrototypeFallback", null);
        setField(term130200, term130200.getClass(), "ownerFunction", null);
        setBooleanField(term130200, term130200.getClass(), "prettyPrint", false);
        setBooleanField(term130200, term130200.getClass(), "visited", false);
        setField(term130200, term130200.getClass(), "docInfo", null);
        setBooleanField(term130200, term130200.getClass(), "unknown", false);
        setBooleanField(term130200, term130200.getClass(), "resolved", false);
        setField(term130200, term130200.getClass(), "resolveResult", null);
        setBooleanField(term130200, term130200.getClass(), "inTemplatedCheckVisit", false);
        setField(term130200, term130200.getClass(), "registry", null);
        setField(term130199, term130199.getClass(), "jsType", term130200);
        setField(term130199, term130199.getClass(), "parent", null);
        setField(term130198, term130198.getClass(), "first", term130199);
        setField(term130201, term130201.getClass(), "str", null);
        setIntField(term130201, term130201.getClass(), "type", 0);
        setField(term130201, term130201.getClass(), "next", null);
        setField(term130201, term130201.getClass(), "first", null);
        setField(term130201, term130201.getClass(), "last", null);
        setField(term130201, term130201.getClass(), "propListHead", null);
        setIntField(term130201, term130201.getClass(), "sourcePosition", 0);
        setField(term130201, term130201.getClass(), "jsType", null);
        setField(term130201, term130201.getClass(), "parent", null);
        setField(term130198, term130198.getClass(), "last", term130201);
        setField(term130198, term130198.getClass(), "propListHead", null);
        setIntField(term130198, term130198.getClass(), "sourcePosition", 0);
        setField(term130198, term130198.getClass(), "jsType", null);
        setField(term130198, term130198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term128937;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term128845, args);
        assertTrue(recursiveEquals(term128845, term130197));
        assertTrue(recursiveEquals(term128937, term130198));
        assertTrue(recursiveEquals(retValue, null));
    }

};


