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

public class UnionType_getLeastSupertype_1460961551314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113141;
     Object term113545;

    public UnionType_getLeastSupertype_1460961551314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term113189 = new HashSet();
        term113141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term113445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term113141, term113141.getClass(), "alternates", term113189);
        setField(term113141, term113141.getClass(), "registry", term113445);
        term113545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term113655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term113655, term113655.getClass(), "unknown", false);
        setField(term113545, term113545.getClass(), "referencedType", term113655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term113545;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term113141, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


