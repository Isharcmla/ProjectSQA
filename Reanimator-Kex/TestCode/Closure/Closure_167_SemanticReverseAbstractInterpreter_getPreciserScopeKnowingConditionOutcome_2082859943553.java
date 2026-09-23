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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153891;
     Object term153983;
     Object term153992;
     Object term153993;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153891 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term153983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term153983, term153983.getClass(), "type", 15);
        term153992 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term153992, term153992.getClass(), "INEQ", null);
        setField(term153992, term153992.getClass(), "convention", null);
        setField(term153992, term153992.getClass(), "typeRegistry", null);
        setField(term153992, term153992.getClass(), "firstLink", null);
        setField(term153992, term153992.getClass(), "nextLink", null);
        setField(term153992, term153992.getClass(), "restrictUndefinedVisitor", null);
        setField(term153992, term153992.getClass(), "restrictNullVisitor", null);
        term153993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term153993, term153993.getClass(), "str", null);
        setIntField(term153993, term153993.getClass(), "type", 15);
        setField(term153993, term153993.getClass(), "next", null);
        setField(term153993, term153993.getClass(), "first", null);
        setField(term153993, term153993.getClass(), "last", null);
        setField(term153993, term153993.getClass(), "propListHead", null);
        setIntField(term153993, term153993.getClass(), "sourcePosition", 0);
        setField(term153993, term153993.getClass(), "jsType", null);
        setField(term153993, term153993.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term153983;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term153891, args);
        assertTrue(recursiveEquals(term153891, term153992));
        assertTrue(recursiveEquals(term153983, term153993));
        assertTrue(recursiveEquals(retValue, null));
    }

};


