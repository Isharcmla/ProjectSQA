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
     Object term79136;
     Object term80200;
     Object term80207;

    public TarArchiveOutputStream_init_123922963027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78854 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term79002 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setField(term78854, term78854.getClass(), "oneByte", null);
        setIntField(term78854, term78854.getClass(), "longFileMode", 0);
        setBooleanField(term78854, term78854.getClass(), "closed", false);
        setField(term78854, term78854.getClass(), "out", term79002);
        term79136 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term80200 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term80201 = (byte[]) newByteArray(512);
        byte[] term80202 = (byte[]) newByteArray(512);
        Object term80203 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term80204 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term80205 = (byte[]) newByteArray(0);
        byte[] term80206 = (byte[]) newByteArray(1);
        setLongField(term80200, term80200.getClass(), "currSize", 0L);
        setField(term80200, term80200.getClass(), "currName", null);
        setLongField(term80200, term80200.getClass(), "currBytes", 0L);
        setField(term80200, term80200.getClass(), "recordBuf", term80201);
        setIntField(term80200, term80200.getClass(), "assemLen", 0);
        setField(term80200, term80200.getClass(), "assemBuf", term80202);
        setField(term80203, term80203.getClass(), "inStream", null);
        setLongField(term80204, term80204.getClass(), "currSize", 0L);
        setField(term80204, term80204.getClass(), "currName", null);
        setLongField(term80204, term80204.getClass(), "currBytes", 0L);
        setField(term80204, term80204.getClass(), "recordBuf", null);
        setIntField(term80204, term80204.getClass(), "assemLen", 0);
        setField(term80204, term80204.getClass(), "assemBuf", null);
        setField(term80204, term80204.getClass(), "buffer", null);
        setIntField(term80204, term80204.getClass(), "longFileMode", 0);
        setBooleanField(term80204, term80204.getClass(), "closed", false);
        setField(term80204, term80204.getClass(), "out", null);
        setField(term80204, term80204.getClass(), "oneByte", null);
        setField(term80203, term80203.getClass(), "outStream", term80204);
        setField(term80203, term80203.getClass(), "blockBuffer", term80205);
        setIntField(term80203, term80203.getClass(), "currBlkIdx", 0);
        setIntField(term80203, term80203.getClass(), "currRecIdx", 0);
        setIntField(term80203, term80203.getClass(), "blockSize", 0);
        setIntField(term80203, term80203.getClass(), "recordSize", 512);
        setIntField(term80203, term80203.getClass(), "recsPerBlock", 0);
        setField(term80200, term80200.getClass(), "buffer", term80203);
        setIntField(term80200, term80200.getClass(), "longFileMode", 0);
        setBooleanField(term80200, term80200.getClass(), "closed", false);
        setField(term80200, term80200.getClass(), "out", term80204);
        setField(term80200, term80200.getClass(), "oneByte", term80206);
        term80207 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term80207, term80207.getClass(), "currSize", 0L);
        setField(term80207, term80207.getClass(), "currName", null);
        setLongField(term80207, term80207.getClass(), "currBytes", 0L);
        setField(term80207, term80207.getClass(), "recordBuf", null);
        setIntField(term80207, term80207.getClass(), "assemLen", 0);
        setField(term80207, term80207.getClass(), "assemBuf", null);
        setField(term80207, term80207.getClass(), "buffer", null);
        setIntField(term80207, term80207.getClass(), "longFileMode", 0);
        setBooleanField(term80207, term80207.getClass(), "closed", false);
        setField(term80207, term80207.getClass(), "out", null);
        setField(term80207, term80207.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term79136;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80200));
        assertTrue(recursiveEquals(term79136, 0));
    }

};


