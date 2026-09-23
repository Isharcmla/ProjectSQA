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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;

public class ZipArchiveInputStream_closeEntry_14182782269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3537;

    public ZipArchiveInputStream_closeEntry_14182782269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3586 = new LinkedHashMap();
        Class<? extends Object> term3739 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3738 = ((Class) term3739).getDeclaredField((String) "MINUTES");
        ((Field) term3738).setAccessible(true);
        Object enum12 = ((Field) term3738).get((Object) null);
        Class<? extends Object> term3922 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3921 = ((Class) term3922).getDeclaredField((String) "HOURS");
        ((Field) term3921).setAccessible(true);
        Object enum13 = ((Field) term3921).get((Object) null);
        Class<? extends Object> term4099 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4098 = ((Class) term4099).getDeclaredField((String) "MINUTES");
        ((Field) term4098).setAccessible(true);
        Object enum14 = ((Field) term4098).get((Object) null);
        term3537 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term3539 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term3540 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term3542 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3543 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3544 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term3545 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3547 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term3548 = (byte[]) newByteArray(0);
        byte[] term3558 = (byte[]) newByteArray(6);
        Object term3573 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term3575 = (byte[]) newByteArray(6);
        Object term3582 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term3607 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3620 = newInstance(Class.forName("java.time.Instant"));
        Object term3635 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3648 = newInstance(Class.forName("java.time.Instant"));
        Object term3663 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term3676 = newInstance(Class.forName("java.time.Instant"));
        byte[] term3696 = (byte[]) newByteArray(2);
        byte[] term3719 = (byte[]) newByteArray(5);
        setField(term3537, term3537.getClass(), "zipEncoding", null);
        setBooleanField(term3537, term3537.getClass(), "useUnicodeExtraFields", true);
        setField(term3537, term3537.getClass(), "in", null);
        setLongField(term3540, term3540.getClass(), "address", 132947027404544L);
        setField(term3542, term3542.getClass(), "action", term3540);
        setField(term3543, term3543.getClass(), "action", null);
        setField(term3543, term3543.getClass(), "prev", null);
        setField(term3543, term3543.getClass(), "next", term3542);
        setField(term3543, term3543.getClass(), "list", term3543);
        setField(term3543, term3543.getClass(), "referent", null);
        setField(term3543, term3543.getClass(), "queue", null);
        setField(term3543, term3543.getClass(), "next", null);
        setField(term3543, term3543.getClass(), "discovered", null);
        setField(term3542, term3542.getClass(), "prev", term3543);
        setField(term3544, term3544.getClass(), "action", null);
        setField(term3544, term3544.getClass(), "prev", term3542);
        setField(term3544, term3544.getClass(), "next", null);
        setField(term3544, term3544.getClass(), "list", term3543);
        setField(term3544, term3544.getClass(), "referent", null);
        setField(term3544, term3544.getClass(), "queue", null);
        setField(term3544, term3544.getClass(), "next", null);
        setField(term3544, term3544.getClass(), "discovered", null);
        setField(term3542, term3542.getClass(), "next", term3544);
        setField(term3542, term3542.getClass(), "list", term3543);
        setField(term3542, term3542.getClass(), "referent", term3539);
        setField(term3545, term3545.getClass(), "lock", null);
        setField(term3545, term3545.getClass(), "head", null);
        setLongField(term3545, term3545.getClass(), "queueLength", 0L);
        setField(term3542, term3542.getClass(), "queue", term3545);
        setField(term3542, term3542.getClass(), "next", null);
        setField(term3542, term3542.getClass(), "discovered", null);
        setField(term3540, term3540.getClass(), "cleanable", term3542);
        setField(term3539, term3539.getClass(), "zsRef", term3540);
        setField(term3547, term3547.getClass(), "hb", term3548);
        setIntField(term3547, term3547.getClass(), "offset", 0);
        setBooleanField(term3547, term3547.getClass(), "isReadOnly", false);
        setBooleanField(term3547, term3547.getClass(), "bigEndian", true);
        setBooleanField(term3547, term3547.getClass(), "nativeByteOrder", false);
        setIntField(term3547, term3547.getClass(), "mark", -1);
        setIntField(term3547, term3547.getClass(), "position", 0);
        setIntField(term3547, term3547.getClass(), "limit", 0);
        setIntField(term3547, term3547.getClass(), "capacity", 0);
        setLongField(term3547, term3547.getClass(), "address", 16L);
        setField(term3539, term3539.getClass(), "input", term3547);
        setByteElement(term3558, 0, (byte) -46);
        setByteElement(term3558, 1, (byte) -128);
        setByteElement(term3558, 2, (byte) 66);
        setByteElement(term3558, 3, (byte) -112);
        setByteElement(term3558, 4, (byte) 81);
        setByteElement(term3558, 5, (byte) 65);
        setField(term3539, term3539.getClass(), "inputArray", term3558);
        setIntField(term3539, term3539.getClass(), "inputPos", 1375330971);
        setIntField(term3539, term3539.getClass(), "inputLim", -478195677);
        setBooleanField(term3539, term3539.getClass(), "finished", true);
        setBooleanField(term3539, term3539.getClass(), "needDict", true);
        setLongField(term3539, term3539.getClass(), "bytesRead", -5892135042702373494L);
        setLongField(term3539, term3539.getClass(), "bytesWritten", 5262507301787091109L);
        setIntField(term3539, term3539.getClass(), "inputConsumed", 972867650);
        setIntField(term3539, term3539.getClass(), "outputConsumed", 1655935355);
        setField(term3537, term3537.getClass(), "inf", term3539);
        setIntField(term3573, term3573.getClass(), "crc", -481533957);
        setField(term3537, term3537.getClass(), "crc", term3573);
        setByteElement(term3575, 0, (byte) -44);
        setByteElement(term3575, 1, (byte) 33);
        setByteElement(term3575, 2, (byte) -74);
        setByteElement(term3575, 3, (byte) -84);
        setByteElement(term3575, 4, (byte) -53);
        setByteElement(term3575, 5, (byte) -93);
        setField(term3537, term3537.getClass(), "buf", term3575);
        setIntField(term3582, term3582.getClass(), "internalAttributes", -1465035361);
        setIntField(term3582, term3582.getClass(), "platform", 1090617576);
        setLongField(term3582, term3582.getClass(), "externalAttributes", -6823727938421990489L);
        setField(term3582, term3582.getClass(), "extraFields", term3586);
        setField(term3582, term3582.getClass(), "name", "");
        setLongField(term3582, term3582.getClass(), "xdostime", -1L);
        setField(term3607, term3607.getClass(), "unit", enum12);
        setLongField(term3607, term3607.getClass(), "value", -484994522244390100L);
        setLongField(term3620, term3620.getClass(), "seconds", 1863649094L);
        setIntField(term3620, term3620.getClass(), "nanos", 992000000);
        setField(term3607, term3607.getClass(), "instant", term3620);
        setField(term3607, term3607.getClass(), "valueAsString", "OclPbYPkcH");
        setField(term3582, term3582.getClass(), "mtime", term3607);
        setField(term3635, term3635.getClass(), "unit", enum13);
        setLongField(term3635, term3635.getClass(), "value", 1233889271256172047L);
        setLongField(term3648, term3648.getClass(), "seconds", 1882656884L);
        setIntField(term3648, term3648.getClass(), "nanos", 364000000);
        setField(term3635, term3635.getClass(), "instant", term3648);
        setField(term3635, term3635.getClass(), "valueAsString", "IoAlmYsBwc");
        setField(term3582, term3582.getClass(), "atime", term3635);
        setField(term3663, term3663.getClass(), "unit", enum14);
        setLongField(term3663, term3663.getClass(), "value", 6617340557564669657L);
        setLongField(term3676, term3676.getClass(), "seconds", 1437775323L);
        setIntField(term3676, term3676.getClass(), "nanos", 580000000);
        setField(term3663, term3663.getClass(), "instant", term3676);
        setField(term3663, term3663.getClass(), "valueAsString", "TEParAifyi");
        setField(term3582, term3582.getClass(), "ctime", term3663);
        setLongField(term3582, term3582.getClass(), "crc", -1L);
        setLongField(term3582, term3582.getClass(), "size", -1L);
        setLongField(term3582, term3582.getClass(), "csize", -1L);
        setIntField(term3582, term3582.getClass(), "method", -1);
        setIntField(term3582, term3582.getClass(), "flag", -1547384488);
        setByteElement(term3696, 0, (byte) 82);
        setByteElement(term3696, 1, (byte) -89);
        setField(term3582, term3582.getClass(), "extra", term3696);
        setField(term3582, term3582.getClass(), "comment", "OWDIEULEFu");
        setField(term3537, term3537.getClass(), "current", term3582);
        setBooleanField(term3537, term3537.getClass(), "closed", false);
        setBooleanField(term3537, term3537.getClass(), "hitCentralDirectory", true);
        setIntField(term3537, term3537.getClass(), "readBytesOfEntry", 1114000454);
        setIntField(term3537, term3537.getClass(), "offsetInBuffer", -556405712);
        setIntField(term3537, term3537.getClass(), "bytesReadFromStream", -1772434990);
        setIntField(term3537, term3537.getClass(), "lengthOfLastRead", -1845499264);
        setBooleanField(term3537, term3537.getClass(), "hasDataDescriptor", true);
        setByteElement(term3719, 0, (byte) 24);
        setByteElement(term3719, 1, (byte) 123);
        setByteElement(term3719, 2, (byte) -101);
        setByteElement(term3719, 3, (byte) -102);
        setByteElement(term3719, 4, (byte) -95);
        setField(term3537, term3537.getClass(), "SINGLE", term3719);
        setIntField(term3537, term3537.getClass(), "bytesRead", -505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeEntry", argTypes, term3537, args);
    }

};


