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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206510;
     Object term206602;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206510 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term206602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term206886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term206980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term206602, term206602.getClass(), "type", 13);
        setIntField(term206694, term206694.getClass(), "type", 34);
        setField(term206694, term206694.getClass(), "jsType", term206794);
        setField(term206602, term206602.getClass(), "first", term206694);
        setIntField(term206886, term206886.getClass(), "type", -8227);
        setField(term206886, term206886.getClass(), "jsType", term206980);
        setField(term206602, term206602.getClass(), "last", term206886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term206602;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term206510, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


