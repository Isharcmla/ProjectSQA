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
import java.lang.Boolean;

public class VerificationOverTimeImpl_init_8964455551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object term11;
     Object term13;

    public VerificationOverTimeImpl_init_8964455551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Long(-8257434502486459194L);
        term9 = new Long(-8400487765614892086L);
        term11 = new Boolean(false);
        term13 = newInstance(Class.forName("org.mockito.internal.util.Timer"));
        setLongField(term13, term13.getClass(), "durationMillis", 5270370404989704783L);
        setLongField(term13, term13.getClass(), "startTime", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.mockito.verification.VerificationMode");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("org.mockito.internal.util.Timer");
        Object[] args = new Object[5];
        args[0] = term7;
        args[1] = term9;
        args[2] = null;
        args[3] = term11;
        args[4] = term13;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


