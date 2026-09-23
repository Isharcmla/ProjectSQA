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

public class TypeInference_traverseReturn_1142297770407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050212;
     Object term1050282;

    public TypeInference_traverseReturn_1142297770407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1050212 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1050282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1052942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1050352, term1050352.getClass(), "type", 29);
        setIntField(term1050422, term1050422.getClass(), "type", 29);
        setIntField(term1050492, term1050492.getClass(), "type", 29);
        setIntField(term1050562, term1050562.getClass(), "type", 29);
        setIntField(term1050632, term1050632.getClass(), "type", 29);
        setIntField(term1050702, term1050702.getClass(), "type", 29);
        setIntField(term1050772, term1050772.getClass(), "type", 29);
        setIntField(term1050842, term1050842.getClass(), "type", 29);
        setIntField(term1050912, term1050912.getClass(), "type", 29);
        setIntField(term1050982, term1050982.getClass(), "type", 29);
        setIntField(term1051052, term1051052.getClass(), "type", 29);
        setIntField(term1051122, term1051122.getClass(), "type", 29);
        setIntField(term1051192, term1051192.getClass(), "type", 29);
        setIntField(term1051262, term1051262.getClass(), "type", 29);
        setIntField(term1051332, term1051332.getClass(), "type", 29);
        setIntField(term1051402, term1051402.getClass(), "type", 29);
        setIntField(term1051472, term1051472.getClass(), "type", 29);
        setIntField(term1051542, term1051542.getClass(), "type", 29);
        setIntField(term1051612, term1051612.getClass(), "type", 29);
        setIntField(term1051682, term1051682.getClass(), "type", 29);
        setIntField(term1051752, term1051752.getClass(), "type", 29);
        setIntField(term1051822, term1051822.getClass(), "type", 29);
        setIntField(term1051892, term1051892.getClass(), "type", 29);
        setIntField(term1051962, term1051962.getClass(), "type", 29);
        setIntField(term1052032, term1052032.getClass(), "type", 29);
        setIntField(term1052102, term1052102.getClass(), "type", 29);
        setIntField(term1052172, term1052172.getClass(), "type", 29);
        setIntField(term1052242, term1052242.getClass(), "type", 29);
        setIntField(term1052312, term1052312.getClass(), "type", 29);
        setIntField(term1052382, term1052382.getClass(), "type", 29);
        setIntField(term1052452, term1052452.getClass(), "type", 29);
        setIntField(term1052522, term1052522.getClass(), "type", 29);
        setIntField(term1052592, term1052592.getClass(), "type", 29);
        setIntField(term1052662, term1052662.getClass(), "type", 29);
        setIntField(term1052732, term1052732.getClass(), "type", 29);
        setIntField(term1052802, term1052802.getClass(), "type", 29);
        setIntField(term1052872, term1052872.getClass(), "type", 29);
        setIntField(term1052942, term1052942.getClass(), "type", 29);
        setIntField(term1053012, term1053012.getClass(), "type", 29);
        setIntField(term1053082, term1053082.getClass(), "type", 29);
        setIntField(term1053152, term1053152.getClass(), "type", 29);
        setIntField(term1053222, term1053222.getClass(), "type", 29);
        setIntField(term1053292, term1053292.getClass(), "type", 29);
        setIntField(term1053362, term1053362.getClass(), "type", 29);
        setIntField(term1053432, term1053432.getClass(), "type", 29);
        setIntField(term1053502, term1053502.getClass(), "type", 29);
        setIntField(term1053572, term1053572.getClass(), "type", 29);
        setIntField(term1053642, term1053642.getClass(), "type", 29);
        setIntField(term1053712, term1053712.getClass(), "type", 29);
        setIntField(term1053782, term1053782.getClass(), "type", 29);
        setIntField(term1053852, term1053852.getClass(), "type", 29);
        setIntField(term1053922, term1053922.getClass(), "type", 29);
        setIntField(term1053992, term1053992.getClass(), "type", 29);
        setIntField(term1054062, term1054062.getClass(), "type", 29);
        setIntField(term1054132, term1054132.getClass(), "type", 29);
        setIntField(term1054202, term1054202.getClass(), "type", 29);
        setIntField(term1054272, term1054272.getClass(), "type", 29);
        setIntField(term1054342, term1054342.getClass(), "type", 29);
        setIntField(term1054412, term1054412.getClass(), "type", 29);
        setIntField(term1054482, term1054482.getClass(), "type", 29);
        setIntField(term1054552, term1054552.getClass(), "type", 29);
        setIntField(term1054622, term1054622.getClass(), "type", 29);
        setIntField(term1054692, term1054692.getClass(), "type", 29);
        setIntField(term1054762, term1054762.getClass(), "type", 29);
        setIntField(term1054832, term1054832.getClass(), "type", 29);
        setIntField(term1054902, term1054902.getClass(), "type", 39);
        setField(term1054832, term1054832.getClass(), "first", term1054902);
        setField(term1054762, term1054762.getClass(), "first", term1054832);
        setField(term1054692, term1054692.getClass(), "first", term1054762);
        setField(term1054622, term1054622.getClass(), "first", term1054692);
        setField(term1054552, term1054552.getClass(), "first", term1054622);
        setField(term1054482, term1054482.getClass(), "first", term1054552);
        setField(term1054412, term1054412.getClass(), "first", term1054482);
        setField(term1054342, term1054342.getClass(), "first", term1054412);
        setField(term1054272, term1054272.getClass(), "first", term1054342);
        setField(term1054202, term1054202.getClass(), "first", term1054272);
        setField(term1054132, term1054132.getClass(), "first", term1054202);
        setField(term1054062, term1054062.getClass(), "first", term1054132);
        setField(term1053992, term1053992.getClass(), "first", term1054062);
        setField(term1053922, term1053922.getClass(), "first", term1053992);
        setField(term1053852, term1053852.getClass(), "first", term1053922);
        setField(term1053782, term1053782.getClass(), "first", term1053852);
        setField(term1053712, term1053712.getClass(), "first", term1053782);
        setField(term1053642, term1053642.getClass(), "first", term1053712);
        setField(term1053572, term1053572.getClass(), "first", term1053642);
        setField(term1053502, term1053502.getClass(), "first", term1053572);
        setField(term1053432, term1053432.getClass(), "first", term1053502);
        setField(term1053362, term1053362.getClass(), "first", term1053432);
        setField(term1053292, term1053292.getClass(), "first", term1053362);
        setField(term1053222, term1053222.getClass(), "first", term1053292);
        setField(term1053152, term1053152.getClass(), "first", term1053222);
        setField(term1053082, term1053082.getClass(), "first", term1053152);
        setField(term1053012, term1053012.getClass(), "first", term1053082);
        setField(term1052942, term1052942.getClass(), "first", term1053012);
        setField(term1052872, term1052872.getClass(), "first", term1052942);
        setField(term1052802, term1052802.getClass(), "first", term1052872);
        setField(term1052732, term1052732.getClass(), "first", term1052802);
        setField(term1052662, term1052662.getClass(), "first", term1052732);
        setField(term1052592, term1052592.getClass(), "first", term1052662);
        setField(term1052522, term1052522.getClass(), "first", term1052592);
        setField(term1052452, term1052452.getClass(), "first", term1052522);
        setField(term1052382, term1052382.getClass(), "first", term1052452);
        setField(term1052312, term1052312.getClass(), "first", term1052382);
        setField(term1052242, term1052242.getClass(), "first", term1052312);
        setField(term1052172, term1052172.getClass(), "first", term1052242);
        setField(term1052102, term1052102.getClass(), "first", term1052172);
        setField(term1052032, term1052032.getClass(), "first", term1052102);
        setField(term1051962, term1051962.getClass(), "first", term1052032);
        setField(term1051892, term1051892.getClass(), "first", term1051962);
        setField(term1051822, term1051822.getClass(), "first", term1051892);
        setField(term1051752, term1051752.getClass(), "first", term1051822);
        setField(term1051682, term1051682.getClass(), "first", term1051752);
        setField(term1051612, term1051612.getClass(), "first", term1051682);
        setField(term1051542, term1051542.getClass(), "first", term1051612);
        setField(term1051472, term1051472.getClass(), "first", term1051542);
        setField(term1051402, term1051402.getClass(), "first", term1051472);
        setField(term1051332, term1051332.getClass(), "first", term1051402);
        setField(term1051262, term1051262.getClass(), "first", term1051332);
        setField(term1051192, term1051192.getClass(), "first", term1051262);
        setField(term1051122, term1051122.getClass(), "first", term1051192);
        setField(term1051052, term1051052.getClass(), "first", term1051122);
        setField(term1050982, term1050982.getClass(), "first", term1051052);
        setField(term1050912, term1050912.getClass(), "first", term1050982);
        setField(term1050842, term1050842.getClass(), "first", term1050912);
        setField(term1050772, term1050772.getClass(), "first", term1050842);
        setField(term1050702, term1050702.getClass(), "first", term1050772);
        setField(term1050632, term1050632.getClass(), "first", term1050702);
        setField(term1050562, term1050562.getClass(), "first", term1050632);
        setField(term1050492, term1050492.getClass(), "first", term1050562);
        setField(term1050422, term1050422.getClass(), "first", term1050492);
        setField(term1050352, term1050352.getClass(), "first", term1050422);
        setField(term1050282, term1050282.getClass(), "first", term1050352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1050282;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1050212, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


