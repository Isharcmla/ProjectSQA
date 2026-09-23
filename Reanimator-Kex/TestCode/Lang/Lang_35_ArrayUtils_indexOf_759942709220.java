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

public class ArrayUtils_indexOf_759942709220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485;
     Object term489;
     Object term490;
     Object term12412;
     Object term12416;

    public ArrayUtils_indexOf_759942709220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485 = (Object[]) newArray("java.lang.Object", 3);
        Object term486 = newInstance(Class.forName("java.lang.Object"));
        Object term487 = newInstance(Class.forName("java.lang.Object"));
        Object term488 = newInstance(Class.forName("java.lang.Object"));
        setElement(term485, 0, term486);
        setElement(term485, 1, term487);
        setElement(term485, 2, term488);
        term489 = newInstance(Class.forName("java.lang.Object"));
        term490 = new Integer(-1145578966);
        term12412 = (Object[]) newArray("java.lang.Object", 3);
        Object term12413 = newInstance(Class.forName("java.lang.Object"));
        Object term12414 = newInstance(Class.forName("java.lang.Object"));
        Object term12415 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12412, 0, term12413);
        setElement(term12412, 1, term12414);
        setElement(term12412, 2, term12415);
        term12416 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term485;
        args[1] = term489;
        args[2] = term490;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term485, term12412));
        assertTrue(recursiveEquals(term489, term12416));
        assertTrue(recursiveEquals(term490, -1145578966));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


