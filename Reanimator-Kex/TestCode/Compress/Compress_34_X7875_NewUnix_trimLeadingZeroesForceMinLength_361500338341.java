package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class X7875_NewUnix_trimLeadingZeroesForceMinLength_361500338341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125242;
     Object term127906;
     Object term127779;

    public X7875_NewUnix_trimLeadingZeroesForceMinLength_361500338341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125242 = (byte[]) newByteArray(124);
        term127906 = (byte[]) newByteArray(124);
        term127779 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term125242;
        Object retValue = callMethod(klass, "trimLeadingZeroesForceMinLength", argTypes, null, args);
        assertTrue(recursiveEquals(term125242, term127906));
        assertTrue(recursiveEquals(retValue, term127779));
    }

};


