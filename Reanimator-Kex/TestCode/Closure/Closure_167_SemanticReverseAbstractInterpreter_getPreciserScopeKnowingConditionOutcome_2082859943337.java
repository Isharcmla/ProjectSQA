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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87190;
     Object term87260;
     Object term87269;
     Object term87270;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87190 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term87260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87260, term87260.getClass(), "type", 16);
        term87269 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term87269, term87269.getClass(), "INEQ", null);
        setField(term87269, term87269.getClass(), "convention", null);
        setField(term87269, term87269.getClass(), "typeRegistry", null);
        setField(term87269, term87269.getClass(), "firstLink", null);
        setField(term87269, term87269.getClass(), "nextLink", null);
        setField(term87269, term87269.getClass(), "restrictUndefinedVisitor", null);
        setField(term87269, term87269.getClass(), "restrictNullVisitor", null);
        term87270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87270, term87270.getClass(), "type", 16);
        setField(term87270, term87270.getClass(), "next", null);
        setField(term87270, term87270.getClass(), "first", null);
        setField(term87270, term87270.getClass(), "last", null);
        setField(term87270, term87270.getClass(), "propListHead", null);
        setIntField(term87270, term87270.getClass(), "sourcePosition", 0);
        setField(term87270, term87270.getClass(), "jsType", null);
        setField(term87270, term87270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term87260;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term87190, args);
        assertTrue(recursiveEquals(term87190, term87269));
        assertTrue(recursiveEquals(term87260, term87270));
        assertTrue(recursiveEquals(retValue, null));
    }

};


