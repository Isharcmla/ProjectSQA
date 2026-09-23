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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class X7875_NewUnix_setGID_923279873116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35340;
     Object term35460;

    public X7875_NewUnix_setGID_923279873116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35340 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        term35460 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term35461 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term35462 = (int[]) newIntArray(1);
        setIntField(term35460, term35460.getClass(), "version", 0);
        setField(term35460, term35460.getClass(), "uid", null);
        setIntField(term35461, term35461.getClass(), "signum", 1);
        setIntElement(term35462, 0, -2147483648);
        setField(term35461, term35461.getClass(), "mag", term35462);
        setIntField(term35461, term35461.getClass(), "bitCountPlusOne", 0);
        setIntField(term35461, term35461.getClass(), "bitLengthPlusOne", 0);
        setIntField(term35461, term35461.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term35461, term35461.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term35460, term35460.getClass(), "gid", term35461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 2147483648L;
        callMethod(klass, "setGID", argTypes, term35340, args);
        assertTrue(recursiveEquals(term35340, term35460));
    }

};


