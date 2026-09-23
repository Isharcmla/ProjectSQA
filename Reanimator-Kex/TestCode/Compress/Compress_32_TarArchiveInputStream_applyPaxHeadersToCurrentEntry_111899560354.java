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
import java.util.LinkedHashMap;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4097;
     Object term4179;
     Object term19271;
     Object term19294;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19326 = Class.forName((String) "java.io.File$PathStatus");
        Field term19325 = ((Class) term19326).getDeclaredField((String) "CHECKED");
        ((Field) term19325).setAccessible(true);
        Object enum49 = ((Field) term19325).get((Object) null);
        term4097 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4098 = (byte[]) newByteArray(8);
        Object term4112 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4148 = newInstance(Class.forName("java.io.File"));
        byte[] term4177 = (byte[]) newByteArray(0);
        setByteElement(term4098, 0, (byte) 96);
        setByteElement(term4098, 1, (byte) -41);
        setByteElement(term4098, 2, (byte) -88);
        setByteElement(term4098, 3, (byte) 39);
        setByteElement(term4098, 4, (byte) -1);
        setByteElement(term4098, 5, (byte) 117);
        setByteElement(term4098, 6, (byte) 43);
        setByteElement(term4098, 7, (byte) -27);
        setField(term4097, term4097.getClass(), "SMALL_BUF", term4098);
        setIntField(term4097, term4097.getClass(), "recordSize", -1263114719);
        setIntField(term4097, term4097.getClass(), "blockSize", -894662986);
        setBooleanField(term4097, term4097.getClass(), "hasHitEOF", true);
        setLongField(term4097, term4097.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term4097, term4097.getClass(), "entryOffset", -900457279156388404L);
        setField(term4097, term4097.getClass(), "is", null);
        setField(term4112, term4112.getClass(), "name", "");
        setIntField(term4112, term4112.getClass(), "mode", 304775596);
        setLongField(term4112, term4112.getClass(), "userId", 1084801489398441516L);
        setLongField(term4112, term4112.getClass(), "groupId", 6273754186658578034L);
        setLongField(term4112, term4112.getClass(), "size", 3620247240684476031L);
        setLongField(term4112, term4112.getClass(), "modTime", 8313800941204938919L);
        setBooleanField(term4112, term4112.getClass(), "checkSumOK", true);
        setByteField(term4112, term4112.getClass(), "linkFlag", (byte) 34);
        setField(term4112, term4112.getClass(), "linkName", "");
        setField(term4112, term4112.getClass(), "magic", "ustar ");
        setField(term4112, term4112.getClass(), "version", "00");
        setField(term4112, term4112.getClass(), "userName", "root");
        setField(term4112, term4112.getClass(), "groupName", "");
        setIntField(term4112, term4112.getClass(), "devMajor", -1347665717);
        setIntField(term4112, term4112.getClass(), "devMinor", -1888585309);
        setBooleanField(term4112, term4112.getClass(), "isExtended", true);
        setLongField(term4112, term4112.getClass(), "realSize", -1214968196781083707L);
        setField(term4148, term4148.getClass(), "path", "SbAoxhfrkn");
        setField(term4148, term4148.getClass(), "status", enum49);
        setIntField(term4148, term4148.getClass(), "prefixLength", 683666002);
        setField(term4148, term4148.getClass(), "filePath", null);
        setField(term4112, term4112.getClass(), "file", term4148);
        setField(term4097, term4097.getClass(), "currEntry", term4112);
        setField(term4097, term4097.getClass(), "zipEncoding", null);
        setField(term4097, term4097.getClass(), "encoding", "kuTXqwMtDB");
        setField(term4097, term4097.getClass(), "SINGLE", term4177);
        setLongField(term4097, term4097.getClass(), "bytesRead", -1804015692891701666L);
        term4179 = new LinkedHashMap();
        Class<? extends Object> term19509 = Class.forName((String) "java.io.File$PathStatus");
        Field term19508 = ((Class) term19509).getDeclaredField((String) "CHECKED");
        ((Field) term19508).setAccessible(true);
        Object enum50 = ((Field) term19508).get((Object) null);
        term19271 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19272 = (byte[]) newByteArray(8);
        Object term19273 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19286 = newInstance(Class.forName("java.io.File"));
        byte[] term19293 = (byte[]) newByteArray(0);
        setByteElement(term19272, 0, (byte) 96);
        setByteElement(term19272, 1, (byte) -41);
        setByteElement(term19272, 2, (byte) -88);
        setByteElement(term19272, 3, (byte) 39);
        setByteElement(term19272, 4, (byte) -1);
        setByteElement(term19272, 5, (byte) 117);
        setByteElement(term19272, 6, (byte) 43);
        setByteElement(term19272, 7, (byte) -27);
        setField(term19271, term19271.getClass(), "SMALL_BUF", term19272);
        setIntField(term19271, term19271.getClass(), "recordSize", -1263114719);
        setIntField(term19271, term19271.getClass(), "blockSize", -894662986);
        setBooleanField(term19271, term19271.getClass(), "hasHitEOF", true);
        setLongField(term19271, term19271.getClass(), "entrySize", 2297097306706899827L);
        setLongField(term19271, term19271.getClass(), "entryOffset", -900457279156388404L);
        setField(term19271, term19271.getClass(), "is", null);
        setField(term19273, term19273.getClass(), "name", "");
        setIntField(term19273, term19273.getClass(), "mode", 304775596);
        setLongField(term19273, term19273.getClass(), "userId", 1084801489398441516L);
        setLongField(term19273, term19273.getClass(), "groupId", 6273754186658578034L);
        setLongField(term19273, term19273.getClass(), "size", 3620247240684476031L);
        setLongField(term19273, term19273.getClass(), "modTime", 8313800941204938919L);
        setBooleanField(term19273, term19273.getClass(), "checkSumOK", true);
        setByteField(term19273, term19273.getClass(), "linkFlag", (byte) 34);
        setField(term19273, term19273.getClass(), "linkName", "");
        setField(term19273, term19273.getClass(), "magic", "ustar ");
        setField(term19273, term19273.getClass(), "version", "00");
        setField(term19273, term19273.getClass(), "userName", "root");
        setField(term19273, term19273.getClass(), "groupName", "");
        setIntField(term19273, term19273.getClass(), "devMajor", -1347665717);
        setIntField(term19273, term19273.getClass(), "devMinor", -1888585309);
        setBooleanField(term19273, term19273.getClass(), "isExtended", true);
        setLongField(term19273, term19273.getClass(), "realSize", -1214968196781083707L);
        setField(term19286, term19286.getClass(), "path", "SbAoxhfrkn");
        setField(term19286, term19286.getClass(), "status", enum50);
        setIntField(term19286, term19286.getClass(), "prefixLength", 683666002);
        setField(term19286, term19286.getClass(), "filePath", null);
        setField(term19273, term19273.getClass(), "file", term19286);
        setField(term19271, term19271.getClass(), "currEntry", term19273);
        setField(term19271, term19271.getClass(), "zipEncoding", null);
        setField(term19271, term19271.getClass(), "encoding", "kuTXqwMtDB");
        setField(term19271, term19271.getClass(), "SINGLE", term19293);
        setLongField(term19271, term19271.getClass(), "bytesRead", -1804015692891701666L);
        term19294 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4179;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term4097, args);
        assertTrue(recursiveEquals(term4097, term19271));
        assertTrue(recursiveEquals(term4179, term19294));
    }

};


