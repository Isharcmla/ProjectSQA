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

public class Reporter_createTooLittleInvocationsMessage_449139082107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373;
     Object term3374;

    public Reporter_createTooLittleInvocationsMessage_449139082107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3374 = newInstance(Class.forName("org.mockito.internal.reporting.Discrepancy"));
        setIntField(term3374, term3374.getClass(), "wantedCount", 1227103734);
        setIntField(term3374, term3374.getClass(), "actualCount", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mockito.internal.reporting.Discrepancy");
        argTypes[1] = Class.forName("org.mockito.invocation.DescribedInvocation");
        argTypes[2] = Class.forName("org.mockito.invocation.Location");
        Object[] args = new Object[3];
        args[0] = term3374;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "createTooLittleInvocationsMessage", argTypes, term3373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


