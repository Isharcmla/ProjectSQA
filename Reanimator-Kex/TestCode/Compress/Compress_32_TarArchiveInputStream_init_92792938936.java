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

public class TarArchiveInputStream_init_92792938936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term9738;

    public TarArchiveInputStream_init_92792938936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term9738 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term9739 = (byte[]) newByteArray(256);
        Object term9740 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term9745 = (byte[]) newByteArray(1);
        setField(term9738, term9738.getClass(), "SMALL_BUF", term9739);
        setIntField(term9738, term9738.getClass(), "recordSize", 512);
        setIntField(term9738, term9738.getClass(), "blockSize", 1162663216);
        setBooleanField(term9738, term9738.getClass(), "hasHitEOF", false);
        setLongField(term9738, term9738.getClass(), "entrySize", 0L);
        setLongField(term9738, term9738.getClass(), "entryOffset", 0L);
        setField(term9738, term9738.getClass(), "is", null);
        setField(term9738, term9738.getClass(), "currEntry", null);
        setField(term9740, term9740.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term9738, term9738.getClass(), "zipEncoding", term9740);
        setField(term9738, term9738.getClass(), "encoding", "sjlJAEtRrb");
        setField(term9738, term9738.getClass(), "SINGLE", term9745);
        setLongField(term9738, term9738.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9738));
        assertTrue(recursiveEquals(term25, null));
    }

};


