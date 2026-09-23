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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262126;
     Object term262218;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262126 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term262218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term262310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term262500 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term262218, term262218.getClass(), "type", 13);
        setIntField(term262310, term262310.getClass(), "type", 34);
        setField(term262310, term262310.getClass(), "jsType", term262408);
        setField(term262218, term262218.getClass(), "first", term262310);
        setIntField(term262500, term262500.getClass(), "type", -8227);
        setField(term262500, term262500.getClass(), "jsType", term262600);
        setField(term262218, term262218.getClass(), "last", term262500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term262218;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term262126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


