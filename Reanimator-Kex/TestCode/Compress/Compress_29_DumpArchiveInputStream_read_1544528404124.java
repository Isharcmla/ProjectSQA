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

public class DumpArchiveInputStream_read_1544528404124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80226;

    public DumpArchiveInputStream_read_1544528404124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80226 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term80350 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term80048 = (byte[]) newByteArray(0);
        setBooleanField(term80226, term80226.getClass(), "hasHitEOF", false);
        setBooleanField(term80226, term80226.getClass(), "isClosed", false);
        setLongField(term80226, term80226.getClass(), "entryOffset", -8472165502066618880L);
        setLongField(term80226, term80226.getClass(), "entrySize", 3093078341034446401L);
        setField(term80226, term80226.getClass(), "active", term80350);
        setField(term80226, term80226.getClass(), "readBuf", term80048);
        setIntField(term80226, term80226.getClass(), "recordOffset", -2033181603);
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
        args[2] = 2033181603;
        try {
            callMethod(klass, "read", argTypes, term80226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


