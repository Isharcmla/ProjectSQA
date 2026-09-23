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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174336;
     Object term174428;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174336 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term174428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term174706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term174428, term174428.getClass(), "type", 12);
        setIntField(term174520, term174520.getClass(), "type", 1);
        setField(term174520, term174520.getClass(), "jsType", term174614);
        setField(term174428, term174428.getClass(), "first", term174520);
        setIntField(term174706, term174706.getClass(), "type", 12);
        setField(term174706, term174706.getClass(), "jsType", term174806);
        setField(term174428, term174428.getClass(), "last", term174706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term174428;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term174336, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


