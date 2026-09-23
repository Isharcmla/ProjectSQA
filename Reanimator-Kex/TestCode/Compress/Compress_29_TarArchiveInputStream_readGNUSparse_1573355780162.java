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

public class TarArchiveInputStream_readGNUSparse_1573355780162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67464;
     Object term68253;

    public TarArchiveInputStream_readGNUSparse_1573355780162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67464 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term67584 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term67716 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term67584, term67584.getClass(), "isExtended", true);
        setField(term67464, term67464.getClass(), "currEntry", term67584);
        setIntField(term67464, term67464.getClass(), "recordSize", 8);
        setField(term67464, term67464.getClass(), "is", term67716);
        term68253 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term68254 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term68253, term68253.getClass(), "SMALL_BUF", null);
        setIntField(term68253, term68253.getClass(), "recordSize", 8);
        setIntField(term68253, term68253.getClass(), "blockSize", 0);
        setBooleanField(term68253, term68253.getClass(), "hasHitEOF", true);
        setLongField(term68253, term68253.getClass(), "entrySize", 0L);
        setLongField(term68253, term68253.getClass(), "entryOffset", 0L);
        setField(term68254, term68254.getClass(), "SMALL_BUF", null);
        setIntField(term68254, term68254.getClass(), "recordSize", 0);
        setIntField(term68254, term68254.getClass(), "blockSize", 0);
        setBooleanField(term68254, term68254.getClass(), "hasHitEOF", false);
        setLongField(term68254, term68254.getClass(), "entrySize", 0L);
        setLongField(term68254, term68254.getClass(), "entryOffset", 0L);
        setField(term68254, term68254.getClass(), "is", null);
        setField(term68254, term68254.getClass(), "currEntry", null);
        setField(term68254, term68254.getClass(), "zipEncoding", null);
        setField(term68254, term68254.getClass(), "SINGLE", null);
        setLongField(term68254, term68254.getClass(), "bytesRead", 0L);
        setField(term68253, term68253.getClass(), "is", term68254);
        setField(term68253, term68253.getClass(), "currEntry", null);
        setField(term68253, term68253.getClass(), "zipEncoding", null);
        setField(term68253, term68253.getClass(), "SINGLE", null);
        setLongField(term68253, term68253.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term67464, args);
        assertTrue(recursiveEquals(term67464, term68253));
    }

};


