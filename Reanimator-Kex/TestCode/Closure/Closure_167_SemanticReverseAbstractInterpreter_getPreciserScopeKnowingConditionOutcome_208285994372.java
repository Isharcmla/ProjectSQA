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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13617;
     Object term13687;
     Object term14568;
     Object term14569;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13617 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term13687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13687, term13687.getClass(), "type", 51);
        term14568 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term14568, term14568.getClass(), "INEQ", null);
        setField(term14568, term14568.getClass(), "convention", null);
        setField(term14568, term14568.getClass(), "typeRegistry", null);
        setField(term14568, term14568.getClass(), "firstLink", null);
        setField(term14568, term14568.getClass(), "nextLink", null);
        setField(term14568, term14568.getClass(), "restrictUndefinedVisitor", null);
        setField(term14568, term14568.getClass(), "restrictNullVisitor", null);
        term14569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14569, term14569.getClass(), "type", 51);
        setField(term14569, term14569.getClass(), "next", null);
        setField(term14569, term14569.getClass(), "first", null);
        setField(term14569, term14569.getClass(), "last", null);
        setField(term14569, term14569.getClass(), "propListHead", null);
        setIntField(term14569, term14569.getClass(), "sourcePosition", 0);
        setField(term14569, term14569.getClass(), "jsType", null);
        setField(term14569, term14569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term13687;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term13617, args);
        assertTrue(recursiveEquals(term13617, term14568));
        assertTrue(recursiveEquals(term13687, term14569));
        assertTrue(recursiveEquals(retValue, null));
    }

};


