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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219759;
     Object term219829;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219759 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term219829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term220079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term219829, term219829.getClass(), "type", 111);
        setField(term219899, term219899.getClass(), "first", term219899);
        setIntField(term219899, term219899.getClass(), "type", 111);
        setField(term219899, term219899.getClass(), "jsType", term220009);
        setField(term219829, term219829.getClass(), "parent", term219899);
        setIntField(term220079, term220079.getClass(), "type", 111);
        setField(term220079, term220079.getClass(), "jsType", term220171);
        setField(term219829, term219829.getClass(), "first", term220079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term219829;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term219759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


