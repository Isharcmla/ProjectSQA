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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_matchesStringContext_2043829178111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14513;

    public PrototypeObjectType_matchesStringContext_2043829178111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14561 = new HashMap();
        ArrayList term14817 = new ArrayList();
        term14513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term14765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term14513, term14513.getClass(), "nativeType", false);
        setField(term14513, term14513.getClass(), "properties", term14561);
        setField(term14513, term14513.getClass(), "implicitPrototypeFallback", null);
        setField(term14765, term14765.getClass(), "extendedInterfaces", term14817);
        setField(term14513, term14513.getClass(), "ownerFunction", term14765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesStringContext", argTypes, term14513, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


