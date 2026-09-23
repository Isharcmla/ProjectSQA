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
import java.lang.Integer;

public class ChecksumCalculatingInputStream_read_8388277539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term15;
     Object term20;
     Object term22;

    public ChecksumCalculatingInputStream_read_8388277539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        setField(term14, term14.getClass(), "in", null);
        setField(term14, term14.getClass(), "checksum", null);
        term15 = (byte[]) newByteArray(4);
        setByteElement(term15, 0, (byte) -58);
        setByteElement(term15, 1, (byte) -29);
        setByteElement(term15, 2, (byte) -54);
        setByteElement(term15, 3, (byte) -10);
        term20 = new Integer(568599855);
        term22 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term15;
        args[1] = term20;
        args[2] = term22;
        try {
            callMethod(klass, "read", argTypes, term14, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


