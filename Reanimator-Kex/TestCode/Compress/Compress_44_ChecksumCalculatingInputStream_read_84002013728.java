package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_84002013728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4683;
     Object term4534;

    public ChecksumCalculatingInputStream_read_84002013728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4683 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term4803 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term4683, term4683.getClass(), "in", term4803);
        term4534 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4534;
        try {
            callMethod(klass, "read", argTypes, term4683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


