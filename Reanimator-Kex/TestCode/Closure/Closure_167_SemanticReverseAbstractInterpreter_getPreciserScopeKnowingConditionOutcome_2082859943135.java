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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29900;
     Object term29992;
     Object term30239;
     Object term30240;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29900 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term29992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30176 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29992, term29992.getClass(), "type", 45);
        setIntField(term30084, term30084.getClass(), "type", 45);
        setField(term29992, term29992.getClass(), "first", term30084);
        setField(term29992, term29992.getClass(), "last", term30176);
        term30239 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term30239, term30239.getClass(), "INEQ", null);
        setField(term30239, term30239.getClass(), "convention", null);
        setField(term30239, term30239.getClass(), "typeRegistry", null);
        setField(term30239, term30239.getClass(), "firstLink", null);
        setField(term30239, term30239.getClass(), "nextLink", null);
        setField(term30239, term30239.getClass(), "restrictUndefinedVisitor", null);
        setField(term30239, term30239.getClass(), "restrictNullVisitor", null);
        term30240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term30240, term30240.getClass(), "number", 0.0);
        setIntField(term30240, term30240.getClass(), "type", 45);
        setField(term30240, term30240.getClass(), "next", null);
        setDoubleField(term30241, term30241.getClass(), "number", 0.0);
        setIntField(term30241, term30241.getClass(), "type", 45);
        setField(term30241, term30241.getClass(), "next", null);
        setField(term30241, term30241.getClass(), "first", null);
        setField(term30241, term30241.getClass(), "last", null);
        setField(term30241, term30241.getClass(), "propListHead", null);
        setIntField(term30241, term30241.getClass(), "sourcePosition", 0);
        setField(term30241, term30241.getClass(), "jsType", null);
        setField(term30241, term30241.getClass(), "parent", null);
        setField(term30240, term30240.getClass(), "first", term30241);
        setField(term30242, term30242.getClass(), "str", null);
        setIntField(term30242, term30242.getClass(), "type", 0);
        setField(term30242, term30242.getClass(), "next", null);
        setField(term30242, term30242.getClass(), "first", null);
        setField(term30242, term30242.getClass(), "last", null);
        setField(term30242, term30242.getClass(), "propListHead", null);
        setIntField(term30242, term30242.getClass(), "sourcePosition", 0);
        setField(term30242, term30242.getClass(), "jsType", null);
        setField(term30242, term30242.getClass(), "parent", null);
        setField(term30240, term30240.getClass(), "last", term30242);
        setField(term30240, term30240.getClass(), "propListHead", null);
        setIntField(term30240, term30240.getClass(), "sourcePosition", 0);
        setField(term30240, term30240.getClass(), "jsType", null);
        setField(term30240, term30240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term29992;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term29900, args);
        assertTrue(recursiveEquals(term29900, term30239));
        assertTrue(recursiveEquals(term29992, term30240));
        assertTrue(recursiveEquals(retValue, null));
    }

};


