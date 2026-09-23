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

public class TarArchiveInputStream_getLongNameData_191206871144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806;
     Object term14040;
     Object term14061;
     Object term14039;

    public TarArchiveInputStream_getLongNameData_191206871144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14089 = Class.forName((String) "java.io.File$PathStatus");
        Field term14088 = ((Class) term14089).getDeclaredField((String) "CHECKED");
        ((Field) term14088).setAccessible(true);
        Object enum35 = ((Field) term14088).get((Object) null);
        term1806 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1807 = (byte[]) newByteArray(5);
        Object term1818 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1854 = newInstance(Class.forName("java.io.File"));
        byte[] term1871 = (byte[]) newByteArray(5);
        setByteElement(term1807, 0, (byte) -126);
        setByteElement(term1807, 1, (byte) -91);
        setByteElement(term1807, 2, (byte) -104);
        setByteElement(term1807, 3, (byte) -89);
        setByteElement(term1807, 4, (byte) 13);
        setField(term1806, term1806.getClass(), "SMALL_BUF", term1807);
        setIntField(term1806, term1806.getClass(), "recordSize", -1371869594);
        setIntField(term1806, term1806.getClass(), "blockSize", -2095575670);
        setBooleanField(term1806, term1806.getClass(), "hasHitEOF", true);
        setLongField(term1806, term1806.getClass(), "entrySize", -6645965768855543712L);
        setLongField(term1806, term1806.getClass(), "entryOffset", 4784595517102746672L);
        setField(term1806, term1806.getClass(), "is", null);
        setField(term1818, term1818.getClass(), "name", "");
        setIntField(term1818, term1818.getClass(), "mode", 1225272962);
        setIntField(term1818, term1818.getClass(), "userId", 1324040357);
        setIntField(term1818, term1818.getClass(), "groupId", -1588772968);
        setLongField(term1818, term1818.getClass(), "size", -7612550318181586304L);
        setLongField(term1818, term1818.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term1818, term1818.getClass(), "checkSumOK", true);
        setByteField(term1818, term1818.getClass(), "linkFlag", (byte) 44);
        setField(term1818, term1818.getClass(), "linkName", "");
        setField(term1818, term1818.getClass(), "magic", "ustar ");
        setField(term1818, term1818.getClass(), "version", "00");
        setField(term1818, term1818.getClass(), "userName", "root");
        setField(term1818, term1818.getClass(), "groupName", "");
        setIntField(term1818, term1818.getClass(), "devMajor", -93135961);
        setIntField(term1818, term1818.getClass(), "devMinor", -112921587);
        setBooleanField(term1818, term1818.getClass(), "isExtended", true);
        setLongField(term1818, term1818.getClass(), "realSize", 4044358158040652353L);
        setField(term1854, term1854.getClass(), "path", "NRdvgJlhkX");
        setField(term1854, term1854.getClass(), "status", enum35);
        setIntField(term1854, term1854.getClass(), "prefixLength", 933028652);
        setField(term1854, term1854.getClass(), "filePath", null);
        setField(term1818, term1818.getClass(), "file", term1854);
        setField(term1806, term1806.getClass(), "currEntry", term1818);
        setField(term1806, term1806.getClass(), "encoding", null);
        setByteElement(term1871, 0, (byte) -63);
        setByteElement(term1871, 1, (byte) 15);
        setByteElement(term1871, 2, (byte) 45);
        setByteElement(term1871, 3, (byte) -39);
        setByteElement(term1871, 4, (byte) -20);
        setField(term1806, term1806.getClass(), "SINGLE", term1871);
        setLongField(term1806, term1806.getClass(), "bytesRead", -4443169559037975007L);
        Class<? extends Object> term14264 = Class.forName((String) "java.io.File$PathStatus");
        Field term14263 = ((Class) term14264).getDeclaredField((String) "INVALID");
        ((Field) term14263).setAccessible(true);
        Object enum36 = ((Field) term14263).get((Object) null);
        term14040 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term14041 = (byte[]) newByteArray(5);
        Object term14042 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14055 = newInstance(Class.forName("java.io.File"));
        byte[] term14060 = (byte[]) newByteArray(5);
        setByteElement(term14041, 0, (byte) -126);
        setByteElement(term14041, 1, (byte) -91);
        setByteElement(term14041, 2, (byte) -104);
        setByteElement(term14041, 3, (byte) -89);
        setByteElement(term14041, 4, (byte) 13);
        setField(term14040, term14040.getClass(), "SMALL_BUF", term14041);
        setIntField(term14040, term14040.getClass(), "recordSize", -1371869594);
        setIntField(term14040, term14040.getClass(), "blockSize", -2095575670);
        setBooleanField(term14040, term14040.getClass(), "hasHitEOF", true);
        setLongField(term14040, term14040.getClass(), "entrySize", -6645965768855543712L);
        setLongField(term14040, term14040.getClass(), "entryOffset", 4784595517102746672L);
        setField(term14040, term14040.getClass(), "is", null);
        setField(term14042, term14042.getClass(), "name", "");
        setIntField(term14042, term14042.getClass(), "mode", 1225272962);
        setIntField(term14042, term14042.getClass(), "userId", 1324040357);
        setIntField(term14042, term14042.getClass(), "groupId", -1588772968);
        setLongField(term14042, term14042.getClass(), "size", -7612550318181586304L);
        setLongField(term14042, term14042.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term14042, term14042.getClass(), "checkSumOK", true);
        setByteField(term14042, term14042.getClass(), "linkFlag", (byte) 44);
        setField(term14042, term14042.getClass(), "linkName", "");
        setField(term14042, term14042.getClass(), "magic", "ustar ");
        setField(term14042, term14042.getClass(), "version", "00");
        setField(term14042, term14042.getClass(), "userName", "root");
        setField(term14042, term14042.getClass(), "groupName", "");
        setIntField(term14042, term14042.getClass(), "devMajor", -93135961);
        setIntField(term14042, term14042.getClass(), "devMinor", -112921587);
        setBooleanField(term14042, term14042.getClass(), "isExtended", true);
        setLongField(term14042, term14042.getClass(), "realSize", 4044358158040652353L);
        setField(term14055, term14055.getClass(), "path", "NRdvgJlhkX");
        setField(term14055, term14055.getClass(), "status", enum36);
        setIntField(term14055, term14055.getClass(), "prefixLength", 933028652);
        setField(term14055, term14055.getClass(), "filePath", null);
        setField(term14042, term14042.getClass(), "file", term14055);
        setField(term14040, term14040.getClass(), "currEntry", term14042);
        setField(term14040, term14040.getClass(), "encoding", null);
        setByteElement(term14060, 0, (byte) -63);
        setByteElement(term14060, 1, (byte) 15);
        setByteElement(term14060, 2, (byte) 45);
        setByteElement(term14060, 3, (byte) -39);
        setByteElement(term14060, 4, (byte) -20);
        setField(term14040, term14040.getClass(), "SINGLE", term14060);
        setLongField(term14040, term14040.getClass(), "bytesRead", -4443169559037975007L);
        term14061 = (byte[]) newByteArray(5);
        setByteElement(term14061, 0, (byte) -126);
        setByteElement(term14061, 1, (byte) -91);
        setByteElement(term14061, 2, (byte) -104);
        setByteElement(term14061, 3, (byte) -89);
        setByteElement(term14061, 4, (byte) 13);
        term14039 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term1806, args);
        assertTrue(recursiveEquals(term1806, term14040));
        assertTrue(recursiveEquals(retValue, term14039));
    }

};


