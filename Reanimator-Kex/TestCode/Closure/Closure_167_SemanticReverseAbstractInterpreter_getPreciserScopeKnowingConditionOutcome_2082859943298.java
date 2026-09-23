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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75390;
     Object term75482;
     Object term76159;
     Object term76160;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75390 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term75482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term75482, term75482.getClass(), "type", 46);
        setField(term75482, term75482.getClass(), "first", term75574);
        setField(term75482, term75482.getClass(), "last", term75666);
        term76159 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term76159, term76159.getClass(), "INEQ", null);
        setField(term76159, term76159.getClass(), "convention", null);
        setField(term76159, term76159.getClass(), "typeRegistry", null);
        setField(term76159, term76159.getClass(), "firstLink", null);
        setField(term76159, term76159.getClass(), "nextLink", null);
        setField(term76159, term76159.getClass(), "restrictUndefinedVisitor", null);
        setField(term76159, term76159.getClass(), "restrictNullVisitor", null);
        term76160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76162 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term76160, term76160.getClass(), "number", 0.0);
        setIntField(term76160, term76160.getClass(), "type", 46);
        setField(term76160, term76160.getClass(), "next", null);
        setDoubleField(term76161, term76161.getClass(), "number", 0.0);
        setIntField(term76161, term76161.getClass(), "type", 0);
        setField(term76161, term76161.getClass(), "next", null);
        setField(term76161, term76161.getClass(), "first", null);
        setField(term76161, term76161.getClass(), "last", null);
        setField(term76161, term76161.getClass(), "propListHead", null);
        setIntField(term76161, term76161.getClass(), "sourcePosition", 0);
        setField(term76161, term76161.getClass(), "jsType", null);
        setField(term76161, term76161.getClass(), "parent", null);
        setField(term76160, term76160.getClass(), "first", term76161);
        setDoubleField(term76162, term76162.getClass(), "number", 0.0);
        setIntField(term76162, term76162.getClass(), "type", 0);
        setField(term76162, term76162.getClass(), "next", null);
        setField(term76162, term76162.getClass(), "first", null);
        setField(term76162, term76162.getClass(), "last", null);
        setField(term76162, term76162.getClass(), "propListHead", null);
        setIntField(term76162, term76162.getClass(), "sourcePosition", 0);
        setField(term76162, term76162.getClass(), "jsType", null);
        setField(term76162, term76162.getClass(), "parent", null);
        setField(term76160, term76160.getClass(), "last", term76162);
        setField(term76160, term76160.getClass(), "propListHead", null);
        setIntField(term76160, term76160.getClass(), "sourcePosition", 0);
        setField(term76160, term76160.getClass(), "jsType", null);
        setField(term76160, term76160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term75482;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term75390, args);
        assertTrue(recursiveEquals(term75390, term76159));
        assertTrue(recursiveEquals(term75482, term76160));
        assertTrue(recursiveEquals(retValue, null));
    }

};


