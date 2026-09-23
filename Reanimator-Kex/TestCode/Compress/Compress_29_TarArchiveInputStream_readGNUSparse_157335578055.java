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

public class TarArchiveInputStream_readGNUSparse_157335578055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4101;
     Object term18731;

    public TarArchiveInputStream_readGNUSparse_157335578055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18775 = Class.forName((String) "java.io.File$PathStatus");
        Field term18774 = ((Class) term18775).getDeclaredField((String) "INVALID");
        ((Field) term18774).setAccessible(true);
        Object enum51 = ((Field) term18774).get((Object) null);
        term4101 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4102 = (byte[]) newByteArray(1);
        Object term4109 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4145 = newInstance(Class.forName("java.io.File"));
        byte[] term4162 = (byte[]) newByteArray(5);
        setByteElement(term4102, 0, (byte) -126);
        setField(term4101, term4101.getClass(), "SMALL_BUF", term4102);
        setIntField(term4101, term4101.getClass(), "recordSize", -1963464809);
        setIntField(term4101, term4101.getClass(), "blockSize", 71190297);
        setBooleanField(term4101, term4101.getClass(), "hasHitEOF", false);
        setLongField(term4101, term4101.getClass(), "entrySize", -8085190702504231560L);
        setLongField(term4101, term4101.getClass(), "entryOffset", 1672578078364590450L);
        setField(term4101, term4101.getClass(), "is", null);
        setField(term4109, term4109.getClass(), "name", "");
        setIntField(term4109, term4109.getClass(), "mode", 1202361360);
        setIntField(term4109, term4109.getClass(), "userId", -2015048153);
        setIntField(term4109, term4109.getClass(), "groupId", -2063457669);
        setLongField(term4109, term4109.getClass(), "size", 4949335493504695457L);
        setLongField(term4109, term4109.getClass(), "modTime", -5216789073301458893L);
        setBooleanField(term4109, term4109.getClass(), "checkSumOK", true);
        setByteField(term4109, term4109.getClass(), "linkFlag", (byte) 12);
        setField(term4109, term4109.getClass(), "linkName", "");
        setField(term4109, term4109.getClass(), "magic", "ustar ");
        setField(term4109, term4109.getClass(), "version", "00");
        setField(term4109, term4109.getClass(), "userName", "root");
        setField(term4109, term4109.getClass(), "groupName", "");
        setIntField(term4109, term4109.getClass(), "devMajor", -1222006000);
        setIntField(term4109, term4109.getClass(), "devMinor", 2095798786);
        setBooleanField(term4109, term4109.getClass(), "isExtended", false);
        setLongField(term4109, term4109.getClass(), "realSize", -1832940336320585644L);
        setField(term4145, term4145.getClass(), "path", "TEParAifyi");
        setField(term4145, term4145.getClass(), "status", enum51);
        setIntField(term4145, term4145.getClass(), "prefixLength", -1565502840);
        setField(term4145, term4145.getClass(), "filePath", null);
        setField(term4109, term4109.getClass(), "file", term4145);
        setField(term4101, term4101.getClass(), "currEntry", term4109);
        setField(term4101, term4101.getClass(), "zipEncoding", null);
        setByteElement(term4162, 0, (byte) -75);
        setByteElement(term4162, 1, (byte) 69);
        setByteElement(term4162, 2, (byte) -6);
        setByteElement(term4162, 3, (byte) 107);
        setByteElement(term4162, 4, (byte) -109);
        setField(term4101, term4101.getClass(), "SINGLE", term4162);
        setLongField(term4101, term4101.getClass(), "bytesRead", -8033714905181142681L);
        Class<? extends Object> term18946 = Class.forName((String) "java.io.File$PathStatus");
        Field term18945 = ((Class) term18946).getDeclaredField((String) "INVALID");
        ((Field) term18945).setAccessible(true);
        Object enum52 = ((Field) term18945).get((Object) null);
        term18731 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term18732 = (byte[]) newByteArray(1);
        Object term18733 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18746 = newInstance(Class.forName("java.io.File"));
        byte[] term18751 = (byte[]) newByteArray(5);
        setByteElement(term18732, 0, (byte) -126);
        setField(term18731, term18731.getClass(), "SMALL_BUF", term18732);
        setIntField(term18731, term18731.getClass(), "recordSize", -1963464809);
        setIntField(term18731, term18731.getClass(), "blockSize", 71190297);
        setBooleanField(term18731, term18731.getClass(), "hasHitEOF", false);
        setLongField(term18731, term18731.getClass(), "entrySize", -8085190702504231560L);
        setLongField(term18731, term18731.getClass(), "entryOffset", 1672578078364590450L);
        setField(term18731, term18731.getClass(), "is", null);
        setField(term18733, term18733.getClass(), "name", "");
        setIntField(term18733, term18733.getClass(), "mode", 1202361360);
        setIntField(term18733, term18733.getClass(), "userId", -2015048153);
        setIntField(term18733, term18733.getClass(), "groupId", -2063457669);
        setLongField(term18733, term18733.getClass(), "size", 4949335493504695457L);
        setLongField(term18733, term18733.getClass(), "modTime", -5216789073301458893L);
        setBooleanField(term18733, term18733.getClass(), "checkSumOK", true);
        setByteField(term18733, term18733.getClass(), "linkFlag", (byte) 12);
        setField(term18733, term18733.getClass(), "linkName", "");
        setField(term18733, term18733.getClass(), "magic", "ustar ");
        setField(term18733, term18733.getClass(), "version", "00");
        setField(term18733, term18733.getClass(), "userName", "root");
        setField(term18733, term18733.getClass(), "groupName", "");
        setIntField(term18733, term18733.getClass(), "devMajor", -1222006000);
        setIntField(term18733, term18733.getClass(), "devMinor", 2095798786);
        setBooleanField(term18733, term18733.getClass(), "isExtended", false);
        setLongField(term18733, term18733.getClass(), "realSize", -1832940336320585644L);
        setField(term18746, term18746.getClass(), "path", "TEParAifyi");
        setField(term18746, term18746.getClass(), "status", enum52);
        setIntField(term18746, term18746.getClass(), "prefixLength", -1565502840);
        setField(term18746, term18746.getClass(), "filePath", null);
        setField(term18733, term18733.getClass(), "file", term18746);
        setField(term18731, term18731.getClass(), "currEntry", term18733);
        setField(term18731, term18731.getClass(), "zipEncoding", null);
        setByteElement(term18751, 0, (byte) -75);
        setByteElement(term18751, 1, (byte) 69);
        setByteElement(term18751, 2, (byte) -6);
        setByteElement(term18751, 3, (byte) 107);
        setByteElement(term18751, 4, (byte) -109);
        setField(term18731, term18731.getClass(), "SINGLE", term18751);
        setLongField(term18731, term18731.getClass(), "bytesRead", -8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term4101, args);
        assertTrue(recursiveEquals(term4101, term18731));
    }

};


