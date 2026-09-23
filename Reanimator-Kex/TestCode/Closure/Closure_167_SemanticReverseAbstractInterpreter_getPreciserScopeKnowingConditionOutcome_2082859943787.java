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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237293;
     Object term237363;
     Object term237686;
     Object term237687;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237293 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term237363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term237601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term237363, term237363.getClass(), "type", 45);
        setIntField(term237433, term237433.getClass(), "type", 45);
        setField(term237433, term237433.getClass(), "jsType", term237531);
        setField(term237363, term237363.getClass(), "first", term237433);
        setIntField(term237601, term237601.getClass(), "type", 45);
        setField(term237601, term237601.getClass(), "jsType", null);
        setField(term237363, term237363.getClass(), "last", term237601);
        term237686 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term237686, term237686.getClass(), "INEQ", null);
        setField(term237686, term237686.getClass(), "convention", null);
        setField(term237686, term237686.getClass(), "typeRegistry", null);
        setField(term237686, term237686.getClass(), "firstLink", null);
        setField(term237686, term237686.getClass(), "nextLink", null);
        setField(term237686, term237686.getClass(), "restrictUndefinedVisitor", null);
        setField(term237686, term237686.getClass(), "restrictNullVisitor", null);
        term237687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term237690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term237687, term237687.getClass(), "type", 45);
        setField(term237687, term237687.getClass(), "next", null);
        setIntField(term237688, term237688.getClass(), "type", 45);
        setField(term237688, term237688.getClass(), "next", null);
        setField(term237688, term237688.getClass(), "first", null);
        setField(term237688, term237688.getClass(), "last", null);
        setField(term237688, term237688.getClass(), "propListHead", null);
        setIntField(term237688, term237688.getClass(), "sourcePosition", 0);
        setBooleanField(term237689, term237689.getClass(), "resolved", false);
        setField(term237689, term237689.getClass(), "resolveResult", null);
        setBooleanField(term237689, term237689.getClass(), "inTemplatedCheckVisit", false);
        setField(term237689, term237689.getClass(), "registry", null);
        setField(term237688, term237688.getClass(), "jsType", term237689);
        setField(term237688, term237688.getClass(), "parent", null);
        setField(term237687, term237687.getClass(), "first", term237688);
        setIntField(term237690, term237690.getClass(), "type", 45);
        setField(term237690, term237690.getClass(), "next", null);
        setField(term237690, term237690.getClass(), "first", null);
        setField(term237690, term237690.getClass(), "last", null);
        setField(term237690, term237690.getClass(), "propListHead", null);
        setIntField(term237690, term237690.getClass(), "sourcePosition", 0);
        setField(term237690, term237690.getClass(), "jsType", null);
        setField(term237690, term237690.getClass(), "parent", null);
        setField(term237687, term237687.getClass(), "last", term237690);
        setField(term237687, term237687.getClass(), "propListHead", null);
        setIntField(term237687, term237687.getClass(), "sourcePosition", 0);
        setField(term237687, term237687.getClass(), "jsType", null);
        setField(term237687, term237687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term237363;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term237293, args);
        assertTrue(recursiveEquals(term237293, term237686));
        assertTrue(recursiveEquals(term237363, term237687));
        assertTrue(recursiveEquals(retValue, null));
    }

};


