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

public class TarArchiveOutputStream_close_1914055047145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276736;

    public TarArchiveOutputStream_close_1914055047145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276736 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term276844 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term276978 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term276736, term276736.getClass(), "finished", true);
        setBooleanField(term276736, term276736.getClass(), "closed", false);
        setField(term276844, term276844.getClass(), "outStream", null);
        setField(term276844, term276844.getClass(), "inStream", null);
        setField(term276736, term276736.getClass(), "buffer", term276844);
        setField(term276736, term276736.getClass(), "out", term276978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term276736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


