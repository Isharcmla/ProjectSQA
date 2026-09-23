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
import java.lang.Boolean;
import java.lang.Integer;

public class Reporter_invalidArgumentPositionRangeAtInvocationTime_2126630291141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22484;
     Object term22485;
     Object term22487;

    public Reporter_invalidArgumentPositionRangeAtInvocationTime_2126630291141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22484 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term22485 = new Boolean(false);
        term22487 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mockito.invocation.InvocationOnMock");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term22485;
        args[2] = term22487;
        try {
            callMethod(klass, "invalidArgumentPositionRangeAtInvocationTime", argTypes, term22484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


