package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleCH_52385266650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;
     Object term470;
     Object term512;

    public DoubleMetaphone_handleCH_52385266650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term456, term456.getClass(), "maxCodeLen", 4);
        term470 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term471 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term472 = (byte[]) newByteArray(16);
        Object term491 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term492 = (byte[]) newByteArray(16);
        setField(term471, term471.getClass(), "value", term472);
        setByteField(term471, term471.getClass(), "coder", (byte) -29);
        setIntField(term471, term471.getClass(), "count", -883034806);
        setField(term470, term470.getClass(), "primary", term471);
        setField(term491, term491.getClass(), "value", term492);
        setByteField(term491, term491.getClass(), "coder", (byte) -54);
        setIntField(term491, term491.getClass(), "count", 1585847225);
        setField(term470, term470.getClass(), "alternate", term491);
        setIntField(term470, term470.getClass(), "maxLength", 597278769);
        setField(term470, term470.getClass(), "this$0", null);
        term512 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "RMFIsYGgne";
        args[1] = term470;
        args[2] = term512;
        try {
            callMethod(klass, "handleCH", argTypes, term456, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


