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
import java.lang.Long;

public class ZipArchiveEntry_setSize_92422827343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27542;
     Object term27717;

    public ZipArchiveEntry_setSize_92422827343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27732 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27731 = ((Class) term27732).getDeclaredField((String) "DAYS");
        ((Field) term27731).setAccessible(true);
        Object enum104 = ((Field) term27731).get((Object) null);
        Class<? extends Object> term27906 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term27905 = ((Class) term27906).getDeclaredField((String) "SECONDS");
        ((Field) term27905).setAccessible(true);
        Object enum105 = ((Field) term27905).get((Object) null);
        Class<? extends Object> term28089 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term28088 = ((Class) term28089).getDeclaredField((String) "NANOSECONDS");
        ((Field) term28088).setAccessible(true);
        Object enum106 = ((Field) term28088).get((Object) null);
        term27542 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term27551 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 9);
        Object term27552 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term27553 = (byte[]) newByteArray(5);
        byte[] term27559 = (byte[]) newByteArray(5);
        byte[] term27567 = (byte[]) newByteArray(2);
        Object term27570 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term27580 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27598 = newInstance(Class.forName("java.time.Instant"));
        Object term27613 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27634 = newInstance(Class.forName("java.time.Instant"));
        Object term27649 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27674 = newInstance(Class.forName("java.time.Instant"));
        byte[] term27694 = (byte[]) newByteArray(9);
        setIntField(term27542, term27542.getClass(), "method", -1);
        setLongField(term27542, term27542.getClass(), "size", -1L);
        setIntField(term27542, term27542.getClass(), "internalAttributes", 2007134147);
        setIntField(term27542, term27542.getClass(), "versionRequired", 993388358);
        setIntField(term27542, term27542.getClass(), "versionMadeBy", -765191335);
        setIntField(term27542, term27542.getClass(), "platform", -1697741155);
        setIntField(term27542, term27542.getClass(), "rawFlag", 1295839803);
        setLongField(term27542, term27542.getClass(), "externalAttributes", 1195529027276497124L);
        setField(term27542, term27542.getClass(), "extraFields", term27551);
        setByteElement(term27553, 0, (byte) 10);
        setByteElement(term27553, 1, (byte) 62);
        setByteElement(term27553, 2, (byte) 115);
        setByteElement(term27553, 3, (byte) -128);
        setByteElement(term27553, 4, (byte) -52);
        setField(term27552, term27552.getClass(), "localFileData", term27553);
        setByteElement(term27559, 0, (byte) -48);
        setByteElement(term27559, 1, (byte) -15);
        setByteElement(term27559, 2, (byte) -117);
        setByteElement(term27559, 3, (byte) 45);
        setByteElement(term27559, 4, (byte) 60);
        setField(term27552, term27552.getClass(), "centralDirectoryData", term27559);
        setField(term27542, term27542.getClass(), "unparseableExtra", term27552);
        setField(term27542, term27542.getClass(), "name", "");
        setByteElement(term27567, 0, (byte) 22);
        setByteElement(term27567, 1, (byte) -98);
        setField(term27542, term27542.getClass(), "rawName", term27567);
        setBooleanField(term27570, term27570.getClass(), "languageEncodingFlag", false);
        setBooleanField(term27570, term27570.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term27570, term27570.getClass(), "encryptionFlag", false);
        setBooleanField(term27570, term27570.getClass(), "strongEncryptionFlag", false);
        setIntField(term27570, term27570.getClass(), "slidingDictionarySize", 0);
        setIntField(term27570, term27570.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term27542, term27542.getClass(), "gpb", term27570);
        setLongField(term27542, term27542.getClass(), "xdostime", -1L);
        setField(term27580, term27580.getClass(), "unit", enum104);
        setLongField(term27580, term27580.getClass(), "value", -2783999800714825789L);
        setLongField(term27598, term27598.getClass(), "seconds", 1456392715L);
        setIntField(term27598, term27598.getClass(), "nanos", 658000000);
        setField(term27580, term27580.getClass(), "instant", term27598);
        setField(term27580, term27580.getClass(), "valueAsString", "PapWxkhEWe");
        setField(term27542, term27542.getClass(), "mtime", term27580);
        setField(term27613, term27613.getClass(), "unit", enum105);
        setLongField(term27613, term27613.getClass(), "value", 4266570509071948633L);
        setLongField(term27634, term27634.getClass(), "seconds", 1340927568L);
        setIntField(term27634, term27634.getClass(), "nanos", 660000000);
        setField(term27613, term27613.getClass(), "instant", term27634);
        setField(term27613, term27613.getClass(), "valueAsString", "smnHEqRFRx");
        setField(term27542, term27542.getClass(), "atime", term27613);
        setField(term27649, term27649.getClass(), "unit", enum106);
        setLongField(term27649, term27649.getClass(), "value", -7291742736502427077L);
        setLongField(term27674, term27674.getClass(), "seconds", 1862675813L);
        setIntField(term27674, term27674.getClass(), "nanos", 973000000);
        setField(term27649, term27649.getClass(), "instant", term27674);
        setField(term27649, term27649.getClass(), "valueAsString", "XYtryyobou");
        setField(term27542, term27542.getClass(), "ctime", term27649);
        setLongField(term27542, term27542.getClass(), "crc", -1L);
        setLongField(term27542, term27542.getClass(), "csize", -1L);
        setIntField(term27542, term27542.getClass(), "flag", -1891015523);
        setByteElement(term27694, 0, (byte) -113);
        setByteElement(term27694, 1, (byte) -1);
        setByteElement(term27694, 2, (byte) -84);
        setByteElement(term27694, 3, (byte) 34);
        setByteElement(term27694, 4, (byte) -125);
        setByteElement(term27694, 5, (byte) 11);
        setByteElement(term27694, 6, (byte) 50);
        setByteElement(term27694, 7, (byte) 86);
        setByteElement(term27694, 8, (byte) -96);
        setField(term27542, term27542.getClass(), "extra", term27694);
        setField(term27542, term27542.getClass(), "comment", "OYbzXylRWW");
        term27717 = new Long(-8121849829073967555L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term27717;
        callMethod(klass, "setSize", argTypes, term27542, args);
    }

};


