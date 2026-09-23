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

public class TarArchiveOutputStream_init_123922963036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term9434;

    public TarArchiveOutputStream_init_123922963036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term9434 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term9435 = (byte[]) newByteArray(512);
        byte[] term9436 = (byte[]) newByteArray(512);
        Object term9437 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term9438 = newInstance(Class.forName("java.lang.Object"));
        Object term9439 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term9442 = (byte[]) newByteArray(1);
        setLongField(term9434, term9434.getClass(), "currSize", 0L);
        setField(term9434, term9434.getClass(), "currName", null);
        setLongField(term9434, term9434.getClass(), "currBytes", 0L);
        setField(term9434, term9434.getClass(), "recordBuf", term9435);
        setIntField(term9434, term9434.getClass(), "assemLen", 0);
        setField(term9434, term9434.getClass(), "assemBuf", term9436);
        setIntField(term9434, term9434.getClass(), "longFileMode", 0);
        setIntField(term9434, term9434.getClass(), "bigNumberMode", 0);
        setIntField(term9434, term9434.getClass(), "recordsWritten", 0);
        setIntField(term9434, term9434.getClass(), "recordsPerBlock", 1110546);
        setIntField(term9434, term9434.getClass(), "recordSize", 512);
        setBooleanField(term9434, term9434.getClass(), "closed", false);
        setBooleanField(term9434, term9434.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term9434, term9434.getClass(), "finished", false);
        setLongField(term9437, term9437.getClass(), "bytesWritten", 0L);
        setField(term9437, term9437.getClass(), "out", null);
        setBooleanField(term9437, term9437.getClass(), "closed", false);
        setField(term9437, term9437.getClass(), "closeLock", term9438);
        setField(term9434, term9434.getClass(), "out", term9437);
        setField(term9439, term9439.getClass(), "charsetName", "UTF8");
        setField(term9434, term9434.getClass(), "zipEncoding", term9439);
        setBooleanField(term9434, term9434.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term9434, term9434.getClass(), "oneByte", term9442);
        setLongField(term9434, term9434.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9434));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


