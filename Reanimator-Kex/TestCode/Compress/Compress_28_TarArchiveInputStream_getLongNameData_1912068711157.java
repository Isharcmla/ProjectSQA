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

public class TarArchiveInputStream_getLongNameData_1912068711157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78811;

    public TarArchiveInputStream_getLongNameData_1912068711157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78811 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term78147 = (byte[]) newByteArray(0);
        Object term78909 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        setField(term78811, term78811.getClass(), "SMALL_BUF", term78147);
        setBooleanField(term78811, term78811.getClass(), "hasHitEOF", false);
        setField(term78811, term78811.getClass(), "currEntry", null);
        setIntField(term78811, term78811.getClass(), "recordSize", 489);
        setField(term78811, term78811.getClass(), "is", term78909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLongNameData", argTypes, term78811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


