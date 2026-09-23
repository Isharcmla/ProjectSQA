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

public class DumpArchiveInputStream_read_1544528404148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99538;
     Object term101013;

    public DumpArchiveInputStream_read_1544528404148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99538 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term99662 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setBooleanField(term99538, term99538.getClass(), "hasHitEOF", false);
        setBooleanField(term99538, term99538.getClass(), "isClosed", false);
        setLongField(term99538, term99538.getClass(), "entryOffset", -9223372036384882689L);
        setLongField(term99538, term99538.getClass(), "entrySize", 5403279311967485952L);
        setField(term99538, term99538.getClass(), "active", term99662);
        term101013 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term101014 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        setField(term101013, term101013.getClass(), "summary", null);
        setField(term101014, term101014.getClass(), "name", null);
        setField(term101014, term101014.getClass(), "type", null);
        setIntField(term101014, term101014.getClass(), "mode", 0);
        setField(term101014, term101014.getClass(), "permissions", null);
        setLongField(term101014, term101014.getClass(), "size", 0L);
        setLongField(term101014, term101014.getClass(), "atime", 0L);
        setLongField(term101014, term101014.getClass(), "mtime", 0L);
        setIntField(term101014, term101014.getClass(), "uid", 0);
        setIntField(term101014, term101014.getClass(), "gid", 0);
        setField(term101014, term101014.getClass(), "summary", null);
        setField(term101014, term101014.getClass(), "header", null);
        setField(term101014, term101014.getClass(), "simpleName", null);
        setField(term101014, term101014.getClass(), "originalName", null);
        setIntField(term101014, term101014.getClass(), "volume", 0);
        setLongField(term101014, term101014.getClass(), "offset", 0L);
        setIntField(term101014, term101014.getClass(), "ino", 0);
        setIntField(term101014, term101014.getClass(), "nlink", 0);
        setLongField(term101014, term101014.getClass(), "ctime", 0L);
        setIntField(term101014, term101014.getClass(), "generation", 0);
        setBooleanField(term101014, term101014.getClass(), "isDeleted", false);
        setField(term101013, term101013.getClass(), "active", term101014);
        setBooleanField(term101013, term101013.getClass(), "isClosed", false);
        setBooleanField(term101013, term101013.getClass(), "hasHitEOF", false);
        setLongField(term101013, term101013.getClass(), "entrySize", 5403279311967485952L);
        setLongField(term101013, term101013.getClass(), "entryOffset", -9223372036384882689L);
        setIntField(term101013, term101013.getClass(), "readIdx", 0);
        setField(term101013, term101013.getClass(), "readBuf", null);
        setField(term101013, term101013.getClass(), "blockBuffer", null);
        setIntField(term101013, term101013.getClass(), "recordOffset", 0);
        setLongField(term101013, term101013.getClass(), "filepos", 0L);
        setField(term101013, term101013.getClass(), "raw", null);
        setField(term101013, term101013.getClass(), "names", null);
        setField(term101013, term101013.getClass(), "pending", null);
        setField(term101013, term101013.getClass(), "queue", null);
        setField(term101013, term101013.getClass(), "zipEncoding", null);
        setField(term101013, term101013.getClass(), "SINGLE", null);
        setLongField(term101013, term101013.getClass(), "bytesRead", 0L);
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
        args[2] = -2134986943;
        Object retValue = callMethod(klass, "read", argTypes, term99538, args);
        assertTrue(recursiveEquals(term99538, term101013));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


