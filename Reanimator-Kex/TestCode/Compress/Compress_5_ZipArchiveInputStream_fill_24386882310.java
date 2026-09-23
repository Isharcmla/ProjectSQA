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

public class ZipArchiveInputStream_fill_24386882310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4298;

    public ZipArchiveInputStream_fill_24386882310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4338 = new LinkedHashMap();
        Class<? extends Object> term4483 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4482 = ((Class) term4483).getDeclaredField((String) "MICROSECONDS");
        ((Field) term4482).setAccessible(true);
        Object enum15 = ((Field) term4482).get((Object) null);
        Class<? extends Object> term4681 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4680 = ((Class) term4681).getDeclaredField((String) "SECONDS");
        ((Field) term4680).setAccessible(true);
        Object enum16 = ((Field) term4680).get((Object) null);
        Class<? extends Object> term4864 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term4863 = ((Class) term4864).getDeclaredField((String) "HOURS");
        ((Field) term4863).setAccessible(true);
        Object enum17 = ((Field) term4863).get((Object) null);
        term4298 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term4300 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term4301 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term4303 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4304 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4305 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term4306 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4308 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4309 = (byte[]) newByteArray(0);
        byte[] term4319 = (byte[]) newByteArray(2);
        Object term4330 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term4332 = (byte[]) newByteArray(1);
        Object term4334 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term4359 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4372 = newInstance(Class.forName("java.time.Instant"));
        Object term4387 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4400 = newInstance(Class.forName("java.time.Instant"));
        Object term4415 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term4428 = newInstance(Class.forName("java.time.Instant"));
        byte[] term4448 = (byte[]) newByteArray(0);
        byte[] term4469 = (byte[]) newByteArray(8);
        setField(term4298, term4298.getClass(), "zipEncoding", null);
        setBooleanField(term4298, term4298.getClass(), "useUnicodeExtraFields", true);
        setField(term4298, term4298.getClass(), "in", null);
        setLongField(term4301, term4301.getClass(), "address", 132947027727936L);
        setField(term4303, term4303.getClass(), "action", term4301);
        setField(term4304, term4304.getClass(), "action", null);
        setField(term4304, term4304.getClass(), "prev", null);
        setField(term4304, term4304.getClass(), "next", term4303);
        setField(term4304, term4304.getClass(), "list", term4304);
        setField(term4304, term4304.getClass(), "referent", null);
        setField(term4304, term4304.getClass(), "queue", null);
        setField(term4304, term4304.getClass(), "next", null);
        setField(term4304, term4304.getClass(), "discovered", null);
        setField(term4303, term4303.getClass(), "prev", term4304);
        setField(term4305, term4305.getClass(), "action", null);
        setField(term4305, term4305.getClass(), "prev", term4303);
        setField(term4305, term4305.getClass(), "next", null);
        setField(term4305, term4305.getClass(), "list", term4304);
        setField(term4305, term4305.getClass(), "referent", null);
        setField(term4305, term4305.getClass(), "queue", null);
        setField(term4305, term4305.getClass(), "next", null);
        setField(term4305, term4305.getClass(), "discovered", null);
        setField(term4303, term4303.getClass(), "next", term4305);
        setField(term4303, term4303.getClass(), "list", term4304);
        setField(term4303, term4303.getClass(), "referent", term4300);
        setField(term4306, term4306.getClass(), "lock", null);
        setField(term4306, term4306.getClass(), "head", null);
        setLongField(term4306, term4306.getClass(), "queueLength", 0L);
        setField(term4303, term4303.getClass(), "queue", term4306);
        setField(term4303, term4303.getClass(), "next", null);
        setField(term4303, term4303.getClass(), "discovered", null);
        setField(term4301, term4301.getClass(), "cleanable", term4303);
        setField(term4300, term4300.getClass(), "zsRef", term4301);
        setField(term4308, term4308.getClass(), "hb", term4309);
        setIntField(term4308, term4308.getClass(), "offset", 0);
        setBooleanField(term4308, term4308.getClass(), "isReadOnly", false);
        setBooleanField(term4308, term4308.getClass(), "bigEndian", true);
        setBooleanField(term4308, term4308.getClass(), "nativeByteOrder", false);
        setIntField(term4308, term4308.getClass(), "mark", -1);
        setIntField(term4308, term4308.getClass(), "position", 0);
        setIntField(term4308, term4308.getClass(), "limit", 0);
        setIntField(term4308, term4308.getClass(), "capacity", 0);
        setLongField(term4308, term4308.getClass(), "address", 16L);
        setField(term4300, term4300.getClass(), "input", term4308);
        setByteElement(term4319, 0, (byte) -2);
        setByteElement(term4319, 1, (byte) 28);
        setField(term4300, term4300.getClass(), "inputArray", term4319);
        setIntField(term4300, term4300.getClass(), "inputPos", -344842608);
        setIntField(term4300, term4300.getClass(), "inputLim", 941650513);
        setBooleanField(term4300, term4300.getClass(), "finished", true);
        setBooleanField(term4300, term4300.getClass(), "needDict", false);
        setLongField(term4300, term4300.getClass(), "bytesRead", 1439298019805881866L);
        setLongField(term4300, term4300.getClass(), "bytesWritten", -8708192233349544946L);
        setIntField(term4300, term4300.getClass(), "inputConsumed", 444029505);
        setIntField(term4300, term4300.getClass(), "outputConsumed", -1034506028);
        setField(term4298, term4298.getClass(), "inf", term4300);
        setIntField(term4330, term4330.getClass(), "crc", -1263114719);
        setField(term4298, term4298.getClass(), "crc", term4330);
        setByteElement(term4332, 0, (byte) 84);
        setField(term4298, term4298.getClass(), "buf", term4332);
        setIntField(term4334, term4334.getClass(), "internalAttributes", 304775596);
        setIntField(term4334, term4334.getClass(), "platform", -1347665717);
        setLongField(term4334, term4334.getClass(), "externalAttributes", 5907001541142728739L);
        setField(term4334, term4334.getClass(), "extraFields", term4338);
        setField(term4334, term4334.getClass(), "name", "");
        setLongField(term4334, term4334.getClass(), "xdostime", -1L);
        setField(term4359, term4359.getClass(), "unit", enum15);
        setLongField(term4359, term4359.getClass(), "value", 4178434741742309755L);
        setLongField(term4372, term4372.getClass(), "seconds", 1668587229L);
        setIntField(term4372, term4372.getClass(), "nanos", 825000000);
        setField(term4359, term4359.getClass(), "instant", term4372);
        setField(term4359, term4359.getClass(), "valueAsString", "AijpHYOFuy");
        setField(term4334, term4334.getClass(), "mtime", term4359);
        setField(term4387, term4387.getClass(), "unit", enum16);
        setLongField(term4387, term4387.getClass(), "value", -2068172595987555756L);
        setLongField(term4400, term4400.getClass(), "seconds", 1725140217L);
        setIntField(term4400, term4400.getClass(), "nanos", 647000000);
        setField(term4387, term4387.getClass(), "instant", term4400);
        setField(term4387, term4387.getClass(), "valueAsString", "SbAoxhfrkn");
        setField(term4334, term4334.getClass(), "atime", term4387);
        setField(term4415, term4415.getClass(), "unit", enum17);
        setLongField(term4415, term4415.getClass(), "value", -6292278961887936280L);
        setLongField(term4428, term4428.getClass(), "seconds", 1550716994L);
        setIntField(term4428, term4428.getClass(), "nanos", 689000000);
        setField(term4415, term4415.getClass(), "instant", term4428);
        setField(term4415, term4415.getClass(), "valueAsString", "kuTXqwMtDB");
        setField(term4334, term4334.getClass(), "ctime", term4415);
        setLongField(term4334, term4334.getClass(), "crc", -1L);
        setLongField(term4334, term4334.getClass(), "size", -1L);
        setLongField(term4334, term4334.getClass(), "csize", -1L);
        setIntField(term4334, term4334.getClass(), "method", -1);
        setIntField(term4334, term4334.getClass(), "flag", -1888585309);
        setField(term4334, term4334.getClass(), "extra", term4448);
        setField(term4334, term4334.getClass(), "comment", "Ghbwtircqb");
        setField(term4298, term4298.getClass(), "current", term4334);
        setBooleanField(term4298, term4298.getClass(), "closed", false);
        setBooleanField(term4298, term4298.getClass(), "hitCentralDirectory", false);
        setIntField(term4298, term4298.getClass(), "readBytesOfEntry", 1596213415);
        setIntField(term4298, term4298.getClass(), "offsetInBuffer", -268815336);
        setIntField(term4298, term4298.getClass(), "bytesReadFromStream", -1210583429);
        setIntField(term4298, term4298.getClass(), "lengthOfLastRead", -663691365);
        setBooleanField(term4298, term4298.getClass(), "hasDataDescriptor", true);
        setByteElement(term4469, 0, (byte) 85);
        setByteElement(term4469, 1, (byte) -17);
        setByteElement(term4469, 2, (byte) -83);
        setByteElement(term4469, 3, (byte) 48);
        setByteElement(term4469, 4, (byte) -128);
        setByteElement(term4469, 5, (byte) 70);
        setByteElement(term4469, 6, (byte) -28);
        setByteElement(term4469, 7, (byte) 115);
        setField(term4298, term4298.getClass(), "SINGLE", term4469);
        setIntField(term4298, term4298.getClass(), "bytesRead", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fill", argTypes, term4298, args);
    }

};


