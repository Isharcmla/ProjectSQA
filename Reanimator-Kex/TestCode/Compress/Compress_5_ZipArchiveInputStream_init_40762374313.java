package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Object;

public class ZipArchiveInputStream_init_40762374313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term9315;

    public ZipArchiveInputStream_init_40762374313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Boolean(false);
        term9315 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term9316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term9319 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term9320 = (byte[]) newByteArray(512);
        Object term9321 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term9322 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term9323 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term9324 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term9325 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term9326 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term9327 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9328 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term9329 = (byte[]) newByteArray(0);
        Object term9330 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term9331 = (byte[]) newByteArray(512);
        byte[] term9332 = (byte[]) newByteArray(1);
        setField(term9316, term9316.getClass(), "charset", "PAEBtnZtTD");
        setField(term9315, term9315.getClass(), "zipEncoding", term9316);
        setBooleanField(term9315, term9315.getClass(), "useUnicodeExtraFields", false);
        setField(term9319, term9319.getClass(), "buf", term9320);
        setIntField(term9319, term9319.getClass(), "pos", 512);
        setField(term9319, term9319.getClass(), "in", null);
        setField(term9315, term9315.getClass(), "in", term9319);
        setLongField(term9322, term9322.getClass(), "address", 137029658424976L);
        setField(term9323, term9323.getClass(), "action", term9322);
        setField(term9324, term9324.getClass(), "action", null);
        setField(term9324, term9324.getClass(), "prev", null);
        setField(term9324, term9324.getClass(), "next", term9323);
        setField(term9324, term9324.getClass(), "list", null);
        setField(term9324, term9324.getClass(), "referent", null);
        setField(term9324, term9324.getClass(), "queue", null);
        setField(term9324, term9324.getClass(), "next", null);
        setField(term9324, term9324.getClass(), "discovered", null);
        setField(term9323, term9323.getClass(), "prev", term9324);
        setField(term9325, term9325.getClass(), "action", null);
        setField(term9325, term9325.getClass(), "prev", term9323);
        setField(term9325, term9325.getClass(), "next", null);
        setField(term9325, term9325.getClass(), "list", null);
        setField(term9325, term9325.getClass(), "referent", null);
        setField(term9325, term9325.getClass(), "queue", null);
        setField(term9325, term9325.getClass(), "next", null);
        setField(term9325, term9325.getClass(), "discovered", null);
        setField(term9323, term9323.getClass(), "next", term9325);
        setField(term9326, term9326.getClass(), "action", null);
        setField(term9326, term9326.getClass(), "prev", null);
        setField(term9326, term9326.getClass(), "next", null);
        setField(term9326, term9326.getClass(), "list", term9326);
        setField(term9326, term9326.getClass(), "referent", null);
        setField(term9326, term9326.getClass(), "queue", null);
        setField(term9326, term9326.getClass(), "next", null);
        setField(term9326, term9326.getClass(), "discovered", null);
        setField(term9323, term9323.getClass(), "list", term9326);
        setField(term9323, term9323.getClass(), "referent", term9321);
        setField(term9327, term9327.getClass(), "lock", null);
        setField(term9327, term9327.getClass(), "head", null);
        setLongField(term9327, term9327.getClass(), "queueLength", 0L);
        setField(term9323, term9323.getClass(), "queue", term9327);
        setField(term9323, term9323.getClass(), "next", null);
        setField(term9323, term9323.getClass(), "discovered", null);
        setField(term9322, term9322.getClass(), "cleanable", term9323);
        setField(term9321, term9321.getClass(), "zsRef", term9322);
        setField(term9328, term9328.getClass(), "hb", term9329);
        setIntField(term9328, term9328.getClass(), "offset", 0);
        setBooleanField(term9328, term9328.getClass(), "isReadOnly", false);
        setBooleanField(term9328, term9328.getClass(), "bigEndian", true);
        setBooleanField(term9328, term9328.getClass(), "nativeByteOrder", false);
        setIntField(term9328, term9328.getClass(), "mark", -1);
        setIntField(term9328, term9328.getClass(), "position", 0);
        setIntField(term9328, term9328.getClass(), "limit", 0);
        setIntField(term9328, term9328.getClass(), "capacity", 0);
        setLongField(term9328, term9328.getClass(), "address", 16L);
        setField(term9321, term9321.getClass(), "input", term9328);
        setField(term9321, term9321.getClass(), "inputArray", null);
        setIntField(term9321, term9321.getClass(), "inputPos", 0);
        setIntField(term9321, term9321.getClass(), "inputLim", 0);
        setBooleanField(term9321, term9321.getClass(), "finished", false);
        setBooleanField(term9321, term9321.getClass(), "needDict", false);
        setLongField(term9321, term9321.getClass(), "bytesRead", 0L);
        setLongField(term9321, term9321.getClass(), "bytesWritten", 0L);
        setIntField(term9321, term9321.getClass(), "inputConsumed", 0);
        setIntField(term9321, term9321.getClass(), "outputConsumed", 0);
        setField(term9315, term9315.getClass(), "inf", term9321);
        setIntField(term9330, term9330.getClass(), "crc", 0);
        setField(term9315, term9315.getClass(), "crc", term9330);
        setField(term9315, term9315.getClass(), "buf", term9331);
        setField(term9315, term9315.getClass(), "current", null);
        setBooleanField(term9315, term9315.getClass(), "closed", false);
        setBooleanField(term9315, term9315.getClass(), "hitCentralDirectory", false);
        setIntField(term9315, term9315.getClass(), "readBytesOfEntry", 0);
        setIntField(term9315, term9315.getClass(), "offsetInBuffer", 0);
        setIntField(term9315, term9315.getClass(), "bytesReadFromStream", 0);
        setIntField(term9315, term9315.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term9315, term9315.getClass(), "hasDataDescriptor", false);
        setField(term9315, term9315.getClass(), "SINGLE", term9332);
        setIntField(term9315, term9315.getClass(), "bytesRead", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = term13;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9315));
        assertTrue(recursiveEquals(term13, false));
    }

};


