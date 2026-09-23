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

public class ArrowType_init_181064513940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6776;
     Object term6900;

    public ArrowType_init_181064513940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term6618, term6618.getClass(), "resolved", false);
        setField(term6618, term6618.getClass(), "resolveResult", term6706);
        setBooleanField(term6618, term6618.getClass(), "inTemplatedCheckVisit", false);
        setField(term6618, term6618.getClass(), "registry", null);
        setField(term6618, term6618.getClass(), "parameters", null);
        term6776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term6900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term6776;
        args[2] = term6900;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


