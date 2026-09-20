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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114081;
     Object term114377;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term114253 = new HashMap();
        term114081 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term114205 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term114081, term114081.getClass(), "closed", false);
        setLongField(term114205, term114205.getClass(), "filesize", 0L);
        setShortField(term114205, term114205.getClass(), "fileFormat", (short) 2);
        setLongField(term114205, term114205.getClass(), "chksum", 0L);
        setField(term114081, term114081.getClass(), "cpioEntry", term114205);
        setLongField(term114081, term114081.getClass(), "written", 0L);
        setLongField(term114081, term114081.getClass(), "crc", 0L);
        setField(term114081, term114081.getClass(), "names", term114253);
        term114377 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term114377, term114377.getClass(), "mtime", 0L);
        setShortField(term114377, term114377.getClass(), "fileFormat", (short) 2);
        setField(term114377, term114377.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term114377;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term114081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
