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

public class TarArchiveOutputStream_init_108697458535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7298;

    public TarArchiveOutputStream_init_108697458535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7298 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term7299 = (byte[]) newByteArray(512);
        byte[] term7300 = (byte[]) newByteArray(512);
        Object term7301 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term7302 = newInstance(Class.forName("java.lang.Object"));
        Object term7303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term7306 = (byte[]) newByteArray(1);
        setLongField(term7298, term7298.getClass(), "currSize", 0L);
        setField(term7298, term7298.getClass(), "currName", null);
        setLongField(term7298, term7298.getClass(), "currBytes", 0L);
        setField(term7298, term7298.getClass(), "recordBuf", term7299);
        setIntField(term7298, term7298.getClass(), "assemLen", 0);
        setField(term7298, term7298.getClass(), "assemBuf", term7300);
        setIntField(term7298, term7298.getClass(), "longFileMode", 0);
        setIntField(term7298, term7298.getClass(), "bigNumberMode", 0);
        setIntField(term7298, term7298.getClass(), "recordsWritten", 0);
        setIntField(term7298, term7298.getClass(), "recordsPerBlock", 20);
        setIntField(term7298, term7298.getClass(), "recordSize", 512);
        setBooleanField(term7298, term7298.getClass(), "closed", false);
        setBooleanField(term7298, term7298.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term7298, term7298.getClass(), "finished", false);
        setLongField(term7301, term7301.getClass(), "bytesWritten", 0L);
        setField(term7301, term7301.getClass(), "out", null);
        setBooleanField(term7301, term7301.getClass(), "closed", false);
        setField(term7301, term7301.getClass(), "closeLock", term7302);
        setField(term7298, term7298.getClass(), "out", term7301);
        setField(term7303, term7303.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term7298, term7298.getClass(), "zipEncoding", term7303);
        setBooleanField(term7298, term7298.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term7298, term7298.getClass(), "oneByte", term7306);
        setLongField(term7298, term7298.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7298));
    }

};


