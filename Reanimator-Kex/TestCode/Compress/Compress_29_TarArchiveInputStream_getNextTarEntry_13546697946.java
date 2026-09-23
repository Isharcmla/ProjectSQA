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

public class TarArchiveInputStream_getNextTarEntry_13546697946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1808;
     Object term13553;

    public TarArchiveInputStream_getNextTarEntry_13546697946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13601 = Class.forName((String) "java.io.File$PathStatus");
        Field term13600 = ((Class) term13601).getDeclaredField((String) "INVALID");
        ((Field) term13600).setAccessible(true);
        Object enum36 = ((Field) term13600).get((Object) null);
        term1808 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1809 = (byte[]) newByteArray(5);
        Object term1820 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1856 = newInstance(Class.forName("java.io.File"));
        byte[] term1873 = (byte[]) newByteArray(5);
        setByteElement(term1809, 0, (byte) -126);
        setByteElement(term1809, 1, (byte) -91);
        setByteElement(term1809, 2, (byte) -104);
        setByteElement(term1809, 3, (byte) -89);
        setByteElement(term1809, 4, (byte) 13);
        setField(term1808, term1808.getClass(), "SMALL_BUF", term1809);
        setIntField(term1808, term1808.getClass(), "recordSize", -2095575670);
        setIntField(term1808, term1808.getClass(), "blockSize", 1225272962);
        setBooleanField(term1808, term1808.getClass(), "hasHitEOF", true);
        setLongField(term1808, term1808.getClass(), "entrySize", -6645965768855543712L);
        setLongField(term1808, term1808.getClass(), "entryOffset", 4784595517102746672L);
        setField(term1808, term1808.getClass(), "is", null);
        setField(term1820, term1820.getClass(), "name", "");
        setIntField(term1820, term1820.getClass(), "mode", 1324040357);
        setIntField(term1820, term1820.getClass(), "userId", -1588772968);
        setIntField(term1820, term1820.getClass(), "groupId", -93135961);
        setLongField(term1820, term1820.getClass(), "size", -7612550318181586304L);
        setLongField(term1820, term1820.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term1820, term1820.getClass(), "checkSumOK", true);
        setByteField(term1820, term1820.getClass(), "linkFlag", (byte) 44);
        setField(term1820, term1820.getClass(), "linkName", "");
        setField(term1820, term1820.getClass(), "magic", "ustar ");
        setField(term1820, term1820.getClass(), "version", "00");
        setField(term1820, term1820.getClass(), "userName", "root");
        setField(term1820, term1820.getClass(), "groupName", "");
        setIntField(term1820, term1820.getClass(), "devMajor", -112921587);
        setIntField(term1820, term1820.getClass(), "devMinor", 933028652);
        setBooleanField(term1820, term1820.getClass(), "isExtended", true);
        setLongField(term1820, term1820.getClass(), "realSize", 4044358158040652353L);
        setField(term1856, term1856.getClass(), "path", "NRdvgJlhkX");
        setField(term1856, term1856.getClass(), "status", enum36);
        setIntField(term1856, term1856.getClass(), "prefixLength", 287287233);
        setField(term1856, term1856.getClass(), "filePath", null);
        setField(term1820, term1820.getClass(), "file", term1856);
        setField(term1808, term1808.getClass(), "currEntry", term1820);
        setField(term1808, term1808.getClass(), "zipEncoding", null);
        setByteElement(term1873, 0, (byte) -63);
        setByteElement(term1873, 1, (byte) 15);
        setByteElement(term1873, 2, (byte) 45);
        setByteElement(term1873, 3, (byte) -39);
        setByteElement(term1873, 4, (byte) -20);
        setField(term1808, term1808.getClass(), "SINGLE", term1873);
        setLongField(term1808, term1808.getClass(), "bytesRead", -4443169559037975007L);
        Class<? extends Object> term13776 = Class.forName((String) "java.io.File$PathStatus");
        Field term13775 = ((Class) term13776).getDeclaredField((String) "INVALID");
        ((Field) term13775).setAccessible(true);
        Object enum37 = ((Field) term13775).get((Object) null);
        term13553 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term13554 = (byte[]) newByteArray(5);
        Object term13555 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13568 = newInstance(Class.forName("java.io.File"));
        byte[] term13573 = (byte[]) newByteArray(5);
        setByteElement(term13554, 0, (byte) -126);
        setByteElement(term13554, 1, (byte) -91);
        setByteElement(term13554, 2, (byte) -104);
        setByteElement(term13554, 3, (byte) -89);
        setByteElement(term13554, 4, (byte) 13);
        setField(term13553, term13553.getClass(), "SMALL_BUF", term13554);
        setIntField(term13553, term13553.getClass(), "recordSize", -2095575670);
        setIntField(term13553, term13553.getClass(), "blockSize", 1225272962);
        setBooleanField(term13553, term13553.getClass(), "hasHitEOF", true);
        setLongField(term13553, term13553.getClass(), "entrySize", -6645965768855543712L);
        setLongField(term13553, term13553.getClass(), "entryOffset", 4784595517102746672L);
        setField(term13553, term13553.getClass(), "is", null);
        setField(term13555, term13555.getClass(), "name", "");
        setIntField(term13555, term13555.getClass(), "mode", 1324040357);
        setIntField(term13555, term13555.getClass(), "userId", -1588772968);
        setIntField(term13555, term13555.getClass(), "groupId", -93135961);
        setLongField(term13555, term13555.getClass(), "size", -7612550318181586304L);
        setLongField(term13555, term13555.getClass(), "modTime", -2170847986967241072L);
        setBooleanField(term13555, term13555.getClass(), "checkSumOK", true);
        setByteField(term13555, term13555.getClass(), "linkFlag", (byte) 44);
        setField(term13555, term13555.getClass(), "linkName", "");
        setField(term13555, term13555.getClass(), "magic", "ustar ");
        setField(term13555, term13555.getClass(), "version", "00");
        setField(term13555, term13555.getClass(), "userName", "root");
        setField(term13555, term13555.getClass(), "groupName", "");
        setIntField(term13555, term13555.getClass(), "devMajor", -112921587);
        setIntField(term13555, term13555.getClass(), "devMinor", 933028652);
        setBooleanField(term13555, term13555.getClass(), "isExtended", true);
        setLongField(term13555, term13555.getClass(), "realSize", 4044358158040652353L);
        setField(term13568, term13568.getClass(), "path", "NRdvgJlhkX");
        setField(term13568, term13568.getClass(), "status", enum37);
        setIntField(term13568, term13568.getClass(), "prefixLength", 287287233);
        setField(term13568, term13568.getClass(), "filePath", null);
        setField(term13555, term13555.getClass(), "file", term13568);
        setField(term13553, term13553.getClass(), "currEntry", term13555);
        setField(term13553, term13553.getClass(), "zipEncoding", null);
        setByteElement(term13573, 0, (byte) -63);
        setByteElement(term13573, 1, (byte) 15);
        setByteElement(term13573, 2, (byte) 45);
        setByteElement(term13573, 3, (byte) -39);
        setByteElement(term13573, 4, (byte) -20);
        setField(term13553, term13553.getClass(), "SINGLE", term13573);
        setLongField(term13553, term13553.getClass(), "bytesRead", -4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term1808, args);
        assertTrue(recursiveEquals(term1808, term13553));
        assertTrue(recursiveEquals(retValue, null));
    }

};


