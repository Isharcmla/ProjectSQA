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

public class TarUtils_exceptionMessage_20819149226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term69;
     Object term71;
     Object term73;
     Object term75;

    public TarUtils_exceptionMessage_20819149226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = (byte[]) newByteArray(6);
        setByteElement(term62, 0, (byte) 67);
        setByteElement(term62, 1, (byte) 78);
        setByteElement(term62, 2, (byte) 87);
        setByteElement(term62, 3, (byte) 121);
        setByteElement(term62, 4, (byte) -99);
        setByteElement(term62, 5, (byte) -2);
        term69 = new Integer(-1339778481);
        term71 = new Integer(1725571209);
        term73 = new Integer(-522618178);
        term75 = new Byte((byte) -16);
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
        args[0] = term62;
        args[1] = term69;
        args[2] = term71;
        args[3] = term73;
        args[4] = term75;
        try {
            callMethod(klass, "exceptionMessage", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


