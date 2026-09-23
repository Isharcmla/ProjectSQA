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

public class TypeCheck_visit_859524784450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110522;
     Object term110592;

    public TypeCheck_visit_859524784450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110522 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term110592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term110592, term110592.getClass(), "type", 52);
        setField(term110592, term110592.getClass(), "first", null);
        setField(term110662, term110662.getClass(), "jsType", term110766);
        setField(term110592, term110592.getClass(), "last", term110662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term110592;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term110522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


