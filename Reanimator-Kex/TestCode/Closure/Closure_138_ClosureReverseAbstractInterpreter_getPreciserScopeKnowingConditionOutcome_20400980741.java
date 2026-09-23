package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13617;
     Object term13817;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13617 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term13747 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term13747, term13747.getClass(), "nextLink", term13747);
        setField(term13617, term13617.getClass(), "nextLink", term13747);
        term13817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13817, term13817.getClass(), "type", -38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term13817;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term13617, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


