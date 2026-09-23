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
import java.util.HashMap;
import java.lang.Long;

public class TarArchiveInputStream_skip_86180751344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939;
     Object term1044;

    public TarArchiveInputStream_skip_86180751344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14583 = Class.forName((String) "java.io.File$PathStatus");
        Field term14582 = ((Class) term14583).getDeclaredField((String) "INVALID");
        ((Field) term14582).setAccessible(true);
        Object enum34 = ((Field) term14582).get((Object) null);
        HashMap term1023 = new HashMap();
        term939 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term940 = (byte[]) newByteArray(9);
        Object term955 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term994 = newInstance(Class.forName("java.io.File"));
        byte[] term1033 = (byte[]) newByteArray(9);
        setByteElement(term940, 0, (byte) 118);
        setByteElement(term940, 1, (byte) 106);
        setByteElement(term940, 2, (byte) 98);
        setByteElement(term940, 3, (byte) 67);
        setByteElement(term940, 4, (byte) 66);
        setByteElement(term940, 5, (byte) -121);
        setByteElement(term940, 6, (byte) -119);
        setByteElement(term940, 7, (byte) 71);
        setByteElement(term940, 8, (byte) 80);
        setField(term939, term939.getClass(), "SMALL_BUF", term940);
        setIntField(term939, term939.getClass(), "recordSize", -1007160944);
        setIntField(term939, term939.getClass(), "blockSize", 1135664017);
        setBooleanField(term939, term939.getClass(), "hasHitEOF", false);
        setLongField(term939, term939.getClass(), "entrySize", 2486810210675247493L);
        setLongField(term939, term939.getClass(), "entryOffset", 7009926388951271268L);
        setField(term939, term939.getClass(), "is", null);
        setField(term955, term955.getClass(), "name", "");
        setBooleanField(term955, term955.getClass(), "preserveLeadingSlashes", false);
        setIntField(term955, term955.getClass(), "mode", 590364439);
        setLongField(term955, term955.getClass(), "userId", -7672528020740371001L);
        setLongField(term955, term955.getClass(), "groupId", -4502405999831680926L);
        setLongField(term955, term955.getClass(), "size", 1967728129628047933L);
        setLongField(term955, term955.getClass(), "modTime", 2120084523938730454L);
        setBooleanField(term955, term955.getClass(), "checkSumOK", true);
        setByteField(term955, term955.getClass(), "linkFlag", (byte) 42);
        setField(term955, term955.getClass(), "linkName", "");
        setField(term955, term955.getClass(), "magic", "ustar ");
        setField(term955, term955.getClass(), "version", "00");
        setField(term955, term955.getClass(), "userName", "root");
        setField(term955, term955.getClass(), "groupName", "");
        setIntField(term955, term955.getClass(), "devMajor", 865208305);
        setIntField(term955, term955.getClass(), "devMinor", -1275173084);
        setBooleanField(term955, term955.getClass(), "isExtended", true);
        setLongField(term955, term955.getClass(), "realSize", 6855071767938501807L);
        setBooleanField(term955, term955.getClass(), "paxGNUSparse", true);
        setBooleanField(term955, term955.getClass(), "starSparse", true);
        setField(term994, term994.getClass(), "path", "aJlieCFVtF");
        setField(term994, term994.getClass(), "status", enum34);
        setIntField(term994, term994.getClass(), "prefixLength", -244121226);
        setField(term994, term994.getClass(), "filePath", null);
        setField(term955, term955.getClass(), "file", term994);
        setField(term939, term939.getClass(), "currEntry", term955);
        setField(term939, term939.getClass(), "zipEncoding", null);
        setField(term939, term939.getClass(), "encoding", "ZiaGIbnzTs");
        setField(term939, term939.getClass(), "globalPaxHeaders", term1023);
        setByteElement(term1033, 0, (byte) 72);
        setByteElement(term1033, 1, (byte) 111);
        setByteElement(term1033, 2, (byte) 99);
        setByteElement(term1033, 3, (byte) -12);
        setByteElement(term1033, 4, (byte) -61);
        setByteElement(term1033, 5, (byte) -85);
        setByteElement(term1033, 6, (byte) -22);
        setByteElement(term1033, 7, (byte) 93);
        setByteElement(term1033, 8, (byte) 69);
        setField(term939, term939.getClass(), "SINGLE", term1033);
        setLongField(term939, term939.getClass(), "bytesRead", -5892135042702373494L);
        term1044 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1044;
        try {
            callMethod(klass, "skip", argTypes, term939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


