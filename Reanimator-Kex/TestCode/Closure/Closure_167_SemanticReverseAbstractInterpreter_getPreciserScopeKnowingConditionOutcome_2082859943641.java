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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182848;
     Object term183084;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182848 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term182992 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$5"));
        setField(term182848, term182848.getClass(), "INEQ", term182992);
        term183084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term183268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term183084, term183084.getClass(), "type", 15);
        setIntField(term183176, term183176.getClass(), "type", 15);
        setField(term183176, term183176.getClass(), "jsType", term183268);
        setField(term183084, term183084.getClass(), "first", term183176);
        setField(term183084, term183084.getClass(), "last", term183084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term183084;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term182848, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


