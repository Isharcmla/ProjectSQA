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

public class CpioArchiveOutputStream_putNextEntry_1846629518190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93277;
     Object term93463;

    public CpioArchiveOutputStream_putNextEntry_1846629518190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93277 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term93463 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term93277, term93277.getClass(), "closed", false);
        setLongField(term93463, term93463.getClass(), "filesize", 0L);
        setShortField(term93463, term93463.getClass(), "fileFormat", (short) 1);
        setLongField(term93463, term93463.getClass(), "mtime", 4294967295L);
        setField(term93277, term93277.getClass(), "cpioEntry", term93463);
        setLongField(term93277, term93277.getClass(), "written", 0L);
        setLongField(term93277, term93277.getClass(), "crc", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term93463;
        try {
            callMethod(klass, "putNextEntry", argTypes, term93277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
