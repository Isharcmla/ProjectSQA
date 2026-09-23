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

public class X7875_NewUnix_equals_166772100173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14946;
     Object term15062;
     Object term15070;
     Object term15071;

    public X7875_NewUnix_equals_166772100173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14946 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setIntField(term14946, term14946.getClass(), "version", -1);
        term15062 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setIntField(term15062, term15062.getClass(), "version", 0);
        term15070 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setIntField(term15070, term15070.getClass(), "version", -1);
        setField(term15070, term15070.getClass(), "uid", null);
        setField(term15070, term15070.getClass(), "gid", null);
        term15071 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        setIntField(term15071, term15071.getClass(), "version", 0);
        setField(term15071, term15071.getClass(), "uid", null);
        setField(term15071, term15071.getClass(), "gid", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15062;
        Object retValue = callMethod(klass, "equals", argTypes, term14946, args);
        assertTrue(recursiveEquals(term14946, term15070));
        assertTrue(recursiveEquals(term15062, term15071));
        assertTrue(recursiveEquals(retValue, false));
    }

};


