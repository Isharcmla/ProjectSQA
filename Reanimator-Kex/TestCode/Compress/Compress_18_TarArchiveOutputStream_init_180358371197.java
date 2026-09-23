package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveOutputStream_init_180358371197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221714;
     Object term223306;
     Object term223318;

    public TarArchiveOutputStream_init_180358371197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221514 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term221576 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setField(term221514, term221514.getClass(), "oneByte", null);
        setLongField(term221514, term221514.getClass(), "bytesWritten", 0L);
        setIntField(term221514, term221514.getClass(), "longFileMode", 0);
        setIntField(term221514, term221514.getClass(), "bigNumberMode", 0);
        setBooleanField(term221514, term221514.getClass(), "closed", false);
        setBooleanField(term221514, term221514.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term221514, term221514.getClass(), "finished", false);
        setBooleanField(term221514, term221514.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term221514, term221514.getClass(), "out", term221576);
        term221714 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term223306 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term223307 = (byte[]) newByteArray(512);
        byte[] term223308 = (byte[]) newByteArray(512);
        Object term223309 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term223310 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term223311 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term223312 = newInstance(Class.forName("java.lang.Object"));
        byte[] term223313 = (byte[]) newByteArray(0);
        Object term223314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term223317 = (byte[]) newByteArray(1);
        setLongField(term223306, term223306.getClass(), "currSize", 0L);
        setField(term223306, term223306.getClass(), "currName", null);
        setLongField(term223306, term223306.getClass(), "currBytes", 0L);
        setField(term223306, term223306.getClass(), "recordBuf", term223307);
        setIntField(term223306, term223306.getClass(), "assemLen", 0);
        setField(term223306, term223306.getClass(), "assemBuf", term223308);
        setField(term223309, term223309.getClass(), "inStream", null);
        setLongField(term223310, term223310.getClass(), "bytesWritten", 0L);
        setField(term223311, term223311.getClass(), "entry", null);
        setBooleanField(term223311, term223311.getClass(), "closed", false);
        setBooleanField(term223311, term223311.getClass(), "finished", false);
        setShortField(term223311, term223311.getClass(), "entryFormat", (short) 0);
        setField(term223311, term223311.getClass(), "names", null);
        setLongField(term223311, term223311.getClass(), "crc", 0L);
        setLongField(term223311, term223311.getClass(), "written", 0L);
        setField(term223311, term223311.getClass(), "out", null);
        setIntField(term223311, term223311.getClass(), "blockSize", 0);
        setLongField(term223311, term223311.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term223311, term223311.getClass(), "oneByte", null);
        setLongField(term223311, term223311.getClass(), "bytesWritten", 0L);
        setField(term223310, term223310.getClass(), "out", term223311);
        setBooleanField(term223310, term223310.getClass(), "closed", false);
        setField(term223310, term223310.getClass(), "closeLock", term223312);
        setField(term223309, term223309.getClass(), "outStream", term223310);
        setIntField(term223309, term223309.getClass(), "blockSize", 0);
        setIntField(term223309, term223309.getClass(), "recordSize", 512);
        setIntField(term223309, term223309.getClass(), "recsPerBlock", 0);
        setField(term223309, term223309.getClass(), "blockBuffer", term223313);
        setIntField(term223309, term223309.getClass(), "currBlkIdx", 0);
        setIntField(term223309, term223309.getClass(), "currRecIdx", 0);
        setField(term223306, term223306.getClass(), "buffer", term223309);
        setIntField(term223306, term223306.getClass(), "longFileMode", 0);
        setIntField(term223306, term223306.getClass(), "bigNumberMode", 0);
        setBooleanField(term223306, term223306.getClass(), "closed", false);
        setBooleanField(term223306, term223306.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term223306, term223306.getClass(), "finished", false);
        setField(term223306, term223306.getClass(), "out", term223310);
        setField(term223314, term223314.getClass(), "charset", "UTF8");
        setField(term223306, term223306.getClass(), "encoding", term223314);
        setBooleanField(term223306, term223306.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term223306, term223306.getClass(), "oneByte", term223317);
        setLongField(term223306, term223306.getClass(), "bytesWritten", 0L);
        term223318 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term223318, term223318.getClass(), "entry", null);
        setBooleanField(term223318, term223318.getClass(), "closed", false);
        setBooleanField(term223318, term223318.getClass(), "finished", false);
        setShortField(term223318, term223318.getClass(), "entryFormat", (short) 0);
        setField(term223318, term223318.getClass(), "names", null);
        setLongField(term223318, term223318.getClass(), "crc", 0L);
        setLongField(term223318, term223318.getClass(), "written", 0L);
        setField(term223318, term223318.getClass(), "out", null);
        setIntField(term223318, term223318.getClass(), "blockSize", 0);
        setLongField(term223318, term223318.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term223318, term223318.getClass(), "oneByte", null);
        setLongField(term223318, term223318.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term221714;
        args[1] = 0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term223306));
        assertTrue(recursiveEquals(term221714, term223318));
    }

};


