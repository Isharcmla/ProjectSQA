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
import static org.mockito.internal.verification.EqualityUtils.*;
import java.lang.Object;

public class VerificationOverTimeImpl_canRecoverFromFailure_53679405113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2995;

    public VerificationOverTimeImpl_canRecoverFromFailure_53679405113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2995 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term2999 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term2995, term2995.getClass(), "pollingPeriodMillis", -5476826692763582090L);
        setLongField(term2995, term2995.getClass(), "durationMillis", -872011222785455006L);
        setField(term2995, term2995.getClass(), "delegate", null);
        setBooleanField(term2995, term2995.getClass(), "returnOnSuccess", true);
        setLongField(term2999, term2999.getClass(), "durationMillis", -316468845751588286L);
        setLongField(term2999, term2999.getClass(), "startTime", 5127676408959197577L);
        setField(term2995, term2995.getClass(), "timer", term2999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.verification.VerificationMode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canRecoverFromFailure", argTypes, term2995, args);
    }

};


