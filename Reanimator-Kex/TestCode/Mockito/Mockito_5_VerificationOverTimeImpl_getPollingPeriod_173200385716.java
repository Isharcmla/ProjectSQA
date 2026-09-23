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

public class VerificationOverTimeImpl_getPollingPeriod_173200385716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5830;

    public VerificationOverTimeImpl_getPollingPeriod_173200385716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5830 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        setLongField(term5830, term5830.getClass(), "pollingPeriodMillis", 0L);
        setLongField(term5830, term5830.getClass(), "durationMillis", 0L);
        setField(term5830, term5830.getClass(), "delegate", null);
        setBooleanField(term5830, term5830.getClass(), "returnOnSuccess", false);
        setField(term5830, term5830.getClass(), "timer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPollingPeriod", argTypes, term5830, args);
    }

};


