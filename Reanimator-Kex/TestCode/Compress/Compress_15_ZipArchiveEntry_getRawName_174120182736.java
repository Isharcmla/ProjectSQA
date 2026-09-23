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

public class ZipArchiveEntry_getRawName_174120182736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22949;

    public ZipArchiveEntry_getRawName_174120182736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term22955 = new LinkedHashMap();
        Class<? extends Object> term23140 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23139 = ((Class) term23140).getDeclaredField((String) "SECONDS");
        ((Field) term23139).setAccessible(true);
        Object enum86 = ((Field) term23139).get((Object) null);
        Class<? extends Object> term23323 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23322 = ((Class) term23323).getDeclaredField((String) "MILLISECONDS");
        ((Field) term23322).setAccessible(true);
        Object enum87 = ((Field) term23322).get((Object) null);
        Class<? extends Object> term23521 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term23520 = ((Class) term23521).getDeclaredField((String) "MINUTES");
        ((Field) term23520).setAccessible(true);
        Object enum88 = ((Field) term23520).get((Object) null);
        term22949 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term22966 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term22967 = (byte[]) newByteArray(1);
        byte[] term22969 = (byte[]) newByteArray(9);
        byte[] term22981 = (byte[]) newByteArray(2);
        Object term22984 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term22992 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23013 = newInstance(Class.forName("java.time.Instant"));
        Object term23028 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23054 = newInstance(Class.forName("java.time.Instant"));
        Object term23069 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term23090 = newInstance(Class.forName("java.time.Instant"));
        byte[] term23110 = (byte[]) newByteArray(3);
        setIntField(term22949, term22949.getClass(), "method", -1);
        setLongField(term22949, term22949.getClass(), "size", -1L);
        setIntField(term22949, term22949.getClass(), "internalAttributes", -426764678);
        setIntField(term22949, term22949.getClass(), "platform", -1222614956);
        setLongField(term22949, term22949.getClass(), "externalAttributes", 6843866297465638866L);
        setField(term22949, term22949.getClass(), "extraFields", term22955);
        setByteElement(term22967, 0, (byte) 83);
        setField(term22966, term22966.getClass(), "localFileData", term22967);
        setByteElement(term22969, 0, (byte) -2);
        setByteElement(term22969, 1, (byte) 101);
        setByteElement(term22969, 2, (byte) 14);
        setByteElement(term22969, 3, (byte) 106);
        setByteElement(term22969, 4, (byte) -24);
        setByteElement(term22969, 6, (byte) -88);
        setByteElement(term22969, 7, (byte) 87);
        setByteElement(term22969, 8, (byte) -51);
        setField(term22966, term22966.getClass(), "centralDirectoryData", term22969);
        setField(term22949, term22949.getClass(), "unparseableExtra", term22966);
        setField(term22949, term22949.getClass(), "name", "");
        setByteElement(term22981, 0, (byte) -55);
        setByteElement(term22981, 1, (byte) 67);
        setField(term22949, term22949.getClass(), "rawName", term22981);
        setBooleanField(term22984, term22984.getClass(), "languageEncodingFlag", false);
        setBooleanField(term22984, term22984.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term22984, term22984.getClass(), "encryptionFlag", false);
        setBooleanField(term22984, term22984.getClass(), "strongEncryptionFlag", false);
        setField(term22949, term22949.getClass(), "gpb", term22984);
        setLongField(term22949, term22949.getClass(), "xdostime", -1L);
        setField(term22992, term22992.getClass(), "unit", enum86);
        setLongField(term22992, term22992.getClass(), "value", -4023935540989049732L);
        setLongField(term23013, term23013.getClass(), "seconds", 1431673415L);
        setIntField(term23013, term23013.getClass(), "nanos", 283000000);
        setField(term22992, term22992.getClass(), "instant", term23013);
        setField(term22992, term22992.getClass(), "valueAsString", "PznxWXsZME");
        setField(term22949, term22949.getClass(), "mtime", term22992);
        setField(term23028, term23028.getClass(), "unit", enum87);
        setLongField(term23028, term23028.getClass(), "value", 855932984568615096L);
        setLongField(term23054, term23054.getClass(), "seconds", 1714993302L);
        setIntField(term23054, term23054.getClass(), "nanos", 670000000);
        setField(term23028, term23028.getClass(), "instant", term23054);
        setField(term23028, term23028.getClass(), "valueAsString", "ZzIujlwVsw");
        setField(term22949, term22949.getClass(), "atime", term23028);
        setField(term23069, term23069.getClass(), "unit", enum88);
        setLongField(term23069, term23069.getClass(), "value", -1616722610139554082L);
        setLongField(term23090, term23090.getClass(), "seconds", 1830771077L);
        setIntField(term23090, term23090.getClass(), "nanos", 357000000);
        setField(term23069, term23069.getClass(), "instant", term23090);
        setField(term23069, term23069.getClass(), "valueAsString", "LWyEaeIyAo");
        setField(term22949, term22949.getClass(), "ctime", term23069);
        setLongField(term22949, term22949.getClass(), "crc", -1L);
        setLongField(term22949, term22949.getClass(), "csize", -1L);
        setIntField(term22949, term22949.getClass(), "flag", -1310015129);
        setByteElement(term23110, 0, (byte) 8);
        setByteElement(term23110, 1, (byte) -11);
        setByteElement(term23110, 2, (byte) 104);
        setField(term22949, term22949.getClass(), "extra", term23110);
        setField(term22949, term22949.getClass(), "comment", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawName", argTypes, term22949, args);
    }

};


