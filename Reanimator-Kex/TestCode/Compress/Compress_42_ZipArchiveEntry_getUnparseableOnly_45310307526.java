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

public class ZipArchiveEntry_getUnparseableOnly_45310307526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16090;

    public ZipArchiveEntry_getUnparseableOnly_45310307526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16267 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16266 = ((Class) term16267).getDeclaredField((String) "HOURS");
        ((Field) term16266).setAccessible(true);
        Object enum61 = ((Field) term16266).get((Object) null);
        Class<? extends Object> term16444 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16443 = ((Class) term16444).getDeclaredField((String) "MINUTES");
        ((Field) term16443).setAccessible(true);
        Object enum62 = ((Field) term16443).get((Object) null);
        Class<? extends Object> term16627 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16626 = ((Class) term16627).getDeclaredField((String) "MILLISECONDS");
        ((Field) term16626).setAccessible(true);
        Object enum63 = ((Field) term16626).get((Object) null);
        term16090 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term16099 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 0);
        Object term16100 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term16101 = (byte[]) newByteArray(5);
        byte[] term16107 = (byte[]) newByteArray(4);
        byte[] term16114 = (byte[]) newByteArray(1);
        Object term16116 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term16126 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16145 = newInstance(Class.forName("java.time.Instant"));
        Object term16160 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16181 = newInstance(Class.forName("java.time.Instant"));
        Object term16196 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16222 = newInstance(Class.forName("java.time.Instant"));
        byte[] term16242 = (byte[]) newByteArray(0);
        setIntField(term16090, term16090.getClass(), "method", -1);
        setLongField(term16090, term16090.getClass(), "size", -1L);
        setIntField(term16090, term16090.getClass(), "internalAttributes", -507387516);
        setIntField(term16090, term16090.getClass(), "versionRequired", -1970452551);
        setIntField(term16090, term16090.getClass(), "versionMadeBy", -1896376975);
        setIntField(term16090, term16090.getClass(), "platform", 729658803);
        setIntField(term16090, term16090.getClass(), "rawFlag", 114754804);
        setLongField(term16090, term16090.getClass(), "externalAttributes", -2177368829816872572L);
        setField(term16090, term16090.getClass(), "extraFields", term16099);
        setByteElement(term16101, 0, (byte) 40);
        setByteElement(term16101, 1, (byte) 73);
        setByteElement(term16101, 2, (byte) 109);
        setByteElement(term16101, 3, (byte) 76);
        setByteElement(term16101, 4, (byte) -34);
        setField(term16100, term16100.getClass(), "localFileData", term16101);
        setByteElement(term16107, 0, (byte) -92);
        setByteElement(term16107, 1, (byte) 124);
        setByteElement(term16107, 2, (byte) -62);
        setByteElement(term16107, 3, (byte) -7);
        setField(term16100, term16100.getClass(), "centralDirectoryData", term16107);
        setField(term16090, term16090.getClass(), "unparseableExtra", term16100);
        setField(term16090, term16090.getClass(), "name", "");
        setByteElement(term16114, 0, (byte) -74);
        setField(term16090, term16090.getClass(), "rawName", term16114);
        setBooleanField(term16116, term16116.getClass(), "languageEncodingFlag", false);
        setBooleanField(term16116, term16116.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term16116, term16116.getClass(), "encryptionFlag", false);
        setBooleanField(term16116, term16116.getClass(), "strongEncryptionFlag", false);
        setIntField(term16116, term16116.getClass(), "slidingDictionarySize", 0);
        setIntField(term16116, term16116.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term16090, term16090.getClass(), "gpb", term16116);
        setLongField(term16090, term16090.getClass(), "xdostime", -1L);
        setField(term16126, term16126.getClass(), "unit", enum61);
        setLongField(term16126, term16126.getClass(), "value", -8463029266761149071L);
        setLongField(term16145, term16145.getClass(), "seconds", 1597370397L);
        setIntField(term16145, term16145.getClass(), "nanos", 295000000);
        setField(term16126, term16126.getClass(), "instant", term16145);
        setField(term16126, term16126.getClass(), "valueAsString", "XqgfKFvPSD");
        setField(term16090, term16090.getClass(), "mtime", term16126);
        setField(term16160, term16160.getClass(), "unit", enum62);
        setLongField(term16160, term16160.getClass(), "value", 3133860696238261492L);
        setLongField(term16181, term16181.getClass(), "seconds", 1713909155L);
        setIntField(term16181, term16181.getClass(), "nanos", 263000000);
        setField(term16160, term16160.getClass(), "instant", term16181);
        setField(term16160, term16160.getClass(), "valueAsString", "JiVRgTZvKc");
        setField(term16090, term16090.getClass(), "atime", term16160);
        setField(term16196, term16196.getClass(), "unit", enum63);
        setLongField(term16196, term16196.getClass(), "value", 7247160664318067468L);
        setLongField(term16222, term16222.getClass(), "seconds", 1663431767L);
        setIntField(term16222, term16222.getClass(), "nanos", 651000000);
        setField(term16196, term16196.getClass(), "instant", term16222);
        setField(term16196, term16196.getClass(), "valueAsString", "XPKmummaqg");
        setField(term16090, term16090.getClass(), "ctime", term16196);
        setLongField(term16090, term16090.getClass(), "crc", -1L);
        setLongField(term16090, term16090.getClass(), "csize", -1L);
        setIntField(term16090, term16090.getClass(), "flag", 1687361082);
        setField(term16090, term16090.getClass(), "extra", term16242);
        setField(term16090, term16090.getClass(), "comment", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnparseableOnly", argTypes, term16090, args);
    }

};


