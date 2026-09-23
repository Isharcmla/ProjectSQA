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

public class ZipArchiveEntry_getExtraFields_88501410018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10566;

    public ZipArchiveEntry_getExtraFields_88501410018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10735 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10734 = ((Class) term10735).getDeclaredField((String) "SECONDS");
        ((Field) term10734).setAccessible(true);
        Object enum40 = ((Field) term10734).get((Object) null);
        Class<? extends Object> term10918 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10917 = ((Class) term10918).getDeclaredField((String) "MILLISECONDS");
        ((Field) term10917).setAccessible(true);
        Object enum41 = ((Field) term10917).get((Object) null);
        Class<? extends Object> term11116 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11115 = ((Class) term11116).getDeclaredField((String) "DAYS");
        ((Field) term11115).setAccessible(true);
        Object enum42 = ((Field) term11115).get((Object) null);
        term10566 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term10575 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 5);
        Object term10576 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term10577 = (byte[]) newByteArray(1);
        byte[] term10579 = (byte[]) newByteArray(4);
        byte[] term10586 = (byte[]) newByteArray(1);
        Object term10588 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term10598 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10619 = newInstance(Class.forName("java.time.Instant"));
        Object term10634 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10660 = newInstance(Class.forName("java.time.Instant"));
        Object term10675 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10693 = newInstance(Class.forName("java.time.Instant"));
        byte[] term10713 = (byte[]) newByteArray(1);
        setIntField(term10566, term10566.getClass(), "method", -1);
        setLongField(term10566, term10566.getClass(), "size", -1L);
        setIntField(term10566, term10566.getClass(), "internalAttributes", 1386130016);
        setIntField(term10566, term10566.getClass(), "versionRequired", 1072005683);
        setIntField(term10566, term10566.getClass(), "versionMadeBy", 1861318859);
        setIntField(term10566, term10566.getClass(), "platform", 1474524152);
        setIntField(term10566, term10566.getClass(), "rawFlag", 568954359);
        setLongField(term10566, term10566.getClass(), "externalAttributes", 5953383087795962419L);
        setField(term10566, term10566.getClass(), "extraFields", term10575);
        setByteElement(term10577, 0, (byte) 94);
        setField(term10576, term10576.getClass(), "localFileData", term10577);
        setByteElement(term10579, 0, (byte) 114);
        setByteElement(term10579, 1, (byte) 110);
        setByteElement(term10579, 2, (byte) 70);
        setByteElement(term10579, 3, (byte) -46);
        setField(term10576, term10576.getClass(), "centralDirectoryData", term10579);
        setField(term10566, term10566.getClass(), "unparseableExtra", term10576);
        setField(term10566, term10566.getClass(), "name", "");
        setByteElement(term10586, 0, (byte) -78);
        setField(term10566, term10566.getClass(), "rawName", term10586);
        setBooleanField(term10588, term10588.getClass(), "languageEncodingFlag", false);
        setBooleanField(term10588, term10588.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term10588, term10588.getClass(), "encryptionFlag", false);
        setBooleanField(term10588, term10588.getClass(), "strongEncryptionFlag", false);
        setIntField(term10588, term10588.getClass(), "slidingDictionarySize", 0);
        setIntField(term10588, term10588.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term10566, term10566.getClass(), "gpb", term10588);
        setLongField(term10566, term10566.getClass(), "xdostime", -1L);
        setField(term10598, term10598.getClass(), "unit", enum40);
        setLongField(term10598, term10598.getClass(), "value", 7994303628307559416L);
        setLongField(term10619, term10619.getClass(), "seconds", 1633022775L);
        setIntField(term10619, term10619.getClass(), "nanos", 487000000);
        setField(term10598, term10598.getClass(), "instant", term10619);
        setField(term10598, term10598.getClass(), "valueAsString", "fhkbdRViHi");
        setField(term10566, term10566.getClass(), "mtime", term10598);
        setField(term10634, term10634.getClass(), "unit", enum41);
        setLongField(term10634, term10634.getClass(), "value", 2443640364875054177L);
        setLongField(term10660, term10660.getClass(), "seconds", 1819209638L);
        setIntField(term10660, term10660.getClass(), "nanos", 549000000);
        setField(term10634, term10634.getClass(), "instant", term10660);
        setField(term10634, term10634.getClass(), "valueAsString", "uWHnvSvaPl");
        setField(term10566, term10566.getClass(), "atime", term10634);
        setField(term10675, term10675.getClass(), "unit", enum42);
        setLongField(term10675, term10675.getClass(), "value", -1610676979013636850L);
        setLongField(term10693, term10693.getClass(), "seconds", 1400709778L);
        setIntField(term10693, term10693.getClass(), "nanos", 698000000);
        setField(term10675, term10675.getClass(), "instant", term10693);
        setField(term10675, term10675.getClass(), "valueAsString", "kBdSllIBVz");
        setField(term10566, term10566.getClass(), "ctime", term10675);
        setLongField(term10566, term10566.getClass(), "crc", -1L);
        setLongField(term10566, term10566.getClass(), "csize", -1L);
        setIntField(term10566, term10566.getClass(), "flag", 53410913);
        setByteElement(term10713, 0, (byte) 109);
        setField(term10566, term10566.getClass(), "extra", term10713);
        setField(term10566, term10566.getClass(), "comment", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFields", argTypes, term10566, args);
    }

};


