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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224720;
     Object term224790;
     Object term225166;
     Object term225167;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224720 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term224790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term224984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term225054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term224790, term224790.getClass(), "type", 45);
        setIntField(term224860, term224860.getClass(), "type", 45);
        setField(term224860, term224860.getClass(), "jsType", term224984);
        setField(term224790, term224790.getClass(), "first", term224860);
        setIntField(term225054, term225054.getClass(), "type", 45);
        setField(term225054, term225054.getClass(), "jsType", null);
        setField(term224790, term224790.getClass(), "last", term225054);
        term225166 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term225166, term225166.getClass(), "INEQ", null);
        setField(term225166, term225166.getClass(), "convention", null);
        setField(term225166, term225166.getClass(), "typeRegistry", null);
        setField(term225166, term225166.getClass(), "firstLink", null);
        setField(term225166, term225166.getClass(), "nextLink", null);
        setField(term225166, term225166.getClass(), "restrictUndefinedVisitor", null);
        setField(term225166, term225166.getClass(), "restrictNullVisitor", null);
        term225167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term225170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term225167, term225167.getClass(), "type", 45);
        setField(term225167, term225167.getClass(), "next", null);
        setIntField(term225168, term225168.getClass(), "type", 45);
        setField(term225168, term225168.getClass(), "next", null);
        setField(term225168, term225168.getClass(), "first", null);
        setField(term225168, term225168.getClass(), "last", null);
        setField(term225168, term225168.getClass(), "propListHead", null);
        setIntField(term225168, term225168.getClass(), "sourcePosition", 0);
        setField(term225169, term225169.getClass(), "typeExpr", null);
        setField(term225169, term225169.getClass(), "sourceName", null);
        setBooleanField(term225169, term225169.getClass(), "isChecked", false);
        setBooleanField(term225169, term225169.getClass(), "visited", false);
        setField(term225169, term225169.getClass(), "docInfo", null);
        setBooleanField(term225169, term225169.getClass(), "unknown", false);
        setBooleanField(term225169, term225169.getClass(), "resolved", false);
        setField(term225169, term225169.getClass(), "resolveResult", null);
        setBooleanField(term225169, term225169.getClass(), "inTemplatedCheckVisit", false);
        setField(term225169, term225169.getClass(), "registry", null);
        setField(term225168, term225168.getClass(), "jsType", term225169);
        setField(term225168, term225168.getClass(), "parent", null);
        setField(term225167, term225167.getClass(), "first", term225168);
        setIntField(term225170, term225170.getClass(), "type", 45);
        setField(term225170, term225170.getClass(), "next", null);
        setField(term225170, term225170.getClass(), "first", null);
        setField(term225170, term225170.getClass(), "last", null);
        setField(term225170, term225170.getClass(), "propListHead", null);
        setIntField(term225170, term225170.getClass(), "sourcePosition", 0);
        setField(term225170, term225170.getClass(), "jsType", null);
        setField(term225170, term225170.getClass(), "parent", null);
        setField(term225167, term225167.getClass(), "last", term225170);
        setField(term225167, term225167.getClass(), "propListHead", null);
        setIntField(term225167, term225167.getClass(), "sourcePosition", 0);
        setField(term225167, term225167.getClass(), "jsType", null);
        setField(term225167, term225167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term224790;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term224720, args);
        assertTrue(recursiveEquals(term224720, term225166));
        assertTrue(recursiveEquals(term224790, term225167));
        assertTrue(recursiveEquals(retValue, null));
    }

};


