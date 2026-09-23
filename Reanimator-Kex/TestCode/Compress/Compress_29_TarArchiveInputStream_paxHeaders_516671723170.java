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

public class TarArchiveInputStream_paxHeaders_516671723170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71609;
     Object term75248;

    public TarArchiveInputStream_paxHeaders_516671723170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71609 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term71741 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term71609, term71609.getClass(), "SINGLE", null);
        setBooleanField(term71609, term71609.getClass(), "hasHitEOF", false);
        setLongField(term71609, term71609.getClass(), "entryOffset", 0L);
        setLongField(term71609, term71609.getClass(), "entrySize", -9223372036854775807L);
        setField(term71609, term71609.getClass(), "currEntry", null);
        setIntField(term71609, term71609.getClass(), "recordSize", 1);
        setBooleanField(term71741, term71741.getClass(), "hasHitEOF", false);
        setLongField(term71741, term71741.getClass(), "entryOffset", 0L);
        setLongField(term71741, term71741.getClass(), "entrySize", -9223372036854775807L);
        setField(term71609, term71609.getClass(), "is", term71741);
        setLongField(term71609, term71609.getClass(), "bytesRead", 0L);
        term75248 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term75249 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term75248, term75248.getClass(), "SMALL_BUF", null);
        setIntField(term75248, term75248.getClass(), "recordSize", 1);
        setIntField(term75248, term75248.getClass(), "blockSize", 0);
        setBooleanField(term75248, term75248.getClass(), "hasHitEOF", true);
        setLongField(term75248, term75248.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term75248, term75248.getClass(), "entryOffset", 0L);
        setField(term75249, term75249.getClass(), "SMALL_BUF", null);
        setIntField(term75249, term75249.getClass(), "recordSize", 0);
        setIntField(term75249, term75249.getClass(), "blockSize", 0);
        setBooleanField(term75249, term75249.getClass(), "hasHitEOF", false);
        setLongField(term75249, term75249.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term75249, term75249.getClass(), "entryOffset", 0L);
        setField(term75249, term75249.getClass(), "is", null);
        setField(term75249, term75249.getClass(), "currEntry", null);
        setField(term75249, term75249.getClass(), "zipEncoding", null);
        setField(term75249, term75249.getClass(), "SINGLE", null);
        setLongField(term75249, term75249.getClass(), "bytesRead", 0L);
        setField(term75248, term75248.getClass(), "is", term75249);
        setField(term75248, term75248.getClass(), "currEntry", null);
        setField(term75248, term75248.getClass(), "zipEncoding", null);
        setField(term75248, term75248.getClass(), "SINGLE", null);
        setLongField(term75248, term75248.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term71609, args);
        assertTrue(recursiveEquals(term71609, term75248));
    }

};


