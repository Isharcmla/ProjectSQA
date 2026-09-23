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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8309;
     Object term8379;
     Object term9056;
     Object term9057;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8309 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term8379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8379, term8379.getClass(), "type", 15);
        term9056 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term9056, term9056.getClass(), "INEQ", null);
        setField(term9056, term9056.getClass(), "convention", null);
        setField(term9056, term9056.getClass(), "typeRegistry", null);
        setField(term9056, term9056.getClass(), "firstLink", null);
        setField(term9056, term9056.getClass(), "nextLink", null);
        setField(term9056, term9056.getClass(), "restrictUndefinedVisitor", null);
        setField(term9056, term9056.getClass(), "restrictNullVisitor", null);
        term9057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9057, term9057.getClass(), "type", 15);
        setField(term9057, term9057.getClass(), "next", null);
        setField(term9057, term9057.getClass(), "first", null);
        setField(term9057, term9057.getClass(), "last", null);
        setField(term9057, term9057.getClass(), "propListHead", null);
        setIntField(term9057, term9057.getClass(), "sourcePosition", 0);
        setField(term9057, term9057.getClass(), "jsType", null);
        setField(term9057, term9057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term8379;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term8309, args);
        assertTrue(recursiveEquals(term8309, term9056));
        assertTrue(recursiveEquals(term8379, term9057));
        assertTrue(recursiveEquals(retValue, null));
    }

};


