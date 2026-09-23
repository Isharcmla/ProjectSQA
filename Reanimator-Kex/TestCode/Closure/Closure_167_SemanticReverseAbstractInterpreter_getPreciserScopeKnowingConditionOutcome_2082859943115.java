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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24818;
     Object term24910;
     Object term25078;
     Object term25079;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24818 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term24910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24910, term24910.getClass(), "type", 12);
        setField(term24910, term24910.getClass(), "first", term24910);
        setField(term24910, term24910.getClass(), "last", term25002);
        term25078 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term25078, term25078.getClass(), "INEQ", null);
        setField(term25078, term25078.getClass(), "convention", null);
        setField(term25078, term25078.getClass(), "typeRegistry", null);
        setField(term25078, term25078.getClass(), "firstLink", null);
        setField(term25078, term25078.getClass(), "nextLink", null);
        setField(term25078, term25078.getClass(), "restrictUndefinedVisitor", null);
        setField(term25078, term25078.getClass(), "restrictNullVisitor", null);
        term25079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term25080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term25079, term25079.getClass(), "number", 0.0);
        setIntField(term25079, term25079.getClass(), "type", 12);
        setField(term25079, term25079.getClass(), "next", null);
        setField(term25079, term25079.getClass(), "first", term25079);
        setDoubleField(term25080, term25080.getClass(), "number", 0.0);
        setIntField(term25080, term25080.getClass(), "type", 0);
        setField(term25080, term25080.getClass(), "next", null);
        setField(term25080, term25080.getClass(), "first", null);
        setField(term25080, term25080.getClass(), "last", null);
        setField(term25080, term25080.getClass(), "propListHead", null);
        setIntField(term25080, term25080.getClass(), "sourcePosition", 0);
        setField(term25080, term25080.getClass(), "jsType", null);
        setField(term25080, term25080.getClass(), "parent", null);
        setField(term25079, term25079.getClass(), "last", term25080);
        setField(term25079, term25079.getClass(), "propListHead", null);
        setIntField(term25079, term25079.getClass(), "sourcePosition", 0);
        setField(term25079, term25079.getClass(), "jsType", null);
        setField(term25079, term25079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term24910;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term24818, args);
        assertTrue(recursiveEquals(term24818, term25078));
        assertTrue(recursiveEquals(term24910, term25079));
        assertTrue(recursiveEquals(retValue, null));
    }

};


