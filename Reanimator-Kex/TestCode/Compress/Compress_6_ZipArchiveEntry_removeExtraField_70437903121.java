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

public class ZipArchiveEntry_removeExtraField_70437903121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12204;
     Object term12342;

    public ZipArchiveEntry_removeExtraField_70437903121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term12209 = new LinkedHashMap();
        Class<? extends Object> term12345 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12344 = ((Class) term12345).getDeclaredField((String) "SECONDS");
        ((Field) term12344).setAccessible(true);
        Object enum48 = ((Field) term12344).get((Object) null);
        Class<? extends Object> term12528 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12527 = ((Class) term12528).getDeclaredField((String) "HOURS");
        ((Field) term12527).setAccessible(true);
        Object enum49 = ((Field) term12527).get((Object) null);
        term12204 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term12230 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12251 = newInstance(Class.forName("java.time.Instant"));
        Object term12266 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12285 = newInstance(Class.forName("java.time.Instant"));
        Object term12300 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12302 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12322 = (byte[]) newByteArray(6);
        setIntField(term12204, term12204.getClass(), "method", -1);
        setIntField(term12204, term12204.getClass(), "internalAttributes", -344842608);
        setIntField(term12204, term12204.getClass(), "platform", 941650513);
        setLongField(term12204, term12204.getClass(), "externalAttributes", 41775768178052008L);
        setField(term12204, term12204.getClass(), "extraFields", term12209);
        setField(term12204, term12204.getClass(), "name", "");
        setLongField(term12204, term12204.getClass(), "xdostime", -1L);
        setField(term12230, term12230.getClass(), "unit", enum48);
        setLongField(term12230, term12230.getClass(), "value", 6682528376118987775L);
        setLongField(term12251, term12251.getClass(), "seconds", 1803013433L);
        setIntField(term12251, term12251.getClass(), "nanos", 545000000);
        setField(term12230, term12230.getClass(), "instant", term12251);
        setField(term12230, term12230.getClass(), "valueAsString", "jiKYgYHqIS");
        setField(term12204, term12204.getClass(), "mtime", term12230);
        setField(term12266, term12266.getClass(), "unit", enum49);
        setLongField(term12266, term12266.getClass(), "value", 682356318767179819L);
        setLongField(term12285, term12285.getClass(), "seconds", 1843232817L);
        setIntField(term12285, term12285.getClass(), "nanos", 357000000);
        setField(term12266, term12266.getClass(), "instant", term12285);
        setField(term12266, term12266.getClass(), "valueAsString", "DfISiziTgG");
        setField(term12204, term12204.getClass(), "atime", term12266);
        setField(term12300, term12300.getClass(), "unit", enum49);
        setLongField(term12300, term12300.getClass(), "value", -7291743527973326814L);
        setLongField(term12302, term12302.getClass(), "seconds", 1628713316L);
        setIntField(term12302, term12302.getClass(), "nanos", 832000000);
        setField(term12300, term12300.getClass(), "instant", term12302);
        setField(term12300, term12300.getClass(), "valueAsString", "XqgfKFvPSD");
        setField(term12204, term12204.getClass(), "ctime", term12300);
        setLongField(term12204, term12204.getClass(), "crc", -1L);
        setLongField(term12204, term12204.getClass(), "size", -1L);
        setLongField(term12204, term12204.getClass(), "csize", -1L);
        setIntField(term12204, term12204.getClass(), "flag", 444029505);
        setByteElement(term12322, 0, (byte) -63);
        setByteElement(term12322, 1, (byte) 15);
        setByteElement(term12322, 2, (byte) 45);
        setByteElement(term12322, 3, (byte) -39);
        setByteElement(term12322, 4, (byte) -20);
        setByteElement(term12322, 5, (byte) 10);
        setField(term12204, term12204.getClass(), "extra", term12322);
        setField(term12204, term12204.getClass(), "comment", "JiVRgTZvKc");
        term12342 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term12342, term12342.getClass(), "value", -1263114719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = term12342;
        callMethod(klass, "removeExtraField", argTypes, term12204, args);
    }

};


