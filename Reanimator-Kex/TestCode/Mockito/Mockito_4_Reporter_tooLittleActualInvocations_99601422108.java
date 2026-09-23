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

public class Reporter_tooLittleActualInvocations_99601422108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3377;
     Object term3378;

    public Reporter_tooLittleActualInvocations_99601422108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3377 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3378 = newInstance(Class.forName("org.mockito.internal.reporting.Discrepancy"));
        setIntField(term3378, term3378.getClass(), "wantedCount", 1725571209);
        setIntField(term3378, term3378.getClass(), "actualCount", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mockito.internal.reporting.Discrepancy");
        argTypes[1] = Class.forName("org.mockito.invocation.DescribedInvocation");
        argTypes[2] = Class.forName("org.mockito.invocation.Location");
        Object[] args = new Object[3];
        args[0] = term3378;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "tooLittleActualInvocations", argTypes, term3377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


