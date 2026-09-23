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
import java.lang.Integer;
import java.lang.Object;

public class CpioArchiveInputStream_init_213559711224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term23380;

    public CpioArchiveInputStream_init_213559711224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term23380 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term23381 = (byte[]) newByteArray(4096);
        byte[] term23382 = (byte[]) newByteArray(2);
        byte[] term23383 = (byte[]) newByteArray(4);
        byte[] term23384 = (byte[]) newByteArray(6);
        Object term23385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term23386 = newInstance(Class.forName("sun.nio.cs.US_ASCII"));
        Object[] term23389 = (Object[]) newArray("java.lang.String", 14);
        byte[] term23404 = (byte[]) newByteArray(1);
        setBooleanField(term23380, term23380.getClass(), "closed", false);
        setField(term23380, term23380.getClass(), "entry", null);
        setLongField(term23380, term23380.getClass(), "entryBytesRead", 0L);
        setBooleanField(term23380, term23380.getClass(), "entryEOF", false);
        setField(term23380, term23380.getClass(), "tmpbuf", term23381);
        setLongField(term23380, term23380.getClass(), "crc", 0L);
        setField(term23380, term23380.getClass(), "in", null);
        setField(term23380, term23380.getClass(), "TWO_BYTES_BUF", term23382);
        setField(term23380, term23380.getClass(), "FOUR_BYTES_BUF", term23383);
        setField(term23380, term23380.getClass(), "SIX_BYTES_BUF", term23384);
        setIntField(term23380, term23380.getClass(), "blockSize", 568599855);
        setField(term23386, term23386.getClass(), "name", "US-ASCII");
        setElement(term23389, 0, "");
        setElement(term23389, 1, "");
        setElement(term23389, 2, "");
        setElement(term23389, 3, "");
        setElement(term23389, 4, "");
        setElement(term23389, 5, "");
        setElement(term23389, 6, "");
        setElement(term23389, 7, "");
        setElement(term23389, 8, "");
        setElement(term23389, 9, "");
        setElement(term23389, 10, "");
        setElement(term23389, 11, "");
        setElement(term23389, 12, "");
        setElement(term23389, 13, "");
        setField(term23386, term23386.getClass(), "aliases", term23389);
        setField(term23386, term23386.getClass(), "aliasSet", null);
        setField(term23385, term23385.getClass(), "charset", term23386);
        setField(term23380, term23380.getClass(), "zipEncoding", term23385);
        setField(term23380, term23380.getClass(), "SINGLE", term23404);
        setLongField(term23380, term23380.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23380));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


