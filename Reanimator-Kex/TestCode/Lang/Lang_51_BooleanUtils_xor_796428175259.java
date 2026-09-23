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

public class BooleanUtils_xor_796428175259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32060;
     Object term32225;
     Object term32223;

    public BooleanUtils_xor_796428175259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32184 = new Boolean(true);
        term32060 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term32060, 0, term32184);
        setElement(term32060, 1, term32184);
        setElement(term32060, 2, term32184);
        setElement(term32060, 3, term32184);
        Boolean term32226 = new Boolean(true);
        Boolean term32227 = new Boolean(true);
        Boolean term32228 = new Boolean(true);
        Boolean term32229 = new Boolean(true);
        term32225 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term32225, 0, term32226);
        setElement(term32225, 1, term32227);
        setElement(term32225, 2, term32228);
        setElement(term32225, 3, term32229);
        term32223 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32060;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term32060, term32225));
        assertTrue(recursiveEquals(retValue, term32223));
    }

};


