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
     Object term21171;

    public ZipArchiveInputStream_init_139305729536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = new Boolean(false);
        term61 = new Boolean(false);
        term21171 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term21172 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term21175 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term21176 = (byte[]) newByteArray(512);
        Object term21177 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term21178 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term21179 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21180 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21181 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term21182 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term21183 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term21184 = (byte[]) newByteArray(0);
        Object term21185 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term21186 = (byte[]) newByteArray(512);
        byte[] term21187 = (byte[]) newByteArray(30);
        byte[] term21188 = (byte[]) newByteArray(1024);
        byte[] term21189 = (byte[]) newByteArray(2);
        byte[] term21190 = (byte[]) newByteArray(4);
        byte[] term21191 = (byte[]) newByteArray(16);
        byte[] term21192 = (byte[]) newByteArray(1);
        setField(term21172, term21172.getClass(), "charsetName", "MuLcgQHgqz");
        setField(term21171, term21171.getClass(), "zipEncoding", term21172);
        setBooleanField(term21171, term21171.getClass(), "useUnicodeExtraFields", false);
        setField(term21175, term21175.getClass(), "buf", term21176);
        setIntField(term21175, term21175.getClass(), "pos", 512);
        setField(term21175, term21175.getClass(), "in", null);
        setField(term21171, term21171.getClass(), "in", term21175);
        setLongField(term21178, term21178.getClass(), "address", 134047007372736L);
        setField(term21179, term21179.getClass(), "action", term21178);
        setField(term21180, term21180.getClass(), "action", null);
        setField(term21180, term21180.getClass(), "prev", null);
        setField(term21180, term21180.getClass(), "next", term21179);
        setField(term21180, term21180.getClass(), "list", term21180);
        setField(term21180, term21180.getClass(), "referent", null);
        setField(term21180, term21180.getClass(), "queue", null);
        setField(term21180, term21180.getClass(), "next", null);
        setField(term21180, term21180.getClass(), "discovered", null);
        setField(term21179, term21179.getClass(), "prev", term21180);
        setField(term21181, term21181.getClass(), "action", null);
        setField(term21181, term21181.getClass(), "prev", term21179);
        setField(term21181, term21181.getClass(), "next", null);
        setField(term21181, term21181.getClass(), "list", term21180);
        setField(term21181, term21181.getClass(), "referent", null);
        setField(term21181, term21181.getClass(), "queue", null);
        setField(term21181, term21181.getClass(), "next", null);
        setField(term21181, term21181.getClass(), "discovered", null);
        setField(term21179, term21179.getClass(), "next", term21181);
        setField(term21179, term21179.getClass(), "list", term21180);
        setField(term21179, term21179.getClass(), "referent", term21177);
        setField(term21182, term21182.getClass(), "lock", null);
        setField(term21182, term21182.getClass(), "head", null);
        setLongField(term21182, term21182.getClass(), "queueLength", 0L);
        setField(term21179, term21179.getClass(), "queue", term21182);
        setField(term21179, term21179.getClass(), "next", null);
        setField(term21179, term21179.getClass(), "discovered", null);
        setField(term21178, term21178.getClass(), "cleanable", term21179);
        setField(term21177, term21177.getClass(), "zsRef", term21178);
        setField(term21183, term21183.getClass(), "hb", term21184);
        setIntField(term21183, term21183.getClass(), "offset", 0);
        setBooleanField(term21183, term21183.getClass(), "isReadOnly", false);
        setBooleanField(term21183, term21183.getClass(), "bigEndian", true);
        setBooleanField(term21183, term21183.getClass(), "nativeByteOrder", false);
        setIntField(term21183, term21183.getClass(), "mark", -1);
        setIntField(term21183, term21183.getClass(), "position", 0);
        setIntField(term21183, term21183.getClass(), "limit", 0);
        setIntField(term21183, term21183.getClass(), "capacity", 0);
        setLongField(term21183, term21183.getClass(), "address", 16L);
        setField(term21177, term21177.getClass(), "input", term21183);
        setField(term21177, term21177.getClass(), "inputArray", null);
        setIntField(term21177, term21177.getClass(), "inputPos", 0);
        setIntField(term21177, term21177.getClass(), "inputLim", 0);
        setBooleanField(term21177, term21177.getClass(), "finished", false);
        setBooleanField(term21177, term21177.getClass(), "needDict", false);
        setLongField(term21177, term21177.getClass(), "bytesRead", 0L);
        setLongField(term21177, term21177.getClass(), "bytesWritten", 0L);
        setIntField(term21177, term21177.getClass(), "inputConsumed", 0);
        setIntField(term21177, term21177.getClass(), "outputConsumed", 0);
        setField(term21171, term21171.getClass(), "inf", term21177);
        setField(term21185, term21185.getClass(), "hb", term21186);
        setIntField(term21185, term21185.getClass(), "offset", 0);
        setBooleanField(term21185, term21185.getClass(), "isReadOnly", false);
        setBooleanField(term21185, term21185.getClass(), "bigEndian", true);
        setBooleanField(term21185, term21185.getClass(), "nativeByteOrder", false);
        setIntField(term21185, term21185.getClass(), "mark", -1);
        setIntField(term21185, term21185.getClass(), "position", 0);
        setIntField(term21185, term21185.getClass(), "limit", 0);
        setIntField(term21185, term21185.getClass(), "capacity", 512);
        setLongField(term21185, term21185.getClass(), "address", 16L);
        setField(term21171, term21171.getClass(), "buf", term21185);
        setField(term21171, term21171.getClass(), "current", null);
        setBooleanField(term21171, term21171.getClass(), "closed", false);
        setBooleanField(term21171, term21171.getClass(), "hitCentralDirectory", false);
        setField(term21171, term21171.getClass(), "lastStoredEntry", null);
        setBooleanField(term21171, term21171.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term21171, term21171.getClass(), "LFH_BUF", term21187);
        setField(term21171, term21171.getClass(), "SKIP_BUF", term21188);
        setField(term21171, term21171.getClass(), "SHORT_BUF", term21189);
        setField(term21171, term21171.getClass(), "WORD_BUF", term21190);
        setField(term21171, term21171.getClass(), "TWO_DWORD_BUF", term21191);
        setIntField(term21171, term21171.getClass(), "entriesRead", 0);
        setField(term21171, term21171.getClass(), "SINGLE", term21192);
        setLongField(term21171, term21171.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term21171));
        assertTrue(recursiveEquals(term59, false));
        assertTrue(recursiveEquals(term61, false));
    }

};


