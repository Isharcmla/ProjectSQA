package org.apache.commons.lang3.time;

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
import java.io.NotActiveException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateParser_readObject_147751483971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19071;
     Object term19127;

    public FastDateParser_readObject_147751483971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19071 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        term19127 = newInstance(Class.forName("java.io.ObjectInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = term19127;
        try {
            callMethod(klass, "readObject", argTypes, term19071, args);
            assertTrue(false);
        }
        catch (NotActiveException e) {
        }

    }

};


