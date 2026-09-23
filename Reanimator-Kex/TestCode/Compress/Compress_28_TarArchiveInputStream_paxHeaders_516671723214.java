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

public class TarArchiveInputStream_paxHeaders_516671723214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103841;
     Object term104984;

    public TarArchiveInputStream_paxHeaders_516671723214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103841 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term103961 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term104097 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term103841, term103841.getClass(), "SINGLE", null);
        setBooleanField(term103841, term103841.getClass(), "hasHitEOF", false);
        setLongField(term103841, term103841.getClass(), "entryOffset", 2258212469L);
        setLongField(term103841, term103841.getClass(), "entrySize", 4850490556L);
        setField(term103841, term103841.getClass(), "currEntry", term103961);
        setField(term103841, term103841.getClass(), "is", term104097);
        term104984 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term104985 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term104986 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term104984, term104984.getClass(), "SMALL_BUF", null);
        setIntField(term104984, term104984.getClass(), "recordSize", 0);
        setIntField(term104984, term104984.getClass(), "blockSize", 0);
        setBooleanField(term104984, term104984.getClass(), "hasHitEOF", true);
        setLongField(term104984, term104984.getClass(), "entrySize", 4850490556L);
        setLongField(term104984, term104984.getClass(), "entryOffset", 2258212469L);
        setField(term104985, term104985.getClass(), "summary", null);
        setField(term104985, term104985.getClass(), "active", null);
        setBooleanField(term104985, term104985.getClass(), "isClosed", false);
        setBooleanField(term104985, term104985.getClass(), "hasHitEOF", false);
        setLongField(term104985, term104985.getClass(), "entrySize", 0L);
        setLongField(term104985, term104985.getClass(), "entryOffset", 0L);
        setIntField(term104985, term104985.getClass(), "readIdx", 0);
        setField(term104985, term104985.getClass(), "readBuf", null);
        setField(term104985, term104985.getClass(), "blockBuffer", null);
        setIntField(term104985, term104985.getClass(), "recordOffset", 0);
        setLongField(term104985, term104985.getClass(), "filepos", 0L);
        setField(term104985, term104985.getClass(), "raw", null);
        setField(term104985, term104985.getClass(), "names", null);
        setField(term104985, term104985.getClass(), "pending", null);
        setField(term104985, term104985.getClass(), "queue", null);
        setField(term104985, term104985.getClass(), "encoding", null);
        setField(term104985, term104985.getClass(), "SINGLE", null);
        setLongField(term104985, term104985.getClass(), "bytesRead", 0L);
        setField(term104984, term104984.getClass(), "is", term104985);
        setField(term104986, term104986.getClass(), "name", null);
        setIntField(term104986, term104986.getClass(), "mode", 0);
        setIntField(term104986, term104986.getClass(), "userId", 0);
        setIntField(term104986, term104986.getClass(), "groupId", 0);
        setLongField(term104986, term104986.getClass(), "size", 0L);
        setLongField(term104986, term104986.getClass(), "modTime", 0L);
        setBooleanField(term104986, term104986.getClass(), "checkSumOK", false);
        setByteField(term104986, term104986.getClass(), "linkFlag", (byte) 0);
        setField(term104986, term104986.getClass(), "linkName", null);
        setField(term104986, term104986.getClass(), "magic", null);
        setField(term104986, term104986.getClass(), "version", null);
        setField(term104986, term104986.getClass(), "userName", null);
        setField(term104986, term104986.getClass(), "groupName", null);
        setIntField(term104986, term104986.getClass(), "devMajor", 0);
        setIntField(term104986, term104986.getClass(), "devMinor", 0);
        setBooleanField(term104986, term104986.getClass(), "isExtended", false);
        setLongField(term104986, term104986.getClass(), "realSize", 0L);
        setField(term104986, term104986.getClass(), "file", null);
        setField(term104984, term104984.getClass(), "currEntry", term104986);
        setField(term104984, term104984.getClass(), "encoding", null);
        setField(term104984, term104984.getClass(), "SINGLE", null);
        setLongField(term104984, term104984.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term103841, args);
        assertTrue(recursiveEquals(term103841, term104984));
    }

};


