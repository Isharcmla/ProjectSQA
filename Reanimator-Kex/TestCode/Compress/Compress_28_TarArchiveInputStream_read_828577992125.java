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

public class TarArchiveInputStream_read_828577992125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60753;
     Object term61620;

    public TarArchiveInputStream_read_828577992125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60753 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term60873 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term61005 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term60753, term60753.getClass(), "hasHitEOF", false);
        setLongField(term60753, term60753.getClass(), "entryOffset", 0L);
        setLongField(term60753, term60753.getClass(), "entrySize", 2155544769L);
        setField(term60753, term60753.getClass(), "currEntry", term60873);
        setField(term60753, term60753.getClass(), "is", term61005);
        term61620 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term61621 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term61622 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term61620, term61620.getClass(), "SMALL_BUF", null);
        setIntField(term61620, term61620.getClass(), "recordSize", 0);
        setIntField(term61620, term61620.getClass(), "blockSize", 0);
        setBooleanField(term61620, term61620.getClass(), "hasHitEOF", true);
        setLongField(term61620, term61620.getClass(), "entrySize", 2155544769L);
        setLongField(term61620, term61620.getClass(), "entryOffset", 0L);
        setField(term61621, term61621.getClass(), "SMALL_BUF", null);
        setIntField(term61621, term61621.getClass(), "recordSize", 0);
        setIntField(term61621, term61621.getClass(), "blockSize", 0);
        setBooleanField(term61621, term61621.getClass(), "hasHitEOF", false);
        setLongField(term61621, term61621.getClass(), "entrySize", 0L);
        setLongField(term61621, term61621.getClass(), "entryOffset", 0L);
        setField(term61621, term61621.getClass(), "is", null);
        setField(term61621, term61621.getClass(), "currEntry", null);
        setField(term61621, term61621.getClass(), "encoding", null);
        setField(term61621, term61621.getClass(), "SINGLE", null);
        setLongField(term61621, term61621.getClass(), "bytesRead", 0L);
        setField(term61620, term61620.getClass(), "is", term61621);
        setField(term61622, term61622.getClass(), "name", null);
        setIntField(term61622, term61622.getClass(), "mode", 0);
        setIntField(term61622, term61622.getClass(), "userId", 0);
        setIntField(term61622, term61622.getClass(), "groupId", 0);
        setLongField(term61622, term61622.getClass(), "size", 0L);
        setLongField(term61622, term61622.getClass(), "modTime", 0L);
        setBooleanField(term61622, term61622.getClass(), "checkSumOK", false);
        setByteField(term61622, term61622.getClass(), "linkFlag", (byte) 0);
        setField(term61622, term61622.getClass(), "linkName", null);
        setField(term61622, term61622.getClass(), "magic", null);
        setField(term61622, term61622.getClass(), "version", null);
        setField(term61622, term61622.getClass(), "userName", null);
        setField(term61622, term61622.getClass(), "groupName", null);
        setIntField(term61622, term61622.getClass(), "devMajor", 0);
        setIntField(term61622, term61622.getClass(), "devMinor", 0);
        setBooleanField(term61622, term61622.getClass(), "isExtended", false);
        setLongField(term61622, term61622.getClass(), "realSize", 0L);
        setField(term61622, term61622.getClass(), "file", null);
        setField(term61620, term61620.getClass(), "currEntry", term61622);
        setField(term61620, term61620.getClass(), "encoding", null);
        setField(term61620, term61620.getClass(), "SINGLE", null);
        setLongField(term61620, term61620.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 2139422526;
        Object retValue = callMethod(klass, "read", argTypes, term60753, args);
        assertTrue(recursiveEquals(term60753, term61620));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


