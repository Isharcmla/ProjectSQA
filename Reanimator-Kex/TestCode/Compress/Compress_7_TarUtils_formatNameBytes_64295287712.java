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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Integer;

public class TarUtils_formatNameBytes_64295287712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term45;
     Object term47;
     Object term750;

    public TarUtils_formatNameBytes_64295287712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = (byte[]) newByteArray(3);
        setByteElement(term41, 0, (byte) 79);
        setByteElement(term41, 1, (byte) -119);
        setByteElement(term41, 2, (byte) -66);
        term45 = new Integer(-1922583790);
        term47 = new Integer(-616727354);
        term750 = (byte[]) newByteArray(3);
        setByteElement(term750, 0, (byte) 79);
        setByteElement(term750, 1, (byte) -119);
        setByteElement(term750, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = term41;
        args[2] = term45;
        args[3] = term47;
        Object retValue = callMethod(klass, "formatNameBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term41, term750));
        assertTrue(recursiveEquals(term45, -1922583790));
        assertTrue(recursiveEquals(term47, -616727354));
        assertTrue(recursiveEquals(retValue, 1755656152));
    }

};


