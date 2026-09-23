package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_check_233062943247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110351;
     Object term110681;

    public TypeCheck_check_233062943247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110351 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term110431 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term110537 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term110611 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term110351, term110351.getClass(), "compiler", term110431);
        setField(term110351, term110351.getClass(), "scopeCreator", term110537);
        setBooleanField(term110351, term110351.getClass(), "inExterns", false);
        setField(term110611, term110611.getClass(), "parent", null);
        setField(term110351, term110351.getClass(), "topScope", term110611);
        term110681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110681, term110681.getClass(), "type", 0);
        setField(term110821, term110821.getClass(), "next", term110891);
        setIntField(term110821, term110821.getClass(), "type", 149);
        setField(term110821, term110821.getClass(), "first", null);
        setField(term110751, term110751.getClass(), "next", term110821);
        setIntField(term110751, term110751.getClass(), "type", 130);
        setField(term110751, term110751.getClass(), "first", null);
        setField(term110681, term110681.getClass(), "first", term110751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term110681;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term110351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


