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

public class CpioArchiveOutputStream_putNextEntry_1846629518243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169537;
     Object term169833;

    public CpioArchiveOutputStream_putNextEntry_1846629518243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term169709 = new HashMap();
        term169537 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term169661 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term169537, term169537.getClass(), "closed", false);
        setLongField(term169661, term169661.getClass(), "filesize", 0L);
        setShortField(term169661, term169661.getClass(), "fileFormat", (short) 1);
        setField(term169537, term169537.getClass(), "cpioEntry", term169661);
        setLongField(term169537, term169537.getClass(), "written", 0L);
        setLongField(term169537, term169537.getClass(), "crc", 0L);
        setField(term169537, term169537.getClass(), "names", term169709);
        term169833 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term169833, term169833.getClass(), "mtime", 0L);
        setShortField(term169833, term169833.getClass(), "fileFormat", (short) 1);
        setField(term169833, term169833.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term169833;
        try {
            callMethod(klass, "putNextEntry", argTypes, term169537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
