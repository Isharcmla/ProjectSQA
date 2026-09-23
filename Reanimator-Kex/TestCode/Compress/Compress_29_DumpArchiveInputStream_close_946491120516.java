package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931751;

    public DumpArchiveInputStream_close_946491120516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931751 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term931873 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term932019 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term932155 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term931751, term931751.getClass(), "isClosed", false);
        setField(term932019, term932019.getClass(), "inf", null);
        setField(term932019, term932019.getClass(), "in", term932155);
        setField(term931873, term931873.getClass(), "in", term932019);
        setField(term931751, term931751.getClass(), "raw", term931873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term931751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


