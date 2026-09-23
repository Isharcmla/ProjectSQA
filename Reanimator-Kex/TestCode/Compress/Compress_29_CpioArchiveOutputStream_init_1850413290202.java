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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_init_1850413290202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86981;

    public CpioArchiveOutputStream_init_1850413290202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term86769 = new HashMap();
        Object term86721 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term86540 = (byte[]) newByteArray(0);
        Object term86843 = newInstance(Class.forName("java.util.zip.DeflaterOutputStream"));
        setField(term86721, term86721.getClass(), "oneByte", term86540);
        setLongField(term86721, term86721.getClass(), "bytesWritten", 0L);
        setBooleanField(term86721, term86721.getClass(), "closed", false);
        setField(term86721, term86721.getClass(), "names", term86769);
        setLongField(term86721, term86721.getClass(), "crc", 0L);
        setLongField(term86721, term86721.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term86721, term86721.getClass(), "out", term86843);
        term86981 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term86981;
        args[1] = (short) 5;
        args[2] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


