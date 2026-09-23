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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245075;
     Object term245277;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245075 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term245185 = newInstance(Class.forName("com.google.common.collect.Interners$InternerFunction"));
        setField(term245075, term245075.getClass(), "INEQ", term245185);
        term245277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term245277, term245277.getClass(), "type", 17);
        setIntField(term245369, term245369.getClass(), "type", 17);
        setField(term245369, term245369.getClass(), "jsType", term245469);
        setField(term245277, term245277.getClass(), "first", term245369);
        setField(term245277, term245277.getClass(), "last", term245277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term245277;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term245075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


