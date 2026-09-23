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

public class ZipArchiveInputStream_init_139305729536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term61;
     Object term21177;

    public ZipArchiveInputStream_init_139305729536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = new Boolean(false);
        term61 = new Boolean(false);
        term21177 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term21178 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term21181 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term21182 = (byte[]) newByteArray(512);
        Object term21183 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term21184 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term21185 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21186 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21187 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21188 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term21189 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term21190 = (byte[]) newByteArray(0);
        Object term21191 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term21192 = (byte[]) newByteArray(512);
        byte[] term21193 = (byte[]) newByteArray(30);
        byte[] term21194 = (byte[]) newByteArray(1024);
        byte[] term21195 = (byte[]) newByteArray(2);
        byte[] term21196 = (byte[]) newByteArray(4);
        byte[] term21197 = (byte[]) newByteArray(16);
        byte[] term21198 = (byte[]) newByteArray(1);
        setField(term21178, term21178.getClass(), "charsetName", "MuLcgQHgqz");
        setField(term21177, term21177.getClass(), "zipEncoding", term21178);
        setBooleanField(term21177, term21177.getClass(), "useUnicodeExtraFields", false);
        setField(term21181, term21181.getClass(), "buf", term21182);
        setIntField(term21181, term21181.getClass(), "pos", 512);
        setField(term21181, term21181.getClass(), "in", null);
        setField(term21177, term21177.getClass(), "in", term21181);
        setLongField(term21184, term21184.getClass(), "address", 132350102153616L);
        setField(term21185, term21185.getClass(), "action", term21184);
        setField(term21186, term21186.getClass(), "action", null);
        setField(term21186, term21186.getClass(), "prev", null);
        setField(term21186, term21186.getClass(), "next", term21185);
        setField(term21186, term21186.getClass(), "list", term21186);
        setField(term21186, term21186.getClass(), "referent", null);
        setField(term21186, term21186.getClass(), "queue", null);
        setField(term21186, term21186.getClass(), "next", null);
        setField(term21186, term21186.getClass(), "discovered", null);
        setField(term21185, term21185.getClass(), "prev", term21186);
        setField(term21187, term21187.getClass(), "action", null);
        setField(term21187, term21187.getClass(), "prev", term21185);
        setField(term21187, term21187.getClass(), "next", null);
        setField(term21187, term21187.getClass(), "list", term21186);
        setField(term21187, term21187.getClass(), "referent", null);
        setField(term21187, term21187.getClass(), "queue", null);
        setField(term21187, term21187.getClass(), "next", null);
        setField(term21187, term21187.getClass(), "discovered", null);
        setField(term21185, term21185.getClass(), "next", term21187);
        setField(term21185, term21185.getClass(), "list", term21186);
        setField(term21185, term21185.getClass(), "referent", term21183);
        setField(term21188, term21188.getClass(), "lock", null);
        setField(term21188, term21188.getClass(), "head", null);
        setLongField(term21188, term21188.getClass(), "queueLength", 0L);
        setField(term21185, term21185.getClass(), "queue", term21188);
        setField(term21185, term21185.getClass(), "next", null);
        setField(term21185, term21185.getClass(), "discovered", null);
        setField(term21184, term21184.getClass(), "cleanable", term21185);
        setField(term21183, term21183.getClass(), "zsRef", term21184);
        setField(term21189, term21189.getClass(), "hb", term21190);
        setIntField(term21189, term21189.getClass(), "offset", 0);
        setBooleanField(term21189, term21189.getClass(), "isReadOnly", false);
        setBooleanField(term21189, term21189.getClass(), "bigEndian", true);
        setBooleanField(term21189, term21189.getClass(), "nativeByteOrder", false);
        setIntField(term21189, term21189.getClass(), "mark", -1);
        setIntField(term21189, term21189.getClass(), "position", 0);
        setIntField(term21189, term21189.getClass(), "limit", 0);
        setIntField(term21189, term21189.getClass(), "capacity", 0);
        setLongField(term21189, term21189.getClass(), "address", 16L);
        setField(term21183, term21183.getClass(), "input", term21189);
        setField(term21183, term21183.getClass(), "inputArray", null);
        setIntField(term21183, term21183.getClass(), "inputPos", 0);
        setIntField(term21183, term21183.getClass(), "inputLim", 0);
        setBooleanField(term21183, term21183.getClass(), "finished", false);
        setBooleanField(term21183, term21183.getClass(), "needDict", false);
        setLongField(term21183, term21183.getClass(), "bytesRead", 0L);
        setLongField(term21183, term21183.getClass(), "bytesWritten", 0L);
        setIntField(term21183, term21183.getClass(), "inputConsumed", 0);
        setIntField(term21183, term21183.getClass(), "outputConsumed", 0);
        setField(term21177, term21177.getClass(), "inf", term21183);
        setField(term21191, term21191.getClass(), "hb", term21192);
        setIntField(term21191, term21191.getClass(), "offset", 0);
        setBooleanField(term21191, term21191.getClass(), "isReadOnly", false);
        setBooleanField(term21191, term21191.getClass(), "bigEndian", true);
        setBooleanField(term21191, term21191.getClass(), "nativeByteOrder", false);
        setIntField(term21191, term21191.getClass(), "mark", -1);
        setIntField(term21191, term21191.getClass(), "position", 0);
        setIntField(term21191, term21191.getClass(), "limit", 512);
        setIntField(term21191, term21191.getClass(), "capacity", 512);
        setLongField(term21191, term21191.getClass(), "address", 16L);
        setField(term21177, term21177.getClass(), "buf", term21191);
        setField(term21177, term21177.getClass(), "current", null);
        setBooleanField(term21177, term21177.getClass(), "closed", false);
        setBooleanField(term21177, term21177.getClass(), "hitCentralDirectory", false);
        setField(term21177, term21177.getClass(), "lastStoredEntry", null);
        setBooleanField(term21177, term21177.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term21177, term21177.getClass(), "LFH_BUF", term21193);
        setField(term21177, term21177.getClass(), "SKIP_BUF", term21194);
        setField(term21177, term21177.getClass(), "SHORT_BUF", term21195);
        setField(term21177, term21177.getClass(), "WORD_BUF", term21196);
        setField(term21177, term21177.getClass(), "TWO_DWORD_BUF", term21197);
        setIntField(term21177, term21177.getClass(), "entriesRead", 0);
        setField(term21177, term21177.getClass(), "SINGLE", term21198);
        setLongField(term21177, term21177.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term21177));
        assertTrue(recursiveEquals(term59, false));
        assertTrue(recursiveEquals(term61, false));
    }

};


