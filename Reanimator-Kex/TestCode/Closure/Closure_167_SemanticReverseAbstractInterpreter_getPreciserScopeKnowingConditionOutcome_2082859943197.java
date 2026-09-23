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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45343;
     Object term45559;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45343 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term45489 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$10"));
        setField(term45343, term45343.getClass(), "INEQ", term45489);
        term45559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term45805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45559, term45559.getClass(), "type", 17);
        setIntField(term45629, term45629.getClass(), "type", 17);
        setField(term45629, term45629.getClass(), "jsType", term45735);
        setField(term45559, term45559.getClass(), "first", term45629);
        setField(term45559, term45559.getClass(), "last", term45805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term45559;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term45343, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


