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

public class TarArchiveInputStream_paxHeaders_51667172397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30055;

    public TarArchiveInputStream_paxHeaders_51667172397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30055 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term29828 = (byte[]) newByteArray(44);
        setByteElement(term29828, 0, (byte) 1);
        setByteElement(term29828, 1, (byte) 1);
        setByteElement(term29828, 2, (byte) 1);
        setByteElement(term29828, 3, (byte) 1);
        setByteElement(term29828, 4, (byte) 1);
        setByteElement(term29828, 5, (byte) 1);
        setByteElement(term29828, 6, (byte) 1);
        setByteElement(term29828, 7, (byte) 1);
        setByteElement(term29828, 8, (byte) 1);
        setByteElement(term29828, 9, (byte) 1);
        setByteElement(term29828, 10, (byte) 1);
        setByteElement(term29828, 11, (byte) 1);
        setByteElement(term29828, 12, (byte) 1);
        setByteElement(term29828, 13, (byte) 1);
        setByteElement(term29828, 14, (byte) 1);
        setByteElement(term29828, 15, (byte) 1);
        setByteElement(term29828, 16, (byte) 1);
        setByteElement(term29828, 17, (byte) 1);
        setByteElement(term29828, 18, (byte) 1);
        setByteElement(term29828, 19, (byte) 1);
        setByteElement(term29828, 20, (byte) 1);
        setByteElement(term29828, 21, (byte) 1);
        setByteElement(term29828, 22, (byte) 1);
        setByteElement(term29828, 23, (byte) 1);
        setByteElement(term29828, 24, (byte) 1);
        setByteElement(term29828, 25, (byte) 1);
        setByteElement(term29828, 26, (byte) 1);
        setByteElement(term29828, 27, (byte) 1);
        setByteElement(term29828, 28, (byte) 1);
        setByteElement(term29828, 29, (byte) 1);
        setByteElement(term29828, 30, (byte) 1);
        setByteElement(term29828, 31, (byte) 1);
        setByteElement(term29828, 32, (byte) 1);
        setByteElement(term29828, 33, (byte) 1);
        setByteElement(term29828, 34, (byte) 1);
        setByteElement(term29828, 35, (byte) 1);
        setByteElement(term29828, 36, (byte) 1);
        setByteElement(term29828, 37, (byte) 1);
        setByteElement(term29828, 38, (byte) 1);
        setByteElement(term29828, 39, (byte) 1);
        setByteElement(term29828, 40, (byte) 1);
        setByteElement(term29828, 41, (byte) 1);
        setByteElement(term29828, 42, (byte) 1);
        setByteElement(term29828, 43, (byte) 1);
        setField(term30055, term30055.getClass(), "SINGLE", term29828);
        setBooleanField(term30055, term30055.getClass(), "hasHitEOF", false);
        setLongField(term30055, term30055.getClass(), "entryOffset", 41943040L);
        setLongField(term30055, term30055.getClass(), "entrySize", 33554433L);
        setField(term30055, term30055.getClass(), "currEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term30055, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


