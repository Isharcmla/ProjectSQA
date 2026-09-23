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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533479;
     Object term533571;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533479 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term533571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term533845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term533571, term533571.getClass(), "type", 46);
        setIntField(term533663, term533663.getClass(), "type", 0);
        setField(term533663, term533663.getClass(), "jsType", term533753);
        setField(term533571, term533571.getClass(), "first", term533663);
        setIntField(term533845, term533845.getClass(), "type", 0);
        setField(term533845, term533845.getClass(), "jsType", term533951);
        setField(term533571, term533571.getClass(), "last", term533845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term533571;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term533479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


