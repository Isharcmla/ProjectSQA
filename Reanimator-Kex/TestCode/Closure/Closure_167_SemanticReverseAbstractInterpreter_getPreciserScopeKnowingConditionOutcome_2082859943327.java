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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84511;
     Object term84603;
     Object term84849;
     Object term84850;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84511 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term84603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term84603, term84603.getClass(), "type", 46);
        setIntField(term84695, term84695.getClass(), "type", -47);
        setField(term84603, term84603.getClass(), "first", term84695);
        setIntField(term84787, term84787.getClass(), "type", 46);
        setField(term84603, term84603.getClass(), "last", term84787);
        term84849 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term84849, term84849.getClass(), "INEQ", null);
        setField(term84849, term84849.getClass(), "convention", null);
        setField(term84849, term84849.getClass(), "typeRegistry", null);
        setField(term84849, term84849.getClass(), "firstLink", null);
        setField(term84849, term84849.getClass(), "nextLink", null);
        setField(term84849, term84849.getClass(), "restrictUndefinedVisitor", null);
        setField(term84849, term84849.getClass(), "restrictNullVisitor", null);
        term84850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term84852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term84850, term84850.getClass(), "str", null);
        setIntField(term84850, term84850.getClass(), "type", 46);
        setField(term84850, term84850.getClass(), "next", null);
        setField(term84851, term84851.getClass(), "str", null);
        setIntField(term84851, term84851.getClass(), "type", -47);
        setField(term84851, term84851.getClass(), "next", null);
        setField(term84851, term84851.getClass(), "first", null);
        setField(term84851, term84851.getClass(), "last", null);
        setField(term84851, term84851.getClass(), "propListHead", null);
        setIntField(term84851, term84851.getClass(), "sourcePosition", 0);
        setField(term84851, term84851.getClass(), "jsType", null);
        setField(term84851, term84851.getClass(), "parent", null);
        setField(term84850, term84850.getClass(), "first", term84851);
        setDoubleField(term84852, term84852.getClass(), "number", 0.0);
        setIntField(term84852, term84852.getClass(), "type", 46);
        setField(term84852, term84852.getClass(), "next", null);
        setField(term84852, term84852.getClass(), "first", null);
        setField(term84852, term84852.getClass(), "last", null);
        setField(term84852, term84852.getClass(), "propListHead", null);
        setIntField(term84852, term84852.getClass(), "sourcePosition", 0);
        setField(term84852, term84852.getClass(), "jsType", null);
        setField(term84852, term84852.getClass(), "parent", null);
        setField(term84850, term84850.getClass(), "last", term84852);
        setField(term84850, term84850.getClass(), "propListHead", null);
        setIntField(term84850, term84850.getClass(), "sourcePosition", 0);
        setField(term84850, term84850.getClass(), "jsType", null);
        setField(term84850, term84850.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term84603;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term84511, args);
        assertTrue(recursiveEquals(term84511, term84849));
        assertTrue(recursiveEquals(term84603, term84850));
        assertTrue(recursiveEquals(retValue, null));
    }

};


