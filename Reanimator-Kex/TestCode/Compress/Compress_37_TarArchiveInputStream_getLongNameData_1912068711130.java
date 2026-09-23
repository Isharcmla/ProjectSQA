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

public class TarArchiveInputStream_getLongNameData_1912068711130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55639;

    public TarArchiveInputStream_getLongNameData_1912068711130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55639 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term55447 = (byte[]) newByteArray(0);
        Object term55701 = newInstance(Class.forName("java.util.jar.JarInputStream"));
        setField(term55639, term55639.getClass(), "SMALL_BUF", term55447);
        setBooleanField(term55639, term55639.getClass(), "hasHitEOF", false);
        setField(term55639, term55639.getClass(), "currEntry", null);
        setIntField(term55639, term55639.getClass(), "recordSize", 0);
        setField(term55639, term55639.getClass(), "is", term55701);
        setLongField(term55639, term55639.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongNameData", argTypes, term55639, args);
    }

};


