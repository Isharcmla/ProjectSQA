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

public class TarArchiveInputStream_getLongNameData_1912068711120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49657;
     Object term50165;
     Object term50168;
     Object term50164;

    public TarArchiveInputStream_getLongNameData_1912068711120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49657 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term49423 = (byte[]) newByteArray(0);
        Object term49777 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term49657, term49657.getClass(), "SMALL_BUF", term49423);
        setBooleanField(term49657, term49657.getClass(), "hasHitEOF", true);
        setField(term49657, term49657.getClass(), "currEntry", term49777);
        term50165 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term50166 = (byte[]) newByteArray(0);
        Object term50167 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term50165, term50165.getClass(), "SMALL_BUF", term50166);
        setIntField(term50165, term50165.getClass(), "recordSize", 0);
        setIntField(term50165, term50165.getClass(), "blockSize", 0);
        setBooleanField(term50165, term50165.getClass(), "hasHitEOF", true);
        setLongField(term50165, term50165.getClass(), "entrySize", 0L);
        setLongField(term50165, term50165.getClass(), "entryOffset", 0L);
        setField(term50165, term50165.getClass(), "is", null);
        setField(term50167, term50167.getClass(), "name", null);
        setBooleanField(term50167, term50167.getClass(), "preserveLeadingSlashes", false);
        setIntField(term50167, term50167.getClass(), "mode", 0);
        setLongField(term50167, term50167.getClass(), "userId", 0L);
        setLongField(term50167, term50167.getClass(), "groupId", 0L);
        setLongField(term50167, term50167.getClass(), "size", 0L);
        setLongField(term50167, term50167.getClass(), "modTime", 0L);
        setBooleanField(term50167, term50167.getClass(), "checkSumOK", false);
        setByteField(term50167, term50167.getClass(), "linkFlag", (byte) 0);
        setField(term50167, term50167.getClass(), "linkName", null);
        setField(term50167, term50167.getClass(), "magic", null);
        setField(term50167, term50167.getClass(), "version", null);
        setField(term50167, term50167.getClass(), "userName", null);
        setField(term50167, term50167.getClass(), "groupName", null);
        setIntField(term50167, term50167.getClass(), "devMajor", 0);
        setIntField(term50167, term50167.getClass(), "devMinor", 0);
        setBooleanField(term50167, term50167.getClass(), "isExtended", false);
        setLongField(term50167, term50167.getClass(), "realSize", 0L);
        setBooleanField(term50167, term50167.getClass(), "paxGNUSparse", false);
        setBooleanField(term50167, term50167.getClass(), "starSparse", false);
        setField(term50167, term50167.getClass(), "file", null);
        setField(term50165, term50165.getClass(), "currEntry", term50167);
        setField(term50165, term50165.getClass(), "zipEncoding", null);
        setField(term50165, term50165.getClass(), "encoding", null);
        setField(term50165, term50165.getClass(), "globalPaxHeaders", null);
        setField(term50165, term50165.getClass(), "SINGLE", null);
        setLongField(term50165, term50165.getClass(), "bytesRead", 0L);
        term50168 = (byte[]) newByteArray(0);
        term50164 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term49657, args);
        assertTrue(recursiveEquals(term49657, term50165));
        assertTrue(recursiveEquals(retValue, term50164));
    }

};


