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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154916;
     Object term155232;

    public FunctionBuilder_copyFromOtherFunction_842235135221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term155024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term154916, term154916.getClass(), "name", "");
        setField(term154916, term154916.getClass(), "sourceNode", term155024);
        setField(term154916, term154916.getClass(), "parametersNode", null);
        setField(term154916, term154916.getClass(), "returnType", term155124);
        term155232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term155364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term155434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term155628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term155732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term155232, term155232.getClass(), "className", "");
        setField(term155232, term155232.getClass(), "source", null);
        setField(term155364, term155364.getClass(), "parameters", term155434);
        setField(term155364, term155364.getClass(), "returnType", term155528);
        setField(term155232, term155232.getClass(), "call", term155364);
        setField(term155232, term155232.getClass(), "typeOfThis", term155628);
        setField(term155232, term155232.getClass(), "registry", term155732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term155232;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term154916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


