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

public class TarArchiveOutputStream_init_1086974585197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107579;
     Object term108662;
     Object term108672;

    public TarArchiveOutputStream_init_1086974585197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107311 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term107449 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term107311, term107311.getClass(), "oneByte", null);
        setLongField(term107311, term107311.getClass(), "bytesWritten", 0L);
        setIntField(term107311, term107311.getClass(), "longFileMode", 0);
        setIntField(term107311, term107311.getClass(), "bigNumberMode", 0);
        setBooleanField(term107311, term107311.getClass(), "closed", false);
        setBooleanField(term107311, term107311.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term107311, term107311.getClass(), "finished", false);
        setBooleanField(term107311, term107311.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term107311, term107311.getClass(), "out", term107449);
        term107579 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        term108662 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term108663 = (byte[]) newByteArray(512);
        byte[] term108664 = (byte[]) newByteArray(512);
        Object term108665 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term108666 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        Object term108667 = newInstance(Class.forName("java.lang.Object"));
        Object term108668 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term108671 = (byte[]) newByteArray(1);
        setLongField(term108662, term108662.getClass(), "currSize", 0L);
        setField(term108662, term108662.getClass(), "currName", null);
        setLongField(term108662, term108662.getClass(), "currBytes", 0L);
        setField(term108662, term108662.getClass(), "recordBuf", term108663);
        setIntField(term108662, term108662.getClass(), "assemLen", 0);
        setField(term108662, term108662.getClass(), "assemBuf", term108664);
        setIntField(term108662, term108662.getClass(), "longFileMode", 0);
        setIntField(term108662, term108662.getClass(), "bigNumberMode", 0);
        setIntField(term108662, term108662.getClass(), "recordsWritten", 0);
        setIntField(term108662, term108662.getClass(), "recordsPerBlock", 20);
        setIntField(term108662, term108662.getClass(), "recordSize", 512);
        setBooleanField(term108662, term108662.getClass(), "closed", false);
        setBooleanField(term108662, term108662.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term108662, term108662.getClass(), "finished", false);
        setLongField(term108665, term108665.getClass(), "bytesWritten", 0L);
        setField(term108666, term108666.getClass(), "out", null);
        setLongField(term108666, term108666.getClass(), "entryOffset", 0L);
        setField(term108666, term108666.getClass(), "prevEntry", null);
        setBooleanField(term108666, term108666.getClass(), "haveUnclosedEntry", false);
        setIntField(term108666, term108666.getClass(), "longFileMode", 0);
        setBooleanField(term108666, term108666.getClass(), "finished", false);
        setField(term108666, term108666.getClass(), "oneByte", null);
        setLongField(term108666, term108666.getClass(), "bytesWritten", 0L);
        setField(term108665, term108665.getClass(), "out", term108666);
        setBooleanField(term108665, term108665.getClass(), "closed", false);
        setField(term108665, term108665.getClass(), "closeLock", term108667);
        setField(term108662, term108662.getClass(), "out", term108665);
        setField(term108668, term108668.getClass(), "charsetName", "UTF8");
        setField(term108662, term108662.getClass(), "zipEncoding", term108668);
        setBooleanField(term108662, term108662.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term108662, term108662.getClass(), "oneByte", term108671);
        setLongField(term108662, term108662.getClass(), "bytesWritten", 0L);
        term108672 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream"));
        setField(term108672, term108672.getClass(), "out", null);
        setLongField(term108672, term108672.getClass(), "entryOffset", 0L);
        setField(term108672, term108672.getClass(), "prevEntry", null);
        setBooleanField(term108672, term108672.getClass(), "haveUnclosedEntry", false);
        setIntField(term108672, term108672.getClass(), "longFileMode", 0);
        setBooleanField(term108672, term108672.getClass(), "finished", false);
        setField(term108672, term108672.getClass(), "oneByte", null);
        setLongField(term108672, term108672.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term107579;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term108662));
        assertTrue(recursiveEquals(term107579, term108672));
    }

};


