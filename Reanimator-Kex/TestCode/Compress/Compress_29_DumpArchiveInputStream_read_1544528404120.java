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

public class DumpArchiveInputStream_read_1544528404120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78565;

    public DumpArchiveInputStream_read_1544528404120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78565 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term78689 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term78381 = (byte[]) newByteArray(0);
        setBooleanField(term78565, term78565.getClass(), "hasHitEOF", false);
        setBooleanField(term78565, term78565.getClass(), "isClosed", false);
        setLongField(term78565, term78565.getClass(), "entryOffset", -9223372036854775806L);
        setLongField(term78565, term78565.getClass(), "entrySize", -4611686016279904257L);
        setField(term78565, term78565.getClass(), "active", term78689);
        setField(term78565, term78565.getClass(), "readBuf", term78381);
        setIntField(term78565, term78565.getClass(), "recordOffset", -2147483645);
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
        args[2] = -2147483643;
        try {
            callMethod(klass, "read", argTypes, term78565, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


