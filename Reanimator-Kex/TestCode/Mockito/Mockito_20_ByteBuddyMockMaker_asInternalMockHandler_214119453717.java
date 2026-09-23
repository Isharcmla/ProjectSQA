package org.mockito.internal.creation.bytebuddy;

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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.internal.creation.bytebuddy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ByteBuddyMockMaker_asInternalMockHandler_214119453717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ByteBuddyMockMaker_asInternalMockHandler_214119453717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.invocation.MockHandler");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "asInternalMockHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


