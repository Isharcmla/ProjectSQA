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

public class TarArchiveInputStream_getCurrentEntry_167345573460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5799;
     Object term22077;
     Object term21986;

    public TarArchiveInputStream_getCurrentEntry_167345573460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22125 = Class.forName((String) "java.io.File$PathStatus");
        Field term22124 = ((Class) term22125).getDeclaredField((String) "INVALID");
        ((Field) term22124).setAccessible(true);
        Object enum58 = ((Field) term22124).get((Object) null);
        term5799 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5800 = (byte[]) newByteArray(2);
        Object term5808 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5844 = newInstance(Class.forName("java.io.File"));
        byte[] term5873 = (byte[]) newByteArray(7);
        setByteElement(term5800, 0, (byte) 103);
        setByteElement(term5800, 1, (byte) -63);
        setField(term5799, term5799.getClass(), "SMALL_BUF", term5800);
        setIntField(term5799, term5799.getClass(), "recordSize", -1963464809);
        setIntField(term5799, term5799.getClass(), "blockSize", 71190297);
        setBooleanField(term5799, term5799.getClass(), "hasHitEOF", true);
        setLongField(term5799, term5799.getClass(), "entrySize", 4616440478358528406L);
        setLongField(term5799, term5799.getClass(), "entryOffset", 3427570961451840069L);
        setField(term5799, term5799.getClass(), "is", null);
        setField(term5808, term5808.getClass(), "name", "");
        setIntField(term5808, term5808.getClass(), "mode", 1202361360);
        setLongField(term5808, term5808.getClass(), "userId", 4502292577098212311L);
        setLongField(term5808, term5808.getClass(), "groupId", -3730936709704460408L);
        setLongField(term5808, term5808.getClass(), "size", -8614778293741404325L);
        setLongField(term5808, term5808.getClass(), "modTime", -5447369594017685765L);
        setBooleanField(term5808, term5808.getClass(), "checkSumOK", false);
        setByteField(term5808, term5808.getClass(), "linkFlag", (byte) 39);
        setField(term5808, term5808.getClass(), "linkName", "");
        setField(term5808, term5808.getClass(), "magic", "ustar ");
        setField(term5808, term5808.getClass(), "version", "00");
        setField(term5808, term5808.getClass(), "userName", "root");
        setField(term5808, term5808.getClass(), "groupName", "");
        setIntField(term5808, term5808.getClass(), "devMajor", -2015048153);
        setIntField(term5808, term5808.getClass(), "devMinor", -2063457669);
        setBooleanField(term5808, term5808.getClass(), "isExtended", false);
        setLongField(term5808, term5808.getClass(), "realSize", -5724112525188606013L);
        setField(term5844, term5844.getClass(), "path", "YRHGsAkhxb");
        setField(term5844, term5844.getClass(), "status", enum58);
        setIntField(term5844, term5844.getClass(), "prefixLength", -1222006000);
        setField(term5844, term5844.getClass(), "filePath", null);
        setField(term5808, term5808.getClass(), "file", term5844);
        setField(term5799, term5799.getClass(), "currEntry", term5808);
        setField(term5799, term5799.getClass(), "zipEncoding", null);
        setField(term5799, term5799.getClass(), "encoding", "ffYhPOzlUs");
        setByteElement(term5873, 0, (byte) -54);
        setByteElement(term5873, 1, (byte) 9);
        setByteElement(term5873, 2, (byte) 19);
        setByteElement(term5873, 3, (byte) -103);
        setByteElement(term5873, 4, (byte) 61);
        setByteElement(term5873, 5, (byte) -90);
        setByteElement(term5873, 6, (byte) -27);
        setField(term5799, term5799.getClass(), "SINGLE", term5873);
        setLongField(term5799, term5799.getClass(), "bytesRead", -6100012593724108983L);
        Class<? extends Object> term22309 = Class.forName((String) "java.io.File$PathStatus");
        Field term22308 = ((Class) term22309).getDeclaredField((String) "INVALID");
        ((Field) term22308).setAccessible(true);
        Object enum59 = ((Field) term22308).get((Object) null);
        term22077 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term22078 = (byte[]) newByteArray(2);
        Object term22079 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22092 = newInstance(Class.forName("java.io.File"));
        byte[] term22100 = (byte[]) newByteArray(7);
        setByteElement(term22078, 0, (byte) 103);
        setByteElement(term22078, 1, (byte) -63);
        setField(term22077, term22077.getClass(), "SMALL_BUF", term22078);
        setIntField(term22077, term22077.getClass(), "recordSize", -1963464809);
        setIntField(term22077, term22077.getClass(), "blockSize", 71190297);
        setBooleanField(term22077, term22077.getClass(), "hasHitEOF", true);
        setLongField(term22077, term22077.getClass(), "entrySize", 4616440478358528406L);
        setLongField(term22077, term22077.getClass(), "entryOffset", 3427570961451840069L);
        setField(term22077, term22077.getClass(), "is", null);
        setField(term22079, term22079.getClass(), "name", "");
        setIntField(term22079, term22079.getClass(), "mode", 1202361360);
        setLongField(term22079, term22079.getClass(), "userId", 4502292577098212311L);
        setLongField(term22079, term22079.getClass(), "groupId", -3730936709704460408L);
        setLongField(term22079, term22079.getClass(), "size", -8614778293741404325L);
        setLongField(term22079, term22079.getClass(), "modTime", -5447369594017685765L);
        setBooleanField(term22079, term22079.getClass(), "checkSumOK", false);
        setByteField(term22079, term22079.getClass(), "linkFlag", (byte) 39);
        setField(term22079, term22079.getClass(), "linkName", "");
        setField(term22079, term22079.getClass(), "magic", "ustar ");
        setField(term22079, term22079.getClass(), "version", "00");
        setField(term22079, term22079.getClass(), "userName", "root");
        setField(term22079, term22079.getClass(), "groupName", "");
        setIntField(term22079, term22079.getClass(), "devMajor", -2015048153);
        setIntField(term22079, term22079.getClass(), "devMinor", -2063457669);
        setBooleanField(term22079, term22079.getClass(), "isExtended", false);
        setLongField(term22079, term22079.getClass(), "realSize", -5724112525188606013L);
        setField(term22092, term22092.getClass(), "path", "YRHGsAkhxb");
        setField(term22092, term22092.getClass(), "status", enum59);
        setIntField(term22092, term22092.getClass(), "prefixLength", -1222006000);
        setField(term22092, term22092.getClass(), "filePath", null);
        setField(term22079, term22079.getClass(), "file", term22092);
        setField(term22077, term22077.getClass(), "currEntry", term22079);
        setField(term22077, term22077.getClass(), "zipEncoding", null);
        setField(term22077, term22077.getClass(), "encoding", "ffYhPOzlUs");
        setByteElement(term22100, 0, (byte) -54);
        setByteElement(term22100, 1, (byte) 9);
        setByteElement(term22100, 2, (byte) 19);
        setByteElement(term22100, 3, (byte) -103);
        setByteElement(term22100, 4, (byte) 61);
        setByteElement(term22100, 5, (byte) -90);
        setByteElement(term22100, 6, (byte) -27);
        setField(term22077, term22077.getClass(), "SINGLE", term22100);
        setLongField(term22077, term22077.getClass(), "bytesRead", -6100012593724108983L);
        Class<? extends Object> term22491 = Class.forName((String) "java.io.File$PathStatus");
        Field term22490 = ((Class) term22491).getDeclaredField((String) "INVALID");
        ((Field) term22490).setAccessible(true);
        Object enum60 = ((Field) term22490).get((Object) null);
        term21986 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22022 = newInstance(Class.forName("java.io.File"));
        setField(term21986, term21986.getClass(), "name", "");
        setIntField(term21986, term21986.getClass(), "mode", 1202361360);
        setLongField(term21986, term21986.getClass(), "userId", 4502292577098212311L);
        setLongField(term21986, term21986.getClass(), "groupId", -3730936709704460408L);
        setLongField(term21986, term21986.getClass(), "size", -8614778293741404325L);
        setLongField(term21986, term21986.getClass(), "modTime", -5447369594017685765L);
        setBooleanField(term21986, term21986.getClass(), "checkSumOK", false);
        setByteField(term21986, term21986.getClass(), "linkFlag", (byte) 39);
        setField(term21986, term21986.getClass(), "linkName", "");
        setField(term21986, term21986.getClass(), "magic", "ustar ");
        setField(term21986, term21986.getClass(), "version", "00");
        setField(term21986, term21986.getClass(), "userName", "root");
        setField(term21986, term21986.getClass(), "groupName", "");
        setIntField(term21986, term21986.getClass(), "devMajor", -2015048153);
        setIntField(term21986, term21986.getClass(), "devMinor", -2063457669);
        setBooleanField(term21986, term21986.getClass(), "isExtended", false);
        setLongField(term21986, term21986.getClass(), "realSize", -5724112525188606013L);
        setField(term22022, term22022.getClass(), "path", "YRHGsAkhxb");
        setField(term22022, term22022.getClass(), "status", enum60);
        setIntField(term22022, term22022.getClass(), "prefixLength", -1222006000);
        setField(term22022, term22022.getClass(), "filePath", null);
        setField(term21986, term21986.getClass(), "file", term22022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentEntry", argTypes, term5799, args);
        assertTrue(recursiveEquals(term5799, term22077));
        assertTrue(recursiveEquals(retValue, term21986));
    }

};


