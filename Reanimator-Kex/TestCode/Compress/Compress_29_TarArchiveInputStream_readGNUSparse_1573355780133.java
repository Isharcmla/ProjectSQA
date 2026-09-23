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

public class TarArchiveInputStream_readGNUSparse_1573355780133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44811;

    public TarArchiveInputStream_readGNUSparse_1573355780133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44811 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term44931 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term45063 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term44931, term44931.getClass(), "isExtended", true);
        setField(term44811, term44811.getClass(), "currEntry", term44931);
        setIntField(term44811, term44811.getClass(), "recordSize", 0);
        setField(term44811, term44811.getClass(), "is", term45063);
        setLongField(term44811, term44811.getClass(), "bytesRead", 0L);
        setBooleanField(term44811, term44811.getClass(), "hasHitEOF", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readGNUSparse", argTypes, term44811, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


