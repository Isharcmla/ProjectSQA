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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165390;
     Object term165482;
     Object term166220;
     Object term166221;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165390 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term165482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term165482, term165482.getClass(), "type", 17);
        term166220 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term166220, term166220.getClass(), "INEQ", null);
        setField(term166220, term166220.getClass(), "convention", null);
        setField(term166220, term166220.getClass(), "typeRegistry", null);
        setField(term166220, term166220.getClass(), "firstLink", null);
        setField(term166220, term166220.getClass(), "nextLink", null);
        setField(term166220, term166220.getClass(), "restrictUndefinedVisitor", null);
        setField(term166220, term166220.getClass(), "restrictNullVisitor", null);
        term166221 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term166221, term166221.getClass(), "str", null);
        setIntField(term166221, term166221.getClass(), "type", 17);
        setField(term166221, term166221.getClass(), "next", null);
        setField(term166221, term166221.getClass(), "first", null);
        setField(term166221, term166221.getClass(), "last", null);
        setField(term166221, term166221.getClass(), "propListHead", null);
        setIntField(term166221, term166221.getClass(), "sourcePosition", 0);
        setField(term166221, term166221.getClass(), "jsType", null);
        setField(term166221, term166221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term165482;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term165390, args);
        assertTrue(recursiveEquals(term165390, term166220));
        assertTrue(recursiveEquals(term165482, term166221));
        assertTrue(recursiveEquals(retValue, null));
    }

};


