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

public class ZipArchiveEntry_setName_34842581435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22353;
     Object term22520;

    public ZipArchiveEntry_setName_34842581435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term22359 = new LinkedHashMap();
        Class<? extends Object> term22536 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22535 = ((Class) term22536).getDeclaredField((String) "MINUTES");
        ((Field) term22535).setAccessible(true);
        Object enum84 = ((Field) term22535).get((Object) null);
        Class<? extends Object> term22719 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term22718 = ((Class) term22719).getDeclaredField((String) "MILLISECONDS");
        ((Field) term22718).setAccessible(true);
        Object enum85 = ((Field) term22718).get((Object) null);
        term22353 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term22370 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term22371 = (byte[]) newByteArray(0);
        byte[] term22372 = (byte[]) newByteArray(5);
        byte[] term22380 = (byte[]) newByteArray(6);
        Object term22387 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term22395 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22416 = newInstance(Class.forName("java.time.Instant"));
        Object term22431 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22457 = newInstance(Class.forName("java.time.Instant"));
        Object term22472 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term22474 = newInstance(Class.forName("java.time.Instant"));
        byte[] term22494 = (byte[]) newByteArray(0);
        setIntField(term22353, term22353.getClass(), "method", -1);
        setLongField(term22353, term22353.getClass(), "size", -1L);
        setIntField(term22353, term22353.getClass(), "internalAttributes", 389427431);
        setIntField(term22353, term22353.getClass(), "platform", -1945706126);
        setLongField(term22353, term22353.getClass(), "externalAttributes", -6432617521836576658L);
        setField(term22353, term22353.getClass(), "extraFields", term22359);
        setField(term22370, term22370.getClass(), "localFileData", term22371);
        setByteElement(term22372, 0, (byte) -51);
        setByteElement(term22372, 1, (byte) -55);
        setByteElement(term22372, 2, (byte) -5);
        setByteElement(term22372, 3, (byte) 14);
        setByteElement(term22372, 4, (byte) 125);
        setField(term22370, term22370.getClass(), "centralDirectoryData", term22372);
        setField(term22353, term22353.getClass(), "unparseableExtra", term22370);
        setField(term22353, term22353.getClass(), "name", "");
        setByteElement(term22380, 0, (byte) 57);
        setByteElement(term22380, 1, (byte) 40);
        setByteElement(term22380, 2, (byte) -31);
        setByteElement(term22380, 3, (byte) 83);
        setByteElement(term22380, 4, (byte) 19);
        setByteElement(term22380, 5, (byte) 95);
        setField(term22353, term22353.getClass(), "rawName", term22380);
        setBooleanField(term22387, term22387.getClass(), "languageEncodingFlag", false);
        setBooleanField(term22387, term22387.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term22387, term22387.getClass(), "encryptionFlag", false);
        setBooleanField(term22387, term22387.getClass(), "strongEncryptionFlag", false);
        setField(term22353, term22353.getClass(), "gpb", term22387);
        setLongField(term22353, term22353.getClass(), "xdostime", -1L);
        setField(term22395, term22395.getClass(), "unit", enum84);
        setLongField(term22395, term22395.getClass(), "value", -2255965562447970862L);
        setLongField(term22416, term22416.getClass(), "seconds", 1335407252L);
        setIntField(term22416, term22416.getClass(), "nanos", 58000000);
        setField(term22395, term22395.getClass(), "instant", term22416);
        setField(term22395, term22395.getClass(), "valueAsString", "EYtfuJaxiM");
        setField(term22353, term22353.getClass(), "mtime", term22395);
        setField(term22431, term22431.getClass(), "unit", enum85);
        setLongField(term22431, term22431.getClass(), "value", 148047808219672941L);
        setLongField(term22457, term22457.getClass(), "seconds", 1616851468L);
        setIntField(term22457, term22457.getClass(), "nanos", 678000000);
        setField(term22431, term22431.getClass(), "instant", term22457);
        setField(term22431, term22431.getClass(), "valueAsString", "gCWtLVKVVe");
        setField(term22353, term22353.getClass(), "atime", term22431);
        setField(term22472, term22472.getClass(), "unit", enum85);
        setLongField(term22472, term22472.getClass(), "value", 7489064039921396098L);
        setLongField(term22474, term22474.getClass(), "seconds", 1319559754L);
        setIntField(term22474, term22474.getClass(), "nanos", 821000000);
        setField(term22472, term22472.getClass(), "instant", term22474);
        setField(term22472, term22472.getClass(), "valueAsString", "fWKJoSoCwE");
        setField(term22353, term22353.getClass(), "ctime", term22472);
        setLongField(term22353, term22353.getClass(), "crc", -1L);
        setLongField(term22353, term22353.getClass(), "csize", -1L);
        setIntField(term22353, term22353.getClass(), "flag", -1667990367);
        setField(term22353, term22353.getClass(), "extra", term22494);
        setField(term22353, term22353.getClass(), "comment", "wfaXBpWAUH");
        term22520 = (byte[]) newByteArray(3);
        setByteElement(term22520, 0, (byte) 95);
        setByteElement(term22520, 1, (byte) 15);
        setByteElement(term22520, 2, (byte) 121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "VMeAzAHwZj";
        args[1] = term22520;
        callMethod(klass, "setName", argTypes, term22353, args);
    }

};


