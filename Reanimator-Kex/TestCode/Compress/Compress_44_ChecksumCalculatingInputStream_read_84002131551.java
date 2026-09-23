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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_84002131551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10954;
     Object term11536;

    public ChecksumCalculatingInputStream_read_84002131551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10954 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term11002 = newInstance(Class.forName("java.io.InputStream$1"));
        setField(term10954, term10954.getClass(), "in", term11002);
        term11536 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term11537 = newInstance(Class.forName("java.io.InputStream$1"));
        setBooleanField(term11537, term11537.getClass(), "closed", false);
        setField(term11536, term11536.getClass(), "in", term11537);
        setField(term11536, term11536.getClass(), "checksum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term10954, args);
        assertTrue(recursiveEquals(term10954, term11536));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


