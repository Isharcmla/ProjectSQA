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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218607;
     Object term218677;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218607 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term218677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term218925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term218677, term218677.getClass(), "type", 45);
        setIntField(term218747, term218747.getClass(), "type", 45);
        setField(term218747, term218747.getClass(), "jsType", term218855);
        setField(term218677, term218677.getClass(), "first", term218747);
        setIntField(term218925, term218925.getClass(), "type", 45);
        setField(term218925, term218925.getClass(), "jsType", term219013);
        setField(term218677, term218677.getClass(), "last", term218925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term218677;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term218607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


