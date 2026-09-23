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

public class TarUtils_exceptionMessage_20819149217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term43;
     Object term45;
     Object term47;
     Object term49;

    public TarUtils_exceptionMessage_20819149217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = (byte[]) newByteArray(4);
        setByteElement(term38, 0, (byte) 83);
        setByteElement(term38, 1, (byte) 74);
        setByteElement(term38, 2, (byte) -71);
        setByteElement(term38, 3, (byte) 49);
        term43 = new Integer(-616727354);
        term45 = new Integer(-1955890973);
        term47 = new Integer(-2038273078);
        term49 = new Byte((byte) -54);
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
        args[0] = term38;
        args[1] = term43;
        args[2] = term45;
        args[3] = term47;
        args[4] = term49;
        try {
            callMethod(klass, "exceptionMessage", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


