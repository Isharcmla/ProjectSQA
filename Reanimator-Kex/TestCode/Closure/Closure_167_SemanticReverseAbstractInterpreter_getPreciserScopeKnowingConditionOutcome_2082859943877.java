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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274965;
     Object term275057;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274965 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term275057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term275149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term275241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term275351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term275443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term275555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term275057, term275057.getClass(), "type", 111);
        setIntField(term275241, term275241.getClass(), "type", 0);
        setField(term275241, term275241.getClass(), "jsType", term275351);
        setField(term275149, term275149.getClass(), "first", term275241);
        setField(term275057, term275057.getClass(), "parent", term275149);
        setIntField(term275443, term275443.getClass(), "type", -201326593);
        setField(term275443, term275443.getClass(), "jsType", term275555);
        setField(term275057, term275057.getClass(), "first", term275443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term275057;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term274965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


