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
import java.lang.Boolean;

public class ZipArchiveEntry_mergeExtraFields_150703452649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32144;
     Object term32327;
     Object term32328;

    public ZipArchiveEntry_mergeExtraFields_150703452649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32353 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term32352 = ((Class) term32353).getDeclaredField((String) "MILLISECONDS");
        ((Field) term32352).setAccessible(true);
        Object enum122 = ((Field) term32352).get((Object) null);
        Class<? extends Object> term32551 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term32550 = ((Class) term32551).getDeclaredField((String) "HOURS");
        ((Field) term32550).setAccessible(true);
        Object enum123 = ((Field) term32550).get((Object) null);
        Class<? extends Object> term32728 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term32727 = ((Class) term32728).getDeclaredField((String) "SECONDS");
        ((Field) term32727).setAccessible(true);
        Object enum124 = ((Field) term32727).get((Object) null);
        term32144 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term32153 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 8);
        Object term32154 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term32155 = (byte[]) newByteArray(9);
        byte[] term32165 = (byte[]) newByteArray(7);
        byte[] term32175 = (byte[]) newByteArray(6);
        Object term32182 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term32192 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32218 = newInstance(Class.forName("java.time.Instant"));
        Object term32233 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32252 = newInstance(Class.forName("java.time.Instant"));
        Object term32267 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32288 = newInstance(Class.forName("java.time.Instant"));
        byte[] term32308 = (byte[]) newByteArray(5);
        setIntField(term32144, term32144.getClass(), "method", -1);
        setLongField(term32144, term32144.getClass(), "size", -1L);
        setIntField(term32144, term32144.getClass(), "internalAttributes", -434468428);
        setIntField(term32144, term32144.getClass(), "versionRequired", 1559605714);
        setIntField(term32144, term32144.getClass(), "versionMadeBy", 1146601902);
        setIntField(term32144, term32144.getClass(), "platform", -1938881385);
        setIntField(term32144, term32144.getClass(), "rawFlag", -1629418973);
        setLongField(term32144, term32144.getClass(), "externalAttributes", -6673920710396545553L);
        setField(term32144, term32144.getClass(), "extraFields", term32153);
        setByteElement(term32155, 0, (byte) 65);
        setByteElement(term32155, 1, (byte) -64);
        setByteElement(term32155, 2, (byte) 24);
        setByteElement(term32155, 3, (byte) 61);
        setByteElement(term32155, 4, (byte) -45);
        setByteElement(term32155, 5, (byte) 40);
        setByteElement(term32155, 6, (byte) 52);
        setByteElement(term32155, 7, (byte) -56);
        setByteElement(term32155, 8, (byte) 81);
        setField(term32154, term32154.getClass(), "localFileData", term32155);
        setByteElement(term32165, 0, (byte) -26);
        setByteElement(term32165, 1, (byte) 11);
        setByteElement(term32165, 2, (byte) 91);
        setByteElement(term32165, 3, (byte) 48);
        setByteElement(term32165, 4, (byte) -118);
        setByteElement(term32165, 5, (byte) -15);
        setByteElement(term32165, 6, (byte) 91);
        setField(term32154, term32154.getClass(), "centralDirectoryData", term32165);
        setField(term32144, term32144.getClass(), "unparseableExtra", term32154);
        setField(term32144, term32144.getClass(), "name", "");
        setByteElement(term32175, 0, (byte) -114);
        setByteElement(term32175, 1, (byte) 124);
        setByteElement(term32175, 2, (byte) 97);
        setByteElement(term32175, 3, (byte) -15);
        setByteElement(term32175, 4, (byte) -70);
        setByteElement(term32175, 5, (byte) 48);
        setField(term32144, term32144.getClass(), "rawName", term32175);
        setBooleanField(term32182, term32182.getClass(), "languageEncodingFlag", false);
        setBooleanField(term32182, term32182.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term32182, term32182.getClass(), "encryptionFlag", false);
        setBooleanField(term32182, term32182.getClass(), "strongEncryptionFlag", false);
        setIntField(term32182, term32182.getClass(), "slidingDictionarySize", 0);
        setIntField(term32182, term32182.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term32144, term32144.getClass(), "gpb", term32182);
        setLongField(term32144, term32144.getClass(), "xdostime", -1L);
        setField(term32192, term32192.getClass(), "unit", enum122);
        setLongField(term32192, term32192.getClass(), "value", 3412644969878030772L);
        setLongField(term32218, term32218.getClass(), "seconds", 1563521265L);
        setIntField(term32218, term32218.getClass(), "nanos", 459000000);
        setField(term32192, term32192.getClass(), "instant", term32218);
        setField(term32192, term32192.getClass(), "valueAsString", "lFRJFUMVbx");
        setField(term32144, term32144.getClass(), "mtime", term32192);
        setField(term32233, term32233.getClass(), "unit", enum123);
        setLongField(term32233, term32233.getClass(), "value", 6698455537431331246L);
        setLongField(term32252, term32252.getClass(), "seconds", 1416744423L);
        setIntField(term32252, term32252.getClass(), "nanos", 958000000);
        setField(term32233, term32233.getClass(), "instant", term32252);
        setField(term32233, term32233.getClass(), "valueAsString", "sZdUNdggUW");
        setField(term32144, term32144.getClass(), "atime", term32233);
        setField(term32267, term32267.getClass(), "unit", enum124);
        setLongField(term32267, term32267.getClass(), "value", -8327432141027603933L);
        setLongField(term32288, term32288.getClass(), "seconds", 1650032053L);
        setIntField(term32288, term32288.getClass(), "nanos", 723000000);
        setField(term32267, term32267.getClass(), "instant", term32288);
        setField(term32267, term32267.getClass(), "valueAsString", "OqbwYQfvAe");
        setField(term32144, term32144.getClass(), "ctime", term32267);
        setLongField(term32144, term32144.getClass(), "crc", -1L);
        setLongField(term32144, term32144.getClass(), "csize", -1L);
        setIntField(term32144, term32144.getClass(), "flag", -100825168);
        setByteElement(term32308, 0, (byte) 33);
        setByteElement(term32308, 1, (byte) 102);
        setByteElement(term32308, 2, (byte) -7);
        setByteElement(term32308, 3, (byte) -105);
        setByteElement(term32308, 4, (byte) -92);
        setField(term32144, term32144.getClass(), "extra", term32308);
        setField(term32144, term32144.getClass(), "comment", "tRxZafjqIx");
        term32327 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 2);
        term32328 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term32327;
        args[1] = term32328;
        callMethod(klass, "mergeExtraFields", argTypes, term32144, args);
    }

};


