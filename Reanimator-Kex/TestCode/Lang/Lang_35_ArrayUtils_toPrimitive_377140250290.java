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
import java.lang.Boolean;

public class ArrayUtils_toPrimitive_377140250290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;
     Object term14716;
     Object term14699;

    public ArrayUtils_toPrimitive_377140250290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1300 = new Boolean(false);
        Boolean term1302 = new Boolean(false);
        Boolean term1304 = new Boolean(false);
        Boolean term1306 = new Boolean(false);
        Boolean term1308 = new Boolean(true);
        term1299 = (Object[]) newArray("java.lang.Boolean", 5);
        setElement(term1299, 0, term1300);
        setElement(term1299, 1, term1302);
        setElement(term1299, 2, term1304);
        setElement(term1299, 3, term1306);
        setElement(term1299, 4, term1308);
        Boolean term14717 = new Boolean(false);
        Boolean term14718 = new Boolean(false);
        Boolean term14719 = new Boolean(false);
        Boolean term14720 = new Boolean(false);
        Boolean term14721 = new Boolean(true);
        term14716 = (Object[]) newArray("java.lang.Boolean", 5);
        setElement(term14716, 0, term14717);
        setElement(term14716, 1, term14718);
        setElement(term14716, 2, term14719);
        setElement(term14716, 3, term14720);
        setElement(term14716, 4, term14721);
        term14699 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term14699, 4, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1299;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1299, term14716));
        assertTrue(recursiveEquals(retValue, term14699));
    }

};


