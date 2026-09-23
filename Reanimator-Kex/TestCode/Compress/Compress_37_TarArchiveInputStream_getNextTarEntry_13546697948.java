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

public class TarArchiveInputStream_getNextTarEntry_13546697948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2053;
     Object term16433;

    public TarArchiveInputStream_getNextTarEntry_13546697948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16484 = Class.forName((String) "java.io.File$PathStatus");
        Field term16483 = ((Class) term16484).getDeclaredField((String) "CHECKED");
        ((Field) term16483).setAccessible(true);
        Object enum42 = ((Field) term16483).get((Object) null);
        HashMap term2133 = new HashMap();
        term2053 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2054 = (byte[]) newByteArray(5);
        Object term2065 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2104 = newInstance(Class.forName("java.io.File"));
        byte[] term2143 = (byte[]) newByteArray(5);
        setByteElement(term2054, 0, (byte) -126);
        setByteElement(term2054, 1, (byte) -91);
        setByteElement(term2054, 2, (byte) -104);
        setByteElement(term2054, 3, (byte) -89);
        setByteElement(term2054, 4, (byte) 13);
        setField(term2053, term2053.getClass(), "SMALL_BUF", term2054);
        setIntField(term2053, term2053.getClass(), "recordSize", -14890619);
        setIntField(term2053, term2053.getClass(), "blockSize", 1632125673);
        setBooleanField(term2053, term2053.getClass(), "hasHitEOF", true);
        setLongField(term2053, term2053.getClass(), "entrySize", 3825396310311739952L);
        setLongField(term2053, term2053.getClass(), "entryOffset", -3838084482494604218L);
        setField(term2053, term2053.getClass(), "is", null);
        setField(term2065, term2065.getClass(), "name", "");
        setBooleanField(term2065, term2065.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2065, term2065.getClass(), "mode", 454281060);
        setLongField(term2065, term2065.getClass(), "userId", 3892018155439224435L);
        setLongField(term2065, term2065.getClass(), "groupId", 5953383087795962419L);
        setLongField(term2065, term2065.getClass(), "size", 7994303628307559416L);
        setLongField(term2065, term2065.getClass(), "modTime", 2443640364875054177L);
        setBooleanField(term2065, term2065.getClass(), "checkSumOK", false);
        setByteField(term2065, term2065.getClass(), "linkFlag", (byte) 44);
        setField(term2065, term2065.getClass(), "linkName", "");
        setField(term2065, term2065.getClass(), "magic", "ustar ");
        setField(term2065, term2065.getClass(), "version", "00");
        setField(term2065, term2065.getClass(), "userName", "root");
        setField(term2065, term2065.getClass(), "groupName", "");
        setIntField(term2065, term2065.getClass(), "devMajor", -1786399638);
        setIntField(term2065, term2065.getClass(), "devMinor", 2055867847);
        setBooleanField(term2065, term2065.getClass(), "isExtended", true);
        setLongField(term2065, term2065.getClass(), "realSize", -1610676979013636850L);
        setBooleanField(term2065, term2065.getClass(), "paxGNUSparse", true);
        setBooleanField(term2065, term2065.getClass(), "starSparse", true);
        setField(term2104, term2104.getClass(), "path", "dWRymuLBtr");
        setField(term2104, term2104.getClass(), "status", enum42);
        setIntField(term2104, term2104.getClass(), "prefixLength", -1048298087);
        setField(term2104, term2104.getClass(), "filePath", null);
        setField(term2065, term2065.getClass(), "file", term2104);
        setField(term2053, term2053.getClass(), "currEntry", term2065);
        setField(term2053, term2053.getClass(), "zipEncoding", null);
        setField(term2053, term2053.getClass(), "encoding", "AijpHYOFuy");
        setField(term2053, term2053.getClass(), "globalPaxHeaders", term2133);
        setByteElement(term2143, 0, (byte) -63);
        setByteElement(term2143, 1, (byte) 15);
        setByteElement(term2143, 2, (byte) 45);
        setByteElement(term2143, 3, (byte) -39);
        setByteElement(term2143, 4, (byte) -20);
        setField(term2053, term2053.getClass(), "SINGLE", term2143);
        setLongField(term2053, term2053.getClass(), "bytesRead", 2062173786000223358L);
        Class<? extends Object> term16669 = Class.forName((String) "java.io.File$PathStatus");
        Field term16668 = ((Class) term16669).getDeclaredField((String) "CHECKED");
        ((Field) term16668).setAccessible(true);
        Object enum43 = ((Field) term16668).get((Object) null);
        HashMap term16455 = new HashMap();
        term16433 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term16434 = (byte[]) newByteArray(5);
        Object term16435 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term16448 = newInstance(Class.forName("java.io.File"));
        byte[] term16456 = (byte[]) newByteArray(5);
        setByteElement(term16434, 0, (byte) -126);
        setByteElement(term16434, 1, (byte) -91);
        setByteElement(term16434, 2, (byte) -104);
        setByteElement(term16434, 3, (byte) -89);
        setByteElement(term16434, 4, (byte) 13);
        setField(term16433, term16433.getClass(), "SMALL_BUF", term16434);
        setIntField(term16433, term16433.getClass(), "recordSize", -14890619);
        setIntField(term16433, term16433.getClass(), "blockSize", 1632125673);
        setBooleanField(term16433, term16433.getClass(), "hasHitEOF", true);
        setLongField(term16433, term16433.getClass(), "entrySize", 3825396310311739952L);
        setLongField(term16433, term16433.getClass(), "entryOffset", -3838084482494604218L);
        setField(term16433, term16433.getClass(), "is", null);
        setField(term16435, term16435.getClass(), "name", "");
        setBooleanField(term16435, term16435.getClass(), "preserveLeadingSlashes", true);
        setIntField(term16435, term16435.getClass(), "mode", 454281060);
        setLongField(term16435, term16435.getClass(), "userId", 3892018155439224435L);
        setLongField(term16435, term16435.getClass(), "groupId", 5953383087795962419L);
        setLongField(term16435, term16435.getClass(), "size", 7994303628307559416L);
        setLongField(term16435, term16435.getClass(), "modTime", 2443640364875054177L);
        setBooleanField(term16435, term16435.getClass(), "checkSumOK", false);
        setByteField(term16435, term16435.getClass(), "linkFlag", (byte) 44);
        setField(term16435, term16435.getClass(), "linkName", "");
        setField(term16435, term16435.getClass(), "magic", "ustar ");
        setField(term16435, term16435.getClass(), "version", "00");
        setField(term16435, term16435.getClass(), "userName", "root");
        setField(term16435, term16435.getClass(), "groupName", "");
        setIntField(term16435, term16435.getClass(), "devMajor", -1786399638);
        setIntField(term16435, term16435.getClass(), "devMinor", 2055867847);
        setBooleanField(term16435, term16435.getClass(), "isExtended", true);
        setLongField(term16435, term16435.getClass(), "realSize", -1610676979013636850L);
        setBooleanField(term16435, term16435.getClass(), "paxGNUSparse", true);
        setBooleanField(term16435, term16435.getClass(), "starSparse", true);
        setField(term16448, term16448.getClass(), "path", "dWRymuLBtr");
        setField(term16448, term16448.getClass(), "status", enum43);
        setIntField(term16448, term16448.getClass(), "prefixLength", -1048298087);
        setField(term16448, term16448.getClass(), "filePath", null);
        setField(term16435, term16435.getClass(), "file", term16448);
        setField(term16433, term16433.getClass(), "currEntry", term16435);
        setField(term16433, term16433.getClass(), "zipEncoding", null);
        setField(term16433, term16433.getClass(), "encoding", "AijpHYOFuy");
        setField(term16433, term16433.getClass(), "globalPaxHeaders", term16455);
        setByteElement(term16456, 0, (byte) -63);
        setByteElement(term16456, 1, (byte) 15);
        setByteElement(term16456, 2, (byte) 45);
        setByteElement(term16456, 3, (byte) -39);
        setByteElement(term16456, 4, (byte) -20);
        setField(term16433, term16433.getClass(), "SINGLE", term16456);
        setLongField(term16433, term16433.getClass(), "bytesRead", 2062173786000223358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term2053, args);
        assertTrue(recursiveEquals(term2053, term16433));
        assertTrue(recursiveEquals(retValue, null));
    }

};


