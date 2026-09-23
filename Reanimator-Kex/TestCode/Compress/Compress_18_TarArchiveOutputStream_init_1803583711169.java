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

public class TarArchiveOutputStream_init_1803583711169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316797;

    public TarArchiveOutputStream_init_1803583711169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term315709 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term315534 = (byte[]) newByteArray(0);
        setField(term315709, term315709.getClass(), "oneByte", term315534);
        setLongField(term315709, term315709.getClass(), "bytesWritten", 0L);
        setIntField(term315709, term315709.getClass(), "longFileMode", 0);
        setIntField(term315709, term315709.getClass(), "bigNumberMode", 0);
        setBooleanField(term315709, term315709.getClass(), "closed", false);
        setBooleanField(term315709, term315709.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term315709, term315709.getClass(), "finished", false);
        setBooleanField(term315709, term315709.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term315709, term315709.getClass(), "out", null);
        term316797 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term316798 = (byte[]) newByteArray(512);
        byte[] term316799 = (byte[]) newByteArray(512);
        Object term316800 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term316801 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term316802 = newInstance(Class.forName("java.lang.Object"));
        byte[] term316803 = (byte[]) newByteArray(0);
        Object term316804 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term316807 = (byte[]) newByteArray(1);
        setLongField(term316797, term316797.getClass(), "currSize", 0L);
        setField(term316797, term316797.getClass(), "currName", null);
        setLongField(term316797, term316797.getClass(), "currBytes", 0L);
        setField(term316797, term316797.getClass(), "recordBuf", term316798);
        setIntField(term316797, term316797.getClass(), "assemLen", 0);
        setField(term316797, term316797.getClass(), "assemBuf", term316799);
        setField(term316800, term316800.getClass(), "inStream", null);
        setLongField(term316801, term316801.getClass(), "bytesWritten", 0L);
        setField(term316801, term316801.getClass(), "out", null);
        setBooleanField(term316801, term316801.getClass(), "closed", false);
        setField(term316801, term316801.getClass(), "closeLock", term316802);
        setField(term316800, term316800.getClass(), "outStream", term316801);
        setIntField(term316800, term316800.getClass(), "blockSize", 0);
        setIntField(term316800, term316800.getClass(), "recordSize", 512);
        setIntField(term316800, term316800.getClass(), "recsPerBlock", 0);
        setField(term316800, term316800.getClass(), "blockBuffer", term316803);
        setIntField(term316800, term316800.getClass(), "currBlkIdx", 0);
        setIntField(term316800, term316800.getClass(), "currRecIdx", 0);
        setField(term316797, term316797.getClass(), "buffer", term316800);
        setIntField(term316797, term316797.getClass(), "longFileMode", 0);
        setIntField(term316797, term316797.getClass(), "bigNumberMode", 0);
        setBooleanField(term316797, term316797.getClass(), "closed", false);
        setBooleanField(term316797, term316797.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term316797, term316797.getClass(), "finished", false);
        setField(term316797, term316797.getClass(), "out", term316801);
        setField(term316804, term316804.getClass(), "charset", "UTF8");
        setField(term316797, term316797.getClass(), "encoding", term316804);
        setBooleanField(term316797, term316797.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term316797, term316797.getClass(), "oneByte", term316807);
        setLongField(term316797, term316797.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term316797));
    }

};


