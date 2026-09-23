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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79956;

    public TarArchiveInputStream_paxHeaders_516671723170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79956 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term79714 = (byte[]) newByteArray(18);
        Object term80088 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term79714, 0, (byte) 1);
        setByteElement(term79714, 1, (byte) 1);
        setByteElement(term79714, 2, (byte) 1);
        setByteElement(term79714, 3, (byte) 1);
        setByteElement(term79714, 4, (byte) 1);
        setByteElement(term79714, 5, (byte) 1);
        setByteElement(term79714, 6, (byte) 1);
        setByteElement(term79714, 7, (byte) 1);
        setByteElement(term79714, 8, (byte) 1);
        setByteElement(term79714, 9, (byte) 1);
        setByteElement(term79714, 10, (byte) 1);
        setByteElement(term79714, 11, (byte) 1);
        setByteElement(term79714, 12, (byte) 1);
        setByteElement(term79714, 13, (byte) 1);
        setByteElement(term79714, 14, (byte) 1);
        setByteElement(term79714, 15, (byte) 1);
        setByteElement(term79714, 16, (byte) 1);
        setByteElement(term79714, 17, (byte) 1);
        setField(term79956, term79956.getClass(), "SINGLE", term79714);
        setBooleanField(term79956, term79956.getClass(), "hasHitEOF", false);
        setLongField(term79956, term79956.getClass(), "entryOffset", 1048576L);
        setLongField(term79956, term79956.getClass(), "entrySize", 1L);
        setField(term79956, term79956.getClass(), "currEntry", null);
        setIntField(term79956, term79956.getClass(), "recordSize", 0);
        setField(term79956, term79956.getClass(), "is", term80088);
        setLongField(term79956, term79956.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term79956, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


