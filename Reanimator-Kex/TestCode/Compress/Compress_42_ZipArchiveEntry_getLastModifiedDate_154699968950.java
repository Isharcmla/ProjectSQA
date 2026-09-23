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

public class ZipArchiveEntry_getLastModifiedDate_154699968950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32925;

    public ZipArchiveEntry_getLastModifiedDate_154699968950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33078 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term33077 = ((Class) term33078).getDeclaredField((String) "MILLISECONDS");
        ((Field) term33077).setAccessible(true);
        Object enum125 = ((Field) term33077).get((Object) null);
        Class<? extends Object> term33276 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term33275 = ((Class) term33276).getDeclaredField((String) "DAYS");
        ((Field) term33275).setAccessible(true);
        Object enum126 = ((Field) term33275).get((Object) null);
        term32925 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term32934 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 2);
        Object term32935 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term32936 = (byte[]) newByteArray(0);
        byte[] term32937 = (byte[]) newByteArray(0);
        byte[] term32940 = (byte[]) newByteArray(5);
        Object term32946 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term32956 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32982 = newInstance(Class.forName("java.time.Instant"));
        Object term32997 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33015 = newInstance(Class.forName("java.time.Instant"));
        Object term33030 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33032 = newInstance(Class.forName("java.time.Instant"));
        byte[] term33052 = (byte[]) newByteArray(6);
        setIntField(term32925, term32925.getClass(), "method", -1);
        setLongField(term32925, term32925.getClass(), "size", -1L);
        setIntField(term32925, term32925.getClass(), "internalAttributes", -1148142995);
        setIntField(term32925, term32925.getClass(), "versionRequired", -233024044);
        setIntField(term32925, term32925.getClass(), "versionMadeBy", 1820784228);
        setIntField(term32925, term32925.getClass(), "platform", 1390820006);
        setIntField(term32925, term32925.getClass(), "rawFlag", -828982065);
        setLongField(term32925, term32925.getClass(), "externalAttributes", -433040798405298080L);
        setField(term32925, term32925.getClass(), "extraFields", term32934);
        setField(term32935, term32935.getClass(), "localFileData", term32936);
        setField(term32935, term32935.getClass(), "centralDirectoryData", term32937);
        setField(term32925, term32925.getClass(), "unparseableExtra", term32935);
        setField(term32925, term32925.getClass(), "name", "");
        setByteElement(term32940, 0, (byte) -77);
        setByteElement(term32940, 1, (byte) -121);
        setByteElement(term32940, 2, (byte) -40);
        setByteElement(term32940, 3, (byte) -82);
        setByteElement(term32940, 4, (byte) 88);
        setField(term32925, term32925.getClass(), "rawName", term32940);
        setBooleanField(term32946, term32946.getClass(), "languageEncodingFlag", false);
        setBooleanField(term32946, term32946.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term32946, term32946.getClass(), "encryptionFlag", false);
        setBooleanField(term32946, term32946.getClass(), "strongEncryptionFlag", false);
        setIntField(term32946, term32946.getClass(), "slidingDictionarySize", 0);
        setIntField(term32946, term32946.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term32925, term32925.getClass(), "gpb", term32946);
        setLongField(term32925, term32925.getClass(), "xdostime", -1L);
        setField(term32956, term32956.getClass(), "unit", enum125);
        setLongField(term32956, term32956.getClass(), "value", -1505191021111100819L);
        setLongField(term32982, term32982.getClass(), "seconds", 1537239086L);
        setIntField(term32982, term32982.getClass(), "nanos", 922000000);
        setField(term32956, term32956.getClass(), "instant", term32982);
        setField(term32956, term32956.getClass(), "valueAsString", "DhjNLmRMCu");
        setField(term32925, term32925.getClass(), "mtime", term32956);
        setField(term32997, term32997.getClass(), "unit", enum126);
        setLongField(term32997, term32997.getClass(), "value", -1000830646340880796L);
        setLongField(term33015, term33015.getClass(), "seconds", 1793422489L);
        setIntField(term33015, term33015.getClass(), "nanos", 395000000);
        setField(term32997, term32997.getClass(), "instant", term33015);
        setField(term32997, term32997.getClass(), "valueAsString", "PgPzMSEjjX");
        setField(term32925, term32925.getClass(), "atime", term32997);
        setField(term33030, term33030.getClass(), "unit", enum125);
        setLongField(term33030, term33030.getClass(), "value", 5973526439563541711L);
        setLongField(term33032, term33032.getClass(), "seconds", 1758375140L);
        setIntField(term33032, term33032.getClass(), "nanos", 66000000);
        setField(term33030, term33030.getClass(), "instant", term33032);
        setField(term33030, term33030.getClass(), "valueAsString", "wzsPSPcRdj");
        setField(term32925, term32925.getClass(), "ctime", term33030);
        setLongField(term32925, term32925.getClass(), "crc", -1L);
        setLongField(term32925, term32925.getClass(), "csize", -1L);
        setIntField(term32925, term32925.getClass(), "flag", 1221443226);
        setByteElement(term33052, 0, (byte) -37);
        setByteElement(term33052, 1, (byte) 63);
        setByteElement(term33052, 2, (byte) 61);
        setByteElement(term33052, 3, (byte) 108);
        setByteElement(term33052, 4, (byte) 47);
        setByteElement(term33052, 5, (byte) 117);
        setField(term32925, term32925.getClass(), "extra", term33052);
        setField(term32925, term32925.getClass(), "comment", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term32925, args);
    }

};


