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

public class CpioArchiveOutputStream_close_1120845083157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67184;
     Object term69136;

    public CpioArchiveOutputStream_close_1120845083157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67184 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term67322 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term67184, term67184.getClass(), "finished", true);
        setBooleanField(term67184, term67184.getClass(), "closed", false);
        setBooleanField(term67322, term67322.getClass(), "finished", true);
        setBooleanField(term67322, term67322.getClass(), "closed", true);
        setField(term67184, term67184.getClass(), "out", term67322);
        term69136 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term69137 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term69136, term69136.getClass(), "entry", null);
        setBooleanField(term69136, term69136.getClass(), "closed", true);
        setBooleanField(term69136, term69136.getClass(), "finished", true);
        setShortField(term69136, term69136.getClass(), "entryFormat", (short) 0);
        setField(term69136, term69136.getClass(), "names", null);
        setLongField(term69136, term69136.getClass(), "crc", 0L);
        setLongField(term69136, term69136.getClass(), "written", 0L);
        setField(term69137, term69137.getClass(), "entry", null);
        setBooleanField(term69137, term69137.getClass(), "closed", true);
        setBooleanField(term69137, term69137.getClass(), "finished", true);
        setShortField(term69137, term69137.getClass(), "entryFormat", (short) 0);
        setField(term69137, term69137.getClass(), "names", null);
        setLongField(term69137, term69137.getClass(), "crc", 0L);
        setLongField(term69137, term69137.getClass(), "written", 0L);
        setField(term69137, term69137.getClass(), "out", null);
        setIntField(term69137, term69137.getClass(), "blockSize", 0);
        setLongField(term69137, term69137.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term69137, term69137.getClass(), "zipEncoding", null);
        setField(term69137, term69137.getClass(), "oneByte", null);
        setLongField(term69137, term69137.getClass(), "bytesWritten", 0L);
        setField(term69136, term69136.getClass(), "out", term69137);
        setIntField(term69136, term69136.getClass(), "blockSize", 0);
        setLongField(term69136, term69136.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term69136, term69136.getClass(), "zipEncoding", null);
        setField(term69136, term69136.getClass(), "oneByte", null);
        setLongField(term69136, term69136.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term67184, args);
        assertTrue(recursiveEquals(term67184, term69136));
    }

};


