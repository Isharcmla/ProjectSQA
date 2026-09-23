package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_leftString_1426637078313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12416;
     Object term12475;

    public StrBuilder_leftString_1426637078313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12416 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12417 = (char[]) newCharArray(32);
        setField(term12416, term12416.getClass(), "buffer", term12417);
        setIntField(term12416, term12416.getClass(), "size", -1239406390);
        setField(term12416, term12416.getClass(), "newLine", "IpQuOGMgmj");
        setField(term12416, term12416.getClass(), "nullText", "pJbnHTYrxn");
        term12475 = new Integer(1557431527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12475;
        try {
            callMethod(klass, "leftString", argTypes, term12416, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


