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

public class FunctionTypeBuilder_inferParameterTypes_212883572248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94545;
     Object term94949;

    public FunctionTypeBuilder_inferParameterTypes_212883572248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94545 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term94615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94841 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term94685, term94685.getClass(), "first", null);
        setIntField(term94685, term94685.getClass(), "type", 0);
        setField(term94685, term94685.getClass(), "parent", null);
        setIntField(term94685, term94685.getClass(), "sourcePosition", 0);
        setField(term94615, term94615.getClass(), "first", term94685);
        setField(term94545, term94545.getClass(), "parametersNode", term94615);
        setField(term94545, term94545.getClass(), "typeRegistry", null);
        setField(term94545, term94545.getClass(), "templateTypeName", "");
        setField(term94545, term94545.getClass(), "fnName", "");
        setField(term94545, term94545.getClass(), "compiler", term94841);
        setField(term94545, term94545.getClass(), "sourceName", "");
        setField(term94545, term94545.getClass(), "errorRoot", null);
        term94949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94949, term94949.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term94949;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term94545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


