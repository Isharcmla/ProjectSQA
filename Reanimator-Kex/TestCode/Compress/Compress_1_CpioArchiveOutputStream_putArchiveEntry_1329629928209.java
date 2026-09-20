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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100459;
     Object term100645;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100459 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term100645 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term100459, term100459.getClass(), "closed", false);
        setLongField(term100645, term100645.getClass(), "filesize", 0L);
        setShortField(term100645, term100645.getClass(), "fileFormat", (short) 1);
        setLongField(term100645, term100645.getClass(), "mtime", 4294967295L);
        setField(term100459, term100459.getClass(), "cpioEntry", term100645);
        setLongField(term100459, term100459.getClass(), "written", 0L);
        setLongField(term100459, term100459.getClass(), "crc", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term100645;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term100459, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
