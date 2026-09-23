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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114757;
     Object term114827;
     Object term116091;
     Object term116092;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114757 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term114827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114827, term114827.getClass(), "type", 45);
        setIntField(term114897, term114897.getClass(), "type", -46);
        setField(term114897, term114897.getClass(), "jsType", null);
        setField(term114827, term114827.getClass(), "first", term114897);
        setField(term114827, term114827.getClass(), "last", term114827);
        setField(term114827, term114827.getClass(), "jsType", null);
        term116091 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term116091, term116091.getClass(), "INEQ", null);
        setField(term116091, term116091.getClass(), "convention", null);
        setField(term116091, term116091.getClass(), "typeRegistry", null);
        setField(term116091, term116091.getClass(), "firstLink", null);
        setField(term116091, term116091.getClass(), "nextLink", null);
        setField(term116091, term116091.getClass(), "restrictUndefinedVisitor", null);
        setField(term116091, term116091.getClass(), "restrictNullVisitor", null);
        term116092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116092, term116092.getClass(), "type", 45);
        setField(term116092, term116092.getClass(), "next", null);
        setIntField(term116093, term116093.getClass(), "type", -46);
        setField(term116093, term116093.getClass(), "next", null);
        setField(term116093, term116093.getClass(), "first", null);
        setField(term116093, term116093.getClass(), "last", null);
        setField(term116093, term116093.getClass(), "propListHead", null);
        setIntField(term116093, term116093.getClass(), "sourcePosition", 0);
        setField(term116093, term116093.getClass(), "jsType", null);
        setField(term116093, term116093.getClass(), "parent", null);
        setField(term116092, term116092.getClass(), "first", term116093);
        setField(term116092, term116092.getClass(), "last", term116092);
        setField(term116092, term116092.getClass(), "propListHead", null);
        setIntField(term116092, term116092.getClass(), "sourcePosition", 0);
        setField(term116092, term116092.getClass(), "jsType", null);
        setField(term116092, term116092.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term114827;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term114757, args);
        assertTrue(recursiveEquals(term114757, term116091));
        assertTrue(recursiveEquals(term114827, term116092));
        assertTrue(recursiveEquals(retValue, null));
    }

};


