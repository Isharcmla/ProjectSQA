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

public class TarArchiveInputStream_readGNUSparse_1573355780177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78351;

    public TarArchiveInputStream_readGNUSparse_1573355780177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78351 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term78471 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term78539 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setBooleanField(term78471, term78471.getClass(), "isExtended", true);
        setField(term78351, term78351.getClass(), "currEntry", term78471);
        setIntField(term78351, term78351.getClass(), "recordSize", 0);
        setField(term78351, term78351.getClass(), "is", term78539);
        setLongField(term78351, term78351.getClass(), "bytesRead", 0L);
        setBooleanField(term78351, term78351.getClass(), "hasHitEOF", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readGNUSparse", argTypes, term78351, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


