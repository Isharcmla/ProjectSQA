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
import java.lang.Long;

public class VerificationOverTimeImpl_sleep_124273703815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5824;
     Object term5828;

    public VerificationOverTimeImpl_sleep_124273703815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5824 = newInstance(Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl"));
        setLongField(term5824, term5824.getClass(), "pollingPeriodMillis", 0L);
        setLongField(term5824, term5824.getClass(), "durationMillis", 0L);
        setField(term5824, term5824.getClass(), "delegate", null);
        setBooleanField(term5824, term5824.getClass(), "returnOnSuccess", false);
        setField(term5824, term5824.getClass(), "timer", null);
        term5828 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5828;
        callMethod(klass, "sleep", argTypes, term5824, args);
    }

};


