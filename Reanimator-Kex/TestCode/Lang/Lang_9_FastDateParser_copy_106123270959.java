package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FastDateParser_copy_106123270959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8382;
     Object term8425;
     Object term8427;

    public FastDateParser_copy_106123270959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8382 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateParser$KeyValue", 3);
        Object term8383 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term8397 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term8411 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term8383, term8383.getClass(), "key", "DSNsTGYXDF");
        setIntField(term8383, term8383.getClass(), "value", 470895808);
        setElement(term8382, 0, term8383);
        setField(term8397, term8397.getClass(), "key", "sQvGcVjdEx");
        setIntField(term8397, term8397.getClass(), "value", 1787325291);
        setElement(term8382, 1, term8397);
        setField(term8411, term8411.getClass(), "key", "rLHAoqXgPh");
        setIntField(term8411, term8411.getClass(), "value", 1470349147);
        setElement(term8382, 2, term8411);
        term8425 = new Integer(-255317272);
        term8427 = (Object[]) newArray("java.lang.String", 5);
        setElement(term8427, 0, "zUlRdimJtU");
        setElement(term8427, 1, "vwbEQQNQrx");
        setElement(term8427, 2, "xtftXXMbem");
        setElement(term8427, 3, "cudZvLMQon");
        setElement(term8427, 4, "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term8382;
        args[1] = term8425;
        args[2] = term8427;
        try {
            callMethod(klass, "copy", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


