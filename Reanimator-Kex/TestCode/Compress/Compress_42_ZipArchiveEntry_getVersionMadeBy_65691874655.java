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

public class ZipArchiveEntry_getVersionMadeBy_65691874655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35992;

    public ZipArchiveEntry_getVersionMadeBy_65691874655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36138 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term36137 = ((Class) term36138).getDeclaredField((String) "MICROSECONDS");
        ((Field) term36137).setAccessible(true);
        Object enum136 = ((Field) term36137).get((Object) null);
        term35992 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term36001 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 9);
        Object term36002 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term36003 = (byte[]) newByteArray(0);
        byte[] term36004 = (byte[]) newByteArray(4);
        byte[] term36011 = (byte[]) newByteArray(4);
        Object term36016 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term36026 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36052 = newInstance(Class.forName("java.time.Instant"));
        Object term36067 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36069 = newInstance(Class.forName("java.time.Instant"));
        Object term36084 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36086 = newInstance(Class.forName("java.time.Instant"));
        byte[] term36106 = (byte[]) newByteArray(9);
        setIntField(term35992, term35992.getClass(), "method", -1);
        setLongField(term35992, term35992.getClass(), "size", -1L);
        setIntField(term35992, term35992.getClass(), "internalAttributes", 1707220033);
        setIntField(term35992, term35992.getClass(), "versionRequired", -1792504217);
        setIntField(term35992, term35992.getClass(), "versionMadeBy", 1824538861);
        setIntField(term35992, term35992.getClass(), "platform", 499519708);
        setIntField(term35992, term35992.getClass(), "rawFlag", 1501165033);
        setLongField(term35992, term35992.getClass(), "externalAttributes", -8338004844694486146L);
        setField(term35992, term35992.getClass(), "extraFields", term36001);
        setField(term36002, term36002.getClass(), "localFileData", term36003);
        setByteElement(term36004, 0, (byte) -90);
        setByteElement(term36004, 1, (byte) -117);
        setByteElement(term36004, 2, (byte) 124);
        setByteElement(term36004, 3, (byte) -61);
        setField(term36002, term36002.getClass(), "centralDirectoryData", term36004);
        setField(term35992, term35992.getClass(), "unparseableExtra", term36002);
        setField(term35992, term35992.getClass(), "name", "");
        setByteElement(term36011, 0, (byte) 13);
        setByteElement(term36011, 1, (byte) 110);
        setByteElement(term36011, 2, (byte) 69);
        setByteElement(term36011, 3, (byte) 8);
        setField(term35992, term35992.getClass(), "rawName", term36011);
        setBooleanField(term36016, term36016.getClass(), "languageEncodingFlag", false);
        setBooleanField(term36016, term36016.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term36016, term36016.getClass(), "encryptionFlag", false);
        setBooleanField(term36016, term36016.getClass(), "strongEncryptionFlag", false);
        setIntField(term36016, term36016.getClass(), "slidingDictionarySize", 0);
        setIntField(term36016, term36016.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term35992, term35992.getClass(), "gpb", term36016);
        setLongField(term35992, term35992.getClass(), "xdostime", -1L);
        setField(term36026, term36026.getClass(), "unit", enum136);
        setLongField(term36026, term36026.getClass(), "value", 6426732259596412988L);
        setLongField(term36052, term36052.getClass(), "seconds", 1597535553L);
        setIntField(term36052, term36052.getClass(), "nanos", 85000000);
        setField(term36026, term36026.getClass(), "instant", term36052);
        setField(term36026, term36026.getClass(), "valueAsString", "tlQSNgTkQX");
        setField(term35992, term35992.getClass(), "mtime", term36026);
        setField(term36067, term36067.getClass(), "unit", enum136);
        setLongField(term36067, term36067.getClass(), "value", 185793058502220865L);
        setLongField(term36069, term36069.getClass(), "seconds", 1644439115L);
        setIntField(term36069, term36069.getClass(), "nanos", 303000000);
        setField(term36067, term36067.getClass(), "instant", term36069);
        setField(term36067, term36067.getClass(), "valueAsString", "PCipZnmBOF");
        setField(term35992, term35992.getClass(), "atime", term36067);
        setField(term36084, term36084.getClass(), "unit", enum136);
        setLongField(term36084, term36084.getClass(), "value", -7698746988132548371L);
        setLongField(term36086, term36086.getClass(), "seconds", 1840798783L);
        setIntField(term36086, term36086.getClass(), "nanos", 490000000);
        setField(term36084, term36084.getClass(), "instant", term36086);
        setField(term36084, term36084.getClass(), "valueAsString", "zcorEihhLK");
        setField(term35992, term35992.getClass(), "ctime", term36084);
        setLongField(term35992, term35992.getClass(), "crc", -1L);
        setLongField(term35992, term35992.getClass(), "csize", -1L);
        setIntField(term35992, term35992.getClass(), "flag", 510162332);
        setByteElement(term36106, 0, (byte) 96);
        setByteElement(term36106, 1, (byte) 2);
        setByteElement(term36106, 2, (byte) 83);
        setByteElement(term36106, 3, (byte) 126);
        setByteElement(term36106, 4, (byte) 123);
        setByteElement(term36106, 5, (byte) -113);
        setByteElement(term36106, 6, (byte) -116);
        setByteElement(term36106, 7, (byte) -76);
        setByteElement(term36106, 8, (byte) -32);
        setField(term35992, term35992.getClass(), "extra", term36106);
        setField(term35992, term35992.getClass(), "comment", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionMadeBy", argTypes, term35992, args);
    }

};


