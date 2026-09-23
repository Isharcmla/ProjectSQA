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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47696;
     Object term47788;
     Object term48029;
     Object term48030;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47696 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term47788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term47788, term47788.getClass(), "type", 12);
        setIntField(term47880, term47880.getClass(), "type", 12);
        setField(term47788, term47788.getClass(), "first", term47880);
        setIntField(term47972, term47972.getClass(), "type", 12);
        setField(term47788, term47788.getClass(), "last", term47972);
        term48029 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term48029, term48029.getClass(), "INEQ", null);
        setField(term48029, term48029.getClass(), "convention", null);
        setField(term48029, term48029.getClass(), "typeRegistry", null);
        setField(term48029, term48029.getClass(), "firstLink", null);
        setField(term48029, term48029.getClass(), "nextLink", null);
        setField(term48029, term48029.getClass(), "restrictUndefinedVisitor", null);
        setField(term48029, term48029.getClass(), "restrictNullVisitor", null);
        term48030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48030, term48030.getClass(), "str", null);
        setIntField(term48030, term48030.getClass(), "type", 12);
        setField(term48030, term48030.getClass(), "next", null);
        setField(term48031, term48031.getClass(), "str", null);
        setIntField(term48031, term48031.getClass(), "type", 12);
        setField(term48031, term48031.getClass(), "next", null);
        setField(term48031, term48031.getClass(), "first", null);
        setField(term48031, term48031.getClass(), "last", null);
        setField(term48031, term48031.getClass(), "propListHead", null);
        setIntField(term48031, term48031.getClass(), "sourcePosition", 0);
        setField(term48031, term48031.getClass(), "jsType", null);
        setField(term48031, term48031.getClass(), "parent", null);
        setField(term48030, term48030.getClass(), "first", term48031);
        setField(term48032, term48032.getClass(), "str", null);
        setIntField(term48032, term48032.getClass(), "type", 12);
        setField(term48032, term48032.getClass(), "next", null);
        setField(term48032, term48032.getClass(), "first", null);
        setField(term48032, term48032.getClass(), "last", null);
        setField(term48032, term48032.getClass(), "propListHead", null);
        setIntField(term48032, term48032.getClass(), "sourcePosition", 0);
        setField(term48032, term48032.getClass(), "jsType", null);
        setField(term48032, term48032.getClass(), "parent", null);
        setField(term48030, term48030.getClass(), "last", term48032);
        setField(term48030, term48030.getClass(), "propListHead", null);
        setIntField(term48030, term48030.getClass(), "sourcePosition", 0);
        setField(term48030, term48030.getClass(), "jsType", null);
        setField(term48030, term48030.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term47788;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term47696, args);
        assertTrue(recursiveEquals(term47696, term48029));
        assertTrue(recursiveEquals(term47788, term48030));
        assertTrue(recursiveEquals(retValue, null));
    }

};


