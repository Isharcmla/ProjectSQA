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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390320;
     Object term390412;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390320 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term390412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term390504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term390610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term390702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term390796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term390412, term390412.getClass(), "type", 46);
        setIntField(term390504, term390504.getClass(), "type", 0);
        setField(term390504, term390504.getClass(), "jsType", term390610);
        setField(term390412, term390412.getClass(), "first", term390504);
        setIntField(term390702, term390702.getClass(), "type", 46);
        setField(term390702, term390702.getClass(), "jsType", term390796);
        setField(term390412, term390412.getClass(), "last", term390702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term390412;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term390320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


