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

public class CpioArchiveOutputStream_write_1858506652106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28500;
     Object term28345;
     Object term28834;
     Object term28835;

    public CpioArchiveOutputStream_write_1858506652106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28500 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term28500, term28500.getClass(), "closed", false);
        term28345 = (byte[]) newByteArray(0);
        term28834 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term28834, term28834.getClass(), "entry", null);
        setBooleanField(term28834, term28834.getClass(), "closed", false);
        setBooleanField(term28834, term28834.getClass(), "finished", false);
        setShortField(term28834, term28834.getClass(), "entryFormat", (short) 0);
        setField(term28834, term28834.getClass(), "names", null);
        setLongField(term28834, term28834.getClass(), "crc", 0L);
        setLongField(term28834, term28834.getClass(), "written", 0L);
        setField(term28834, term28834.getClass(), "out", null);
        setField(term28834, term28834.getClass(), "oneByte", null);
        term28835 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term28345;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "write", argTypes, term28500, args);
        assertTrue(recursiveEquals(term28500, term28834));
        assertTrue(recursiveEquals(term28345, term28835));
    }

};


