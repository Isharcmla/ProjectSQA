package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_close_1120845083231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95124;

    public CpioArchiveOutputStream_close_1120845083231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95124 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term95196 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        setBooleanField(term95124, term95124.getClass(), "finished", true);
        setBooleanField(term95124, term95124.getClass(), "closed", false);
        setBooleanField(term95196, term95196.getClass(), "closed", false);
        setField(term95124, term95124.getClass(), "out", term95196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term95124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


