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

public class BitInputStream_close_190125753645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8492;

    public BitInputStream_close_190125753645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8492 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term8624 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term8706 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        Object term8760 = newInstance(Class.forName("java.io.RandomAccessFile"));
        setField(term8706, term8706.getClass(), "randomAccessFile", term8760);
        setField(term8624, term8624.getClass(), "is", term8706);
        setField(term8492, term8492.getClass(), "in", term8624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term8492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


