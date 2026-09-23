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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493888;
     Object term493980;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493888 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term493980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term494072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term494164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term494256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term494362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term493980, term493980.getClass(), "type", 45);
        setIntField(term494072, term494072.getClass(), "type", 45);
        setField(term494072, term494072.getClass(), "jsType", term494164);
        setField(term493980, term493980.getClass(), "first", term494072);
        setIntField(term494256, term494256.getClass(), "type", -1073758254);
        setField(term494256, term494256.getClass(), "jsType", term494362);
        setField(term493980, term493980.getClass(), "last", term494256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term493980;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term493888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


