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

public class DumpArchiveInputStream_close_946491120312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436334;

    public DumpArchiveInputStream_close_946491120312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436334 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term436456 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term436602 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term436748 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term436884 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term436334, term436334.getClass(), "isClosed", false);
        setField(term436602, term436602.getClass(), "inf", null);
        setField(term436748, term436748.getClass(), "inf", null);
        setField(term436748, term436748.getClass(), "in", term436884);
        setField(term436602, term436602.getClass(), "in", term436748);
        setField(term436456, term436456.getClass(), "in", term436602);
        setField(term436334, term436334.getClass(), "raw", term436456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term436334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


