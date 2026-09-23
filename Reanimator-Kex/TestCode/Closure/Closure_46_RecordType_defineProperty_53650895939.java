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

public class RecordType_defineProperty_53650895939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5600;
     Object term5812;

    public RecordType_defineProperty_53650895939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term5600, term5600.getClass(), "isFrozen", true);
        term5812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term5812, term5812.getClass(), "properties", null);
        setBooleanField(term5812, term5812.getClass(), "isFrozen", true);
        setField(term5812, term5812.getClass(), "className", null);
        setField(term5812, term5812.getClass(), "properties", null);
        setBooleanField(term5812, term5812.getClass(), "nativeType", false);
        setField(term5812, term5812.getClass(), "implicitPrototypeFallback", null);
        setField(term5812, term5812.getClass(), "ownerFunction", null);
        setBooleanField(term5812, term5812.getClass(), "prettyPrint", false);
        setBooleanField(term5812, term5812.getClass(), "visited", false);
        setField(term5812, term5812.getClass(), "docInfo", null);
        setBooleanField(term5812, term5812.getClass(), "unknown", false);
        setBooleanField(term5812, term5812.getClass(), "resolved", false);
        setField(term5812, term5812.getClass(), "resolveResult", null);
        setField(term5812, term5812.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term5600, args);
        assertTrue(recursiveEquals(term5600, term5812));
        assertTrue(recursiveEquals(retValue, false));
    }

};


