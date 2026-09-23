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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class ProcessClosurePrimitives_process_1779090349102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43346;
     Object term43544;

    public ProcessClosurePrimitives_process_1779090349102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43474 = new HashMap();
        term43346 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term43426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43346, term43346.getClass(), "compiler", term43426);
        setField(term43346, term43346.getClass(), "providedNames", term43474);
        term43544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43544, term43544.getClass(), "type", 33);
        setField(term43614, term43614.getClass(), "next", null);
        setIntField(term43614, term43614.getClass(), "type", 0);
        setField(term43614, term43614.getClass(), "first", null);
        setField(term43544, term43544.getClass(), "first", term43614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43544;
        callMethod(klass, "process", argTypes, term43346, args);
    }

};


