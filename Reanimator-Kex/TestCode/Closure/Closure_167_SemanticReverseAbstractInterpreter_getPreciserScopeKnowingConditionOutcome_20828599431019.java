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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479359;
     Object term479451;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479359 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term479451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term479543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term479635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term479739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term479831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term479937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term479451, term479451.getClass(), "type", 111);
        setIntField(term479635, term479635.getClass(), "type", 111);
        setField(term479635, term479635.getClass(), "jsType", term479739);
        setField(term479543, term479543.getClass(), "first", term479635);
        setField(term479451, term479451.getClass(), "parent", term479543);
        setIntField(term479831, term479831.getClass(), "type", 111);
        setField(term479831, term479831.getClass(), "jsType", term479937);
        setField(term479451, term479451.getClass(), "first", term479831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term479451;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term479359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


