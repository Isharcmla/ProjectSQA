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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3244;
     Object term3454;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3244 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term3384 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term3384, term3384.getClass(), "nextLink", term3384);
        setField(term3244, term3244.getClass(), "nextLink", term3384);
        term3454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3454, term3454.getClass(), "type", -38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3454;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term3244, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


