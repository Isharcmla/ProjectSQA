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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class ArchiveStreamFactory_createArchiveOutputStream_15789812923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4645;
     Object term4733;
     Object term6432;
     Object term6433;
     Object term5825;

    public ArchiveStreamFactory_createArchiveOutputStream_15789812923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4645 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term4733 = newInstance(Class.forName("java.io.OutputStream$1"));
        term6432 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term6433 = newInstance(Class.forName("java.io.OutputStream$1"));
        setBooleanField(term6433, term6433.getClass(), "closed", false);
        LinkedList term5832 = new LinkedList();
        HashMap term5840 = new HashMap();
        Class<? extends Object> term7269 = Class.forName((String) "org.apache.commons.compress.archivers.zip.Zip64Mode");
        Field term7268 = ((Class) term7269).getDeclaredField((String) "AsNeeded");
        ((Field) term7268).setAccessible(true);
        Object enum0 = ((Field) term7268).get((Object) null);
        term5825 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object term5835 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term5851 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term5858 = newInstance(Class.forName("java.util.zip.Deflater"));
        Object term5859 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef"));
        Object term5861 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term5862 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term5863 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term5864 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term5865 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5867 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term5868 = (byte[]) newByteArray(0);
        byte[] term5887 = (byte[]) newByteArray(512);
        Object term5823 = newInstance(Class.forName("java.io.OutputStream$1"));
        Object term6402 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
        byte[] term6423 = (byte[]) newByteArray(1);
        setBooleanField(term5825, term5825.getClass(), "finished", false);
        setField(term5825, term5825.getClass(), "entry", null);
        setField(term5825, term5825.getClass(), "comment", "");
        setIntField(term5825, term5825.getClass(), "level", -1);
        setBooleanField(term5825, term5825.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term5825, term5825.getClass(), "method", 8);
        setField(term5825, term5825.getClass(), "entries", term5832);
        setIntField(term5835, term5835.getClass(), "crc", 0);
        setField(term5825, term5825.getClass(), "crc", term5835);
        setLongField(term5825, term5825.getClass(), "written", 0L);
        setLongField(term5825, term5825.getClass(), "cdOffset", 0L);
        setLongField(term5825, term5825.getClass(), "cdLength", 0L);
        setField(term5825, term5825.getClass(), "offsets", term5840);
        setField(term5825, term5825.getClass(), "encoding", "UTF8");
        setField(term5851, term5851.getClass(), "charset", "UTF8");
        setField(term5825, term5825.getClass(), "zipEncoding", term5851);
        setLongField(term5859, term5859.getClass(), "address", 128501466650288L);
        setField(term5861, term5861.getClass(), "action", term5859);
        setField(term5862, term5862.getClass(), "action", null);
        setField(term5862, term5862.getClass(), "prev", null);
        setField(term5862, term5862.getClass(), "next", term5861);
        setField(term5862, term5862.getClass(), "list", null);
        setField(term5862, term5862.getClass(), "referent", null);
        setField(term5862, term5862.getClass(), "queue", null);
        setField(term5862, term5862.getClass(), "next", null);
        setField(term5862, term5862.getClass(), "discovered", null);
        setField(term5861, term5861.getClass(), "prev", term5862);
        setField(term5863, term5863.getClass(), "action", null);
        setField(term5863, term5863.getClass(), "prev", term5861);
        setField(term5863, term5863.getClass(), "next", null);
        setField(term5863, term5863.getClass(), "list", null);
        setField(term5863, term5863.getClass(), "referent", null);
        setField(term5863, term5863.getClass(), "queue", null);
        setField(term5863, term5863.getClass(), "next", null);
        setField(term5863, term5863.getClass(), "discovered", null);
        setField(term5861, term5861.getClass(), "next", term5863);
        setField(term5864, term5864.getClass(), "action", null);
        setField(term5864, term5864.getClass(), "prev", null);
        setField(term5864, term5864.getClass(), "next", null);
        setField(term5864, term5864.getClass(), "list", term5864);
        setField(term5864, term5864.getClass(), "referent", null);
        setField(term5864, term5864.getClass(), "queue", null);
        setField(term5864, term5864.getClass(), "next", null);
        setField(term5864, term5864.getClass(), "discovered", null);
        setField(term5861, term5861.getClass(), "list", term5864);
        setField(term5861, term5861.getClass(), "referent", term5858);
        setField(term5865, term5865.getClass(), "lock", null);
        setField(term5865, term5865.getClass(), "head", null);
        setLongField(term5865, term5865.getClass(), "queueLength", 0L);
        setField(term5861, term5861.getClass(), "queue", term5865);
        setField(term5861, term5861.getClass(), "next", null);
        setField(term5861, term5861.getClass(), "discovered", null);
        setField(term5859, term5859.getClass(), "cleanable", term5861);
        setField(term5858, term5858.getClass(), "zsRef", term5859);
        setField(term5867, term5867.getClass(), "hb", term5868);
        setIntField(term5867, term5867.getClass(), "offset", 0);
        setBooleanField(term5867, term5867.getClass(), "isReadOnly", false);
        setBooleanField(term5867, term5867.getClass(), "bigEndian", true);
        setBooleanField(term5867, term5867.getClass(), "nativeByteOrder", false);
        setIntField(term5867, term5867.getClass(), "mark", -1);
        setIntField(term5867, term5867.getClass(), "position", 0);
        setIntField(term5867, term5867.getClass(), "limit", 0);
        setIntField(term5867, term5867.getClass(), "capacity", 0);
        setLongField(term5867, term5867.getClass(), "address", 16L);
        setField(term5858, term5858.getClass(), "input", term5867);
        setField(term5858, term5858.getClass(), "inputArray", null);
        setIntField(term5858, term5858.getClass(), "inputPos", 0);
        setIntField(term5858, term5858.getClass(), "inputLim", 0);
        setIntField(term5858, term5858.getClass(), "level", -1);
        setIntField(term5858, term5858.getClass(), "strategy", 0);
        setBooleanField(term5858, term5858.getClass(), "setParams", false);
        setBooleanField(term5858, term5858.getClass(), "finish", false);
        setBooleanField(term5858, term5858.getClass(), "finished", false);
        setLongField(term5858, term5858.getClass(), "bytesRead", 0L);
        setLongField(term5858, term5858.getClass(), "bytesWritten", 0L);
        setField(term5825, term5825.getClass(), "def", term5858);
        setField(term5825, term5825.getClass(), "buf", term5887);
        setField(term5825, term5825.getClass(), "raf", null);
        setBooleanField(term5823, term5823.getClass(), "closed", false);
        setField(term5825, term5825.getClass(), "out", term5823);
        setBooleanField(term5825, term5825.getClass(), "useUTF8Flag", true);
        setBooleanField(term5825, term5825.getClass(), "fallbackToUTF8", false);
        setField(term6402, term6402.getClass(), "name", "never");
        setField(term5825, term5825.getClass(), "createUnicodeExtraFields", term6402);
        setBooleanField(term5825, term5825.getClass(), "hasUsedZip64", false);
        setField(term5825, term5825.getClass(), "zip64Mode", enum0);
        setField(term5825, term5825.getClass(), "oneByte", term6423);
        setLongField(term5825, term5825.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term4733;
        Object retValue = callMethod(klass, "createArchiveOutputStream", argTypes, term4645, args);
        assertTrue(recursiveEquals(term4645, term6432));
        assertTrue(recursiveEquals(term4733, "zip"));
        assertTrue(recursiveEquals(retValue, term5825));
    }

};


