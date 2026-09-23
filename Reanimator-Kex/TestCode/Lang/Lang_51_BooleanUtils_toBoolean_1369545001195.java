package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Integer;

public class BooleanUtils_toBoolean_1369545001195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20334;
     Object term20310;
     Object term20387;
     Object term20388;
     Object term20389;

    public BooleanUtils_toBoolean_1369545001195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20334 = new Integer(20455427);
        term20310 = new Integer(402672272);
        term20387 = new Integer(20455427);
        term20388 = new Integer(402672272);
        term20389 = new Integer(20455427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        Object[] args = new Object[3];
        args[0] = term20334;
        args[1] = term20310;
        args[2] = term20334;
        Object retValue = callMethod(klass, "toBoolean", argTypes, null, args);
        assertTrue(recursiveEquals(term20334, term20387));
        assertTrue(recursiveEquals(term20310, term20388));
        assertTrue(recursiveEquals(term20334, term20389));
        assertTrue(recursiveEquals(retValue, false));
    }

};


