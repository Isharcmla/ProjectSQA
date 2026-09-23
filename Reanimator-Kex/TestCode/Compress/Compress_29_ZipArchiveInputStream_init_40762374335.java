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
     Object term16577;

    public ZipArchiveInputStream_init_40762374335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = new Boolean(false);
        term16577 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term16578 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        Object term16581 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term16582 = (byte[]) newByteArray(512);
        Object term16583 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term16584 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term16585 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16586 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16587 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term16588 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term16589 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term16590 = (byte[]) newByteArray(0);
        Object term16591 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term16592 = (byte[]) newByteArray(512);
        byte[] term16593 = (byte[]) newByteArray(30);
        byte[] term16594 = (byte[]) newByteArray(1024);
        byte[] term16595 = (byte[]) newByteArray(2);
        byte[] term16596 = (byte[]) newByteArray(4);
        byte[] term16597 = (byte[]) newByteArray(16);
        byte[] term16598 = (byte[]) newByteArray(1);
        setField(term16578, term16578.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term16577, term16577.getClass(), "zipEncoding", term16578);
        setBooleanField(term16577, term16577.getClass(), "useUnicodeExtraFields", false);
        setField(term16581, term16581.getClass(), "buf", term16582);
        setIntField(term16581, term16581.getClass(), "pos", 512);
        setField(term16581, term16581.getClass(), "in", null);
        setField(term16577, term16577.getClass(), "in", term16581);
        setLongField(term16584, term16584.getClass(), "address", 134047007371680L);
        setField(term16585, term16585.getClass(), "action", term16584);
        setField(term16586, term16586.getClass(), "action", null);
        setField(term16586, term16586.getClass(), "prev", null);
        setField(term16586, term16586.getClass(), "next", term16585);
        setField(term16586, term16586.getClass(), "list", term16586);
        setField(term16586, term16586.getClass(), "referent", null);
        setField(term16586, term16586.getClass(), "queue", null);
        setField(term16586, term16586.getClass(), "next", null);
        setField(term16586, term16586.getClass(), "discovered", null);
        setField(term16585, term16585.getClass(), "prev", term16586);
        setField(term16587, term16587.getClass(), "action", null);
        setField(term16587, term16587.getClass(), "prev", term16585);
        setField(term16587, term16587.getClass(), "next", null);
        setField(term16587, term16587.getClass(), "list", term16586);
        setField(term16587, term16587.getClass(), "referent", null);
        setField(term16587, term16587.getClass(), "queue", null);
        setField(term16587, term16587.getClass(), "next", null);
        setField(term16587, term16587.getClass(), "discovered", null);
        setField(term16585, term16585.getClass(), "next", term16587);
        setField(term16585, term16585.getClass(), "list", term16586);
        setField(term16585, term16585.getClass(), "referent", term16583);
        setField(term16588, term16588.getClass(), "lock", null);
        setField(term16588, term16588.getClass(), "head", null);
        setLongField(term16588, term16588.getClass(), "queueLength", 0L);
        setField(term16585, term16585.getClass(), "queue", term16588);
        setField(term16585, term16585.getClass(), "next", null);
        setField(term16585, term16585.getClass(), "discovered", null);
        setField(term16584, term16584.getClass(), "cleanable", term16585);
        setField(term16583, term16583.getClass(), "zsRef", term16584);
        setField(term16589, term16589.getClass(), "hb", term16590);
        setIntField(term16589, term16589.getClass(), "offset", 0);
        setBooleanField(term16589, term16589.getClass(), "isReadOnly", false);
        setBooleanField(term16589, term16589.getClass(), "bigEndian", true);
        setBooleanField(term16589, term16589.getClass(), "nativeByteOrder", false);
        setIntField(term16589, term16589.getClass(), "mark", -1);
        setIntField(term16589, term16589.getClass(), "position", 0);
        setIntField(term16589, term16589.getClass(), "limit", 0);
        setIntField(term16589, term16589.getClass(), "capacity", 0);
        setLongField(term16589, term16589.getClass(), "address", 16L);
        setField(term16583, term16583.getClass(), "input", term16589);
        setField(term16583, term16583.getClass(), "inputArray", null);
        setIntField(term16583, term16583.getClass(), "inputPos", 0);
        setIntField(term16583, term16583.getClass(), "inputLim", 0);
        setBooleanField(term16583, term16583.getClass(), "finished", false);
        setBooleanField(term16583, term16583.getClass(), "needDict", false);
        setLongField(term16583, term16583.getClass(), "bytesRead", 0L);
        setLongField(term16583, term16583.getClass(), "bytesWritten", 0L);
        setIntField(term16583, term16583.getClass(), "inputConsumed", 0);
        setIntField(term16583, term16583.getClass(), "outputConsumed", 0);
        setField(term16577, term16577.getClass(), "inf", term16583);
        setField(term16591, term16591.getClass(), "hb", term16592);
        setIntField(term16591, term16591.getClass(), "offset", 0);
        setBooleanField(term16591, term16591.getClass(), "isReadOnly", false);
        setBooleanField(term16591, term16591.getClass(), "bigEndian", true);
        setBooleanField(term16591, term16591.getClass(), "nativeByteOrder", false);
        setIntField(term16591, term16591.getClass(), "mark", -1);
        setIntField(term16591, term16591.getClass(), "position", 0);
        setIntField(term16591, term16591.getClass(), "limit", 0);
        setIntField(term16591, term16591.getClass(), "capacity", 512);
        setLongField(term16591, term16591.getClass(), "address", 16L);
        setField(term16577, term16577.getClass(), "buf", term16591);
        setField(term16577, term16577.getClass(), "current", null);
        setBooleanField(term16577, term16577.getClass(), "closed", false);
        setBooleanField(term16577, term16577.getClass(), "hitCentralDirectory", false);
        setField(term16577, term16577.getClass(), "lastStoredEntry", null);
        setBooleanField(term16577, term16577.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term16577, term16577.getClass(), "LFH_BUF", term16593);
        setField(term16577, term16577.getClass(), "SKIP_BUF", term16594);
        setField(term16577, term16577.getClass(), "SHORT_BUF", term16595);
        setField(term16577, term16577.getClass(), "WORD_BUF", term16596);
        setField(term16577, term16577.getClass(), "TWO_DWORD_BUF", term16597);
        setIntField(term16577, term16577.getClass(), "entriesRead", 0);
        setField(term16577, term16577.getClass(), "SINGLE", term16598);
        setLongField(term16577, term16577.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term16577));
        assertTrue(recursiveEquals(term35, false));
    }

};


