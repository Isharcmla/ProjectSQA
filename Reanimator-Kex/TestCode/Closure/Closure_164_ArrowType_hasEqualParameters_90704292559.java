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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_hasEqualParameters_90704292559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13330;
     Object term13608;

    public ArrowType_hasEqualParameters_90704292559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term13422, term13422.getClass(), "first", term13746);
        setField(term13330, term13330.getClass(), "parameters", term13422);
        term13608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term13700, term13700.getClass(), "first", term13746);
        setField(term13608, term13608.getClass(), "parameters", term13700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term13608;
        callMethod(klass, "hasEqualParameters", argTypes, term13330, args);
    }

};


