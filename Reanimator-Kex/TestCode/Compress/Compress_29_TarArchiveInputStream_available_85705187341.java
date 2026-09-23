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

public class TarArchiveInputStream_available_85705187341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;
     Object term11757;

    public TarArchiveInputStream_available_85705187341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11806 = Class.forName((String) "java.io.File$PathStatus");
        Field term11805 = ((Class) term11806).getDeclaredField((String) "CHECKED");
        ((Field) term11805).setAccessible(true);
        Object enum29 = ((Field) term11805).get((Object) null);
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
        setField(term640, term640.getClass(), "status", enum29);
        setIntField(term640, term640.getClass(), "prefixLength", -244121226);
        setField(term640, term640.getClass(), "filePath", null);
        setField(term604, term604.getClass(), "file", term640);
        setField(term591, term591.getClass(), "currEntry", term604);
        setField(term591, term591.getClass(), "zipEncoding", null);
        setByteElement(term657, 0, (byte) -15);
        setByteElement(term657, 1, (byte) 36);
        setField(term591, term591.getClass(), "SINGLE", term657);
        setLongField(term591, term591.getClass(), "bytesRead", 5127676408959197577L);
        Class<? extends Object> term11979 = Class.forName((String) "java.io.File$PathStatus");
        Field term11978 = ((Class) term11979).getDeclaredField((String) "CHECKED");
        ((Field) term11978).setAccessible(true);
        Object enum30 = ((Field) term11978).get((Object) null);
        term11757 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11758 = (byte[]) newByteArray(6);
        Object term11759 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11772 = newInstance(Class.forName("java.io.File"));
        byte[] term11777 = (byte[]) newByteArray(2);
        setByteElement(term11758, 0, (byte) 121);
        setByteElement(term11758, 1, (byte) -99);
        setByteElement(term11758, 2, (byte) -2);
        setByteElement(term11758, 3, (byte) -16);
        setByteElement(term11758, 4, (byte) -112);
        setByteElement(term11758, 5, (byte) -111);
        setField(term11757, term11757.getClass(), "SMALL_BUF", term11758);
        setIntField(term11757, term11757.getClass(), "recordSize", -2068769794);
        setIntField(term11757, term11757.getClass(), "blockSize", -117576464);
        setBooleanField(term11757, term11757.getClass(), "hasHitEOF", true);
        setLongField(term11757, term11757.getClass(), "entrySize", -4325723315152823407L);
        setLongField(term11757, term11757.getClass(), "entryOffset", 2535595959091595249L);
        setField(term11757, term11757.getClass(), "is", null);
        setField(term11759, term11759.getClass(), "name", "");
        setIntField(term11759, term11759.getClass(), "mode", -1007160944);
        setIntField(term11759, term11759.getClass(), "userId", 1135664017);
        setIntField(term11759, term11759.getClass(), "groupId", 590364439);
        setLongField(term11759, term11759.getClass(), "size", -5476826692763582090L);
        setLongField(term11759, term11759.getClass(), "modTime", -872011222785455006L);
        setBooleanField(term11759, term11759.getClass(), "checkSumOK", true);
        setByteField(term11759, term11759.getClass(), "linkFlag", (byte) 23);
        setField(term11759, term11759.getClass(), "linkName", "");
        setField(term11759, term11759.getClass(), "magic", "ustar ");
        setField(term11759, term11759.getClass(), "version", "00");
        setField(term11759, term11759.getClass(), "userName", "root");
        setField(term11759, term11759.getClass(), "groupName", "");
        setIntField(term11759, term11759.getClass(), "devMajor", 865208305);
        setIntField(term11759, term11759.getClass(), "devMinor", -1275173084);
        setBooleanField(term11759, term11759.getClass(), "isExtended", false);
        setLongField(term11759, term11759.getClass(), "realSize", -316468845751588286L);
        setField(term11772, term11772.getClass(), "path", "EGtDIRbSSb");
        setField(term11772, term11772.getClass(), "status", enum30);
        setIntField(term11772, term11772.getClass(), "prefixLength", -244121226);
        setField(term11772, term11772.getClass(), "filePath", null);
        setField(term11759, term11759.getClass(), "file", term11772);
        setField(term11757, term11757.getClass(), "currEntry", term11759);
        setField(term11757, term11757.getClass(), "zipEncoding", null);
        setByteElement(term11777, 0, (byte) -15);
        setByteElement(term11777, 1, (byte) 36);
        setField(term11757, term11757.getClass(), "SINGLE", term11777);
        setLongField(term11757, term11757.getClass(), "bytesRead", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term591, args);
        assertTrue(recursiveEquals(term591, term11757));
        assertTrue(recursiveEquals(retValue, 270455712));
    }

};


