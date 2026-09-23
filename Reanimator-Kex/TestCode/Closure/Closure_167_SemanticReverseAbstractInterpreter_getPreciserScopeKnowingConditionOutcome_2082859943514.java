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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140255;
     Object term140347;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140255 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term140347 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term140439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term140531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term140601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term140347, term140347.getClass(), "type", 46);
        setIntField(term140439, term140439.getClass(), "type", 1);
        setField(term140439, term140439.getClass(), "jsType", term140531);
        setField(term140347, term140347.getClass(), "first", term140439);
        setIntField(term140601, term140601.getClass(), "type", -16386);
        setField(term140601, term140601.getClass(), "jsType", term140699);
        setField(term140347, term140347.getClass(), "last", term140601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term140347;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term140255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


