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

public class TypeInference_traverseArrayLiteral_67090236376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354803;
     Object term1354873;

    public TypeInference_traverseArrayLiteral_67090236376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354803 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1354873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1354943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1355993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1357953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1354943, term1354943.getClass(), "type", 83);
        setIntField(term1355013, term1355013.getClass(), "type", 83);
        setIntField(term1355083, term1355083.getClass(), "type", 83);
        setIntField(term1355153, term1355153.getClass(), "type", 83);
        setIntField(term1355223, term1355223.getClass(), "type", 83);
        setIntField(term1355293, term1355293.getClass(), "type", 83);
        setIntField(term1355363, term1355363.getClass(), "type", 83);
        setIntField(term1355433, term1355433.getClass(), "type", 83);
        setIntField(term1355503, term1355503.getClass(), "type", 83);
        setIntField(term1355573, term1355573.getClass(), "type", 83);
        setIntField(term1355643, term1355643.getClass(), "type", 83);
        setIntField(term1355713, term1355713.getClass(), "type", 83);
        setIntField(term1355783, term1355783.getClass(), "type", 83);
        setIntField(term1355853, term1355853.getClass(), "type", 83);
        setIntField(term1355923, term1355923.getClass(), "type", 83);
        setIntField(term1355993, term1355993.getClass(), "type", 83);
        setIntField(term1356063, term1356063.getClass(), "type", 83);
        setIntField(term1356133, term1356133.getClass(), "type", 83);
        setIntField(term1356203, term1356203.getClass(), "type", 83);
        setIntField(term1356273, term1356273.getClass(), "type", 83);
        setIntField(term1356343, term1356343.getClass(), "type", 83);
        setIntField(term1356413, term1356413.getClass(), "type", 83);
        setIntField(term1356483, term1356483.getClass(), "type", 83);
        setIntField(term1356553, term1356553.getClass(), "type", 83);
        setIntField(term1356623, term1356623.getClass(), "type", 83);
        setIntField(term1356693, term1356693.getClass(), "type", 83);
        setIntField(term1356763, term1356763.getClass(), "type", 83);
        setIntField(term1356833, term1356833.getClass(), "type", 83);
        setIntField(term1356903, term1356903.getClass(), "type", 83);
        setIntField(term1356973, term1356973.getClass(), "type", 83);
        setIntField(term1357043, term1357043.getClass(), "type", 83);
        setIntField(term1357113, term1357113.getClass(), "type", 83);
        setIntField(term1357183, term1357183.getClass(), "type", 83);
        setIntField(term1357253, term1357253.getClass(), "type", 83);
        setIntField(term1357323, term1357323.getClass(), "type", 83);
        setIntField(term1357393, term1357393.getClass(), "type", 83);
        setIntField(term1357463, term1357463.getClass(), "type", 83);
        setIntField(term1357533, term1357533.getClass(), "type", 83);
        setIntField(term1357603, term1357603.getClass(), "type", 83);
        setIntField(term1357673, term1357673.getClass(), "type", 83);
        setIntField(term1357743, term1357743.getClass(), "type", 83);
        setIntField(term1357813, term1357813.getClass(), "type", 83);
        setIntField(term1357883, term1357883.getClass(), "type", 83);
        setIntField(term1357953, term1357953.getClass(), "type", 83);
        setIntField(term1358023, term1358023.getClass(), "type", 83);
        setIntField(term1358093, term1358093.getClass(), "type", 83);
        setIntField(term1358163, term1358163.getClass(), "type", 83);
        setIntField(term1358233, term1358233.getClass(), "type", 83);
        setIntField(term1358303, term1358303.getClass(), "type", 83);
        setIntField(term1358373, term1358373.getClass(), "type", 83);
        setIntField(term1358443, term1358443.getClass(), "type", 83);
        setIntField(term1358513, term1358513.getClass(), "type", 83);
        setIntField(term1358583, term1358583.getClass(), "type", 83);
        setIntField(term1358653, term1358653.getClass(), "type", 83);
        setIntField(term1358723, term1358723.getClass(), "type", 83);
        setIntField(term1358793, term1358793.getClass(), "type", 90);
        setField(term1358723, term1358723.getClass(), "first", term1358793);
        setField(term1358653, term1358653.getClass(), "first", term1358723);
        setField(term1358583, term1358583.getClass(), "first", term1358653);
        setField(term1358513, term1358513.getClass(), "first", term1358583);
        setField(term1358443, term1358443.getClass(), "first", term1358513);
        setField(term1358373, term1358373.getClass(), "first", term1358443);
        setField(term1358303, term1358303.getClass(), "first", term1358373);
        setField(term1358233, term1358233.getClass(), "first", term1358303);
        setField(term1358163, term1358163.getClass(), "first", term1358233);
        setField(term1358093, term1358093.getClass(), "first", term1358163);
        setField(term1358023, term1358023.getClass(), "first", term1358093);
        setField(term1357953, term1357953.getClass(), "first", term1358023);
        setField(term1357883, term1357883.getClass(), "first", term1357953);
        setField(term1357813, term1357813.getClass(), "first", term1357883);
        setField(term1357743, term1357743.getClass(), "first", term1357813);
        setField(term1357673, term1357673.getClass(), "first", term1357743);
        setField(term1357603, term1357603.getClass(), "first", term1357673);
        setField(term1357533, term1357533.getClass(), "first", term1357603);
        setField(term1357463, term1357463.getClass(), "first", term1357533);
        setField(term1357393, term1357393.getClass(), "first", term1357463);
        setField(term1357323, term1357323.getClass(), "first", term1357393);
        setField(term1357253, term1357253.getClass(), "first", term1357323);
        setField(term1357183, term1357183.getClass(), "first", term1357253);
        setField(term1357113, term1357113.getClass(), "first", term1357183);
        setField(term1357043, term1357043.getClass(), "first", term1357113);
        setField(term1356973, term1356973.getClass(), "first", term1357043);
        setField(term1356903, term1356903.getClass(), "first", term1356973);
        setField(term1356833, term1356833.getClass(), "first", term1356903);
        setField(term1356763, term1356763.getClass(), "first", term1356833);
        setField(term1356693, term1356693.getClass(), "first", term1356763);
        setField(term1356623, term1356623.getClass(), "first", term1356693);
        setField(term1356553, term1356553.getClass(), "first", term1356623);
        setField(term1356483, term1356483.getClass(), "first", term1356553);
        setField(term1356413, term1356413.getClass(), "first", term1356483);
        setField(term1356343, term1356343.getClass(), "first", term1356413);
        setField(term1356273, term1356273.getClass(), "first", term1356343);
        setField(term1356203, term1356203.getClass(), "first", term1356273);
        setField(term1356133, term1356133.getClass(), "first", term1356203);
        setField(term1356063, term1356063.getClass(), "first", term1356133);
        setField(term1355993, term1355993.getClass(), "first", term1356063);
        setField(term1355923, term1355923.getClass(), "first", term1355993);
        setField(term1355853, term1355853.getClass(), "first", term1355923);
        setField(term1355783, term1355783.getClass(), "first", term1355853);
        setField(term1355713, term1355713.getClass(), "first", term1355783);
        setField(term1355643, term1355643.getClass(), "first", term1355713);
        setField(term1355573, term1355573.getClass(), "first", term1355643);
        setField(term1355503, term1355503.getClass(), "first", term1355573);
        setField(term1355433, term1355433.getClass(), "first", term1355503);
        setField(term1355363, term1355363.getClass(), "first", term1355433);
        setField(term1355293, term1355293.getClass(), "first", term1355363);
        setField(term1355223, term1355223.getClass(), "first", term1355293);
        setField(term1355153, term1355153.getClass(), "first", term1355223);
        setField(term1355083, term1355083.getClass(), "first", term1355153);
        setField(term1355013, term1355013.getClass(), "first", term1355083);
        setField(term1354943, term1354943.getClass(), "first", term1355013);
        setField(term1354873, term1354873.getClass(), "first", term1354943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1354873;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1354803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


