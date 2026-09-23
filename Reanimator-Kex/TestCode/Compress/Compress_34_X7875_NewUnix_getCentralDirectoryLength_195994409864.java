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
import java.lang.Object;

public class X7875_NewUnix_getCentralDirectoryLength_195994409864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10653;

    public X7875_NewUnix_getCentralDirectoryLength_195994409864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10653 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term10699 = newInstance(Class.forName("java.math.BigInteger"));
        Object term10745 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term10653, term10653.getClass(), "uid", term10699);
        setField(term10653, term10653.getClass(), "gid", term10745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCentralDirectoryLength", argTypes, term10653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


