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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269143;
     Object term269213;
     Object term269566;
     Object term269567;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269143 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term269213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term269463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term269213, term269213.getClass(), "type", 46);
        setIntField(term269283, term269283.getClass(), "type", 46);
        setField(term269283, term269283.getClass(), "jsType", term269393);
        setField(term269213, term269213.getClass(), "first", term269283);
        setIntField(term269463, term269463.getClass(), "type", 46);
        setField(term269463, term269463.getClass(), "jsType", null);
        setField(term269213, term269213.getClass(), "last", term269463);
        term269566 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term269566, term269566.getClass(), "INEQ", null);
        setField(term269566, term269566.getClass(), "convention", null);
        setField(term269566, term269566.getClass(), "typeRegistry", null);
        setField(term269566, term269566.getClass(), "firstLink", null);
        setField(term269566, term269566.getClass(), "nextLink", null);
        setField(term269566, term269566.getClass(), "restrictUndefinedVisitor", null);
        setField(term269566, term269566.getClass(), "restrictNullVisitor", null);
        term269567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term269570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term269567, term269567.getClass(), "type", 46);
        setField(term269567, term269567.getClass(), "next", null);
        setIntField(term269568, term269568.getClass(), "type", 46);
        setField(term269568, term269568.getClass(), "next", null);
        setField(term269568, term269568.getClass(), "first", null);
        setField(term269568, term269568.getClass(), "last", null);
        setField(term269568, term269568.getClass(), "propListHead", null);
        setIntField(term269568, term269568.getClass(), "sourcePosition", 0);
        setField(term269569, term269569.getClass(), "parameterType", null);
        setField(term269569, term269569.getClass(), "referencedType", null);
        setField(term269569, term269569.getClass(), "referencedObjType", null);
        setBooleanField(term269569, term269569.getClass(), "visited", false);
        setField(term269569, term269569.getClass(), "docInfo", null);
        setBooleanField(term269569, term269569.getClass(), "unknown", false);
        setBooleanField(term269569, term269569.getClass(), "resolved", false);
        setField(term269569, term269569.getClass(), "resolveResult", null);
        setBooleanField(term269569, term269569.getClass(), "inTemplatedCheckVisit", false);
        setField(term269569, term269569.getClass(), "registry", null);
        setField(term269568, term269568.getClass(), "jsType", term269569);
        setField(term269568, term269568.getClass(), "parent", null);
        setField(term269567, term269567.getClass(), "first", term269568);
        setIntField(term269570, term269570.getClass(), "type", 46);
        setField(term269570, term269570.getClass(), "next", null);
        setField(term269570, term269570.getClass(), "first", null);
        setField(term269570, term269570.getClass(), "last", null);
        setField(term269570, term269570.getClass(), "propListHead", null);
        setIntField(term269570, term269570.getClass(), "sourcePosition", 0);
        setField(term269570, term269570.getClass(), "jsType", null);
        setField(term269570, term269570.getClass(), "parent", null);
        setField(term269567, term269567.getClass(), "last", term269570);
        setField(term269567, term269567.getClass(), "propListHead", null);
        setIntField(term269567, term269567.getClass(), "sourcePosition", 0);
        setField(term269567, term269567.getClass(), "jsType", null);
        setField(term269567, term269567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term269213;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term269143, args);
        assertTrue(recursiveEquals(term269143, term269566));
        assertTrue(recursiveEquals(term269213, term269567));
        assertTrue(recursiveEquals(retValue, null));
    }

};


