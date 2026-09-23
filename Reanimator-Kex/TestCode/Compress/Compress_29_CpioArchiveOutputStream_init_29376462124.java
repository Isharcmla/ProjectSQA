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
import java.util.HashMap;
import java.lang.Object;

public class CpioArchiveOutputStream_init_29376462124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3595;

    public CpioArchiveOutputStream_init_29376462124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3596 = new HashMap();
        term3595 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term3597 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term3600 = (byte[]) newByteArray(1);
        setField(term3595, term3595.getClass(), "entry", null);
        setBooleanField(term3595, term3595.getClass(), "closed", false);
        setBooleanField(term3595, term3595.getClass(), "finished", false);
        setShortField(term3595, term3595.getClass(), "entryFormat", (short) 1);
        setField(term3595, term3595.getClass(), "names", term3596);
        setLongField(term3595, term3595.getClass(), "crc", 0L);
        setLongField(term3595, term3595.getClass(), "written", 0L);
        setField(term3595, term3595.getClass(), "out", null);
        setIntField(term3595, term3595.getClass(), "blockSize", 512);
        setLongField(term3595, term3595.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term3597, term3597.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term3595, term3595.getClass(), "zipEncoding", term3597);
        setField(term3595, term3595.getClass(), "oneByte", term3600);
        setLongField(term3595, term3595.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3595));
    }

};


