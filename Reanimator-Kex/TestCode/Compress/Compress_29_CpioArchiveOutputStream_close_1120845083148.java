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

public class CpioArchiveOutputStream_close_1120845083148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62772;
     Object term62836;

    public CpioArchiveOutputStream_close_1120845083148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62772 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term62822 = newInstance(Class.forName("java.io.OutputStream$1"));
        setBooleanField(term62772, term62772.getClass(), "finished", true);
        setBooleanField(term62772, term62772.getClass(), "closed", false);
        setField(term62772, term62772.getClass(), "out", term62822);
        term62836 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term62837 = newInstance(Class.forName("java.io.OutputStream$1"));
        setField(term62836, term62836.getClass(), "entry", null);
        setBooleanField(term62836, term62836.getClass(), "closed", true);
        setBooleanField(term62836, term62836.getClass(), "finished", true);
        setShortField(term62836, term62836.getClass(), "entryFormat", (short) 0);
        setField(term62836, term62836.getClass(), "names", null);
        setLongField(term62836, term62836.getClass(), "crc", 0L);
        setLongField(term62836, term62836.getClass(), "written", 0L);
        setBooleanField(term62837, term62837.getClass(), "closed", true);
        setField(term62836, term62836.getClass(), "out", term62837);
        setIntField(term62836, term62836.getClass(), "blockSize", 0);
        setLongField(term62836, term62836.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term62836, term62836.getClass(), "zipEncoding", null);
        setField(term62836, term62836.getClass(), "oneByte", null);
        setLongField(term62836, term62836.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term62772, args);
        assertTrue(recursiveEquals(term62772, term62836));
    }

};


