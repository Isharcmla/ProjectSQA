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

public class Invocation_getRawArguments_199738991353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7196;

    public Invocation_getRawArguments_199738991353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7196 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7198 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7199 = (Object[]) newArray("java.lang.Object", 1);
        Object term7200 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7201 = (Object[]) newArray("java.lang.Object", 9);
        Object term7202 = newInstance(Class.forName("java.lang.Object"));
        Object term7203 = newInstance(Class.forName("java.lang.Object"));
        Object term7204 = newInstance(Class.forName("java.lang.Object"));
        Object term7205 = newInstance(Class.forName("java.lang.Object"));
        Object term7206 = newInstance(Class.forName("java.lang.Object"));
        Object term7207 = newInstance(Class.forName("java.lang.Object"));
        Object term7208 = newInstance(Class.forName("java.lang.Object"));
        Object term7209 = newInstance(Class.forName("java.lang.Object"));
        Object term7210 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7196, term7196.getClass(), "sequenceNumber", -2068769794);
        setField(term7196, term7196.getClass(), "mock", term7198);
        setField(term7196, term7196.getClass(), "method", null);
        setElement(term7199, 0, term7200);
        setField(term7196, term7196.getClass(), "arguments", term7199);
        setElement(term7201, 0, term7202);
        setElement(term7201, 1, term7203);
        setElement(term7201, 2, term7204);
        setElement(term7201, 3, term7205);
        setElement(term7201, 4, term7206);
        setElement(term7201, 5, term7207);
        setElement(term7201, 6, term7208);
        setElement(term7201, 7, term7209);
        setElement(term7201, 8, term7207);
        setField(term7196, term7196.getClass(), "rawArguments", term7201);
        setField(term7210, term7210.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7196, term7196.getClass(), "location", term7210);
        setBooleanField(term7196, term7196.getClass(), "verified", false);
        setBooleanField(term7196, term7196.getClass(), "verifiedInOrder", true);
        setField(term7196, term7196.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawArguments", argTypes, term7196, args);
    }

};


