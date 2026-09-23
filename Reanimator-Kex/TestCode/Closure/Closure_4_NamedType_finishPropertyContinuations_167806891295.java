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
import java.lang.Object;

public class NamedType_finishPropertyContinuations_167806891295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93350;

    public NamedType_finishPropertyContinuations_167806891295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term93450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term93558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term93450, term93450.getClass(), "unknown", true);
        setField(term93450, term93450.getClass(), "implicitPrototypeFallback", null);
        setField(term93450, term93450.getClass(), "ownerFunction", term93558);
        setField(term93350, term93350.getClass(), "referencedObjType", term93450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finishPropertyContinuations", argTypes, term93350, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


