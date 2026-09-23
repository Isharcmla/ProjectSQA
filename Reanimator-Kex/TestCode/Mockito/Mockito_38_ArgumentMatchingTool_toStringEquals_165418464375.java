package org.mockito.internal.verification.argumentmatching;

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
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArgumentMatchingTool_toStringEquals_165418464375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42768;
     Object term42824;

    public ArgumentMatchingTool_toStringEquals_165418464375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42768 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term42824 = newInstance(Class.forName("org.hamcrest.core.IsEqual"));
        Object term42854 = newInstance(Class.forName("java.lang.StackTraceElement"));
        setField(term42824, term42824.getClass(), "object", term42854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term42824;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term42768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


