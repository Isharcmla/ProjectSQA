package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class ArrayUtils_toPrimitive_985588790276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term1206;
     Object term14373;
     Object term14342;

    public ArrayUtils_toPrimitive_985588790276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1190 = new Integer(-1922583790);
        Integer term1192 = new Integer(-616727354);
        Integer term1194 = new Integer(-1955890973);
        Integer term1196 = new Integer(-2038273078);
        Integer term1198 = new Integer(1227103734);
        Integer term1200 = new Integer(-1339778481);
        Integer term1202 = new Integer(1725571209);
        Integer term1204 = new Integer(-522618178);
        term1189 = (Object[]) newArray("java.lang.Integer", 8);
        setElement(term1189, 0, term1190);
        setElement(term1189, 1, term1192);
        setElement(term1189, 2, term1194);
        setElement(term1189, 3, term1196);
        setElement(term1189, 4, term1198);
        setElement(term1189, 5, term1200);
        setElement(term1189, 6, term1202);
        setElement(term1189, 7, term1204);
        term1206 = new Integer(1240914516);
        Integer term14374 = new Integer(-1922583790);
        Integer term14375 = new Integer(-616727354);
        Integer term14376 = new Integer(-1955890973);
        Integer term14377 = new Integer(-2038273078);
        Integer term14378 = new Integer(1227103734);
        Integer term14379 = new Integer(-1339778481);
        Integer term14380 = new Integer(1725571209);
        Integer term14381 = new Integer(-522618178);
        term14373 = (Object[]) newArray("java.lang.Integer", 8);
        setElement(term14373, 0, term14374);
        setElement(term14373, 1, term14375);
        setElement(term14373, 2, term14376);
        setElement(term14373, 3, term14377);
        setElement(term14373, 4, term14378);
        setElement(term14373, 5, term14379);
        setElement(term14373, 6, term14380);
        setElement(term14373, 7, term14381);
        term14342 = (int[]) newIntArray(8);
        setIntElement(term14342, 0, -1922583790);
        setIntElement(term14342, 1, -616727354);
        setIntElement(term14342, 2, -1955890973);
        setIntElement(term14342, 3, -2038273078);
        setIntElement(term14342, 4, 1227103734);
        setIntElement(term14342, 5, -1339778481);
        setIntElement(term14342, 6, 1725571209);
        setIntElement(term14342, 7, -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Integer"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1189;
        args[1] = term1206;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1189, term14373));
        assertTrue(recursiveEquals(term1206, 1240914516));
        assertTrue(recursiveEquals(retValue, term14342));
    }

};


