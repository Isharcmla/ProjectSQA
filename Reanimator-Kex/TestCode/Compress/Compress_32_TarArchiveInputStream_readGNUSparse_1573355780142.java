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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_readGNUSparse_1573355780142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58997;

    public TarArchiveInputStream_readGNUSparse_1573355780142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58997 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term59117 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term59249 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term59117, term59117.getClass(), "isExtended", true);
        setField(term58997, term58997.getClass(), "currEntry", term59117);
        setIntField(term58997, term58997.getClass(), "recordSize", 0);
        setField(term58997, term58997.getClass(), "is", term59249);
        setLongField(term58997, term58997.getClass(), "bytesRead", 0L);
        setBooleanField(term58997, term58997.getClass(), "hasHitEOF", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readGNUSparse", argTypes, term58997, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


