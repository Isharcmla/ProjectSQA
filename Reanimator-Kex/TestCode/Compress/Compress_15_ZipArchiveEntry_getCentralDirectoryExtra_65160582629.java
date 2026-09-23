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

public class ZipArchiveEntry_getCentralDirectoryExtra_65160582629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18125;

    public ZipArchiveEntry_getCentralDirectoryExtra_65160582629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term18131 = new LinkedHashMap();
        Class<? extends Object> term18279 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18278 = ((Class) term18279).getDeclaredField((String) "SECONDS");
        ((Field) term18278).setAccessible(true);
        Object enum68 = ((Field) term18278).get((Object) null);
        Class<? extends Object> term18462 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term18461 = ((Class) term18462).getDeclaredField((String) "MICROSECONDS");
        ((Field) term18461).setAccessible(true);
        Object enum69 = ((Field) term18461).get((Object) null);
        term18125 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term18142 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term18143 = (byte[]) newByteArray(1);
        byte[] term18145 = (byte[]) newByteArray(0);
        byte[] term18148 = (byte[]) newByteArray(1);
        Object term18150 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term18158 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18179 = newInstance(Class.forName("java.time.Instant"));
        Object term18194 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18220 = newInstance(Class.forName("java.time.Instant"));
        Object term18235 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term18237 = newInstance(Class.forName("java.time.Instant"));
        byte[] term18257 = (byte[]) newByteArray(5);
        setIntField(term18125, term18125.getClass(), "method", -1);
        setLongField(term18125, term18125.getClass(), "size", -1L);
        setIntField(term18125, term18125.getClass(), "internalAttributes", 1283079251);
        setIntField(term18125, term18125.getClass(), "platform", -523949691);
        setLongField(term18125, term18125.getClass(), "externalAttributes", 1368340889161782793L);
        setField(term18125, term18125.getClass(), "extraFields", term18131);
        setByteElement(term18143, 0, (byte) 106);
        setField(term18142, term18142.getClass(), "localFileData", term18143);
        setField(term18142, term18142.getClass(), "centralDirectoryData", term18145);
        setField(term18125, term18125.getClass(), "unparseableExtra", term18142);
        setField(term18125, term18125.getClass(), "name", "");
        setByteElement(term18148, 0, (byte) 92);
        setField(term18125, term18125.getClass(), "rawName", term18148);
        setBooleanField(term18150, term18150.getClass(), "languageEncodingFlag", false);
        setBooleanField(term18150, term18150.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term18150, term18150.getClass(), "encryptionFlag", false);
        setBooleanField(term18150, term18150.getClass(), "strongEncryptionFlag", false);
        setField(term18125, term18125.getClass(), "gpb", term18150);
        setLongField(term18125, term18125.getClass(), "xdostime", -1L);
        setField(term18158, term18158.getClass(), "unit", enum68);
        setLongField(term18158, term18158.getClass(), "value", -5786861555969446503L);
        setLongField(term18179, term18179.getClass(), "seconds", 1531349402L);
        setIntField(term18179, term18179.getClass(), "nanos", 53000000);
        setField(term18158, term18158.getClass(), "instant", term18179);
        setField(term18158, term18158.getClass(), "valueAsString", "ZVecLZMLHF");
        setField(term18125, term18125.getClass(), "mtime", term18158);
        setField(term18194, term18194.getClass(), "unit", enum69);
        setLongField(term18194, term18194.getClass(), "value", 2354625302846375590L);
        setLongField(term18220, term18220.getClass(), "seconds", 1264055800L);
        setIntField(term18220, term18220.getClass(), "nanos", 343000000);
        setField(term18194, term18194.getClass(), "instant", term18220);
        setField(term18194, term18194.getClass(), "valueAsString", "fztQhjqwdP");
        setField(term18125, term18125.getClass(), "atime", term18194);
        setField(term18235, term18235.getClass(), "unit", enum68);
        setLongField(term18235, term18235.getClass(), "value", 7276637106827860087L);
        setLongField(term18237, term18237.getClass(), "seconds", 1450883259L);
        setIntField(term18237, term18237.getClass(), "nanos", 896000000);
        setField(term18235, term18235.getClass(), "instant", term18237);
        setField(term18235, term18235.getClass(), "valueAsString", "eVpkWxjuki");
        setField(term18125, term18125.getClass(), "ctime", term18235);
        setLongField(term18125, term18125.getClass(), "crc", -1L);
        setLongField(term18125, term18125.getClass(), "csize", -1L);
        setIntField(term18125, term18125.getClass(), "flag", 229204365);
        setByteElement(term18257, 0, (byte) -110);
        setByteElement(term18257, 1, (byte) -88);
        setByteElement(term18257, 2, (byte) 56);
        setByteElement(term18257, 3, (byte) -106);
        setByteElement(term18257, 4, (byte) 58);
        setField(term18125, term18125.getClass(), "extra", term18257);
        setField(term18125, term18125.getClass(), "comment", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCentralDirectoryExtra", argTypes, term18125, args);
    }

};


