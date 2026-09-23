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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_paxHeaders_51667172355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4018;
     Object term19977;

    public TarArchiveInputStream_paxHeaders_51667172355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20028 = Class.forName((String) "java.io.File$PathStatus");
        Field term20027 = ((Class) term20028).getDeclaredField((String) "CHECKED");
        ((Field) term20027).setAccessible(true);
        Object enum52 = ((Field) term20027).get((Object) null);
        HashMap term4098 = new HashMap();
        term4018 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4019 = (byte[]) newByteArray(5);
        Object term4030 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4069 = newInstance(Class.forName("java.io.File"));
        byte[] term4108 = (byte[]) newByteArray(1);
        setByteElement(term4019, 0, (byte) 25);
        setByteElement(term4019, 1, (byte) 16);
        setByteElement(term4019, 2, (byte) 39);
        setByteElement(term4019, 3, (byte) 123);
        setByteElement(term4019, 4, (byte) 16);
        setField(term4018, term4018.getClass(), "SMALL_BUF", term4019);
        setIntField(term4018, term4018.getClass(), "recordSize", -1845499264);
        setIntField(term4018, term4018.getClass(), "blockSize", -505439934);
        setBooleanField(term4018, term4018.getClass(), "hasHitEOF", true);
        setLongField(term4018, term4018.getClass(), "entrySize", 1667122142089513324L);
        setLongField(term4018, term4018.getClass(), "entryOffset", -6342139649364011743L);
        setField(term4018, term4018.getClass(), "is", null);
        setField(term4030, term4030.getClass(), "name", "");
        setBooleanField(term4030, term4030.getClass(), "preserveLeadingSlashes", false);
        setIntField(term4030, term4030.getClass(), "mode", -344842608);
        setLongField(term4030, term4030.getClass(), "userId", -4924950707540628022L);
        setLongField(term4030, term4030.getClass(), "groupId", -4393710401270724527L);
        setLongField(term4030, term4030.getClass(), "size", -4822736661741380518L);
        setLongField(term4030, term4030.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term4030, term4030.getClass(), "checkSumOK", true);
        setByteField(term4030, term4030.getClass(), "linkFlag", (byte) 2);
        setField(term4030, term4030.getClass(), "linkName", "");
        setField(term4030, term4030.getClass(), "magic", "ustar ");
        setField(term4030, term4030.getClass(), "version", "00");
        setField(term4030, term4030.getClass(), "userName", "root");
        setField(term4030, term4030.getClass(), "groupName", "");
        setIntField(term4030, term4030.getClass(), "devMajor", 941650513);
        setIntField(term4030, term4030.getClass(), "devMinor", 444029505);
        setBooleanField(term4030, term4030.getClass(), "isExtended", false);
        setLongField(term4030, term4030.getClass(), "realSize", -7268507582722666254L);
        setBooleanField(term4030, term4030.getClass(), "paxGNUSparse", false);
        setBooleanField(term4030, term4030.getClass(), "starSparse", true);
        setField(term4069, term4069.getClass(), "path", "nHXjMycHlU");
        setField(term4069, term4069.getClass(), "status", enum52);
        setIntField(term4069, term4069.getClass(), "prefixLength", -1034506028);
        setField(term4069, term4069.getClass(), "filePath", null);
        setField(term4030, term4030.getClass(), "file", term4069);
        setField(term4018, term4018.getClass(), "currEntry", term4030);
        setField(term4018, term4018.getClass(), "zipEncoding", null);
        setField(term4018, term4018.getClass(), "encoding", "ieCtQFdkii");
        setField(term4018, term4018.getClass(), "globalPaxHeaders", term4098);
        setByteElement(term4108, 0, (byte) -120);
        setField(term4018, term4018.getClass(), "SINGLE", term4108);
        setLongField(term4018, term4018.getClass(), "bytesRead", 5671808784468963649L);
        Class<? extends Object> term20209 = Class.forName((String) "java.io.File$PathStatus");
        Field term20208 = ((Class) term20209).getDeclaredField((String) "INVALID");
        ((Field) term20208).setAccessible(true);
        Object enum53 = ((Field) term20208).get((Object) null);
        HashMap term19999 = new HashMap();
        term19977 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19978 = (byte[]) newByteArray(5);
        Object term19979 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19992 = newInstance(Class.forName("java.io.File"));
        byte[] term20000 = (byte[]) newByteArray(1);
        setByteElement(term19978, 0, (byte) 25);
        setByteElement(term19978, 1, (byte) 16);
        setByteElement(term19978, 2, (byte) 39);
        setByteElement(term19978, 3, (byte) 123);
        setByteElement(term19978, 4, (byte) 16);
        setField(term19977, term19977.getClass(), "SMALL_BUF", term19978);
        setIntField(term19977, term19977.getClass(), "recordSize", -1845499264);
        setIntField(term19977, term19977.getClass(), "blockSize", -505439934);
        setBooleanField(term19977, term19977.getClass(), "hasHitEOF", true);
        setLongField(term19977, term19977.getClass(), "entrySize", 1667122142089513324L);
        setLongField(term19977, term19977.getClass(), "entryOffset", -6342139649364011743L);
        setField(term19977, term19977.getClass(), "is", null);
        setField(term19979, term19979.getClass(), "name", "");
        setBooleanField(term19979, term19979.getClass(), "preserveLeadingSlashes", false);
        setIntField(term19979, term19979.getClass(), "mode", -344842608);
        setLongField(term19979, term19979.getClass(), "userId", -4924950707540628022L);
        setLongField(term19979, term19979.getClass(), "groupId", -4393710401270724527L);
        setLongField(term19979, term19979.getClass(), "size", -4822736661741380518L);
        setLongField(term19979, term19979.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term19979, term19979.getClass(), "checkSumOK", true);
        setByteField(term19979, term19979.getClass(), "linkFlag", (byte) 2);
        setField(term19979, term19979.getClass(), "linkName", "");
        setField(term19979, term19979.getClass(), "magic", "ustar ");
        setField(term19979, term19979.getClass(), "version", "00");
        setField(term19979, term19979.getClass(), "userName", "root");
        setField(term19979, term19979.getClass(), "groupName", "");
        setIntField(term19979, term19979.getClass(), "devMajor", 941650513);
        setIntField(term19979, term19979.getClass(), "devMinor", 444029505);
        setBooleanField(term19979, term19979.getClass(), "isExtended", false);
        setLongField(term19979, term19979.getClass(), "realSize", -7268507582722666254L);
        setBooleanField(term19979, term19979.getClass(), "paxGNUSparse", false);
        setBooleanField(term19979, term19979.getClass(), "starSparse", true);
        setField(term19992, term19992.getClass(), "path", "nHXjMycHlU");
        setField(term19992, term19992.getClass(), "status", enum53);
        setIntField(term19992, term19992.getClass(), "prefixLength", -1034506028);
        setField(term19992, term19992.getClass(), "filePath", null);
        setField(term19979, term19979.getClass(), "file", term19992);
        setField(term19977, term19977.getClass(), "currEntry", term19979);
        setField(term19977, term19977.getClass(), "zipEncoding", null);
        setField(term19977, term19977.getClass(), "encoding", "ieCtQFdkii");
        setField(term19977, term19977.getClass(), "globalPaxHeaders", term19999);
        setByteElement(term20000, 0, (byte) -120);
        setField(term19977, term19977.getClass(), "SINGLE", term20000);
        setLongField(term19977, term19977.getClass(), "bytesRead", 5671808784468963649L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term4018, args);
        assertTrue(recursiveEquals(term4018, term19977));
    }

};


