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

public class TarUtils_formatNameBytes_64295287719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term81;
     Object term83;
     Object term1680;

    public TarUtils_formatNameBytes_64295287719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = (byte[]) newByteArray(6);
        setByteElement(term74, 0, (byte) 78);
        setByteElement(term74, 1, (byte) 87);
        setByteElement(term74, 2, (byte) 121);
        setByteElement(term74, 3, (byte) -99);
        setByteElement(term74, 4, (byte) -2);
        setByteElement(term74, 5, (byte) -16);
        term81 = new Integer(1725571209);
        term83 = new Integer(-522618178);
        term1680 = (byte[]) newByteArray(6);
        setByteElement(term1680, 0, (byte) 78);
        setByteElement(term1680, 1, (byte) 87);
        setByteElement(term1680, 2, (byte) 121);
        setByteElement(term1680, 3, (byte) -99);
        setByteElement(term1680, 4, (byte) -2);
        setByteElement(term1680, 5, (byte) -16);
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
        args[1] = term74;
        args[2] = term81;
        args[3] = term83;
        Object retValue = callMethod(klass, "formatNameBytes", argTypes, null, args);
        assertTrue(recursiveEquals(term74, term1680));
        assertTrue(recursiveEquals(term81, 1725571209));
        assertTrue(recursiveEquals(term83, -522618178));
        assertTrue(recursiveEquals(retValue, 1202953031));
    }

};


