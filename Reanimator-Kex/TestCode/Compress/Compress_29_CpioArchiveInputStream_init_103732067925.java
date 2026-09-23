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

public class CpioArchiveInputStream_init_103732067925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term31928;

    public CpioArchiveInputStream_init_103732067925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term31928 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term31929 = (byte[]) newByteArray(4096);
        byte[] term31930 = (byte[]) newByteArray(2);
        byte[] term31931 = (byte[]) newByteArray(4);
        byte[] term31932 = (byte[]) newByteArray(6);
        Object term31933 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term31936 = (byte[]) newByteArray(1);
        setBooleanField(term31928, term31928.getClass(), "closed", false);
        setField(term31928, term31928.getClass(), "entry", null);
        setLongField(term31928, term31928.getClass(), "entryBytesRead", 0L);
        setBooleanField(term31928, term31928.getClass(), "entryEOF", false);
        setField(term31928, term31928.getClass(), "tmpbuf", term31929);
        setLongField(term31928, term31928.getClass(), "crc", 0L);
        setField(term31928, term31928.getClass(), "in", null);
        setField(term31928, term31928.getClass(), "TWO_BYTES_BUF", term31930);
        setField(term31928, term31928.getClass(), "FOUR_BYTES_BUF", term31931);
        setField(term31928, term31928.getClass(), "SIX_BYTES_BUF", term31932);
        setIntField(term31928, term31928.getClass(), "blockSize", 1162663216);
        setField(term31933, term31933.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term31928, term31928.getClass(), "zipEncoding", term31933);
        setField(term31928, term31928.getClass(), "SINGLE", term31936);
        setLongField(term31928, term31928.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31928));
        assertTrue(recursiveEquals(term25, null));
    }

};


