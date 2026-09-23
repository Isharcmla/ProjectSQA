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

public class TarArchiveOutputStream_close_1914055047219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123626;

    public TarArchiveOutputStream_close_1914055047219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123626 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term122484 = (byte[]) newByteArray(489);
        Object term123700 = newInstance(Class.forName("java.util.zip.InflaterOutputStream"));
        setBooleanField(term123626, term123626.getClass(), "finished", false);
        setBooleanField(term123626, term123626.getClass(), "haveUnclosedEntry", false);
        setField(term123626, term123626.getClass(), "recordBuf", term122484);
        setIntField(term123626, term123626.getClass(), "recordSize", 489);
        setField(term123626, term123626.getClass(), "out", term123700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term123626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


