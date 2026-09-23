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

public class TypeInference_traverseArrayLiteral_67090236378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1363956;
     Object term1364026;

    public TypeInference_traverseArrayLiteral_67090236378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1363956 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1364026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1368016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1368086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1364096, term1364096.getClass(), "type", 83);
        setIntField(term1364166, term1364166.getClass(), "type", 83);
        setIntField(term1364236, term1364236.getClass(), "type", 83);
        setIntField(term1364306, term1364306.getClass(), "type", 83);
        setIntField(term1364376, term1364376.getClass(), "type", 83);
        setIntField(term1364446, term1364446.getClass(), "type", 83);
        setIntField(term1364516, term1364516.getClass(), "type", 83);
        setIntField(term1364586, term1364586.getClass(), "type", 83);
        setIntField(term1364656, term1364656.getClass(), "type", 83);
        setIntField(term1364726, term1364726.getClass(), "type", 83);
        setIntField(term1364796, term1364796.getClass(), "type", 83);
        setIntField(term1364866, term1364866.getClass(), "type", 83);
        setIntField(term1364936, term1364936.getClass(), "type", 83);
        setIntField(term1365006, term1365006.getClass(), "type", 83);
        setIntField(term1365076, term1365076.getClass(), "type", 83);
        setIntField(term1365146, term1365146.getClass(), "type", 83);
        setIntField(term1365216, term1365216.getClass(), "type", 83);
        setIntField(term1365286, term1365286.getClass(), "type", 83);
        setIntField(term1365356, term1365356.getClass(), "type", 83);
        setIntField(term1365426, term1365426.getClass(), "type", 83);
        setIntField(term1365496, term1365496.getClass(), "type", 83);
        setIntField(term1365566, term1365566.getClass(), "type", 83);
        setIntField(term1365636, term1365636.getClass(), "type", 83);
        setIntField(term1365706, term1365706.getClass(), "type", 83);
        setIntField(term1365776, term1365776.getClass(), "type", 83);
        setIntField(term1365846, term1365846.getClass(), "type", 83);
        setIntField(term1365916, term1365916.getClass(), "type", 83);
        setIntField(term1365986, term1365986.getClass(), "type", 83);
        setIntField(term1366056, term1366056.getClass(), "type", 83);
        setIntField(term1366126, term1366126.getClass(), "type", 83);
        setIntField(term1366196, term1366196.getClass(), "type", 83);
        setIntField(term1366266, term1366266.getClass(), "type", 83);
        setIntField(term1366336, term1366336.getClass(), "type", 83);
        setIntField(term1366406, term1366406.getClass(), "type", 83);
        setIntField(term1366476, term1366476.getClass(), "type", 83);
        setIntField(term1366546, term1366546.getClass(), "type", 83);
        setIntField(term1366616, term1366616.getClass(), "type", 83);
        setIntField(term1366686, term1366686.getClass(), "type", 83);
        setIntField(term1366756, term1366756.getClass(), "type", 83);
        setIntField(term1366826, term1366826.getClass(), "type", 83);
        setIntField(term1366896, term1366896.getClass(), "type", 83);
        setIntField(term1366966, term1366966.getClass(), "type", 83);
        setIntField(term1367036, term1367036.getClass(), "type", 83);
        setIntField(term1367106, term1367106.getClass(), "type", 83);
        setIntField(term1367176, term1367176.getClass(), "type", 83);
        setIntField(term1367246, term1367246.getClass(), "type", 83);
        setIntField(term1367316, term1367316.getClass(), "type", 83);
        setIntField(term1367386, term1367386.getClass(), "type", 83);
        setIntField(term1367456, term1367456.getClass(), "type", 83);
        setIntField(term1367526, term1367526.getClass(), "type", 83);
        setIntField(term1367596, term1367596.getClass(), "type", 83);
        setIntField(term1367666, term1367666.getClass(), "type", 83);
        setIntField(term1367736, term1367736.getClass(), "type", 83);
        setIntField(term1367806, term1367806.getClass(), "type", 83);
        setIntField(term1367876, term1367876.getClass(), "type", 83);
        setIntField(term1367946, term1367946.getClass(), "type", 83);
        setIntField(term1368016, term1368016.getClass(), "type", 83);
        setIntField(term1368086, term1368086.getClass(), "type", 104);
        setField(term1368016, term1368016.getClass(), "first", term1368086);
        setField(term1367946, term1367946.getClass(), "first", term1368016);
        setField(term1367876, term1367876.getClass(), "first", term1367946);
        setField(term1367806, term1367806.getClass(), "first", term1367876);
        setField(term1367736, term1367736.getClass(), "first", term1367806);
        setField(term1367666, term1367666.getClass(), "first", term1367736);
        setField(term1367596, term1367596.getClass(), "first", term1367666);
        setField(term1367526, term1367526.getClass(), "first", term1367596);
        setField(term1367456, term1367456.getClass(), "first", term1367526);
        setField(term1367386, term1367386.getClass(), "first", term1367456);
        setField(term1367316, term1367316.getClass(), "first", term1367386);
        setField(term1367246, term1367246.getClass(), "first", term1367316);
        setField(term1367176, term1367176.getClass(), "first", term1367246);
        setField(term1367106, term1367106.getClass(), "first", term1367176);
        setField(term1367036, term1367036.getClass(), "first", term1367106);
        setField(term1366966, term1366966.getClass(), "first", term1367036);
        setField(term1366896, term1366896.getClass(), "first", term1366966);
        setField(term1366826, term1366826.getClass(), "first", term1366896);
        setField(term1366756, term1366756.getClass(), "first", term1366826);
        setField(term1366686, term1366686.getClass(), "first", term1366756);
        setField(term1366616, term1366616.getClass(), "first", term1366686);
        setField(term1366546, term1366546.getClass(), "first", term1366616);
        setField(term1366476, term1366476.getClass(), "first", term1366546);
        setField(term1366406, term1366406.getClass(), "first", term1366476);
        setField(term1366336, term1366336.getClass(), "first", term1366406);
        setField(term1366266, term1366266.getClass(), "first", term1366336);
        setField(term1366196, term1366196.getClass(), "first", term1366266);
        setField(term1366126, term1366126.getClass(), "first", term1366196);
        setField(term1366056, term1366056.getClass(), "first", term1366126);
        setField(term1365986, term1365986.getClass(), "first", term1366056);
        setField(term1365916, term1365916.getClass(), "first", term1365986);
        setField(term1365846, term1365846.getClass(), "first", term1365916);
        setField(term1365776, term1365776.getClass(), "first", term1365846);
        setField(term1365706, term1365706.getClass(), "first", term1365776);
        setField(term1365636, term1365636.getClass(), "first", term1365706);
        setField(term1365566, term1365566.getClass(), "first", term1365636);
        setField(term1365496, term1365496.getClass(), "first", term1365566);
        setField(term1365426, term1365426.getClass(), "first", term1365496);
        setField(term1365356, term1365356.getClass(), "first", term1365426);
        setField(term1365286, term1365286.getClass(), "first", term1365356);
        setField(term1365216, term1365216.getClass(), "first", term1365286);
        setField(term1365146, term1365146.getClass(), "first", term1365216);
        setField(term1365076, term1365076.getClass(), "first", term1365146);
        setField(term1365006, term1365006.getClass(), "first", term1365076);
        setField(term1364936, term1364936.getClass(), "first", term1365006);
        setField(term1364866, term1364866.getClass(), "first", term1364936);
        setField(term1364796, term1364796.getClass(), "first", term1364866);
        setField(term1364726, term1364726.getClass(), "first", term1364796);
        setField(term1364656, term1364656.getClass(), "first", term1364726);
        setField(term1364586, term1364586.getClass(), "first", term1364656);
        setField(term1364516, term1364516.getClass(), "first", term1364586);
        setField(term1364446, term1364446.getClass(), "first", term1364516);
        setField(term1364376, term1364376.getClass(), "first", term1364446);
        setField(term1364306, term1364306.getClass(), "first", term1364376);
        setField(term1364236, term1364236.getClass(), "first", term1364306);
        setField(term1364166, term1364166.getClass(), "first", term1364236);
        setField(term1364096, term1364096.getClass(), "first", term1364166);
        setField(term1364026, term1364026.getClass(), "first", term1364096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1364026;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1363956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


