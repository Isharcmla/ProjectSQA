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
     Object term1962;
     Object term14752;

    public TarArchiveInputStream_getNextTarEntry_13546697946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14802 = Class.forName((String) "java.io.File$PathStatus");
        Field term14801 = ((Class) term14802).getDeclaredField((String) "CHECKED");
        ((Field) term14801).setAccessible(true);
        Object enum38 = ((Field) term14801).get((Object) null);
        term1962 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1963 = (byte[]) newByteArray(5);
        Object term1974 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2010 = newInstance(Class.forName("java.io.File"));
        byte[] term2039 = (byte[]) newByteArray(5);
        setByteElement(term1963, 0, (byte) -126);
        setByteElement(term1963, 1, (byte) -91);
        setByteElement(term1963, 2, (byte) -104);
        setByteElement(term1963, 3, (byte) -89);
        setByteElement(term1963, 4, (byte) 13);
        setField(term1962, term1962.getClass(), "SMALL_BUF", term1963);
        setIntField(term1962, term1962.getClass(), "recordSize", -14890619);
        setIntField(term1962, term1962.getClass(), "blockSize", 1632125673);
        setBooleanField(term1962, term1962.getClass(), "hasHitEOF", true);
        setLongField(term1962, term1962.getClass(), "entrySize", 3825396310311739952L);
        setLongField(term1962, term1962.getClass(), "entryOffset", -3838084482494604218L);
        setField(term1962, term1962.getClass(), "is", null);
        setField(term1974, term1974.getClass(), "name", "");
        setIntField(term1974, term1974.getClass(), "mode", 454281060);
        setLongField(term1974, term1974.getClass(), "userId", 3892018155439224435L);
        setLongField(term1974, term1974.getClass(), "groupId", 5953383087795962419L);
        setLongField(term1974, term1974.getClass(), "size", 7994303628307559416L);
        setLongField(term1974, term1974.getClass(), "modTime", 2443640364875054177L);
        setBooleanField(term1974, term1974.getClass(), "checkSumOK", true);
        setByteField(term1974, term1974.getClass(), "linkFlag", (byte) 44);
        setField(term1974, term1974.getClass(), "linkName", "");
        setField(term1974, term1974.getClass(), "magic", "ustar ");
        setField(term1974, term1974.getClass(), "version", "00");
        setField(term1974, term1974.getClass(), "userName", "root");
        setField(term1974, term1974.getClass(), "groupName", "");
        setIntField(term1974, term1974.getClass(), "devMajor", -1786399638);
        setIntField(term1974, term1974.getClass(), "devMinor", 2055867847);
        setBooleanField(term1974, term1974.getClass(), "isExtended", true);
        setLongField(term1974, term1974.getClass(), "realSize", -1610676979013636850L);
        setField(term2010, term2010.getClass(), "path", "tbcdzjIfER");
        setField(term2010, term2010.getClass(), "status", enum38);
        setIntField(term2010, term2010.getClass(), "prefixLength", -1048298087);
        setField(term2010, term2010.getClass(), "filePath", null);
        setField(term1974, term1974.getClass(), "file", term2010);
        setField(term1962, term1962.getClass(), "currEntry", term1974);
        setField(term1962, term1962.getClass(), "zipEncoding", null);
        setField(term1962, term1962.getClass(), "encoding", "HyxfbSQYBe");
        setByteElement(term2039, 0, (byte) -63);
        setByteElement(term2039, 1, (byte) 15);
        setByteElement(term2039, 2, (byte) 45);
        setByteElement(term2039, 3, (byte) -39);
        setByteElement(term2039, 4, (byte) -20);
        setField(term1962, term1962.getClass(), "SINGLE", term2039);
        setLongField(term1962, term1962.getClass(), "bytesRead", 2062173786000223358L);
        Class<? extends Object> term14987 = Class.forName((String) "java.io.File$PathStatus");
        Field term14986 = ((Class) term14987).getDeclaredField((String) "CHECKED");
        ((Field) term14986).setAccessible(true);
        Object enum39 = ((Field) term14986).get((Object) null);
        term14752 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term14753 = (byte[]) newByteArray(5);
        Object term14754 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14767 = newInstance(Class.forName("java.io.File"));
        byte[] term14774 = (byte[]) newByteArray(5);
        setByteElement(term14753, 0, (byte) -126);
        setByteElement(term14753, 1, (byte) -91);
        setByteElement(term14753, 2, (byte) -104);
        setByteElement(term14753, 3, (byte) -89);
        setByteElement(term14753, 4, (byte) 13);
        setField(term14752, term14752.getClass(), "SMALL_BUF", term14753);
        setIntField(term14752, term14752.getClass(), "recordSize", -14890619);
        setIntField(term14752, term14752.getClass(), "blockSize", 1632125673);
        setBooleanField(term14752, term14752.getClass(), "hasHitEOF", true);
        setLongField(term14752, term14752.getClass(), "entrySize", 3825396310311739952L);
        setLongField(term14752, term14752.getClass(), "entryOffset", -3838084482494604218L);
        setField(term14752, term14752.getClass(), "is", null);
        setField(term14754, term14754.getClass(), "name", "");
        setIntField(term14754, term14754.getClass(), "mode", 454281060);
        setLongField(term14754, term14754.getClass(), "userId", 3892018155439224435L);
        setLongField(term14754, term14754.getClass(), "groupId", 5953383087795962419L);
        setLongField(term14754, term14754.getClass(), "size", 7994303628307559416L);
        setLongField(term14754, term14754.getClass(), "modTime", 2443640364875054177L);
        setBooleanField(term14754, term14754.getClass(), "checkSumOK", true);
        setByteField(term14754, term14754.getClass(), "linkFlag", (byte) 44);
        setField(term14754, term14754.getClass(), "linkName", "");
        setField(term14754, term14754.getClass(), "magic", "ustar ");
        setField(term14754, term14754.getClass(), "version", "00");
        setField(term14754, term14754.getClass(), "userName", "root");
        setField(term14754, term14754.getClass(), "groupName", "");
        setIntField(term14754, term14754.getClass(), "devMajor", -1786399638);
        setIntField(term14754, term14754.getClass(), "devMinor", 2055867847);
        setBooleanField(term14754, term14754.getClass(), "isExtended", true);
        setLongField(term14754, term14754.getClass(), "realSize", -1610676979013636850L);
        setField(term14767, term14767.getClass(), "path", "tbcdzjIfER");
        setField(term14767, term14767.getClass(), "status", enum39);
        setIntField(term14767, term14767.getClass(), "prefixLength", -1048298087);
        setField(term14767, term14767.getClass(), "filePath", null);
        setField(term14754, term14754.getClass(), "file", term14767);
        setField(term14752, term14752.getClass(), "currEntry", term14754);
        setField(term14752, term14752.getClass(), "zipEncoding", null);
        setField(term14752, term14752.getClass(), "encoding", "HyxfbSQYBe");
        setByteElement(term14774, 0, (byte) -63);
        setByteElement(term14774, 1, (byte) 15);
        setByteElement(term14774, 2, (byte) 45);
        setByteElement(term14774, 3, (byte) -39);
        setByteElement(term14774, 4, (byte) -20);
        setField(term14752, term14752.getClass(), "SINGLE", term14774);
        setLongField(term14752, term14752.getClass(), "bytesRead", 2062173786000223358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term1962, args);
        assertTrue(recursiveEquals(term1962, term14752));
        assertTrue(recursiveEquals(retValue, null));
    }

};


