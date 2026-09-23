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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class X7875_NewUnix_getLocalFileDataLength_41081476955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7895;

    public X7875_NewUnix_getLocalFileDataLength_41081476955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7895 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term7941 = newInstance(Class.forName("java.math.BigInteger"));
        Object term7987 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term7895, term7895.getClass(), "uid", term7941);
        setField(term7895, term7895.getClass(), "gid", term7987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLocalFileDataLength", argTypes, term7895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


