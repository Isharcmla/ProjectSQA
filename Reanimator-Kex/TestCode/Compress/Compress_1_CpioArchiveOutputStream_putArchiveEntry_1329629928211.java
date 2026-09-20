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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101200;
     Object term101496;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term101372 = new HashMap();
        term101200 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term101324 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term101200, term101200.getClass(), "closed", false);
        setLongField(term101324, term101324.getClass(), "filesize", 0L);
        setShortField(term101324, term101324.getClass(), "fileFormat", (short) 1);
        setField(term101200, term101200.getClass(), "cpioEntry", term101324);
        setLongField(term101200, term101200.getClass(), "written", 0L);
        setLongField(term101200, term101200.getClass(), "crc", 0L);
        setField(term101200, term101200.getClass(), "names", term101372);
        term101496 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term101496, term101496.getClass(), "mtime", 0L);
        setShortField(term101496, term101496.getClass(), "fileFormat", (short) 1);
        setField(term101496, term101496.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term101496;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term101200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
