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
import java.lang.Integer;

public class TarArchiveInputStream_read_82857799262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6095;
     Object term6188;
     Object term6198;
     Object term6200;
     Object term23224;
     Object term23248;

    public TarArchiveInputStream_read_82857799262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23276 = Class.forName((String) "java.io.File$PathStatus");
        Field term23275 = ((Class) term23276).getDeclaredField((String) "INVALID");
        ((Field) term23275).setAccessible(true);
        Object enum60 = ((Field) term23275).get((Object) null);
        HashMap term6175 = new HashMap();
        term6095 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6096 = (byte[]) newByteArray(5);
        Object term6107 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6146 = newInstance(Class.forName("java.io.File"));
        byte[] term6185 = (byte[]) newByteArray(1);
        setByteElement(term6096, 0, (byte) -63);
        setByteElement(term6096, 1, (byte) 39);
        setByteElement(term6096, 2, (byte) -54);
        setByteElement(term6096, 3, (byte) 9);
        setByteElement(term6096, 4, (byte) 19);
        setField(term6095, term6095.getClass(), "SMALL_BUF", term6096);
        setIntField(term6095, term6095.getClass(), "recordSize", -343325701);
        setIntField(term6095, term6095.getClass(), "blockSize", 107945604);
        setBooleanField(term6095, term6095.getClass(), "hasHitEOF", true);
        setLongField(term6095, term6095.getClass(), "entrySize", 4616440478358528406L);
        setLongField(term6095, term6095.getClass(), "entryOffset", 3427570961451840069L);
        setField(term6095, term6095.getClass(), "is", null);
        setField(term6107, term6107.getClass(), "name", "");
        setBooleanField(term6107, term6107.getClass(), "preserveLeadingSlashes", false);
        setIntField(term6107, term6107.getClass(), "mode", -1963464809);
        setLongField(term6107, term6107.getClass(), "userId", 4502292577098212311L);
        setLongField(term6107, term6107.getClass(), "groupId", -3730936709704460408L);
        setLongField(term6107, term6107.getClass(), "size", -8614778293741404325L);
        setLongField(term6107, term6107.getClass(), "modTime", -5447369594017685765L);
        setBooleanField(term6107, term6107.getClass(), "checkSumOK", false);
        setByteField(term6107, term6107.getClass(), "linkFlag", (byte) -103);
        setField(term6107, term6107.getClass(), "linkName", "");
        setField(term6107, term6107.getClass(), "magic", "ustar ");
        setField(term6107, term6107.getClass(), "version", "00");
        setField(term6107, term6107.getClass(), "userName", "root");
        setField(term6107, term6107.getClass(), "groupName", "");
        setIntField(term6107, term6107.getClass(), "devMajor", 71190297);
        setIntField(term6107, term6107.getClass(), "devMinor", 1202361360);
        setBooleanField(term6107, term6107.getClass(), "isExtended", true);
        setLongField(term6107, term6107.getClass(), "realSize", -5724112525188606013L);
        setBooleanField(term6107, term6107.getClass(), "paxGNUSparse", true);
        setBooleanField(term6107, term6107.getClass(), "starSparse", false);
        setField(term6146, term6146.getClass(), "path", "BKLfkLiZTH");
        setField(term6146, term6146.getClass(), "status", enum60);
        setIntField(term6146, term6146.getClass(), "prefixLength", -2015048153);
        setField(term6146, term6146.getClass(), "filePath", null);
        setField(term6107, term6107.getClass(), "file", term6146);
        setField(term6095, term6095.getClass(), "currEntry", term6107);
        setField(term6095, term6095.getClass(), "zipEncoding", null);
        setField(term6095, term6095.getClass(), "encoding", "SPpkrGcPRr");
        setField(term6095, term6095.getClass(), "globalPaxHeaders", term6175);
        setByteElement(term6185, 0, (byte) 61);
        setField(term6095, term6095.getClass(), "SINGLE", term6185);
        setLongField(term6095, term6095.getClass(), "bytesRead", -6100012593724108983L);
        term6188 = (byte[]) newByteArray(9);
        setByteElement(term6188, 0, (byte) -90);
        setByteElement(term6188, 1, (byte) -27);
        setByteElement(term6188, 2, (byte) 119);
        setByteElement(term6188, 3, (byte) -125);
        setByteElement(term6188, 4, (byte) 100);
        setByteElement(term6188, 5, (byte) -1);
        setByteElement(term6188, 6, (byte) -127);
        setByteElement(term6188, 7, (byte) -118);
        setByteElement(term6188, 8, (byte) 69);
        term6198 = new Integer(-2063457669);
        term6200 = new Integer(-1222006000);
        Class<? extends Object> term23466 = Class.forName((String) "java.io.File$PathStatus");
        Field term23465 = ((Class) term23466).getDeclaredField((String) "INVALID");
        ((Field) term23465).setAccessible(true);
        Object enum61 = ((Field) term23465).get((Object) null);
        HashMap term23246 = new HashMap();
        term23224 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23225 = (byte[]) newByteArray(5);
        Object term23226 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23239 = newInstance(Class.forName("java.io.File"));
        byte[] term23247 = (byte[]) newByteArray(1);
        setByteElement(term23225, 0, (byte) -63);
        setByteElement(term23225, 1, (byte) 39);
        setByteElement(term23225, 2, (byte) -54);
        setByteElement(term23225, 3, (byte) 9);
        setByteElement(term23225, 4, (byte) 19);
        setField(term23224, term23224.getClass(), "SMALL_BUF", term23225);
        setIntField(term23224, term23224.getClass(), "recordSize", -343325701);
        setIntField(term23224, term23224.getClass(), "blockSize", 107945604);
        setBooleanField(term23224, term23224.getClass(), "hasHitEOF", true);
        setLongField(term23224, term23224.getClass(), "entrySize", 4616440478358528406L);
        setLongField(term23224, term23224.getClass(), "entryOffset", 3427570961451840069L);
        setField(term23224, term23224.getClass(), "is", null);
        setField(term23226, term23226.getClass(), "name", "");
        setBooleanField(term23226, term23226.getClass(), "preserveLeadingSlashes", false);
        setIntField(term23226, term23226.getClass(), "mode", -1963464809);
        setLongField(term23226, term23226.getClass(), "userId", 4502292577098212311L);
        setLongField(term23226, term23226.getClass(), "groupId", -3730936709704460408L);
        setLongField(term23226, term23226.getClass(), "size", -8614778293741404325L);
        setLongField(term23226, term23226.getClass(), "modTime", -5447369594017685765L);
        setBooleanField(term23226, term23226.getClass(), "checkSumOK", false);
        setByteField(term23226, term23226.getClass(), "linkFlag", (byte) -103);
        setField(term23226, term23226.getClass(), "linkName", "");
        setField(term23226, term23226.getClass(), "magic", "ustar ");
        setField(term23226, term23226.getClass(), "version", "00");
        setField(term23226, term23226.getClass(), "userName", "root");
        setField(term23226, term23226.getClass(), "groupName", "");
        setIntField(term23226, term23226.getClass(), "devMajor", 71190297);
        setIntField(term23226, term23226.getClass(), "devMinor", 1202361360);
        setBooleanField(term23226, term23226.getClass(), "isExtended", true);
        setLongField(term23226, term23226.getClass(), "realSize", -5724112525188606013L);
        setBooleanField(term23226, term23226.getClass(), "paxGNUSparse", true);
        setBooleanField(term23226, term23226.getClass(), "starSparse", false);
        setField(term23239, term23239.getClass(), "path", "BKLfkLiZTH");
        setField(term23239, term23239.getClass(), "status", enum61);
        setIntField(term23239, term23239.getClass(), "prefixLength", -2015048153);
        setField(term23239, term23239.getClass(), "filePath", null);
        setField(term23226, term23226.getClass(), "file", term23239);
        setField(term23224, term23224.getClass(), "currEntry", term23226);
        setField(term23224, term23224.getClass(), "zipEncoding", null);
        setField(term23224, term23224.getClass(), "encoding", "SPpkrGcPRr");
        setField(term23224, term23224.getClass(), "globalPaxHeaders", term23246);
        setByteElement(term23247, 0, (byte) 61);
        setField(term23224, term23224.getClass(), "SINGLE", term23247);
        setLongField(term23224, term23224.getClass(), "bytesRead", -6100012593724108983L);
        term23248 = (byte[]) newByteArray(9);
        setByteElement(term23248, 0, (byte) -90);
        setByteElement(term23248, 1, (byte) -27);
        setByteElement(term23248, 2, (byte) 119);
        setByteElement(term23248, 3, (byte) -125);
        setByteElement(term23248, 4, (byte) 100);
        setByteElement(term23248, 5, (byte) -1);
        setByteElement(term23248, 6, (byte) -127);
        setByteElement(term23248, 7, (byte) -118);
        setByteElement(term23248, 8, (byte) 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6188;
        args[1] = term6198;
        args[2] = term6200;
        Object retValue = callMethod(klass, "read", argTypes, term6095, args);
        assertTrue(recursiveEquals(term6095, term23224));
        assertTrue(recursiveEquals(term6188, term23248));
        assertTrue(recursiveEquals(term6198, -2063457669));
        assertTrue(recursiveEquals(term6200, -1222006000));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


