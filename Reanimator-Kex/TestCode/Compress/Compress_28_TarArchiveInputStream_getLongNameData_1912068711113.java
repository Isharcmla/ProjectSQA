package org.apache.commons.compress.archivers.tar;

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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_getLongNameData_1912068711113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45827;

    public TarArchiveInputStream_getLongNameData_1912068711113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45827 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term45635 = (byte[]) newByteArray(0);
        Object term45879 = newInstance(Class.forName("java.io.FileInputStream"));
        setField(term45827, term45827.getClass(), "SMALL_BUF", term45635);
        setBooleanField(term45827, term45827.getClass(), "hasHitEOF", false);
        setField(term45827, term45827.getClass(), "currEntry", null);
        setIntField(term45827, term45827.getClass(), "recordSize", 0);
        setField(term45827, term45827.getClass(), "is", term45879);
        setLongField(term45827, term45827.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLongNameData", argTypes, term45827, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


