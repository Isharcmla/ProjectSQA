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

public class DumpArchiveInputStream_read_1544528404106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70774;

    public DumpArchiveInputStream_read_1544528404106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70774 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term70898 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term70596 = (byte[]) newByteArray(0);
        setBooleanField(term70774, term70774.getClass(), "hasHitEOF", false);
        setBooleanField(term70774, term70774.getClass(), "isClosed", false);
        setLongField(term70774, term70774.getClass(), "entryOffset", -9223372036854775806L);
        setLongField(term70774, term70774.getClass(), "entrySize", 2147481615L);
        setField(term70774, term70774.getClass(), "active", term70898);
        setField(term70774, term70774.getClass(), "readBuf", term70596);
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
        args[2] = -2147481616;
        try {
            callMethod(klass, "read", argTypes, term70774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


