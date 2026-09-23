package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;

public class IOUtils_skip_176195832129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7913;
     Object term10445;

    public IOUtils_skip_176195832129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7913 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        term10445 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term10445, term10445.getClass(), "buf", null);
        setIntField(term10445, term10445.getClass(), "pos", 0);
        setIntField(term10445, term10445.getClass(), "mark", 0);
        setIntField(term10445, term10445.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term7913;
        args[1] = 1073741824L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term7913, term10445));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


