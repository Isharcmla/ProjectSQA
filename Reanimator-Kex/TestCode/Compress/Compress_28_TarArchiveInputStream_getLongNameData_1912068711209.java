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

public class TarArchiveInputStream_getLongNameData_1912068711209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101848;

    public TarArchiveInputStream_getLongNameData_1912068711209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101848 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term101653 = (byte[]) newByteArray(0);
        Object term101918 = newInstance(Class.forName("org.tukaani.xz.SimpleInputStream"));
        setField(term101848, term101848.getClass(), "SMALL_BUF", term101653);
        setBooleanField(term101848, term101848.getClass(), "hasHitEOF", false);
        setField(term101848, term101848.getClass(), "currEntry", null);
        setIntField(term101848, term101848.getClass(), "recordSize", 0);
        setField(term101848, term101848.getClass(), "is", term101918);
        setLongField(term101848, term101848.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLongNameData", argTypes, term101848, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


