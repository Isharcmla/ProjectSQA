package org.apache.commons.compress.archivers.ar;

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
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArArchiveInputStream_close_117547556811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public ArArchiveInputStream_close_117547556811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term7, term7.getClass(), "input", null);
        setLongField(term7, term7.getClass(), "offset", -8257434502486459194L);
        setBooleanField(term7, term7.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term7, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


