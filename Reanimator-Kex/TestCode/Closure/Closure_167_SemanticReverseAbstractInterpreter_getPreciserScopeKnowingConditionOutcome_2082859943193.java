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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44330;
     Object term44422;
     Object term44646;
     Object term44647;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44330 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term44422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term44514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44422, term44422.getClass(), "type", 46);
        setIntField(term44514, term44514.getClass(), "type", 0);
        setField(term44422, term44422.getClass(), "first", term44514);
        setField(term44422, term44422.getClass(), "last", term44584);
        term44646 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term44646, term44646.getClass(), "INEQ", null);
        setField(term44646, term44646.getClass(), "convention", null);
        setField(term44646, term44646.getClass(), "typeRegistry", null);
        setField(term44646, term44646.getClass(), "firstLink", null);
        setField(term44646, term44646.getClass(), "nextLink", null);
        setField(term44646, term44646.getClass(), "restrictUndefinedVisitor", null);
        setField(term44646, term44646.getClass(), "restrictNullVisitor", null);
        term44647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term44648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term44649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44647, term44647.getClass(), "str", null);
        setIntField(term44647, term44647.getClass(), "type", 46);
        setField(term44647, term44647.getClass(), "next", null);
        setDoubleField(term44648, term44648.getClass(), "number", 0.0);
        setIntField(term44648, term44648.getClass(), "type", 0);
        setField(term44648, term44648.getClass(), "next", null);
        setField(term44648, term44648.getClass(), "first", null);
        setField(term44648, term44648.getClass(), "last", null);
        setField(term44648, term44648.getClass(), "propListHead", null);
        setIntField(term44648, term44648.getClass(), "sourcePosition", 0);
        setField(term44648, term44648.getClass(), "jsType", null);
        setField(term44648, term44648.getClass(), "parent", null);
        setField(term44647, term44647.getClass(), "first", term44648);
        setIntField(term44649, term44649.getClass(), "type", 0);
        setField(term44649, term44649.getClass(), "next", null);
        setField(term44649, term44649.getClass(), "first", null);
        setField(term44649, term44649.getClass(), "last", null);
        setField(term44649, term44649.getClass(), "propListHead", null);
        setIntField(term44649, term44649.getClass(), "sourcePosition", 0);
        setField(term44649, term44649.getClass(), "jsType", null);
        setField(term44649, term44649.getClass(), "parent", null);
        setField(term44647, term44647.getClass(), "last", term44649);
        setField(term44647, term44647.getClass(), "propListHead", null);
        setIntField(term44647, term44647.getClass(), "sourcePosition", 0);
        setField(term44647, term44647.getClass(), "jsType", null);
        setField(term44647, term44647.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term44422;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term44330, args);
        assertTrue(recursiveEquals(term44330, term44646));
        assertTrue(recursiveEquals(term44422, term44647));
        assertTrue(recursiveEquals(retValue, null));
    }

};


