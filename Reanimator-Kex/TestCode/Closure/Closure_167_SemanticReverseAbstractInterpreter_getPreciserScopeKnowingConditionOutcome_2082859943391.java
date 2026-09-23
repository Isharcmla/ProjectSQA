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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102524;
     Object term102616;
     Object term102626;
     Object term102627;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102524 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term102616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term102616, term102616.getClass(), "type", 14);
        term102626 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term102626, term102626.getClass(), "INEQ", null);
        setField(term102626, term102626.getClass(), "convention", null);
        setField(term102626, term102626.getClass(), "typeRegistry", null);
        setField(term102626, term102626.getClass(), "firstLink", null);
        setField(term102626, term102626.getClass(), "nextLink", null);
        setField(term102626, term102626.getClass(), "restrictUndefinedVisitor", null);
        setField(term102626, term102626.getClass(), "restrictNullVisitor", null);
        term102627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term102627, term102627.getClass(), "number", 0.0);
        setIntField(term102627, term102627.getClass(), "type", 14);
        setField(term102627, term102627.getClass(), "next", null);
        setField(term102627, term102627.getClass(), "first", null);
        setField(term102627, term102627.getClass(), "last", null);
        setField(term102627, term102627.getClass(), "propListHead", null);
        setIntField(term102627, term102627.getClass(), "sourcePosition", 0);
        setField(term102627, term102627.getClass(), "jsType", null);
        setField(term102627, term102627.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term102616;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term102524, args);
        assertTrue(recursiveEquals(term102524, term102626));
        assertTrue(recursiveEquals(term102616, term102627));
        assertTrue(recursiveEquals(retValue, null));
    }

};


