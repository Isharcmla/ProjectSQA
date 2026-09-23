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

public class CpioArchiveInputStream_init_178483478620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5782;

    public CpioArchiveInputStream_init_178483478620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5782 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term5783 = (byte[]) newByteArray(4096);
        byte[] term5784 = (byte[]) newByteArray(2);
        byte[] term5785 = (byte[]) newByteArray(4);
        byte[] term5786 = (byte[]) newByteArray(6);
        byte[] term5787 = (byte[]) newByteArray(1);
        setBooleanField(term5782, term5782.getClass(), "closed", false);
        setField(term5782, term5782.getClass(), "entry", null);
        setLongField(term5782, term5782.getClass(), "entryBytesRead", 0L);
        setBooleanField(term5782, term5782.getClass(), "entryEOF", false);
        setField(term5782, term5782.getClass(), "tmpbuf", term5783);
        setLongField(term5782, term5782.getClass(), "crc", 0L);
        setField(term5782, term5782.getClass(), "in", null);
        setField(term5782, term5782.getClass(), "TWO_BYTES_BUF", term5784);
        setField(term5782, term5782.getClass(), "FOUR_BYTES_BUF", term5785);
        setField(term5782, term5782.getClass(), "SIX_BYTES_BUF", term5786);
        setIntField(term5782, term5782.getClass(), "blockSize", 512);
        setField(term5782, term5782.getClass(), "SINGLE", term5787);
        setLongField(term5782, term5782.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5782));
    }

};


