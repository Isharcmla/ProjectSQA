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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95005;
     Object term95097;
     Object term95747;
     Object term95748;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95005 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term95097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term95097, term95097.getClass(), "type", 111);
        setIntField(term95281, term95281.getClass(), "type", 111);
        setField(term95189, term95189.getClass(), "first", term95281);
        setField(term95097, term95097.getClass(), "parent", term95189);
        setIntField(term95373, term95373.getClass(), "type", 0);
        setField(term95097, term95097.getClass(), "first", term95373);
        term95747 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term95747, term95747.getClass(), "INEQ", null);
        setField(term95747, term95747.getClass(), "convention", null);
        setField(term95747, term95747.getClass(), "typeRegistry", null);
        setField(term95747, term95747.getClass(), "firstLink", null);
        setField(term95747, term95747.getClass(), "nextLink", null);
        setField(term95747, term95747.getClass(), "restrictUndefinedVisitor", null);
        setField(term95747, term95747.getClass(), "restrictNullVisitor", null);
        term95748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term95751 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term95748, term95748.getClass(), "str", null);
        setIntField(term95748, term95748.getClass(), "type", 111);
        setField(term95748, term95748.getClass(), "next", null);
        setDoubleField(term95749, term95749.getClass(), "number", 0.0);
        setIntField(term95749, term95749.getClass(), "type", 0);
        setField(term95749, term95749.getClass(), "next", null);
        setField(term95749, term95749.getClass(), "first", null);
        setField(term95749, term95749.getClass(), "last", null);
        setField(term95749, term95749.getClass(), "propListHead", null);
        setIntField(term95749, term95749.getClass(), "sourcePosition", 0);
        setField(term95749, term95749.getClass(), "jsType", null);
        setField(term95749, term95749.getClass(), "parent", null);
        setField(term95748, term95748.getClass(), "first", term95749);
        setField(term95748, term95748.getClass(), "last", null);
        setField(term95748, term95748.getClass(), "propListHead", null);
        setIntField(term95748, term95748.getClass(), "sourcePosition", 0);
        setField(term95748, term95748.getClass(), "jsType", null);
        setField(term95750, term95750.getClass(), "str", null);
        setIntField(term95750, term95750.getClass(), "type", 0);
        setField(term95750, term95750.getClass(), "next", null);
        setField(term95751, term95751.getClass(), "str", null);
        setIntField(term95751, term95751.getClass(), "type", 111);
        setField(term95751, term95751.getClass(), "next", null);
        setField(term95751, term95751.getClass(), "first", null);
        setField(term95751, term95751.getClass(), "last", null);
        setField(term95751, term95751.getClass(), "propListHead", null);
        setIntField(term95751, term95751.getClass(), "sourcePosition", 0);
        setField(term95751, term95751.getClass(), "jsType", null);
        setField(term95751, term95751.getClass(), "parent", null);
        setField(term95750, term95750.getClass(), "first", term95751);
        setField(term95750, term95750.getClass(), "last", null);
        setField(term95750, term95750.getClass(), "propListHead", null);
        setIntField(term95750, term95750.getClass(), "sourcePosition", 0);
        setField(term95750, term95750.getClass(), "jsType", null);
        setField(term95750, term95750.getClass(), "parent", null);
        setField(term95748, term95748.getClass(), "parent", term95750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term95097;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term95005, args);
        assertTrue(recursiveEquals(term95005, term95747));
        assertTrue(recursiveEquals(term95097, term95748));
        assertTrue(recursiveEquals(retValue, null));
    }

};


