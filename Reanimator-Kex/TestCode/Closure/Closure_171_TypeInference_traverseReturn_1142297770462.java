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

public class TypeInference_traverseReturn_1142297770462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292352;
     Object term1292422;

    public TypeInference_traverseReturn_1142297770462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292352 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1292422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1293962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1292492, term1292492.getClass(), "type", 92);
        setIntField(term1292562, term1292562.getClass(), "type", 92);
        setIntField(term1292632, term1292632.getClass(), "type", 92);
        setIntField(term1292702, term1292702.getClass(), "type", 92);
        setIntField(term1292772, term1292772.getClass(), "type", 92);
        setIntField(term1292842, term1292842.getClass(), "type", 92);
        setIntField(term1292912, term1292912.getClass(), "type", 92);
        setIntField(term1292982, term1292982.getClass(), "type", 92);
        setIntField(term1293052, term1293052.getClass(), "type", 92);
        setIntField(term1293122, term1293122.getClass(), "type", 92);
        setIntField(term1293192, term1293192.getClass(), "type", 92);
        setIntField(term1293262, term1293262.getClass(), "type", 92);
        setIntField(term1293332, term1293332.getClass(), "type", 92);
        setIntField(term1293402, term1293402.getClass(), "type", 92);
        setIntField(term1293472, term1293472.getClass(), "type", 92);
        setIntField(term1293542, term1293542.getClass(), "type", 92);
        setIntField(term1293612, term1293612.getClass(), "type", 92);
        setIntField(term1293682, term1293682.getClass(), "type", 92);
        setIntField(term1293752, term1293752.getClass(), "type", 92);
        setIntField(term1293822, term1293822.getClass(), "type", 92);
        setIntField(term1293892, term1293892.getClass(), "type", 92);
        setIntField(term1293962, term1293962.getClass(), "type", 92);
        setIntField(term1294032, term1294032.getClass(), "type", 92);
        setIntField(term1294102, term1294102.getClass(), "type", 92);
        setIntField(term1294172, term1294172.getClass(), "type", 92);
        setIntField(term1294242, term1294242.getClass(), "type", 92);
        setIntField(term1294312, term1294312.getClass(), "type", 92);
        setIntField(term1294382, term1294382.getClass(), "type", 92);
        setIntField(term1294452, term1294452.getClass(), "type", 92);
        setIntField(term1294522, term1294522.getClass(), "type", 92);
        setIntField(term1294592, term1294592.getClass(), "type", 92);
        setIntField(term1294662, term1294662.getClass(), "type", 92);
        setIntField(term1294732, term1294732.getClass(), "type", 92);
        setIntField(term1294802, term1294802.getClass(), "type", 92);
        setIntField(term1294872, term1294872.getClass(), "type", 92);
        setIntField(term1294942, term1294942.getClass(), "type", 92);
        setIntField(term1295012, term1295012.getClass(), "type", 92);
        setIntField(term1295082, term1295082.getClass(), "type", 92);
        setIntField(term1295152, term1295152.getClass(), "type", 92);
        setIntField(term1295222, term1295222.getClass(), "type", 92);
        setIntField(term1295292, term1295292.getClass(), "type", 92);
        setIntField(term1295362, term1295362.getClass(), "type", 92);
        setIntField(term1295432, term1295432.getClass(), "type", 92);
        setIntField(term1295502, term1295502.getClass(), "type", 92);
        setIntField(term1295572, term1295572.getClass(), "type", 92);
        setIntField(term1295642, term1295642.getClass(), "type", 46);
        setField(term1295572, term1295572.getClass(), "first", term1295642);
        setField(term1295502, term1295502.getClass(), "first", term1295572);
        setField(term1295432, term1295432.getClass(), "first", term1295502);
        setField(term1295362, term1295362.getClass(), "first", term1295432);
        setField(term1295292, term1295292.getClass(), "first", term1295362);
        setField(term1295222, term1295222.getClass(), "first", term1295292);
        setField(term1295152, term1295152.getClass(), "first", term1295222);
        setField(term1295082, term1295082.getClass(), "first", term1295152);
        setField(term1295012, term1295012.getClass(), "first", term1295082);
        setField(term1294942, term1294942.getClass(), "first", term1295012);
        setField(term1294872, term1294872.getClass(), "first", term1294942);
        setField(term1294802, term1294802.getClass(), "first", term1294872);
        setField(term1294732, term1294732.getClass(), "first", term1294802);
        setField(term1294662, term1294662.getClass(), "first", term1294732);
        setField(term1294592, term1294592.getClass(), "first", term1294662);
        setField(term1294522, term1294522.getClass(), "first", term1294592);
        setField(term1294452, term1294452.getClass(), "first", term1294522);
        setField(term1294382, term1294382.getClass(), "first", term1294452);
        setField(term1294312, term1294312.getClass(), "first", term1294382);
        setField(term1294242, term1294242.getClass(), "first", term1294312);
        setField(term1294172, term1294172.getClass(), "first", term1294242);
        setField(term1294102, term1294102.getClass(), "first", term1294172);
        setField(term1294032, term1294032.getClass(), "first", term1294102);
        setField(term1293962, term1293962.getClass(), "first", term1294032);
        setField(term1293892, term1293892.getClass(), "first", term1293962);
        setField(term1293822, term1293822.getClass(), "first", term1293892);
        setField(term1293752, term1293752.getClass(), "first", term1293822);
        setField(term1293682, term1293682.getClass(), "first", term1293752);
        setField(term1293612, term1293612.getClass(), "first", term1293682);
        setField(term1293542, term1293542.getClass(), "first", term1293612);
        setField(term1293472, term1293472.getClass(), "first", term1293542);
        setField(term1293402, term1293402.getClass(), "first", term1293472);
        setField(term1293332, term1293332.getClass(), "first", term1293402);
        setField(term1293262, term1293262.getClass(), "first", term1293332);
        setField(term1293192, term1293192.getClass(), "first", term1293262);
        setField(term1293122, term1293122.getClass(), "first", term1293192);
        setField(term1293052, term1293052.getClass(), "first", term1293122);
        setField(term1292982, term1292982.getClass(), "first", term1293052);
        setField(term1292912, term1292912.getClass(), "first", term1292982);
        setField(term1292842, term1292842.getClass(), "first", term1292912);
        setField(term1292772, term1292772.getClass(), "first", term1292842);
        setField(term1292702, term1292702.getClass(), "first", term1292772);
        setField(term1292632, term1292632.getClass(), "first", term1292702);
        setField(term1292562, term1292562.getClass(), "first", term1292632);
        setField(term1292492, term1292492.getClass(), "first", term1292562);
        setField(term1292422, term1292422.getClass(), "first", term1292492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1292422;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1292352, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


