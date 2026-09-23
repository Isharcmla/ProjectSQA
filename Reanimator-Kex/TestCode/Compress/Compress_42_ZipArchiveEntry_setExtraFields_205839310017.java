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

public class ZipArchiveEntry_setExtraFields_205839310017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10041;
     Object term10182;

    public ZipArchiveEntry_setExtraFields_205839310017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10196 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10195 = ((Class) term10196).getDeclaredField((String) "DAYS");
        ((Field) term10195).setAccessible(true);
        Object enum38 = ((Field) term10195).get((Object) null);
        Class<? extends Object> term10380 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10379 = ((Class) term10380).getDeclaredField((String) "HOURS");
        ((Field) term10379).setAccessible(true);
        Object enum39 = ((Field) term10379).get((Object) null);
        term10041 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term10050 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term10051 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term10052 = (byte[]) newByteArray(6);
        byte[] term10059 = (byte[]) newByteArray(5);
        byte[] term10067 = (byte[]) newByteArray(1);
        Object term10069 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term10079 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10097 = newInstance(Class.forName("java.time.Instant"));
        Object term10112 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10114 = newInstance(Class.forName("java.time.Instant"));
        Object term10129 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10148 = newInstance(Class.forName("java.time.Instant"));
        byte[] term10168 = (byte[]) newByteArray(0);
        setIntField(term10041, term10041.getClass(), "method", -1);
        setLongField(term10041, term10041.getClass(), "size", -1L);
        setIntField(term10041, term10041.getClass(), "internalAttributes", -1801760683);
        setIntField(term10041, term10041.getClass(), "versionRequired", 1141317871);
        setIntField(term10041, term10041.getClass(), "versionMadeBy", 890669485);
        setIntField(term10041, term10041.getClass(), "platform", 691577392);
        setIntField(term10041, term10041.getClass(), "rawFlag", -893623680);
        setLongField(term10041, term10041.getClass(), "externalAttributes", -7738503207562305297L);
        setField(term10041, term10041.getClass(), "extraFields", term10050);
        setByteElement(term10052, 0, (byte) -52);
        setByteElement(term10052, 1, (byte) 53);
        setByteElement(term10052, 2, (byte) 44);
        setByteElement(term10052, 3, (byte) 49);
        setByteElement(term10052, 4, (byte) 114);
        setByteElement(term10052, 5, (byte) -81);
        setField(term10051, term10051.getClass(), "localFileData", term10052);
        setByteElement(term10059, 0, (byte) 127);
        setByteElement(term10059, 1, (byte) -24);
        setByteElement(term10059, 2, (byte) -89);
        setByteElement(term10059, 3, (byte) -35);
        setByteElement(term10059, 4, (byte) -59);
        setField(term10051, term10051.getClass(), "centralDirectoryData", term10059);
        setField(term10041, term10041.getClass(), "unparseableExtra", term10051);
        setField(term10041, term10041.getClass(), "name", "");
        setByteElement(term10067, 0, (byte) 73);
        setField(term10041, term10041.getClass(), "rawName", term10067);
        setBooleanField(term10069, term10069.getClass(), "languageEncodingFlag", false);
        setBooleanField(term10069, term10069.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term10069, term10069.getClass(), "encryptionFlag", false);
        setBooleanField(term10069, term10069.getClass(), "strongEncryptionFlag", false);
        setIntField(term10069, term10069.getClass(), "slidingDictionarySize", 0);
        setIntField(term10069, term10069.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term10041, term10041.getClass(), "gpb", term10069);
        setLongField(term10041, term10041.getClass(), "xdostime", -1L);
        setField(term10079, term10079.getClass(), "unit", enum38);
        setLongField(term10079, term10079.getClass(), "value", 3825396310311739952L);
        setLongField(term10097, term10097.getClass(), "seconds", 1678195615L);
        setIntField(term10097, term10097.getClass(), "nanos", 298000000);
        setField(term10079, term10079.getClass(), "instant", term10097);
        setField(term10079, term10079.getClass(), "valueAsString", "ieCtQFdkii");
        setField(term10041, term10041.getClass(), "mtime", term10079);
        setField(term10112, term10112.getClass(), "unit", enum38);
        setLongField(term10112, term10112.getClass(), "value", -3838084482494604218L);
        setLongField(term10114, term10114.getClass(), "seconds", 1666094287L);
        setIntField(term10114, term10114.getClass(), "nanos", 186000000);
        setField(term10112, term10112.getClass(), "instant", term10114);
        setField(term10112, term10112.getClass(), "valueAsString", "dEnhdmILtU");
        setField(term10041, term10041.getClass(), "atime", term10112);
        setField(term10129, term10129.getClass(), "unit", enum39);
        setLongField(term10129, term10129.getClass(), "value", 3892018155439224435L);
        setLongField(term10148, term10148.getClass(), "seconds", 1426036874L);
        setIntField(term10148, term10148.getClass(), "nanos", 434000000);
        setField(term10129, term10129.getClass(), "instant", term10148);
        setField(term10129, term10129.getClass(), "valueAsString", "hoicvmsovO");
        setField(term10041, term10041.getClass(), "ctime", term10129);
        setLongField(term10041, term10041.getClass(), "crc", -1L);
        setLongField(term10041, term10041.getClass(), "csize", -1L);
        setIntField(term10041, term10041.getClass(), "flag", -1963434938);
        setField(term10041, term10041.getClass(), "extra", term10168);
        setField(term10041, term10041.getClass(), "comment", "eqJfYWRaEL");
        term10182 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10182;
        callMethod(klass, "setExtraFields", argTypes, term10041, args);
    }

};


