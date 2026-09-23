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

public class ZipArchiveEntry_setGeneralPurposeBit_91000260239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24856;
     Object term25029;

    public ZipArchiveEntry_setGeneralPurposeBit_91000260239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term24862 = new LinkedHashMap();
        Class<? extends Object> term25052 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25051 = ((Class) term25052).getDeclaredField((String) "MICROSECONDS");
        ((Field) term25051).setAccessible(true);
        Object enum93 = ((Field) term25051).get((Object) null);
        Class<? extends Object> term25250 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term25249 = ((Class) term25250).getDeclaredField((String) "MILLISECONDS");
        ((Field) term25249).setAccessible(true);
        Object enum94 = ((Field) term25249).get((Object) null);
        term24856 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term24873 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term24874 = (byte[]) newByteArray(5);
        byte[] term24880 = (byte[]) newByteArray(6);
        byte[] term24889 = (byte[]) newByteArray(6);
        Object term24896 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term24904 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24930 = newInstance(Class.forName("java.time.Instant"));
        Object term24945 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24971 = newInstance(Class.forName("java.time.Instant"));
        Object term24986 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term24988 = newInstance(Class.forName("java.time.Instant"));
        byte[] term25008 = (byte[]) newByteArray(7);
        setIntField(term24856, term24856.getClass(), "method", -1);
        setLongField(term24856, term24856.getClass(), "size", -1L);
        setIntField(term24856, term24856.getClass(), "internalAttributes", 371943306);
        setIntField(term24856, term24856.getClass(), "platform", 982388293);
        setLongField(term24856, term24856.getClass(), "externalAttributes", -6301101997917060727L);
        setField(term24856, term24856.getClass(), "extraFields", term24862);
        setByteElement(term24874, 0, (byte) 98);
        setByteElement(term24874, 1, (byte) 11);
        setByteElement(term24874, 2, (byte) 108);
        setByteElement(term24874, 3, (byte) 97);
        setByteElement(term24874, 4, (byte) -9);
        setField(term24873, term24873.getClass(), "localFileData", term24874);
        setByteElement(term24880, 0, (byte) -101);
        setByteElement(term24880, 1, (byte) 49);
        setByteElement(term24880, 2, (byte) 34);
        setByteElement(term24880, 3, (byte) -23);
        setByteElement(term24880, 4, (byte) 45);
        setByteElement(term24880, 5, (byte) -64);
        setField(term24873, term24873.getClass(), "centralDirectoryData", term24880);
        setField(term24856, term24856.getClass(), "unparseableExtra", term24873);
        setField(term24856, term24856.getClass(), "name", "");
        setByteElement(term24889, 0, (byte) -25);
        setByteElement(term24889, 1, (byte) 28);
        setByteElement(term24889, 2, (byte) 56);
        setByteElement(term24889, 3, (byte) -111);
        setByteElement(term24889, 4, (byte) -98);
        setByteElement(term24889, 5, (byte) -91);
        setField(term24856, term24856.getClass(), "rawName", term24889);
        setBooleanField(term24896, term24896.getClass(), "languageEncodingFlag", false);
        setBooleanField(term24896, term24896.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term24896, term24896.getClass(), "encryptionFlag", false);
        setBooleanField(term24896, term24896.getClass(), "strongEncryptionFlag", false);
        setField(term24856, term24856.getClass(), "gpb", term24896);
        setLongField(term24856, term24856.getClass(), "xdostime", -1L);
        setField(term24904, term24904.getClass(), "unit", enum93);
        setLongField(term24904, term24904.getClass(), "value", 8166095254618543564L);
        setLongField(term24930, term24930.getClass(), "seconds", 1758791264L);
        setIntField(term24930, term24930.getClass(), "nanos", 597000000);
        setField(term24904, term24904.getClass(), "instant", term24930);
        setField(term24904, term24904.getClass(), "valueAsString", "jwsfVjMoJT");
        setField(term24856, term24856.getClass(), "mtime", term24904);
        setField(term24945, term24945.getClass(), "unit", enum94);
        setLongField(term24945, term24945.getClass(), "value", -4598158870068953328L);
        setLongField(term24971, term24971.getClass(), "seconds", 1303907782L);
        setIntField(term24971, term24971.getClass(), "nanos", 295000000);
        setField(term24945, term24945.getClass(), "instant", term24971);
        setField(term24945, term24945.getClass(), "valueAsString", "ZfdXfCCFDf");
        setField(term24856, term24856.getClass(), "atime", term24945);
        setField(term24986, term24986.getClass(), "unit", enum93);
        setLongField(term24986, term24986.getClass(), "value", 138235087558060686L);
        setLongField(term24988, term24988.getClass(), "seconds", 1316990437L);
        setIntField(term24988, term24988.getClass(), "nanos", 233000000);
        setField(term24986, term24986.getClass(), "instant", term24988);
        setField(term24986, term24986.getClass(), "valueAsString", "MwwjNtdOFT");
        setField(term24856, term24856.getClass(), "ctime", term24986);
        setLongField(term24856, term24856.getClass(), "crc", -1L);
        setLongField(term24856, term24856.getClass(), "csize", -1L);
        setIntField(term24856, term24856.getClass(), "flag", -75206835);
        setByteElement(term25008, 0, (byte) -12);
        setByteElement(term25008, 1, (byte) 13);
        setByteElement(term25008, 2, (byte) 35);
        setByteElement(term25008, 3, (byte) -41);
        setByteElement(term25008, 4, (byte) 9);
        setByteElement(term25008, 5, (byte) 44);
        setByteElement(term25008, 6, (byte) 26);
        setField(term24856, term24856.getClass(), "extra", term25008);
        setField(term24856, term24856.getClass(), "comment", "VYkqXKVlAJ");
        term25029 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setBooleanField(term25029, term25029.getClass(), "languageEncodingFlag", false);
        setBooleanField(term25029, term25029.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term25029, term25029.getClass(), "encryptionFlag", false);
        setBooleanField(term25029, term25029.getClass(), "strongEncryptionFlag", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
        Object[] args = new Object[1];
        args[0] = term25029;
        callMethod(klass, "setGeneralPurposeBit", argTypes, term24856, args);
    }

};


