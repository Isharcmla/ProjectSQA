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

public class ArchiveStreamFactory_createArchiveOutputStream_15789812934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56137;
     Object term56315;
     Object term62607;
     Object term62608;
     Object term62001;

    public ArchiveStreamFactory_createArchiveOutputStream_15789812934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56137 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term56315 = newInstance(Class.forName("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream"));
        term62607 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term62608 = newInstance(Class.forName("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream"));
        setField(term62608, term62608.getClass(), "out", null);
        LinkedList term62008 = new LinkedList();
        HashMap term62016 = new HashMap();
        Class<? extends Object> term63174 = Class.forName((String) "org.apache.commons.compress.archivers.zip.Zip64Mode");
        Field term63173 = ((Class) term63174).getDeclaredField((String) "AsNeeded");
        ((Field) term63173).setAccessible(true);
        Object enum0 = ((Field) term63173).get((Object) null);
        term62001 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        Object term62011 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term62027 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term62034 = newInstance(Class.forName("java.util.zip.Deflater"));
        Object term62035 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef"));
        Object term62037 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term62038 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term62039 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term62040 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term62042 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term62043 = (byte[]) newByteArray(0);
        byte[] term62062 = (byte[]) newByteArray(512);
        Object term62000 = newInstance(Class.forName("org.apache.commons.compress.compressors.xz.XZCompressorOutputStream"));
        Object term62577 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy"));
        byte[] term62598 = (byte[]) newByteArray(1);
        setBooleanField(term62001, term62001.getClass(), "finished", false);
        setField(term62001, term62001.getClass(), "entry", null);
        setField(term62001, term62001.getClass(), "comment", "");
        setIntField(term62001, term62001.getClass(), "level", -1);
        setBooleanField(term62001, term62001.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term62001, term62001.getClass(), "method", 8);
        setField(term62001, term62001.getClass(), "entries", term62008);
        setIntField(term62011, term62011.getClass(), "crc", 0);
        setField(term62001, term62001.getClass(), "crc", term62011);
        setLongField(term62001, term62001.getClass(), "written", 0L);
        setLongField(term62001, term62001.getClass(), "cdOffset", 0L);
        setLongField(term62001, term62001.getClass(), "cdLength", 0L);
        setField(term62001, term62001.getClass(), "offsets", term62016);
        setField(term62001, term62001.getClass(), "encoding", "UTF8");
        setField(term62027, term62027.getClass(), "charset", "UTF8");
        setField(term62001, term62001.getClass(), "zipEncoding", term62027);
        setLongField(term62035, term62035.getClass(), "address", 130351193432192L);
        setField(term62037, term62037.getClass(), "action", term62035);
        setField(term62038, term62038.getClass(), "action", null);
        setField(term62038, term62038.getClass(), "prev", null);
        setField(term62038, term62038.getClass(), "next", term62037);
        setField(term62038, term62038.getClass(), "list", term62038);
        setField(term62038, term62038.getClass(), "referent", null);
        setField(term62038, term62038.getClass(), "queue", null);
        setField(term62038, term62038.getClass(), "next", null);
        setField(term62038, term62038.getClass(), "discovered", null);
        setField(term62037, term62037.getClass(), "prev", term62038);
        setField(term62039, term62039.getClass(), "action", null);
        setField(term62039, term62039.getClass(), "prev", term62037);
        setField(term62039, term62039.getClass(), "next", null);
        setField(term62039, term62039.getClass(), "list", term62038);
        setField(term62039, term62039.getClass(), "referent", null);
        setField(term62039, term62039.getClass(), "queue", null);
        setField(term62039, term62039.getClass(), "next", null);
        setField(term62039, term62039.getClass(), "discovered", null);
        setField(term62037, term62037.getClass(), "next", term62039);
        setField(term62037, term62037.getClass(), "list", term62038);
        setField(term62037, term62037.getClass(), "referent", term62034);
        setField(term62040, term62040.getClass(), "lock", null);
        setField(term62040, term62040.getClass(), "head", null);
        setLongField(term62040, term62040.getClass(), "queueLength", 0L);
        setField(term62037, term62037.getClass(), "queue", term62040);
        setField(term62037, term62037.getClass(), "next", null);
        setField(term62037, term62037.getClass(), "discovered", null);
        setField(term62035, term62035.getClass(), "cleanable", term62037);
        setField(term62034, term62034.getClass(), "zsRef", term62035);
        setField(term62042, term62042.getClass(), "hb", term62043);
        setIntField(term62042, term62042.getClass(), "offset", 0);
        setBooleanField(term62042, term62042.getClass(), "isReadOnly", false);
        setBooleanField(term62042, term62042.getClass(), "bigEndian", true);
        setBooleanField(term62042, term62042.getClass(), "nativeByteOrder", false);
        setIntField(term62042, term62042.getClass(), "mark", -1);
        setIntField(term62042, term62042.getClass(), "position", 0);
        setIntField(term62042, term62042.getClass(), "limit", 0);
        setIntField(term62042, term62042.getClass(), "capacity", 0);
        setLongField(term62042, term62042.getClass(), "address", 16L);
        setField(term62034, term62034.getClass(), "input", term62042);
        setField(term62034, term62034.getClass(), "inputArray", null);
        setIntField(term62034, term62034.getClass(), "inputPos", 0);
        setIntField(term62034, term62034.getClass(), "inputLim", 0);
        setIntField(term62034, term62034.getClass(), "level", -1);
        setIntField(term62034, term62034.getClass(), "strategy", 0);
        setBooleanField(term62034, term62034.getClass(), "setParams", false);
        setBooleanField(term62034, term62034.getClass(), "finish", false);
        setBooleanField(term62034, term62034.getClass(), "finished", false);
        setLongField(term62034, term62034.getClass(), "bytesRead", 0L);
        setLongField(term62034, term62034.getClass(), "bytesWritten", 0L);
        setField(term62001, term62001.getClass(), "def", term62034);
        setField(term62001, term62001.getClass(), "buf", term62062);
        setField(term62001, term62001.getClass(), "raf", null);
        setField(term62000, term62000.getClass(), "out", null);
        setField(term62001, term62001.getClass(), "out", term62000);
        setBooleanField(term62001, term62001.getClass(), "useUTF8Flag", true);
        setBooleanField(term62001, term62001.getClass(), "fallbackToUTF8", false);
        setField(term62577, term62577.getClass(), "name", "never");
        setField(term62001, term62001.getClass(), "createUnicodeExtraFields", term62577);
        setBooleanField(term62001, term62001.getClass(), "hasUsedZip64", false);
        setField(term62001, term62001.getClass(), "zip64Mode", enum0);
        setField(term62001, term62001.getClass(), "oneByte", term62598);
        setLongField(term62001, term62001.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term56315;
        Object retValue = callMethod(klass, "createArchiveOutputStream", argTypes, term56137, args);
        assertTrue(recursiveEquals(term56137, term62607));
        assertTrue(recursiveEquals(term56315, "zip"));
        assertTrue(recursiveEquals(retValue, term62001));
    }

};


