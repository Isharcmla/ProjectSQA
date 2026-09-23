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

public class TarArchiveInputStream_paxHeaders_516671723199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84675;

    public TarArchiveInputStream_paxHeaders_516671723199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84675 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term83960 = (byte[]) newByteArray(12);
        Object term84807 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term83960, 0, (byte) 1);
        setByteElement(term83960, 1, (byte) 1);
        setByteElement(term83960, 2, (byte) 1);
        setByteElement(term83960, 3, (byte) 1);
        setByteElement(term83960, 4, (byte) 1);
        setByteElement(term83960, 5, (byte) 1);
        setByteElement(term83960, 6, (byte) 1);
        setByteElement(term83960, 7, (byte) 1);
        setByteElement(term83960, 8, (byte) 1);
        setByteElement(term83960, 9, (byte) 1);
        setByteElement(term83960, 10, (byte) 1);
        setByteElement(term83960, 11, (byte) 1);
        setField(term84675, term84675.getClass(), "SINGLE", term83960);
        setBooleanField(term84675, term84675.getClass(), "hasHitEOF", false);
        setLongField(term84675, term84675.getClass(), "entryOffset", 0L);
        setLongField(term84675, term84675.getClass(), "entrySize", -9223372036854775806L);
        setField(term84675, term84675.getClass(), "currEntry", null);
        setIntField(term84675, term84675.getClass(), "recordSize", 489);
        setBooleanField(term84807, term84807.getClass(), "hasHitEOF", false);
        setLongField(term84807, term84807.getClass(), "entryOffset", 0L);
        setLongField(term84807, term84807.getClass(), "entrySize", 1L);
        setField(term84675, term84675.getClass(), "is", term84807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term84675, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


