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

public class CpioArchiveOutputStream_closeArchiveEntry_68001739775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17860;
     Object term18632;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17860 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term17984 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term17860, term17860.getClass(), "closed", false);
        setField(term17860, term17860.getClass(), "entry", term17984);
        term18632 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term18632, term18632.getClass(), "entry", null);
        setBooleanField(term18632, term18632.getClass(), "closed", false);
        setBooleanField(term18632, term18632.getClass(), "finished", false);
        setShortField(term18632, term18632.getClass(), "entryFormat", (short) 0);
        setField(term18632, term18632.getClass(), "names", null);
        setLongField(term18632, term18632.getClass(), "crc", 0L);
        setLongField(term18632, term18632.getClass(), "written", 0L);
        setField(term18632, term18632.getClass(), "out", null);
        setField(term18632, term18632.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term17860, args);
        assertTrue(recursiveEquals(term17860, term18632));
    }

};


