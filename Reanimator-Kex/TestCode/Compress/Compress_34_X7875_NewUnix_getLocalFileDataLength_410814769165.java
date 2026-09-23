package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class X7875_NewUnix_getLocalFileDataLength_410814769165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48866;

    public X7875_NewUnix_getLocalFileDataLength_410814769165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48866 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setField(term48866, term48866.getClass(), "uid", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLocalFileDataLength", argTypes, term48866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


