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
import java.lang.Boolean;

public class RecordType_defineProperty_53650895925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2202;
     Object term2211;

    public RecordType_defineProperty_53650895925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2202, term2202.getClass(), "properties", null);
        setBooleanField(term2202, term2202.getClass(), "declared", false);
        setBooleanField(term2202, term2202.getClass(), "isFrozen", false);
        setField(term2202, term2202.getClass(), "className", null);
        setField(term2202, term2202.getClass(), "properties", null);
        setBooleanField(term2202, term2202.getClass(), "nativeType", false);
        setField(term2202, term2202.getClass(), "implicitPrototypeFallback", null);
        setField(term2202, term2202.getClass(), "ownerFunction", null);
        setBooleanField(term2202, term2202.getClass(), "prettyPrint", false);
        setBooleanField(term2202, term2202.getClass(), "visited", false);
        setField(term2202, term2202.getClass(), "docInfo", null);
        setBooleanField(term2202, term2202.getClass(), "unknown", false);
        setBooleanField(term2202, term2202.getClass(), "resolved", false);
        setField(term2202, term2202.getClass(), "resolveResult", null);
        setBooleanField(term2202, term2202.getClass(), "inTemplatedCheckVisit", false);
        setField(term2202, term2202.getClass(), "registry", null);
        term2211 = new Boolean(false);
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
        args[2] = term2211;
        args[3] = null;
        try {
            callMethod(klass, "defineProperty", argTypes, term2202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


