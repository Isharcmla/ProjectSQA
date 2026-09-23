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

public class CpioArchiveOutputStream_close_1120845083192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82200;

    public CpioArchiveOutputStream_close_1120845083192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82200 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term82262 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        Object term82358 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeOutputStream"));
        setBooleanField(term82200, term82200.getClass(), "finished", true);
        setBooleanField(term82200, term82200.getClass(), "closed", false);
        setBooleanField(term82262, term82262.getClass(), "closed", false);
        setBooleanField(term82358, term82358.getClass(), "closed", false);
        setField(term82262, term82262.getClass(), "out", term82358);
        setField(term82200, term82200.getClass(), "out", term82262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term82200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


