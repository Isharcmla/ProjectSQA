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

public class TarArchiveInputStream_init_34637516132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7296;

    public TarArchiveInputStream_init_34637516132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7296 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term7297 = (byte[]) newByteArray(256);
        Object term7298 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term7301 = (byte[]) newByteArray(1);
        setField(term7296, term7296.getClass(), "SMALL_BUF", term7297);
        setIntField(term7296, term7296.getClass(), "recordSize", 512);
        setIntField(term7296, term7296.getClass(), "blockSize", 10240);
        setBooleanField(term7296, term7296.getClass(), "hasHitEOF", false);
        setLongField(term7296, term7296.getClass(), "entrySize", 0L);
        setLongField(term7296, term7296.getClass(), "entryOffset", 0L);
        setField(term7296, term7296.getClass(), "is", null);
        setField(term7296, term7296.getClass(), "currEntry", null);
        setField(term7298, term7298.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term7296, term7296.getClass(), "encoding", term7298);
        setField(term7296, term7296.getClass(), "SINGLE", term7301);
        setLongField(term7296, term7296.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7296));
    }

};


