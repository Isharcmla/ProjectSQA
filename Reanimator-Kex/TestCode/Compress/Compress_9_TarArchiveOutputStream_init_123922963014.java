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

public class TarArchiveOutputStream_init_123922963014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term54155;

    public TarArchiveOutputStream_init_123922963014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term54155 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54156 = (byte[]) newByteArray(512);
        byte[] term54157 = (byte[]) newByteArray(512);
        Object term54158 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term54159 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term54160 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term54161 = newInstance(Class.forName("java.lang.Object"));
        byte[] term54162 = (byte[]) newByteArray(568599855);
        byte[] term54163 = (byte[]) newByteArray(1);
        setLongField(term54155, term54155.getClass(), "currSize", 0L);
        setField(term54155, term54155.getClass(), "currName", null);
        setLongField(term54155, term54155.getClass(), "currBytes", 0L);
        setField(term54155, term54155.getClass(), "recordBuf", term54156);
        setIntField(term54155, term54155.getClass(), "assemLen", 0);
        setField(term54155, term54155.getClass(), "assemBuf", term54157);
        setField(term54158, term54158.getClass(), "inStream", null);
        setLongField(term54160, term54160.getClass(), "value", 0L);
        setField(term54159, term54159.getClass(), "bytesWritten", term54160);
        setField(term54159, term54159.getClass(), "out", null);
        setBooleanField(term54159, term54159.getClass(), "closed", false);
        setField(term54159, term54159.getClass(), "closeLock", term54161);
        setField(term54158, term54158.getClass(), "outStream", term54159);
        setField(term54158, term54158.getClass(), "blockBuffer", term54162);
        setIntField(term54158, term54158.getClass(), "currBlkIdx", 0);
        setIntField(term54158, term54158.getClass(), "currRecIdx", 0);
        setIntField(term54158, term54158.getClass(), "blockSize", 568599855);
        setIntField(term54158, term54158.getClass(), "recordSize", 512);
        setIntField(term54158, term54158.getClass(), "recsPerBlock", 1110546);
        setField(term54155, term54155.getClass(), "buffer", term54158);
        setIntField(term54155, term54155.getClass(), "longFileMode", 0);
        setBooleanField(term54155, term54155.getClass(), "closed", false);
        setBooleanField(term54155, term54155.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term54155, term54155.getClass(), "finished", false);
        setField(term54155, term54155.getClass(), "out", term54159);
        setField(term54155, term54155.getClass(), "oneByte", term54163);
        setLongField(term54155, term54155.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54155));
        assertTrue(recursiveEquals(term1, 568599855));
    }

};


