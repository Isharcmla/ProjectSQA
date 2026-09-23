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

public class ArrayUtils_toPrimitive_985588790274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;
     Object term1195;
     Object term14323;
     Object term14296;

    public ArrayUtils_toPrimitive_985588790274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1179 = new Integer(-1922583790);
        Integer term1181 = new Integer(-616727354);
        Integer term1183 = new Integer(-1955890973);
        Integer term1185 = new Integer(-2038273078);
        Integer term1187 = new Integer(1227103734);
        Integer term1189 = new Integer(-1339778481);
        Integer term1191 = new Integer(1725571209);
        Integer term1193 = new Integer(-522618178);
        term1178 = (Object[]) newArray("java.lang.Integer", 8);
        setElement(term1178, 0, term1179);
        setElement(term1178, 1, term1181);
        setElement(term1178, 2, term1183);
        setElement(term1178, 3, term1185);
        setElement(term1178, 4, term1187);
        setElement(term1178, 5, term1189);
        setElement(term1178, 6, term1191);
        setElement(term1178, 7, term1193);
        term1195 = new Integer(1240914516);
        Integer term14324 = new Integer(-1922583790);
        Integer term14325 = new Integer(-616727354);
        Integer term14326 = new Integer(-1955890973);
        Integer term14327 = new Integer(-2038273078);
        Integer term14328 = new Integer(1227103734);
        Integer term14329 = new Integer(-1339778481);
        Integer term14330 = new Integer(1725571209);
        Integer term14331 = new Integer(-522618178);
        term14323 = (Object[]) newArray("java.lang.Integer", 8);
        setElement(term14323, 0, term14324);
        setElement(term14323, 1, term14325);
        setElement(term14323, 2, term14326);
        setElement(term14323, 3, term14327);
        setElement(term14323, 4, term14328);
        setElement(term14323, 5, term14329);
        setElement(term14323, 6, term14330);
        setElement(term14323, 7, term14331);
        term14296 = (int[]) newIntArray(8);
        setIntElement(term14296, 0, -1922583790);
        setIntElement(term14296, 1, -616727354);
        setIntElement(term14296, 2, -1955890973);
        setIntElement(term14296, 3, -2038273078);
        setIntElement(term14296, 4, 1227103734);
        setIntElement(term14296, 5, -1339778481);
        setIntElement(term14296, 6, 1725571209);
        setIntElement(term14296, 7, -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Integer"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1178;
        args[1] = term1195;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1178, term14323));
        assertTrue(recursiveEquals(term1195, 1240914516));
        assertTrue(recursiveEquals(retValue, term14296));
    }

};


