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

public class TarArchiveOutputStream_addPaxHeaderForBigNumber_992162599161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89430;
     Object term89478;
     Object term89536;
     Object term89537;

    public TarArchiveOutputStream_addPaxHeaderForBigNumber_992162599161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89430 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term89478 = new HashMap();
        term89536 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term89536, term89536.getClass(), "currSize", 0L);
        setField(term89536, term89536.getClass(), "currName", null);
        setLongField(term89536, term89536.getClass(), "currBytes", 0L);
        setField(term89536, term89536.getClass(), "recordBuf", null);
        setIntField(term89536, term89536.getClass(), "assemLen", 0);
        setField(term89536, term89536.getClass(), "assemBuf", null);
        setIntField(term89536, term89536.getClass(), "longFileMode", 0);
        setIntField(term89536, term89536.getClass(), "bigNumberMode", 0);
        setIntField(term89536, term89536.getClass(), "recordsWritten", 0);
        setIntField(term89536, term89536.getClass(), "recordsPerBlock", 0);
        setIntField(term89536, term89536.getClass(), "recordSize", 0);
        setBooleanField(term89536, term89536.getClass(), "closed", false);
        setBooleanField(term89536, term89536.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term89536, term89536.getClass(), "finished", false);
        setField(term89536, term89536.getClass(), "out", null);
        setField(term89536, term89536.getClass(), "zipEncoding", null);
        setBooleanField(term89536, term89536.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term89536, term89536.getClass(), "oneByte", null);
        setLongField(term89536, term89536.getClass(), "bytesWritten", 0L);
        term89537 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = term89478;
        args[1] = null;
        args[2] = -2147498048L;
        args[3] = -9223372036854761411L;
        callMethod(klass, "addPaxHeaderForBigNumber", argTypes, term89430, args);
        assertTrue(recursiveEquals(term89430, term89536));
        assertTrue(recursiveEquals(term89478, term89537));
    }

};


