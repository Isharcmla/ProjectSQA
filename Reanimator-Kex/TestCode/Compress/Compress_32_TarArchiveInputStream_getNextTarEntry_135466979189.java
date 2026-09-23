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

public class TarArchiveInputStream_getNextTarEntry_135466979189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80144;
     Object term81536;

    public TarArchiveInputStream_getNextTarEntry_135466979189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80144 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term80280 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term80144, term80144.getClass(), "hasHitEOF", false);
        setField(term80144, term80144.getClass(), "currEntry", null);
        setIntField(term80144, term80144.getClass(), "recordSize", 512);
        setField(term80144, term80144.getClass(), "is", term80280);
        term81536 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term81537 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term81536, term81536.getClass(), "SMALL_BUF", null);
        setIntField(term81536, term81536.getClass(), "recordSize", 512);
        setIntField(term81536, term81536.getClass(), "blockSize", 0);
        setBooleanField(term81536, term81536.getClass(), "hasHitEOF", true);
        setLongField(term81536, term81536.getClass(), "entrySize", 0L);
        setLongField(term81536, term81536.getClass(), "entryOffset", 0L);
        setField(term81537, term81537.getClass(), "summary", null);
        setField(term81537, term81537.getClass(), "active", null);
        setBooleanField(term81537, term81537.getClass(), "isClosed", false);
        setBooleanField(term81537, term81537.getClass(), "hasHitEOF", false);
        setLongField(term81537, term81537.getClass(), "entrySize", 0L);
        setLongField(term81537, term81537.getClass(), "entryOffset", 0L);
        setIntField(term81537, term81537.getClass(), "readIdx", 0);
        setField(term81537, term81537.getClass(), "readBuf", null);
        setField(term81537, term81537.getClass(), "blockBuffer", null);
        setIntField(term81537, term81537.getClass(), "recordOffset", 0);
        setLongField(term81537, term81537.getClass(), "filepos", 0L);
        setField(term81537, term81537.getClass(), "raw", null);
        setField(term81537, term81537.getClass(), "names", null);
        setField(term81537, term81537.getClass(), "pending", null);
        setField(term81537, term81537.getClass(), "queue", null);
        setField(term81537, term81537.getClass(), "zipEncoding", null);
        setField(term81537, term81537.getClass(), "encoding", null);
        setField(term81537, term81537.getClass(), "SINGLE", null);
        setLongField(term81537, term81537.getClass(), "bytesRead", 0L);
        setField(term81536, term81536.getClass(), "is", term81537);
        setField(term81536, term81536.getClass(), "currEntry", null);
        setField(term81536, term81536.getClass(), "zipEncoding", null);
        setField(term81536, term81536.getClass(), "encoding", null);
        setField(term81536, term81536.getClass(), "SINGLE", null);
        setLongField(term81536, term81536.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term80144, args);
        assertTrue(recursiveEquals(term80144, term81536));
        assertTrue(recursiveEquals(retValue, null));
    }

};


