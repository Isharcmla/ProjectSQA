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

public class TarArchiveInputStream_getRecordSize_92688492842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;
     Object term13165;

    public TarArchiveInputStream_getRecordSize_92688492842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13215 = Class.forName((String) "java.io.File$PathStatus");
        Field term13214 = ((Class) term13215).getDeclaredField((String) "INVALID");
        ((Field) term13214).setAccessible(true);
        Object enum30 = ((Field) term13214).get((Object) null);
        HashMap term460 = new HashMap();
        term381 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term382 = (byte[]) newByteArray(4);
        Object term392 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term431 = newInstance(Class.forName("java.io.File"));
        byte[] term470 = (byte[]) newByteArray(5);
        setByteElement(term382, 0, (byte) -119);
        setByteElement(term382, 1, (byte) -66);
        setByteElement(term382, 2, (byte) 83);
        setByteElement(term382, 3, (byte) 74);
        setField(term381, term381.getClass(), "SMALL_BUF", term382);
        setIntField(term381, term381.getClass(), "recordSize", 1134449235);
        setIntField(term381, term381.getClass(), "blockSize", -883034806);
        setBooleanField(term381, term381.getClass(), "hasHitEOF", true);
        setLongField(term381, term381.getClass(), "entrySize", -7237588299778557629L);
        setLongField(term381, term381.getClass(), "entryOffset", 6967924379644551255L);
        setField(term381, term381.getClass(), "is", null);
        setField(term392, term392.getClass(), "name", "");
        setBooleanField(term392, term392.getClass(), "preserveLeadingSlashes", true);
        setIntField(term392, term392.getClass(), "mode", 1585847225);
        setLongField(term392, term392.getClass(), "userId", -2813493605142626659L);
        setLongField(term392, term392.getClass(), "groupId", -8885298608300233488L);
        setLongField(term392, term392.getClass(), "size", -4325723315152823407L);
        setLongField(term392, term392.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term392, term392.getClass(), "checkSumOK", false);
        setByteField(term392, term392.getClass(), "linkFlag", (byte) -71);
        setField(term392, term392.getClass(), "linkName", "");
        setField(term392, term392.getClass(), "magic", "ustar ");
        setField(term392, term392.getClass(), "version", "00");
        setField(term392, term392.getClass(), "userName", "root");
        setField(term392, term392.getClass(), "groupName", "");
        setIntField(term392, term392.getClass(), "devMajor", 597278769);
        setIntField(term392, term392.getClass(), "devMinor", -1685132342);
        setBooleanField(term392, term392.getClass(), "isExtended", true);
        setLongField(term392, term392.getClass(), "realSize", -5476826692763582090L);
        setBooleanField(term392, term392.getClass(), "paxGNUSparse", false);
        setBooleanField(term392, term392.getClass(), "starSparse", true);
        setField(term431, term431.getClass(), "path", "MjGYSRKTNF");
        setField(term431, term431.getClass(), "status", enum30);
        setIntField(term431, term431.getClass(), "prefixLength", -1456670397);
        setField(term431, term431.getClass(), "filePath", null);
        setField(term392, term392.getClass(), "file", term431);
        setField(term381, term381.getClass(), "currEntry", term392);
        setField(term381, term381.getClass(), "zipEncoding", null);
        setField(term381, term381.getClass(), "encoding", "hRNSzYYIrc");
        setField(term381, term381.getClass(), "globalPaxHeaders", term460);
        setByteElement(term470, 0, (byte) 49);
        setByteElement(term470, 1, (byte) -54);
        setByteElement(term470, 2, (byte) 67);
        setByteElement(term470, 3, (byte) 78);
        setByteElement(term470, 4, (byte) 87);
        setField(term381, term381.getClass(), "SINGLE", term470);
        setLongField(term381, term381.getClass(), "bytesRead", -872011222785455006L);
        Class<? extends Object> term13399 = Class.forName((String) "java.io.File$PathStatus");
        Field term13398 = ((Class) term13399).getDeclaredField((String) "CHECKED");
        ((Field) term13398).setAccessible(true);
        Object enum31 = ((Field) term13398).get((Object) null);
        HashMap term13187 = new HashMap();
        term13165 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13166 = (byte[]) newByteArray(4);
        Object term13167 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13180 = newInstance(Class.forName("java.io.File"));
        byte[] term13188 = (byte[]) newByteArray(5);
        setByteElement(term13166, 0, (byte) -119);
        setByteElement(term13166, 1, (byte) -66);
        setByteElement(term13166, 2, (byte) 83);
        setByteElement(term13166, 3, (byte) 74);
        setField(term13165, term13165.getClass(), "SMALL_BUF", term13166);
        setIntField(term13165, term13165.getClass(), "recordSize", 1134449235);
        setIntField(term13165, term13165.getClass(), "blockSize", -883034806);
        setBooleanField(term13165, term13165.getClass(), "hasHitEOF", true);
        setLongField(term13165, term13165.getClass(), "entrySize", -7237588299778557629L);
        setLongField(term13165, term13165.getClass(), "entryOffset", 6967924379644551255L);
        setField(term13165, term13165.getClass(), "is", null);
        setField(term13167, term13167.getClass(), "name", "");
        setBooleanField(term13167, term13167.getClass(), "preserveLeadingSlashes", true);
        setIntField(term13167, term13167.getClass(), "mode", 1585847225);
        setLongField(term13167, term13167.getClass(), "userId", -2813493605142626659L);
        setLongField(term13167, term13167.getClass(), "groupId", -8885298608300233488L);
        setLongField(term13167, term13167.getClass(), "size", -4325723315152823407L);
        setLongField(term13167, term13167.getClass(), "modTime", 2535595959091595249L);
        setBooleanField(term13167, term13167.getClass(), "checkSumOK", false);
        setByteField(term13167, term13167.getClass(), "linkFlag", (byte) -71);
        setField(term13167, term13167.getClass(), "linkName", "");
        setField(term13167, term13167.getClass(), "magic", "ustar ");
        setField(term13167, term13167.getClass(), "version", "00");
        setField(term13167, term13167.getClass(), "userName", "root");
        setField(term13167, term13167.getClass(), "groupName", "");
        setIntField(term13167, term13167.getClass(), "devMajor", 597278769);
        setIntField(term13167, term13167.getClass(), "devMinor", -1685132342);
        setBooleanField(term13167, term13167.getClass(), "isExtended", true);
        setLongField(term13167, term13167.getClass(), "realSize", -5476826692763582090L);
        setBooleanField(term13167, term13167.getClass(), "paxGNUSparse", false);
        setBooleanField(term13167, term13167.getClass(), "starSparse", true);
        setField(term13180, term13180.getClass(), "path", "MjGYSRKTNF");
        setField(term13180, term13180.getClass(), "status", enum31);
        setIntField(term13180, term13180.getClass(), "prefixLength", -1456670397);
        setField(term13180, term13180.getClass(), "filePath", null);
        setField(term13167, term13167.getClass(), "file", term13180);
        setField(term13165, term13165.getClass(), "currEntry", term13167);
        setField(term13165, term13165.getClass(), "zipEncoding", null);
        setField(term13165, term13165.getClass(), "encoding", "hRNSzYYIrc");
        setField(term13165, term13165.getClass(), "globalPaxHeaders", term13187);
        setByteElement(term13188, 0, (byte) 49);
        setByteElement(term13188, 1, (byte) -54);
        setByteElement(term13188, 2, (byte) 67);
        setByteElement(term13188, 3, (byte) 78);
        setByteElement(term13188, 4, (byte) 87);
        setField(term13165, term13165.getClass(), "SINGLE", term13188);
        setLongField(term13165, term13165.getClass(), "bytesRead", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term381, args);
        assertTrue(recursiveEquals(term381, term13165));
        assertTrue(recursiveEquals(retValue, 1134449235));
    }

};


