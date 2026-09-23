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
import java.lang.Boolean;

public class BooleanUtils_toBooleanObject_966475090157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17880;
     Object term17856;
     Object term18051;
     Object term18052;
     Object term18053;
     Object term18043;

    public BooleanUtils_toBooleanObject_966475090157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17880 = new Integer(20455427);
        term17856 = new Integer(402672272);
        term18051 = new Integer(20455427);
        term18052 = new Integer(402672272);
        term18053 = new Integer(20455427);
        term18043 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term17880;
        args[1] = term17856;
        args[2] = term17880;
        args[3] = null;
        Object retValue = callMethod(klass, "toBooleanObject", argTypes, null, args);
        assertTrue(recursiveEquals(term17880, term18051));
        assertTrue(recursiveEquals(term17856, term18052));
        assertTrue(recursiveEquals(term17880, term18053));
        assertTrue(recursiveEquals(retValue, term18043));
    }

};


