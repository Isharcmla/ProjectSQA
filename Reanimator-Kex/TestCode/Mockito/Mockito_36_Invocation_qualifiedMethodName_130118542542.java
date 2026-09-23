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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_qualifiedMethodName_130118542542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2293;

    public Invocation_qualifiedMethodName_130118542542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2293 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2295 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2296 = (Object[]) newArray("java.lang.Object", 2);
        Object term2297 = newInstance(Class.forName("java.lang.Object"));
        Object term2298 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2299 = (Object[]) newArray("java.lang.Object", 3);
        Object term2300 = newInstance(Class.forName("java.lang.Object"));
        Object term2301 = newInstance(Class.forName("java.lang.Object"));
        Object term2302 = newInstance(Class.forName("java.lang.Object"));
        Object term2303 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term2293, term2293.getClass(), "sequenceNumber", 1134449235);
        setField(term2293, term2293.getClass(), "mock", term2295);
        setField(term2293, term2293.getClass(), "method", null);
        setElement(term2296, 0, term2297);
        setElement(term2296, 1, term2298);
        setField(term2293, term2293.getClass(), "arguments", term2296);
        setElement(term2299, 0, term2300);
        setElement(term2299, 1, term2301);
        setElement(term2299, 2, term2302);
        setField(term2293, term2293.getClass(), "rawArguments", term2299);
        setField(term2303, term2303.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2293, term2293.getClass(), "location", term2303);
        setBooleanField(term2293, term2293.getClass(), "verified", true);
        setBooleanField(term2293, term2293.getClass(), "verifiedInOrder", false);
        setField(term2293, term2293.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qualifiedMethodName", argTypes, term2293, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


