package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;
import java.lang.Integer;

public class SevenZFile_matches_76353399556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12979;
     Object term12989;
     Object term26451;

    public SevenZFile_matches_76353399556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12979 = (byte[]) newByteArray(9);
        setByteElement(term12979, 0, (byte) -57);
        setByteElement(term12979, 1, (byte) -33);
        setByteElement(term12979, 2, (byte) 17);
        setByteElement(term12979, 3, (byte) -102);
        setByteElement(term12979, 4, (byte) 31);
        setByteElement(term12979, 5, (byte) 12);
        setByteElement(term12979, 6, (byte) 102);
        setByteElement(term12979, 7, (byte) 126);
        setByteElement(term12979, 8, (byte) 21);
        term12989 = new Integer(273590437);
        term26451 = (byte[]) newByteArray(9);
        setByteElement(term26451, 0, (byte) -57);
        setByteElement(term26451, 1, (byte) -33);
        setByteElement(term26451, 2, (byte) 17);
        setByteElement(term26451, 3, (byte) -102);
        setByteElement(term26451, 4, (byte) 31);
        setByteElement(term26451, 5, (byte) 12);
        setByteElement(term26451, 6, (byte) 102);
        setByteElement(term26451, 7, (byte) 126);
        setByteElement(term26451, 8, (byte) 21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12979;
        args[1] = term12989;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term12979, term26451));
        assertTrue(recursiveEquals(term12989, 273590437));
        assertTrue(recursiveEquals(retValue, false));
    }

};


