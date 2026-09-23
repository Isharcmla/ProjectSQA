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

public class ChecksumCalculatingInputStream_read_84002131545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8715;
     Object term10254;

    public ChecksumCalculatingInputStream_read_84002131545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8715 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term8763 = newInstance(Class.forName("java.io.InputStream$1"));
        setField(term8715, term8715.getClass(), "in", term8763);
        term10254 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term10255 = newInstance(Class.forName("java.io.InputStream$1"));
        setBooleanField(term10255, term10255.getClass(), "closed", false);
        setField(term10254, term10254.getClass(), "in", term10255);
        setField(term10254, term10254.getClass(), "checksum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term8715, args);
        assertTrue(recursiveEquals(term8715, term10254));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


