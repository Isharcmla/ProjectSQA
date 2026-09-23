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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74430;
     Object term74522;
     Object term75117;
     Object term75118;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74430 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term74522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74522, term74522.getClass(), "type", 51);
        setField(term74522, term74522.getClass(), "first", term74614);
        term75117 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term75117, term75117.getClass(), "INEQ", null);
        setField(term75117, term75117.getClass(), "convention", null);
        setField(term75117, term75117.getClass(), "typeRegistry", null);
        setField(term75117, term75117.getClass(), "firstLink", null);
        setField(term75117, term75117.getClass(), "nextLink", null);
        setField(term75117, term75117.getClass(), "restrictUndefinedVisitor", null);
        setField(term75117, term75117.getClass(), "restrictNullVisitor", null);
        term75118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term75118, term75118.getClass(), "number", 0.0);
        setIntField(term75118, term75118.getClass(), "type", 51);
        setField(term75118, term75118.getClass(), "next", null);
        setDoubleField(term75119, term75119.getClass(), "number", 0.0);
        setIntField(term75119, term75119.getClass(), "type", 0);
        setField(term75119, term75119.getClass(), "next", null);
        setField(term75119, term75119.getClass(), "first", null);
        setField(term75119, term75119.getClass(), "last", null);
        setField(term75119, term75119.getClass(), "propListHead", null);
        setIntField(term75119, term75119.getClass(), "sourcePosition", 0);
        setField(term75119, term75119.getClass(), "jsType", null);
        setField(term75119, term75119.getClass(), "parent", null);
        setField(term75118, term75118.getClass(), "first", term75119);
        setField(term75118, term75118.getClass(), "last", null);
        setField(term75118, term75118.getClass(), "propListHead", null);
        setIntField(term75118, term75118.getClass(), "sourcePosition", 0);
        setField(term75118, term75118.getClass(), "jsType", null);
        setField(term75118, term75118.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term74522;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term74430, args);
        assertTrue(recursiveEquals(term74430, term75117));
        assertTrue(recursiveEquals(term74522, term75118));
        assertTrue(recursiveEquals(retValue, null));
    }

};


