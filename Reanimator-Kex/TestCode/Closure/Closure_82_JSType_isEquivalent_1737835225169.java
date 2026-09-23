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

public class JSType_isEquivalent_1737835225169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21640;
     Object term22082;

    public JSType_isEquivalent_1737835225169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term22082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term22082, term22082.getClass(), "properties", null);
        setBooleanField(term22082, term22082.getClass(), "isFrozen", false);
        setField(term22082, term22082.getClass(), "className", null);
        setField(term22082, term22082.getClass(), "properties", null);
        setBooleanField(term22082, term22082.getClass(), "nativeType", false);
        setField(term22082, term22082.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term22082, term22082.getClass(), "prettyPrint", false);
        setBooleanField(term22082, term22082.getClass(), "visited", false);
        setField(term22082, term22082.getClass(), "docInfo", null);
        setBooleanField(term22082, term22082.getClass(), "unknown", false);
        setBooleanField(term22082, term22082.getClass(), "resolved", false);
        setField(term22082, term22082.getClass(), "resolveResult", null);
        setField(term22082, term22082.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term21640;
        args[1] = null;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term21640, term22082));
        assertTrue(recursiveEquals(retValue, false));
    }

};


