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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10911;
     Object term10981;
     Object term11855;
     Object term11856;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10911 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term10981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10981, term10981.getClass(), "type", 45);
        setField(term10981, term10981.getClass(), "first", term10981);
        setField(term10981, term10981.getClass(), "last", term11051);
        term11855 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term11855, term11855.getClass(), "INEQ", null);
        setField(term11855, term11855.getClass(), "convention", null);
        setField(term11855, term11855.getClass(), "typeRegistry", null);
        setField(term11855, term11855.getClass(), "firstLink", null);
        setField(term11855, term11855.getClass(), "nextLink", null);
        setField(term11855, term11855.getClass(), "restrictUndefinedVisitor", null);
        setField(term11855, term11855.getClass(), "restrictNullVisitor", null);
        term11856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11856, term11856.getClass(), "type", 45);
        setField(term11856, term11856.getClass(), "next", null);
        setField(term11856, term11856.getClass(), "first", term11856);
        setIntField(term11857, term11857.getClass(), "type", 0);
        setField(term11857, term11857.getClass(), "next", null);
        setField(term11857, term11857.getClass(), "first", null);
        setField(term11857, term11857.getClass(), "last", null);
        setField(term11857, term11857.getClass(), "propListHead", null);
        setIntField(term11857, term11857.getClass(), "sourcePosition", 0);
        setField(term11857, term11857.getClass(), "jsType", null);
        setField(term11857, term11857.getClass(), "parent", null);
        setField(term11856, term11856.getClass(), "last", term11857);
        setField(term11856, term11856.getClass(), "propListHead", null);
        setIntField(term11856, term11856.getClass(), "sourcePosition", 0);
        setField(term11856, term11856.getClass(), "jsType", null);
        setField(term11856, term11856.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term10981;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term10911, args);
        assertTrue(recursiveEquals(term10911, term11855));
        assertTrue(recursiveEquals(term10981, term11856));
        assertTrue(recursiveEquals(retValue, null));
    }

};


