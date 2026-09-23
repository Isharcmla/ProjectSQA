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

public class TarArchiveInputStream_isAtEOF_46325739962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5889;
     Object term22130;

    public TarArchiveInputStream_isAtEOF_46325739962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22179 = Class.forName((String) "java.io.File$PathStatus");
        Field term22178 = ((Class) term22179).getDeclaredField((String) "INVALID");
        ((Field) term22178).setAccessible(true);
        Object enum64 = ((Field) term22178).get((Object) null);
        term5889 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5890 = (byte[]) newByteArray(6);
        Object term5902 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5938 = newInstance(Class.forName("java.io.File"));
        byte[] term5955 = (byte[]) newByteArray(7);
        setByteElement(term5890, 0, (byte) 69);
        setByteElement(term5890, 1, (byte) 112);
        setByteElement(term5890, 2, (byte) 77);
        setByteElement(term5890, 3, (byte) -1);
        setByteElement(term5890, 4, (byte) -83);
        setByteElement(term5890, 5, (byte) -63);
        setField(term5889, term5889.getClass(), "SMALL_BUF", term5890);
        setIntField(term5889, term5889.getClass(), "recordSize", -1667990367);
        setIntField(term5889, term5889.getClass(), "blockSize", -1214628358);
        setBooleanField(term5889, term5889.getClass(), "hasHitEOF", false);
        setLongField(term5889, term5889.getClass(), "entrySize", -2924531382671518368L);
        setLongField(term5889, term5889.getClass(), "entryOffset", -3948863953565024517L);
        setField(term5889, term5889.getClass(), "is", null);
        setField(term5902, term5902.getClass(), "name", "");
        setIntField(term5902, term5902.getClass(), "mode", 1102721075);
        setIntField(term5902, term5902.getClass(), "userId", -426764678);
        setIntField(term5902, term5902.getClass(), "groupId", -1222614956);
        setLongField(term5902, term5902.getClass(), "size", -6587807377747738663L);
        setLongField(term5902, term5902.getClass(), "modTime", -6301101997917060727L);
        setBooleanField(term5902, term5902.getClass(), "checkSumOK", false);
        setByteField(term5902, term5902.getClass(), "linkFlag", (byte) 108);
        setField(term5902, term5902.getClass(), "linkName", "");
        setField(term5902, term5902.getClass(), "magic", "ustar ");
        setField(term5902, term5902.getClass(), "version", "00");
        setField(term5902, term5902.getClass(), "userName", "root");
        setField(term5902, term5902.getClass(), "groupName", "");
        setIntField(term5902, term5902.getClass(), "devMajor", -1870495012);
        setIntField(term5902, term5902.getClass(), "devMinor", -1310015129);
        setBooleanField(term5902, term5902.getClass(), "isExtended", false);
        setLongField(term5902, term5902.getClass(), "realSize", 8166095254618543564L);
        setField(term5938, term5938.getClass(), "path", "IDCWpPLRkE");
        setField(term5938, term5938.getClass(), "status", enum64);
        setIntField(term5938, term5938.getClass(), "prefixLength", -2104981311);
        setField(term5938, term5938.getClass(), "filePath", null);
        setField(term5902, term5902.getClass(), "file", term5938);
        setField(term5889, term5889.getClass(), "currEntry", term5902);
        setField(term5889, term5889.getClass(), "zipEncoding", null);
        setByteElement(term5955, 0, (byte) -105);
        setByteElement(term5955, 1, (byte) 33);
        setByteElement(term5955, 2, (byte) 109);
        setByteElement(term5955, 3, (byte) -54);
        setByteElement(term5955, 4, (byte) -85);
        setByteElement(term5955, 5, (byte) 81);
        setByteElement(term5955, 6, (byte) -113);
        setField(term5889, term5889.getClass(), "SINGLE", term5955);
        setLongField(term5889, term5889.getClass(), "bytesRead", -4598158870068953328L);
        Class<? extends Object> term22456 = Class.forName((String) "java.io.File$PathStatus");
        Field term22455 = ((Class) term22456).getDeclaredField((String) "INVALID");
        ((Field) term22455).setAccessible(true);
        Object enum65 = ((Field) term22455).get((Object) null);
        term22130 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term22131 = (byte[]) newByteArray(6);
        Object term22132 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22145 = newInstance(Class.forName("java.io.File"));
        byte[] term22150 = (byte[]) newByteArray(7);
        setByteElement(term22131, 0, (byte) 69);
        setByteElement(term22131, 1, (byte) 112);
        setByteElement(term22131, 2, (byte) 77);
        setByteElement(term22131, 3, (byte) -1);
        setByteElement(term22131, 4, (byte) -83);
        setByteElement(term22131, 5, (byte) -63);
        setField(term22130, term22130.getClass(), "SMALL_BUF", term22131);
        setIntField(term22130, term22130.getClass(), "recordSize", -1667990367);
        setIntField(term22130, term22130.getClass(), "blockSize", -1214628358);
        setBooleanField(term22130, term22130.getClass(), "hasHitEOF", false);
        setLongField(term22130, term22130.getClass(), "entrySize", -2924531382671518368L);
        setLongField(term22130, term22130.getClass(), "entryOffset", -3948863953565024517L);
        setField(term22130, term22130.getClass(), "is", null);
        setField(term22132, term22132.getClass(), "name", "");
        setIntField(term22132, term22132.getClass(), "mode", 1102721075);
        setIntField(term22132, term22132.getClass(), "userId", -426764678);
        setIntField(term22132, term22132.getClass(), "groupId", -1222614956);
        setLongField(term22132, term22132.getClass(), "size", -6587807377747738663L);
        setLongField(term22132, term22132.getClass(), "modTime", -6301101997917060727L);
        setBooleanField(term22132, term22132.getClass(), "checkSumOK", false);
        setByteField(term22132, term22132.getClass(), "linkFlag", (byte) 108);
        setField(term22132, term22132.getClass(), "linkName", "");
        setField(term22132, term22132.getClass(), "magic", "ustar ");
        setField(term22132, term22132.getClass(), "version", "00");
        setField(term22132, term22132.getClass(), "userName", "root");
        setField(term22132, term22132.getClass(), "groupName", "");
        setIntField(term22132, term22132.getClass(), "devMajor", -1870495012);
        setIntField(term22132, term22132.getClass(), "devMinor", -1310015129);
        setBooleanField(term22132, term22132.getClass(), "isExtended", false);
        setLongField(term22132, term22132.getClass(), "realSize", 8166095254618543564L);
        setField(term22145, term22145.getClass(), "path", "IDCWpPLRkE");
        setField(term22145, term22145.getClass(), "status", enum65);
        setIntField(term22145, term22145.getClass(), "prefixLength", -2104981311);
        setField(term22145, term22145.getClass(), "filePath", null);
        setField(term22132, term22132.getClass(), "file", term22145);
        setField(term22130, term22130.getClass(), "currEntry", term22132);
        setField(term22130, term22130.getClass(), "zipEncoding", null);
        setByteElement(term22150, 0, (byte) -105);
        setByteElement(term22150, 1, (byte) 33);
        setByteElement(term22150, 2, (byte) 109);
        setByteElement(term22150, 3, (byte) -54);
        setByteElement(term22150, 4, (byte) -85);
        setByteElement(term22150, 5, (byte) 81);
        setByteElement(term22150, 6, (byte) -113);
        setField(term22130, term22130.getClass(), "SINGLE", term22150);
        setLongField(term22130, term22130.getClass(), "bytesRead", -4598158870068953328L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAtEOF", argTypes, term5889, args);
        assertTrue(recursiveEquals(term5889, term22130));
    }

};


