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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Byte;

public class TarUtils_exceptionMessage_20819149212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term21;
     Object term23;
     Object term25;
     Object term27;

    public TarUtils_exceptionMessage_20819149212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = (byte[]) newByteArray(4);
        setByteElement(term16, 0, (byte) -58);
        setByteElement(term16, 1, (byte) -29);
        setByteElement(term16, 2, (byte) -54);
        setByteElement(term16, 3, (byte) -10);
        term21 = new Integer(1484323161);
        term23 = new Integer(391863371);
        term25 = new Integer(-1922583790);
        term27 = new Byte((byte) 79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = byte.class;
        Object[] args = new Object[5];
        args[0] = term16;
        args[1] = term21;
        args[2] = term23;
        args[3] = term25;
        args[4] = term27;
        try {
            callMethod(klass, "exceptionMessage", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


