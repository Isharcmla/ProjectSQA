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

public class TarUtils_formatLongOctalBytes_133663269622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term133;
     Object term141;
     Object term143;

    public TarUtils_formatLongOctalBytes_133663269622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = new Long(-8257434502486459194L);
        term133 = (byte[]) newByteArray(7);
        setByteElement(term133, 0, (byte) 67);
        setByteElement(term133, 1, (byte) 66);
        setByteElement(term133, 2, (byte) -121);
        setByteElement(term133, 3, (byte) -119);
        setByteElement(term133, 4, (byte) 71);
        setByteElement(term133, 5, (byte) 80);
        setByteElement(term133, 6, (byte) 42);
        term141 = new Integer(-1685132342);
        term143 = new Integer(-1456670397);
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
        args[0] = term131;
        args[1] = term133;
        args[2] = term141;
        args[3] = term143;
        try {
            callMethod(klass, "formatLongOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


