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

public class CpioArchiveOutputStream_close_1120845083238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110638;

    public CpioArchiveOutputStream_close_1120845083238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110638 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term110682 = newInstance(Class.forName("java.io.PrintStream"));
        Object term110748 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setBooleanField(term110638, term110638.getClass(), "finished", true);
        setBooleanField(term110638, term110638.getClass(), "closed", false);
        setBooleanField(term110682, term110682.getClass(), "closed", false);
        setBooleanField(term110748, term110748.getClass(), "closed", false);
        setField(term110682, term110682.getClass(), "out", term110748);
        setField(term110638, term110638.getClass(), "out", term110682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term110638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


