package org.apache.commons.compress.archivers.tar;

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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_178848202256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4292;

    public TarArchiveInputStream_parsePaxHeaders_178848202256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20640 = Class.forName((String) "java.io.File$PathStatus");
        Field term20639 = ((Class) term20640).getDeclaredField((String) "CHECKED");
        ((Field) term20639).setAccessible(true);
        Object enum54 = ((Field) term20639).get((Object) null);
        HashMap term4375 = new HashMap();
        term4292 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4293 = (byte[]) newByteArray(8);
        Object term4307 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4346 = newInstance(Class.forName("java.io.File"));
        byte[] term4385 = (byte[]) newByteArray(0);
        setByteElement(term4293, 0, (byte) 96);
        setByteElement(term4293, 1, (byte) -41);
        setByteElement(term4293, 2, (byte) -88);
        setByteElement(term4293, 3, (byte) 39);
        setByteElement(term4293, 4, (byte) -1);
        setByteElement(term4293, 5, (byte) 117);
        setByteElement(term4293, 6, (byte) 43);
        setByteElement(term4293, 7, (byte) -27);
        setField(term4292, term4292.getClass(), "SMALL_BUF", term4293);
        setIntField(term4292, term4292.getClass(), "recordSize", -1263114719);
        setIntField(term4292, term4292.getClass(), "blockSize", -894662986);
        setBooleanField(term4292, term4292.getClass(), "hasHitEOF", true);
        setLongField(term4292, term4292.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term4292, term4292.getClass(), "entryOffset", -900457279156388404L);
        setField(term4292, term4292.getClass(), "is", null);
        setField(term4307, term4307.getClass(), "name", "");
        setBooleanField(term4307, term4307.getClass(), "preserveLeadingSlashes", true);
        setIntField(term4307, term4307.getClass(), "mode", 304775596);
        setLongField(term4307, term4307.getClass(), "userId", 1084801489398441516L);
        setLongField(term4307, term4307.getClass(), "groupId", 6273754186658578034L);
        setLongField(term4307, term4307.getClass(), "size", 3620247240684476031L);
        setLongField(term4307, term4307.getClass(), "modTime", 8313800941204938919L);
        setBooleanField(term4307, term4307.getClass(), "checkSumOK", true);
        setByteField(term4307, term4307.getClass(), "linkFlag", (byte) 34);
        setField(term4307, term4307.getClass(), "linkName", "");
        setField(term4307, term4307.getClass(), "magic", "ustar ");
        setField(term4307, term4307.getClass(), "version", "00");
        setField(term4307, term4307.getClass(), "userName", "root");
        setField(term4307, term4307.getClass(), "groupName", "");
        setIntField(term4307, term4307.getClass(), "devMajor", -1347665717);
        setIntField(term4307, term4307.getClass(), "devMinor", -1888585309);
        setBooleanField(term4307, term4307.getClass(), "isExtended", true);
        setLongField(term4307, term4307.getClass(), "realSize", -1214968196781083707L);
        setBooleanField(term4307, term4307.getClass(), "paxGNUSparse", false);
        setBooleanField(term4307, term4307.getClass(), "starSparse", false);
        setField(term4346, term4346.getClass(), "path", "eqJfYWRaEL");
        setField(term4346, term4346.getClass(), "status", enum54);
        setIntField(term4346, term4346.getClass(), "prefixLength", 683666002);
        setField(term4346, term4346.getClass(), "filePath", null);
        setField(term4307, term4307.getClass(), "file", term4346);
        setField(term4292, term4292.getClass(), "currEntry", term4307);
        setField(term4292, term4292.getClass(), "zipEncoding", null);
        setField(term4292, term4292.getClass(), "encoding", "fhkbdRViHi");
        setField(term4292, term4292.getClass(), "globalPaxHeaders", term4375);
        setField(term4292, term4292.getClass(), "SINGLE", term4385);
        setLongField(term4292, term4292.getClass(), "bytesRead", -1804015692891701666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parsePaxHeaders", argTypes, term4292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


