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
import java.util.HashMap;
import java.lang.Object;

public class ProcessClosurePrimitives_process_1779090349113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46750;
     Object term46868;

    public ProcessClosurePrimitives_process_1779090349113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46798 = new HashMap();
        term46750 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term46750, term46750.getClass(), "compiler", null);
        setBooleanField(term46750, term46750.getClass(), "rewriteNewDateGoogNow", false);
        setField(term46750, term46750.getClass(), "providedNames", term46798);
        term46868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46868, term46868.getClass(), "type", 30);
        setField(term46938, term46938.getClass(), "next", null);
        setIntField(term46938, term46938.getClass(), "type", 0);
        setField(term46938, term46938.getClass(), "first", null);
        setField(term46868, term46868.getClass(), "first", term46938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46868;
        callMethod(klass, "process", argTypes, term46750, args);
    }

};


