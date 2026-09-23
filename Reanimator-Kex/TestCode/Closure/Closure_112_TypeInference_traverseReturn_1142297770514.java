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

public class TypeInference_traverseReturn_1142297770514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935929;
     Object term2935999;

    public TypeInference_traverseReturn_1142297770514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2935929 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2935999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2936069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2936139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2936069, term2936069.getClass(), "type", -344842608);
        setIntField(term2936139, term2936139.getClass(), "type", 111);
        setField(term2936069, term2936069.getClass(), "next", term2936139);
        setField(term2935999, term2935999.getClass(), "first", term2936069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2935999;
        args[1] = null;
        callMethod(klass, "traverseReturn", argTypes, term2935929, args);
    }

};


