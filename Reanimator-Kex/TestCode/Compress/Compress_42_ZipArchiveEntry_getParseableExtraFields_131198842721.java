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

public class ZipArchiveEntry_getParseableExtraFields_131198842721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12658;

    public ZipArchiveEntry_getParseableExtraFields_131198842721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12833 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12832 = ((Class) term12833).getDeclaredField((String) "SECONDS");
        ((Field) term12832).setAccessible(true);
        Object enum48 = ((Field) term12832).get((Object) null);
        Class<? extends Object> term13016 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13015 = ((Class) term13016).getDeclaredField((String) "HOURS");
        ((Field) term13015).setAccessible(true);
        Object enum49 = ((Field) term13015).get((Object) null);
        term12658 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term12667 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 9);
        Object term12668 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term12669 = (byte[]) newByteArray(6);
        byte[] term12676 = (byte[]) newByteArray(8);
        byte[] term12687 = (byte[]) newByteArray(6);
        Object term12694 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term12704 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12725 = newInstance(Class.forName("java.time.Instant"));
        Object term12740 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12759 = newInstance(Class.forName("java.time.Instant"));
        Object term12774 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term12776 = newInstance(Class.forName("java.time.Instant"));
        byte[] term12796 = (byte[]) newByteArray(2);
        setIntField(term12658, term12658.getClass(), "method", -1);
        setLongField(term12658, term12658.getClass(), "size", -1L);
        setIntField(term12658, term12658.getClass(), "internalAttributes", 9726679);
        setIntField(term12658, term12658.getClass(), "versionRequired", -25637976);
        setIntField(term12658, term12658.getClass(), "versionMadeBy", 1555897383);
        setIntField(term12658, term12658.getClass(), "platform", 202001407);
        setIntField(term12658, term12658.getClass(), "rawFlag", 158873461);
        setLongField(term12658, term12658.getClass(), "externalAttributes", 41775768178052008L);
        setField(term12658, term12658.getClass(), "extraFields", term12667);
        setByteElement(term12669, 0, (byte) 20);
        setByteElement(term12669, 1, (byte) -114);
        setByteElement(term12669, 2, (byte) 93);
        setByteElement(term12669, 3, (byte) -60);
        setByteElement(term12669, 4, (byte) -4);
        setByteElement(term12669, 5, (byte) 28);
        setField(term12668, term12668.getClass(), "localFileData", term12669);
        setByteElement(term12676, 0, (byte) 94);
        setByteElement(term12676, 2, (byte) -96);
        setByteElement(term12676, 3, (byte) -88);
        setByteElement(term12676, 4, (byte) -73);
        setByteElement(term12676, 5, (byte) 105);
        setByteElement(term12676, 6, (byte) -86);
        setByteElement(term12676, 7, (byte) 84);
        setField(term12668, term12668.getClass(), "centralDirectoryData", term12676);
        setField(term12658, term12658.getClass(), "unparseableExtra", term12668);
        setField(term12658, term12658.getClass(), "name", "");
        setByteElement(term12687, 0, (byte) -70);
        setByteElement(term12687, 1, (byte) 84);
        setByteElement(term12687, 2, (byte) 114);
        setByteElement(term12687, 3, (byte) 60);
        setByteElement(term12687, 4, (byte) -20);
        setByteElement(term12687, 5, (byte) 100);
        setField(term12658, term12658.getClass(), "rawName", term12687);
        setBooleanField(term12694, term12694.getClass(), "languageEncodingFlag", false);
        setBooleanField(term12694, term12694.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term12694, term12694.getClass(), "encryptionFlag", false);
        setBooleanField(term12694, term12694.getClass(), "strongEncryptionFlag", false);
        setIntField(term12694, term12694.getClass(), "slidingDictionarySize", 0);
        setIntField(term12694, term12694.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term12658, term12658.getClass(), "gpb", term12694);
        setLongField(term12658, term12658.getClass(), "xdostime", -1L);
        setField(term12704, term12704.getClass(), "unit", enum48);
        setLongField(term12704, term12704.getClass(), "value", 6682528376118987775L);
        setLongField(term12725, term12725.getClass(), "seconds", 1803013433L);
        setIntField(term12725, term12725.getClass(), "nanos", 545000000);
        setField(term12704, term12704.getClass(), "instant", term12725);
        setField(term12704, term12704.getClass(), "valueAsString", "oVgzLbrsFr");
        setField(term12658, term12658.getClass(), "mtime", term12704);
        setField(term12740, term12740.getClass(), "unit", enum49);
        setLongField(term12740, term12740.getClass(), "value", 682356318767179819L);
        setLongField(term12759, term12759.getClass(), "seconds", 1843232817L);
        setIntField(term12759, term12759.getClass(), "nanos", 357000000);
        setField(term12740, term12740.getClass(), "instant", term12759);
        setField(term12740, term12740.getClass(), "valueAsString", "vQVyKLdtaz");
        setField(term12658, term12658.getClass(), "atime", term12740);
        setField(term12774, term12774.getClass(), "unit", enum49);
        setLongField(term12774, term12774.getClass(), "value", -7291743527973326814L);
        setLongField(term12776, term12776.getClass(), "seconds", 1628713316L);
        setIntField(term12776, term12776.getClass(), "nanos", 832000000);
        setField(term12774, term12774.getClass(), "instant", term12776);
        setField(term12774, term12774.getClass(), "valueAsString", "OWKQODBLzb");
        setField(term12658, term12658.getClass(), "ctime", term12774);
        setLongField(term12658, term12658.getClass(), "crc", -1L);
        setLongField(term12658, term12658.getClass(), "csize", -1L);
        setIntField(term12658, term12658.getClass(), "flag", -430151637);
        setByteElement(term12796, 0, (byte) -41);
        setByteElement(term12796, 1, (byte) -70);
        setField(term12658, term12658.getClass(), "extra", term12796);
        setField(term12658, term12658.getClass(), "comment", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParseableExtraFields", argTypes, term12658, args);
    }

};


