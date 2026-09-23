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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130358;
     Object term130450;
     Object term130903;
     Object term130904;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130358 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term130450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term130450, term130450.getClass(), "type", 16);
        term130903 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term130903, term130903.getClass(), "INEQ", null);
        setField(term130903, term130903.getClass(), "convention", null);
        setField(term130903, term130903.getClass(), "typeRegistry", null);
        setField(term130903, term130903.getClass(), "firstLink", null);
        setField(term130903, term130903.getClass(), "nextLink", null);
        setField(term130903, term130903.getClass(), "restrictUndefinedVisitor", null);
        setField(term130903, term130903.getClass(), "restrictNullVisitor", null);
        term130904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term130904, term130904.getClass(), "str", null);
        setIntField(term130904, term130904.getClass(), "type", 16);
        setField(term130904, term130904.getClass(), "next", null);
        setField(term130904, term130904.getClass(), "first", null);
        setField(term130904, term130904.getClass(), "last", null);
        setField(term130904, term130904.getClass(), "propListHead", null);
        setIntField(term130904, term130904.getClass(), "sourcePosition", 0);
        setField(term130904, term130904.getClass(), "jsType", null);
        setField(term130904, term130904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term130450;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term130358, args);
        assertTrue(recursiveEquals(term130358, term130903));
        assertTrue(recursiveEquals(term130450, term130904));
        assertTrue(recursiveEquals(retValue, null));
    }

};


