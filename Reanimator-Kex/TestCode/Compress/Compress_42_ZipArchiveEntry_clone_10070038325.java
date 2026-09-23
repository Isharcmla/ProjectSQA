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

public class ZipArchiveEntry_clone_10070038325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1655;

    public ZipArchiveEntry_clone_10070038325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1827 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1826 = ((Class) term1827).getDeclaredField((String) "MICROSECONDS");
        ((Field) term1826).setAccessible(true);
        Object enum6 = ((Field) term1826).get((Object) null);
        Class<? extends Object> term2035 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2034 = ((Class) term2035).getDeclaredField((String) "HOURS");
        ((Field) term2034).setAccessible(true);
        Object enum7 = ((Field) term2034).get((Object) null);
        term1655 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term1664 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 2);
        Object term1665 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term1666 = (byte[]) newByteArray(6);
        byte[] term1673 = (byte[]) newByteArray(7);
        byte[] term1683 = (byte[]) newByteArray(1);
        Object term1685 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term1695 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1721 = newInstance(Class.forName("java.time.Instant"));
        Object term1736 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1738 = newInstance(Class.forName("java.time.Instant"));
        Object term1753 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1772 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1792 = (byte[]) newByteArray(6);
        setIntField(term1655, term1655.getClass(), "method", -1);
        setLongField(term1655, term1655.getClass(), "size", -1L);
        setIntField(term1655, term1655.getClass(), "internalAttributes", 1134449235);
        setIntField(term1655, term1655.getClass(), "versionRequired", -883034806);
        setIntField(term1655, term1655.getClass(), "versionMadeBy", 1585847225);
        setIntField(term1655, term1655.getClass(), "platform", 597278769);
        setIntField(term1655, term1655.getClass(), "rawFlag", -1685132342);
        setLongField(term1655, term1655.getClass(), "externalAttributes", 6811161968424632369L);
        setField(term1655, term1655.getClass(), "extraFields", term1664);
        setByteElement(term1666, 0, (byte) 87);
        setByteElement(term1666, 1, (byte) 121);
        setByteElement(term1666, 2, (byte) -99);
        setByteElement(term1666, 3, (byte) -2);
        setByteElement(term1666, 4, (byte) -16);
        setByteElement(term1666, 5, (byte) -112);
        setField(term1665, term1665.getClass(), "localFileData", term1666);
        setByteElement(term1673, 0, (byte) -111);
        setByteElement(term1673, 1, (byte) 23);
        setByteElement(term1673, 2, (byte) -15);
        setByteElement(term1673, 3, (byte) 36);
        setByteElement(term1673, 4, (byte) 118);
        setByteElement(term1673, 5, (byte) 106);
        setByteElement(term1673, 6, (byte) 98);
        setField(term1665, term1665.getClass(), "centralDirectoryData", term1673);
        setField(term1655, term1655.getClass(), "unparseableExtra", term1665);
        setField(term1655, term1655.getClass(), "name", "");
        setByteElement(term1683, 0, (byte) 67);
        setField(term1655, term1655.getClass(), "rawName", term1683);
        setBooleanField(term1685, term1685.getClass(), "languageEncodingFlag", false);
        setBooleanField(term1685, term1685.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term1685, term1685.getClass(), "encryptionFlag", false);
        setBooleanField(term1685, term1685.getClass(), "strongEncryptionFlag", false);
        setIntField(term1685, term1685.getClass(), "slidingDictionarySize", 0);
        setIntField(term1685, term1685.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term1655, term1655.getClass(), "gpb", term1685);
        setLongField(term1655, term1655.getClass(), "xdostime", -1L);
        setField(term1695, term1695.getClass(), "unit", enum6);
        setLongField(term1695, term1695.getClass(), "value", -7237588299778557629L);
        setLongField(term1721, term1721.getClass(), "seconds", 1429041851L);
        setIntField(term1721, term1721.getClass(), "nanos", 389000000);
        setField(term1695, term1695.getClass(), "instant", term1721);
        setField(term1695, term1695.getClass(), "valueAsString", "MxlszYVzRf");
        setField(term1655, term1655.getClass(), "mtime", term1695);
        setField(term1736, term1736.getClass(), "unit", enum6);
        setLongField(term1736, term1736.getClass(), "value", 6967924379644551255L);
        setLongField(term1738, term1738.getClass(), "seconds", 1495375463L);
        setIntField(term1738, term1738.getClass(), "nanos", 288000000);
        setField(term1736, term1736.getClass(), "instant", term1738);
        setField(term1736, term1736.getClass(), "valueAsString", "LQFpaHEwXR");
        setField(term1655, term1655.getClass(), "atime", term1736);
        setField(term1753, term1753.getClass(), "unit", enum7);
        setLongField(term1753, term1753.getClass(), "value", -2813493605142626659L);
        setLongField(term1772, term1772.getClass(), "seconds", 1645852034L);
        setIntField(term1772, term1772.getClass(), "nanos", 896000000);
        setField(term1753, term1753.getClass(), "instant", term1772);
        setField(term1753, term1753.getClass(), "valueAsString", "oVcInYnLWB");
        setField(term1655, term1655.getClass(), "ctime", term1753);
        setLongField(term1655, term1655.getClass(), "crc", -1L);
        setLongField(term1655, term1655.getClass(), "csize", -1L);
        setIntField(term1655, term1655.getClass(), "flag", -1456670397);
        setByteElement(term1792, 0, (byte) 66);
        setByteElement(term1792, 1, (byte) -121);
        setByteElement(term1792, 2, (byte) -119);
        setByteElement(term1792, 3, (byte) 71);
        setByteElement(term1792, 4, (byte) 80);
        setByteElement(term1792, 5, (byte) 42);
        setField(term1655, term1655.getClass(), "extra", term1792);
        setField(term1655, term1655.getClass(), "comment", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term1655, args);
    }

};


