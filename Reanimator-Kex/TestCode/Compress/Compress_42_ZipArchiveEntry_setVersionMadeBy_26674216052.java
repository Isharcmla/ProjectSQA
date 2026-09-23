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

public class ZipArchiveEntry_setVersionMadeBy_26674216052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34040;
     Object term34206;

    public ZipArchiveEntry_setVersionMadeBy_26674216052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34230 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term34229 = ((Class) term34230).getDeclaredField((String) "DAYS");
        ((Field) term34229).setAccessible(true);
        Object enum129 = ((Field) term34229).get((Object) null);
        Class<? extends Object> term34404 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term34403 = ((Class) term34404).getDeclaredField((String) "MILLISECONDS");
        ((Field) term34403).setAccessible(true);
        Object enum130 = ((Field) term34403).get((Object) null);
        term34040 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term34049 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term34050 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term34051 = (byte[]) newByteArray(7);
        byte[] term34059 = (byte[]) newByteArray(7);
        byte[] term34069 = (byte[]) newByteArray(7);
        Object term34077 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term34087 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34105 = newInstance(Class.forName("java.time.Instant"));
        Object term34120 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34146 = newInstance(Class.forName("java.time.Instant"));
        Object term34161 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34163 = newInstance(Class.forName("java.time.Instant"));
        byte[] term34183 = (byte[]) newByteArray(9);
        setIntField(term34040, term34040.getClass(), "method", -1);
        setLongField(term34040, term34040.getClass(), "size", -1L);
        setIntField(term34040, term34040.getClass(), "internalAttributes", 301401782);
        setIntField(term34040, term34040.getClass(), "versionRequired", 1988605357);
        setIntField(term34040, term34040.getClass(), "versionMadeBy", 808203320);
        setIntField(term34040, term34040.getClass(), "platform", -544382127);
        setIntField(term34040, term34040.getClass(), "rawFlag", -1830198043);
        setLongField(term34040, term34040.getClass(), "externalAttributes", 9205327385733285058L);
        setField(term34040, term34040.getClass(), "extraFields", term34049);
        setByteElement(term34051, 0, (byte) -57);
        setByteElement(term34051, 1, (byte) -30);
        setByteElement(term34051, 2, (byte) -117);
        setByteElement(term34051, 3, (byte) -86);
        setByteElement(term34051, 4, (byte) 47);
        setByteElement(term34051, 5, (byte) -22);
        setByteElement(term34051, 6, (byte) -124);
        setField(term34050, term34050.getClass(), "localFileData", term34051);
        setByteElement(term34059, 0, (byte) 18);
        setByteElement(term34059, 1, (byte) 62);
        setByteElement(term34059, 2, (byte) -34);
        setByteElement(term34059, 3, (byte) -34);
        setByteElement(term34059, 4, (byte) 110);
        setByteElement(term34059, 5, (byte) -78);
        setByteElement(term34059, 6, (byte) 110);
        setField(term34050, term34050.getClass(), "centralDirectoryData", term34059);
        setField(term34040, term34040.getClass(), "unparseableExtra", term34050);
        setField(term34040, term34040.getClass(), "name", "");
        setByteElement(term34069, 0, (byte) 101);
        setByteElement(term34069, 1, (byte) -114);
        setByteElement(term34069, 2, (byte) -62);
        setByteElement(term34069, 3, (byte) -38);
        setByteElement(term34069, 4, (byte) -121);
        setByteElement(term34069, 5, (byte) -74);
        setByteElement(term34069, 6, (byte) -124);
        setField(term34040, term34040.getClass(), "rawName", term34069);
        setBooleanField(term34077, term34077.getClass(), "languageEncodingFlag", false);
        setBooleanField(term34077, term34077.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term34077, term34077.getClass(), "encryptionFlag", false);
        setBooleanField(term34077, term34077.getClass(), "strongEncryptionFlag", false);
        setIntField(term34077, term34077.getClass(), "slidingDictionarySize", 0);
        setIntField(term34077, term34077.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term34040, term34040.getClass(), "gpb", term34077);
        setLongField(term34040, term34040.getClass(), "xdostime", -1L);
        setField(term34087, term34087.getClass(), "unit", enum129);
        setLongField(term34087, term34087.getClass(), "value", 4199886998224701110L);
        setLongField(term34105, term34105.getClass(), "seconds", 1736159630L);
        setIntField(term34105, term34105.getClass(), "nanos", 618000000);
        setField(term34087, term34087.getClass(), "instant", term34105);
        setField(term34087, term34087.getClass(), "valueAsString", "ZkMALXpEAZ");
        setField(term34040, term34040.getClass(), "mtime", term34087);
        setField(term34120, term34120.getClass(), "unit", enum130);
        setLongField(term34120, term34120.getClass(), "value", 8540994973773607992L);
        setLongField(term34146, term34146.getClass(), "seconds", 1267062489L);
        setIntField(term34146, term34146.getClass(), "nanos", 300000000);
        setField(term34120, term34120.getClass(), "instant", term34146);
        setField(term34120, term34120.getClass(), "valueAsString", "tXfQjSqDzN");
        setField(term34040, term34040.getClass(), "atime", term34120);
        setField(term34161, term34161.getClass(), "unit", enum130);
        setLongField(term34161, term34161.getClass(), "value", -2338103433822116635L);
        setLongField(term34163, term34163.getClass(), "seconds", 1446455953L);
        setIntField(term34163, term34163.getClass(), "nanos", 738000000);
        setField(term34161, term34161.getClass(), "instant", term34163);
        setField(term34161, term34161.getClass(), "valueAsString", "BjugTaMcxJ");
        setField(term34040, term34040.getClass(), "ctime", term34161);
        setLongField(term34040, term34040.getClass(), "crc", -1L);
        setLongField(term34040, term34040.getClass(), "csize", -1L);
        setIntField(term34040, term34040.getClass(), "flag", -439048495);
        setByteElement(term34183, 0, (byte) -124);
        setByteElement(term34183, 1, (byte) 91);
        setByteElement(term34183, 2, (byte) 73);
        setByteElement(term34183, 3, (byte) -109);
        setByteElement(term34183, 4, (byte) -64);
        setByteElement(term34183, 5, (byte) -27);
        setByteElement(term34183, 6, (byte) -61);
        setByteElement(term34183, 7, (byte) -20);
        setByteElement(term34183, 8, (byte) -18);
        setField(term34040, term34040.getClass(), "extra", term34183);
        setField(term34040, term34040.getClass(), "comment", "vGiuZVPJNH");
        term34206 = new Integer(1334483645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term34206;
        callMethod(klass, "setVersionMadeBy", argTypes, term34040, args);
    }

};


