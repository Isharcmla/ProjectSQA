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

public class TarArchiveInputStream_available_85705187327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;
     Object term96072;

    public TarArchiveInputStream_available_85705187327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96130 = Class.forName((String) "java.io.File$PathStatus");
        Field term96129 = ((Class) term96130).getDeclaredField((String) "CHECKED");
        ((Field) term96129).setAccessible(true);
        Object enum23 = ((Field) term96129).get((Object) null);
        term543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term547 = (byte[]) newByteArray(6);
        Object term554 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term555 = (byte[]) newByteArray(7);
        Object term568 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term603 = newInstance(Class.forName("java.io.File"));
        byte[] term620 = (byte[]) newByteArray(1);
        setBooleanField(term543, term543.getClass(), "hasHitEOF", true);
        setLongField(term543, term543.getClass(), "entrySize", -4325723315152823407L);
        setLongField(term543, term543.getClass(), "entryOffset", 2535595959091595249L);
        setByteElement(term547, 0, (byte) 36);
        setByteElement(term547, 1, (byte) 118);
        setByteElement(term547, 2, (byte) 106);
        setByteElement(term547, 3, (byte) 98);
        setByteElement(term547, 4, (byte) 67);
        setByteElement(term547, 5, (byte) 66);
        setField(term543, term543.getClass(), "readBuf", term547);
        setField(term554, term554.getClass(), "inStream", null);
        setField(term554, term554.getClass(), "outStream", null);
        setByteElement(term555, 0, (byte) -121);
        setByteElement(term555, 1, (byte) -119);
        setByteElement(term555, 2, (byte) 71);
        setByteElement(term555, 3, (byte) 80);
        setByteElement(term555, 4, (byte) 42);
        setByteElement(term555, 5, (byte) 72);
        setByteElement(term555, 6, (byte) 111);
        setField(term554, term554.getClass(), "blockBuffer", term555);
        setIntField(term554, term554.getClass(), "currBlkIdx", 1135664017);
        setIntField(term554, term554.getClass(), "currRecIdx", 590364439);
        setIntField(term554, term554.getClass(), "blockSize", 865208305);
        setIntField(term554, term554.getClass(), "recordSize", -1275173084);
        setIntField(term554, term554.getClass(), "recsPerBlock", -244121226);
        setField(term543, term543.getClass(), "buffer", term554);
        setField(term568, term568.getClass(), "name", "");
        setIntField(term568, term568.getClass(), "mode", -203030934);
        setIntField(term568, term568.getClass(), "userId", -1179120542);
        setIntField(term568, term568.getClass(), "groupId", -73683645);
        setLongField(term568, term568.getClass(), "size", -5476826692763582090L);
        setLongField(term568, term568.getClass(), "modTime", -872011222785455006L);
        setByteField(term568, term568.getClass(), "linkFlag", (byte) 99);
        setField(term568, term568.getClass(), "linkName", "");
        setField(term568, term568.getClass(), "magic", "ustar ");
        setField(term568, term568.getClass(), "version", "00");
        setField(term568, term568.getClass(), "userName", "root");
        setField(term568, term568.getClass(), "groupName", "");
        setIntField(term568, term568.getClass(), "devMajor", -226514366);
        setIntField(term568, term568.getClass(), "devMinor", 1193880199);
        setBooleanField(term568, term568.getClass(), "isExtended", true);
        setLongField(term568, term568.getClass(), "realSize", -316468845751588286L);
        setField(term603, term603.getClass(), "path", "MuLcgQHgqz");
        setField(term603, term603.getClass(), "status", enum23);
        setIntField(term603, term603.getClass(), "prefixLength", -1087774327);
        setField(term603, term603.getClass(), "filePath", null);
        setField(term568, term568.getClass(), "file", term603);
        setField(term543, term543.getClass(), "currEntry", term568);
        setByteElement(term620, 0, (byte) -12);
        setField(term543, term543.getClass(), "SINGLE", term620);
        setLongField(term543, term543.getClass(), "bytesRead", 5127676408959197577L);
        Class<? extends Object> term96309 = Class.forName((String) "java.io.File$PathStatus");
        Field term96308 = ((Class) term96309).getDeclaredField((String) "INVALID");
        ((Field) term96308).setAccessible(true);
        Object enum24 = ((Field) term96308).get((Object) null);
        term96072 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term96073 = (byte[]) newByteArray(6);
        Object term96074 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term96075 = (byte[]) newByteArray(7);
        Object term96076 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term96089 = newInstance(Class.forName("java.io.File"));
        byte[] term96094 = (byte[]) newByteArray(1);
        setBooleanField(term96072, term96072.getClass(), "hasHitEOF", true);
        setLongField(term96072, term96072.getClass(), "entrySize", -4325723315152823407L);
        setLongField(term96072, term96072.getClass(), "entryOffset", 2535595959091595249L);
        setByteElement(term96073, 0, (byte) 36);
        setByteElement(term96073, 1, (byte) 118);
        setByteElement(term96073, 2, (byte) 106);
        setByteElement(term96073, 3, (byte) 98);
        setByteElement(term96073, 4, (byte) 67);
        setByteElement(term96073, 5, (byte) 66);
        setField(term96072, term96072.getClass(), "readBuf", term96073);
        setField(term96074, term96074.getClass(), "inStream", null);
        setField(term96074, term96074.getClass(), "outStream", null);
        setByteElement(term96075, 0, (byte) -121);
        setByteElement(term96075, 1, (byte) -119);
        setByteElement(term96075, 2, (byte) 71);
        setByteElement(term96075, 3, (byte) 80);
        setByteElement(term96075, 4, (byte) 42);
        setByteElement(term96075, 5, (byte) 72);
        setByteElement(term96075, 6, (byte) 111);
        setField(term96074, term96074.getClass(), "blockBuffer", term96075);
        setIntField(term96074, term96074.getClass(), "currBlkIdx", 1135664017);
        setIntField(term96074, term96074.getClass(), "currRecIdx", 590364439);
        setIntField(term96074, term96074.getClass(), "blockSize", 865208305);
        setIntField(term96074, term96074.getClass(), "recordSize", -1275173084);
        setIntField(term96074, term96074.getClass(), "recsPerBlock", -244121226);
        setField(term96072, term96072.getClass(), "buffer", term96074);
        setField(term96076, term96076.getClass(), "name", "");
        setIntField(term96076, term96076.getClass(), "mode", -203030934);
        setIntField(term96076, term96076.getClass(), "userId", -1179120542);
        setIntField(term96076, term96076.getClass(), "groupId", -73683645);
        setLongField(term96076, term96076.getClass(), "size", -5476826692763582090L);
        setLongField(term96076, term96076.getClass(), "modTime", -872011222785455006L);
        setByteField(term96076, term96076.getClass(), "linkFlag", (byte) 99);
        setField(term96076, term96076.getClass(), "linkName", "");
        setField(term96076, term96076.getClass(), "magic", "ustar ");
        setField(term96076, term96076.getClass(), "version", "00");
        setField(term96076, term96076.getClass(), "userName", "root");
        setField(term96076, term96076.getClass(), "groupName", "");
        setIntField(term96076, term96076.getClass(), "devMajor", -226514366);
        setIntField(term96076, term96076.getClass(), "devMinor", 1193880199);
        setBooleanField(term96076, term96076.getClass(), "isExtended", true);
        setLongField(term96076, term96076.getClass(), "realSize", -316468845751588286L);
        setField(term96089, term96089.getClass(), "path", "MuLcgQHgqz");
        setField(term96089, term96089.getClass(), "status", enum24);
        setIntField(term96089, term96089.getClass(), "prefixLength", -1087774327);
        setField(term96089, term96089.getClass(), "filePath", null);
        setField(term96076, term96076.getClass(), "file", term96089);
        setField(term96072, term96072.getClass(), "currEntry", term96076);
        setByteElement(term96094, 0, (byte) -12);
        setField(term96072, term96072.getClass(), "SINGLE", term96094);
        setLongField(term96072, term96072.getClass(), "bytesRead", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term543, args);
        assertTrue(recursiveEquals(term543, term96072));
        assertTrue(recursiveEquals(retValue, 270455712));
    }

};


