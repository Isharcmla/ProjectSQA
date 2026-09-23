package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class X7875_NewUnix_trimLeadingZeroesForceMinLength_36150033835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term1069;
     Object term1061;

    public X7875_NewUnix_trimLeadingZeroesForceMinLength_36150033835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = (byte[]) newByteArray(3);
        setByteElement(term210, 0, (byte) 79);
        setByteElement(term210, 1, (byte) -119);
        setByteElement(term210, 2, (byte) -66);
        term1069 = (byte[]) newByteArray(3);
        setByteElement(term1069, 0, (byte) 79);
        setByteElement(term1069, 1, (byte) -119);
        setByteElement(term1069, 2, (byte) -66);
        term1061 = (byte[]) newByteArray(3);
        setByteElement(term1061, 0, (byte) 79);
        setByteElement(term1061, 1, (byte) -119);
        setByteElement(term1061, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term210;
        Object retValue = callMethod(klass, "trimLeadingZeroesForceMinLength", argTypes, null, args);
        assertTrue(recursiveEquals(term210, term1069));
        assertTrue(recursiveEquals(retValue, term1061));
    }

};


