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
import java.util.HashMap;

public class CpioArchiveOutputStream_init_2010264291206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88375;
     Object term88421;
     Object term88428;

    public CpioArchiveOutputStream_init_2010264291206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term88175 = new HashMap();
        Object term88127 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term87946 = (byte[]) newByteArray(0);
        Object term88237 = newInstance(Class.forName("java.nio.channels.Channels$3"));
        setField(term88127, term88127.getClass(), "oneByte", term87946);
        setLongField(term88127, term88127.getClass(), "bytesWritten", 0L);
        setBooleanField(term88127, term88127.getClass(), "closed", false);
        setField(term88127, term88127.getClass(), "names", term88175);
        setLongField(term88127, term88127.getClass(), "crc", 0L);
        setLongField(term88127, term88127.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term88127, term88127.getClass(), "out", term88237);
        term88375 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term88422 = new HashMap();
        term88421 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term88423 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term88424 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term88427 = (byte[]) newByteArray(1);
        setField(term88421, term88421.getClass(), "entry", null);
        setBooleanField(term88421, term88421.getClass(), "closed", false);
        setBooleanField(term88421, term88421.getClass(), "finished", false);
        setShortField(term88421, term88421.getClass(), "entryFormat", (short) 4);
        setField(term88421, term88421.getClass(), "names", term88422);
        setLongField(term88421, term88421.getClass(), "crc", 0L);
        setLongField(term88421, term88421.getClass(), "written", 0L);
        setField(term88423, term88423.getClass(), "entry", null);
        setBooleanField(term88423, term88423.getClass(), "closed", false);
        setBooleanField(term88423, term88423.getClass(), "finished", false);
        setShortField(term88423, term88423.getClass(), "entryFormat", (short) 0);
        setField(term88423, term88423.getClass(), "names", null);
        setLongField(term88423, term88423.getClass(), "crc", 0L);
        setLongField(term88423, term88423.getClass(), "written", 0L);
        setField(term88423, term88423.getClass(), "out", null);
        setIntField(term88423, term88423.getClass(), "blockSize", 0);
        setLongField(term88423, term88423.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term88423, term88423.getClass(), "zipEncoding", null);
        setField(term88423, term88423.getClass(), "oneByte", null);
        setLongField(term88423, term88423.getClass(), "bytesWritten", 0L);
        setField(term88421, term88421.getClass(), "out", term88423);
        setIntField(term88421, term88421.getClass(), "blockSize", 0);
        setLongField(term88421, term88421.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term88424, term88424.getClass(), "charsetName", "UTF8");
        setField(term88421, term88421.getClass(), "zipEncoding", term88424);
        setField(term88421, term88421.getClass(), "oneByte", term88427);
        setLongField(term88421, term88421.getClass(), "bytesWritten", 0L);
        term88428 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term88428, term88428.getClass(), "entry", null);
        setBooleanField(term88428, term88428.getClass(), "closed", false);
        setBooleanField(term88428, term88428.getClass(), "finished", false);
        setShortField(term88428, term88428.getClass(), "entryFormat", (short) 0);
        setField(term88428, term88428.getClass(), "names", null);
        setLongField(term88428, term88428.getClass(), "crc", 0L);
        setLongField(term88428, term88428.getClass(), "written", 0L);
        setField(term88428, term88428.getClass(), "out", null);
        setIntField(term88428, term88428.getClass(), "blockSize", 0);
        setLongField(term88428, term88428.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term88428, term88428.getClass(), "zipEncoding", null);
        setField(term88428, term88428.getClass(), "oneByte", null);
        setLongField(term88428, term88428.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term88375;
        args[1] = (short) 4;
        args[2] = 0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88421));
        assertTrue(recursiveEquals(term88375, null));
    }

};


