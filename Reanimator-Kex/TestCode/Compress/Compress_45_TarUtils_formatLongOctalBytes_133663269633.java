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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class TarUtils_formatLongOctalBytes_133663269633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;
     Object term217;
     Object term223;
     Object term225;

    public TarUtils_formatLongOctalBytes_133663269633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = new Long(-8257434502486459194L);
        term217 = (byte[]) newByteArray(5);
        setByteElement(term217, 0, (byte) 100);
        setByteElement(term217, 1, (byte) 106);
        setByteElement(term217, 2, (byte) -57);
        setByteElement(term217, 3, (byte) -103);
        setByteElement(term217, 4, (byte) 98);
        term223 = new Integer(-1007160944);
        term225 = new Integer(1135664017);
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
        args[0] = term215;
        args[1] = term217;
        args[2] = term223;
        args[3] = term225;
        try {
            callMethod(klass, "formatLongOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


