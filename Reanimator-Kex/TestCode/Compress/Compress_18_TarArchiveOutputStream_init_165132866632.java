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
import java.lang.Integer;
import java.lang.Object;

public class TarArchiveOutputStream_init_165132866632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term51;
     Object term172200;

    public TarArchiveOutputStream_init_165132866632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new Integer(1484323161);
        term51 = new Integer(391863371);
        term172200 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term172201 = (byte[]) newByteArray(391863371);
        byte[] term172202 = (byte[]) newByteArray(391863371);
        Object term172203 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term172204 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term172205 = newInstance(Class.forName("java.lang.Object"));
        byte[] term172206 = (byte[]) newByteArray(1484323161);
        Object term172576 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term172579 = (byte[]) newByteArray(1);
        setLongField(term172200, term172200.getClass(), "currSize", 0L);
        setField(term172200, term172200.getClass(), "currName", null);
        setLongField(term172200, term172200.getClass(), "currBytes", 0L);
        setField(term172200, term172200.getClass(), "recordBuf", term172201);
        setIntField(term172200, term172200.getClass(), "assemLen", 0);
        setField(term172200, term172200.getClass(), "assemBuf", term172202);
        setField(term172203, term172203.getClass(), "inStream", null);
        setLongField(term172204, term172204.getClass(), "bytesWritten", 0L);
        setField(term172204, term172204.getClass(), "out", null);
        setBooleanField(term172204, term172204.getClass(), "closed", false);
        setField(term172204, term172204.getClass(), "closeLock", term172205);
        setField(term172203, term172203.getClass(), "outStream", term172204);
        setIntField(term172203, term172203.getClass(), "blockSize", 1484323161);
        setIntField(term172203, term172203.getClass(), "recordSize", 391863371);
        setIntField(term172203, term172203.getClass(), "recsPerBlock", 3);
        setField(term172203, term172203.getClass(), "blockBuffer", term172206);
        setIntField(term172203, term172203.getClass(), "currBlkIdx", 0);
        setIntField(term172203, term172203.getClass(), "currRecIdx", 0);
        setField(term172200, term172200.getClass(), "buffer", term172203);
        setIntField(term172200, term172200.getClass(), "longFileMode", 0);
        setIntField(term172200, term172200.getClass(), "bigNumberMode", 0);
        setBooleanField(term172200, term172200.getClass(), "closed", false);
        setBooleanField(term172200, term172200.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term172200, term172200.getClass(), "finished", false);
        setField(term172200, term172200.getClass(), "out", term172204);
        setField(term172576, term172576.getClass(), "charset", "UTF8");
        setField(term172200, term172200.getClass(), "encoding", term172576);
        setBooleanField(term172200, term172200.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term172200, term172200.getClass(), "oneByte", term172579);
        setLongField(term172200, term172200.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49;
        args[2] = term51;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term172200));
        assertTrue(recursiveEquals(term49, 1484323161));
        assertTrue(recursiveEquals(term51, 391863371));
    }

};


