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

public class FunctionInjector_inlineReturnValue_211698033173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16159;
     Object term16251;
     Object term16567;

    public FunctionInjector_inlineReturnValue_211698033173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16159 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term16159, term16159.getClass(), "safeNameIdSupplier", null);
        term16251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term16567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16521 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term16251, term16251.getClass(), "parent", null);
        setField(term16567, term16567.getClass(), "last", null);
        setField(term16567, term16567.getClass(), "next", term16602);
        setField(term16251, term16251.getClass(), "first", term16567);
        setIntField(term16251, term16251.getClass(), "type", 0);
        setField(term16251, term16251.getClass(), "propListHead", term16521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16251;
        args[1] = term16567;
        callMethod(klass, "inlineReturnValue", argTypes, term16159, args);
    }

};


