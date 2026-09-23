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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246950;
     Object term247042;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246950 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term247042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247226 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term247332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term247424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term247042, term247042.getClass(), "type", 111);
        setIntField(term247226, term247226.getClass(), "type", 0);
        setField(term247226, term247226.getClass(), "jsType", term247332);
        setField(term247134, term247134.getClass(), "first", term247226);
        setField(term247042, term247042.getClass(), "parent", term247134);
        setIntField(term247424, term247424.getClass(), "type", 0);
        setField(term247424, term247424.getClass(), "jsType", term247332);
        setField(term247042, term247042.getClass(), "first", term247424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term247042;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term246950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


