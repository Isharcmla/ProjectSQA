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

public class TarArchiveInputStream_markSupported_155692074345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;
     Object term15031;

    public TarArchiveInputStream_markSupported_155692074345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15084 = Class.forName((String) "java.io.File$PathStatus");
        Field term15083 = ((Class) term15084).getDeclaredField((String) "INVALID");
        ((Field) term15083).setAccessible(true);
        Object enum36 = ((Field) term15083).get((Object) null);
        HashMap term1320 = new HashMap();
        term1239 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1240 = (byte[]) newByteArray(6);
        Object term1252 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1291 = newInstance(Class.forName("java.io.File"));
        byte[] term1330 = (byte[]) newByteArray(5);
        setByteElement(term1240, 0, (byte) -74);
        setByteElement(term1240, 1, (byte) -123);
        setByteElement(term1240, 2, (byte) -23);
        setByteElement(term1240, 3, (byte) 100);
        setByteElement(term1240, 4, (byte) 106);
        setByteElement(term1240, 5, (byte) -57);
        setField(term1239, term1239.getClass(), "SMALL_BUF", term1240);
        setIntField(term1239, term1239.getClass(), "recordSize", -203030934);
        setIntField(term1239, term1239.getClass(), "blockSize", -1179120542);
        setBooleanField(term1239, term1239.getClass(), "hasHitEOF", true);
        setLongField(term1239, term1239.getClass(), "entrySize", -6823727938421990489L);
        setLongField(term1239, term1239.getClass(), "entryOffset", -484994522244390100L);
        setField(term1239, term1239.getClass(), "is", null);
        setField(term1252, term1252.getClass(), "name", "");
        setBooleanField(term1252, term1252.getClass(), "preserveLeadingSlashes", false);
        setIntField(term1252, term1252.getClass(), "mode", -73683645);
        setLongField(term1252, term1252.getClass(), "userId", 1233889271256172047L);
        setLongField(term1252, term1252.getClass(), "groupId", 6617340557564669657L);
        setLongField(term1252, term1252.getClass(), "size", 1439298019805881866L);
        setLongField(term1252, term1252.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term1252, term1252.getClass(), "checkSumOK", false);
        setByteField(term1252, term1252.getClass(), "linkFlag", (byte) -103);
        setField(term1252, term1252.getClass(), "linkName", "");
        setField(term1252, term1252.getClass(), "magic", "ustar ");
        setField(term1252, term1252.getClass(), "version", "00");
        setField(term1252, term1252.getClass(), "userName", "root");
        setField(term1252, term1252.getClass(), "groupName", "");
        setIntField(term1252, term1252.getClass(), "devMajor", -226514366);
        setIntField(term1252, term1252.getClass(), "devMinor", 1193880199);
        setBooleanField(term1252, term1252.getClass(), "isExtended", false);
        setLongField(term1252, term1252.getClass(), "realSize", 5907001541142728739L);
        setBooleanField(term1252, term1252.getClass(), "paxGNUSparse", true);
        setBooleanField(term1252, term1252.getClass(), "starSparse", true);
        setField(term1291, term1291.getClass(), "path", "pCTimMblYc");
        setField(term1291, term1291.getClass(), "status", enum36);
        setIntField(term1291, term1291.getClass(), "prefixLength", -1087774327);
        setField(term1291, term1291.getClass(), "filePath", null);
        setField(term1252, term1252.getClass(), "file", term1291);
        setField(term1239, term1239.getClass(), "currEntry", term1252);
        setField(term1239, term1239.getClass(), "zipEncoding", null);
        setField(term1239, term1239.getClass(), "encoding", "hNxWaHcfhY");
        setField(term1239, term1239.getClass(), "globalPaxHeaders", term1320);
        setByteElement(term1330, 0, (byte) 98);
        setByteElement(term1330, 1, (byte) 79);
        setByteElement(term1330, 2, (byte) 61);
        setByteElement(term1330, 3, (byte) -92);
        setByteElement(term1330, 4, (byte) -42);
        setField(term1239, term1239.getClass(), "SINGLE", term1330);
        setLongField(term1239, term1239.getClass(), "bytesRead", 4178434741742309755L);
        Class<? extends Object> term15270 = Class.forName((String) "java.io.File$PathStatus");
        Field term15269 = ((Class) term15270).getDeclaredField((String) "INVALID");
        ((Field) term15269).setAccessible(true);
        Object enum37 = ((Field) term15269).get((Object) null);
        HashMap term15053 = new HashMap();
        term15031 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term15032 = (byte[]) newByteArray(6);
        Object term15033 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term15046 = newInstance(Class.forName("java.io.File"));
        byte[] term15054 = (byte[]) newByteArray(5);
        setByteElement(term15032, 0, (byte) -74);
        setByteElement(term15032, 1, (byte) -123);
        setByteElement(term15032, 2, (byte) -23);
        setByteElement(term15032, 3, (byte) 100);
        setByteElement(term15032, 4, (byte) 106);
        setByteElement(term15032, 5, (byte) -57);
        setField(term15031, term15031.getClass(), "SMALL_BUF", term15032);
        setIntField(term15031, term15031.getClass(), "recordSize", -203030934);
        setIntField(term15031, term15031.getClass(), "blockSize", -1179120542);
        setBooleanField(term15031, term15031.getClass(), "hasHitEOF", true);
        setLongField(term15031, term15031.getClass(), "entrySize", -6823727938421990489L);
        setLongField(term15031, term15031.getClass(), "entryOffset", -484994522244390100L);
        setField(term15031, term15031.getClass(), "is", null);
        setField(term15033, term15033.getClass(), "name", "");
        setBooleanField(term15033, term15033.getClass(), "preserveLeadingSlashes", false);
        setIntField(term15033, term15033.getClass(), "mode", -73683645);
        setLongField(term15033, term15033.getClass(), "userId", 1233889271256172047L);
        setLongField(term15033, term15033.getClass(), "groupId", 6617340557564669657L);
        setLongField(term15033, term15033.getClass(), "size", 1439298019805881866L);
        setLongField(term15033, term15033.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term15033, term15033.getClass(), "checkSumOK", false);
        setByteField(term15033, term15033.getClass(), "linkFlag", (byte) -103);
        setField(term15033, term15033.getClass(), "linkName", "");
        setField(term15033, term15033.getClass(), "magic", "ustar ");
        setField(term15033, term15033.getClass(), "version", "00");
        setField(term15033, term15033.getClass(), "userName", "root");
        setField(term15033, term15033.getClass(), "groupName", "");
        setIntField(term15033, term15033.getClass(), "devMajor", -226514366);
        setIntField(term15033, term15033.getClass(), "devMinor", 1193880199);
        setBooleanField(term15033, term15033.getClass(), "isExtended", false);
        setLongField(term15033, term15033.getClass(), "realSize", 5907001541142728739L);
        setBooleanField(term15033, term15033.getClass(), "paxGNUSparse", true);
        setBooleanField(term15033, term15033.getClass(), "starSparse", true);
        setField(term15046, term15046.getClass(), "path", "pCTimMblYc");
        setField(term15046, term15046.getClass(), "status", enum37);
        setIntField(term15046, term15046.getClass(), "prefixLength", -1087774327);
        setField(term15046, term15046.getClass(), "filePath", null);
        setField(term15033, term15033.getClass(), "file", term15046);
        setField(term15031, term15031.getClass(), "currEntry", term15033);
        setField(term15031, term15031.getClass(), "zipEncoding", null);
        setField(term15031, term15031.getClass(), "encoding", "hNxWaHcfhY");
        setField(term15031, term15031.getClass(), "globalPaxHeaders", term15053);
        setByteElement(term15054, 0, (byte) 98);
        setByteElement(term15054, 1, (byte) 79);
        setByteElement(term15054, 2, (byte) 61);
        setByteElement(term15054, 3, (byte) -92);
        setByteElement(term15054, 4, (byte) -42);
        setField(term15031, term15031.getClass(), "SINGLE", term15054);
        setLongField(term15031, term15031.getClass(), "bytesRead", 4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "markSupported", argTypes, term1239, args);
        assertTrue(recursiveEquals(term1239, term15031));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


