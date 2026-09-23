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

public class ZipArchiveInputStream_init_40762374335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term16583;

    public ZipArchiveInputStream_init_40762374335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = new Boolean(false);
        term16583 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term16584 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term16587 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term16588 = (byte[]) newByteArray(512);
        Object term16589 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term16590 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term16591 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16592 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16593 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16594 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term16595 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term16596 = (byte[]) newByteArray(0);
        Object term16597 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term16598 = (byte[]) newByteArray(512);
        byte[] term16599 = (byte[]) newByteArray(30);
        byte[] term16600 = (byte[]) newByteArray(1024);
        byte[] term16601 = (byte[]) newByteArray(2);
        byte[] term16602 = (byte[]) newByteArray(4);
        byte[] term16603 = (byte[]) newByteArray(16);
        byte[] term16604 = (byte[]) newByteArray(1);
        setField(term16584, term16584.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term16583, term16583.getClass(), "zipEncoding", term16584);
        setBooleanField(term16583, term16583.getClass(), "useUnicodeExtraFields", false);
        setField(term16587, term16587.getClass(), "buf", term16588);
        setIntField(term16587, term16587.getClass(), "pos", 512);
        setField(term16587, term16587.getClass(), "in", null);
        setField(term16583, term16583.getClass(), "in", term16587);
        setLongField(term16590, term16590.getClass(), "address", 132350101947056L);
        setField(term16591, term16591.getClass(), "action", term16590);
        setField(term16592, term16592.getClass(), "action", null);
        setField(term16592, term16592.getClass(), "prev", null);
        setField(term16592, term16592.getClass(), "next", term16591);
        setField(term16592, term16592.getClass(), "list", term16592);
        setField(term16592, term16592.getClass(), "referent", null);
        setField(term16592, term16592.getClass(), "queue", null);
        setField(term16592, term16592.getClass(), "next", null);
        setField(term16592, term16592.getClass(), "discovered", null);
        setField(term16591, term16591.getClass(), "prev", term16592);
        setField(term16593, term16593.getClass(), "action", null);
        setField(term16593, term16593.getClass(), "prev", term16591);
        setField(term16593, term16593.getClass(), "next", null);
        setField(term16593, term16593.getClass(), "list", term16592);
        setField(term16593, term16593.getClass(), "referent", null);
        setField(term16593, term16593.getClass(), "queue", null);
        setField(term16593, term16593.getClass(), "next", null);
        setField(term16593, term16593.getClass(), "discovered", null);
        setField(term16591, term16591.getClass(), "next", term16593);
        setField(term16591, term16591.getClass(), "list", term16592);
        setField(term16591, term16591.getClass(), "referent", term16589);
        setField(term16594, term16594.getClass(), "lock", null);
        setField(term16594, term16594.getClass(), "head", null);
        setLongField(term16594, term16594.getClass(), "queueLength", 0L);
        setField(term16591, term16591.getClass(), "queue", term16594);
        setField(term16591, term16591.getClass(), "next", null);
        setField(term16591, term16591.getClass(), "discovered", null);
        setField(term16590, term16590.getClass(), "cleanable", term16591);
        setField(term16589, term16589.getClass(), "zsRef", term16590);
        setField(term16595, term16595.getClass(), "hb", term16596);
        setIntField(term16595, term16595.getClass(), "offset", 0);
        setBooleanField(term16595, term16595.getClass(), "isReadOnly", false);
        setBooleanField(term16595, term16595.getClass(), "bigEndian", true);
        setBooleanField(term16595, term16595.getClass(), "nativeByteOrder", false);
        setIntField(term16595, term16595.getClass(), "mark", -1);
        setIntField(term16595, term16595.getClass(), "position", 0);
        setIntField(term16595, term16595.getClass(), "limit", 0);
        setIntField(term16595, term16595.getClass(), "capacity", 0);
        setLongField(term16595, term16595.getClass(), "address", 16L);
        setField(term16589, term16589.getClass(), "input", term16595);
        setField(term16589, term16589.getClass(), "inputArray", null);
        setIntField(term16589, term16589.getClass(), "inputPos", 0);
        setIntField(term16589, term16589.getClass(), "inputLim", 0);
        setBooleanField(term16589, term16589.getClass(), "finished", false);
        setBooleanField(term16589, term16589.getClass(), "needDict", false);
        setLongField(term16589, term16589.getClass(), "bytesRead", 0L);
        setLongField(term16589, term16589.getClass(), "bytesWritten", 0L);
        setIntField(term16589, term16589.getClass(), "inputConsumed", 0);
        setIntField(term16589, term16589.getClass(), "outputConsumed", 0);
        setField(term16583, term16583.getClass(), "inf", term16589);
        setField(term16597, term16597.getClass(), "hb", term16598);
        setIntField(term16597, term16597.getClass(), "offset", 0);
        setBooleanField(term16597, term16597.getClass(), "isReadOnly", false);
        setBooleanField(term16597, term16597.getClass(), "bigEndian", true);
        setBooleanField(term16597, term16597.getClass(), "nativeByteOrder", false);
        setIntField(term16597, term16597.getClass(), "mark", -1);
        setIntField(term16597, term16597.getClass(), "position", 0);
        setIntField(term16597, term16597.getClass(), "limit", 512);
        setIntField(term16597, term16597.getClass(), "capacity", 512);
        setLongField(term16597, term16597.getClass(), "address", 16L);
        setField(term16583, term16583.getClass(), "buf", term16597);
        setField(term16583, term16583.getClass(), "current", null);
        setBooleanField(term16583, term16583.getClass(), "closed", false);
        setBooleanField(term16583, term16583.getClass(), "hitCentralDirectory", false);
        setField(term16583, term16583.getClass(), "lastStoredEntry", null);
        setBooleanField(term16583, term16583.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term16583, term16583.getClass(), "LFH_BUF", term16599);
        setField(term16583, term16583.getClass(), "SKIP_BUF", term16600);
        setField(term16583, term16583.getClass(), "SHORT_BUF", term16601);
        setField(term16583, term16583.getClass(), "WORD_BUF", term16602);
        setField(term16583, term16583.getClass(), "TWO_DWORD_BUF", term16603);
        setIntField(term16583, term16583.getClass(), "entriesRead", 0);
        setField(term16583, term16583.getClass(), "SINGLE", term16604);
        setLongField(term16583, term16583.getClass(), "bytesRead", 0L);
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
        args[1] = "sjlJAEtRrb";
        args[2] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16583));
        assertTrue(recursiveEquals(term35, false));
    }

};


