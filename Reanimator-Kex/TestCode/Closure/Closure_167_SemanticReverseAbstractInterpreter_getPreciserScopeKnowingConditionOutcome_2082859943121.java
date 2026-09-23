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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26310;
     Object term26402;
     Object term26643;
     Object term26644;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26310 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term26402 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term26402, term26402.getClass(), "type", 45);
        setField(term26402, term26402.getClass(), "first", term26494);
        setField(term26402, term26402.getClass(), "last", term26586);
        term26643 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term26643, term26643.getClass(), "INEQ", null);
        setField(term26643, term26643.getClass(), "convention", null);
        setField(term26643, term26643.getClass(), "typeRegistry", null);
        setField(term26643, term26643.getClass(), "firstLink", null);
        setField(term26643, term26643.getClass(), "nextLink", null);
        setField(term26643, term26643.getClass(), "restrictUndefinedVisitor", null);
        setField(term26643, term26643.getClass(), "restrictNullVisitor", null);
        term26644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term26646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26644, term26644.getClass(), "str", null);
        setIntField(term26644, term26644.getClass(), "type", 45);
        setField(term26644, term26644.getClass(), "next", null);
        setField(term26645, term26645.getClass(), "str", null);
        setIntField(term26645, term26645.getClass(), "type", 0);
        setField(term26645, term26645.getClass(), "next", null);
        setField(term26645, term26645.getClass(), "first", null);
        setField(term26645, term26645.getClass(), "last", null);
        setField(term26645, term26645.getClass(), "propListHead", null);
        setIntField(term26645, term26645.getClass(), "sourcePosition", 0);
        setField(term26645, term26645.getClass(), "jsType", null);
        setField(term26645, term26645.getClass(), "parent", null);
        setField(term26644, term26644.getClass(), "first", term26645);
        setField(term26646, term26646.getClass(), "str", null);
        setIntField(term26646, term26646.getClass(), "type", 0);
        setField(term26646, term26646.getClass(), "next", null);
        setField(term26646, term26646.getClass(), "first", null);
        setField(term26646, term26646.getClass(), "last", null);
        setField(term26646, term26646.getClass(), "propListHead", null);
        setIntField(term26646, term26646.getClass(), "sourcePosition", 0);
        setField(term26646, term26646.getClass(), "jsType", null);
        setField(term26646, term26646.getClass(), "parent", null);
        setField(term26644, term26644.getClass(), "last", term26646);
        setField(term26644, term26644.getClass(), "propListHead", null);
        setIntField(term26644, term26644.getClass(), "sourcePosition", 0);
        setField(term26644, term26644.getClass(), "jsType", null);
        setField(term26644, term26644.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term26402;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term26310, args);
        assertTrue(recursiveEquals(term26310, term26643));
        assertTrue(recursiveEquals(term26402, term26644));
        assertTrue(recursiveEquals(retValue, null));
    }

};


