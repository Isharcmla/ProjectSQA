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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97497;
     Object term97683;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97497 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term97683 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term97497, term97497.getClass(), "closed", false);
        setLongField(term97683, term97683.getClass(), "filesize", 0L);
        setShortField(term97683, term97683.getClass(), "fileFormat", (short) -32768);
        setLongField(term97683, term97683.getClass(), "mtime", 4294967295L);
        setField(term97497, term97497.getClass(), "cpioEntry", term97683);
        setLongField(term97497, term97497.getClass(), "written", 0L);
        setLongField(term97497, term97497.getClass(), "crc", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term97683;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term97497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
