package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;

public class CpioArchiveOutputStream_closeArchiveEntry_680017397119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28934;
     Object term30954;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28934 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term29058 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term28934, term28934.getClass(), "closed", false);
        setLongField(term29058, term29058.getClass(), "filesize", 0L);
        setShortField(term29058, term29058.getClass(), "fileFormat", (short) 8);
        setField(term28934, term28934.getClass(), "cpioEntry", term29058);
        setLongField(term28934, term28934.getClass(), "written", 0L);
        term30954 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term30954, term30954.getClass(), "cpioEntry", null);
        setBooleanField(term30954, term30954.getClass(), "closed", false);
        setBooleanField(term30954, term30954.getClass(), "finished", false);
        setShortField(term30954, term30954.getClass(), "entryFormat", (short) 0);
        setField(term30954, term30954.getClass(), "names", null);
        setLongField(term30954, term30954.getClass(), "crc", 0L);
        setLongField(term30954, term30954.getClass(), "written", 0L);
        setField(term30954, term30954.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term28934, args);
        assertTrue(recursiveEquals(term28934, term30954));
    }

};
