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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TarArchiveEntry_equals_28896926326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348153;
     Object term348273;

    public TarArchiveEntry_equals_28896926326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term348153, term348153.getClass(), "name", null);
        term348273 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term348273, term348273.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term348273;
        try {
            callMethod(klass, "equals", argTypes, term348153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


