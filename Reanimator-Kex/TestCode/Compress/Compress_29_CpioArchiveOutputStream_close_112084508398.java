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

public class CpioArchiveOutputStream_close_112084508398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36985;
     Object term37144;

    public CpioArchiveOutputStream_close_112084508398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36985 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term36985, term36985.getClass(), "finished", true);
        setBooleanField(term36985, term36985.getClass(), "closed", true);
        term37144 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term37144, term37144.getClass(), "entry", null);
        setBooleanField(term37144, term37144.getClass(), "closed", true);
        setBooleanField(term37144, term37144.getClass(), "finished", true);
        setShortField(term37144, term37144.getClass(), "entryFormat", (short) 0);
        setField(term37144, term37144.getClass(), "names", null);
        setLongField(term37144, term37144.getClass(), "crc", 0L);
        setLongField(term37144, term37144.getClass(), "written", 0L);
        setField(term37144, term37144.getClass(), "out", null);
        setIntField(term37144, term37144.getClass(), "blockSize", 0);
        setLongField(term37144, term37144.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term37144, term37144.getClass(), "zipEncoding", null);
        setField(term37144, term37144.getClass(), "oneByte", null);
        setLongField(term37144, term37144.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term36985, args);
        assertTrue(recursiveEquals(term36985, term37144));
    }

};


