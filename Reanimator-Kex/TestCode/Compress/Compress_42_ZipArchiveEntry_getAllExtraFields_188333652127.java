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

public class ZipArchiveEntry_getAllExtraFields_188333652127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16834;

    public ZipArchiveEntry_getAllExtraFields_188333652127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16987 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16986 = ((Class) term16987).getDeclaredField((String) "MILLISECONDS");
        ((Field) term16986).setAccessible(true);
        Object enum64 = ((Field) term16986).get((Object) null);
        term16834 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term16843 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 6);
        Object term16844 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term16845 = (byte[]) newByteArray(3);
        byte[] term16849 = (byte[]) newByteArray(4);
        byte[] term16856 = (byte[]) newByteArray(5);
        Object term16862 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term16872 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16898 = newInstance(Class.forName("java.time.Instant"));
        Object term16913 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16915 = newInstance(Class.forName("java.time.Instant"));
        Object term16930 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16932 = newInstance(Class.forName("java.time.Instant"));
        byte[] term16952 = (byte[]) newByteArray(8);
        setIntField(term16834, term16834.getClass(), "method", -1);
        setLongField(term16834, term16834.getClass(), "size", -1L);
        setIntField(term16834, term16834.getClass(), "internalAttributes", -1899301124);
        setIntField(term16834, term16834.getClass(), "versionRequired", -1882480155);
        setIntField(term16834, term16834.getClass(), "versionMadeBy", -1410220680);
        setIntField(term16834, term16834.getClass(), "platform", 389427431);
        setIntField(term16834, term16834.getClass(), "rawFlag", -1945706126);
        setLongField(term16834, term16834.getClass(), "externalAttributes", 2135754395358000892L);
        setField(term16834, term16834.getClass(), "extraFields", term16843);
        setByteElement(term16845, 0, (byte) -83);
        setByteElement(term16845, 1, (byte) 56);
        setByteElement(term16845, 2, (byte) 81);
        setField(term16844, term16844.getClass(), "localFileData", term16845);
        setByteElement(term16849, 0, (byte) -27);
        setByteElement(term16849, 1, (byte) -47);
        setByteElement(term16849, 2, (byte) 122);
        setByteElement(term16849, 3, (byte) -67);
        setField(term16844, term16844.getClass(), "centralDirectoryData", term16849);
        setField(term16834, term16834.getClass(), "unparseableExtra", term16844);
        setField(term16834, term16834.getClass(), "name", "");
        setByteElement(term16856, 0, (byte) -23);
        setByteElement(term16856, 1, (byte) 25);
        setByteElement(term16856, 2, (byte) 98);
        setByteElement(term16856, 3, (byte) -92);
        setByteElement(term16856, 4, (byte) -43);
        setField(term16834, term16834.getClass(), "rawName", term16856);
        setBooleanField(term16862, term16862.getClass(), "languageEncodingFlag", false);
        setBooleanField(term16862, term16862.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term16862, term16862.getClass(), "encryptionFlag", false);
        setBooleanField(term16862, term16862.getClass(), "strongEncryptionFlag", false);
        setIntField(term16862, term16862.getClass(), "slidingDictionarySize", 0);
        setIntField(term16862, term16862.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term16834, term16834.getClass(), "gpb", term16862);
        setLongField(term16834, term16834.getClass(), "xdostime", -1L);
        setField(term16872, term16872.getClass(), "unit", enum64);
        setLongField(term16872, term16872.getClass(), "value", -8085190702504231560L);
        setLongField(term16898, term16898.getClass(), "seconds", 1263762156L);
        setIntField(term16898, term16898.getClass(), "nanos", 294000000);
        setField(term16872, term16872.getClass(), "instant", term16898);
        setField(term16872, term16872.getClass(), "valueAsString", "SPpkrGcPRr");
        setField(term16834, term16834.getClass(), "mtime", term16872);
        setField(term16913, term16913.getClass(), "unit", enum64);
        setLongField(term16913, term16913.getClass(), "value", 1672578078364590450L);
        setLongField(term16915, term16915.getClass(), "seconds", 1490974290L);
        setIntField(term16915, term16915.getClass(), "nanos", 70000000);
        setField(term16913, term16913.getClass(), "instant", term16915);
        setField(term16913, term16913.getClass(), "valueAsString", "sEccwbJKYE");
        setField(term16834, term16834.getClass(), "atime", term16913);
        setField(term16930, term16930.getClass(), "unit", enum64);
        setLongField(term16930, term16930.getClass(), "value", 4949335493504695457L);
        setLongField(term16932, term16932.getClass(), "seconds", 1285679498L);
        setIntField(term16932, term16932.getClass(), "nanos", 273000000);
        setField(term16930, term16930.getClass(), "instant", term16932);
        setField(term16930, term16930.getClass(), "valueAsString", "AWRooQKkdW");
        setField(term16834, term16834.getClass(), "ctime", term16930);
        setLongField(term16834, term16834.getClass(), "crc", -1L);
        setLongField(term16834, term16834.getClass(), "csize", -1L);
        setIntField(term16834, term16834.getClass(), "flag", 1152356969);
        setByteElement(term16952, 0, (byte) -55);
        setByteElement(term16952, 1, (byte) 122);
        setByteElement(term16952, 2, (byte) -44);
        setByteElement(term16952, 3, (byte) 87);
        setByteElement(term16952, 4, (byte) 43);
        setByteElement(term16952, 5, (byte) -27);
        setByteElement(term16952, 6, (byte) -110);
        setByteElement(term16952, 7, (byte) 62);
        setField(term16834, term16834.getClass(), "extra", term16952);
        setField(term16834, term16834.getClass(), "comment", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllExtraFields", argTypes, term16834, args);
    }

};


