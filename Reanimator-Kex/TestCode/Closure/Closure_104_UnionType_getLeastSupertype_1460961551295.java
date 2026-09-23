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
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105297;
     Object term105439;

    public UnionType_getLeastSupertype_1460961551295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term105345 = new HashSet();
        term105297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term105297, term105297.getClass(), "alternates", term105345);
        term105439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term105539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term105539, term105539.getClass(), "unknown", false);
        setField(term105439, term105439.getClass(), "referencedType", term105539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term105439;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term105297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


