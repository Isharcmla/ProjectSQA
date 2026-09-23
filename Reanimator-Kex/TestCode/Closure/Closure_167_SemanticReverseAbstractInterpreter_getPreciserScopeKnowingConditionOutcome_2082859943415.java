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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109156;
     Object term109248;
     Object term109362;
     Object term109363;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109156 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term109248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term109248, term109248.getClass(), "type", 51);
        setField(term109248, term109248.getClass(), "first", term109340);
        term109362 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term109362, term109362.getClass(), "INEQ", null);
        setField(term109362, term109362.getClass(), "convention", null);
        setField(term109362, term109362.getClass(), "typeRegistry", null);
        setField(term109362, term109362.getClass(), "firstLink", null);
        setField(term109362, term109362.getClass(), "nextLink", null);
        setField(term109362, term109362.getClass(), "restrictUndefinedVisitor", null);
        setField(term109362, term109362.getClass(), "restrictNullVisitor", null);
        term109363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109364 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term109363, term109363.getClass(), "str", null);
        setIntField(term109363, term109363.getClass(), "type", 51);
        setField(term109363, term109363.getClass(), "next", null);
        setField(term109364, term109364.getClass(), "str", null);
        setIntField(term109364, term109364.getClass(), "type", 0);
        setField(term109364, term109364.getClass(), "next", null);
        setField(term109364, term109364.getClass(), "first", null);
        setField(term109364, term109364.getClass(), "last", null);
        setField(term109364, term109364.getClass(), "propListHead", null);
        setIntField(term109364, term109364.getClass(), "sourcePosition", 0);
        setField(term109364, term109364.getClass(), "jsType", null);
        setField(term109364, term109364.getClass(), "parent", null);
        setField(term109363, term109363.getClass(), "first", term109364);
        setField(term109363, term109363.getClass(), "last", null);
        setField(term109363, term109363.getClass(), "propListHead", null);
        setIntField(term109363, term109363.getClass(), "sourcePosition", 0);
        setField(term109363, term109363.getClass(), "jsType", null);
        setField(term109363, term109363.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term109248;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term109156, args);
        assertTrue(recursiveEquals(term109156, term109362));
        assertTrue(recursiveEquals(term109248, term109363));
        assertTrue(recursiveEquals(retValue, null));
    }

};


