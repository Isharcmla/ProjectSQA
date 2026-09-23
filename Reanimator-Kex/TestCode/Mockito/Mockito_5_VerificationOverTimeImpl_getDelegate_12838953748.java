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

public class VerificationOverTimeImpl_getDelegate_12838953748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025;

    public VerificationOverTimeImpl_getDelegate_12838953748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3025 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term3029 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term3025, term3025.getClass(), "pollingPeriodMillis", -5892135042702373494L);
        setLongField(term3025, term3025.getClass(), "durationMillis", 5262507301787091109L);
        setField(term3025, term3025.getClass(), "delegate", null);
        setBooleanField(term3025, term3025.getClass(), "returnOnSuccess", false);
        setLongField(term3029, term3029.getClass(), "durationMillis", -6823727938421990489L);
        setLongField(term3029, term3029.getClass(), "startTime", -484994522244390100L);
        setField(term3025, term3025.getClass(), "timer", term3029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDelegate", argTypes, term3025, args);
    }

};


