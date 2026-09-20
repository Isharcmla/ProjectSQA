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

public class CpioArchiveOutputStream_write_185850665292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20405;
     Object term20250;
     Object term21046;
     Object term21047;

    public CpioArchiveOutputStream_write_185850665292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20405 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term20405, term20405.getClass(), "closed", false);
        term20250 = (byte[]) newByteArray(0);
        term21046 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term21046, term21046.getClass(), "cpioEntry", null);
        setBooleanField(term21046, term21046.getClass(), "closed", false);
        setBooleanField(term21046, term21046.getClass(), "finished", false);
        setShortField(term21046, term21046.getClass(), "entryFormat", (short) 0);
        setField(term21046, term21046.getClass(), "names", null);
        setLongField(term21046, term21046.getClass(), "crc", 0L);
        setLongField(term21046, term21046.getClass(), "written", 0L);
        setField(term21046, term21046.getClass(), "out", null);
        term21047 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term20250;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "write", argTypes, term20405, args);
        assertTrue(recursiveEquals(term20405, term21046));
        assertTrue(recursiveEquals(term20250, term21047));
    }

};
