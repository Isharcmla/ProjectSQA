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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98910;
     Object term99096;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98910 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term99096 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term98910, term98910.getClass(), "closed", false);
        setLongField(term99096, term99096.getClass(), "filesize", 0L);
        setShortField(term99096, term99096.getClass(), "fileFormat", (short) 2);
        setLongField(term99096, term99096.getClass(), "chksum", 0L);
        setLongField(term99096, term99096.getClass(), "mtime", 4294967295L);
        setField(term98910, term98910.getClass(), "cpioEntry", term99096);
        setLongField(term98910, term98910.getClass(), "written", 0L);
        setLongField(term98910, term98910.getClass(), "crc", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term99096;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term98910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
