package org.apache.commons.compress.archivers.sevenz;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SevenZOutputFile_write_199551133261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38077;

    public SevenZOutputFile_write_199551133261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38077 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        setField(term38077, term38077.getClass(), "currentOutputStream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 1;
        try {
            callMethod(klass, "write", argTypes, term38077, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


