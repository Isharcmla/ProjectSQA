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

public class ZipArchiveInputStream_init_139305729537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term61;
     Object term44663;

    public ZipArchiveInputStream_init_139305729537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = new Boolean(false);
        term61 = new Boolean(false);
        term44663 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term44664 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.NioZipEncoding"));
        Object term44665 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term44668 = (Object[]) newArray("java.lang.String", 2);
        Object term44673 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term44674 = (byte[]) newByteArray(512);
        Object term44675 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term44676 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term44677 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term44678 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term44679 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term44680 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44681 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term44682 = (byte[]) newByteArray(0);
        Object term44683 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term44684 = (byte[]) newByteArray(512);
        byte[] term44685 = (byte[]) newByteArray(30);
        byte[] term44686 = (byte[]) newByteArray(1024);
        byte[] term44687 = (byte[]) newByteArray(2);
        byte[] term44688 = (byte[]) newByteArray(4);
        byte[] term44689 = (byte[]) newByteArray(16);
        byte[] term44690 = (byte[]) newByteArray(1);
        setField(term44665, term44665.getClass(), "name", "UTF-8");
        setElement(term44668, 0, "");
        setElement(term44668, 1, "");
        setField(term44665, term44665.getClass(), "aliases", term44668);
        setField(term44665, term44665.getClass(), "aliasSet", null);
        setField(term44664, term44664.getClass(), "charset", term44665);
        setBooleanField(term44664, term44664.getClass(), "useReplacement", true);
        setField(term44663, term44663.getClass(), "zipEncoding", term44664);
        setField(term44663, term44663.getClass(), "encoding", "MuLcgQHgqz");
        setBooleanField(term44663, term44663.getClass(), "useUnicodeExtraFields", false);
        setField(term44673, term44673.getClass(), "buf", term44674);
        setIntField(term44673, term44673.getClass(), "pos", 512);
        setField(term44673, term44673.getClass(), "in", null);
        setField(term44663, term44663.getClass(), "in", term44673);
        setLongField(term44676, term44676.getClass(), "address", 131462172081344L);
        setField(term44677, term44677.getClass(), "action", term44676);
        setField(term44678, term44678.getClass(), "action", null);
        setField(term44678, term44678.getClass(), "prev", null);
        setField(term44678, term44678.getClass(), "next", term44677);
        setField(term44678, term44678.getClass(), "list", term44678);
        setField(term44678, term44678.getClass(), "referent", null);
        setField(term44678, term44678.getClass(), "queue", null);
        setField(term44678, term44678.getClass(), "next", null);
        setField(term44678, term44678.getClass(), "discovered", null);
        setField(term44677, term44677.getClass(), "prev", term44678);
        setField(term44679, term44679.getClass(), "action", null);
        setField(term44679, term44679.getClass(), "prev", term44677);
        setField(term44679, term44679.getClass(), "next", null);
        setField(term44679, term44679.getClass(), "list", term44678);
        setField(term44679, term44679.getClass(), "referent", null);
        setField(term44679, term44679.getClass(), "queue", null);
        setField(term44679, term44679.getClass(), "next", null);
        setField(term44679, term44679.getClass(), "discovered", null);
        setField(term44677, term44677.getClass(), "next", term44679);
        setField(term44677, term44677.getClass(), "list", term44678);
        setField(term44677, term44677.getClass(), "referent", term44675);
        setField(term44680, term44680.getClass(), "lock", null);
        setField(term44680, term44680.getClass(), "head", null);
        setLongField(term44680, term44680.getClass(), "queueLength", 0L);
        setField(term44677, term44677.getClass(), "queue", term44680);
        setField(term44677, term44677.getClass(), "next", null);
        setField(term44677, term44677.getClass(), "discovered", null);
        setField(term44676, term44676.getClass(), "cleanable", term44677);
        setField(term44675, term44675.getClass(), "zsRef", term44676);
        setField(term44681, term44681.getClass(), "hb", term44682);
        setIntField(term44681, term44681.getClass(), "offset", 0);
        setBooleanField(term44681, term44681.getClass(), "isReadOnly", false);
        setBooleanField(term44681, term44681.getClass(), "bigEndian", true);
        setBooleanField(term44681, term44681.getClass(), "nativeByteOrder", false);
        setIntField(term44681, term44681.getClass(), "mark", -1);
        setIntField(term44681, term44681.getClass(), "position", 0);
        setIntField(term44681, term44681.getClass(), "limit", 0);
        setIntField(term44681, term44681.getClass(), "capacity", 0);
        setLongField(term44681, term44681.getClass(), "address", 16L);
        setField(term44675, term44675.getClass(), "input", term44681);
        setField(term44675, term44675.getClass(), "inputArray", null);
        setIntField(term44675, term44675.getClass(), "inputPos", 0);
        setIntField(term44675, term44675.getClass(), "inputLim", 0);
        setBooleanField(term44675, term44675.getClass(), "finished", false);
        setBooleanField(term44675, term44675.getClass(), "needDict", false);
        setLongField(term44675, term44675.getClass(), "bytesRead", 0L);
        setLongField(term44675, term44675.getClass(), "bytesWritten", 0L);
        setIntField(term44675, term44675.getClass(), "inputConsumed", 0);
        setIntField(term44675, term44675.getClass(), "outputConsumed", 0);
        setField(term44663, term44663.getClass(), "inf", term44675);
        setField(term44683, term44683.getClass(), "hb", term44684);
        setIntField(term44683, term44683.getClass(), "offset", 0);
        setBooleanField(term44683, term44683.getClass(), "isReadOnly", false);
        setBooleanField(term44683, term44683.getClass(), "bigEndian", true);
        setBooleanField(term44683, term44683.getClass(), "nativeByteOrder", false);
        setIntField(term44683, term44683.getClass(), "mark", -1);
        setIntField(term44683, term44683.getClass(), "position", 0);
        setIntField(term44683, term44683.getClass(), "limit", 0);
        setIntField(term44683, term44683.getClass(), "capacity", 512);
        setLongField(term44683, term44683.getClass(), "address", 16L);
        setField(term44663, term44663.getClass(), "buf", term44683);
        setField(term44663, term44663.getClass(), "current", null);
        setBooleanField(term44663, term44663.getClass(), "closed", false);
        setBooleanField(term44663, term44663.getClass(), "hitCentralDirectory", false);
        setField(term44663, term44663.getClass(), "lastStoredEntry", null);
        setBooleanField(term44663, term44663.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term44663, term44663.getClass(), "lfhBuf", term44685);
        setField(term44663, term44663.getClass(), "skipBuf", term44686);
        setField(term44663, term44663.getClass(), "shortBuf", term44687);
        setField(term44663, term44663.getClass(), "wordBuf", term44688);
        setField(term44663, term44663.getClass(), "twoDwordBuf", term44689);
        setIntField(term44663, term44663.getClass(), "entriesRead", 0);
        setField(term44663, term44663.getClass(), "single", term44690);
        setLongField(term44663, term44663.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "MuLcgQHgqz";
        args[2] = term59;
        args[3] = term61;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44663));
        assertTrue(recursiveEquals(term59, false));
        assertTrue(recursiveEquals(term61, false));
    }

};


