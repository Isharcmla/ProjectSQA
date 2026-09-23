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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class JSType_safeResolve_2136838325174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22070;
     Object term22966;
     Object term22960;

    public JSType_safeResolve_2136838325174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term22966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term22966, term22966.getClass(), "resolved", true);
        setField(term22966, term22966.getClass(), "resolveResult", term22966);
        setField(term22966, term22966.getClass(), "registry", null);
        term22960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term22960, term22960.getClass(), "resolved", true);
        setField(term22960, term22960.getClass(), "resolveResult", term22960);
        setField(term22960, term22960.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term22070;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term22070, term22966));
        assertTrue(recursiveEquals(retValue, term22960));
    }

};


