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

public class PrototypeObjectType_matchesStringContext_204382917886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11412;
     Object term11505;

    public PrototypeObjectType_matchesStringContext_204382917886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term11412, term11412.getClass(), "nativeType", true);
        term11505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term11505, term11505.getClass(), "className", null);
        setField(term11505, term11505.getClass(), "properties", null);
        setBooleanField(term11505, term11505.getClass(), "nativeType", true);
        setField(term11505, term11505.getClass(), "implicitPrototypeFallback", null);
        setField(term11505, term11505.getClass(), "ownerFunction", null);
        setBooleanField(term11505, term11505.getClass(), "prettyPrint", false);
        setBooleanField(term11505, term11505.getClass(), "visited", false);
        setField(term11505, term11505.getClass(), "docInfo", null);
        setBooleanField(term11505, term11505.getClass(), "unknown", false);
        setBooleanField(term11505, term11505.getClass(), "resolved", false);
        setField(term11505, term11505.getClass(), "resolveResult", null);
        setField(term11505, term11505.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesStringContext", argTypes, term11412, args);
        assertTrue(recursiveEquals(term11412, term11505));
        assertTrue(recursiveEquals(retValue, false));
    }

};


