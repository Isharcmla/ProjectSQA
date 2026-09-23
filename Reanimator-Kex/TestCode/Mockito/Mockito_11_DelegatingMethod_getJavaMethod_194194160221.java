package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.creation.EqualityUtils.*;

public class DelegatingMethod_getJavaMethod_194194160221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4355;

    public DelegatingMethod_getJavaMethod_194194160221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4355 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term4355, term4355.getClass(), "method", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJavaMethod", argTypes, term4355, args);
    }

};


