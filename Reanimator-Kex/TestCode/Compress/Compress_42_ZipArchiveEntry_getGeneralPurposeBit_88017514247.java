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

public class ZipArchiveEntry_getGeneralPurposeBit_88017514247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30599;

    public ZipArchiveEntry_getGeneralPurposeBit_88017514247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30781 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term30780 = ((Class) term30781).getDeclaredField((String) "MINUTES");
        ((Field) term30780).setAccessible(true);
        Object enum116 = ((Field) term30780).get((Object) null);
        Class<? extends Object> term30964 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term30963 = ((Class) term30964).getDeclaredField((String) "DAYS");
        ((Field) term30963).setAccessible(true);
        Object enum117 = ((Field) term30963).get((Object) null);
        Class<? extends Object> term31138 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term31137 = ((Class) term31138).getDeclaredField((String) "MILLISECONDS");
        ((Field) term31137).setAccessible(true);
        Object enum118 = ((Field) term31137).get((Object) null);
        term30599 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term30608 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term30609 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term30610 = (byte[]) newByteArray(0);
        byte[] term30611 = (byte[]) newByteArray(7);
        byte[] term30621 = (byte[]) newByteArray(3);
        Object term30625 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term30635 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30656 = newInstance(Class.forName("java.time.Instant"));
        Object term30671 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30689 = newInstance(Class.forName("java.time.Instant"));
        Object term30704 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30730 = newInstance(Class.forName("java.time.Instant"));
        byte[] term30750 = (byte[]) newByteArray(6);
        setIntField(term30599, term30599.getClass(), "method", -1);
        setLongField(term30599, term30599.getClass(), "size", -1L);
        setIntField(term30599, term30599.getClass(), "internalAttributes", 1209799204);
        setIntField(term30599, term30599.getClass(), "versionRequired", 1094107751);
        setIntField(term30599, term30599.getClass(), "versionMadeBy", 844222656);
        setIntField(term30599, term30599.getClass(), "platform", -18216811);
        setIntField(term30599, term30599.getClass(), "rawFlag", -1813280137);
        setLongField(term30599, term30599.getClass(), "externalAttributes", 5465527210299101732L);
        setField(term30599, term30599.getClass(), "extraFields", term30608);
        setField(term30609, term30609.getClass(), "localFileData", term30610);
        setByteElement(term30611, 0, (byte) 120);
        setByteElement(term30611, 1, (byte) -22);
        setByteElement(term30611, 2, (byte) 73);
        setByteElement(term30611, 3, (byte) -37);
        setByteElement(term30611, 4, (byte) 97);
        setByteElement(term30611, 5, (byte) 23);
        setByteElement(term30611, 6, (byte) -97);
        setField(term30609, term30609.getClass(), "centralDirectoryData", term30611);
        setField(term30599, term30599.getClass(), "unparseableExtra", term30609);
        setField(term30599, term30599.getClass(), "name", "");
        setByteElement(term30621, 0, (byte) -58);
        setByteElement(term30621, 1, (byte) 71);
        setByteElement(term30621, 2, (byte) -71);
        setField(term30599, term30599.getClass(), "rawName", term30621);
        setBooleanField(term30625, term30625.getClass(), "languageEncodingFlag", false);
        setBooleanField(term30625, term30625.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term30625, term30625.getClass(), "encryptionFlag", false);
        setBooleanField(term30625, term30625.getClass(), "strongEncryptionFlag", false);
        setIntField(term30625, term30625.getClass(), "slidingDictionarySize", 0);
        setIntField(term30625, term30625.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term30599, term30599.getClass(), "gpb", term30625);
        setLongField(term30599, term30599.getClass(), "xdostime", -1L);
        setField(term30635, term30635.getClass(), "unit", enum116);
        setLongField(term30635, term30635.getClass(), "value", 4699157009689333952L);
        setLongField(term30656, term30656.getClass(), "seconds", 1518569771L);
        setIntField(term30656, term30656.getClass(), "nanos", 568000000);
        setField(term30635, term30635.getClass(), "instant", term30656);
        setField(term30635, term30635.getClass(), "valueAsString", "kVEZMHmRtR");
        setField(term30599, term30599.getClass(), "mtime", term30635);
        setField(term30671, term30671.getClass(), "unit", enum117);
        setLongField(term30671, term30671.getClass(), "value", -78240609295693193L);
        setLongField(term30689, term30689.getClass(), "seconds", 1496494439L);
        setIntField(term30689, term30689.getClass(), "nanos", 25000000);
        setField(term30671, term30671.getClass(), "instant", term30689);
        setField(term30671, term30671.getClass(), "valueAsString", "ekxGuOYIwi");
        setField(term30599, term30599.getClass(), "atime", term30671);
        setField(term30704, term30704.getClass(), "unit", enum118);
        setLongField(term30704, term30704.getClass(), "value", 3090901538358721367L);
        setLongField(term30730, term30730.getClass(), "seconds", 1755806577L);
        setIntField(term30730, term30730.getClass(), "nanos", 674000000);
        setField(term30704, term30704.getClass(), "instant", term30730);
        setField(term30704, term30704.getClass(), "valueAsString", "RbVQXSpxXy");
        setField(term30599, term30599.getClass(), "ctime", term30704);
        setLongField(term30599, term30599.getClass(), "crc", -1L);
        setLongField(term30599, term30599.getClass(), "csize", -1L);
        setIntField(term30599, term30599.getClass(), "flag", 719656595);
        setByteElement(term30750, 0, (byte) -6);
        setByteElement(term30750, 1, (byte) -121);
        setByteElement(term30750, 2, (byte) 127);
        setByteElement(term30750, 3, (byte) 97);
        setByteElement(term30750, 4, (byte) -21);
        setByteElement(term30750, 5, (byte) 117);
        setField(term30599, term30599.getClass(), "extra", term30750);
        setField(term30599, term30599.getClass(), "comment", "YpJbIgJWWv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneralPurposeBit", argTypes, term30599, args);
    }

};


