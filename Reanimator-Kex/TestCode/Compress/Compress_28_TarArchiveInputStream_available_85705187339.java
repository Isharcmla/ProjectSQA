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

public class TarArchiveInputStream_available_85705187339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;
     Object term11838;

    public TarArchiveInputStream_available_85705187339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11887 = Class.forName((String) "java.io.File$PathStatus");
        Field term11886 = ((Class) term11887).getDeclaredField((String) "CHECKED");
        ((Field) term11886).setAccessible(true);
        Object enum27 = ((Field) term11886).get((Object) null);
        term591 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term592 = (byte[]) newByteArray(6);
        Object term604 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term640 = newInstance(Class.forName("java.io.File"));
        byte[] term657 = (byte[]) newByteArray(2);
        setByteElement(term592, 0, (byte) 121);
        setByteElement(term592, 1, (byte) -99);
        setByteElement(term592, 2, (byte) -2);
        setByteElement(term592, 3, (byte) -16);
        setByteElement(term592, 4, (byte) -112);
        setByteElement(term592, 5, (byte) -111);
        setField(term591, term591.getClass(), "SMALL_BUF", term592);
        setIntField(term591, term591.getClass(), "recordSize", -2068769794);
        setIntField(term591, term591.getClass(), "blockSize", -117576464);
        setBooleanField(term591, term591.getClass(), "hasHitEOF", true);
        setLongField(term591, term591.getClass(), "entrySize", -4325723315152823407L);
        setLongField(term591, term591.getClass(), "entryOffset", 2535595959091595249L);
        setField(term591, term591.getClass(), "is", null);
        setField(term604, term604.getClass(), "name", "");
        setIntField(term604, term604.getClass(), "mode", -1007160944);
        setIntField(term604, term604.getClass(), "userId", 1135664017);
        setIntField(term604, term604.getClass(), "groupId", 590364439);
        setLongField(term604, term604.getClass(), "size", -5476826692763582090L);
        setLongField(term604, term604.getClass(), "modTime", -872011222785455006L);
        setBooleanField(term604, term604.getClass(), "checkSumOK", true);
        setByteField(term604, term604.getClass(), "linkFlag", (byte) 23);
        setField(term604, term604.getClass(), "linkName", "");
        setField(term604, term604.getClass(), "magic", "ustar ");
        setField(term604, term604.getClass(), "version", "00");
        setField(term604, term604.getClass(), "userName", "root");
        setField(term604, term604.getClass(), "groupName", "");
        setIntField(term604, term604.getClass(), "devMajor", 865208305);
        setIntField(term604, term604.getClass(), "devMinor", -1275173084);
        setBooleanField(term604, term604.getClass(), "isExtended", false);
        setLongField(term604, term604.getClass(), "realSize", -316468845751588286L);
        setField(term640, term640.getClass(), "path", "EGtDIRbSSb");
        setField(term640, term640.getClass(), "status", enum27);
        setIntField(term640, term640.getClass(), "prefixLength", -244121226);
        setField(term640, term640.getClass(), "filePath", null);
        setField(term604, term604.getClass(), "file", term640);
        setField(term591, term591.getClass(), "currEntry", term604);
        setField(term591, term591.getClass(), "encoding", null);
        setByteElement(term657, 0, (byte) -15);
        setByteElement(term657, 1, (byte) 36);
        setField(term591, term591.getClass(), "SINGLE", term657);
        setLongField(term591, term591.getClass(), "bytesRead", 5127676408959197577L);
        Class<? extends Object> term12060 = Class.forName((String) "java.io.File$PathStatus");
        Field term12059 = ((Class) term12060).getDeclaredField((String) "CHECKED");
        ((Field) term12059).setAccessible(true);
        Object enum28 = ((Field) term12059).get((Object) null);
        term11838 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11839 = (byte[]) newByteArray(6);
        Object term11840 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11853 = newInstance(Class.forName("java.io.File"));
        byte[] term11858 = (byte[]) newByteArray(2);
        setByteElement(term11839, 0, (byte) 121);
        setByteElement(term11839, 1, (byte) -99);
        setByteElement(term11839, 2, (byte) -2);
        setByteElement(term11839, 3, (byte) -16);
        setByteElement(term11839, 4, (byte) -112);
        setByteElement(term11839, 5, (byte) -111);
        setField(term11838, term11838.getClass(), "SMALL_BUF", term11839);
        setIntField(term11838, term11838.getClass(), "recordSize", -2068769794);
        setIntField(term11838, term11838.getClass(), "blockSize", -117576464);
        setBooleanField(term11838, term11838.getClass(), "hasHitEOF", true);
        setLongField(term11838, term11838.getClass(), "entrySize", -4325723315152823407L);
        setLongField(term11838, term11838.getClass(), "entryOffset", 2535595959091595249L);
        setField(term11838, term11838.getClass(), "is", null);
        setField(term11840, term11840.getClass(), "name", "");
        setIntField(term11840, term11840.getClass(), "mode", -1007160944);
        setIntField(term11840, term11840.getClass(), "userId", 1135664017);
        setIntField(term11840, term11840.getClass(), "groupId", 590364439);
        setLongField(term11840, term11840.getClass(), "size", -5476826692763582090L);
        setLongField(term11840, term11840.getClass(), "modTime", -872011222785455006L);
        setBooleanField(term11840, term11840.getClass(), "checkSumOK", true);
        setByteField(term11840, term11840.getClass(), "linkFlag", (byte) 23);
        setField(term11840, term11840.getClass(), "linkName", "");
        setField(term11840, term11840.getClass(), "magic", "ustar ");
        setField(term11840, term11840.getClass(), "version", "00");
        setField(term11840, term11840.getClass(), "userName", "root");
        setField(term11840, term11840.getClass(), "groupName", "");
        setIntField(term11840, term11840.getClass(), "devMajor", 865208305);
        setIntField(term11840, term11840.getClass(), "devMinor", -1275173084);
        setBooleanField(term11840, term11840.getClass(), "isExtended", false);
        setLongField(term11840, term11840.getClass(), "realSize", -316468845751588286L);
        setField(term11853, term11853.getClass(), "path", "EGtDIRbSSb");
        setField(term11853, term11853.getClass(), "status", enum28);
        setIntField(term11853, term11853.getClass(), "prefixLength", -244121226);
        setField(term11853, term11853.getClass(), "filePath", null);
        setField(term11840, term11840.getClass(), "file", term11853);
        setField(term11838, term11838.getClass(), "currEntry", term11840);
        setField(term11838, term11838.getClass(), "encoding", null);
        setByteElement(term11858, 0, (byte) -15);
        setByteElement(term11858, 1, (byte) 36);
        setField(term11838, term11838.getClass(), "SINGLE", term11858);
        setLongField(term11838, term11838.getClass(), "bytesRead", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term591, args);
        assertTrue(recursiveEquals(term591, term11838));
        assertTrue(recursiveEquals(retValue, 270455712));
    }

};


