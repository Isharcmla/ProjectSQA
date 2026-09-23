package com.google.javascript.rhino.jstype;

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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NamedType_setReferencedAndResolvedType_1015513490297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94059;
     Object term94261;

    public NamedType_setReferencedAndResolvedType_1015513490297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term94167 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNodeType"));
        setField(term94059, term94059.getClass(), "validator", term94167);
        term94261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term94261;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setReferencedAndResolvedType", argTypes, term94059, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


