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

public class ZipArchiveEntry_getMergedFields_108722446025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15544;

    public ZipArchiveEntry_getMergedFields_108722446025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15706 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15705 = ((Class) term15706).getDeclaredField((String) "DAYS");
        ((Field) term15705).setAccessible(true);
        Object enum59 = ((Field) term15705).get((Object) null);
        Class<? extends Object> term15880 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15879 = ((Class) term15880).getDeclaredField((String) "MINUTES");
        ((Field) term15879).setAccessible(true);
        Object enum60 = ((Field) term15879).get((Object) null);
        term15544 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term15553 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 2);
        Object term15554 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term15555 = (byte[]) newByteArray(2);
        byte[] term15558 = (byte[]) newByteArray(5);
        byte[] term15566 = (byte[]) newByteArray(4);
        Object term15571 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term15581 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15599 = newInstance(Class.forName("java.time.Instant"));
        Object term15614 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15635 = newInstance(Class.forName("java.time.Instant"));
        Object term15650 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15652 = newInstance(Class.forName("java.time.Instant"));
        byte[] term15672 = (byte[]) newByteArray(8);
        setIntField(term15544, term15544.getClass(), "method", -1);
        setLongField(term15544, term15544.getClass(), "size", -1L);
        setIntField(term15544, term15544.getClass(), "internalAttributes", -1731761810);
        setIntField(term15544, term15544.getClass(), "versionRequired", 197109649);
        setIntField(term15544, term15544.getClass(), "versionMadeBy", -1239406390);
        setIntField(term15544, term15544.getClass(), "platform", 1557431527);
        setIntField(term15544, term15544.getClass(), "rawFlag", -1504890659);
        setLongField(term15544, term15544.getClass(), "externalAttributes", -8876856890348836498L);
        setField(term15544, term15544.getClass(), "extraFields", term15553);
        setByteElement(term15555, 0, (byte) -29);
        setByteElement(term15555, 1, (byte) 121);
        setField(term15554, term15554.getClass(), "localFileData", term15555);
        setByteElement(term15558, 0, (byte) -17);
        setByteElement(term15558, 1, (byte) -123);
        setByteElement(term15558, 2, (byte) -76);
        setByteElement(term15558, 3, (byte) -46);
        setByteElement(term15558, 4, (byte) -82);
        setField(term15554, term15554.getClass(), "centralDirectoryData", term15558);
        setField(term15544, term15544.getClass(), "unparseableExtra", term15554);
        setField(term15544, term15544.getClass(), "name", "");
        setByteElement(term15566, 0, (byte) -105);
        setByteElement(term15566, 1, (byte) 35);
        setByteElement(term15566, 2, (byte) -80);
        setByteElement(term15566, 3, (byte) 96);
        setField(term15544, term15544.getClass(), "rawName", term15566);
        setBooleanField(term15571, term15571.getClass(), "languageEncodingFlag", false);
        setBooleanField(term15571, term15571.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term15571, term15571.getClass(), "encryptionFlag", false);
        setBooleanField(term15571, term15571.getClass(), "strongEncryptionFlag", false);
        setIntField(term15571, term15571.getClass(), "slidingDictionarySize", 0);
        setIntField(term15571, term15571.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term15544, term15544.getClass(), "gpb", term15571);
        setLongField(term15544, term15544.getClass(), "xdostime", -1L);
        setField(term15581, term15581.getClass(), "unit", enum59);
        setLongField(term15581, term15581.getClass(), "value", 846579494941632714L);
        setLongField(term15599, term15599.getClass(), "seconds", 1276523397L);
        setIntField(term15599, term15599.getClass(), "nanos", 937000000);
        setField(term15581, term15581.getClass(), "instant", term15599);
        setField(term15581, term15581.getClass(), "valueAsString", "GVizqqzXpy");
        setField(term15544, term15544.getClass(), "mtime", term15581);
        setField(term15614, term15614.getClass(), "unit", enum60);
        setLongField(term15614, term15614.getClass(), "value", 6689117472719450333L);
        setLongField(term15635, term15635.getClass(), "seconds", 1278195575L);
        setIntField(term15635, term15635.getClass(), "nanos", 793000000);
        setField(term15614, term15614.getClass(), "instant", term15635);
        setField(term15614, term15614.getClass(), "valueAsString", "JqXGgAhZPl");
        setField(term15544, term15544.getClass(), "atime", term15614);
        setField(term15650, term15650.getClass(), "unit", enum60);
        setLongField(term15650, term15650.getClass(), "value", 5836128569274066678L);
        setLongField(term15652, term15652.getClass(), "seconds", 1272794321L);
        setIntField(term15652, term15652.getClass(), "nanos", 768000000);
        setField(term15650, term15650.getClass(), "instant", term15652);
        setField(term15650, term15650.getClass(), "valueAsString", "jiKYgYHqIS");
        setField(term15544, term15544.getClass(), "ctime", term15650);
        setLongField(term15544, term15544.getClass(), "crc", -1L);
        setLongField(term15544, term15544.getClass(), "csize", -1L);
        setIntField(term15544, term15544.getClass(), "flag", 1358829571);
        setByteElement(term15672, 0, (byte) -66);
        setByteElement(term15672, 1, (byte) 109);
        setByteElement(term15672, 2, (byte) -44);
        setByteElement(term15672, 3, (byte) 100);
        setByteElement(term15672, 4, (byte) -90);
        setByteElement(term15672, 5, (byte) -49);
        setByteElement(term15672, 6, (byte) -102);
        setByteElement(term15672, 7, (byte) -74);
        setField(term15544, term15544.getClass(), "extra", term15672);
        setField(term15544, term15544.getClass(), "comment", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMergedFields", argTypes, term15544, args);
    }

};


