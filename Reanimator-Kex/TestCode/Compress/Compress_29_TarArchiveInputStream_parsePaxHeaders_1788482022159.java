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
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_1788482022159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67121;
     Object term67253;
     Object term67286;
     Object term67287;
     Object term67274;

    public TarArchiveInputStream_parsePaxHeaders_1788482022159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67121 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term67253 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        term67286 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term67286, term67286.getClass(), "SMALL_BUF", null);
        setIntField(term67286, term67286.getClass(), "recordSize", 0);
        setIntField(term67286, term67286.getClass(), "blockSize", 0);
        setBooleanField(term67286, term67286.getClass(), "hasHitEOF", false);
        setLongField(term67286, term67286.getClass(), "entrySize", 0L);
        setLongField(term67286, term67286.getClass(), "entryOffset", 0L);
        setField(term67286, term67286.getClass(), "is", null);
        setField(term67286, term67286.getClass(), "currEntry", null);
        setField(term67286, term67286.getClass(), "zipEncoding", null);
        setField(term67286, term67286.getClass(), "SINGLE", null);
        setLongField(term67286, term67286.getClass(), "bytesRead", 0L);
        term67287 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term67287, term67287.getClass(), "zipEncoding", null);
        setBooleanField(term67287, term67287.getClass(), "useUnicodeExtraFields", false);
        setField(term67287, term67287.getClass(), "in", null);
        setField(term67287, term67287.getClass(), "inf", null);
        setField(term67287, term67287.getClass(), "buf", null);
        setField(term67287, term67287.getClass(), "current", null);
        setBooleanField(term67287, term67287.getClass(), "closed", false);
        setBooleanField(term67287, term67287.getClass(), "hitCentralDirectory", false);
        setField(term67287, term67287.getClass(), "lastStoredEntry", null);
        setBooleanField(term67287, term67287.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term67287, term67287.getClass(), "LFH_BUF", null);
        setField(term67287, term67287.getClass(), "SKIP_BUF", null);
        setField(term67287, term67287.getClass(), "SHORT_BUF", null);
        setField(term67287, term67287.getClass(), "WORD_BUF", null);
        setField(term67287, term67287.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term67287, term67287.getClass(), "entriesRead", 0);
        setField(term67287, term67287.getClass(), "SINGLE", null);
        setLongField(term67287, term67287.getClass(), "bytesRead", 0L);
        term67274 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term67253;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term67121, args);
        assertTrue(recursiveEquals(term67121, term67286));
        assertTrue(recursiveEquals(term67253, term67287));
        assertTrue(recursiveEquals(retValue, term67274));
    }

};


