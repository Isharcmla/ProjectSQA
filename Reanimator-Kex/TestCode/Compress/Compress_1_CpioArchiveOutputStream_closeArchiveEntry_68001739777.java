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

public class CpioArchiveOutputStream_closeArchiveEntry_68001739777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17516;
     Object term17720;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17516 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term17640 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term17516, term17516.getClass(), "closed", false);
        setLongField(term17640, term17640.getClass(), "filesize", 0L);
        setShortField(term17640, term17640.getClass(), "fileFormat", (short) 1);
        setField(term17516, term17516.getClass(), "cpioEntry", term17640);
        setLongField(term17516, term17516.getClass(), "written", 0L);
        term17720 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term17720, term17720.getClass(), "cpioEntry", null);
        setBooleanField(term17720, term17720.getClass(), "closed", false);
        setBooleanField(term17720, term17720.getClass(), "finished", false);
        setShortField(term17720, term17720.getClass(), "entryFormat", (short) 0);
        setField(term17720, term17720.getClass(), "names", null);
        setLongField(term17720, term17720.getClass(), "crc", 0L);
        setLongField(term17720, term17720.getClass(), "written", 0L);
        setField(term17720, term17720.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term17516, args);
        assertTrue(recursiveEquals(term17516, term17720));
    }

};
