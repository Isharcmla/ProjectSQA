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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217574;
     Object term217666;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217574 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term217666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term217758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term217916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term217666, term217666.getClass(), "type", 12);
        setIntField(term217758, term217758.getClass(), "type", 1);
        setField(term217758, term217758.getClass(), "jsType", term217846);
        setField(term217666, term217666.getClass(), "first", term217758);
        setIntField(term217916, term217916.getClass(), "type", -16386);
        setField(term217916, term217916.getClass(), "jsType", term218010);
        setField(term217666, term217666.getClass(), "last", term217916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term217666;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term217574, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


