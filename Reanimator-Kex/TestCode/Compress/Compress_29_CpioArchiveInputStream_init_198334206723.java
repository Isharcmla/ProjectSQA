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

public class CpioArchiveInputStream_init_198334206723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14742;

    public CpioArchiveInputStream_init_198334206723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14742 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        byte[] term14743 = (byte[]) newByteArray(4096);
        byte[] term14744 = (byte[]) newByteArray(2);
        byte[] term14745 = (byte[]) newByteArray(4);
        byte[] term14746 = (byte[]) newByteArray(6);
        Object term14747 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term14750 = (byte[]) newByteArray(1);
        setBooleanField(term14742, term14742.getClass(), "closed", false);
        setField(term14742, term14742.getClass(), "entry", null);
        setLongField(term14742, term14742.getClass(), "entryBytesRead", 0L);
        setBooleanField(term14742, term14742.getClass(), "entryEOF", false);
        setField(term14742, term14742.getClass(), "tmpbuf", term14743);
        setLongField(term14742, term14742.getClass(), "crc", 0L);
        setField(term14742, term14742.getClass(), "in", null);
        setField(term14742, term14742.getClass(), "TWO_BYTES_BUF", term14744);
        setField(term14742, term14742.getClass(), "FOUR_BYTES_BUF", term14745);
        setField(term14742, term14742.getClass(), "SIX_BYTES_BUF", term14746);
        setIntField(term14742, term14742.getClass(), "blockSize", 512);
        setField(term14747, term14747.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term14742, term14742.getClass(), "zipEncoding", term14747);
        setField(term14742, term14742.getClass(), "SINGLE", term14750);
        setLongField(term14742, term14742.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14742));
    }

};


