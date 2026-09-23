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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216337;
     Object term216429;
     Object term216848;
     Object term216849;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216337 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term216429 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term216521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term216717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term216429, term216429.getClass(), "type", 13);
        setIntField(term216521, term216521.getClass(), "type", 1078385728);
        setField(term216521, term216521.getClass(), "jsType", term216625);
        setField(term216429, term216429.getClass(), "first", term216521);
        setIntField(term216717, term216717.getClass(), "type", -1078385729);
        setField(term216717, term216717.getClass(), "jsType", null);
        setField(term216429, term216429.getClass(), "last", term216717);
        term216848 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term216848, term216848.getClass(), "INEQ", null);
        setField(term216848, term216848.getClass(), "convention", null);
        setField(term216848, term216848.getClass(), "typeRegistry", null);
        setField(term216848, term216848.getClass(), "firstLink", null);
        setField(term216848, term216848.getClass(), "nextLink", null);
        setField(term216848, term216848.getClass(), "restrictUndefinedVisitor", null);
        setField(term216848, term216848.getClass(), "restrictNullVisitor", null);
        term216849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term216850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term216851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term216852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term216849, term216849.getClass(), "str", null);
        setIntField(term216849, term216849.getClass(), "type", 13);
        setField(term216849, term216849.getClass(), "next", null);
        setDoubleField(term216850, term216850.getClass(), "number", 0.0);
        setIntField(term216850, term216850.getClass(), "type", 1078385728);
        setField(term216850, term216850.getClass(), "next", null);
        setField(term216850, term216850.getClass(), "first", null);
        setField(term216850, term216850.getClass(), "last", null);
        setField(term216850, term216850.getClass(), "propListHead", null);
        setIntField(term216850, term216850.getClass(), "sourcePosition", 0);
        setField(term216851, term216851.getClass(), "call", null);
        setField(term216851, term216851.getClass(), "prototypeSlot", null);
        setField(term216851, term216851.getClass(), "kind", null);
        setField(term216851, term216851.getClass(), "typeOfThis", null);
        setField(term216851, term216851.getClass(), "source", null);
        setField(term216851, term216851.getClass(), "implementedInterfaces", null);
        setField(term216851, term216851.getClass(), "extendedInterfaces", null);
        setField(term216851, term216851.getClass(), "subTypes", null);
        setField(term216851, term216851.getClass(), "templateTypeNames", null);
        setField(term216851, term216851.getClass(), "className", null);
        setField(term216851, term216851.getClass(), "properties", null);
        setBooleanField(term216851, term216851.getClass(), "nativeType", false);
        setField(term216851, term216851.getClass(), "implicitPrototypeFallback", null);
        setField(term216851, term216851.getClass(), "ownerFunction", null);
        setBooleanField(term216851, term216851.getClass(), "prettyPrint", false);
        setBooleanField(term216851, term216851.getClass(), "visited", false);
        setField(term216851, term216851.getClass(), "docInfo", null);
        setBooleanField(term216851, term216851.getClass(), "unknown", false);
        setBooleanField(term216851, term216851.getClass(), "resolved", false);
        setField(term216851, term216851.getClass(), "resolveResult", null);
        setBooleanField(term216851, term216851.getClass(), "inTemplatedCheckVisit", false);
        setField(term216851, term216851.getClass(), "registry", null);
        setField(term216850, term216850.getClass(), "jsType", term216851);
        setField(term216850, term216850.getClass(), "parent", null);
        setField(term216849, term216849.getClass(), "first", term216850);
        setDoubleField(term216852, term216852.getClass(), "number", 0.0);
        setIntField(term216852, term216852.getClass(), "type", -1078385729);
        setField(term216852, term216852.getClass(), "next", null);
        setField(term216852, term216852.getClass(), "first", null);
        setField(term216852, term216852.getClass(), "last", null);
        setField(term216852, term216852.getClass(), "propListHead", null);
        setIntField(term216852, term216852.getClass(), "sourcePosition", 0);
        setField(term216852, term216852.getClass(), "jsType", null);
        setField(term216852, term216852.getClass(), "parent", null);
        setField(term216849, term216849.getClass(), "last", term216852);
        setField(term216849, term216849.getClass(), "propListHead", null);
        setIntField(term216849, term216849.getClass(), "sourcePosition", 0);
        setField(term216849, term216849.getClass(), "jsType", null);
        setField(term216849, term216849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term216429;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term216337, args);
        assertTrue(recursiveEquals(term216337, term216848));
        assertTrue(recursiveEquals(term216429, term216849));
        assertTrue(recursiveEquals(retValue, null));
    }

};


