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

public class TarUtils_formatLongOctalBytes_133663269615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term88;
     Object term95;
     Object term97;

    public TarUtils_formatLongOctalBytes_133663269615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = new Long(-8257434502486459194L);
        term88 = (byte[]) newByteArray(6);
        setByteElement(term88, 0, (byte) 67);
        setByteElement(term88, 1, (byte) 78);
        setByteElement(term88, 2, (byte) 87);
        setByteElement(term88, 3, (byte) 121);
        setByteElement(term88, 4, (byte) -99);
        setByteElement(term88, 5, (byte) -2);
        term95 = new Integer(1725571209);
        term97 = new Integer(-522618178);
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
        args[0] = term86;
        args[1] = term88;
        args[2] = term95;
        args[3] = term97;
        try {
            callMethod(klass, "formatLongOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


