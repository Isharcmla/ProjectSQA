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

public class CpioArchiveOutputStream_init_1850413290200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86125;

    public CpioArchiveOutputStream_init_1850413290200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term85893 = new HashMap();
        Object term85845 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term85664 = (byte[]) newByteArray(0);
        Object term85987 = newInstance(Class.forName("org.tukaani.xz.FinishableWrapperOutputStream"));
        setField(term85845, term85845.getClass(), "oneByte", term85664);
        setLongField(term85845, term85845.getClass(), "bytesWritten", 0L);
        setBooleanField(term85845, term85845.getClass(), "closed", false);
        setField(term85845, term85845.getClass(), "names", term85893);
        setLongField(term85845, term85845.getClass(), "crc", 0L);
        setLongField(term85845, term85845.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term85845, term85845.getClass(), "out", term85987);
        term86125 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term86125;
        args[1] = (short) 7;
        args[2] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


