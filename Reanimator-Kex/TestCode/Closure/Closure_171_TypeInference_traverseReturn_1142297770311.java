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

public class TypeInference_traverseReturn_1142297770311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658802;
     Object term658872;

    public TypeInference_traverseReturn_1142297770311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658802 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term658872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term658942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term661952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term658942, term658942.getClass(), "type", 92);
        setIntField(term659012, term659012.getClass(), "type", 92);
        setIntField(term659082, term659082.getClass(), "type", 92);
        setIntField(term659152, term659152.getClass(), "type", 92);
        setIntField(term659222, term659222.getClass(), "type", 92);
        setIntField(term659292, term659292.getClass(), "type", 92);
        setIntField(term659362, term659362.getClass(), "type", 92);
        setIntField(term659432, term659432.getClass(), "type", 92);
        setIntField(term659502, term659502.getClass(), "type", 92);
        setIntField(term659572, term659572.getClass(), "type", 92);
        setIntField(term659642, term659642.getClass(), "type", 92);
        setIntField(term659712, term659712.getClass(), "type", 92);
        setIntField(term659782, term659782.getClass(), "type", 92);
        setIntField(term659852, term659852.getClass(), "type", 92);
        setIntField(term659922, term659922.getClass(), "type", 92);
        setIntField(term659992, term659992.getClass(), "type", 92);
        setIntField(term660062, term660062.getClass(), "type", 92);
        setIntField(term660132, term660132.getClass(), "type", 92);
        setIntField(term660202, term660202.getClass(), "type", 92);
        setIntField(term660272, term660272.getClass(), "type", 92);
        setIntField(term660342, term660342.getClass(), "type", 92);
        setIntField(term660412, term660412.getClass(), "type", 92);
        setIntField(term660482, term660482.getClass(), "type", 92);
        setIntField(term660552, term660552.getClass(), "type", 92);
        setIntField(term660622, term660622.getClass(), "type", 92);
        setIntField(term660692, term660692.getClass(), "type", 92);
        setIntField(term660762, term660762.getClass(), "type", 92);
        setIntField(term660832, term660832.getClass(), "type", 92);
        setIntField(term660902, term660902.getClass(), "type", 92);
        setIntField(term660972, term660972.getClass(), "type", 92);
        setIntField(term661042, term661042.getClass(), "type", 92);
        setIntField(term661112, term661112.getClass(), "type", 92);
        setIntField(term661182, term661182.getClass(), "type", 92);
        setIntField(term661252, term661252.getClass(), "type", 92);
        setIntField(term661322, term661322.getClass(), "type", 92);
        setIntField(term661392, term661392.getClass(), "type", 92);
        setIntField(term661462, term661462.getClass(), "type", 92);
        setIntField(term661532, term661532.getClass(), "type", 92);
        setIntField(term661602, term661602.getClass(), "type", 92);
        setIntField(term661672, term661672.getClass(), "type", 92);
        setIntField(term661742, term661742.getClass(), "type", 92);
        setIntField(term661812, term661812.getClass(), "type", 92);
        setIntField(term661882, term661882.getClass(), "type", 92);
        setIntField(term661952, term661952.getClass(), "type", 92);
        setIntField(term662022, term662022.getClass(), "type", 92);
        setIntField(term662092, term662092.getClass(), "type", 92);
        setIntField(term662162, term662162.getClass(), "type", 92);
        setIntField(term662232, term662232.getClass(), "type", 92);
        setIntField(term662302, term662302.getClass(), "type", 92);
        setIntField(term662372, term662372.getClass(), "type", 92);
        setIntField(term662442, term662442.getClass(), "type", 92);
        setIntField(term662512, term662512.getClass(), "type", 92);
        setIntField(term662582, term662582.getClass(), "type", 92);
        setIntField(term662652, term662652.getClass(), "type", 92);
        setIntField(term662722, term662722.getClass(), "type", 92);
        setIntField(term662792, term662792.getClass(), "type", 92);
        setIntField(term662862, term662862.getClass(), "type", 92);
        setIntField(term662932, term662932.getClass(), "type", 92);
        setIntField(term663002, term663002.getClass(), "type", 92);
        setIntField(term663072, term663072.getClass(), "type", 92);
        setIntField(term663142, term663142.getClass(), "type", 92);
        setIntField(term663212, term663212.getClass(), "type", 92);
        setIntField(term663282, term663282.getClass(), "type", 92);
        setIntField(term663352, term663352.getClass(), "type", 92);
        setIntField(term663422, term663422.getClass(), "type", 67);
        setField(term663352, term663352.getClass(), "first", term663422);
        setField(term663282, term663282.getClass(), "first", term663352);
        setField(term663212, term663212.getClass(), "first", term663282);
        setField(term663142, term663142.getClass(), "first", term663212);
        setField(term663072, term663072.getClass(), "first", term663142);
        setField(term663002, term663002.getClass(), "first", term663072);
        setField(term662932, term662932.getClass(), "first", term663002);
        setField(term662862, term662862.getClass(), "first", term662932);
        setField(term662792, term662792.getClass(), "first", term662862);
        setField(term662722, term662722.getClass(), "first", term662792);
        setField(term662652, term662652.getClass(), "first", term662722);
        setField(term662582, term662582.getClass(), "first", term662652);
        setField(term662512, term662512.getClass(), "first", term662582);
        setField(term662442, term662442.getClass(), "first", term662512);
        setField(term662372, term662372.getClass(), "first", term662442);
        setField(term662302, term662302.getClass(), "first", term662372);
        setField(term662232, term662232.getClass(), "first", term662302);
        setField(term662162, term662162.getClass(), "first", term662232);
        setField(term662092, term662092.getClass(), "first", term662162);
        setField(term662022, term662022.getClass(), "first", term662092);
        setField(term661952, term661952.getClass(), "first", term662022);
        setField(term661882, term661882.getClass(), "first", term661952);
        setField(term661812, term661812.getClass(), "first", term661882);
        setField(term661742, term661742.getClass(), "first", term661812);
        setField(term661672, term661672.getClass(), "first", term661742);
        setField(term661602, term661602.getClass(), "first", term661672);
        setField(term661532, term661532.getClass(), "first", term661602);
        setField(term661462, term661462.getClass(), "first", term661532);
        setField(term661392, term661392.getClass(), "first", term661462);
        setField(term661322, term661322.getClass(), "first", term661392);
        setField(term661252, term661252.getClass(), "first", term661322);
        setField(term661182, term661182.getClass(), "first", term661252);
        setField(term661112, term661112.getClass(), "first", term661182);
        setField(term661042, term661042.getClass(), "first", term661112);
        setField(term660972, term660972.getClass(), "first", term661042);
        setField(term660902, term660902.getClass(), "first", term660972);
        setField(term660832, term660832.getClass(), "first", term660902);
        setField(term660762, term660762.getClass(), "first", term660832);
        setField(term660692, term660692.getClass(), "first", term660762);
        setField(term660622, term660622.getClass(), "first", term660692);
        setField(term660552, term660552.getClass(), "first", term660622);
        setField(term660482, term660482.getClass(), "first", term660552);
        setField(term660412, term660412.getClass(), "first", term660482);
        setField(term660342, term660342.getClass(), "first", term660412);
        setField(term660272, term660272.getClass(), "first", term660342);
        setField(term660202, term660202.getClass(), "first", term660272);
        setField(term660132, term660132.getClass(), "first", term660202);
        setField(term660062, term660062.getClass(), "first", term660132);
        setField(term659992, term659992.getClass(), "first", term660062);
        setField(term659922, term659922.getClass(), "first", term659992);
        setField(term659852, term659852.getClass(), "first", term659922);
        setField(term659782, term659782.getClass(), "first", term659852);
        setField(term659712, term659712.getClass(), "first", term659782);
        setField(term659642, term659642.getClass(), "first", term659712);
        setField(term659572, term659572.getClass(), "first", term659642);
        setField(term659502, term659502.getClass(), "first", term659572);
        setField(term659432, term659432.getClass(), "first", term659502);
        setField(term659362, term659362.getClass(), "first", term659432);
        setField(term659292, term659292.getClass(), "first", term659362);
        setField(term659222, term659222.getClass(), "first", term659292);
        setField(term659152, term659152.getClass(), "first", term659222);
        setField(term659082, term659082.getClass(), "first", term659152);
        setField(term659012, term659012.getClass(), "first", term659082);
        setField(term658942, term658942.getClass(), "first", term659012);
        setField(term658872, term658872.getClass(), "first", term658942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term658872;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term658802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


