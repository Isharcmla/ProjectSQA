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

public class TarArchiveInputStream_markSupported_155692074343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1187;
     Object term13373;

    public TarArchiveInputStream_markSupported_155692074343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13425 = Class.forName((String) "java.io.File$PathStatus");
        Field term13424 = ((Class) term13425).getDeclaredField((String) "CHECKED");
        ((Field) term13424).setAccessible(true);
        Object enum32 = ((Field) term13424).get((Object) null);
        term1187 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1188 = (byte[]) newByteArray(6);
        Object term1200 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1236 = newInstance(Class.forName("java.io.File"));
        byte[] term1265 = (byte[]) newByteArray(5);
        setByteElement(term1188, 0, (byte) -74);
        setByteElement(term1188, 1, (byte) -123);
        setByteElement(term1188, 2, (byte) -23);
        setByteElement(term1188, 3, (byte) 100);
        setByteElement(term1188, 4, (byte) 106);
        setByteElement(term1188, 5, (byte) -57);
        setField(term1187, term1187.getClass(), "SMALL_BUF", term1188);
        setIntField(term1187, term1187.getClass(), "recordSize", -203030934);
        setIntField(term1187, term1187.getClass(), "blockSize", -1179120542);
        setBooleanField(term1187, term1187.getClass(), "hasHitEOF", false);
        setLongField(term1187, term1187.getClass(), "entrySize", -6823727938421990489L);
        setLongField(term1187, term1187.getClass(), "entryOffset", -484994522244390100L);
        setField(term1187, term1187.getClass(), "is", null);
        setField(term1200, term1200.getClass(), "name", "");
        setIntField(term1200, term1200.getClass(), "mode", -73683645);
        setLongField(term1200, term1200.getClass(), "userId", 1233889271256172047L);
        setLongField(term1200, term1200.getClass(), "groupId", 6617340557564669657L);
        setLongField(term1200, term1200.getClass(), "size", 1439298019805881866L);
        setLongField(term1200, term1200.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term1200, term1200.getClass(), "checkSumOK", true);
        setByteField(term1200, term1200.getClass(), "linkFlag", (byte) -103);
        setField(term1200, term1200.getClass(), "linkName", "");
        setField(term1200, term1200.getClass(), "magic", "ustar ");
        setField(term1200, term1200.getClass(), "version", "00");
        setField(term1200, term1200.getClass(), "userName", "root");
        setField(term1200, term1200.getClass(), "groupName", "");
        setIntField(term1200, term1200.getClass(), "devMajor", -226514366);
        setIntField(term1200, term1200.getClass(), "devMinor", 1193880199);
        setBooleanField(term1200, term1200.getClass(), "isExtended", false);
        setLongField(term1200, term1200.getClass(), "realSize", 5907001541142728739L);
        setField(term1236, term1236.getClass(), "path", "uuaPigETmJ");
        setField(term1236, term1236.getClass(), "status", enum32);
        setIntField(term1236, term1236.getClass(), "prefixLength", -1087774327);
        setField(term1236, term1236.getClass(), "filePath", null);
        setField(term1200, term1200.getClass(), "file", term1236);
        setField(term1187, term1187.getClass(), "currEntry", term1200);
        setField(term1187, term1187.getClass(), "zipEncoding", null);
        setField(term1187, term1187.getClass(), "encoding", "MxlszYVzRf");
        setByteElement(term1265, 0, (byte) 98);
        setByteElement(term1265, 1, (byte) 79);
        setByteElement(term1265, 2, (byte) 61);
        setByteElement(term1265, 3, (byte) -92);
        setByteElement(term1265, 4, (byte) -42);
        setField(term1187, term1187.getClass(), "SINGLE", term1265);
        setLongField(term1187, term1187.getClass(), "bytesRead", 4178434741742309755L);
        Class<? extends Object> term13611 = Class.forName((String) "java.io.File$PathStatus");
        Field term13610 = ((Class) term13611).getDeclaredField((String) "CHECKED");
        ((Field) term13610).setAccessible(true);
        Object enum33 = ((Field) term13610).get((Object) null);
        term13373 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13374 = (byte[]) newByteArray(6);
        Object term13375 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13388 = newInstance(Class.forName("java.io.File"));
        byte[] term13395 = (byte[]) newByteArray(5);
        setByteElement(term13374, 0, (byte) -74);
        setByteElement(term13374, 1, (byte) -123);
        setByteElement(term13374, 2, (byte) -23);
        setByteElement(term13374, 3, (byte) 100);
        setByteElement(term13374, 4, (byte) 106);
        setByteElement(term13374, 5, (byte) -57);
        setField(term13373, term13373.getClass(), "SMALL_BUF", term13374);
        setIntField(term13373, term13373.getClass(), "recordSize", -203030934);
        setIntField(term13373, term13373.getClass(), "blockSize", -1179120542);
        setBooleanField(term13373, term13373.getClass(), "hasHitEOF", false);
        setLongField(term13373, term13373.getClass(), "entrySize", -6823727938421990489L);
        setLongField(term13373, term13373.getClass(), "entryOffset", -484994522244390100L);
        setField(term13373, term13373.getClass(), "is", null);
        setField(term13375, term13375.getClass(), "name", "");
        setIntField(term13375, term13375.getClass(), "mode", -73683645);
        setLongField(term13375, term13375.getClass(), "userId", 1233889271256172047L);
        setLongField(term13375, term13375.getClass(), "groupId", 6617340557564669657L);
        setLongField(term13375, term13375.getClass(), "size", 1439298019805881866L);
        setLongField(term13375, term13375.getClass(), "modTime", -8708192233349544946L);
        setBooleanField(term13375, term13375.getClass(), "checkSumOK", true);
        setByteField(term13375, term13375.getClass(), "linkFlag", (byte) -103);
        setField(term13375, term13375.getClass(), "linkName", "");
        setField(term13375, term13375.getClass(), "magic", "ustar ");
        setField(term13375, term13375.getClass(), "version", "00");
        setField(term13375, term13375.getClass(), "userName", "root");
        setField(term13375, term13375.getClass(), "groupName", "");
        setIntField(term13375, term13375.getClass(), "devMajor", -226514366);
        setIntField(term13375, term13375.getClass(), "devMinor", 1193880199);
        setBooleanField(term13375, term13375.getClass(), "isExtended", false);
        setLongField(term13375, term13375.getClass(), "realSize", 5907001541142728739L);
        setField(term13388, term13388.getClass(), "path", "uuaPigETmJ");
        setField(term13388, term13388.getClass(), "status", enum33);
        setIntField(term13388, term13388.getClass(), "prefixLength", -1087774327);
        setField(term13388, term13388.getClass(), "filePath", null);
        setField(term13375, term13375.getClass(), "file", term13388);
        setField(term13373, term13373.getClass(), "currEntry", term13375);
        setField(term13373, term13373.getClass(), "zipEncoding", null);
        setField(term13373, term13373.getClass(), "encoding", "MxlszYVzRf");
        setByteElement(term13395, 0, (byte) 98);
        setByteElement(term13395, 1, (byte) 79);
        setByteElement(term13395, 2, (byte) 61);
        setByteElement(term13395, 3, (byte) -92);
        setByteElement(term13395, 4, (byte) -42);
        setField(term13373, term13373.getClass(), "SINGLE", term13395);
        setLongField(term13373, term13373.getClass(), "bytesRead", 4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "markSupported", argTypes, term1187, args);
        assertTrue(recursiveEquals(term1187, term13373));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


