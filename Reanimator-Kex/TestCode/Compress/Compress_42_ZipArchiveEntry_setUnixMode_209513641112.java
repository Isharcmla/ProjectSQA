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
import java.lang.String;
import java.lang.Integer;

public class ZipArchiveEntry_setUnixMode_209513641112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6583;
     Object term6757;

    public ZipArchiveEntry_setUnixMode_209513641112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6776 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6775 = ((Class) term6776).getDeclaredField((String) "MICROSECONDS");
        ((Field) term6775).setAccessible(true);
        Object enum25 = ((Field) term6775).get((Object) null);
        Class<? extends Object> term6974 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6973 = ((Class) term6974).getDeclaredField((String) "MINUTES");
        ((Field) term6973).setAccessible(true);
        Object enum26 = ((Field) term6973).get((Object) null);
        Class<? extends Object> term7157 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7156 = ((Class) term7157).getDeclaredField((String) "DAYS");
        ((Field) term7156).setAccessible(true);
        Object enum27 = ((Field) term7156).get((Object) null);
        term6583 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term6592 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term6593 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term6594 = (byte[]) newByteArray(6);
        byte[] term6601 = (byte[]) newByteArray(2);
        byte[] term6606 = (byte[]) newByteArray(8);
        Object term6615 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term6625 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6651 = newInstance(Class.forName("java.time.Instant"));
        Object term6666 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6687 = newInstance(Class.forName("java.time.Instant"));
        Object term6702 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6720 = newInstance(Class.forName("java.time.Instant"));
        byte[] term6740 = (byte[]) newByteArray(3);
        setIntField(term6583, term6583.getClass(), "method", -1);
        setLongField(term6583, term6583.getClass(), "size", -1L);
        setIntField(term6583, term6583.getClass(), "internalAttributes", 287287233);
        setIntField(term6583, term6583.getClass(), "versionRequired", 962840079);
        setIntField(term6583, term6583.getClass(), "versionMadeBy", 1540719661);
        setIntField(term6583, term6583.getClass(), "platform", 1265463001);
        setIntField(term6583, term6583.getClass(), "rawFlag", 335112684);
        setLongField(term6583, term6583.getClass(), "externalAttributes", 6617340557564669657L);
        setField(term6583, term6583.getClass(), "extraFields", term6592);
        setByteElement(term6594, 0, (byte) 39);
        setByteElement(term6594, 1, (byte) 123);
        setByteElement(term6594, 2, (byte) 16);
        setByteElement(term6594, 3, (byte) 2);
        setByteElement(term6594, 4, (byte) -120);
        setByteElement(term6594, 5, (byte) 96);
        setField(term6593, term6593.getClass(), "localFileData", term6594);
        setByteElement(term6601, 0, (byte) -41);
        setByteElement(term6601, 1, (byte) -88);
        setField(term6593, term6593.getClass(), "centralDirectoryData", term6601);
        setField(term6583, term6583.getClass(), "unparseableExtra", term6593);
        setField(term6583, term6583.getClass(), "name", "");
        setByteElement(term6606, 0, (byte) 39);
        setByteElement(term6606, 1, (byte) -1);
        setByteElement(term6606, 2, (byte) 117);
        setByteElement(term6606, 3, (byte) 43);
        setByteElement(term6606, 4, (byte) -27);
        setByteElement(term6606, 5, (byte) 34);
        setByteElement(term6606, 6, (byte) -126);
        setByteElement(term6606, 7, (byte) 12);
        setField(term6583, term6583.getClass(), "rawName", term6606);
        setBooleanField(term6615, term6615.getClass(), "languageEncodingFlag", false);
        setBooleanField(term6615, term6615.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term6615, term6615.getClass(), "encryptionFlag", false);
        setBooleanField(term6615, term6615.getClass(), "strongEncryptionFlag", false);
        setIntField(term6615, term6615.getClass(), "slidingDictionarySize", 0);
        setIntField(term6615, term6615.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term6583, term6583.getClass(), "gpb", term6615);
        setLongField(term6583, term6583.getClass(), "xdostime", -1L);
        setField(term6625, term6625.getClass(), "unit", enum25);
        setLongField(term6625, term6625.getClass(), "value", 1439298019805881866L);
        setLongField(term6651, term6651.getClass(), "seconds", 1739435792L);
        setIntField(term6651, term6651.getClass(), "nanos", 956000000);
        setField(term6625, term6625.getClass(), "instant", term6651);
        setField(term6625, term6625.getClass(), "valueAsString", "wSQxaModmm");
        setField(term6583, term6583.getClass(), "mtime", term6625);
        setField(term6666, term6666.getClass(), "unit", enum26);
        setLongField(term6666, term6666.getClass(), "value", -8708192233349544946L);
        setLongField(term6687, term6687.getClass(), "seconds", 1329658267L);
        setIntField(term6687, term6687.getClass(), "nanos", 573000000);
        setField(term6666, term6666.getClass(), "instant", term6687);
        setField(term6666, term6666.getClass(), "valueAsString", "UlajhuVLaP");
        setField(term6583, term6583.getClass(), "atime", term6666);
        setField(term6702, term6702.getClass(), "unit", enum27);
        setLongField(term6702, term6702.getClass(), "value", 5907001541142728739L);
        setLongField(term6720, term6720.getClass(), "seconds", 1334871104L);
        setIntField(term6720, term6720.getClass(), "nanos", 718000000);
        setField(term6702, term6702.getClass(), "instant", term6720);
        setField(term6702, term6702.getClass(), "valueAsString", "gGSMzuGICf");
        setField(term6583, term6583.getClass(), "ctime", term6702);
        setLongField(term6583, term6583.getClass(), "crc", -1L);
        setLongField(term6583, term6583.getClass(), "csize", -1L);
        setIntField(term6583, term6583.getClass(), "flag", 1551099402);
        setByteElement(term6740, 0, (byte) -75);
        setByteElement(term6740, 1, (byte) 69);
        setByteElement(term6740, 2, (byte) -6);
        setField(term6583, term6583.getClass(), "extra", term6740);
        setField(term6583, term6583.getClass(), "comment", "hxCBltsObl");
        term6757 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6757;
        callMethod(klass, "setUnixMode", argTypes, term6583, args);
    }

};


