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

public class TarArchiveOutputStream_init_165132866638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term51;
     Object term33446;

    public TarArchiveOutputStream_init_165132866638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new Integer(1484323161);
        term51 = new Integer(391863371);
        term33446 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term33447 = (byte[]) newByteArray(391863371);
        byte[] term33448 = (byte[]) newByteArray(391863371);
        Object term33817 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term33818 = newInstance(Class.forName("java.lang.Object"));
        Object term33819 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term33822 = (byte[]) newByteArray(1);
        setLongField(term33446, term33446.getClass(), "currSize", 0L);
        setField(term33446, term33446.getClass(), "currName", null);
        setLongField(term33446, term33446.getClass(), "currBytes", 0L);
        setField(term33446, term33446.getClass(), "recordBuf", term33447);
        setIntField(term33446, term33446.getClass(), "assemLen", 0);
        setField(term33446, term33446.getClass(), "assemBuf", term33448);
        setIntField(term33446, term33446.getClass(), "longFileMode", 0);
        setIntField(term33446, term33446.getClass(), "bigNumberMode", 0);
        setIntField(term33446, term33446.getClass(), "recordsWritten", 0);
        setIntField(term33446, term33446.getClass(), "recordsPerBlock", 3);
        setIntField(term33446, term33446.getClass(), "recordSize", 391863371);
        setBooleanField(term33446, term33446.getClass(), "closed", false);
        setBooleanField(term33446, term33446.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term33446, term33446.getClass(), "finished", false);
        setLongField(term33817, term33817.getClass(), "bytesWritten", 0L);
        setField(term33817, term33817.getClass(), "out", null);
        setBooleanField(term33817, term33817.getClass(), "closed", false);
        setField(term33817, term33817.getClass(), "closeLock", term33818);
        setField(term33446, term33446.getClass(), "out", term33817);
        setField(term33819, term33819.getClass(), "charsetName", "UTF8");
        setField(term33446, term33446.getClass(), "zipEncoding", term33819);
        setBooleanField(term33446, term33446.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term33446, term33446.getClass(), "oneByte", term33822);
        setLongField(term33446, term33446.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49;
        args[2] = term51;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33446));
        assertTrue(recursiveEquals(term49, 1484323161));
        assertTrue(recursiveEquals(term51, 391863371));
    }

};


