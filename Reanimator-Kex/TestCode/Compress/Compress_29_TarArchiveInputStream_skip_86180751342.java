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
import java.lang.Long;

public class TarArchiveInputStream_skip_86180751342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;
     Object term914;

    public TarArchiveInputStream_skip_86180751342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12404 = Class.forName((String) "java.io.File$PathStatus");
        Field term12403 = ((Class) term12404).getDeclaredField((String) "INVALID");
        ((Field) term12403).setAccessible(true);
        Object enum31 = ((Field) term12403).get((Object) null);
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
        setField(term886, term886.getClass(), "status", enum31);
        setIntField(term886, term886.getClass(), "prefixLength", -469968304);
        setField(term886, term886.getClass(), "filePath", null);
        setField(term850, term850.getClass(), "file", term886);
        setField(term834, term834.getClass(), "currEntry", term850);
        setField(term834, term834.getClass(), "zipEncoding", null);
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term914;
        try {
            callMethod(klass, "skip", argTypes, term834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


