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

public class TarArchiveOutputStream_close_1914055047167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282861;

    public TarArchiveOutputStream_close_1914055047167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282861 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term282969 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term283041 = newInstance(Class.forName("java.util.zip.InflaterInputStream"));
        setBooleanField(term282861, term282861.getClass(), "finished", true);
        setBooleanField(term282861, term282861.getClass(), "closed", false);
        setField(term282969, term282969.getClass(), "outStream", null);
        setField(term282969, term282969.getClass(), "inStream", term283041);
        setField(term282861, term282861.getClass(), "buffer", term282969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term282861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


