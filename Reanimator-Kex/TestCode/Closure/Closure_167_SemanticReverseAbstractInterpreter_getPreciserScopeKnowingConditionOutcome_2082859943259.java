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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63291;
     Object term63463;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63291 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term63393 = newInstance(Class.forName("com.google.common.collect.Multisets$ElementSet$1"));
        setField(term63291, term63291.getClass(), "INEQ", term63393);
        term63463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term63699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63463, term63463.getClass(), "type", 14);
        setIntField(term63533, term63533.getClass(), "type", 14);
        setField(term63533, term63533.getClass(), "jsType", term63629);
        setField(term63463, term63463.getClass(), "first", term63533);
        setField(term63463, term63463.getClass(), "last", term63699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term63463;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term63291, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


