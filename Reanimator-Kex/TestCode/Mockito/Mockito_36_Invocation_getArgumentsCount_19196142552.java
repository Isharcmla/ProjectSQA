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

public class Invocation_getArgumentsCount_19196142552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7010;

    public Invocation_getArgumentsCount_19196142552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7010 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7012 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7013 = (Object[]) newArray("java.lang.Object", 1);
        Object term7014 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7015 = (Object[]) newArray("java.lang.Object", 5);
        Object term7016 = newInstance(Class.forName("java.lang.Object"));
        Object term7017 = newInstance(Class.forName("java.lang.Object"));
        Object term7018 = newInstance(Class.forName("java.lang.Object"));
        Object term7019 = newInstance(Class.forName("java.lang.Object"));
        Object term7020 = newInstance(Class.forName("java.lang.Object"));
        Object term7021 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7010, term7010.getClass(), "sequenceNumber", -6029667);
        setField(term7010, term7010.getClass(), "mock", term7012);
        setField(term7010, term7010.getClass(), "method", null);
        setElement(term7013, 0, term7014);
        setField(term7010, term7010.getClass(), "arguments", term7013);
        setElement(term7015, 0, term7016);
        setElement(term7015, 1, term7017);
        setElement(term7015, 2, term7018);
        setElement(term7015, 3, term7019);
        setElement(term7015, 4, term7020);
        setField(term7010, term7010.getClass(), "rawArguments", term7015);
        setField(term7021, term7021.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7010, term7010.getClass(), "location", term7021);
        setBooleanField(term7010, term7010.getClass(), "verified", true);
        setBooleanField(term7010, term7010.getClass(), "verifiedInOrder", true);
        setField(term7010, term7010.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArgumentsCount", argTypes, term7010, args);
    }

};


