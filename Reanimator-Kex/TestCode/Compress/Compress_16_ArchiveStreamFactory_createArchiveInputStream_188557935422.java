package org.apache.commons.compress.archivers;

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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.EqualityUtils.*;
import java.lang.Object;

public class ArchiveStreamFactory_createArchiveInputStream_188557935422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4275;
     Object term4445;
     Object term51694;
     Object term51695;
     Object term50612;

    public ArchiveStreamFactory_createArchiveInputStream_188557935422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4275 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term4445 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        term51694 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term51695 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term51695, term51695.getClass(), "zipEncoding", null);
        setBooleanField(term51695, term51695.getClass(), "useUnicodeExtraFields", false);
        setField(term51695, term51695.getClass(), "in", null);
        setField(term51695, term51695.getClass(), "inf", null);
        setField(term51695, term51695.getClass(), "crc", null);
        setField(term51695, term51695.getClass(), "buf", null);
        setField(term51695, term51695.getClass(), "current", null);
        setBooleanField(term51695, term51695.getClass(), "closed", false);
        setBooleanField(term51695, term51695.getClass(), "hitCentralDirectory", false);
        setField(term51695, term51695.getClass(), "lastStoredEntry", null);
        setBooleanField(term51695, term51695.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term51695, term51695.getClass(), "SINGLE", null);
        setLongField(term51695, term51695.getClass(), "bytesRead", 0L);
        term50612 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term50613 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term50621 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term50622 = (byte[]) newByteArray(512);
        Object term50604 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        Object term51136 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term51137 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term51139 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term51140 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term51141 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term51142 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term51143 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51145 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term51146 = (byte[]) newByteArray(0);
        Object term51164 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term51166 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$Buffer"));
        byte[] term51167 = (byte[]) newByteArray(512);
        byte[] term51685 = (byte[]) newByteArray(1);
        setField(term50613, term50613.getClass(), "charset", "UTF8");
        setField(term50612, term50612.getClass(), "zipEncoding", term50613);
        setBooleanField(term50612, term50612.getClass(), "useUnicodeExtraFields", true);
        setField(term50621, term50621.getClass(), "buf", term50622);
        setIntField(term50621, term50621.getClass(), "pos", 512);
        setField(term50604, term50604.getClass(), "zipEncoding", null);
        setBooleanField(term50604, term50604.getClass(), "useUnicodeExtraFields", false);
        setField(term50604, term50604.getClass(), "in", null);
        setField(term50604, term50604.getClass(), "inf", null);
        setField(term50604, term50604.getClass(), "crc", null);
        setField(term50604, term50604.getClass(), "buf", null);
        setField(term50604, term50604.getClass(), "current", null);
        setBooleanField(term50604, term50604.getClass(), "closed", false);
        setBooleanField(term50604, term50604.getClass(), "hitCentralDirectory", false);
        setField(term50604, term50604.getClass(), "lastStoredEntry", null);
        setBooleanField(term50604, term50604.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term50604, term50604.getClass(), "SINGLE", null);
        setLongField(term50604, term50604.getClass(), "bytesRead", 0L);
        setField(term50621, term50621.getClass(), "in", term50604);
        setField(term50612, term50612.getClass(), "in", term50621);
        setLongField(term51137, term51137.getClass(), "address", 130351188341168L);
        setField(term51139, term51139.getClass(), "action", term51137);
        setField(term51140, term51140.getClass(), "action", null);
        setField(term51140, term51140.getClass(), "prev", null);
        setField(term51140, term51140.getClass(), "next", term51139);
        setField(term51140, term51140.getClass(), "list", null);
        setField(term51140, term51140.getClass(), "referent", null);
        setField(term51140, term51140.getClass(), "queue", null);
        setField(term51140, term51140.getClass(), "next", null);
        setField(term51140, term51140.getClass(), "discovered", null);
        setField(term51139, term51139.getClass(), "prev", term51140);
        setField(term51141, term51141.getClass(), "action", null);
        setField(term51141, term51141.getClass(), "prev", term51139);
        setField(term51141, term51141.getClass(), "next", null);
        setField(term51141, term51141.getClass(), "list", null);
        setField(term51141, term51141.getClass(), "referent", null);
        setField(term51141, term51141.getClass(), "queue", null);
        setField(term51141, term51141.getClass(), "next", null);
        setField(term51141, term51141.getClass(), "discovered", null);
        setField(term51139, term51139.getClass(), "next", term51141);
        setField(term51142, term51142.getClass(), "action", null);
        setField(term51142, term51142.getClass(), "prev", null);
        setField(term51142, term51142.getClass(), "next", null);
        setField(term51142, term51142.getClass(), "list", term51142);
        setField(term51142, term51142.getClass(), "referent", null);
        setField(term51142, term51142.getClass(), "queue", null);
        setField(term51142, term51142.getClass(), "next", null);
        setField(term51142, term51142.getClass(), "discovered", null);
        setField(term51139, term51139.getClass(), "list", term51142);
        setField(term51139, term51139.getClass(), "referent", term51136);
        setField(term51143, term51143.getClass(), "lock", null);
        setField(term51143, term51143.getClass(), "head", null);
        setLongField(term51143, term51143.getClass(), "queueLength", 0L);
        setField(term51139, term51139.getClass(), "queue", term51143);
        setField(term51139, term51139.getClass(), "next", null);
        setField(term51139, term51139.getClass(), "discovered", null);
        setField(term51137, term51137.getClass(), "cleanable", term51139);
        setField(term51136, term51136.getClass(), "zsRef", term51137);
        setField(term51145, term51145.getClass(), "hb", term51146);
        setIntField(term51145, term51145.getClass(), "offset", 0);
        setBooleanField(term51145, term51145.getClass(), "isReadOnly", false);
        setBooleanField(term51145, term51145.getClass(), "bigEndian", true);
        setBooleanField(term51145, term51145.getClass(), "nativeByteOrder", false);
        setIntField(term51145, term51145.getClass(), "mark", -1);
        setIntField(term51145, term51145.getClass(), "position", 0);
        setIntField(term51145, term51145.getClass(), "limit", 0);
        setIntField(term51145, term51145.getClass(), "capacity", 0);
        setLongField(term51145, term51145.getClass(), "address", 16L);
        setField(term51136, term51136.getClass(), "input", term51145);
        setField(term51136, term51136.getClass(), "inputArray", null);
        setIntField(term51136, term51136.getClass(), "inputPos", 0);
        setIntField(term51136, term51136.getClass(), "inputLim", 0);
        setBooleanField(term51136, term51136.getClass(), "finished", false);
        setBooleanField(term51136, term51136.getClass(), "needDict", false);
        setLongField(term51136, term51136.getClass(), "bytesRead", 0L);
        setLongField(term51136, term51136.getClass(), "bytesWritten", 0L);
        setIntField(term51136, term51136.getClass(), "inputConsumed", 0);
        setIntField(term51136, term51136.getClass(), "outputConsumed", 0);
        setField(term50612, term50612.getClass(), "inf", term51136);
        setIntField(term51164, term51164.getClass(), "crc", 0);
        setField(term50612, term50612.getClass(), "crc", term51164);
        setField(term51166, term51166.getClass(), "buf", term51167);
        setIntField(term51166, term51166.getClass(), "offsetInBuffer", 0);
        setIntField(term51166, term51166.getClass(), "lengthOfLastRead", 0);
        setField(term50612, term50612.getClass(), "buf", term51166);
        setField(term50612, term50612.getClass(), "current", null);
        setBooleanField(term50612, term50612.getClass(), "closed", false);
        setBooleanField(term50612, term50612.getClass(), "hitCentralDirectory", false);
        setField(term50612, term50612.getClass(), "lastStoredEntry", null);
        setBooleanField(term50612, term50612.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term50612, term50612.getClass(), "SINGLE", term51685);
        setLongField(term50612, term50612.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term4445;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term4275, args);
        assertTrue(recursiveEquals(term4275, term51694));
        assertTrue(recursiveEquals(term4445, "zip"));
        assertTrue(recursiveEquals(retValue, term50612));
    }

};


