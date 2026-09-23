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

public class TarArchiveInputStream_readGNUSparse_1573355780223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87147;
     Object term119384;

    public TarArchiveInputStream_readGNUSparse_1573355780223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87147 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term87267 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setBooleanField(term87267, term87267.getClass(), "isExtended", true);
        setField(term87147, term87147.getClass(), "currEntry", term87267);
        setIntField(term87147, term87147.getClass(), "recordSize", 512);
        setField(term87147, term87147.getClass(), "is", term87147);
        setBooleanField(term87147, term87147.getClass(), "hasHitEOF", true);
        term119384 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term119384, term119384.getClass(), "SMALL_BUF", null);
        setIntField(term119384, term119384.getClass(), "recordSize", 512);
        setIntField(term119384, term119384.getClass(), "blockSize", 0);
        setBooleanField(term119384, term119384.getClass(), "hasHitEOF", true);
        setLongField(term119384, term119384.getClass(), "entrySize", 0L);
        setLongField(term119384, term119384.getClass(), "entryOffset", 0L);
        setField(term119384, term119384.getClass(), "is", term119384);
        setField(term119384, term119384.getClass(), "currEntry", null);
        setField(term119384, term119384.getClass(), "zipEncoding", null);
        setField(term119384, term119384.getClass(), "encoding", null);
        setField(term119384, term119384.getClass(), "SINGLE", null);
        setLongField(term119384, term119384.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term87147, args);
        assertTrue(recursiveEquals(term87147, term119384));
    }

};


