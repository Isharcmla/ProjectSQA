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

public class TarArchiveInputStream_paxHeaders_516671723133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66021;

    public TarArchiveInputStream_paxHeaders_516671723133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66021 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term65731 = (byte[]) newByteArray(108);
        Object term66141 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteElement(term65731, 0, (byte) 1);
        setByteElement(term65731, 1, (byte) 1);
        setByteElement(term65731, 2, (byte) 1);
        setByteElement(term65731, 3, (byte) 1);
        setByteElement(term65731, 4, (byte) 1);
        setByteElement(term65731, 5, (byte) 1);
        setByteElement(term65731, 6, (byte) 1);
        setByteElement(term65731, 7, (byte) 1);
        setByteElement(term65731, 8, (byte) 1);
        setByteElement(term65731, 9, (byte) 1);
        setByteElement(term65731, 10, (byte) 1);
        setByteElement(term65731, 11, (byte) 1);
        setByteElement(term65731, 12, (byte) 1);
        setByteElement(term65731, 13, (byte) 1);
        setByteElement(term65731, 14, (byte) 1);
        setByteElement(term65731, 15, (byte) 1);
        setByteElement(term65731, 16, (byte) 1);
        setByteElement(term65731, 17, (byte) 1);
        setByteElement(term65731, 18, (byte) 1);
        setByteElement(term65731, 19, (byte) 1);
        setByteElement(term65731, 20, (byte) 1);
        setByteElement(term65731, 21, (byte) 1);
        setByteElement(term65731, 22, (byte) 1);
        setByteElement(term65731, 23, (byte) 1);
        setByteElement(term65731, 24, (byte) 1);
        setByteElement(term65731, 25, (byte) 1);
        setByteElement(term65731, 26, (byte) 1);
        setByteElement(term65731, 27, (byte) 1);
        setByteElement(term65731, 28, (byte) 1);
        setByteElement(term65731, 29, (byte) 1);
        setByteElement(term65731, 30, (byte) 1);
        setByteElement(term65731, 31, (byte) 1);
        setByteElement(term65731, 32, (byte) 1);
        setByteElement(term65731, 33, (byte) 1);
        setByteElement(term65731, 34, (byte) 1);
        setByteElement(term65731, 35, (byte) 1);
        setByteElement(term65731, 36, (byte) 1);
        setByteElement(term65731, 37, (byte) 1);
        setByteElement(term65731, 38, (byte) 1);
        setByteElement(term65731, 39, (byte) 1);
        setByteElement(term65731, 40, (byte) 1);
        setByteElement(term65731, 41, (byte) 1);
        setByteElement(term65731, 42, (byte) 1);
        setByteElement(term65731, 43, (byte) 1);
        setByteElement(term65731, 44, (byte) 1);
        setByteElement(term65731, 45, (byte) 1);
        setByteElement(term65731, 46, (byte) 1);
        setByteElement(term65731, 47, (byte) 1);
        setByteElement(term65731, 48, (byte) 1);
        setByteElement(term65731, 49, (byte) 1);
        setByteElement(term65731, 50, (byte) 1);
        setByteElement(term65731, 51, (byte) 1);
        setByteElement(term65731, 52, (byte) 1);
        setByteElement(term65731, 53, (byte) 1);
        setByteElement(term65731, 54, (byte) 1);
        setByteElement(term65731, 55, (byte) 1);
        setByteElement(term65731, 56, (byte) 1);
        setByteElement(term65731, 57, (byte) 1);
        setByteElement(term65731, 58, (byte) 1);
        setByteElement(term65731, 59, (byte) 1);
        setByteElement(term65731, 60, (byte) 1);
        setByteElement(term65731, 61, (byte) 1);
        setByteElement(term65731, 62, (byte) 1);
        setByteElement(term65731, 63, (byte) 1);
        setByteElement(term65731, 64, (byte) 1);
        setByteElement(term65731, 65, (byte) 1);
        setByteElement(term65731, 66, (byte) 1);
        setByteElement(term65731, 67, (byte) 1);
        setByteElement(term65731, 68, (byte) 1);
        setByteElement(term65731, 69, (byte) 1);
        setByteElement(term65731, 70, (byte) 1);
        setByteElement(term65731, 71, (byte) 1);
        setByteElement(term65731, 72, (byte) 1);
        setByteElement(term65731, 73, (byte) 1);
        setByteElement(term65731, 74, (byte) 1);
        setByteElement(term65731, 75, (byte) 1);
        setByteElement(term65731, 76, (byte) 1);
        setByteElement(term65731, 77, (byte) 1);
        setByteElement(term65731, 78, (byte) 1);
        setByteElement(term65731, 79, (byte) 1);
        setByteElement(term65731, 80, (byte) 1);
        setByteElement(term65731, 81, (byte) 1);
        setByteElement(term65731, 82, (byte) 1);
        setByteElement(term65731, 83, (byte) 1);
        setByteElement(term65731, 84, (byte) 1);
        setByteElement(term65731, 85, (byte) 1);
        setByteElement(term65731, 86, (byte) 1);
        setByteElement(term65731, 87, (byte) 1);
        setByteElement(term65731, 88, (byte) 1);
        setByteElement(term65731, 89, (byte) 1);
        setByteElement(term65731, 90, (byte) 1);
        setByteElement(term65731, 91, (byte) 1);
        setByteElement(term65731, 92, (byte) 1);
        setByteElement(term65731, 93, (byte) 1);
        setByteElement(term65731, 94, (byte) 1);
        setByteElement(term65731, 95, (byte) 1);
        setByteElement(term65731, 96, (byte) 1);
        setByteElement(term65731, 97, (byte) 1);
        setByteElement(term65731, 98, (byte) 1);
        setByteElement(term65731, 99, (byte) 1);
        setByteElement(term65731, 100, (byte) 1);
        setByteElement(term65731, 101, (byte) 1);
        setByteElement(term65731, 102, (byte) 1);
        setByteElement(term65731, 103, (byte) 1);
        setByteElement(term65731, 104, (byte) 1);
        setByteElement(term65731, 105, (byte) 1);
        setByteElement(term65731, 106, (byte) 1);
        setByteElement(term65731, 107, (byte) 1);
        setField(term66021, term66021.getClass(), "SINGLE", term65731);
        setBooleanField(term66021, term66021.getClass(), "hasHitEOF", false);
        setLongField(term66021, term66021.getClass(), "entryOffset", -9223372036854743040L);
        setLongField(term66021, term66021.getClass(), "entrySize", -9223372036854775807L);
        setField(term66021, term66021.getClass(), "currEntry", term66141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term66021, args);
    }

};


