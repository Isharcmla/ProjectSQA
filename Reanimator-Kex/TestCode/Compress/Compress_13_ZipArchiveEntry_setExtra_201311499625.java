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

public class ZipArchiveEntry_setExtra_201311499625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15659;
     Object term15818;

    public ZipArchiveEntry_setExtra_201311499625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15665 = new LinkedHashMap();
        Class<? extends Object> term15841 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term15840 = ((Class) term15841).getDeclaredField((String) "DAYS");
        ((Field) term15840).setAccessible(true);
        Object enum59 = ((Field) term15840).get((Object) null);
        Class<? extends Object> term16015 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16014 = ((Class) term16015).getDeclaredField((String) "MINUTES");
        ((Field) term16014).setAccessible(true);
        Object enum60 = ((Field) term16014).get((Object) null);
        term15659 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term15676 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term15677 = (byte[]) newByteArray(0);
        byte[] term15678 = (byte[]) newByteArray(9);
        byte[] term15690 = (byte[]) newByteArray(6);
        Object term15697 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term15705 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15723 = newInstance(Class.forName("java.time.Instant"));
        Object term15738 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15759 = newInstance(Class.forName("java.time.Instant"));
        Object term15774 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term15776 = newInstance(Class.forName("java.time.Instant"));
        byte[] term15796 = (byte[]) newByteArray(8);
        setIntField(term15659, term15659.getClass(), "method", -1);
        setLongField(term15659, term15659.getClass(), "size", -1L);
        setIntField(term15659, term15659.getClass(), "internalAttributes", 71190297);
        setIntField(term15659, term15659.getClass(), "platform", 1202361360);
        setLongField(term15659, term15659.getClass(), "externalAttributes", -8876856890348836498L);
        setField(term15659, term15659.getClass(), "extraFields", term15665);
        setField(term15676, term15676.getClass(), "localFileData", term15677);
        setByteElement(term15678, 0, (byte) -46);
        setByteElement(term15678, 1, (byte) -82);
        setByteElement(term15678, 2, (byte) -105);
        setByteElement(term15678, 3, (byte) 35);
        setByteElement(term15678, 4, (byte) -80);
        setByteElement(term15678, 5, (byte) 96);
        setByteElement(term15678, 6, (byte) -66);
        setByteElement(term15678, 7, (byte) 109);
        setByteElement(term15678, 8, (byte) -44);
        setField(term15676, term15676.getClass(), "centralDirectoryData", term15678);
        setField(term15659, term15659.getClass(), "unparseableExtra", term15676);
        setField(term15659, term15659.getClass(), "name", "");
        setByteElement(term15690, 0, (byte) 100);
        setByteElement(term15690, 1, (byte) -90);
        setByteElement(term15690, 2, (byte) -49);
        setByteElement(term15690, 3, (byte) -102);
        setByteElement(term15690, 4, (byte) -74);
        setByteElement(term15690, 5, (byte) 40);
        setField(term15659, term15659.getClass(), "rawName", term15690);
        setBooleanField(term15697, term15697.getClass(), "languageEncodingFlag", false);
        setBooleanField(term15697, term15697.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term15697, term15697.getClass(), "encryptionFlag", false);
        setBooleanField(term15697, term15697.getClass(), "strongEncryptionFlag", false);
        setField(term15659, term15659.getClass(), "gpb", term15697);
        setLongField(term15659, term15659.getClass(), "xdostime", -1L);
        setField(term15705, term15705.getClass(), "unit", enum59);
        setLongField(term15705, term15705.getClass(), "value", 846579494941632714L);
        setLongField(term15723, term15723.getClass(), "seconds", 1276523397L);
        setIntField(term15723, term15723.getClass(), "nanos", 937000000);
        setField(term15705, term15705.getClass(), "instant", term15723);
        setField(term15705, term15705.getClass(), "valueAsString", "GVizqqzXpy");
        setField(term15659, term15659.getClass(), "mtime", term15705);
        setField(term15738, term15738.getClass(), "unit", enum60);
        setLongField(term15738, term15738.getClass(), "value", 6689117472719450333L);
        setLongField(term15759, term15759.getClass(), "seconds", 1278195575L);
        setIntField(term15759, term15759.getClass(), "nanos", 793000000);
        setField(term15738, term15738.getClass(), "instant", term15759);
        setField(term15738, term15738.getClass(), "valueAsString", "JqXGgAhZPl");
        setField(term15659, term15659.getClass(), "atime", term15738);
        setField(term15774, term15774.getClass(), "unit", enum60);
        setLongField(term15774, term15774.getClass(), "value", 5836128569274066678L);
        setLongField(term15776, term15776.getClass(), "seconds", 1272794321L);
        setIntField(term15776, term15776.getClass(), "nanos", 768000000);
        setField(term15774, term15774.getClass(), "instant", term15776);
        setField(term15774, term15774.getClass(), "valueAsString", "jiKYgYHqIS");
        setField(term15659, term15659.getClass(), "ctime", term15774);
        setLongField(term15659, term15659.getClass(), "crc", -1L);
        setLongField(term15659, term15659.getClass(), "csize", -1L);
        setIntField(term15659, term15659.getClass(), "flag", -2063457669);
        setByteElement(term15796, 0, (byte) 73);
        setByteElement(term15796, 1, (byte) 109);
        setByteElement(term15796, 2, (byte) 76);
        setByteElement(term15796, 3, (byte) -34);
        setByteElement(term15796, 4, (byte) -92);
        setByteElement(term15796, 5, (byte) 124);
        setByteElement(term15796, 6, (byte) -62);
        setByteElement(term15796, 7, (byte) -7);
        setField(term15659, term15659.getClass(), "extra", term15796);
        setField(term15659, term15659.getClass(), "comment", "DfISiziTgG");
        term15818 = (byte[]) newByteArray(6);
        setByteElement(term15818, 0, (byte) -74);
        setByteElement(term15818, 1, (byte) -83);
        setByteElement(term15818, 2, (byte) 56);
        setByteElement(term15818, 3, (byte) 81);
        setByteElement(term15818, 4, (byte) -27);
        setByteElement(term15818, 5, (byte) -47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15818;
        callMethod(klass, "setExtra", argTypes, term15659, args);
    }

};


