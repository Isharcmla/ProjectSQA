package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.lang.Object;

public class DumpArchiveInputStream_read_154452840470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53481;
     Object term53640;

    public DumpArchiveInputStream_read_154452840470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53481 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term53605 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setBooleanField(term53481, term53481.getClass(), "hasHitEOF", false);
        setBooleanField(term53481, term53481.getClass(), "isClosed", false);
        setLongField(term53481, term53481.getClass(), "entryOffset", 0L);
        setLongField(term53481, term53481.getClass(), "entrySize", 1L);
        setField(term53481, term53481.getClass(), "active", term53605);
        term53640 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term53641 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(term53640, term53640.getClass(), "summary", null);
        setField(term53641, term53641.getClass(), "name", null);
        setField(term53641, term53641.getClass(), "type", null);
        setIntField(term53641, term53641.getClass(), "mode", 0);
        setField(term53641, term53641.getClass(), "permissions", null);
        setLongField(term53641, term53641.getClass(), "size", 0L);
        setLongField(term53641, term53641.getClass(), "atime", 0L);
        setLongField(term53641, term53641.getClass(), "mtime", 0L);
        setIntField(term53641, term53641.getClass(), "uid", 0);
        setIntField(term53641, term53641.getClass(), "gid", 0);
        setField(term53641, term53641.getClass(), "summary", null);
        setField(term53641, term53641.getClass(), "header", null);
        setField(term53641, term53641.getClass(), "simpleName", null);
        setField(term53641, term53641.getClass(), "originalName", null);
        setIntField(term53641, term53641.getClass(), "volume", 0);
        setLongField(term53641, term53641.getClass(), "offset", 0L);
        setIntField(term53641, term53641.getClass(), "ino", 0);
        setIntField(term53641, term53641.getClass(), "nlink", 0);
        setLongField(term53641, term53641.getClass(), "ctime", 0L);
        setIntField(term53641, term53641.getClass(), "generation", 0);
        setBooleanField(term53641, term53641.getClass(), "isDeleted", false);
        setField(term53640, term53640.getClass(), "active", term53641);
        setBooleanField(term53640, term53640.getClass(), "isClosed", false);
        setBooleanField(term53640, term53640.getClass(), "hasHitEOF", false);
        setLongField(term53640, term53640.getClass(), "entrySize", 1L);
        setLongField(term53640, term53640.getClass(), "entryOffset", 0L);
        setIntField(term53640, term53640.getClass(), "readIdx", 0);
        setField(term53640, term53640.getClass(), "readBuf", null);
        setField(term53640, term53640.getClass(), "blockBuffer", null);
        setIntField(term53640, term53640.getClass(), "recordOffset", 0);
        setLongField(term53640, term53640.getClass(), "filepos", 0L);
        setField(term53640, term53640.getClass(), "raw", null);
        setField(term53640, term53640.getClass(), "names", null);
        setField(term53640, term53640.getClass(), "pending", null);
        setField(term53640, term53640.getClass(), "queue", null);
        setField(term53640, term53640.getClass(), "zipEncoding", null);
        setField(term53640, term53640.getClass(), "SINGLE", null);
        setLongField(term53640, term53640.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term53481, args);
        assertTrue(recursiveEquals(term53481, term53640));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


