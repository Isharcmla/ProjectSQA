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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489238;
     Object term489330;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489238 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term489330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term489422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term489518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term489610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term489716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term489330, term489330.getClass(), "type", 46);
        setIntField(term489422, term489422.getClass(), "type", 46);
        setField(term489422, term489422.getClass(), "jsType", term489518);
        setField(term489330, term489330.getClass(), "first", term489422);
        setIntField(term489610, term489610.getClass(), "type", -1073758255);
        setField(term489610, term489610.getClass(), "jsType", term489716);
        setField(term489330, term489330.getClass(), "last", term489610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term489330;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term489238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


