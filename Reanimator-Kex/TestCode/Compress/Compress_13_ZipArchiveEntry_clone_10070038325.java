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

public class ZipArchiveEntry_clone_10070038325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;

    public ZipArchiveEntry_clone_10070038325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1662 = new LinkedHashMap();
        Class<? extends Object> term1834 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1833 = ((Class) term1834).getDeclaredField((String) "MICROSECONDS");
        ((Field) term1833).setAccessible(true);
        Object enum6 = ((Field) term1833).get((Object) null);
        Class<? extends Object> term2042 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2041 = ((Class) term2042).getDeclaredField((String) "HOURS");
        ((Field) term2041).setAccessible(true);
        Object enum7 = ((Field) term2041).get((Object) null);
        term1656 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term1673 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term1674 = (byte[]) newByteArray(6);
        byte[] term1681 = (byte[]) newByteArray(2);
        byte[] term1686 = (byte[]) newByteArray(6);
        Object term1693 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term1701 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1727 = newInstance(Class.forName("java.time.Instant"));
        Object term1742 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1744 = newInstance(Class.forName("java.time.Instant"));
        Object term1759 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1778 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1798 = (byte[]) newByteArray(7);
        setIntField(term1656, term1656.getClass(), "method", -1);
        setLongField(term1656, term1656.getClass(), "size", -1L);
        setIntField(term1656, term1656.getClass(), "internalAttributes", 1725571209);
        setIntField(term1656, term1656.getClass(), "platform", -522618178);
        setLongField(term1656, term1656.getClass(), "externalAttributes", 6811161968424632369L);
        setField(term1656, term1656.getClass(), "extraFields", term1662);
        setByteElement(term1674, 0, (byte) 67);
        setByteElement(term1674, 1, (byte) 78);
        setByteElement(term1674, 2, (byte) 87);
        setByteElement(term1674, 3, (byte) 121);
        setByteElement(term1674, 4, (byte) -99);
        setByteElement(term1674, 5, (byte) -2);
        setField(term1673, term1673.getClass(), "localFileData", term1674);
        setByteElement(term1681, 0, (byte) -16);
        setByteElement(term1681, 1, (byte) -112);
        setField(term1673, term1673.getClass(), "centralDirectoryData", term1681);
        setField(term1656, term1656.getClass(), "unparseableExtra", term1673);
        setField(term1656, term1656.getClass(), "name", "");
        setByteElement(term1686, 0, (byte) -111);
        setByteElement(term1686, 1, (byte) 23);
        setByteElement(term1686, 2, (byte) -15);
        setByteElement(term1686, 3, (byte) 36);
        setByteElement(term1686, 4, (byte) 118);
        setByteElement(term1686, 5, (byte) 106);
        setField(term1656, term1656.getClass(), "rawName", term1686);
        setBooleanField(term1693, term1693.getClass(), "languageEncodingFlag", false);
        setBooleanField(term1693, term1693.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term1693, term1693.getClass(), "encryptionFlag", false);
        setBooleanField(term1693, term1693.getClass(), "strongEncryptionFlag", false);
        setField(term1656, term1656.getClass(), "gpb", term1693);
        setLongField(term1656, term1656.getClass(), "xdostime", -1L);
        setField(term1701, term1701.getClass(), "unit", enum6);
        setLongField(term1701, term1701.getClass(), "value", -7237588299778557629L);
        setLongField(term1727, term1727.getClass(), "seconds", 1429041851L);
        setIntField(term1727, term1727.getClass(), "nanos", 389000000);
        setField(term1701, term1701.getClass(), "instant", term1727);
        setField(term1701, term1701.getClass(), "valueAsString", "MxlszYVzRf");
        setField(term1656, term1656.getClass(), "mtime", term1701);
        setField(term1742, term1742.getClass(), "unit", enum6);
        setLongField(term1742, term1742.getClass(), "value", 6967924379644551255L);
        setLongField(term1744, term1744.getClass(), "seconds", 1495375463L);
        setIntField(term1744, term1744.getClass(), "nanos", 288000000);
        setField(term1742, term1742.getClass(), "instant", term1744);
        setField(term1742, term1742.getClass(), "valueAsString", "LQFpaHEwXR");
        setField(term1656, term1656.getClass(), "atime", term1742);
        setField(term1759, term1759.getClass(), "unit", enum7);
        setLongField(term1759, term1759.getClass(), "value", -2813493605142626659L);
        setLongField(term1778, term1778.getClass(), "seconds", 1645852034L);
        setIntField(term1778, term1778.getClass(), "nanos", 896000000);
        setField(term1759, term1759.getClass(), "instant", term1778);
        setField(term1759, term1759.getClass(), "valueAsString", "oVcInYnLWB");
        setField(term1656, term1656.getClass(), "ctime", term1759);
        setLongField(term1656, term1656.getClass(), "crc", -1L);
        setLongField(term1656, term1656.getClass(), "csize", -1L);
        setIntField(term1656, term1656.getClass(), "flag", -883034806);
        setByteElement(term1798, 0, (byte) 98);
        setByteElement(term1798, 1, (byte) 67);
        setByteElement(term1798, 2, (byte) 66);
        setByteElement(term1798, 3, (byte) -121);
        setByteElement(term1798, 4, (byte) -119);
        setByteElement(term1798, 5, (byte) 71);
        setByteElement(term1798, 6, (byte) 80);
        setField(term1656, term1656.getClass(), "extra", term1798);
        setField(term1656, term1656.getClass(), "comment", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term1656, args);
    }

};


