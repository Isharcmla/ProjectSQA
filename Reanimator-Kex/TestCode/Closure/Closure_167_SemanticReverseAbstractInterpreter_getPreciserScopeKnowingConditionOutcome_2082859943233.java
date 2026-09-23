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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56032;
     Object term56124;
     Object term56375;
     Object term56376;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56032 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term56124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term56216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56124, term56124.getClass(), "type", 46);
        setIntField(term56216, term56216.getClass(), "type", 0);
        setField(term56124, term56124.getClass(), "first", term56216);
        setField(term56124, term56124.getClass(), "last", term56308);
        term56375 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term56375, term56375.getClass(), "INEQ", null);
        setField(term56375, term56375.getClass(), "convention", null);
        setField(term56375, term56375.getClass(), "typeRegistry", null);
        setField(term56375, term56375.getClass(), "firstLink", null);
        setField(term56375, term56375.getClass(), "nextLink", null);
        setField(term56375, term56375.getClass(), "restrictUndefinedVisitor", null);
        setField(term56375, term56375.getClass(), "restrictNullVisitor", null);
        term56376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term56377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term56376, term56376.getClass(), "str", null);
        setIntField(term56376, term56376.getClass(), "type", 46);
        setField(term56376, term56376.getClass(), "next", null);
        setDoubleField(term56377, term56377.getClass(), "number", 0.0);
        setIntField(term56377, term56377.getClass(), "type", 0);
        setField(term56377, term56377.getClass(), "next", null);
        setField(term56377, term56377.getClass(), "first", null);
        setField(term56377, term56377.getClass(), "last", null);
        setField(term56377, term56377.getClass(), "propListHead", null);
        setIntField(term56377, term56377.getClass(), "sourcePosition", 0);
        setField(term56377, term56377.getClass(), "jsType", null);
        setField(term56377, term56377.getClass(), "parent", null);
        setField(term56376, term56376.getClass(), "first", term56377);
        setDoubleField(term56378, term56378.getClass(), "number", 0.0);
        setIntField(term56378, term56378.getClass(), "type", 0);
        setField(term56378, term56378.getClass(), "next", null);
        setField(term56378, term56378.getClass(), "first", null);
        setField(term56378, term56378.getClass(), "last", null);
        setField(term56378, term56378.getClass(), "propListHead", null);
        setIntField(term56378, term56378.getClass(), "sourcePosition", 0);
        setField(term56378, term56378.getClass(), "jsType", null);
        setField(term56378, term56378.getClass(), "parent", null);
        setField(term56376, term56376.getClass(), "last", term56378);
        setField(term56376, term56376.getClass(), "propListHead", null);
        setIntField(term56376, term56376.getClass(), "sourcePosition", 0);
        setField(term56376, term56376.getClass(), "jsType", null);
        setField(term56376, term56376.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term56124;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term56032, args);
        assertTrue(recursiveEquals(term56032, term56375));
        assertTrue(recursiveEquals(term56124, term56376));
        assertTrue(recursiveEquals(retValue, null));
    }

};


