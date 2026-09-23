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

public class Reporter_tooManyActualInvocations_1279758431103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3357;
     Object term3358;
     Object term3360;

    public Reporter_tooManyActualInvocations_1279758431103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3357 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3358 = new Integer(1484323161);
        term3360 = new Integer(391863371);
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
        args[0] = term3358;
        args[1] = term3360;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "tooManyActualInvocations", argTypes, term3357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


