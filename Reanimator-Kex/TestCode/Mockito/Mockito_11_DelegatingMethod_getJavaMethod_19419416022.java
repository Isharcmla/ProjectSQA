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
import java.lang.String;
import java.lang.Object;

public class DelegatingMethod_getJavaMethod_19419416022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;

    public DelegatingMethod_getJavaMethod_19419416022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1075 = Class.forName((String) "org.mockito.asm.util.TraceSignatureVisitor");
        Object[] term1292 = (Object[]) newArray("java.lang.Class", 0);
        Method term882 = ((Class) term1075).getDeclaredMethod((String) "visitParameterType", (Class[]) term1292);
        ((Method) term882).setAccessible(true);
        term881 = newInstance(Class.forName("org.mockito.internal.creation.DelegatingMethod"));
        setField(term881, term881.getClass(), "method", term882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.DelegatingMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJavaMethod", argTypes, term881, args);
    }

};


