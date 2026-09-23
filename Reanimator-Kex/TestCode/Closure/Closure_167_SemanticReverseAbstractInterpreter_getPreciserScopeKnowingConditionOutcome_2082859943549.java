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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152512;
     Object term152728;
     Object term152958;
     Object term152960;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152512 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term152658 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$4"));
        setField(term152512, term152512.getClass(), "INEQ", term152658);
        term152728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152728, term152728.getClass(), "type", 16);
        setIntField(term152798, term152798.getClass(), "type", 16);
        setField(term152798, term152798.getClass(), "jsType", null);
        setField(term152728, term152728.getClass(), "first", term152798);
        setField(term152728, term152728.getClass(), "last", term152798);
        term152958 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term152959 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$4"));
        setField(term152958, term152958.getClass(), "INEQ", term152959);
        setField(term152958, term152958.getClass(), "convention", null);
        setField(term152958, term152958.getClass(), "typeRegistry", null);
        setField(term152958, term152958.getClass(), "firstLink", null);
        setField(term152958, term152958.getClass(), "nextLink", null);
        setField(term152958, term152958.getClass(), "restrictUndefinedVisitor", null);
        setField(term152958, term152958.getClass(), "restrictNullVisitor", null);
        term152960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152960, term152960.getClass(), "type", 16);
        setField(term152960, term152960.getClass(), "next", null);
        setIntField(term152961, term152961.getClass(), "type", 16);
        setField(term152961, term152961.getClass(), "next", null);
        setField(term152961, term152961.getClass(), "first", null);
        setField(term152961, term152961.getClass(), "last", null);
        setField(term152961, term152961.getClass(), "propListHead", null);
        setIntField(term152961, term152961.getClass(), "sourcePosition", 0);
        setField(term152961, term152961.getClass(), "jsType", null);
        setField(term152961, term152961.getClass(), "parent", null);
        setField(term152960, term152960.getClass(), "first", term152961);
        setField(term152960, term152960.getClass(), "last", term152961);
        setField(term152960, term152960.getClass(), "propListHead", null);
        setIntField(term152960, term152960.getClass(), "sourcePosition", 0);
        setField(term152960, term152960.getClass(), "jsType", null);
        setField(term152960, term152960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term152728;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term152512, args);
        assertTrue(recursiveEquals(term152512, term152958));
        assertTrue(recursiveEquals(term152728, term152960));
        assertTrue(recursiveEquals(retValue, null));
    }

};


