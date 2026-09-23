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

public class ArchiveStreamFactory_createArchiveInputStream_188557935432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49372;
     Object term49508;
     Object term53569;
     Object term53570;
     Object term52487;

    public ArchiveStreamFactory_createArchiveInputStream_188557935432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49372 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term49508 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        term53569 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term53570 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setField(term53570, term53570.getClass(), "lock", null);
        setBooleanField(term53570, term53570.getClass(), "closePending", false);
        setIntField(term53570, term53570.getClass(), "useCount", 0);
        setField(term53570, term53570.getClass(), "streamToClose", null);
        setField(term53570, term53570.getClass(), "fd", null);
        setField(term53570, term53570.getClass(), "path", null);
        setField(term53570, term53570.getClass(), "channel", null);
        setField(term53570, term53570.getClass(), "closeLock", null);
        setBooleanField(term53570, term53570.getClass(), "closed", false);
        setField(term53570, term53570.getClass(), "altFinalizer", null);
        term52487 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term52488 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term52496 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term52497 = (byte[]) newByteArray(512);
        Object term52481 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        Object term53011 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term53012 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term53014 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term53015 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term53016 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term53017 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term53018 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term53020 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term53021 = (byte[]) newByteArray(0);
        Object term53039 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term53041 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$Buffer"));
        byte[] term53042 = (byte[]) newByteArray(512);
        byte[] term53560 = (byte[]) newByteArray(1);
        setField(term52488, term52488.getClass(), "charset", "UTF8");
        setField(term52487, term52487.getClass(), "zipEncoding", term52488);
        setBooleanField(term52487, term52487.getClass(), "useUnicodeExtraFields", true);
        setField(term52496, term52496.getClass(), "buf", term52497);
        setIntField(term52496, term52496.getClass(), "pos", 512);
        setField(term52481, term52481.getClass(), "lock", null);
        setBooleanField(term52481, term52481.getClass(), "closePending", false);
        setIntField(term52481, term52481.getClass(), "useCount", 0);
        setField(term52481, term52481.getClass(), "streamToClose", null);
        setField(term52481, term52481.getClass(), "fd", null);
        setField(term52481, term52481.getClass(), "path", null);
        setField(term52481, term52481.getClass(), "channel", null);
        setField(term52481, term52481.getClass(), "closeLock", null);
        setBooleanField(term52481, term52481.getClass(), "closed", false);
        setField(term52481, term52481.getClass(), "altFinalizer", null);
        setField(term52496, term52496.getClass(), "in", term52481);
        setField(term52487, term52487.getClass(), "in", term52496);
        setLongField(term53012, term53012.getClass(), "address", 128501468020688L);
        setField(term53014, term53014.getClass(), "action", term53012);
        setField(term53015, term53015.getClass(), "action", null);
        setField(term53015, term53015.getClass(), "prev", null);
        setField(term53015, term53015.getClass(), "next", term53014);
        setField(term53015, term53015.getClass(), "list", null);
        setField(term53015, term53015.getClass(), "referent", null);
        setField(term53015, term53015.getClass(), "queue", null);
        setField(term53015, term53015.getClass(), "next", null);
        setField(term53015, term53015.getClass(), "discovered", null);
        setField(term53014, term53014.getClass(), "prev", term53015);
        setField(term53016, term53016.getClass(), "action", null);
        setField(term53016, term53016.getClass(), "prev", term53014);
        setField(term53016, term53016.getClass(), "next", null);
        setField(term53016, term53016.getClass(), "list", null);
        setField(term53016, term53016.getClass(), "referent", null);
        setField(term53016, term53016.getClass(), "queue", null);
        setField(term53016, term53016.getClass(), "next", null);
        setField(term53016, term53016.getClass(), "discovered", null);
        setField(term53014, term53014.getClass(), "next", term53016);
        setField(term53017, term53017.getClass(), "action", null);
        setField(term53017, term53017.getClass(), "prev", null);
        setField(term53017, term53017.getClass(), "next", null);
        setField(term53017, term53017.getClass(), "list", term53017);
        setField(term53017, term53017.getClass(), "referent", null);
        setField(term53017, term53017.getClass(), "queue", null);
        setField(term53017, term53017.getClass(), "next", null);
        setField(term53017, term53017.getClass(), "discovered", null);
        setField(term53014, term53014.getClass(), "list", term53017);
        setField(term53014, term53014.getClass(), "referent", term53011);
        setField(term53018, term53018.getClass(), "lock", null);
        setField(term53018, term53018.getClass(), "head", null);
        setLongField(term53018, term53018.getClass(), "queueLength", 0L);
        setField(term53014, term53014.getClass(), "queue", term53018);
        setField(term53014, term53014.getClass(), "next", null);
        setField(term53014, term53014.getClass(), "discovered", null);
        setField(term53012, term53012.getClass(), "cleanable", term53014);
        setField(term53011, term53011.getClass(), "zsRef", term53012);
        setField(term53020, term53020.getClass(), "hb", term53021);
        setIntField(term53020, term53020.getClass(), "offset", 0);
        setBooleanField(term53020, term53020.getClass(), "isReadOnly", false);
        setBooleanField(term53020, term53020.getClass(), "bigEndian", true);
        setBooleanField(term53020, term53020.getClass(), "nativeByteOrder", false);
        setIntField(term53020, term53020.getClass(), "mark", -1);
        setIntField(term53020, term53020.getClass(), "position", 0);
        setIntField(term53020, term53020.getClass(), "limit", 0);
        setIntField(term53020, term53020.getClass(), "capacity", 0);
        setLongField(term53020, term53020.getClass(), "address", 16L);
        setField(term53011, term53011.getClass(), "input", term53020);
        setField(term53011, term53011.getClass(), "inputArray", null);
        setIntField(term53011, term53011.getClass(), "inputPos", 0);
        setIntField(term53011, term53011.getClass(), "inputLim", 0);
        setBooleanField(term53011, term53011.getClass(), "finished", false);
        setBooleanField(term53011, term53011.getClass(), "needDict", false);
        setLongField(term53011, term53011.getClass(), "bytesRead", 0L);
        setLongField(term53011, term53011.getClass(), "bytesWritten", 0L);
        setIntField(term53011, term53011.getClass(), "inputConsumed", 0);
        setIntField(term53011, term53011.getClass(), "outputConsumed", 0);
        setField(term52487, term52487.getClass(), "inf", term53011);
        setIntField(term53039, term53039.getClass(), "crc", 0);
        setField(term52487, term52487.getClass(), "crc", term53039);
        setField(term53041, term53041.getClass(), "buf", term53042);
        setIntField(term53041, term53041.getClass(), "offsetInBuffer", 0);
        setIntField(term53041, term53041.getClass(), "lengthOfLastRead", 0);
        setField(term52487, term52487.getClass(), "buf", term53041);
        setField(term52487, term52487.getClass(), "current", null);
        setBooleanField(term52487, term52487.getClass(), "closed", false);
        setBooleanField(term52487, term52487.getClass(), "hitCentralDirectory", false);
        setField(term52487, term52487.getClass(), "lastStoredEntry", null);
        setBooleanField(term52487, term52487.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term52487, term52487.getClass(), "SINGLE", term53560);
        setLongField(term52487, term52487.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term49508;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term49372, args);
        assertTrue(recursiveEquals(term49372, term53569));
        assertTrue(recursiveEquals(term49508, "zip"));
        assertTrue(recursiveEquals(retValue, term52487));
    }

};


