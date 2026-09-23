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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404321;
     Object term404413;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term404321 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term404413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term404505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term404629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term404721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term404815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term404413, term404413.getClass(), "type", 46);
        setIntField(term404505, term404505.getClass(), "type", -1072);
        setField(term404505, term404505.getClass(), "jsType", term404629);
        setField(term404413, term404413.getClass(), "first", term404505);
        setIntField(term404721, term404721.getClass(), "type", 39);
        setField(term404721, term404721.getClass(), "jsType", term404815);
        setField(term404413, term404413.getClass(), "last", term404721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term404413;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term404321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


