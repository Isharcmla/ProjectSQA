package org.mockito.internal.matchers;

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
import static org.mockito.internal.matchers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.matchers.EqualityUtils.*;
import java.lang.Object;

public class Same_appendQuoting_6809030817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public Same_appendQuoting_6809030817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.mockito.internal.matchers.Same"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        setField(term7, term7.getClass(), "wanted", term8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.matchers.Same");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Description");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendQuoting", argTypes, term7, args);
    }

};


