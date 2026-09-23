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

public class TarArchiveInputStream_getRecordSize_92688492840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term11982;

    public TarArchiveInputStream_getRecordSize_92688492840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12031 = Class.forName((String) "java.io.File$PathStatus");
        Field term12030 = ((Class) term12031).getDeclaredField((String) "CHECKED");
        ((Field) term12030).setAccessible(true);
        Object enum27 = ((Field) term12030).get((Object) null);
        term368 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term369 = (byte[]) newByteArray(4);
        Object term379 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term415 = newInstance(Class.forName("java.io.File"));
        byte[] term444 = (byte[]) newByteArray(5);
        setByteElement(term369, 0, (byte) -119);
        setByteElement(term369, 1, (byte) -66);
        setByteElement(term369, 2, (byte) 83);
        setByteElement(term369, 3, (byte) 74);
        setField(term368, term368.getClass(), "SMALL_BUF", term369);
        setIntField(term368, term368.getClass(), "recordSize", 1134449235);
        setIntField(term368, term368.getClass(), "blockSize", -883034806);
        setBooleanField(term368, term368.getClass(), "hasHitEOF", false);
        setLongField(term368, term368.getClass(), "entrySize", -7237588299778557629L);
        setLongField(term368, term368.getClass(), "entryOffset", 6967924379644551255L);
        setField(term368, term368.getClass(), "is", null);
        setField(term379, term379.getClass(), "name", "");
        setIntField(term379, term379.getClass(), "mode", 1585847225);
        setLongField(term379, term379.getClass(), "userId", -2813493605142626659L);
        setLongField(term379, term379.getClass(), "groupId", -8885298608300233488L);
        setLongField(term379, term379.getClass(), "size", -4325723315152823407L);
        setLongField(term379, term379.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term379, term379.getClass(), "checkSumOK", true);
        setByteField(term379, term379.getClass(), "linkFlag", (byte) -71);
        setField(term379, term379.getClass(), "linkName", "");
        setField(term379, term379.getClass(), "magic", "ustar ");
        setField(term379, term379.getClass(), "version", "00");
        setField(term379, term379.getClass(), "userName", "root");
        setField(term379, term379.getClass(), "groupName", "");
        setIntField(term379, term379.getClass(), "devMajor", 597278769);
        setIntField(term379, term379.getClass(), "devMinor", -1685132342);
        setBooleanField(term379, term379.getClass(), "isExtended", true);
        setLongField(term379, term379.getClass(), "realSize", -5476826692763582090L);
        setField(term415, term415.getClass(), "path", "EGtDIRbSSb");
        setField(term415, term415.getClass(), "status", enum27);
        setIntField(term415, term415.getClass(), "prefixLength", -1456670397);
        setField(term415, term415.getClass(), "filePath", null);
        setField(term379, term379.getClass(), "file", term415);
        setField(term368, term368.getClass(), "currEntry", term379);
        setField(term368, term368.getClass(), "zipEncoding", null);
        setField(term368, term368.getClass(), "encoding", "SzjVpOQTyS");
        setByteElement(term444, 0, (byte) 49);
        setByteElement(term444, 1, (byte) -54);
        setByteElement(term444, 2, (byte) 67);
        setByteElement(term444, 3, (byte) 78);
        setByteElement(term444, 4, (byte) 87);
        setField(term368, term368.getClass(), "SINGLE", term444);
        setLongField(term368, term368.getClass(), "bytesRead", -872011222785455006L);
        Class<? extends Object> term12300 = Class.forName((String) "java.io.File$PathStatus");
        Field term12299 = ((Class) term12300).getDeclaredField((String) "INVALID");
        ((Field) term12299).setAccessible(true);
        Object enum28 = ((Field) term12299).get((Object) null);
        term11982 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11983 = (byte[]) newByteArray(4);
        Object term11984 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11997 = newInstance(Class.forName("java.io.File"));
        byte[] term12004 = (byte[]) newByteArray(5);
        setByteElement(term11983, 0, (byte) -119);
        setByteElement(term11983, 1, (byte) -66);
        setByteElement(term11983, 2, (byte) 83);
        setByteElement(term11983, 3, (byte) 74);
        setField(term11982, term11982.getClass(), "SMALL_BUF", term11983);
        setIntField(term11982, term11982.getClass(), "recordSize", 1134449235);
        setIntField(term11982, term11982.getClass(), "blockSize", -883034806);
        setBooleanField(term11982, term11982.getClass(), "hasHitEOF", false);
        setLongField(term11982, term11982.getClass(), "entrySize", -7237588299778557629L);
        setLongField(term11982, term11982.getClass(), "entryOffset", 6967924379644551255L);
        setField(term11982, term11982.getClass(), "is", null);
        setField(term11984, term11984.getClass(), "name", "");
        setIntField(term11984, term11984.getClass(), "mode", 1585847225);
        setLongField(term11984, term11984.getClass(), "userId", -2813493605142626659L);
        setLongField(term11984, term11984.getClass(), "groupId", -8885298608300233488L);
        setLongField(term11984, term11984.getClass(), "size", -4325723315152823407L);
        setLongField(term11984, term11984.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term11984, term11984.getClass(), "checkSumOK", true);
        setByteField(term11984, term11984.getClass(), "linkFlag", (byte) -71);
        setField(term11984, term11984.getClass(), "linkName", "");
        setField(term11984, term11984.getClass(), "magic", "ustar ");
        setField(term11984, term11984.getClass(), "version", "00");
        setField(term11984, term11984.getClass(), "userName", "root");
        setField(term11984, term11984.getClass(), "groupName", "");
        setIntField(term11984, term11984.getClass(), "devMajor", 597278769);
        setIntField(term11984, term11984.getClass(), "devMinor", -1685132342);
        setBooleanField(term11984, term11984.getClass(), "isExtended", true);
        setLongField(term11984, term11984.getClass(), "realSize", -5476826692763582090L);
        setField(term11997, term11997.getClass(), "path", "EGtDIRbSSb");
        setField(term11997, term11997.getClass(), "status", enum28);
        setIntField(term11997, term11997.getClass(), "prefixLength", -1456670397);
        setField(term11997, term11997.getClass(), "filePath", null);
        setField(term11984, term11984.getClass(), "file", term11997);
        setField(term11982, term11982.getClass(), "currEntry", term11984);
        setField(term11982, term11982.getClass(), "zipEncoding", null);
        setField(term11982, term11982.getClass(), "encoding", "SzjVpOQTyS");
        setByteElement(term12004, 0, (byte) 49);
        setByteElement(term12004, 1, (byte) -54);
        setByteElement(term12004, 2, (byte) 67);
        setByteElement(term12004, 3, (byte) 78);
        setByteElement(term12004, 4, (byte) 87);
        setField(term11982, term11982.getClass(), "SINGLE", term12004);
        setLongField(term11982, term11982.getClass(), "bytesRead", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term368, args);
        assertTrue(recursiveEquals(term368, term11982));
        assertTrue(recursiveEquals(retValue, 1134449235));
    }

};


