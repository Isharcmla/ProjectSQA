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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177724;
     Object term177940;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177724 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term177870 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$4"));
        setField(term177724, term177724.getClass(), "INEQ", term177870);
        term177940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term178180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term177940, term177940.getClass(), "type", 16);
        setIntField(term178010, term178010.getClass(), "type", -560024498);
        setField(term178010, term178010.getClass(), "jsType", term178110);
        setField(term177940, term177940.getClass(), "first", term178010);
        setIntField(term178180, term178180.getClass(), "type", 16);
        setField(term178180, term178180.getClass(), "jsType", term178274);
        setField(term177940, term177940.getClass(), "last", term178180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term177940;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term177724, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


