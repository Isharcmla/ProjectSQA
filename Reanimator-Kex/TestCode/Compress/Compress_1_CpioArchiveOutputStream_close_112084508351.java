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

public class CpioArchiveOutputStream_close_112084508351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8808;
     Object term9093;

    public CpioArchiveOutputStream_close_112084508351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8808 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term8808, term8808.getClass(), "closed", false);
        term9093 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term9093, term9093.getClass(), "cpioEntry", null);
        setBooleanField(term9093, term9093.getClass(), "closed", true);
        setBooleanField(term9093, term9093.getClass(), "finished", false);
        setShortField(term9093, term9093.getClass(), "entryFormat", (short) 0);
        setField(term9093, term9093.getClass(), "names", null);
        setLongField(term9093, term9093.getClass(), "crc", 0L);
        setLongField(term9093, term9093.getClass(), "written", 0L);
        setField(term9093, term9093.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term8808, args);
        assertTrue(recursiveEquals(term8808, term9093));
    }

};
