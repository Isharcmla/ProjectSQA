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

public class ZipArchiveEntry_getUnixMode_131737794513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7378;

    public ZipArchiveEntry_getUnixMode_131737794513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term7384 = new LinkedHashMap();
        Class<? extends Object> term7540 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7539 = ((Class) term7540).getDeclaredField((String) "HOURS");
        ((Field) term7539).setAccessible(true);
        Object enum28 = ((Field) term7539).get((Object) null);
        Class<? extends Object> term7717 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term7716 = ((Class) term7717).getDeclaredField((String) "SECONDS");
        ((Field) term7716).setAccessible(true);
        Object enum29 = ((Field) term7716).get((Object) null);
        term7378 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term7395 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term7396 = (byte[]) newByteArray(1);
        byte[] term7398 = (byte[]) newByteArray(0);
        byte[] term7401 = (byte[]) newByteArray(9);
        Object term7411 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term7419 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7438 = newInstance(Class.forName("java.time.Instant"));
        Object term7453 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7474 = newInstance(Class.forName("java.time.Instant"));
        Object term7489 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term7491 = newInstance(Class.forName("java.time.Instant"));
        byte[] term7511 = (byte[]) newByteArray(4);
        setIntField(term7378, term7378.getClass(), "method", -1);
        setLongField(term7378, term7378.getClass(), "size", -1L);
        setIntField(term7378, term7378.getClass(), "internalAttributes", 97029295);
        setIntField(term7378, term7378.getClass(), "platform", -1371869594);
        setLongField(term7378, term7378.getClass(), "externalAttributes", 4178434741742309755L);
        setField(term7378, term7378.getClass(), "extraFields", term7384);
        setByteElement(term7396, 0, (byte) -126);
        setField(term7395, term7395.getClass(), "localFileData", term7396);
        setField(term7395, term7395.getClass(), "centralDirectoryData", term7398);
        setField(term7378, term7378.getClass(), "unparseableExtra", term7395);
        setField(term7378, term7378.getClass(), "name", "");
        setByteElement(term7401, 0, (byte) 12);
        setByteElement(term7401, 1, (byte) -75);
        setByteElement(term7401, 2, (byte) 69);
        setByteElement(term7401, 3, (byte) -6);
        setByteElement(term7401, 4, (byte) 107);
        setByteElement(term7401, 5, (byte) -109);
        setByteElement(term7401, 6, (byte) 122);
        setByteElement(term7401, 7, (byte) 83);
        setByteElement(term7401, 8, (byte) -123);
        setField(term7378, term7378.getClass(), "rawName", term7401);
        setBooleanField(term7411, term7411.getClass(), "languageEncodingFlag", false);
        setBooleanField(term7411, term7411.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term7411, term7411.getClass(), "encryptionFlag", false);
        setBooleanField(term7411, term7411.getClass(), "strongEncryptionFlag", false);
        setField(term7378, term7378.getClass(), "gpb", term7411);
        setLongField(term7378, term7378.getClass(), "xdostime", -1L);
        setField(term7419, term7419.getClass(), "unit", enum28);
        setLongField(term7419, term7419.getClass(), "value", -2068172595987555756L);
        setLongField(term7438, term7438.getClass(), "seconds", 1496877828L);
        setIntField(term7438, term7438.getClass(), "nanos", 764000000);
        setField(term7419, term7419.getClass(), "instant", term7438);
        setField(term7419, term7419.getClass(), "valueAsString", "BndsHwAFMv");
        setField(term7378, term7378.getClass(), "mtime", term7419);
        setField(term7453, term7453.getClass(), "unit", enum29);
        setLongField(term7453, term7453.getClass(), "value", -6292278961887936280L);
        setLongField(term7474, term7474.getClass(), "seconds", 1691886468L);
        setIntField(term7474, term7474.getClass(), "nanos", 367000000);
        setField(term7453, term7453.getClass(), "instant", term7474);
        setField(term7453, term7453.getClass(), "valueAsString", "GzFkzHGYFt");
        setField(term7378, term7378.getClass(), "atime", term7453);
        setField(term7489, term7489.getClass(), "unit", enum28);
        setLongField(term7489, term7489.getClass(), "value", -6645965768855543712L);
        setLongField(term7491, term7491.getClass(), "seconds", 1442388534L);
        setIntField(term7491, term7491.getClass(), "nanos", 632000000);
        setField(term7489, term7489.getClass(), "instant", term7491);
        setField(term7489, term7489.getClass(), "valueAsString", "tShwQLRGNe");
        setField(term7378, term7378.getClass(), "ctime", term7489);
        setLongField(term7378, term7378.getClass(), "crc", -1L);
        setLongField(term7378, term7378.getClass(), "csize", -1L);
        setIntField(term7378, term7378.getClass(), "flag", 1225272962);
        setByteElement(term7511, 0, (byte) -76);
        setByteElement(term7511, 1, (byte) -115);
        setByteElement(term7511, 2, (byte) -48);
        setByteElement(term7511, 3, (byte) 126);
        setField(term7378, term7378.getClass(), "extra", term7511);
        setField(term7378, term7378.getClass(), "comment", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnixMode", argTypes, term7378, args);
    }

};


