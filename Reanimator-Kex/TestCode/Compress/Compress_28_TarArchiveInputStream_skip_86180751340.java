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
import java.lang.Long;

public class TarArchiveInputStream_skip_86180751340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;
     Object term914;
     Object term12294;

    public TarArchiveInputStream_skip_86180751340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12346 = Class.forName((String) "java.io.File$PathStatus");
        Field term12345 = ((Class) term12346).getDeclaredField((String) "INVALID");
        ((Field) term12345).setAccessible(true);
        Object enum29 = ((Field) term12345).get((Object) null);
        term834 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term835 = (byte[]) newByteArray(9);
        Object term850 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term886 = newInstance(Class.forName("java.io.File"));
        byte[] term903 = (byte[]) newByteArray(9);
        setByteElement(term835, 0, (byte) 118);
        setByteElement(term835, 1, (byte) 106);
        setByteElement(term835, 2, (byte) 98);
        setByteElement(term835, 3, (byte) 67);
        setByteElement(term835, 4, (byte) 66);
        setByteElement(term835, 5, (byte) -121);
        setByteElement(term835, 6, (byte) -119);
        setByteElement(term835, 7, (byte) 71);
        setByteElement(term835, 8, (byte) 80);
        setField(term834, term834.getClass(), "SMALL_BUF", term835);
        setIntField(term834, term834.getClass(), "recordSize", -203030934);
        setIntField(term834, term834.getClass(), "blockSize", -1179120542);
        setBooleanField(term834, term834.getClass(), "hasHitEOF", true);
        setLongField(term834, term834.getClass(), "entrySize", -6573104506744284592L);
        setLongField(term834, term834.getClass(), "entryOffset", -4920224193275732920L);
        setField(term834, term834.getClass(), "is", null);
        setField(term850, term850.getClass(), "name", "");
        setIntField(term850, term850.getClass(), "mode", -73683645);
        setIntField(term850, term850.getClass(), "userId", -226514366);
        setIntField(term850, term850.getClass(), "groupId", 1193880199);
        setLongField(term850, term850.getClass(), "size", 8428634514691209827L);
        setLongField(term850, term850.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term850, term850.getClass(), "checkSumOK", false);
        setByteField(term850, term850.getClass(), "linkFlag", (byte) 42);
        setField(term850, term850.getClass(), "linkName", "");
        setField(term850, term850.getClass(), "magic", "ustar ");
        setField(term850, term850.getClass(), "version", "00");
        setField(term850, term850.getClass(), "userName", "root");
        setField(term850, term850.getClass(), "groupName", "");
        setIntField(term850, term850.getClass(), "devMajor", -1087774327);
        setIntField(term850, term850.getClass(), "devMinor", -1530420153);
        setBooleanField(term850, term850.getClass(), "isExtended", true);
        setLongField(term850, term850.getClass(), "realSize", 8059786003080744426L);
        setField(term886, term886.getClass(), "path", "SzjVpOQTyS");
        setField(term886, term886.getClass(), "status", enum29);
        setIntField(term886, term886.getClass(), "prefixLength", -469968304);
        setField(term886, term886.getClass(), "filePath", null);
        setField(term850, term850.getClass(), "file", term886);
        setField(term834, term834.getClass(), "currEntry", term850);
        setField(term834, term834.getClass(), "encoding", null);
        setByteElement(term903, 0, (byte) 72);
        setByteElement(term903, 1, (byte) 111);
        setByteElement(term903, 2, (byte) 99);
        setByteElement(term903, 3, (byte) -12);
        setByteElement(term903, 4, (byte) -61);
        setByteElement(term903, 5, (byte) -85);
        setByteElement(term903, 6, (byte) -22);
        setByteElement(term903, 7, (byte) 93);
        setByteElement(term903, 8, (byte) 69);
        setField(term834, term834.getClass(), "SINGLE", term903);
        setLongField(term834, term834.getClass(), "bytesRead", -4365849114644724155L);
        term914 = new Long(2486810210675247493L);
        Class<? extends Object> term12529 = Class.forName((String) "java.io.File$PathStatus");
        Field term12528 = ((Class) term12529).getDeclaredField((String) "INVALID");
        ((Field) term12528).setAccessible(true);
        Object enum30 = ((Field) term12528).get((Object) null);
        term12294 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12295 = (byte[]) newByteArray(9);
        Object term12296 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12309 = newInstance(Class.forName("java.io.File"));
        byte[] term12314 = (byte[]) newByteArray(9);
        setByteElement(term12295, 0, (byte) 118);
        setByteElement(term12295, 1, (byte) 106);
        setByteElement(term12295, 2, (byte) 98);
        setByteElement(term12295, 3, (byte) 67);
        setByteElement(term12295, 4, (byte) 66);
        setByteElement(term12295, 5, (byte) -121);
        setByteElement(term12295, 6, (byte) -119);
        setByteElement(term12295, 7, (byte) 71);
        setByteElement(term12295, 8, (byte) 80);
        setField(term12294, term12294.getClass(), "SMALL_BUF", term12295);
        setIntField(term12294, term12294.getClass(), "recordSize", -203030934);
        setIntField(term12294, term12294.getClass(), "blockSize", -1179120542);
        setBooleanField(term12294, term12294.getClass(), "hasHitEOF", true);
        setLongField(term12294, term12294.getClass(), "entrySize", -6573104506744284592L);
        setLongField(term12294, term12294.getClass(), "entryOffset", -4920224193275732920L);
        setField(term12294, term12294.getClass(), "is", null);
        setField(term12296, term12296.getClass(), "name", "");
        setIntField(term12296, term12296.getClass(), "mode", -73683645);
        setIntField(term12296, term12296.getClass(), "userId", -226514366);
        setIntField(term12296, term12296.getClass(), "groupId", 1193880199);
        setLongField(term12296, term12296.getClass(), "size", 8428634514691209827L);
        setLongField(term12296, term12296.getClass(), "modTime", -2585684163342970173L);
        setBooleanField(term12296, term12296.getClass(), "checkSumOK", false);
        setByteField(term12296, term12296.getClass(), "linkFlag", (byte) 42);
        setField(term12296, term12296.getClass(), "linkName", "");
        setField(term12296, term12296.getClass(), "magic", "ustar ");
        setField(term12296, term12296.getClass(), "version", "00");
        setField(term12296, term12296.getClass(), "userName", "root");
        setField(term12296, term12296.getClass(), "groupName", "");
        setIntField(term12296, term12296.getClass(), "devMajor", -1087774327);
        setIntField(term12296, term12296.getClass(), "devMinor", -1530420153);
        setBooleanField(term12296, term12296.getClass(), "isExtended", true);
        setLongField(term12296, term12296.getClass(), "realSize", 8059786003080744426L);
        setField(term12309, term12309.getClass(), "path", "SzjVpOQTyS");
        setField(term12309, term12309.getClass(), "status", enum30);
        setIntField(term12309, term12309.getClass(), "prefixLength", -469968304);
        setField(term12309, term12309.getClass(), "filePath", null);
        setField(term12296, term12296.getClass(), "file", term12309);
        setField(term12294, term12294.getClass(), "currEntry", term12296);
        setField(term12294, term12294.getClass(), "encoding", null);
        setByteElement(term12314, 0, (byte) 72);
        setByteElement(term12314, 1, (byte) 111);
        setByteElement(term12314, 2, (byte) 99);
        setByteElement(term12314, 3, (byte) -12);
        setByteElement(term12314, 4, (byte) -61);
        setByteElement(term12314, 5, (byte) -85);
        setByteElement(term12314, 6, (byte) -22);
        setByteElement(term12314, 7, (byte) 93);
        setByteElement(term12314, 8, (byte) 69);
        setField(term12294, term12294.getClass(), "SINGLE", term12314);
        setLongField(term12294, term12294.getClass(), "bytesRead", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term914;
        Object retValue = callMethod(klass, "skip", argTypes, term834, args);
        assertTrue(recursiveEquals(term834, term12294));
        assertTrue(recursiveEquals(term914, 2486810210675247493L));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


