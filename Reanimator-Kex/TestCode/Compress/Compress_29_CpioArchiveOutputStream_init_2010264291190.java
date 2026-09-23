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

public class CpioArchiveOutputStream_init_2010264291190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81950;
     Object term81996;
     Object term82003;

    public CpioArchiveOutputStream_init_2010264291190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term81762 = new HashMap();
        Object term81714 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term81533 = (byte[]) newByteArray(0);
        Object term81812 = newInstance(Class.forName("java.io.OutputStream$1"));
        setField(term81714, term81714.getClass(), "oneByte", term81533);
        setLongField(term81714, term81714.getClass(), "bytesWritten", 0L);
        setBooleanField(term81714, term81714.getClass(), "closed", false);
        setField(term81714, term81714.getClass(), "names", term81762);
        setLongField(term81714, term81714.getClass(), "crc", 0L);
        setLongField(term81714, term81714.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term81714, term81714.getClass(), "out", term81812);
        term81950 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        HashMap term81997 = new HashMap();
        term81996 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term81998 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term81999 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term82002 = (byte[]) newByteArray(1);
        setField(term81996, term81996.getClass(), "entry", null);
        setBooleanField(term81996, term81996.getClass(), "closed", false);
        setBooleanField(term81996, term81996.getClass(), "finished", false);
        setShortField(term81996, term81996.getClass(), "entryFormat", (short) 2);
        setField(term81996, term81996.getClass(), "names", term81997);
        setLongField(term81996, term81996.getClass(), "crc", 0L);
        setLongField(term81996, term81996.getClass(), "written", 0L);
        setField(term81998, term81998.getClass(), "entry", null);
        setBooleanField(term81998, term81998.getClass(), "closed", false);
        setBooleanField(term81998, term81998.getClass(), "finished", false);
        setShortField(term81998, term81998.getClass(), "entryFormat", (short) 0);
        setField(term81998, term81998.getClass(), "names", null);
        setLongField(term81998, term81998.getClass(), "crc", 0L);
        setLongField(term81998, term81998.getClass(), "written", 0L);
        setField(term81998, term81998.getClass(), "out", null);
        setIntField(term81998, term81998.getClass(), "blockSize", 0);
        setLongField(term81998, term81998.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term81998, term81998.getClass(), "zipEncoding", null);
        setField(term81998, term81998.getClass(), "oneByte", null);
        setLongField(term81998, term81998.getClass(), "bytesWritten", 0L);
        setField(term81996, term81996.getClass(), "out", term81998);
        setIntField(term81996, term81996.getClass(), "blockSize", 0);
        setLongField(term81996, term81996.getClass(), "nextArtificalDeviceAndInode", 1L);
        setField(term81999, term81999.getClass(), "charsetName", "UTF8");
        setField(term81996, term81996.getClass(), "zipEncoding", term81999);
        setField(term81996, term81996.getClass(), "oneByte", term82002);
        setLongField(term81996, term81996.getClass(), "bytesWritten", 0L);
        term82003 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term82003, term82003.getClass(), "entry", null);
        setBooleanField(term82003, term82003.getClass(), "closed", false);
        setBooleanField(term82003, term82003.getClass(), "finished", false);
        setShortField(term82003, term82003.getClass(), "entryFormat", (short) 0);
        setField(term82003, term82003.getClass(), "names", null);
        setLongField(term82003, term82003.getClass(), "crc", 0L);
        setLongField(term82003, term82003.getClass(), "written", 0L);
        setField(term82003, term82003.getClass(), "out", null);
        setIntField(term82003, term82003.getClass(), "blockSize", 0);
        setLongField(term82003, term82003.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term82003, term82003.getClass(), "zipEncoding", null);
        setField(term82003, term82003.getClass(), "oneByte", null);
        setLongField(term82003, term82003.getClass(), "bytesWritten", 0L);
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
        args[0] = term81950;
        args[1] = (short) 2;
        args[2] = 0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term81996));
        assertTrue(recursiveEquals(term81950, null));
    }

};


