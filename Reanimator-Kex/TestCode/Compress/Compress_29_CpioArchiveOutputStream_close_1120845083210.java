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

public class CpioArchiveOutputStream_close_1120845083210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89235;
     Object term89576;

    public CpioArchiveOutputStream_close_1120845083210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89235 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term89373 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term89541 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$OutputStreamWrapper"));
        setBooleanField(term89235, term89235.getClass(), "finished", true);
        setBooleanField(term89235, term89235.getClass(), "closed", false);
        setBooleanField(term89373, term89373.getClass(), "finished", true);
        setBooleanField(term89373, term89373.getClass(), "closed", false);
        setField(term89373, term89373.getClass(), "out", term89541);
        setField(term89235, term89235.getClass(), "out", term89373);
        term89576 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term89577 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term89578 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$OutputStreamWrapper"));
        setField(term89576, term89576.getClass(), "entry", null);
        setBooleanField(term89576, term89576.getClass(), "closed", true);
        setBooleanField(term89576, term89576.getClass(), "finished", true);
        setShortField(term89576, term89576.getClass(), "entryFormat", (short) 0);
        setField(term89576, term89576.getClass(), "names", null);
        setLongField(term89576, term89576.getClass(), "crc", 0L);
        setLongField(term89576, term89576.getClass(), "written", 0L);
        setField(term89577, term89577.getClass(), "entry", null);
        setBooleanField(term89577, term89577.getClass(), "closed", true);
        setBooleanField(term89577, term89577.getClass(), "finished", true);
        setShortField(term89577, term89577.getClass(), "entryFormat", (short) 0);
        setField(term89577, term89577.getClass(), "names", null);
        setLongField(term89577, term89577.getClass(), "crc", 0L);
        setLongField(term89577, term89577.getClass(), "written", 0L);
        setField(term89578, term89578.getClass(), "this$0", null);
        setField(term89577, term89577.getClass(), "out", term89578);
        setIntField(term89577, term89577.getClass(), "blockSize", 0);
        setLongField(term89577, term89577.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term89577, term89577.getClass(), "zipEncoding", null);
        setField(term89577, term89577.getClass(), "oneByte", null);
        setLongField(term89577, term89577.getClass(), "bytesWritten", 0L);
        setField(term89576, term89576.getClass(), "out", term89577);
        setIntField(term89576, term89576.getClass(), "blockSize", 0);
        setLongField(term89576, term89576.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term89576, term89576.getClass(), "zipEncoding", null);
        setField(term89576, term89576.getClass(), "oneByte", null);
        setLongField(term89576, term89576.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term89235, args);
        assertTrue(recursiveEquals(term89235, term89576));
    }

};


