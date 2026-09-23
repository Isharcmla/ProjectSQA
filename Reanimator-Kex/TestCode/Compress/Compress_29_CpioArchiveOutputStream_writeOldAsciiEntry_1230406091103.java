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

public class CpioArchiveOutputStream_writeOldAsciiEntry_1230406091103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38382;
     Object term38506;

    public CpioArchiveOutputStream_writeOldAsciiEntry_1230406091103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38382 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term38506 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term38506, term38506.getClass(), "inode", 0L);
        setShortField(term38506, term38506.getClass(), "fileFormat", (short) 8);
        setLongField(term38506, term38506.getClass(), "min", 2147483648L);
        setField(term38506, term38506.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term38506;
        try {
            callMethod(klass, "writeOldAsciiEntry", argTypes, term38382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


