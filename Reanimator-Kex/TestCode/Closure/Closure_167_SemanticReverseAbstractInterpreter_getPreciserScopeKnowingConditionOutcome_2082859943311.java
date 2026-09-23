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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79168;
     Object term79238;
     Object term79688;
     Object term79689;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79168 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term79238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79238, term79238.getClass(), "type", 13);
        setIntField(term79308, term79308.getClass(), "type", 13);
        setField(term79238, term79238.getClass(), "first", term79308);
        setIntField(term79378, term79378.getClass(), "type", 13);
        setField(term79238, term79238.getClass(), "last", term79378);
        term79688 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term79688, term79688.getClass(), "INEQ", null);
        setField(term79688, term79688.getClass(), "convention", null);
        setField(term79688, term79688.getClass(), "typeRegistry", null);
        setField(term79688, term79688.getClass(), "firstLink", null);
        setField(term79688, term79688.getClass(), "nextLink", null);
        setField(term79688, term79688.getClass(), "restrictUndefinedVisitor", null);
        setField(term79688, term79688.getClass(), "restrictNullVisitor", null);
        term79689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79689, term79689.getClass(), "type", 13);
        setField(term79689, term79689.getClass(), "next", null);
        setIntField(term79690, term79690.getClass(), "type", 13);
        setField(term79690, term79690.getClass(), "next", null);
        setField(term79690, term79690.getClass(), "first", null);
        setField(term79690, term79690.getClass(), "last", null);
        setField(term79690, term79690.getClass(), "propListHead", null);
        setIntField(term79690, term79690.getClass(), "sourcePosition", 0);
        setField(term79690, term79690.getClass(), "jsType", null);
        setField(term79690, term79690.getClass(), "parent", null);
        setField(term79689, term79689.getClass(), "first", term79690);
        setIntField(term79691, term79691.getClass(), "type", 13);
        setField(term79691, term79691.getClass(), "next", null);
        setField(term79691, term79691.getClass(), "first", null);
        setField(term79691, term79691.getClass(), "last", null);
        setField(term79691, term79691.getClass(), "propListHead", null);
        setIntField(term79691, term79691.getClass(), "sourcePosition", 0);
        setField(term79691, term79691.getClass(), "jsType", null);
        setField(term79691, term79691.getClass(), "parent", null);
        setField(term79689, term79689.getClass(), "last", term79691);
        setField(term79689, term79689.getClass(), "propListHead", null);
        setIntField(term79689, term79689.getClass(), "sourcePosition", 0);
        setField(term79689, term79689.getClass(), "jsType", null);
        setField(term79689, term79689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term79238;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term79168, args);
        assertTrue(recursiveEquals(term79168, term79688));
        assertTrue(recursiveEquals(term79238, term79689));
        assertTrue(recursiveEquals(retValue, null));
    }

};


