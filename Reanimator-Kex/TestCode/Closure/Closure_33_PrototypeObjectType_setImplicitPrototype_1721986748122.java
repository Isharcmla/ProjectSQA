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

public class PrototypeObjectType_setImplicitPrototype_1721986748122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15201;
     Object term40680;

    public PrototypeObjectType_setImplicitPrototype_1721986748122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term15201, term15201.getClass(), "unknown", true);
        term40680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term40680, term40680.getClass(), "className", null);
        setField(term40680, term40680.getClass(), "properties", null);
        setBooleanField(term40680, term40680.getClass(), "nativeType", false);
        setField(term40680, term40680.getClass(), "implicitPrototypeFallback", null);
        setField(term40680, term40680.getClass(), "ownerFunction", null);
        setBooleanField(term40680, term40680.getClass(), "prettyPrint", false);
        setBooleanField(term40680, term40680.getClass(), "visited", false);
        setField(term40680, term40680.getClass(), "docInfo", null);
        setBooleanField(term40680, term40680.getClass(), "unknown", true);
        setBooleanField(term40680, term40680.getClass(), "resolved", false);
        setField(term40680, term40680.getClass(), "resolveResult", null);
        setField(term40680, term40680.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImplicitPrototype", argTypes, term15201, args);
        assertTrue(recursiveEquals(term15201, term40680));
    }

};


