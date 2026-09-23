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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19351;
     Object term19443;
     Object term19676;
     Object term19677;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19351 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term19443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19443, term19443.getClass(), "type", 46);
        setField(term19443, term19443.getClass(), "first", term19443);
        setField(term19443, term19443.getClass(), "last", term19535);
        term19676 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term19676, term19676.getClass(), "INEQ", null);
        setField(term19676, term19676.getClass(), "convention", null);
        setField(term19676, term19676.getClass(), "typeRegistry", null);
        setField(term19676, term19676.getClass(), "firstLink", null);
        setField(term19676, term19676.getClass(), "nextLink", null);
        setField(term19676, term19676.getClass(), "restrictUndefinedVisitor", null);
        setField(term19676, term19676.getClass(), "restrictNullVisitor", null);
        term19677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19677, term19677.getClass(), "str", null);
        setIntField(term19677, term19677.getClass(), "type", 46);
        setField(term19677, term19677.getClass(), "next", null);
        setField(term19677, term19677.getClass(), "first", term19677);
        setField(term19678, term19678.getClass(), "str", null);
        setIntField(term19678, term19678.getClass(), "type", 0);
        setField(term19678, term19678.getClass(), "next", null);
        setField(term19678, term19678.getClass(), "first", null);
        setField(term19678, term19678.getClass(), "last", null);
        setField(term19678, term19678.getClass(), "propListHead", null);
        setIntField(term19678, term19678.getClass(), "sourcePosition", 0);
        setField(term19678, term19678.getClass(), "jsType", null);
        setField(term19678, term19678.getClass(), "parent", null);
        setField(term19677, term19677.getClass(), "last", term19678);
        setField(term19677, term19677.getClass(), "propListHead", null);
        setIntField(term19677, term19677.getClass(), "sourcePosition", 0);
        setField(term19677, term19677.getClass(), "jsType", null);
        setField(term19677, term19677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term19443;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term19351, args);
        assertTrue(recursiveEquals(term19351, term19676));
        assertTrue(recursiveEquals(term19443, term19677));
        assertTrue(recursiveEquals(retValue, null));
    }

};


