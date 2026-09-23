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

public class ArrayUtils_toPrimitive_377140250288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288;
     Object term14670;
     Object term14653;

    public ArrayUtils_toPrimitive_377140250288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1289 = new Boolean(false);
        Boolean term1291 = new Boolean(false);
        Boolean term1293 = new Boolean(false);
        Boolean term1295 = new Boolean(false);
        Boolean term1297 = new Boolean(true);
        term1288 = (Object[]) newArray("java.lang.Boolean", 5);
        setElement(term1288, 0, term1289);
        setElement(term1288, 1, term1291);
        setElement(term1288, 2, term1293);
        setElement(term1288, 3, term1295);
        setElement(term1288, 4, term1297);
        Boolean term14671 = new Boolean(false);
        Boolean term14672 = new Boolean(false);
        Boolean term14673 = new Boolean(false);
        Boolean term14674 = new Boolean(false);
        Boolean term14675 = new Boolean(true);
        term14670 = (Object[]) newArray("java.lang.Boolean", 5);
        setElement(term14670, 0, term14671);
        setElement(term14670, 1, term14672);
        setElement(term14670, 2, term14673);
        setElement(term14670, 3, term14674);
        setElement(term14670, 4, term14675);
        term14653 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term14653, 4, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1288;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1288, term14670));
        assertTrue(recursiveEquals(retValue, term14653));
    }

};


