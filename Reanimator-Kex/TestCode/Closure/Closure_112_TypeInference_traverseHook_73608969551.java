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

public class TypeInference_traverseHook_73608969551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3106074;
     Object term3106144;

    public TypeInference_traverseHook_73608969551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3106074 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term3106144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3106214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3106284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3106354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3106214, term3106214.getClass(), "next", term3106284);
        setIntField(term3106214, term3106214.getClass(), "type", 139);
        setField(term3106144, term3106144.getClass(), "first", term3106214);
        setField(term3106144, term3106144.getClass(), "last", term3106354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3106144;
        args[1] = null;
        callMethod(klass, "traverseHook", argTypes, term3106074, args);
    }

};


