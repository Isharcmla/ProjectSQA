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
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99692;

    public TarArchiveOutputStream_close_1914055047121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99692 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term99800 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term99848 = newInstance(Class.forName("java.io.InputStream$1"));
        setBooleanField(term99692, term99692.getClass(), "finished", true);
        setBooleanField(term99692, term99692.getClass(), "closed", false);
        setField(term99800, term99800.getClass(), "outStream", null);
        setField(term99800, term99800.getClass(), "inStream", term99848);
        setField(term99692, term99692.getClass(), "buffer", term99800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term99692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


