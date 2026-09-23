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
     Object term6395;
     Object term23121;

    public TarArchiveInputStream_isAtEOF_46325739962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23269 = Class.forName((String) "java.io.File$PathStatus");
        Field term23268 = ((Class) term23269).getDeclaredField((String) "CHECKED");
        ((Field) term23268).setAccessible(true);
        Object enum63 = ((Field) term23268).get((Object) null);
        term6395 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6396 = (byte[]) newByteArray(6);
        Object term6408 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6444 = newInstance(Class.forName("java.io.File"));
        byte[] term6473 = (byte[]) newByteArray(7);
        setByteElement(term6396, 0, (byte) 69);
        setByteElement(term6396, 1, (byte) 112);
        setByteElement(term6396, 2, (byte) 77);
        setByteElement(term6396, 3, (byte) -1);
        setByteElement(term6396, 4, (byte) -83);
        setByteElement(term6396, 5, (byte) -63);
        setField(term6395, term6395.getClass(), "SMALL_BUF", term6396);
        setIntField(term6395, term6395.getClass(), "recordSize", 98922530);
        setIntField(term6395, term6395.getClass(), "blockSize", -1388471422);
        setBooleanField(term6395, term6395.getClass(), "hasHitEOF", false);
        setLongField(term6395, term6395.getClass(), "entrySize", -1505191021111100819L);
        setLongField(term6395, term6395.getClass(), "entryOffset", -1000830646340880796L);
        setField(term6395, term6395.getClass(), "is", null);
        setField(term6408, term6408.getClass(), "name", "");
        setIntField(term6408, term6408.getClass(), "mode", -1498296052);
        setLongField(term6408, term6408.getClass(), "userId", 5973526439563541711L);
        setLongField(term6408, term6408.getClass(), "groupId", 5246058710498845622L);
        setLongField(term6408, term6408.getClass(), "size", 4394651392080968777L);
        setLongField(term6408, term6408.getClass(), "modTime", -7310273014364148916L);
        setBooleanField(term6408, term6408.getClass(), "checkSumOK", false);
        setByteField(term6408, term6408.getClass(), "linkFlag", (byte) 108);
        setField(term6408, term6408.getClass(), "linkName", "");
        setField(term6408, term6408.getClass(), "magic", "ustar ");
        setField(term6408, term6408.getClass(), "version", "00");
        setField(term6408, term6408.getClass(), "userName", "root");
        setField(term6408, term6408.getClass(), "groupName", "");
        setIntField(term6408, term6408.getClass(), "devMajor", 2098647989);
        setIntField(term6408, term6408.getClass(), "devMinor", 1598895173);
        setBooleanField(term6408, term6408.getClass(), "isExtended", false);
        setLongField(term6408, term6408.getClass(), "realSize", 8863790908271299748L);
        setField(term6444, term6444.getClass(), "path", "ieCtQFdkii");
        setField(term6444, term6444.getClass(), "status", enum63);
        setIntField(term6444, term6444.getClass(), "prefixLength", 1830648570);
        setField(term6444, term6444.getClass(), "filePath", null);
        setField(term6408, term6408.getClass(), "file", term6444);
        setField(term6395, term6395.getClass(), "currEntry", term6408);
        setField(term6395, term6395.getClass(), "zipEncoding", null);
        setField(term6395, term6395.getClass(), "encoding", "dEnhdmILtU");
        setByteElement(term6473, 0, (byte) -105);
        setByteElement(term6473, 1, (byte) 33);
        setByteElement(term6473, 2, (byte) 109);
        setByteElement(term6473, 3, (byte) -54);
        setByteElement(term6473, 4, (byte) -85);
        setByteElement(term6473, 5, (byte) 81);
        setByteElement(term6473, 6, (byte) -113);
        setField(term6395, term6395.getClass(), "SINGLE", term6473);
        setLongField(term6395, term6395.getClass(), "bytesRead", 9205327385733285058L);
        Class<? extends Object> term23621 = Class.forName((String) "java.io.File$PathStatus");
        Field term23620 = ((Class) term23621).getDeclaredField((String) "INVALID");
        ((Field) term23620).setAccessible(true);
        Object enum65 = ((Field) term23620).get((Object) null);
        term23121 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23122 = (byte[]) newByteArray(6);
        Object term23123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23151 = newInstance(Class.forName("java.io.File"));
        byte[] term23189 = (byte[]) newByteArray(7);
        setByteElement(term23122, 0, (byte) 69);
        setByteElement(term23122, 1, (byte) 112);
        setByteElement(term23122, 2, (byte) 77);
        setByteElement(term23122, 3, (byte) -1);
        setByteElement(term23122, 4, (byte) -83);
        setByteElement(term23122, 5, (byte) -63);
        setField(term23121, term23121.getClass(), "SMALL_BUF", term23122);
        setIntField(term23121, term23121.getClass(), "recordSize", 98922530);
        setIntField(term23121, term23121.getClass(), "blockSize", -1388471422);
        setBooleanField(term23121, term23121.getClass(), "hasHitEOF", false);
        setLongField(term23121, term23121.getClass(), "entrySize", -1505191021111100819L);
        setLongField(term23121, term23121.getClass(), "entryOffset", -1000830646340880796L);
        setField(term23121, term23121.getClass(), "is", null);
        setField(term23123, term23123.getClass(), "name", "");
        setIntField(term23123, term23123.getClass(), "mode", -1498296052);
        setLongField(term23123, term23123.getClass(), "userId", 5973526439563541711L);
        setLongField(term23123, term23123.getClass(), "groupId", 5246058710498845622L);
        setLongField(term23123, term23123.getClass(), "size", 4394651392080968777L);
        setLongField(term23123, term23123.getClass(), "modTime", -7310273014364148916L);
        setBooleanField(term23123, term23123.getClass(), "checkSumOK", false);
        setByteField(term23123, term23123.getClass(), "linkFlag", (byte) 108);
        setField(term23123, term23123.getClass(), "linkName", "");
        setField(term23123, term23123.getClass(), "magic", "ustar ");
        setField(term23123, term23123.getClass(), "version", "00");
        setField(term23123, term23123.getClass(), "userName", "root");
        setField(term23123, term23123.getClass(), "groupName", "");
        setIntField(term23123, term23123.getClass(), "devMajor", 2098647989);
        setIntField(term23123, term23123.getClass(), "devMinor", 1598895173);
        setBooleanField(term23123, term23123.getClass(), "isExtended", false);
        setLongField(term23123, term23123.getClass(), "realSize", 8863790908271299748L);
        setField(term23151, term23151.getClass(), "path", "ieCtQFdkii");
        setField(term23151, term23151.getClass(), "status", enum65);
        setIntField(term23151, term23151.getClass(), "prefixLength", 1830648570);
        setField(term23151, term23151.getClass(), "filePath", null);
        setField(term23123, term23123.getClass(), "file", term23151);
        setField(term23121, term23121.getClass(), "currEntry", term23123);
        setField(term23121, term23121.getClass(), "zipEncoding", null);
        setField(term23121, term23121.getClass(), "encoding", "dEnhdmILtU");
        setByteElement(term23189, 0, (byte) -105);
        setByteElement(term23189, 1, (byte) 33);
        setByteElement(term23189, 2, (byte) 109);
        setByteElement(term23189, 3, (byte) -54);
        setByteElement(term23189, 4, (byte) -85);
        setByteElement(term23189, 5, (byte) 81);
        setByteElement(term23189, 6, (byte) -113);
        setField(term23121, term23121.getClass(), "SINGLE", term23189);
        setLongField(term23121, term23121.getClass(), "bytesRead", 9205327385733285058L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAtEOF", argTypes, term6395, args);
        assertTrue(recursiveEquals(term6395, term23121));
    }

};


