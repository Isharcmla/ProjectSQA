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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109521;
     Object term109613;
     Object term109623;
     Object term109624;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109521 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term109613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109613, term109613.getClass(), "type", 16);
        term109623 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term109623, term109623.getClass(), "INEQ", null);
        setField(term109623, term109623.getClass(), "convention", null);
        setField(term109623, term109623.getClass(), "typeRegistry", null);
        setField(term109623, term109623.getClass(), "firstLink", null);
        setField(term109623, term109623.getClass(), "nextLink", null);
        setField(term109623, term109623.getClass(), "restrictUndefinedVisitor", null);
        setField(term109623, term109623.getClass(), "restrictNullVisitor", null);
        term109624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term109624, term109624.getClass(), "number", 0.0);
        setIntField(term109624, term109624.getClass(), "type", 16);
        setField(term109624, term109624.getClass(), "next", null);
        setField(term109624, term109624.getClass(), "first", null);
        setField(term109624, term109624.getClass(), "last", null);
        setField(term109624, term109624.getClass(), "propListHead", null);
        setIntField(term109624, term109624.getClass(), "sourcePosition", 0);
        setField(term109624, term109624.getClass(), "jsType", null);
        setField(term109624, term109624.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term109613;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term109521, args);
        assertTrue(recursiveEquals(term109521, term109623));
        assertTrue(recursiveEquals(term109613, term109624));
        assertTrue(recursiveEquals(retValue, null));
    }

};


