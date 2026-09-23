package org.mockito.exceptions;

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
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Reporter_tooManyActualInvocationsInOrder_1209003556106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;
     Object term3369;
     Object term3371;

    public Reporter_tooManyActualInvocationsInOrder_1209003556106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3368 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3369 = new Integer(-1955890973);
        term3371 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.mockito.invocation.DescribedInvocation");
        argTypes[3] = Class.forName("org.mockito.invocation.Location");
        Object[] args = new Object[4];
        args[0] = term3369;
        args[1] = term3371;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "tooManyActualInvocationsInOrder", argTypes, term3368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


