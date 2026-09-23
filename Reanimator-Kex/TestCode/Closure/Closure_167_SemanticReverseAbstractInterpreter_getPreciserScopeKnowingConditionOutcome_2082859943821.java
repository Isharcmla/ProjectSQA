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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251397;
     Object term251489;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251397 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term251489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term251767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term251873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term251489, term251489.getClass(), "type", 46);
        setIntField(term251581, term251581.getClass(), "type", 0);
        setField(term251581, term251581.getClass(), "jsType", term251675);
        setField(term251489, term251489.getClass(), "first", term251581);
        setIntField(term251767, term251767.getClass(), "type", 46);
        setField(term251767, term251767.getClass(), "jsType", term251873);
        setField(term251489, term251489.getClass(), "last", term251767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term251489;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term251397, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


