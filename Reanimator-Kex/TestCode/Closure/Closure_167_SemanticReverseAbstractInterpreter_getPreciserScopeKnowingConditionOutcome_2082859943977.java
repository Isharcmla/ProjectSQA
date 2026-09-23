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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383520;
     Object term383612;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383520 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term383612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term383704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term383800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term383892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term383986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term383612, term383612.getClass(), "type", 45);
        setIntField(term383704, term383704.getClass(), "type", 0);
        setField(term383704, term383704.getClass(), "jsType", term383800);
        setField(term383612, term383612.getClass(), "first", term383704);
        setIntField(term383892, term383892.getClass(), "type", 45);
        setField(term383892, term383892.getClass(), "jsType", term383986);
        setField(term383612, term383612.getClass(), "last", term383892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term383612;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term383520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


