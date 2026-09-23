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
import java.lang.Boolean;

public class DoubleMetaphone_handleS_47095262459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;
     Object term1376;
     Object term1418;
     Object term1420;

    public DoubleMetaphone_handleS_47095262459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1362 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1362, term1362.getClass(), "maxCodeLen", 4);
        term1376 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1377 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1378 = (byte[]) newByteArray(16);
        Object term1397 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1398 = (byte[]) newByteArray(16);
        setField(term1377, term1377.getClass(), "value", term1378);
        setByteField(term1377, term1377.getClass(), "coder", (byte) -112);
        setIntField(term1377, term1377.getClass(), "count", -14890619);
        setField(term1376, term1376.getClass(), "primary", term1377);
        setField(term1397, term1397.getClass(), "value", term1398);
        setByteField(term1397, term1397.getClass(), "coder", (byte) -111);
        setIntField(term1397, term1397.getClass(), "count", 1632125673);
        setField(term1376, term1376.getClass(), "alternate", term1397);
        setIntField(term1376, term1376.getClass(), "maxLength", 454281060);
        setField(term1376, term1376.getClass(), "this$0", null);
        term1418 = new Integer(-1786399638);
        term1420 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "HyxfbSQYBe";
        args[1] = term1376;
        args[2] = term1418;
        args[3] = term1420;
        try {
            callMethod(klass, "handleS", argTypes, term1362, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


