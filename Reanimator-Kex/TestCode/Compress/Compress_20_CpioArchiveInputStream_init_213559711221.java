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

public class CpioArchiveInputStream_init_213559711221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14019;

    public CpioArchiveInputStream_init_213559711221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term14019 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term14020 = (byte[]) newByteArray(4096);
        byte[] term14021 = (byte[]) newByteArray(2);
        byte[] term14022 = (byte[]) newByteArray(4);
        byte[] term14023 = (byte[]) newByteArray(6);
        byte[] term14024 = (byte[]) newByteArray(1);
        setBooleanField(term14019, term14019.getClass(), "closed", false);
        setField(term14019, term14019.getClass(), "entry", null);
        setLongField(term14019, term14019.getClass(), "entryBytesRead", 0L);
        setBooleanField(term14019, term14019.getClass(), "entryEOF", false);
        setField(term14019, term14019.getClass(), "tmpbuf", term14020);
        setLongField(term14019, term14019.getClass(), "crc", 0L);
        setField(term14019, term14019.getClass(), "in", null);
        setField(term14019, term14019.getClass(), "TWO_BYTES_BUF", term14021);
        setField(term14019, term14019.getClass(), "FOUR_BYTES_BUF", term14022);
        setField(term14019, term14019.getClass(), "SIX_BYTES_BUF", term14023);
        setIntField(term14019, term14019.getClass(), "blockSize", 568599855);
        setField(term14019, term14019.getClass(), "SINGLE", term14024);
        setLongField(term14019, term14019.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14019));
        assertTrue(recursiveEquals(term1, 568599855));
    }

};


