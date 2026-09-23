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
import java.lang.Object;

public class CpioArchiveOutputStream_closeArchiveEntry_680017397109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43545;
     Object term43739;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43545 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term43669 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term43545, term43545.getClass(), "finished", false);
        setBooleanField(term43545, term43545.getClass(), "closed", false);
        setField(term43545, term43545.getClass(), "entry", term43669);
        term43739 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term43739, term43739.getClass(), "entry", null);
        setBooleanField(term43739, term43739.getClass(), "closed", false);
        setBooleanField(term43739, term43739.getClass(), "finished", false);
        setShortField(term43739, term43739.getClass(), "entryFormat", (short) 0);
        setField(term43739, term43739.getClass(), "names", null);
        setLongField(term43739, term43739.getClass(), "crc", 0L);
        setLongField(term43739, term43739.getClass(), "written", 0L);
        setField(term43739, term43739.getClass(), "out", null);
        setIntField(term43739, term43739.getClass(), "blockSize", 0);
        setLongField(term43739, term43739.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term43739, term43739.getClass(), "zipEncoding", null);
        setField(term43739, term43739.getClass(), "oneByte", null);
        setLongField(term43739, term43739.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term43545, args);
        assertTrue(recursiveEquals(term43545, term43739));
    }

};


