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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168780;
     Object term168872;
     Object term169598;
     Object term169599;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168780 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term168872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168964 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169056 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term168872, term168872.getClass(), "type", 12);
        setIntField(term168964, term168964.getClass(), "type", -42384);
        setField(term168872, term168872.getClass(), "first", term168964);
        setIntField(term169056, term169056.getClass(), "type", 12);
        setField(term168872, term168872.getClass(), "last", term169056);
        term169598 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term169598, term169598.getClass(), "INEQ", null);
        setField(term169598, term169598.getClass(), "convention", null);
        setField(term169598, term169598.getClass(), "typeRegistry", null);
        setField(term169598, term169598.getClass(), "firstLink", null);
        setField(term169598, term169598.getClass(), "nextLink", null);
        setField(term169598, term169598.getClass(), "restrictUndefinedVisitor", null);
        setField(term169598, term169598.getClass(), "restrictNullVisitor", null);
        term169599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term169599, term169599.getClass(), "str", null);
        setIntField(term169599, term169599.getClass(), "type", 12);
        setField(term169599, term169599.getClass(), "next", null);
        setField(term169600, term169600.getClass(), "str", null);
        setIntField(term169600, term169600.getClass(), "type", -42384);
        setField(term169600, term169600.getClass(), "next", null);
        setField(term169600, term169600.getClass(), "first", null);
        setField(term169600, term169600.getClass(), "last", null);
        setField(term169600, term169600.getClass(), "propListHead", null);
        setIntField(term169600, term169600.getClass(), "sourcePosition", 0);
        setField(term169600, term169600.getClass(), "jsType", null);
        setField(term169600, term169600.getClass(), "parent", null);
        setField(term169599, term169599.getClass(), "first", term169600);
        setField(term169601, term169601.getClass(), "str", null);
        setIntField(term169601, term169601.getClass(), "type", 12);
        setField(term169601, term169601.getClass(), "next", null);
        setField(term169601, term169601.getClass(), "first", null);
        setField(term169601, term169601.getClass(), "last", null);
        setField(term169601, term169601.getClass(), "propListHead", null);
        setIntField(term169601, term169601.getClass(), "sourcePosition", 0);
        setField(term169601, term169601.getClass(), "jsType", null);
        setField(term169601, term169601.getClass(), "parent", null);
        setField(term169599, term169599.getClass(), "last", term169601);
        setField(term169599, term169599.getClass(), "propListHead", null);
        setIntField(term169599, term169599.getClass(), "sourcePosition", 0);
        setField(term169599, term169599.getClass(), "jsType", null);
        setField(term169599, term169599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term168872;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term168780, args);
        assertTrue(recursiveEquals(term168780, term169598));
        assertTrue(recursiveEquals(term168872, term169599));
        assertTrue(recursiveEquals(retValue, null));
    }

};


