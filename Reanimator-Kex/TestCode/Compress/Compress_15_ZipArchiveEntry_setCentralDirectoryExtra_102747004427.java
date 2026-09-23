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

public class ZipArchiveEntry_setCentralDirectoryExtra_102747004427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16982;
     Object term17134;

    public ZipArchiveEntry_setCentralDirectoryExtra_102747004427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16988 = new LinkedHashMap();
        Class<? extends Object> term17161 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term17160 = ((Class) term17161).getDeclaredField((String) "MILLISECONDS");
        ((Field) term17160).setAccessible(true);
        Object enum64 = ((Field) term17160).get((Object) null);
        term16982 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term16999 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term17000 = (byte[]) newByteArray(9);
        byte[] term17010 = (byte[]) newByteArray(7);
        byte[] term17020 = (byte[]) newByteArray(6);
        Object term17027 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term17035 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17061 = newInstance(Class.forName("java.time.Instant"));
        Object term17076 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17078 = newInstance(Class.forName("java.time.Instant"));
        Object term17093 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term17095 = newInstance(Class.forName("java.time.Instant"));
        byte[] term17115 = (byte[]) newByteArray(5);
        setIntField(term16982, term16982.getClass(), "method", -1);
        setLongField(term16982, term16982.getClass(), "size", -1L);
        setIntField(term16982, term16982.getClass(), "internalAttributes", 158873461);
        setIntField(term16982, term16982.getClass(), "platform", -430151637);
        setLongField(term16982, term16982.getClass(), "externalAttributes", 2135754395358000892L);
        setField(term16982, term16982.getClass(), "extraFields", term16988);
        setByteElement(term17000, 0, (byte) 43);
        setByteElement(term17000, 1, (byte) -27);
        setByteElement(term17000, 2, (byte) -110);
        setByteElement(term17000, 3, (byte) 62);
        setByteElement(term17000, 4, (byte) -59);
        setByteElement(term17000, 5, (byte) 126);
        setByteElement(term17000, 6, (byte) -15);
        setByteElement(term17000, 7, (byte) 60);
        setByteElement(term17000, 8, (byte) -51);
        setField(term16999, term16999.getClass(), "localFileData", term17000);
        setByteElement(term17010, 0, (byte) 65);
        setByteElement(term17010, 1, (byte) 103);
        setByteElement(term17010, 2, (byte) -19);
        setByteElement(term17010, 3, (byte) -36);
        setByteElement(term17010, 4, (byte) -23);
        setByteElement(term17010, 5, (byte) -100);
        setByteElement(term17010, 6, (byte) 23);
        setField(term16999, term16999.getClass(), "centralDirectoryData", term17010);
        setField(term16982, term16982.getClass(), "unparseableExtra", term16999);
        setField(term16982, term16982.getClass(), "name", "");
        setByteElement(term17020, 0, (byte) -30);
        setByteElement(term17020, 1, (byte) -37);
        setByteElement(term17020, 2, (byte) -123);
        setByteElement(term17020, 3, (byte) 51);
        setByteElement(term17020, 4, (byte) 90);
        setByteElement(term17020, 5, (byte) 66);
        setField(term16982, term16982.getClass(), "rawName", term17020);
        setBooleanField(term17027, term17027.getClass(), "languageEncodingFlag", false);
        setBooleanField(term17027, term17027.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term17027, term17027.getClass(), "encryptionFlag", false);
        setBooleanField(term17027, term17027.getClass(), "strongEncryptionFlag", false);
        setField(term16982, term16982.getClass(), "gpb", term17027);
        setLongField(term16982, term16982.getClass(), "xdostime", -1L);
        setField(term17035, term17035.getClass(), "unit", enum64);
        setLongField(term17035, term17035.getClass(), "value", -8085190702504231560L);
        setLongField(term17061, term17061.getClass(), "seconds", 1263762156L);
        setIntField(term17061, term17061.getClass(), "nanos", 294000000);
        setField(term17035, term17035.getClass(), "instant", term17061);
        setField(term17035, term17035.getClass(), "valueAsString", "SPpkrGcPRr");
        setField(term16982, term16982.getClass(), "mtime", term17035);
        setField(term17076, term17076.getClass(), "unit", enum64);
        setLongField(term17076, term17076.getClass(), "value", 1672578078364590450L);
        setLongField(term17078, term17078.getClass(), "seconds", 1490974290L);
        setIntField(term17078, term17078.getClass(), "nanos", 70000000);
        setField(term17076, term17076.getClass(), "instant", term17078);
        setField(term17076, term17076.getClass(), "valueAsString", "sEccwbJKYE");
        setField(term16982, term16982.getClass(), "atime", term17076);
        setField(term17093, term17093.getClass(), "unit", enum64);
        setLongField(term17093, term17093.getClass(), "value", 4949335493504695457L);
        setLongField(term17095, term17095.getClass(), "seconds", 1285679498L);
        setIntField(term17095, term17095.getClass(), "nanos", 273000000);
        setField(term17093, term17093.getClass(), "instant", term17095);
        setField(term17093, term17093.getClass(), "valueAsString", "AWRooQKkdW");
        setField(term16982, term16982.getClass(), "ctime", term17093);
        setLongField(term16982, term16982.getClass(), "crc", -1L);
        setLongField(term16982, term16982.getClass(), "csize", -1L);
        setIntField(term16982, term16982.getClass(), "flag", 98922530);
        setByteElement(term17115, 0, (byte) -79);
        setByteElement(term17115, 1, (byte) 44);
        setByteElement(term17115, 2, (byte) -66);
        setByteElement(term17115, 3, (byte) 122);
        setByteElement(term17115, 4, (byte) -30);
        setField(term16982, term16982.getClass(), "extra", term17115);
        setField(term16982, term16982.getClass(), "comment", "vjxIhXHxGR");
        term17134 = (byte[]) newByteArray(3);
        setByteElement(term17134, 0, (byte) 102);
        setByteElement(term17134, 1, (byte) 59);
        setByteElement(term17134, 2, (byte) -79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term17134;
        callMethod(klass, "setCentralDirectoryExtra", argTypes, term16982, args);
    }

};


