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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170518;
     Object term170610;
     Object term170619;
     Object term170620;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170518 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term170610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term170610, term170610.getClass(), "type", 14);
        term170619 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term170619, term170619.getClass(), "INEQ", null);
        setField(term170619, term170619.getClass(), "convention", null);
        setField(term170619, term170619.getClass(), "typeRegistry", null);
        setField(term170619, term170619.getClass(), "firstLink", null);
        setField(term170619, term170619.getClass(), "nextLink", null);
        setField(term170619, term170619.getClass(), "restrictUndefinedVisitor", null);
        setField(term170619, term170619.getClass(), "restrictNullVisitor", null);
        term170620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term170620, term170620.getClass(), "str", null);
        setIntField(term170620, term170620.getClass(), "type", 14);
        setField(term170620, term170620.getClass(), "next", null);
        setField(term170620, term170620.getClass(), "first", null);
        setField(term170620, term170620.getClass(), "last", null);
        setField(term170620, term170620.getClass(), "propListHead", null);
        setIntField(term170620, term170620.getClass(), "sourcePosition", 0);
        setField(term170620, term170620.getClass(), "jsType", null);
        setField(term170620, term170620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term170610;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term170518, args);
        assertTrue(recursiveEquals(term170518, term170619));
        assertTrue(recursiveEquals(term170610, term170620));
        assertTrue(recursiveEquals(retValue, null));
    }

};


