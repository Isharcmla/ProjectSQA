package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseArrayLiteral_67090236364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264893;
     Object term1264963;

    public TypeInference_traverseArrayLiteral_67090236364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1264893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1264963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1266993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1269023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1269093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1265033, term1265033.getClass(), "type", 83);
        setIntField(term1265103, term1265103.getClass(), "type", 83);
        setIntField(term1265173, term1265173.getClass(), "type", 83);
        setIntField(term1265243, term1265243.getClass(), "type", 83);
        setIntField(term1265313, term1265313.getClass(), "type", 83);
        setIntField(term1265383, term1265383.getClass(), "type", 83);
        setIntField(term1265453, term1265453.getClass(), "type", 83);
        setIntField(term1265523, term1265523.getClass(), "type", 83);
        setIntField(term1265593, term1265593.getClass(), "type", 83);
        setIntField(term1265663, term1265663.getClass(), "type", 83);
        setIntField(term1265733, term1265733.getClass(), "type", 83);
        setIntField(term1265803, term1265803.getClass(), "type", 83);
        setIntField(term1265873, term1265873.getClass(), "type", 83);
        setIntField(term1265943, term1265943.getClass(), "type", 83);
        setIntField(term1266013, term1266013.getClass(), "type", 83);
        setIntField(term1266083, term1266083.getClass(), "type", 83);
        setIntField(term1266153, term1266153.getClass(), "type", 83);
        setIntField(term1266223, term1266223.getClass(), "type", 83);
        setIntField(term1266293, term1266293.getClass(), "type", 83);
        setIntField(term1266363, term1266363.getClass(), "type", 83);
        setIntField(term1266433, term1266433.getClass(), "type", 83);
        setIntField(term1266503, term1266503.getClass(), "type", 83);
        setIntField(term1266573, term1266573.getClass(), "type", 83);
        setIntField(term1266643, term1266643.getClass(), "type", 83);
        setIntField(term1266713, term1266713.getClass(), "type", 83);
        setIntField(term1266783, term1266783.getClass(), "type", 83);
        setIntField(term1266853, term1266853.getClass(), "type", 83);
        setIntField(term1266923, term1266923.getClass(), "type", 83);
        setIntField(term1266993, term1266993.getClass(), "type", 83);
        setIntField(term1267063, term1267063.getClass(), "type", 83);
        setIntField(term1267133, term1267133.getClass(), "type", 83);
        setIntField(term1267203, term1267203.getClass(), "type", 83);
        setIntField(term1267273, term1267273.getClass(), "type", 83);
        setIntField(term1267343, term1267343.getClass(), "type", 83);
        setIntField(term1267413, term1267413.getClass(), "type", 83);
        setIntField(term1267483, term1267483.getClass(), "type", 83);
        setIntField(term1267553, term1267553.getClass(), "type", 83);
        setIntField(term1267623, term1267623.getClass(), "type", 83);
        setIntField(term1267693, term1267693.getClass(), "type", 83);
        setIntField(term1267763, term1267763.getClass(), "type", 83);
        setIntField(term1267833, term1267833.getClass(), "type", 83);
        setIntField(term1267903, term1267903.getClass(), "type", 83);
        setIntField(term1267973, term1267973.getClass(), "type", 83);
        setIntField(term1268043, term1268043.getClass(), "type", 83);
        setIntField(term1268113, term1268113.getClass(), "type", 83);
        setIntField(term1268183, term1268183.getClass(), "type", 83);
        setIntField(term1268253, term1268253.getClass(), "type", 83);
        setIntField(term1268323, term1268323.getClass(), "type", 83);
        setIntField(term1268393, term1268393.getClass(), "type", 83);
        setIntField(term1268463, term1268463.getClass(), "type", 83);
        setIntField(term1268533, term1268533.getClass(), "type", 83);
        setIntField(term1268603, term1268603.getClass(), "type", 83);
        setIntField(term1268673, term1268673.getClass(), "type", 83);
        setIntField(term1268743, term1268743.getClass(), "type", 83);
        setIntField(term1268813, term1268813.getClass(), "type", 83);
        setIntField(term1268883, term1268883.getClass(), "type", 83);
        setIntField(term1268953, term1268953.getClass(), "type", 83);
        setIntField(term1269023, term1269023.getClass(), "type", 83);
        setIntField(term1269093, term1269093.getClass(), "type", 81);
        setField(term1269023, term1269023.getClass(), "first", term1269093);
        setField(term1268953, term1268953.getClass(), "first", term1269023);
        setField(term1268883, term1268883.getClass(), "first", term1268953);
        setField(term1268813, term1268813.getClass(), "first", term1268883);
        setField(term1268743, term1268743.getClass(), "first", term1268813);
        setField(term1268673, term1268673.getClass(), "first", term1268743);
        setField(term1268603, term1268603.getClass(), "first", term1268673);
        setField(term1268533, term1268533.getClass(), "first", term1268603);
        setField(term1268463, term1268463.getClass(), "first", term1268533);
        setField(term1268393, term1268393.getClass(), "first", term1268463);
        setField(term1268323, term1268323.getClass(), "first", term1268393);
        setField(term1268253, term1268253.getClass(), "first", term1268323);
        setField(term1268183, term1268183.getClass(), "first", term1268253);
        setField(term1268113, term1268113.getClass(), "first", term1268183);
        setField(term1268043, term1268043.getClass(), "first", term1268113);
        setField(term1267973, term1267973.getClass(), "first", term1268043);
        setField(term1267903, term1267903.getClass(), "first", term1267973);
        setField(term1267833, term1267833.getClass(), "first", term1267903);
        setField(term1267763, term1267763.getClass(), "first", term1267833);
        setField(term1267693, term1267693.getClass(), "first", term1267763);
        setField(term1267623, term1267623.getClass(), "first", term1267693);
        setField(term1267553, term1267553.getClass(), "first", term1267623);
        setField(term1267483, term1267483.getClass(), "first", term1267553);
        setField(term1267413, term1267413.getClass(), "first", term1267483);
        setField(term1267343, term1267343.getClass(), "first", term1267413);
        setField(term1267273, term1267273.getClass(), "first", term1267343);
        setField(term1267203, term1267203.getClass(), "first", term1267273);
        setField(term1267133, term1267133.getClass(), "first", term1267203);
        setField(term1267063, term1267063.getClass(), "first", term1267133);
        setField(term1266993, term1266993.getClass(), "first", term1267063);
        setField(term1266923, term1266923.getClass(), "first", term1266993);
        setField(term1266853, term1266853.getClass(), "first", term1266923);
        setField(term1266783, term1266783.getClass(), "first", term1266853);
        setField(term1266713, term1266713.getClass(), "first", term1266783);
        setField(term1266643, term1266643.getClass(), "first", term1266713);
        setField(term1266573, term1266573.getClass(), "first", term1266643);
        setField(term1266503, term1266503.getClass(), "first", term1266573);
        setField(term1266433, term1266433.getClass(), "first", term1266503);
        setField(term1266363, term1266363.getClass(), "first", term1266433);
        setField(term1266293, term1266293.getClass(), "first", term1266363);
        setField(term1266223, term1266223.getClass(), "first", term1266293);
        setField(term1266153, term1266153.getClass(), "first", term1266223);
        setField(term1266083, term1266083.getClass(), "first", term1266153);
        setField(term1266013, term1266013.getClass(), "first", term1266083);
        setField(term1265943, term1265943.getClass(), "first", term1266013);
        setField(term1265873, term1265873.getClass(), "first", term1265943);
        setField(term1265803, term1265803.getClass(), "first", term1265873);
        setField(term1265733, term1265733.getClass(), "first", term1265803);
        setField(term1265663, term1265663.getClass(), "first", term1265733);
        setField(term1265593, term1265593.getClass(), "first", term1265663);
        setField(term1265523, term1265523.getClass(), "first", term1265593);
        setField(term1265453, term1265453.getClass(), "first", term1265523);
        setField(term1265383, term1265383.getClass(), "first", term1265453);
        setField(term1265313, term1265313.getClass(), "first", term1265383);
        setField(term1265243, term1265243.getClass(), "first", term1265313);
        setField(term1265173, term1265173.getClass(), "first", term1265243);
        setField(term1265103, term1265103.getClass(), "first", term1265173);
        setField(term1265033, term1265033.getClass(), "first", term1265103);
        setField(term1264963, term1264963.getClass(), "first", term1265033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1264963;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1264893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


