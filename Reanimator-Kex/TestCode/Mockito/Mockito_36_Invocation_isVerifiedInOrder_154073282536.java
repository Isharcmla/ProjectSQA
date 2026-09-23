package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.invocation.EqualityUtils.*;
import java.lang.Object;

public class Invocation_isVerifiedInOrder_154073282536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1046;

    public Invocation_isVerifiedInOrder_154073282536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1046 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1048 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1049 = (Object[]) newArray("java.lang.Object", 5);
        Object term1050 = newInstance(Class.forName("java.lang.Object"));
        Object term1051 = newInstance(Class.forName("java.lang.Object"));
        Object term1052 = newInstance(Class.forName("java.lang.Object"));
        Object term1053 = newInstance(Class.forName("java.lang.Object"));
        Object term1054 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1055 = (Object[]) newArray("java.lang.Object", 2);
        Object term1056 = newInstance(Class.forName("java.lang.Object"));
        Object term1057 = newInstance(Class.forName("java.lang.Object"));
        Object term1058 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term1046, term1046.getClass(), "sequenceNumber", -1955890973);
        setField(term1046, term1046.getClass(), "mock", term1048);
        setField(term1046, term1046.getClass(), "method", null);
        setElement(term1049, 0, term1050);
        setElement(term1049, 1, term1051);
        setElement(term1049, 2, term1052);
        setElement(term1049, 3, term1053);
        setElement(term1049, 4, term1054);
        setField(term1046, term1046.getClass(), "arguments", term1049);
        setElement(term1055, 0, term1056);
        setElement(term1055, 1, term1057);
        setField(term1046, term1046.getClass(), "rawArguments", term1055);
        setField(term1058, term1058.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1046, term1046.getClass(), "location", term1058);
        setBooleanField(term1046, term1046.getClass(), "verified", true);
        setBooleanField(term1046, term1046.getClass(), "verifiedInOrder", false);
        setField(term1046, term1046.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVerifiedInOrder", argTypes, term1046, args);
    }

};


