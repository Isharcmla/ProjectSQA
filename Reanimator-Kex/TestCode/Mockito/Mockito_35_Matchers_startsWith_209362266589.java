package org.mockito;

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
import static org.mockito.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.EqualityUtils.*;

public class Matchers_startsWith_209362266589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338;

    public Matchers_startsWith_209362266589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338 = newInstance(Class.forName("org.mockito.internal.matchers.StartsWith"));
        setField(term338, term338.getClass(), "prefix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Matchers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "startsWith", argTypes, null, args);
        assertTrue(recursiveEquals(null, term338));
    }

};


