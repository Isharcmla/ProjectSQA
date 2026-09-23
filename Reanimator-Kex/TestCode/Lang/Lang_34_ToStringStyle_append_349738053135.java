package org.apache.commons.lang3.builder;

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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class ToStringStyle_append_349738053135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1510;
     Object term1554;

    public ToStringStyle_append_349738053135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1510 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1523 = (byte[]) newByteArray(16);
        setField(term1510, term1510.getClass(), "toStringCache", "IDCWpPLRkE");
        setField(term1510, term1510.getClass(), "value", term1523);
        setByteField(term1510, term1510.getClass(), "coder", (byte) -2);
        setIntField(term1510, term1510.getClass(), "count", -2068769794);
        term1554 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term1510;
        args[1] = "nyiiPDVjAc";
        args[2] = term1554;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


