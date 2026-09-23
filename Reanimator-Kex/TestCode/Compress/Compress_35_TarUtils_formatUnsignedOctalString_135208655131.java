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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class TarUtils_formatUnsignedOctalString_135208655131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term181;
     Object term188;
     Object term190;

    public TarUtils_formatUnsignedOctalString_135208655131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = new Long(2442117782898005296L);
        term181 = (byte[]) newByteArray(6);
        setByteElement(term181, 0, (byte) 111);
        setByteElement(term181, 1, (byte) 99);
        setByteElement(term181, 2, (byte) -12);
        setByteElement(term181, 3, (byte) -61);
        setByteElement(term181, 4, (byte) -85);
        setByteElement(term181, 5, (byte) -22);
        term188 = new Integer(-655067527);
        term190 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term179;
        args[1] = term181;
        args[2] = term188;
        args[3] = term190;
        try {
            callMethod(klass, "formatUnsignedOctalString", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


