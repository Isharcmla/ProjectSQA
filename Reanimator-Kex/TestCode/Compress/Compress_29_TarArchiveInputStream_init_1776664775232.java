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
import java.lang.Object;

public class TarArchiveInputStream_init_1776664775232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105920;

    public TarArchiveInputStream_init_1776664775232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105722 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term105788 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setField(term105722, term105722.getClass(), "SINGLE", null);
        setLongField(term105722, term105722.getClass(), "bytesRead", 0L);
        setField(term105722, term105722.getClass(), "SMALL_BUF", null);
        setField(term105722, term105722.getClass(), "is", term105788);
        setBooleanField(term105722, term105722.getClass(), "hasHitEOF", false);
        term105920 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
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
        args[0] = term105920;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


