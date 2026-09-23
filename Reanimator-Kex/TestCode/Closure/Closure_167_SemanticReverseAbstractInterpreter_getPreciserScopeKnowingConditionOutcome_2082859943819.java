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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250566;
     Object term250658;
     Object term251186;
     Object term251187;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250566 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term250658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term250936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term250658, term250658.getClass(), "type", 46);
        setIntField(term250750, term250750.getClass(), "type", 1);
        setField(term250750, term250750.getClass(), "jsType", term250844);
        setField(term250658, term250658.getClass(), "first", term250750);
        setIntField(term250936, term250936.getClass(), "type", 46);
        setField(term250936, term250936.getClass(), "jsType", term251028);
        setField(term250658, term250658.getClass(), "last", term250936);
        term251186 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term251186, term251186.getClass(), "INEQ", null);
        setField(term251186, term251186.getClass(), "convention", null);
        setField(term251186, term251186.getClass(), "typeRegistry", null);
        setField(term251186, term251186.getClass(), "firstLink", null);
        setField(term251186, term251186.getClass(), "nextLink", null);
        setField(term251186, term251186.getClass(), "restrictUndefinedVisitor", null);
        setField(term251186, term251186.getClass(), "restrictNullVisitor", null);
        term251187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term251190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term251187, term251187.getClass(), "str", null);
        setIntField(term251187, term251187.getClass(), "type", 46);
        setField(term251187, term251187.getClass(), "next", null);
        setField(term251188, term251188.getClass(), "str", null);
        setIntField(term251188, term251188.getClass(), "type", 1);
        setField(term251188, term251188.getClass(), "next", null);
        setField(term251188, term251188.getClass(), "first", null);
        setField(term251188, term251188.getClass(), "last", null);
        setField(term251188, term251188.getClass(), "propListHead", null);
        setIntField(term251188, term251188.getClass(), "sourcePosition", 0);
        setField(term251189, term251189.getClass(), "parameters", null);
        setField(term251189, term251189.getClass(), "returnType", null);
        setBooleanField(term251189, term251189.getClass(), "returnTypeInferred", false);
        setBooleanField(term251189, term251189.getClass(), "resolved", false);
        setField(term251189, term251189.getClass(), "resolveResult", null);
        setBooleanField(term251189, term251189.getClass(), "inTemplatedCheckVisit", false);
        setField(term251189, term251189.getClass(), "registry", null);
        setField(term251188, term251188.getClass(), "jsType", term251189);
        setField(term251188, term251188.getClass(), "parent", null);
        setField(term251187, term251187.getClass(), "first", term251188);
        setField(term251190, term251190.getClass(), "str", null);
        setIntField(term251190, term251190.getClass(), "type", 46);
        setField(term251190, term251190.getClass(), "next", null);
        setField(term251190, term251190.getClass(), "first", null);
        setField(term251190, term251190.getClass(), "last", null);
        setField(term251190, term251190.getClass(), "propListHead", null);
        setIntField(term251190, term251190.getClass(), "sourcePosition", 0);
        setBooleanField(term251191, term251191.getClass(), "resolved", false);
        setField(term251191, term251191.getClass(), "resolveResult", null);
        setBooleanField(term251191, term251191.getClass(), "inTemplatedCheckVisit", false);
        setField(term251191, term251191.getClass(), "registry", null);
        setField(term251190, term251190.getClass(), "jsType", term251191);
        setField(term251190, term251190.getClass(), "parent", null);
        setField(term251187, term251187.getClass(), "last", term251190);
        setField(term251187, term251187.getClass(), "propListHead", null);
        setIntField(term251187, term251187.getClass(), "sourcePosition", 0);
        setField(term251187, term251187.getClass(), "jsType", null);
        setField(term251187, term251187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term250658;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term250566, args);
        assertTrue(recursiveEquals(term250566, term251186));
        assertTrue(recursiveEquals(term250658, term251187));
        assertTrue(recursiveEquals(retValue, null));
    }

};


