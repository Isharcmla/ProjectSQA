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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class ZipArchiveEntry_setUnixMode_209513641112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6615;
     Object term6793;

    public ZipArchiveEntry_setUnixMode_209513641112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term6621 = new LinkedHashMap();
        Class<? extends Object> term6809 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term6808 = ((Class) term6809).getDeclaredField((String) "MICROSECONDS");
        ((Field) term6808).setAccessible(true);
        Object enum25 = ((Field) term6808).get((Object) null);
        Class<? extends Object> term7007 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7006 = ((Class) term7007).getDeclaredField((String) "MINUTES");
        ((Field) term7006).setAccessible(true);
        Object enum26 = ((Field) term7006).get((Object) null);
        Class<? extends Object> term7190 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7189 = ((Class) term7190).getDeclaredField((String) "DAYS");
        ((Field) term7189).setAccessible(true);
        Object enum27 = ((Field) term7189).get((Object) null);
        term6615 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term6632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term6633 = (byte[]) newByteArray(5);
        byte[] term6639 = (byte[]) newByteArray(3);
        byte[] term6645 = (byte[]) newByteArray(5);
        Object term6651 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term6659 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6685 = newInstance(Class.forName("java.time.Instant"));
        Object term6700 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6721 = newInstance(Class.forName("java.time.Instant"));
        Object term6736 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term6754 = newInstance(Class.forName("java.time.Instant"));
        byte[] term6774 = (byte[]) newByteArray(5);
        setIntField(term6615, term6615.getClass(), "method", -1);
        setLongField(term6615, term6615.getClass(), "size", -1L);
        setIntField(term6615, term6615.getClass(), "internalAttributes", -1048298087);
        setIntField(term6615, term6615.getClass(), "platform", 292681826);
        setLongField(term6615, term6615.getClass(), "externalAttributes", 6617340557564669657L);
        setField(term6615, term6615.getClass(), "extraFields", term6621);
        setByteElement(term6633, 0, (byte) -124);
        setByteElement(term6633, 1, (byte) -105);
        setByteElement(term6633, 2, (byte) 25);
        setByteElement(term6633, 3, (byte) 16);
        setByteElement(term6633, 4, (byte) 39);
        setField(term6632, term6632.getClass(), "localFileData", term6633);
        setByteElement(term6639, 0, (byte) 123);
        setByteElement(term6639, 1, (byte) 16);
        setByteElement(term6639, 2, (byte) 2);
        setField(term6632, term6632.getClass(), "centralDirectoryData", term6639);
        setField(term6615, term6615.getClass(), "unparseableExtra", term6632);
        setField(term6615, term6615.getClass(), "name", "");
        setByteElement(term6645, 0, (byte) -120);
        setByteElement(term6645, 1, (byte) 96);
        setByteElement(term6645, 2, (byte) -41);
        setByteElement(term6645, 3, (byte) -88);
        setByteElement(term6645, 4, (byte) 39);
        setField(term6615, term6615.getClass(), "rawName", term6645);
        setBooleanField(term6651, term6651.getClass(), "languageEncodingFlag", false);
        setBooleanField(term6651, term6651.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term6651, term6651.getClass(), "encryptionFlag", false);
        setBooleanField(term6651, term6651.getClass(), "strongEncryptionFlag", false);
        setField(term6615, term6615.getClass(), "gpb", term6651);
        setLongField(term6615, term6615.getClass(), "xdostime", -1L);
        setField(term6659, term6659.getClass(), "unit", enum25);
        setLongField(term6659, term6659.getClass(), "value", 1439298019805881866L);
        setLongField(term6685, term6685.getClass(), "seconds", 1739435792L);
        setIntField(term6685, term6685.getClass(), "nanos", 956000000);
        setField(term6659, term6659.getClass(), "instant", term6685);
        setField(term6659, term6659.getClass(), "valueAsString", "wSQxaModmm");
        setField(term6615, term6615.getClass(), "mtime", term6659);
        setField(term6700, term6700.getClass(), "unit", enum26);
        setLongField(term6700, term6700.getClass(), "value", -8708192233349544946L);
        setLongField(term6721, term6721.getClass(), "seconds", 1329658267L);
        setIntField(term6721, term6721.getClass(), "nanos", 573000000);
        setField(term6700, term6700.getClass(), "instant", term6721);
        setField(term6700, term6700.getClass(), "valueAsString", "UlajhuVLaP");
        setField(term6615, term6615.getClass(), "atime", term6700);
        setField(term6736, term6736.getClass(), "unit", enum27);
        setLongField(term6736, term6736.getClass(), "value", 5907001541142728739L);
        setLongField(term6754, term6754.getClass(), "seconds", 1334871104L);
        setIntField(term6754, term6754.getClass(), "nanos", 718000000);
        setField(term6736, term6736.getClass(), "instant", term6754);
        setField(term6736, term6736.getClass(), "valueAsString", "gGSMzuGICf");
        setField(term6615, term6615.getClass(), "ctime", term6736);
        setLongField(term6615, term6615.getClass(), "crc", -1L);
        setLongField(term6615, term6615.getClass(), "csize", -1L);
        setIntField(term6615, term6615.getClass(), "flag", -184153539);
        setByteElement(term6774, 0, (byte) -1);
        setByteElement(term6774, 1, (byte) 117);
        setByteElement(term6774, 2, (byte) 43);
        setByteElement(term6774, 3, (byte) -27);
        setByteElement(term6774, 4, (byte) 34);
        setField(term6615, term6615.getClass(), "extra", term6774);
        setField(term6615, term6615.getClass(), "comment", "hxCBltsObl");
        term6793 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6793;
        callMethod(klass, "setUnixMode", argTypes, term6615, args);
    }

};


