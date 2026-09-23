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

public class RecordType_defineProperty_53650895932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4406;
     Object term4419;

    public RecordType_defineProperty_53650895932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term4406, term4406.getClass(), "isFrozen", true);
        term4419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term4419, term4419.getClass(), "properties", null);
        setBooleanField(term4419, term4419.getClass(), "declared", false);
        setBooleanField(term4419, term4419.getClass(), "isFrozen", true);
        setField(term4419, term4419.getClass(), "className", null);
        setField(term4419, term4419.getClass(), "properties", null);
        setBooleanField(term4419, term4419.getClass(), "nativeType", false);
        setField(term4419, term4419.getClass(), "implicitPrototypeFallback", null);
        setField(term4419, term4419.getClass(), "ownerFunction", null);
        setBooleanField(term4419, term4419.getClass(), "prettyPrint", false);
        setBooleanField(term4419, term4419.getClass(), "visited", false);
        setField(term4419, term4419.getClass(), "docInfo", null);
        setBooleanField(term4419, term4419.getClass(), "unknown", false);
        setBooleanField(term4419, term4419.getClass(), "resolved", false);
        setField(term4419, term4419.getClass(), "resolveResult", null);
        setBooleanField(term4419, term4419.getClass(), "inTemplatedCheckVisit", false);
        setField(term4419, term4419.getClass(), "registry", null);
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
        Object retValue = callMethod(klass, "defineProperty", argTypes, term4406, args);
        assertTrue(recursiveEquals(term4406, term4419));
        assertTrue(recursiveEquals(retValue, false));
    }

};


