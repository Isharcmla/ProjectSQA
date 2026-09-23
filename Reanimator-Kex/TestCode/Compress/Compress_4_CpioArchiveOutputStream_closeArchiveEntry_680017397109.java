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
     Object term29006;
     Object term29657;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29006 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term29130 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term29006, term29006.getClass(), "closed", false);
        setLongField(term29130, term29130.getClass(), "filesize", 0L);
        setIntField(term29130, term29130.getClass(), "alignmentBoundary", 0);
        setShortField(term29130, term29130.getClass(), "fileFormat", (short) 2);
        setField(term29006, term29006.getClass(), "entry", term29130);
        setLongField(term29006, term29006.getClass(), "written", 0L);
        term29657 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term29657, term29657.getClass(), "entry", null);
        setBooleanField(term29657, term29657.getClass(), "closed", false);
        setBooleanField(term29657, term29657.getClass(), "finished", false);
        setShortField(term29657, term29657.getClass(), "entryFormat", (short) 0);
        setField(term29657, term29657.getClass(), "names", null);
        setLongField(term29657, term29657.getClass(), "crc", 0L);
        setLongField(term29657, term29657.getClass(), "written", 0L);
        setField(term29657, term29657.getClass(), "out", null);
        setField(term29657, term29657.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term29006, args);
        assertTrue(recursiveEquals(term29006, term29657));
    }

};


