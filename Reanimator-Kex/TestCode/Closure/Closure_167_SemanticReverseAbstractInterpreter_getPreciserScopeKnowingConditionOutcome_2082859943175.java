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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39832;
     Object term39902;
     Object term40463;
     Object term40464;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39832 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term39902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39902, term39902.getClass(), "type", 111);
        setIntField(term40042, term40042.getClass(), "type", 111);
        setField(term39972, term39972.getClass(), "first", term40042);
        setField(term39902, term39902.getClass(), "parent", term39972);
        setIntField(term40112, term40112.getClass(), "type", 111);
        setField(term39902, term39902.getClass(), "first", term40112);
        term40463 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term40463, term40463.getClass(), "INEQ", null);
        setField(term40463, term40463.getClass(), "convention", null);
        setField(term40463, term40463.getClass(), "typeRegistry", null);
        setField(term40463, term40463.getClass(), "firstLink", null);
        setField(term40463, term40463.getClass(), "nextLink", null);
        setField(term40463, term40463.getClass(), "restrictUndefinedVisitor", null);
        setField(term40463, term40463.getClass(), "restrictNullVisitor", null);
        term40464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40464, term40464.getClass(), "type", 111);
        setField(term40464, term40464.getClass(), "next", null);
        setIntField(term40465, term40465.getClass(), "type", 111);
        setField(term40465, term40465.getClass(), "next", null);
        setField(term40465, term40465.getClass(), "first", null);
        setField(term40465, term40465.getClass(), "last", null);
        setField(term40465, term40465.getClass(), "propListHead", null);
        setIntField(term40465, term40465.getClass(), "sourcePosition", 0);
        setField(term40465, term40465.getClass(), "jsType", null);
        setField(term40465, term40465.getClass(), "parent", null);
        setField(term40464, term40464.getClass(), "first", term40465);
        setField(term40464, term40464.getClass(), "last", null);
        setField(term40464, term40464.getClass(), "propListHead", null);
        setIntField(term40464, term40464.getClass(), "sourcePosition", 0);
        setField(term40464, term40464.getClass(), "jsType", null);
        setIntField(term40466, term40466.getClass(), "type", 0);
        setField(term40466, term40466.getClass(), "next", null);
        setIntField(term40467, term40467.getClass(), "type", 111);
        setField(term40467, term40467.getClass(), "next", null);
        setField(term40467, term40467.getClass(), "first", null);
        setField(term40467, term40467.getClass(), "last", null);
        setField(term40467, term40467.getClass(), "propListHead", null);
        setIntField(term40467, term40467.getClass(), "sourcePosition", 0);
        setField(term40467, term40467.getClass(), "jsType", null);
        setField(term40467, term40467.getClass(), "parent", null);
        setField(term40466, term40466.getClass(), "first", term40467);
        setField(term40466, term40466.getClass(), "last", null);
        setField(term40466, term40466.getClass(), "propListHead", null);
        setIntField(term40466, term40466.getClass(), "sourcePosition", 0);
        setField(term40466, term40466.getClass(), "jsType", null);
        setField(term40466, term40466.getClass(), "parent", null);
        setField(term40464, term40464.getClass(), "parent", term40466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term39902;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term39832, args);
        assertTrue(recursiveEquals(term39832, term40463));
        assertTrue(recursiveEquals(term39902, term40464));
        assertTrue(recursiveEquals(retValue, null));
    }

};


