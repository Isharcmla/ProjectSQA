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

public class VerificationOverTimeImpl_getDuration_8131317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3018;

    public VerificationOverTimeImpl_getDuration_8131317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3018 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term3022 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term3018, term3018.getClass(), "pollingPeriodMillis", -4502405999831680926L);
        setLongField(term3018, term3018.getClass(), "durationMillis", 1967728129628047933L);
        setField(term3018, term3018.getClass(), "delegate", null);
        setBooleanField(term3018, term3018.getClass(), "returnOnSuccess", true);
        setLongField(term3022, term3022.getClass(), "durationMillis", 2120084523938730454L);
        setLongField(term3022, term3022.getClass(), "startTime", 6855071767938501807L);
        setField(term3018, term3018.getClass(), "timer", term3022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term3018, args);
    }

};


