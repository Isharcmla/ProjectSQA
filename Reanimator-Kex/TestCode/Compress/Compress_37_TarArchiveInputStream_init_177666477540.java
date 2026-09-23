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
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;

public class TarArchiveInputStream_init_177666477540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term55;
     Object term12334;

    public TarArchiveInputStream_init_177666477540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = new Integer(-1922583790);
        term55 = new Integer(-616727354);
        HashMap term12341 = new HashMap();
        term12334 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12335 = (byte[]) newByteArray(256);
        Object term12336 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term12342 = (byte[]) newByteArray(1);
        setField(term12334, term12334.getClass(), "SMALL_BUF", term12335);
        setIntField(term12334, term12334.getClass(), "recordSize", -616727354);
        setIntField(term12334, term12334.getClass(), "blockSize", -1922583790);
        setBooleanField(term12334, term12334.getClass(), "hasHitEOF", false);
        setLongField(term12334, term12334.getClass(), "entrySize", 0L);
        setLongField(term12334, term12334.getClass(), "entryOffset", 0L);
        setField(term12334, term12334.getClass(), "is", null);
        setField(term12334, term12334.getClass(), "currEntry", null);
        setField(term12336, term12336.getClass(), "charsetName", "MuLcgQHgqz");
        setField(term12334, term12334.getClass(), "zipEncoding", term12336);
        setField(term12334, term12334.getClass(), "encoding", "MuLcgQHgqz");
        setField(term12334, term12334.getClass(), "globalPaxHeaders", term12341);
        setField(term12334, term12334.getClass(), "SINGLE", term12342);
        setLongField(term12334, term12334.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term53;
        args[2] = term55;
        args[3] = "MuLcgQHgqz";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12334));
        assertTrue(recursiveEquals(term53, null));
        assertTrue(recursiveEquals(term55, -1922583790));
    }

};


