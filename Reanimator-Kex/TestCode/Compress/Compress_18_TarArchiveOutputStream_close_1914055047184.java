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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322561;

    public TarArchiveOutputStream_close_1914055047184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322561 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term322669 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term322733 = newInstance(Class.forName("java.util.jar.JarOutputStream"));
        setBooleanField(term322561, term322561.getClass(), "finished", true);
        setBooleanField(term322561, term322561.getClass(), "closed", false);
        setField(term322669, term322669.getClass(), "outStream", null);
        setField(term322669, term322669.getClass(), "inStream", null);
        setField(term322561, term322561.getClass(), "buffer", term322669);
        setField(term322561, term322561.getClass(), "out", term322733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term322561, args);
    }

};


