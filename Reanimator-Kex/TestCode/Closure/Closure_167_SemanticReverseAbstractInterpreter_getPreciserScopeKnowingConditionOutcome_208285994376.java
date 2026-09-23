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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14730;
     Object term14800;
     Object term15796;
     Object term15797;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14730 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term14800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14800, term14800.getClass(), "type", 46);
        setField(term14800, term14800.getClass(), "first", term14800);
        setField(term14800, term14800.getClass(), "last", term14870);
        term15796 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term15796, term15796.getClass(), "INEQ", null);
        setField(term15796, term15796.getClass(), "convention", null);
        setField(term15796, term15796.getClass(), "typeRegistry", null);
        setField(term15796, term15796.getClass(), "firstLink", null);
        setField(term15796, term15796.getClass(), "nextLink", null);
        setField(term15796, term15796.getClass(), "restrictUndefinedVisitor", null);
        setField(term15796, term15796.getClass(), "restrictNullVisitor", null);
        term15797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15797, term15797.getClass(), "type", 46);
        setField(term15797, term15797.getClass(), "next", null);
        setField(term15797, term15797.getClass(), "first", term15797);
        setIntField(term15798, term15798.getClass(), "type", 0);
        setField(term15798, term15798.getClass(), "next", null);
        setField(term15798, term15798.getClass(), "first", null);
        setField(term15798, term15798.getClass(), "last", null);
        setField(term15798, term15798.getClass(), "propListHead", null);
        setIntField(term15798, term15798.getClass(), "sourcePosition", 0);
        setField(term15798, term15798.getClass(), "jsType", null);
        setField(term15798, term15798.getClass(), "parent", null);
        setField(term15797, term15797.getClass(), "last", term15798);
        setField(term15797, term15797.getClass(), "propListHead", null);
        setIntField(term15797, term15797.getClass(), "sourcePosition", 0);
        setField(term15797, term15797.getClass(), "jsType", null);
        setField(term15797, term15797.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term14800;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term14730, args);
        assertTrue(recursiveEquals(term14730, term15796));
        assertTrue(recursiveEquals(term14800, term15797));
        assertTrue(recursiveEquals(retValue, null));
    }

};


