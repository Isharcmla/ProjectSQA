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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52525;
     Object term52617;
     Object term52889;
     Object term52890;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52525 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term52617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term52617, term52617.getClass(), "type", 111);
        setIntField(term52801, term52801.getClass(), "type", 111);
        setField(term52709, term52709.getClass(), "first", term52801);
        setField(term52617, term52617.getClass(), "parent", term52709);
        setField(term52617, term52617.getClass(), "first", term52801);
        term52889 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term52889, term52889.getClass(), "INEQ", null);
        setField(term52889, term52889.getClass(), "convention", null);
        setField(term52889, term52889.getClass(), "typeRegistry", null);
        setField(term52889, term52889.getClass(), "firstLink", null);
        setField(term52889, term52889.getClass(), "nextLink", null);
        setField(term52889, term52889.getClass(), "restrictUndefinedVisitor", null);
        setField(term52889, term52889.getClass(), "restrictNullVisitor", null);
        term52890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term52890, term52890.getClass(), "number", 0.0);
        setIntField(term52890, term52890.getClass(), "type", 111);
        setField(term52890, term52890.getClass(), "next", null);
        setDoubleField(term52891, term52891.getClass(), "number", 0.0);
        setIntField(term52891, term52891.getClass(), "type", 111);
        setField(term52891, term52891.getClass(), "next", null);
        setField(term52891, term52891.getClass(), "first", null);
        setField(term52891, term52891.getClass(), "last", null);
        setField(term52891, term52891.getClass(), "propListHead", null);
        setIntField(term52891, term52891.getClass(), "sourcePosition", 0);
        setField(term52891, term52891.getClass(), "jsType", null);
        setField(term52891, term52891.getClass(), "parent", null);
        setField(term52890, term52890.getClass(), "first", term52891);
        setField(term52890, term52890.getClass(), "last", null);
        setField(term52890, term52890.getClass(), "propListHead", null);
        setIntField(term52890, term52890.getClass(), "sourcePosition", 0);
        setField(term52890, term52890.getClass(), "jsType", null);
        setDoubleField(term52892, term52892.getClass(), "number", 0.0);
        setIntField(term52892, term52892.getClass(), "type", 0);
        setField(term52892, term52892.getClass(), "next", null);
        setField(term52892, term52892.getClass(), "first", term52891);
        setField(term52892, term52892.getClass(), "last", null);
        setField(term52892, term52892.getClass(), "propListHead", null);
        setIntField(term52892, term52892.getClass(), "sourcePosition", 0);
        setField(term52892, term52892.getClass(), "jsType", null);
        setField(term52892, term52892.getClass(), "parent", null);
        setField(term52890, term52890.getClass(), "parent", term52892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term52617;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term52525, args);
        assertTrue(recursiveEquals(term52525, term52889));
        assertTrue(recursiveEquals(term52617, term52890));
        assertTrue(recursiveEquals(retValue, null));
    }

};


