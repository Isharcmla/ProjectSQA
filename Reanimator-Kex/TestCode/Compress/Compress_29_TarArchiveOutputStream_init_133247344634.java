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

public class TarArchiveOutputStream_init_133247344634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4926;

    public TarArchiveOutputStream_init_133247344634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4926 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term4927 = (byte[]) newByteArray(512);
        byte[] term4928 = (byte[]) newByteArray(512);
        Object term4929 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term4930 = newInstance(Class.forName("java.lang.Object"));
        Object term4931 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term4934 = (byte[]) newByteArray(1);
        setLongField(term4926, term4926.getClass(), "currSize", 0L);
        setField(term4926, term4926.getClass(), "currName", null);
        setLongField(term4926, term4926.getClass(), "currBytes", 0L);
        setField(term4926, term4926.getClass(), "recordBuf", term4927);
        setIntField(term4926, term4926.getClass(), "assemLen", 0);
        setField(term4926, term4926.getClass(), "assemBuf", term4928);
        setIntField(term4926, term4926.getClass(), "longFileMode", 0);
        setIntField(term4926, term4926.getClass(), "bigNumberMode", 0);
        setIntField(term4926, term4926.getClass(), "recordsWritten", 0);
        setIntField(term4926, term4926.getClass(), "recordsPerBlock", 20);
        setIntField(term4926, term4926.getClass(), "recordSize", 512);
        setBooleanField(term4926, term4926.getClass(), "closed", false);
        setBooleanField(term4926, term4926.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term4926, term4926.getClass(), "finished", false);
        setLongField(term4929, term4929.getClass(), "bytesWritten", 0L);
        setField(term4929, term4929.getClass(), "out", null);
        setBooleanField(term4929, term4929.getClass(), "closed", false);
        setField(term4929, term4929.getClass(), "closeLock", term4930);
        setField(term4926, term4926.getClass(), "out", term4929);
        setField(term4931, term4931.getClass(), "charsetName", "UTF8");
        setField(term4926, term4926.getClass(), "zipEncoding", term4931);
        setBooleanField(term4926, term4926.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term4926, term4926.getClass(), "oneByte", term4934);
        setLongField(term4926, term4926.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4926));
    }

};


