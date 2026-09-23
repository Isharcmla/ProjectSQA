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

public class Reporter_createWantedButNotInvokedMessage_178437800101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;

    public Reporter_createWantedButNotInvokedMessage_178437800101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3355 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.invocation.DescribedInvocation");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createWantedButNotInvokedMessage", argTypes, term3355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


