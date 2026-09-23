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

public class VerificationOverTimeImpl_verify_88511319611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;

    public VerificationOverTimeImpl_verify_88511319611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        Object term20 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term16, term16.getClass(), "pollingPeriodMillis", 4872422362414183754L);
        setLongField(term16, term16.getClass(), "durationMillis", 6811161968424632369L);
        setField(term16, term16.getClass(), "delegate", null);
        setBooleanField(term16, term16.getClass(), "returnOnSuccess", false);
        setLongField(term20, term20.getClass(), "durationMillis", -7237588299778557629L);
        setLongField(term20, term20.getClass(), "startTime", 6967924379644551255L);
        setField(term16, term16.getClass(), "timer", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.verification.api.VerificationData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "verify", argTypes, term16, args);
    }

};


