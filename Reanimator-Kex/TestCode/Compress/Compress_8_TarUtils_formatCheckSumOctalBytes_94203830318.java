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

public class TarUtils_formatCheckSumOctalBytes_94203830318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object term120;
     Object term127;
     Object term129;

    public TarUtils_formatCheckSumOctalBytes_94203830318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = new Long(-8400487765614892086L);
        term120 = (byte[]) newByteArray(6);
        setByteElement(term120, 0, (byte) 23);
        setByteElement(term120, 1, (byte) -15);
        setByteElement(term120, 2, (byte) 36);
        setByteElement(term120, 3, (byte) 118);
        setByteElement(term120, 4, (byte) 106);
        setByteElement(term120, 5, (byte) 98);
        term127 = new Integer(597278769);
        term129 = new Integer(-1685132342);
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
        args[0] = term118;
        args[1] = term120;
        args[2] = term127;
        args[3] = term129;
        try {
            callMethod(klass, "formatCheckSumOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


