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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207575;
     Object term207667;
     Object term208038;
     Object term208039;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207575 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term207667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term207759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term207943 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term207667, term207667.getClass(), "type", 46);
        setIntField(term207759, term207759.getClass(), "type", 1078385728);
        setField(term207759, term207759.getClass(), "jsType", term207851);
        setField(term207667, term207667.getClass(), "first", term207759);
        setIntField(term207943, term207943.getClass(), "type", -1078385729);
        setField(term207943, term207943.getClass(), "jsType", null);
        setField(term207667, term207667.getClass(), "last", term207943);
        term208038 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term208038, term208038.getClass(), "INEQ", null);
        setField(term208038, term208038.getClass(), "convention", null);
        setField(term208038, term208038.getClass(), "typeRegistry", null);
        setField(term208038, term208038.getClass(), "firstLink", null);
        setField(term208038, term208038.getClass(), "nextLink", null);
        setField(term208038, term208038.getClass(), "restrictUndefinedVisitor", null);
        setField(term208038, term208038.getClass(), "restrictNullVisitor", null);
        term208039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208040 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term208041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term208042 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term208039, term208039.getClass(), "str", null);
        setIntField(term208039, term208039.getClass(), "type", 46);
        setField(term208039, term208039.getClass(), "next", null);
        setDoubleField(term208040, term208040.getClass(), "number", 0.0);
        setIntField(term208040, term208040.getClass(), "type", 1078385728);
        setField(term208040, term208040.getClass(), "next", null);
        setField(term208040, term208040.getClass(), "first", null);
        setField(term208040, term208040.getClass(), "last", null);
        setField(term208040, term208040.getClass(), "propListHead", null);
        setIntField(term208040, term208040.getClass(), "sourcePosition", 0);
        setBooleanField(term208041, term208041.getClass(), "resolved", false);
        setField(term208041, term208041.getClass(), "resolveResult", null);
        setBooleanField(term208041, term208041.getClass(), "inTemplatedCheckVisit", false);
        setField(term208041, term208041.getClass(), "registry", null);
        setField(term208040, term208040.getClass(), "jsType", term208041);
        setField(term208040, term208040.getClass(), "parent", null);
        setField(term208039, term208039.getClass(), "first", term208040);
        setDoubleField(term208042, term208042.getClass(), "number", 0.0);
        setIntField(term208042, term208042.getClass(), "type", -1078385729);
        setField(term208042, term208042.getClass(), "next", null);
        setField(term208042, term208042.getClass(), "first", null);
        setField(term208042, term208042.getClass(), "last", null);
        setField(term208042, term208042.getClass(), "propListHead", null);
        setIntField(term208042, term208042.getClass(), "sourcePosition", 0);
        setField(term208042, term208042.getClass(), "jsType", null);
        setField(term208042, term208042.getClass(), "parent", null);
        setField(term208039, term208039.getClass(), "last", term208042);
        setField(term208039, term208039.getClass(), "propListHead", null);
        setIntField(term208039, term208039.getClass(), "sourcePosition", 0);
        setField(term208039, term208039.getClass(), "jsType", null);
        setField(term208039, term208039.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term207667;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term207575, args);
        assertTrue(recursiveEquals(term207575, term208038));
        assertTrue(recursiveEquals(term207667, term208039));
        assertTrue(recursiveEquals(retValue, null));
    }

};


