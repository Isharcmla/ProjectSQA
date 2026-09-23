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

public class TarArchiveOutputStream_addPaxHeaderForBigNumber_992162599147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87206;
     Object term87254;
     Object term87295;
     Object term87296;

    public TarArchiveOutputStream_addPaxHeaderForBigNumber_992162599147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87206 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term87254 = new HashMap();
        term87295 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term87295, term87295.getClass(), "currSize", 0L);
        setField(term87295, term87295.getClass(), "currName", null);
        setLongField(term87295, term87295.getClass(), "currBytes", 0L);
        setField(term87295, term87295.getClass(), "recordBuf", null);
        setIntField(term87295, term87295.getClass(), "assemLen", 0);
        setField(term87295, term87295.getClass(), "assemBuf", null);
        setIntField(term87295, term87295.getClass(), "longFileMode", 0);
        setIntField(term87295, term87295.getClass(), "bigNumberMode", 0);
        setIntField(term87295, term87295.getClass(), "recordsWritten", 0);
        setIntField(term87295, term87295.getClass(), "recordsPerBlock", 0);
        setIntField(term87295, term87295.getClass(), "recordSize", 0);
        setBooleanField(term87295, term87295.getClass(), "closed", false);
        setBooleanField(term87295, term87295.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term87295, term87295.getClass(), "finished", false);
        setField(term87295, term87295.getClass(), "out", null);
        setField(term87295, term87295.getClass(), "zipEncoding", null);
        setBooleanField(term87295, term87295.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term87295, term87295.getClass(), "oneByte", null);
        setLongField(term87295, term87295.getClass(), "bytesWritten", 0L);
        term87296 = new HashMap();
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
        args[0] = term87254;
        args[1] = null;
        args[2] = 2147483648L;
        args[3] = 0L;
        callMethod(klass, "addPaxHeaderForBigNumber", argTypes, term87206, args);
        assertTrue(recursiveEquals(term87206, term87295));
        assertTrue(recursiveEquals(term87254, term87296));
    }

};


