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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377230;
     Object term377322;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377230 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term377322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term377414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term377510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term377602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term377700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term377322, term377322.getClass(), "type", 12);
        setIntField(term377414, term377414.getClass(), "type", 34);
        setField(term377414, term377414.getClass(), "jsType", term377510);
        setField(term377322, term377322.getClass(), "first", term377414);
        setIntField(term377602, term377602.getClass(), "type", -8227);
        setField(term377602, term377602.getClass(), "jsType", term377700);
        setField(term377322, term377322.getClass(), "last", term377602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term377322;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term377230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


