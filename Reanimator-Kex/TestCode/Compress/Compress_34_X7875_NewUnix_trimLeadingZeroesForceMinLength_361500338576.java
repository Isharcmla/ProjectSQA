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

public class X7875_NewUnix_trimLeadingZeroesForceMinLength_361500338576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342287;
     Object term354776;
     Object term354528;

    public X7875_NewUnix_trimLeadingZeroesForceMinLength_361500338576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342287 = (byte[]) newByteArray(205);
        setByteElement(term342287, 164, (byte) -128);
        term354776 = (byte[]) newByteArray(205);
        setByteElement(term354776, 164, (byte) -128);
        term354528 = (byte[]) newByteArray(41);
        setByteElement(term354528, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term342287;
        Object retValue = callMethod(klass, "trimLeadingZeroesForceMinLength", argTypes, null, args);
        assertTrue(recursiveEquals(term342287, term354776));
        assertTrue(recursiveEquals(retValue, term354528));
    }

};


