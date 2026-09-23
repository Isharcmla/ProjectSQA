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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getLongNameData_191206871148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;

    public TarArchiveInputStream_getLongNameData_191206871148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15583 = Class.forName((String) "java.io.File$PathStatus");
        Field term15582 = ((Class) term15583).getDeclaredField((String) "CHECKED");
        ((Field) term15582).setAccessible(true);
        Object enum42 = ((Field) term15582).get((Object) null);
        term2288 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2289 = (byte[]) newByteArray(6);
        Object term2301 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2337 = newInstance(Class.forName("java.io.File"));
        byte[] term2354 = (byte[]) newByteArray(1);
        setByteElement(term2289, 0, (byte) 35);
        setByteElement(term2289, 1, (byte) 66);
        setByteElement(term2289, 2, (byte) 123);
        setByteElement(term2289, 3, (byte) -5);
        setByteElement(term2289, 4, (byte) 84);
        setByteElement(term2289, 5, (byte) -97);
        setField(term2288, term2288.getClass(), "SMALL_BUF", term2289);
        setIntField(term2288, term2288.getClass(), "recordSize", -478195677);
        setIntField(term2288, term2288.getClass(), "blockSize", 972867650);
        setBooleanField(term2288, term2288.getClass(), "hasHitEOF", false);
        setLongField(term2288, term2288.getClass(), "entrySize", -1468719814009985452L);
        setLongField(term2288, term2288.getClass(), "entryOffset", -7738503207562305297L);
        setField(term2288, term2288.getClass(), "is", null);
        setField(term2301, term2301.getClass(), "name", "");
        setIntField(term2301, term2301.getClass(), "mode", 1655935355);
        setIntField(term2301, term2301.getClass(), "userId", -481533957);
        setIntField(term2301, term2301.getClass(), "groupId", 1240914516);
        setLongField(term2301, term2301.getClass(), "size", 3825396310311739952L);
        setLongField(term2301, term2301.getClass(), "modTime", -3838084482494604218L);
        setBooleanField(term2301, term2301.getClass(), "checkSumOK", true);
        setByteField(term2301, term2301.getClass(), "linkFlag", (byte) -24);
        setField(term2301, term2301.getClass(), "linkName", "");
        setField(term2301, term2301.getClass(), "magic", "ustar ");
        setField(term2301, term2301.getClass(), "version", "00");
        setField(term2301, term2301.getClass(), "userName", "root");
        setField(term2301, term2301.getClass(), "groupName", "");
        setIntField(term2301, term2301.getClass(), "devMajor", -1465035361);
        setIntField(term2301, term2301.getClass(), "devMinor", 1090617576);
        setBooleanField(term2301, term2301.getClass(), "isExtended", true);
        setLongField(term2301, term2301.getClass(), "realSize", 3892018155439224435L);
        setField(term2337, term2337.getClass(), "path", "MxlszYVzRf");
        setField(term2337, term2337.getClass(), "status", enum42);
        setIntField(term2337, term2337.getClass(), "prefixLength", -1547384488);
        setField(term2337, term2337.getClass(), "filePath", null);
        setField(term2301, term2301.getClass(), "file", term2337);
        setField(term2288, term2288.getClass(), "currEntry", term2301);
        setField(term2288, term2288.getClass(), "zipEncoding", null);
        setByteElement(term2354, 0, (byte) 88);
        setField(term2288, term2288.getClass(), "SINGLE", term2354);
        setLongField(term2288, term2288.getClass(), "bytesRead", 5953383087795962419L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLongNameData", argTypes, term2288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


