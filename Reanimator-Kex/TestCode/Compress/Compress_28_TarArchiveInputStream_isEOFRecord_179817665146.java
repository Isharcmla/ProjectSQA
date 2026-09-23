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

public class TarArchiveInputStream_isEOFRecord_179817665146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2286;
     Object term2355;
     Object term14915;
     Object term14936;

    public TarArchiveInputStream_isEOFRecord_179817665146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14966 = Class.forName((String) "java.io.File$PathStatus");
        Field term14965 = ((Class) term14966).getDeclaredField((String) "INVALID");
        ((Field) term14965).setAccessible(true);
        Object enum38 = ((Field) term14965).get((Object) null);
        term2286 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2287 = (byte[]) newByteArray(6);
        Object term2299 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2335 = newInstance(Class.forName("java.io.File"));
        byte[] term2352 = (byte[]) newByteArray(1);
        setByteElement(term2287, 0, (byte) 35);
        setByteElement(term2287, 1, (byte) 66);
        setByteElement(term2287, 2, (byte) 123);
        setByteElement(term2287, 3, (byte) -5);
        setByteElement(term2287, 4, (byte) 84);
        setByteElement(term2287, 5, (byte) -97);
        setField(term2286, term2286.getClass(), "SMALL_BUF", term2287);
        setIntField(term2286, term2286.getClass(), "recordSize", 1375330971);
        setIntField(term2286, term2286.getClass(), "blockSize", -478195677);
        setBooleanField(term2286, term2286.getClass(), "hasHitEOF", false);
        setLongField(term2286, term2286.getClass(), "entrySize", -1468719814009985452L);
        setLongField(term2286, term2286.getClass(), "entryOffset", -7738503207562305297L);
        setField(term2286, term2286.getClass(), "is", null);
        setField(term2299, term2299.getClass(), "name", "");
        setIntField(term2299, term2299.getClass(), "mode", 972867650);
        setIntField(term2299, term2299.getClass(), "userId", 1655935355);
        setIntField(term2299, term2299.getClass(), "groupId", -481533957);
        setLongField(term2299, term2299.getClass(), "size", 3825396310311739952L);
        setLongField(term2299, term2299.getClass(), "modTime", -3838084482494604218L);
        setBooleanField(term2299, term2299.getClass(), "checkSumOK", true);
        setByteField(term2299, term2299.getClass(), "linkFlag", (byte) -24);
        setField(term2299, term2299.getClass(), "linkName", "");
        setField(term2299, term2299.getClass(), "magic", "ustar ");
        setField(term2299, term2299.getClass(), "version", "00");
        setField(term2299, term2299.getClass(), "userName", "root");
        setField(term2299, term2299.getClass(), "groupName", "");
        setIntField(term2299, term2299.getClass(), "devMajor", 1240914516);
        setIntField(term2299, term2299.getClass(), "devMinor", -1465035361);
        setBooleanField(term2299, term2299.getClass(), "isExtended", true);
        setLongField(term2299, term2299.getClass(), "realSize", 3892018155439224435L);
        setField(term2335, term2335.getClass(), "path", "MxlszYVzRf");
        setField(term2335, term2335.getClass(), "status", enum38);
        setIntField(term2335, term2335.getClass(), "prefixLength", 1090617576);
        setField(term2335, term2335.getClass(), "filePath", null);
        setField(term2299, term2299.getClass(), "file", term2335);
        setField(term2286, term2286.getClass(), "currEntry", term2299);
        setField(term2286, term2286.getClass(), "encoding", null);
        setByteElement(term2352, 0, (byte) 88);
        setField(term2286, term2286.getClass(), "SINGLE", term2352);
        setLongField(term2286, term2286.getClass(), "bytesRead", 5953383087795962419L);
        term2355 = (byte[]) newByteArray(1);
        setByteElement(term2355, 0, (byte) 96);
        Class<? extends Object> term15139 = Class.forName((String) "java.io.File$PathStatus");
        Field term15138 = ((Class) term15139).getDeclaredField((String) "CHECKED");
        ((Field) term15138).setAccessible(true);
        Object enum39 = ((Field) term15138).get((Object) null);
        term14915 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term14916 = (byte[]) newByteArray(6);
        Object term14917 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14930 = newInstance(Class.forName("java.io.File"));
        byte[] term14935 = (byte[]) newByteArray(1);
        setByteElement(term14916, 0, (byte) 35);
        setByteElement(term14916, 1, (byte) 66);
        setByteElement(term14916, 2, (byte) 123);
        setByteElement(term14916, 3, (byte) -5);
        setByteElement(term14916, 4, (byte) 84);
        setByteElement(term14916, 5, (byte) -97);
        setField(term14915, term14915.getClass(), "SMALL_BUF", term14916);
        setIntField(term14915, term14915.getClass(), "recordSize", 1375330971);
        setIntField(term14915, term14915.getClass(), "blockSize", -478195677);
        setBooleanField(term14915, term14915.getClass(), "hasHitEOF", false);
        setLongField(term14915, term14915.getClass(), "entrySize", -1468719814009985452L);
        setLongField(term14915, term14915.getClass(), "entryOffset", -7738503207562305297L);
        setField(term14915, term14915.getClass(), "is", null);
        setField(term14917, term14917.getClass(), "name", "");
        setIntField(term14917, term14917.getClass(), "mode", 972867650);
        setIntField(term14917, term14917.getClass(), "userId", 1655935355);
        setIntField(term14917, term14917.getClass(), "groupId", -481533957);
        setLongField(term14917, term14917.getClass(), "size", 3825396310311739952L);
        setLongField(term14917, term14917.getClass(), "modTime", -3838084482494604218L);
        setBooleanField(term14917, term14917.getClass(), "checkSumOK", true);
        setByteField(term14917, term14917.getClass(), "linkFlag", (byte) -24);
        setField(term14917, term14917.getClass(), "linkName", "");
        setField(term14917, term14917.getClass(), "magic", "ustar ");
        setField(term14917, term14917.getClass(), "version", "00");
        setField(term14917, term14917.getClass(), "userName", "root");
        setField(term14917, term14917.getClass(), "groupName", "");
        setIntField(term14917, term14917.getClass(), "devMajor", 1240914516);
        setIntField(term14917, term14917.getClass(), "devMinor", -1465035361);
        setBooleanField(term14917, term14917.getClass(), "isExtended", true);
        setLongField(term14917, term14917.getClass(), "realSize", 3892018155439224435L);
        setField(term14930, term14930.getClass(), "path", "MxlszYVzRf");
        setField(term14930, term14930.getClass(), "status", enum39);
        setIntField(term14930, term14930.getClass(), "prefixLength", 1090617576);
        setField(term14930, term14930.getClass(), "filePath", null);
        setField(term14917, term14917.getClass(), "file", term14930);
        setField(term14915, term14915.getClass(), "currEntry", term14917);
        setField(term14915, term14915.getClass(), "encoding", null);
        setByteElement(term14935, 0, (byte) 88);
        setField(term14915, term14915.getClass(), "SINGLE", term14935);
        setLongField(term14915, term14915.getClass(), "bytesRead", 5953383087795962419L);
        term14936 = (byte[]) newByteArray(1);
        setByteElement(term14936, 0, (byte) 96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2355;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term2286, args);
        assertTrue(recursiveEquals(term2286, term14915));
        assertTrue(recursiveEquals(term2355, term14936));
        assertTrue(recursiveEquals(retValue, false));
    }

};


