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
import java.lang.Object;
import java.lang.Boolean;

public class BooleanUtils_xor_796428175191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19836;
     Object term20133;
     Object term20131;

    public BooleanUtils_xor_796428175191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term19984 = new Boolean(false);
        Boolean term20032 = new Boolean(false);
        Boolean term20080 = new Boolean(true);
        term19836 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term19836, 0, term19984);
        setElement(term19836, 1, term20032);
        setElement(term19836, 2, term20032);
        setElement(term19836, 3, term20080);
        Boolean term20134 = new Boolean(false);
        Boolean term20135 = new Boolean(false);
        Boolean term20136 = new Boolean(false);
        Boolean term20137 = new Boolean(true);
        term20133 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term20133, 0, term20134);
        setElement(term20133, 1, term20135);
        setElement(term20133, 2, term20136);
        setElement(term20133, 3, term20137);
        term20131 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19836;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term19836, term20133));
        assertTrue(recursiveEquals(retValue, term20131));
    }

};


