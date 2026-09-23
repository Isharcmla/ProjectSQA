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

public class CpioArchiveOutputStream_putArchiveEntry_132962992895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25610;

    public CpioArchiveOutputStream_putArchiveEntry_132962992895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25610 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term25734 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term25610, term25610.getClass(), "closed", false);
        setLongField(term25734, term25734.getClass(), "filesize", 0L);
        setIntField(term25734, term25734.getClass(), "alignmentBoundary", 0);
        setShortField(term25734, term25734.getClass(), "fileFormat", (short) 2);
        setField(term25610, term25610.getClass(), "entry", term25734);
        setLongField(term25610, term25610.getClass(), "written", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term25610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


