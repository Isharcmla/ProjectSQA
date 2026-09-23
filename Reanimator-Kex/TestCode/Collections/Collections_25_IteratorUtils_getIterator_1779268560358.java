package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.util.ArrayList;

public class IteratorUtils_getIterator_1779268560358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52227;
     Object term52239;
     Object term52231;

    public IteratorUtils_getIterator_1779268560358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52227 = new ArrayList();
        term52239 = new ArrayList();
        ArrayList term52235 = new ArrayList();
        term52231 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term52231, term52231.getClass(), "cursor", 0);
        setIntField(term52231, term52231.getClass(), "lastRet", -1);
        setIntField(term52231, term52231.getClass(), "expectedModCount", 0);
        setField(term52231, term52231.getClass(), "this$0", term52235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52227;
        Object retValue = callMethod(klass, "getIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term52227, term52239));
        assertTrue(recursiveEquals(retValue, term52231));
    }

};


