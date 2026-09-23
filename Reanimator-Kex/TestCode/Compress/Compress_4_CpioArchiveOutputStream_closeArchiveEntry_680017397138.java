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

public class CpioArchiveOutputStream_closeArchiveEntry_680017397138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73435;
     Object term76980;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73435 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term73559 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term73435, term73435.getClass(), "closed", false);
        setLongField(term73559, term73559.getClass(), "filesize", 0L);
        setIntField(term73559, term73559.getClass(), "alignmentBoundary", -1);
        setField(term73435, term73435.getClass(), "entry", term73559);
        setLongField(term73435, term73435.getClass(), "written", 0L);
        term76980 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term76980, term76980.getClass(), "entry", null);
        setBooleanField(term76980, term76980.getClass(), "closed", false);
        setBooleanField(term76980, term76980.getClass(), "finished", false);
        setShortField(term76980, term76980.getClass(), "entryFormat", (short) 0);
        setField(term76980, term76980.getClass(), "names", null);
        setLongField(term76980, term76980.getClass(), "crc", 0L);
        setLongField(term76980, term76980.getClass(), "written", 0L);
        setField(term76980, term76980.getClass(), "out", null);
        setField(term76980, term76980.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term73435, args);
        assertTrue(recursiveEquals(term73435, term76980));
    }

};


