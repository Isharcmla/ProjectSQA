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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226536;
     Object term226606;
     Object term226934;
     Object term226935;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226536 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term226606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term226840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term226606, term226606.getClass(), "type", 46);
        setIntField(term226676, term226676.getClass(), "type", 46);
        setField(term226676, term226676.getClass(), "jsType", term226770);
        setField(term226606, term226606.getClass(), "first", term226676);
        setIntField(term226840, term226840.getClass(), "type", 46);
        setField(term226840, term226840.getClass(), "jsType", null);
        setField(term226606, term226606.getClass(), "last", term226840);
        term226934 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term226934, term226934.getClass(), "INEQ", null);
        setField(term226934, term226934.getClass(), "convention", null);
        setField(term226934, term226934.getClass(), "typeRegistry", null);
        setField(term226934, term226934.getClass(), "firstLink", null);
        setField(term226934, term226934.getClass(), "nextLink", null);
        setField(term226934, term226934.getClass(), "restrictUndefinedVisitor", null);
        setField(term226934, term226934.getClass(), "restrictNullVisitor", null);
        term226935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term226938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term226935, term226935.getClass(), "type", 46);
        setField(term226935, term226935.getClass(), "next", null);
        setIntField(term226936, term226936.getClass(), "type", 46);
        setField(term226936, term226936.getClass(), "next", null);
        setField(term226936, term226936.getClass(), "first", null);
        setField(term226936, term226936.getClass(), "last", null);
        setField(term226936, term226936.getClass(), "propListHead", null);
        setIntField(term226936, term226936.getClass(), "sourcePosition", 0);
        setField(term226937, term226937.getClass(), "alternates", null);
        setIntField(term226937, term226937.getClass(), "hashcode", 0);
        setBooleanField(term226937, term226937.getClass(), "resolved", false);
        setField(term226937, term226937.getClass(), "resolveResult", null);
        setBooleanField(term226937, term226937.getClass(), "inTemplatedCheckVisit", false);
        setField(term226937, term226937.getClass(), "registry", null);
        setField(term226936, term226936.getClass(), "jsType", term226937);
        setField(term226936, term226936.getClass(), "parent", null);
        setField(term226935, term226935.getClass(), "first", term226936);
        setIntField(term226938, term226938.getClass(), "type", 46);
        setField(term226938, term226938.getClass(), "next", null);
        setField(term226938, term226938.getClass(), "first", null);
        setField(term226938, term226938.getClass(), "last", null);
        setField(term226938, term226938.getClass(), "propListHead", null);
        setIntField(term226938, term226938.getClass(), "sourcePosition", 0);
        setField(term226938, term226938.getClass(), "jsType", null);
        setField(term226938, term226938.getClass(), "parent", null);
        setField(term226935, term226935.getClass(), "last", term226938);
        setField(term226935, term226935.getClass(), "propListHead", null);
        setIntField(term226935, term226935.getClass(), "sourcePosition", 0);
        setField(term226935, term226935.getClass(), "jsType", null);
        setField(term226935, term226935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term226606;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term226536, args);
        assertTrue(recursiveEquals(term226536, term226934));
        assertTrue(recursiveEquals(term226606, term226935));
        assertTrue(recursiveEquals(retValue, null));
    }

};


