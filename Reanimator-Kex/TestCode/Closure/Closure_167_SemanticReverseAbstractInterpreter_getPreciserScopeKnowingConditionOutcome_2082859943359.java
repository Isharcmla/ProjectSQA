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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93304;
     Object term93396;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93304 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term93396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term93692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term93396, term93396.getClass(), "type", 13);
        setIntField(term93488, term93488.getClass(), "type", 0);
        setField(term93488, term93488.getClass(), "jsType", term93600);
        setField(term93396, term93396.getClass(), "first", term93488);
        setIntField(term93692, term93692.getClass(), "type", 0);
        setField(term93692, term93692.getClass(), "jsType", term93792);
        setField(term93396, term93396.getClass(), "last", term93692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term93396;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term93304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


