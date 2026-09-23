package org.mockito.internal.verification;

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
import static org.mockito.internal.verification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VerificationOverTimeImpl_getPollingPeriod_17320038576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3011;

    public VerificationOverTimeImpl_getPollingPeriod_17320038576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3011 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term3015 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term3011, term3011.getClass(), "pollingPeriodMillis", -4365849114644724155L);
        setLongField(term3011, term3011.getClass(), "durationMillis", 2486810210675247493L);
        setField(term3011, term3011.getClass(), "delegate", null);
        setBooleanField(term3011, term3011.getClass(), "returnOnSuccess", true);
        setLongField(term3015, term3015.getClass(), "durationMillis", 7009926388951271268L);
        setLongField(term3015, term3015.getClass(), "startTime", -7672528020740371001L);
        setField(term3011, term3011.getClass(), "timer", term3015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPollingPeriod", argTypes, term3011, args);
    }

};


