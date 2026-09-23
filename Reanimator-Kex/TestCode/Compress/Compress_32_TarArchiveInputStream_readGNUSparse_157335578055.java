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
     Object term4453;
     Object term19804;

    public TarArchiveInputStream_readGNUSparse_157335578055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19850 = Class.forName((String) "java.io.File$PathStatus");
        Field term19849 = ((Class) term19850).getDeclaredField((String) "INVALID");
        ((Field) term19849).setAccessible(true);
        Object enum51 = ((Field) term19849).get((Object) null);
        term4453 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4454 = (byte[]) newByteArray(1);
        Object term4461 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4497 = newInstance(Class.forName("java.io.File"));
        byte[] term4526 = (byte[]) newByteArray(5);
        setByteElement(term4454, 0, (byte) -126);
        setField(term4453, term4453.getClass(), "SMALL_BUF", term4454);
        setIntField(term4453, term4453.getClass(), "recordSize", 1596213415);
        setIntField(term4453, term4453.getClass(), "blockSize", -268815336);
        setBooleanField(term4453, term4453.getClass(), "hasHitEOF", false);
        setLongField(term4453, term4453.getClass(), "entrySize", -6432617521836576658L);
        setLongField(term4453, term4453.getClass(), "entryOffset", -2255965562447970862L);
        setField(term4453, term4453.getClass(), "is", null);
        setField(term4461, term4461.getClass(), "name", "");
        setIntField(term4461, term4461.getClass(), "mode", -1210583429);
        setLongField(term4461, term4461.getClass(), "userId", 148047808219672941L);
        setLongField(term4461, term4461.getClass(), "groupId", 7489064039921396098L);
        setLongField(term4461, term4461.getClass(), "size", 6843866297465638866L);
        setLongField(term4461, term4461.getClass(), "modTime", -4023935540989049732L);
        setBooleanField(term4461, term4461.getClass(), "checkSumOK", true);
        setByteField(term4461, term4461.getClass(), "linkFlag", (byte) 12);
        setField(term4461, term4461.getClass(), "linkName", "");
        setField(term4461, term4461.getClass(), "magic", "ustar ");
        setField(term4461, term4461.getClass(), "version", "00");
        setField(term4461, term4461.getClass(), "userName", "root");
        setField(term4461, term4461.getClass(), "groupName", "");
        setIntField(term4461, term4461.getClass(), "devMajor", -663691365);
        setIntField(term4461, term4461.getClass(), "devMinor", 339854490);
        setBooleanField(term4461, term4461.getClass(), "isExtended", false);
        setLongField(term4461, term4461.getClass(), "realSize", 855932984568615096L);
        setField(term4497, term4497.getClass(), "path", "GzFkzHGYFt");
        setField(term4497, term4497.getClass(), "status", enum51);
        setIntField(term4497, term4497.getClass(), "prefixLength", -615654495);
        setField(term4497, term4497.getClass(), "filePath", null);
        setField(term4461, term4461.getClass(), "file", term4497);
        setField(term4453, term4453.getClass(), "currEntry", term4461);
        setField(term4453, term4453.getClass(), "zipEncoding", null);
        setField(term4453, term4453.getClass(), "encoding", "tShwQLRGNe");
        setByteElement(term4526, 0, (byte) -75);
        setByteElement(term4526, 1, (byte) 69);
        setByteElement(term4526, 2, (byte) -6);
        setByteElement(term4526, 3, (byte) 107);
        setByteElement(term4526, 4, (byte) -109);
        setField(term4453, term4453.getClass(), "SINGLE", term4526);
        setLongField(term4453, term4453.getClass(), "bytesRead", -1616722610139554082L);
        Class<? extends Object> term20031 = Class.forName((String) "java.io.File$PathStatus");
        Field term20030 = ((Class) term20031).getDeclaredField((String) "CHECKED");
        ((Field) term20030).setAccessible(true);
        Object enum52 = ((Field) term20030).get((Object) null);
        term19804 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19805 = (byte[]) newByteArray(1);
        Object term19806 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term19819 = newInstance(Class.forName("java.io.File"));
        byte[] term19826 = (byte[]) newByteArray(5);
        setByteElement(term19805, 0, (byte) -126);
        setField(term19804, term19804.getClass(), "SMALL_BUF", term19805);
        setIntField(term19804, term19804.getClass(), "recordSize", 1596213415);
        setIntField(term19804, term19804.getClass(), "blockSize", -268815336);
        setBooleanField(term19804, term19804.getClass(), "hasHitEOF", false);
        setLongField(term19804, term19804.getClass(), "entrySize", -6432617521836576658L);
        setLongField(term19804, term19804.getClass(), "entryOffset", -2255965562447970862L);
        setField(term19804, term19804.getClass(), "is", null);
        setField(term19806, term19806.getClass(), "name", "");
        setIntField(term19806, term19806.getClass(), "mode", -1210583429);
        setLongField(term19806, term19806.getClass(), "userId", 148047808219672941L);
        setLongField(term19806, term19806.getClass(), "groupId", 7489064039921396098L);
        setLongField(term19806, term19806.getClass(), "size", 6843866297465638866L);
        setLongField(term19806, term19806.getClass(), "modTime", -4023935540989049732L);
        setBooleanField(term19806, term19806.getClass(), "checkSumOK", true);
        setByteField(term19806, term19806.getClass(), "linkFlag", (byte) 12);
        setField(term19806, term19806.getClass(), "linkName", "");
        setField(term19806, term19806.getClass(), "magic", "ustar ");
        setField(term19806, term19806.getClass(), "version", "00");
        setField(term19806, term19806.getClass(), "userName", "root");
        setField(term19806, term19806.getClass(), "groupName", "");
        setIntField(term19806, term19806.getClass(), "devMajor", -663691365);
        setIntField(term19806, term19806.getClass(), "devMinor", 339854490);
        setBooleanField(term19806, term19806.getClass(), "isExtended", false);
        setLongField(term19806, term19806.getClass(), "realSize", 855932984568615096L);
        setField(term19819, term19819.getClass(), "path", "GzFkzHGYFt");
        setField(term19819, term19819.getClass(), "status", enum52);
        setIntField(term19819, term19819.getClass(), "prefixLength", -615654495);
        setField(term19819, term19819.getClass(), "filePath", null);
        setField(term19806, term19806.getClass(), "file", term19819);
        setField(term19804, term19804.getClass(), "currEntry", term19806);
        setField(term19804, term19804.getClass(), "zipEncoding", null);
        setField(term19804, term19804.getClass(), "encoding", "tShwQLRGNe");
        setByteElement(term19826, 0, (byte) -75);
        setByteElement(term19826, 1, (byte) 69);
        setByteElement(term19826, 2, (byte) -6);
        setByteElement(term19826, 3, (byte) 107);
        setByteElement(term19826, 4, (byte) -109);
        setField(term19804, term19804.getClass(), "SINGLE", term19826);
        setLongField(term19804, term19804.getClass(), "bytesRead", -1616722610139554082L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term4453, args);
        assertTrue(recursiveEquals(term4453, term19804));
    }

};


