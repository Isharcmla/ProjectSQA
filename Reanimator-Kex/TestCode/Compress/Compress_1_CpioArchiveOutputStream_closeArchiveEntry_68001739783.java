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

public class CpioArchiveOutputStream_closeArchiveEntry_68001739783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18977;
     Object term19178;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18977 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term19101 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term18977, term18977.getClass(), "closed", false);
        setLongField(term19101, term19101.getClass(), "filesize", 0L);
        setShortField(term19101, term19101.getClass(), "fileFormat", (short) 4);
        setField(term18977, term18977.getClass(), "cpioEntry", term19101);
        setLongField(term18977, term18977.getClass(), "written", 0L);
        term19178 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term19178, term19178.getClass(), "cpioEntry", null);
        setBooleanField(term19178, term19178.getClass(), "closed", false);
        setBooleanField(term19178, term19178.getClass(), "finished", false);
        setShortField(term19178, term19178.getClass(), "entryFormat", (short) 0);
        setField(term19178, term19178.getClass(), "names", null);
        setLongField(term19178, term19178.getClass(), "crc", 0L);
        setLongField(term19178, term19178.getClass(), "written", 0L);
        setField(term19178, term19178.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term18977, args);
        assertTrue(recursiveEquals(term18977, term19178));
    }

};
