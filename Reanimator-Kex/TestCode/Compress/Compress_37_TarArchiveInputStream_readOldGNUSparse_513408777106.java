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

public class TarArchiveInputStream_readOldGNUSparse_513408777106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46423;
     Object term46620;

    public TarArchiveInputStream_readOldGNUSparse_513408777106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46423 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term46543 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setBooleanField(term46543, term46543.getClass(), "isExtended", false);
        setField(term46423, term46423.getClass(), "currEntry", term46543);
        term46620 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term46621 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term46620, term46620.getClass(), "SMALL_BUF", null);
        setIntField(term46620, term46620.getClass(), "recordSize", 0);
        setIntField(term46620, term46620.getClass(), "blockSize", 0);
        setBooleanField(term46620, term46620.getClass(), "hasHitEOF", false);
        setLongField(term46620, term46620.getClass(), "entrySize", 0L);
        setLongField(term46620, term46620.getClass(), "entryOffset", 0L);
        setField(term46620, term46620.getClass(), "is", null);
        setField(term46621, term46621.getClass(), "name", null);
        setBooleanField(term46621, term46621.getClass(), "preserveLeadingSlashes", false);
        setIntField(term46621, term46621.getClass(), "mode", 0);
        setLongField(term46621, term46621.getClass(), "userId", 0L);
        setLongField(term46621, term46621.getClass(), "groupId", 0L);
        setLongField(term46621, term46621.getClass(), "size", 0L);
        setLongField(term46621, term46621.getClass(), "modTime", 0L);
        setBooleanField(term46621, term46621.getClass(), "checkSumOK", false);
        setByteField(term46621, term46621.getClass(), "linkFlag", (byte) 0);
        setField(term46621, term46621.getClass(), "linkName", null);
        setField(term46621, term46621.getClass(), "magic", null);
        setField(term46621, term46621.getClass(), "version", null);
        setField(term46621, term46621.getClass(), "userName", null);
        setField(term46621, term46621.getClass(), "groupName", null);
        setIntField(term46621, term46621.getClass(), "devMajor", 0);
        setIntField(term46621, term46621.getClass(), "devMinor", 0);
        setBooleanField(term46621, term46621.getClass(), "isExtended", false);
        setLongField(term46621, term46621.getClass(), "realSize", 0L);
        setBooleanField(term46621, term46621.getClass(), "paxGNUSparse", false);
        setBooleanField(term46621, term46621.getClass(), "starSparse", false);
        setField(term46621, term46621.getClass(), "file", null);
        setField(term46620, term46620.getClass(), "currEntry", term46621);
        setField(term46620, term46620.getClass(), "zipEncoding", null);
        setField(term46620, term46620.getClass(), "encoding", null);
        setField(term46620, term46620.getClass(), "globalPaxHeaders", null);
        setField(term46620, term46620.getClass(), "SINGLE", null);
        setLongField(term46620, term46620.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readOldGNUSparse", argTypes, term46423, args);
        assertTrue(recursiveEquals(term46423, term46620));
    }

};


