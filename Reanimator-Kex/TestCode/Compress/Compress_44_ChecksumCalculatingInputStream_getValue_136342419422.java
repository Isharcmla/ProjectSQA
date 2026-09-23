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

public class ChecksumCalculatingInputStream_getValue_136342419422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3287;
     Object term3998;

    public ChecksumCalculatingInputStream_getValue_136342419422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3287 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term3331 = newInstance(Class.forName("java.util.zip.CRC32"));
        setField(term3287, term3287.getClass(), "checksum", term3331);
        term3998 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term3999 = newInstance(Class.forName("java.util.zip.CRC32"));
        setField(term3998, term3998.getClass(), "in", null);
        setIntField(term3999, term3999.getClass(), "crc", 0);
        setField(term3998, term3998.getClass(), "checksum", term3999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term3287, args);
        assertTrue(recursiveEquals(term3287, term3998));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


