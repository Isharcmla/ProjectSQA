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

public class TarArchiveInputStream_init_34637516134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7732;

    public TarArchiveInputStream_init_34637516134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7732 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term7733 = (byte[]) newByteArray(256);
        Object term7734 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term7737 = (byte[]) newByteArray(1);
        setField(term7732, term7732.getClass(), "SMALL_BUF", term7733);
        setIntField(term7732, term7732.getClass(), "recordSize", 512);
        setIntField(term7732, term7732.getClass(), "blockSize", 10240);
        setBooleanField(term7732, term7732.getClass(), "hasHitEOF", false);
        setLongField(term7732, term7732.getClass(), "entrySize", 0L);
        setLongField(term7732, term7732.getClass(), "entryOffset", 0L);
        setField(term7732, term7732.getClass(), "is", null);
        setField(term7732, term7732.getClass(), "currEntry", null);
        setField(term7734, term7734.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term7732, term7732.getClass(), "zipEncoding", term7734);
        setField(term7732, term7732.getClass(), "SINGLE", term7737);
        setLongField(term7732, term7732.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term7732));
    }

};


