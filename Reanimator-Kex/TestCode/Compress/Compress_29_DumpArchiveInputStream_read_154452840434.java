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
import java.lang.Integer;

public class DumpArchiveInputStream_read_154452840434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20885;
     Object term20894;
     Object term20896;
     Object term34031;

    public DumpArchiveInputStream_read_154452840434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20885 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term20885, term20885.getClass(), "summary", null);
        setField(term20885, term20885.getClass(), "active", null);
        setBooleanField(term20885, term20885.getClass(), "isClosed", false);
        setBooleanField(term20885, term20885.getClass(), "hasHitEOF", false);
        setLongField(term20885, term20885.getClass(), "entrySize", 0L);
        setLongField(term20885, term20885.getClass(), "entryOffset", 0L);
        setIntField(term20885, term20885.getClass(), "readIdx", 0);
        setField(term20885, term20885.getClass(), "readBuf", null);
        setField(term20885, term20885.getClass(), "blockBuffer", null);
        setIntField(term20885, term20885.getClass(), "recordOffset", 0);
        setLongField(term20885, term20885.getClass(), "filepos", 0L);
        setField(term20885, term20885.getClass(), "raw", null);
        setField(term20885, term20885.getClass(), "names", null);
        setField(term20885, term20885.getClass(), "pending", null);
        setField(term20885, term20885.getClass(), "queue", null);
        setField(term20885, term20885.getClass(), "zipEncoding", null);
        setField(term20885, term20885.getClass(), "SINGLE", null);
        setLongField(term20885, term20885.getClass(), "bytesRead", 0L);
        term20894 = new Integer(0);
        term20896 = new Integer(0);
        term34031 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term34031, term34031.getClass(), "summary", null);
        setField(term34031, term34031.getClass(), "active", null);
        setBooleanField(term34031, term34031.getClass(), "isClosed", false);
        setBooleanField(term34031, term34031.getClass(), "hasHitEOF", false);
        setLongField(term34031, term34031.getClass(), "entrySize", 0L);
        setLongField(term34031, term34031.getClass(), "entryOffset", 0L);
        setIntField(term34031, term34031.getClass(), "readIdx", 0);
        setField(term34031, term34031.getClass(), "readBuf", null);
        setField(term34031, term34031.getClass(), "blockBuffer", null);
        setIntField(term34031, term34031.getClass(), "recordOffset", 0);
        setLongField(term34031, term34031.getClass(), "filepos", 0L);
        setField(term34031, term34031.getClass(), "raw", null);
        setField(term34031, term34031.getClass(), "names", null);
        setField(term34031, term34031.getClass(), "pending", null);
        setField(term34031, term34031.getClass(), "queue", null);
        setField(term34031, term34031.getClass(), "zipEncoding", null);
        setField(term34031, term34031.getClass(), "SINGLE", null);
        setLongField(term34031, term34031.getClass(), "bytesRead", 0L);
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
        args[1] = term20894;
        args[2] = term20896;
        Object retValue = callMethod(klass, "read", argTypes, term20885, args);
        assertTrue(recursiveEquals(term20885, term34031));
        assertTrue(recursiveEquals(term20894, 0));
        assertTrue(recursiveEquals(term20896, 0));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


