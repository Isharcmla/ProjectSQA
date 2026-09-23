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

public class ToStringStyle_appendSummary_1193422743149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2679;
     Object term2723;

    public ToStringStyle_appendSummary_1193422743149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2679 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2692 = (byte[]) newByteArray(16);
        setField(term2679, term2679.getClass(), "toStringCache", "uWHnvSvaPl");
        setField(term2679, term2679.getClass(), "value", term2692);
        setByteField(term2679, term2679.getClass(), "coder", (byte) 71);
        setIntField(term2679, term2679.getClass(), "count", -1530420153);
        term2723 = (long[]) newLongArray(9);
        setLongElement(term2723, 0, 6811161968424632369L);
        setLongElement(term2723, 1, -7237588299778557629L);
        setLongElement(term2723, 2, 6967924379644551255L);
        setLongElement(term2723, 3, -2813493605142626659L);
        setLongElement(term2723, 4, -8885298608300233488L);
        setLongElement(term2723, 5, -4325723315152823407L);
        setLongElement(term2723, 6, 2535595959091595249L);
        setLongElement(term2723, 7, -5476826692763582090L);
        setLongElement(term2723, 8, -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2679;
        args[1] = "kBdSllIBVz";
        args[2] = term2723;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


