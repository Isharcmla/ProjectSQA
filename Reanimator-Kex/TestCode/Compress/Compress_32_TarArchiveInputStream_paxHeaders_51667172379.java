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

public class TarArchiveInputStream_paxHeaders_51667172379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27019;

    public TarArchiveInputStream_paxHeaders_51667172379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27019 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term26792 = (byte[]) newByteArray(44);
        setByteElement(term26792, 0, (byte) 1);
        setByteElement(term26792, 1, (byte) 1);
        setByteElement(term26792, 2, (byte) 1);
        setByteElement(term26792, 3, (byte) 1);
        setByteElement(term26792, 4, (byte) 1);
        setByteElement(term26792, 5, (byte) 1);
        setByteElement(term26792, 6, (byte) 1);
        setByteElement(term26792, 7, (byte) 1);
        setByteElement(term26792, 8, (byte) 1);
        setByteElement(term26792, 9, (byte) 1);
        setByteElement(term26792, 10, (byte) 1);
        setByteElement(term26792, 11, (byte) 1);
        setByteElement(term26792, 12, (byte) 1);
        setByteElement(term26792, 13, (byte) 1);
        setByteElement(term26792, 14, (byte) 1);
        setByteElement(term26792, 15, (byte) 1);
        setByteElement(term26792, 16, (byte) 1);
        setByteElement(term26792, 17, (byte) 1);
        setByteElement(term26792, 18, (byte) 1);
        setByteElement(term26792, 19, (byte) 1);
        setByteElement(term26792, 20, (byte) 1);
        setByteElement(term26792, 21, (byte) 1);
        setByteElement(term26792, 22, (byte) 1);
        setByteElement(term26792, 23, (byte) 1);
        setByteElement(term26792, 24, (byte) 1);
        setByteElement(term26792, 25, (byte) 1);
        setByteElement(term26792, 26, (byte) 1);
        setByteElement(term26792, 27, (byte) 1);
        setByteElement(term26792, 28, (byte) 1);
        setByteElement(term26792, 29, (byte) 1);
        setByteElement(term26792, 30, (byte) 1);
        setByteElement(term26792, 31, (byte) 1);
        setByteElement(term26792, 32, (byte) 1);
        setByteElement(term26792, 33, (byte) 1);
        setByteElement(term26792, 34, (byte) 1);
        setByteElement(term26792, 35, (byte) 1);
        setByteElement(term26792, 36, (byte) 1);
        setByteElement(term26792, 37, (byte) 1);
        setByteElement(term26792, 38, (byte) 1);
        setByteElement(term26792, 39, (byte) 1);
        setByteElement(term26792, 40, (byte) 1);
        setByteElement(term26792, 41, (byte) 1);
        setByteElement(term26792, 42, (byte) 1);
        setByteElement(term26792, 43, (byte) 1);
        setField(term27019, term27019.getClass(), "SINGLE", term26792);
        setBooleanField(term27019, term27019.getClass(), "hasHitEOF", false);
        setLongField(term27019, term27019.getClass(), "entryOffset", 41943040L);
        setLongField(term27019, term27019.getClass(), "entrySize", 33554433L);
        setField(term27019, term27019.getClass(), "currEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term27019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


