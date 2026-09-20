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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_putNextEntry_1846629518255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208092;
     Object term208388;

    public CpioArchiveOutputStream_putNextEntry_1846629518255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term208264 = new HashMap();
        term208092 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term208216 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term208092, term208092.getClass(), "closed", false);
        setLongField(term208216, term208216.getClass(), "filesize", 0L);
        setShortField(term208216, term208216.getClass(), "fileFormat", (short) 2);
        setLongField(term208216, term208216.getClass(), "chksum", 0L);
        setField(term208092, term208092.getClass(), "cpioEntry", term208216);
        setLongField(term208092, term208092.getClass(), "written", 0L);
        setLongField(term208092, term208092.getClass(), "crc", 0L);
        setField(term208092, term208092.getClass(), "names", term208264);
        term208388 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term208388, term208388.getClass(), "mtime", 0L);
        setShortField(term208388, term208388.getClass(), "fileFormat", (short) 2);
        setField(term208388, term208388.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term208388;
        try {
            callMethod(klass, "putNextEntry", argTypes, term208092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
