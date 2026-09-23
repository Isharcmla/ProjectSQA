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

public class TarArchiveInputStream_canReadEntryData_759488324112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47582;
     Object term47702;
     Object term48391;
     Object term48392;

    public TarArchiveInputStream_canReadEntryData_759488324112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47582 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term47702 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term48391 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term48391, term48391.getClass(), "SMALL_BUF", null);
        setIntField(term48391, term48391.getClass(), "recordSize", 0);
        setIntField(term48391, term48391.getClass(), "blockSize", 0);
        setBooleanField(term48391, term48391.getClass(), "hasHitEOF", false);
        setLongField(term48391, term48391.getClass(), "entrySize", 0L);
        setLongField(term48391, term48391.getClass(), "entryOffset", 0L);
        setField(term48391, term48391.getClass(), "is", null);
        setField(term48391, term48391.getClass(), "currEntry", null);
        setField(term48391, term48391.getClass(), "zipEncoding", null);
        setField(term48391, term48391.getClass(), "encoding", null);
        setField(term48391, term48391.getClass(), "globalPaxHeaders", null);
        setField(term48391, term48391.getClass(), "SINGLE", null);
        setLongField(term48391, term48391.getClass(), "bytesRead", 0L);
        term48392 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term48392, term48392.getClass(), "name", null);
        setBooleanField(term48392, term48392.getClass(), "preserveLeadingSlashes", false);
        setIntField(term48392, term48392.getClass(), "mode", 0);
        setLongField(term48392, term48392.getClass(), "userId", 0L);
        setLongField(term48392, term48392.getClass(), "groupId", 0L);
        setLongField(term48392, term48392.getClass(), "size", 0L);
        setLongField(term48392, term48392.getClass(), "modTime", 0L);
        setBooleanField(term48392, term48392.getClass(), "checkSumOK", false);
        setByteField(term48392, term48392.getClass(), "linkFlag", (byte) 0);
        setField(term48392, term48392.getClass(), "linkName", null);
        setField(term48392, term48392.getClass(), "magic", null);
        setField(term48392, term48392.getClass(), "version", null);
        setField(term48392, term48392.getClass(), "userName", null);
        setField(term48392, term48392.getClass(), "groupName", null);
        setIntField(term48392, term48392.getClass(), "devMajor", 0);
        setIntField(term48392, term48392.getClass(), "devMinor", 0);
        setBooleanField(term48392, term48392.getClass(), "isExtended", false);
        setLongField(term48392, term48392.getClass(), "realSize", 0L);
        setBooleanField(term48392, term48392.getClass(), "paxGNUSparse", false);
        setBooleanField(term48392, term48392.getClass(), "starSparse", false);
        setField(term48392, term48392.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term47702;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term47582, args);
        assertTrue(recursiveEquals(term47582, term48391));
        assertTrue(recursiveEquals(term47702, term48392));
        assertTrue(recursiveEquals(retValue, true));
    }

};


