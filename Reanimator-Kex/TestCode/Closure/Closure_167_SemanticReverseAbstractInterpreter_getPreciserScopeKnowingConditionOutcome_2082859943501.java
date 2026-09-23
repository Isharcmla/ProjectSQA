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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135675;
     Object term135767;
     Object term136140;
     Object term136141;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135675 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term135767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term135859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term136049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term135767, term135767.getClass(), "type", 13);
        setIntField(term135859, term135859.getClass(), "type", 0);
        setField(term135859, term135859.getClass(), "jsType", term135957);
        setField(term135767, term135767.getClass(), "first", term135859);
        setIntField(term136049, term136049.getClass(), "type", 13);
        setField(term136049, term136049.getClass(), "jsType", null);
        setField(term135767, term135767.getClass(), "last", term136049);
        term136140 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term136140, term136140.getClass(), "INEQ", null);
        setField(term136140, term136140.getClass(), "convention", null);
        setField(term136140, term136140.getClass(), "typeRegistry", null);
        setField(term136140, term136140.getClass(), "firstLink", null);
        setField(term136140, term136140.getClass(), "nextLink", null);
        setField(term136140, term136140.getClass(), "restrictUndefinedVisitor", null);
        setField(term136140, term136140.getClass(), "restrictNullVisitor", null);
        term136141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term136142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term136143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term136144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term136141, term136141.getClass(), "number", 0.0);
        setIntField(term136141, term136141.getClass(), "type", 13);
        setField(term136141, term136141.getClass(), "next", null);
        setField(term136142, term136142.getClass(), "str", null);
        setIntField(term136142, term136142.getClass(), "type", 0);
        setField(term136142, term136142.getClass(), "next", null);
        setField(term136142, term136142.getClass(), "first", null);
        setField(term136142, term136142.getClass(), "last", null);
        setField(term136142, term136142.getClass(), "propListHead", null);
        setIntField(term136142, term136142.getClass(), "sourcePosition", 0);
        setBooleanField(term136143, term136143.getClass(), "resolved", false);
        setField(term136143, term136143.getClass(), "resolveResult", null);
        setBooleanField(term136143, term136143.getClass(), "inTemplatedCheckVisit", false);
        setField(term136143, term136143.getClass(), "registry", null);
        setField(term136142, term136142.getClass(), "jsType", term136143);
        setField(term136142, term136142.getClass(), "parent", null);
        setField(term136141, term136141.getClass(), "first", term136142);
        setDoubleField(term136144, term136144.getClass(), "number", 0.0);
        setIntField(term136144, term136144.getClass(), "type", 13);
        setField(term136144, term136144.getClass(), "next", null);
        setField(term136144, term136144.getClass(), "first", null);
        setField(term136144, term136144.getClass(), "last", null);
        setField(term136144, term136144.getClass(), "propListHead", null);
        setIntField(term136144, term136144.getClass(), "sourcePosition", 0);
        setField(term136144, term136144.getClass(), "jsType", null);
        setField(term136144, term136144.getClass(), "parent", null);
        setField(term136141, term136141.getClass(), "last", term136144);
        setField(term136141, term136141.getClass(), "propListHead", null);
        setIntField(term136141, term136141.getClass(), "sourcePosition", 0);
        setField(term136141, term136141.getClass(), "jsType", null);
        setField(term136141, term136141.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term135767;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term135675, args);
        assertTrue(recursiveEquals(term135675, term136140));
        assertTrue(recursiveEquals(term135767, term136141));
        assertTrue(recursiveEquals(retValue, null));
    }

};


