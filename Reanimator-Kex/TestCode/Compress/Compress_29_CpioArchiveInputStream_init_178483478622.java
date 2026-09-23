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

public class CpioArchiveInputStream_init_178483478622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6194;

    public CpioArchiveInputStream_init_178483478622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6194 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term6195 = (byte[]) newByteArray(4096);
        byte[] term6196 = (byte[]) newByteArray(2);
        byte[] term6197 = (byte[]) newByteArray(4);
        byte[] term6198 = (byte[]) newByteArray(6);
        Object term6199 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term6200 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term6203 = (Object[]) newArray("java.lang.String", 14);
        byte[] term6218 = (byte[]) newByteArray(1);
        setBooleanField(term6194, term6194.getClass(), "closed", false);
        setField(term6194, term6194.getClass(), "entry", null);
        setLongField(term6194, term6194.getClass(), "entryBytesRead", 0L);
        setBooleanField(term6194, term6194.getClass(), "entryEOF", false);
        setField(term6194, term6194.getClass(), "tmpbuf", term6195);
        setLongField(term6194, term6194.getClass(), "crc", 0L);
        setField(term6194, term6194.getClass(), "in", null);
        setField(term6194, term6194.getClass(), "TWO_BYTES_BUF", term6196);
        setField(term6194, term6194.getClass(), "FOUR_BYTES_BUF", term6197);
        setField(term6194, term6194.getClass(), "SIX_BYTES_BUF", term6198);
        setIntField(term6194, term6194.getClass(), "blockSize", 512);
        setField(term6200, term6200.getClass(), "name", "US-ASCII");
        setElement(term6203, 0, "");
        setElement(term6203, 1, "");
        setElement(term6203, 2, "");
        setElement(term6203, 3, "");
        setElement(term6203, 4, "");
        setElement(term6203, 5, "");
        setElement(term6203, 6, "");
        setElement(term6203, 7, "");
        setElement(term6203, 8, "");
        setElement(term6203, 9, "");
        setElement(term6203, 10, "");
        setElement(term6203, 11, "");
        setElement(term6203, 12, "");
        setElement(term6203, 13, "");
        setField(term6200, term6200.getClass(), "aliases", term6203);
        setField(term6200, term6200.getClass(), "aliasSet", null);
        setField(term6199, term6199.getClass(), "charset", term6200);
        setField(term6194, term6194.getClass(), "zipEncoding", term6199);
        setField(term6194, term6194.getClass(), "SINGLE", term6218);
        setLongField(term6194, term6194.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6194));
    }

};


