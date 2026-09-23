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

public class TarArchiveOutputStream_init_123922963027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78963;
     Object term80030;
     Object term80037;

    public TarArchiveOutputStream_init_123922963027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78681 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term78829 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setField(term78681, term78681.getClass(), "oneByte", null);
        setIntField(term78681, term78681.getClass(), "longFileMode", 0);
        setBooleanField(term78681, term78681.getClass(), "closed", false);
        setBooleanField(term78681, term78681.getClass(), "haveUnclosedEntry", false);
        setField(term78681, term78681.getClass(), "out", term78829);
        term78963 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term80030 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term80031 = (byte[]) newByteArray(512);
        byte[] term80032 = (byte[]) newByteArray(512);
        Object term80033 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term80034 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term80035 = (byte[]) newByteArray(0);
        byte[] term80036 = (byte[]) newByteArray(1);
        setLongField(term80030, term80030.getClass(), "currSize", 0L);
        setField(term80030, term80030.getClass(), "currName", null);
        setLongField(term80030, term80030.getClass(), "currBytes", 0L);
        setField(term80030, term80030.getClass(), "recordBuf", term80031);
        setIntField(term80030, term80030.getClass(), "assemLen", 0);
        setField(term80030, term80030.getClass(), "assemBuf", term80032);
        setField(term80033, term80033.getClass(), "inStream", null);
        setLongField(term80034, term80034.getClass(), "currSize", 0L);
        setField(term80034, term80034.getClass(), "currName", null);
        setLongField(term80034, term80034.getClass(), "currBytes", 0L);
        setField(term80034, term80034.getClass(), "recordBuf", null);
        setIntField(term80034, term80034.getClass(), "assemLen", 0);
        setField(term80034, term80034.getClass(), "assemBuf", null);
        setField(term80034, term80034.getClass(), "buffer", null);
        setIntField(term80034, term80034.getClass(), "longFileMode", 0);
        setBooleanField(term80034, term80034.getClass(), "closed", false);
        setBooleanField(term80034, term80034.getClass(), "haveUnclosedEntry", false);
        setField(term80034, term80034.getClass(), "out", null);
        setField(term80034, term80034.getClass(), "oneByte", null);
        setField(term80033, term80033.getClass(), "outStream", term80034);
        setField(term80033, term80033.getClass(), "blockBuffer", term80035);
        setIntField(term80033, term80033.getClass(), "currBlkIdx", 0);
        setIntField(term80033, term80033.getClass(), "currRecIdx", 0);
        setIntField(term80033, term80033.getClass(), "blockSize", 0);
        setIntField(term80033, term80033.getClass(), "recordSize", 512);
        setIntField(term80033, term80033.getClass(), "recsPerBlock", 0);
        setField(term80030, term80030.getClass(), "buffer", term80033);
        setIntField(term80030, term80030.getClass(), "longFileMode", 0);
        setBooleanField(term80030, term80030.getClass(), "closed", false);
        setBooleanField(term80030, term80030.getClass(), "haveUnclosedEntry", false);
        setField(term80030, term80030.getClass(), "out", term80034);
        setField(term80030, term80030.getClass(), "oneByte", term80036);
        term80037 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term80037, term80037.getClass(), "currSize", 0L);
        setField(term80037, term80037.getClass(), "currName", null);
        setLongField(term80037, term80037.getClass(), "currBytes", 0L);
        setField(term80037, term80037.getClass(), "recordBuf", null);
        setIntField(term80037, term80037.getClass(), "assemLen", 0);
        setField(term80037, term80037.getClass(), "assemBuf", null);
        setField(term80037, term80037.getClass(), "buffer", null);
        setIntField(term80037, term80037.getClass(), "longFileMode", 0);
        setBooleanField(term80037, term80037.getClass(), "closed", false);
        setBooleanField(term80037, term80037.getClass(), "haveUnclosedEntry", false);
        setField(term80037, term80037.getClass(), "out", null);
        setField(term80037, term80037.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term78963;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80030));
        assertTrue(recursiveEquals(term78963, 0));
    }

};


