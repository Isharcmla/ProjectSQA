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
import java.lang.NullPointerException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_printMethodReturnType_150558841548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6264;

    public Invocation_printMethodReturnType_150558841548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6264 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term6266 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6267 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term6268 = (Object[]) newArray("java.lang.Object", 7);
        Object term6269 = newInstance(Class.forName("java.lang.Object"));
        Object term6270 = newInstance(Class.forName("java.lang.Object"));
        Object term6271 = newInstance(Class.forName("java.lang.Object"));
        Object term6272 = newInstance(Class.forName("java.lang.Object"));
        Object term6273 = newInstance(Class.forName("java.lang.Object"));
        Object term6274 = newInstance(Class.forName("java.lang.Object"));
        Object term6275 = newInstance(Class.forName("java.lang.Object"));
        Object term6276 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term6264, term6264.getClass(), "sequenceNumber", -1456670397);
        setField(term6264, term6264.getClass(), "mock", term6266);
        setField(term6264, term6264.getClass(), "method", null);
        setField(term6264, term6264.getClass(), "arguments", term6267);
        setElement(term6268, 0, term6269);
        setElement(term6268, 1, term6270);
        setElement(term6268, 2, term6271);
        setElement(term6268, 3, term6272);
        setElement(term6268, 4, term6273);
        setElement(term6268, 5, term6274);
        setElement(term6268, 6, term6275);
        setField(term6264, term6264.getClass(), "rawArguments", term6268);
        setField(term6276, term6276.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term6264, term6264.getClass(), "location", term6276);
        setBooleanField(term6264, term6264.getClass(), "verified", false);
        setBooleanField(term6264, term6264.getClass(), "verifiedInOrder", true);
        setField(term6264, term6264.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "printMethodReturnType", argTypes, term6264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


