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

public class CpioArchiveOutputStream_close_112084508392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24918;
     Object term25431;

    public CpioArchiveOutputStream_close_112084508392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24918 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term25056 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term24918, term24918.getClass(), "closed", false);
        setBooleanField(term24918, term24918.getClass(), "finished", true);
        setBooleanField(term25056, term25056.getClass(), "closed", true);
        setField(term24918, term24918.getClass(), "out", term25056);
        term25431 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term25432 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term25431, term25431.getClass(), "entry", null);
        setBooleanField(term25431, term25431.getClass(), "closed", true);
        setBooleanField(term25431, term25431.getClass(), "finished", true);
        setShortField(term25431, term25431.getClass(), "entryFormat", (short) 0);
        setField(term25431, term25431.getClass(), "names", null);
        setLongField(term25431, term25431.getClass(), "crc", 0L);
        setLongField(term25431, term25431.getClass(), "written", 0L);
        setField(term25432, term25432.getClass(), "entry", null);
        setBooleanField(term25432, term25432.getClass(), "closed", true);
        setBooleanField(term25432, term25432.getClass(), "finished", false);
        setShortField(term25432, term25432.getClass(), "entryFormat", (short) 0);
        setField(term25432, term25432.getClass(), "names", null);
        setLongField(term25432, term25432.getClass(), "crc", 0L);
        setLongField(term25432, term25432.getClass(), "written", 0L);
        setField(term25432, term25432.getClass(), "out", null);
        setField(term25432, term25432.getClass(), "oneByte", null);
        setField(term25431, term25431.getClass(), "out", term25432);
        setField(term25431, term25431.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term24918, args);
        assertTrue(recursiveEquals(term24918, term25431));
    }

};


