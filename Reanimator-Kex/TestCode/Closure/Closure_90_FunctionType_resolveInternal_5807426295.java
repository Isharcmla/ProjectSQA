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
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185980;

    public FunctionType_resolveInternal_5807426295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term186032 = new ArrayList();
        term185980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term185980, term185980.getClass(), "resolveResult", null);
        setBooleanField(term185980, term185980.getClass(), "resolved", false);
        setField(term185980, term185980.getClass(), "call", null);
        setField(term185980, term185980.getClass(), "prototype", null);
        setField(term185980, term185980.getClass(), "typeOfThis", null);
        setField(term185980, term185980.getClass(), "implementedInterfaces", term186032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term185980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


