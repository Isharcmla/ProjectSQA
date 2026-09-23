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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56555;
     Object term56647;
     Object term56899;
     Object term56900;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56555 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term56647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term56647, term56647.getClass(), "type", 12);
        setIntField(term56739, term56739.getClass(), "type", 12);
        setField(term56647, term56647.getClass(), "first", term56739);
        setIntField(term56831, term56831.getClass(), "type", 12);
        setField(term56647, term56647.getClass(), "last", term56831);
        term56899 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term56899, term56899.getClass(), "INEQ", null);
        setField(term56899, term56899.getClass(), "convention", null);
        setField(term56899, term56899.getClass(), "typeRegistry", null);
        setField(term56899, term56899.getClass(), "firstLink", null);
        setField(term56899, term56899.getClass(), "nextLink", null);
        setField(term56899, term56899.getClass(), "restrictUndefinedVisitor", null);
        setField(term56899, term56899.getClass(), "restrictNullVisitor", null);
        term56900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term56902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term56900, term56900.getClass(), "number", 0.0);
        setIntField(term56900, term56900.getClass(), "type", 12);
        setField(term56900, term56900.getClass(), "next", null);
        setDoubleField(term56901, term56901.getClass(), "number", 0.0);
        setIntField(term56901, term56901.getClass(), "type", 12);
        setField(term56901, term56901.getClass(), "next", null);
        setField(term56901, term56901.getClass(), "first", null);
        setField(term56901, term56901.getClass(), "last", null);
        setField(term56901, term56901.getClass(), "propListHead", null);
        setIntField(term56901, term56901.getClass(), "sourcePosition", 0);
        setField(term56901, term56901.getClass(), "jsType", null);
        setField(term56901, term56901.getClass(), "parent", null);
        setField(term56900, term56900.getClass(), "first", term56901);
        setDoubleField(term56902, term56902.getClass(), "number", 0.0);
        setIntField(term56902, term56902.getClass(), "type", 12);
        setField(term56902, term56902.getClass(), "next", null);
        setField(term56902, term56902.getClass(), "first", null);
        setField(term56902, term56902.getClass(), "last", null);
        setField(term56902, term56902.getClass(), "propListHead", null);
        setIntField(term56902, term56902.getClass(), "sourcePosition", 0);
        setField(term56902, term56902.getClass(), "jsType", null);
        setField(term56902, term56902.getClass(), "parent", null);
        setField(term56900, term56900.getClass(), "last", term56902);
        setField(term56900, term56900.getClass(), "propListHead", null);
        setIntField(term56900, term56900.getClass(), "sourcePosition", 0);
        setField(term56900, term56900.getClass(), "jsType", null);
        setField(term56900, term56900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term56647;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term56555, args);
        assertTrue(recursiveEquals(term56555, term56899));
        assertTrue(recursiveEquals(term56647, term56900));
        assertTrue(recursiveEquals(retValue, null));
    }

};


