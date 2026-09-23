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

public class DumpArchiveInputStream_close_946491120348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535549;

    public DumpArchiveInputStream_close_946491120348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535549 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term535671 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term535817 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term535867 = newInstance(Class.forName("java.util.zip.Inflater"));
        setBooleanField(term535549, term535549.getClass(), "isClosed", false);
        setField(term535817, term535817.getClass(), "inf", term535867);
        setField(term535671, term535671.getClass(), "in", term535817);
        setField(term535549, term535549.getClass(), "raw", term535671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term535549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


