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

public class ArrayUtils_clone_1809427425181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term10677;
     Object term10669;

    public ArrayUtils_clone_1809427425181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = (Object[]) newArray("java.lang.Object", 6);
        Object term45 = newInstance(Class.forName("java.lang.Object"));
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        Object term47 = newInstance(Class.forName("java.lang.Object"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term49 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        setElement(term44, 0, term45);
        setElement(term44, 1, term46);
        setElement(term44, 2, term47);
        setElement(term44, 3, term48);
        setElement(term44, 4, term49);
        setElement(term44, 5, term50);
        term10677 = (Object[]) newArray("java.lang.Object", 6);
        Object term10678 = newInstance(Class.forName("java.lang.Object"));
        Object term10679 = newInstance(Class.forName("java.lang.Object"));
        Object term10680 = newInstance(Class.forName("java.lang.Object"));
        Object term10681 = newInstance(Class.forName("java.lang.Object"));
        Object term10682 = newInstance(Class.forName("java.lang.Object"));
        Object term10683 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10677, 0, term10678);
        setElement(term10677, 1, term10679);
        setElement(term10677, 2, term10680);
        setElement(term10677, 3, term10681);
        setElement(term10677, 4, term10682);
        setElement(term10677, 5, term10683);
        term10669 = (Object[]) newArray("java.lang.Object", 6);
        Object term10670 = newInstance(Class.forName("java.lang.Object"));
        Object term10671 = newInstance(Class.forName("java.lang.Object"));
        Object term10672 = newInstance(Class.forName("java.lang.Object"));
        Object term10673 = newInstance(Class.forName("java.lang.Object"));
        Object term10674 = newInstance(Class.forName("java.lang.Object"));
        Object term10675 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10669, 0, term10670);
        setElement(term10669, 1, term10671);
        setElement(term10669, 2, term10672);
        setElement(term10669, 3, term10673);
        setElement(term10669, 4, term10674);
        setElement(term10669, 5, term10675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term44;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term44, term10677));
        assertTrue(recursiveEquals(retValue, term10669));
    }

};


