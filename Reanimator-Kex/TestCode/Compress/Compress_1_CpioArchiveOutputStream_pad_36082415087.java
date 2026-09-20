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

public class CpioArchiveOutputStream_pad_36082415087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19612;
     Object term19973;

    public CpioArchiveOutputStream_pad_36082415087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19612 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term19973 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term19973, term19973.getClass(), "cpioEntry", null);
        setBooleanField(term19973, term19973.getClass(), "closed", false);
        setBooleanField(term19973, term19973.getClass(), "finished", false);
        setShortField(term19973, term19973.getClass(), "entryFormat", (short) 0);
        setField(term19973, term19973.getClass(), "names", null);
        setLongField(term19973, term19973.getClass(), "crc", 0L);
        setLongField(term19973, term19973.getClass(), "written", 0L);
        setField(term19973, term19973.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -863839850492799601L;
        args[1] = -402653184;
        callMethod(klass, "pad", argTypes, term19612, args);
        assertTrue(recursiveEquals(term19612, term19973));
    }

};
