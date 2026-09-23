package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_calculateHashCode_93527685126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term75;
     Object term1027;
     Object term1031;

    public MultiKey_calculateHashCode_93527685126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term72 = (Object[]) newArray("java.lang.Object", 2);
        Object term73 = newInstance(Class.forName("java.lang.Object"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        setElement(term72, 0, term73);
        setElement(term72, 1, term74);
        setField(term71, term71.getClass(), "keys", term72);
        term75 = (Object[]) newArray("java.lang.Object", 6);
        Object term76 = newInstance(Class.forName("java.lang.Object"));
        Object term77 = newInstance(Class.forName("java.lang.Object"));
        Object term78 = newInstance(Class.forName("java.lang.Object"));
        Object term79 = newInstance(Class.forName("java.lang.Object"));
        Object term80 = newInstance(Class.forName("java.lang.Object"));
        Object term81 = newInstance(Class.forName("java.lang.Object"));
        setElement(term75, 0, term76);
        setElement(term75, 1, term77);
        setElement(term75, 2, term78);
        setElement(term75, 3, term79);
        setElement(term75, 4, term80);
        setElement(term75, 5, term81);
        term1027 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term1028 = (Object[]) newArray("java.lang.Object", 2);
        Object term1029 = newInstance(Class.forName("java.lang.Object"));
        Object term1030 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1028, 0, term1029);
        setElement(term1028, 1, term1030);
        setField(term1027, term1027.getClass(), "keys", term1028);
        term1031 = (Object[]) newArray("java.lang.Object", 6);
        Object term1032 = newInstance(Class.forName("java.lang.Object"));
        Object term1033 = newInstance(Class.forName("java.lang.Object"));
        Object term1034 = newInstance(Class.forName("java.lang.Object"));
        Object term1035 = newInstance(Class.forName("java.lang.Object"));
        Object term1036 = newInstance(Class.forName("java.lang.Object"));
        Object term1037 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1031, 0, term1032);
        setElement(term1031, 1, term1033);
        setElement(term1031, 2, term1034);
        setElement(term1031, 3, term1035);
        setElement(term1031, 4, term1036);
        setElement(term1031, 5, term1037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "calculateHashCode", argTypes, term71, args);
        assertTrue(recursiveEquals(term71, term1027));
        assertTrue(recursiveEquals(term75, term1031));
    }

};


