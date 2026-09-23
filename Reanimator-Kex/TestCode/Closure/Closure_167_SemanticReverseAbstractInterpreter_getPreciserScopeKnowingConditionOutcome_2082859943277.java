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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69365;
     Object term69457;
     Object term69681;
     Object term69682;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69365 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term69457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term69619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69457, term69457.getClass(), "type", 45);
        setIntField(term69549, term69549.getClass(), "type", -46);
        setField(term69457, term69457.getClass(), "first", term69549);
        setIntField(term69619, term69619.getClass(), "type", 45);
        setField(term69457, term69457.getClass(), "last", term69619);
        term69681 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term69681, term69681.getClass(), "INEQ", null);
        setField(term69681, term69681.getClass(), "convention", null);
        setField(term69681, term69681.getClass(), "typeRegistry", null);
        setField(term69681, term69681.getClass(), "firstLink", null);
        setField(term69681, term69681.getClass(), "nextLink", null);
        setField(term69681, term69681.getClass(), "restrictUndefinedVisitor", null);
        setField(term69681, term69681.getClass(), "restrictNullVisitor", null);
        term69682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term69684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69682, term69682.getClass(), "str", null);
        setIntField(term69682, term69682.getClass(), "type", 45);
        setField(term69682, term69682.getClass(), "next", null);
        setDoubleField(term69683, term69683.getClass(), "number", 0.0);
        setIntField(term69683, term69683.getClass(), "type", -46);
        setField(term69683, term69683.getClass(), "next", null);
        setField(term69683, term69683.getClass(), "first", null);
        setField(term69683, term69683.getClass(), "last", null);
        setField(term69683, term69683.getClass(), "propListHead", null);
        setIntField(term69683, term69683.getClass(), "sourcePosition", 0);
        setField(term69683, term69683.getClass(), "jsType", null);
        setField(term69683, term69683.getClass(), "parent", null);
        setField(term69682, term69682.getClass(), "first", term69683);
        setIntField(term69684, term69684.getClass(), "type", 45);
        setField(term69684, term69684.getClass(), "next", null);
        setField(term69684, term69684.getClass(), "first", null);
        setField(term69684, term69684.getClass(), "last", null);
        setField(term69684, term69684.getClass(), "propListHead", null);
        setIntField(term69684, term69684.getClass(), "sourcePosition", 0);
        setField(term69684, term69684.getClass(), "jsType", null);
        setField(term69684, term69684.getClass(), "parent", null);
        setField(term69682, term69682.getClass(), "last", term69684);
        setField(term69682, term69682.getClass(), "propListHead", null);
        setIntField(term69682, term69682.getClass(), "sourcePosition", 0);
        setField(term69682, term69682.getClass(), "jsType", null);
        setField(term69682, term69682.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term69457;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term69365, args);
        assertTrue(recursiveEquals(term69365, term69681));
        assertTrue(recursiveEquals(term69457, term69682));
        assertTrue(recursiveEquals(retValue, null));
    }

};


