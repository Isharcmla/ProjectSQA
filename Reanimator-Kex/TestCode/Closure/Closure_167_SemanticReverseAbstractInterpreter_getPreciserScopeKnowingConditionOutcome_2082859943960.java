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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374077;
     Object term374169;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374077 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term374169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term374261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term374367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term374437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term374535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term374169, term374169.getClass(), "type", 46);
        setIntField(term374261, term374261.getClass(), "type", 1);
        setField(term374261, term374261.getClass(), "jsType", term374367);
        setField(term374169, term374169.getClass(), "first", term374261);
        setIntField(term374437, term374437.getClass(), "type", -16386);
        setField(term374437, term374437.getClass(), "jsType", term374535);
        setField(term374169, term374169.getClass(), "last", term374437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term374169;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term374077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


