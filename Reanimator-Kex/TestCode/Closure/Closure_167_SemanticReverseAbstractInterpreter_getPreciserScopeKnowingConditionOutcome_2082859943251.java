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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61194;
     Object term61286;
     Object term61593;
     Object term61594;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61194 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term61286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term61286, term61286.getClass(), "type", 12);
        setField(term61286, term61286.getClass(), "first", term61286);
        setIntField(term61378, term61378.getClass(), "type", -33554957);
        setField(term61378, term61378.getClass(), "jsType", null);
        setField(term61286, term61286.getClass(), "last", term61378);
        setField(term61286, term61286.getClass(), "jsType", term61484);
        term61593 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term61593, term61593.getClass(), "INEQ", null);
        setField(term61593, term61593.getClass(), "convention", null);
        setField(term61593, term61593.getClass(), "typeRegistry", null);
        setField(term61593, term61593.getClass(), "firstLink", null);
        setField(term61593, term61593.getClass(), "nextLink", null);
        setField(term61593, term61593.getClass(), "restrictUndefinedVisitor", null);
        setField(term61593, term61593.getClass(), "restrictNullVisitor", null);
        term61594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term61594, term61594.getClass(), "str", null);
        setIntField(term61594, term61594.getClass(), "type", 12);
        setField(term61594, term61594.getClass(), "next", null);
        setField(term61594, term61594.getClass(), "first", term61594);
        setField(term61595, term61595.getClass(), "str", null);
        setIntField(term61595, term61595.getClass(), "type", -33554957);
        setField(term61595, term61595.getClass(), "next", null);
        setField(term61595, term61595.getClass(), "first", null);
        setField(term61595, term61595.getClass(), "last", null);
        setField(term61595, term61595.getClass(), "propListHead", null);
        setIntField(term61595, term61595.getClass(), "sourcePosition", 0);
        setField(term61595, term61595.getClass(), "jsType", null);
        setField(term61595, term61595.getClass(), "parent", null);
        setField(term61594, term61594.getClass(), "last", term61595);
        setField(term61594, term61594.getClass(), "propListHead", null);
        setIntField(term61594, term61594.getClass(), "sourcePosition", 0);
        setField(term61596, term61596.getClass(), "referencedType", null);
        setField(term61596, term61596.getClass(), "referencedObjType", null);
        setBooleanField(term61596, term61596.getClass(), "visited", false);
        setField(term61596, term61596.getClass(), "docInfo", null);
        setBooleanField(term61596, term61596.getClass(), "unknown", false);
        setBooleanField(term61596, term61596.getClass(), "resolved", false);
        setField(term61596, term61596.getClass(), "resolveResult", null);
        setBooleanField(term61596, term61596.getClass(), "inTemplatedCheckVisit", false);
        setField(term61596, term61596.getClass(), "registry", null);
        setField(term61594, term61594.getClass(), "jsType", term61596);
        setField(term61594, term61594.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term61286;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term61194, args);
        assertTrue(recursiveEquals(term61194, term61593));
        assertTrue(recursiveEquals(term61286, term61594));
        assertTrue(recursiveEquals(retValue, null));
    }

};


