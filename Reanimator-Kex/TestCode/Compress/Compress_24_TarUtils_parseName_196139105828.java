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
import java.lang.Integer;

public class TarUtils_parseName_196139105828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term99;
     Object term101;

    public TarUtils_parseName_196139105828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = (byte[]) newByteArray(6);
        setByteElement(term92, 0, (byte) 23);
        setByteElement(term92, 1, (byte) -15);
        setByteElement(term92, 2, (byte) 36);
        setByteElement(term92, 3, (byte) 118);
        setByteElement(term92, 4, (byte) 106);
        setByteElement(term92, 5, (byte) 98);
        term99 = new Integer(1585847225);
        term101 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
        Object[] args = new Object[4];
        args[0] = term92;
        args[1] = term99;
        args[2] = term101;
        args[3] = null;
        try {
            callMethod(klass, "parseName", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


