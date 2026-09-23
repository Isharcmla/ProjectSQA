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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DumpArchiveInputStream_read_1544528404109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71339;

    public DumpArchiveInputStream_read_1544528404109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71339 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term71463 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term71167 = (byte[]) newByteArray(0);
        setBooleanField(term71339, term71339.getClass(), "hasHitEOF", false);
        setBooleanField(term71339, term71339.getClass(), "isClosed", false);
        setLongField(term71339, term71339.getClass(), "entryOffset", -8615139211357142636L);
        setLongField(term71339, term71339.getClass(), "entrySize", 8896016612129751445L);
        setField(term71339, term71339.getClass(), "active", term71463);
        setField(term71339, term71339.getClass(), "readBuf", term71167);
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
        args[2] = 2105769146;
        try {
            callMethod(klass, "read", argTypes, term71339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


