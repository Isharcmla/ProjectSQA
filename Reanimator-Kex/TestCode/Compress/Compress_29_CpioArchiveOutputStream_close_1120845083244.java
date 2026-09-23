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

public class CpioArchiveOutputStream_close_1120845083244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118287;
     Object term145232;

    public CpioArchiveOutputStream_close_1120845083244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118287 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term118381 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        setBooleanField(term118287, term118287.getClass(), "finished", true);
        setBooleanField(term118287, term118287.getClass(), "closed", false);
        setBooleanField(term118381, term118381.getClass(), "finished", true);
        setField(term118287, term118287.getClass(), "out", term118381);
        term145232 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term145233 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        setField(term145232, term145232.getClass(), "entry", null);
        setBooleanField(term145232, term145232.getClass(), "closed", true);
        setBooleanField(term145232, term145232.getClass(), "finished", true);
        setShortField(term145232, term145232.getClass(), "entryFormat", (short) 0);
        setField(term145232, term145232.getClass(), "names", null);
        setLongField(term145232, term145232.getClass(), "crc", 0L);
        setLongField(term145232, term145232.getClass(), "written", 0L);
        setField(term145233, term145233.getClass(), "out", null);
        setField(term145233, term145233.getClass(), "outData", null);
        setField(term145233, term145233.getClass(), "uncompBuf", null);
        setIntField(term145233, term145233.getClass(), "uncompPos", 0);
        setBooleanField(term145233, term145233.getClass(), "dictResetNeeded", false);
        setBooleanField(term145233, term145233.getClass(), "finished", true);
        setField(term145233, term145233.getClass(), "exception", null);
        setField(term145233, term145233.getClass(), "tempBuf", null);
        setField(term145232, term145232.getClass(), "out", term145233);
        setIntField(term145232, term145232.getClass(), "blockSize", 0);
        setLongField(term145232, term145232.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term145232, term145232.getClass(), "zipEncoding", null);
        setField(term145232, term145232.getClass(), "oneByte", null);
        setLongField(term145232, term145232.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term118287, args);
        assertTrue(recursiveEquals(term118287, term145232));
    }

};


