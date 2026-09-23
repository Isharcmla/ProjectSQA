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

public class TarArchiveInputStream_readGNUSparse_1573355780211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102944;
     Object term103641;

    public TarArchiveInputStream_readGNUSparse_1573355780211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102944 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term103064 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setBooleanField(term103064, term103064.getClass(), "isExtended", true);
        setField(term102944, term102944.getClass(), "currEntry", term103064);
        setIntField(term102944, term102944.getClass(), "recordSize", 512);
        setField(term102944, term102944.getClass(), "is", term102944);
        setBooleanField(term102944, term102944.getClass(), "hasHitEOF", true);
        term103641 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term103641, term103641.getClass(), "SMALL_BUF", null);
        setIntField(term103641, term103641.getClass(), "recordSize", 512);
        setIntField(term103641, term103641.getClass(), "blockSize", 0);
        setBooleanField(term103641, term103641.getClass(), "hasHitEOF", true);
        setLongField(term103641, term103641.getClass(), "entrySize", 0L);
        setLongField(term103641, term103641.getClass(), "entryOffset", 0L);
        setField(term103641, term103641.getClass(), "is", term103641);
        setField(term103641, term103641.getClass(), "currEntry", null);
        setField(term103641, term103641.getClass(), "encoding", null);
        setField(term103641, term103641.getClass(), "SINGLE", null);
        setLongField(term103641, term103641.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term102944, args);
        assertTrue(recursiveEquals(term102944, term103641));
    }

};


