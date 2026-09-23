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

public class TypeInference_traverseArrayLiteral_67090236253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383328;
     Object term383398;

    public TypeInference_traverseArrayLiteral_67090236253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383328 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term383398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term387598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term383468, term383468.getClass(), "type", 83);
        setIntField(term383538, term383538.getClass(), "type", 83);
        setIntField(term383608, term383608.getClass(), "type", 83);
        setIntField(term383678, term383678.getClass(), "type", 83);
        setIntField(term383748, term383748.getClass(), "type", 83);
        setIntField(term383818, term383818.getClass(), "type", 83);
        setIntField(term383888, term383888.getClass(), "type", 83);
        setIntField(term383958, term383958.getClass(), "type", 83);
        setIntField(term384028, term384028.getClass(), "type", 83);
        setIntField(term384098, term384098.getClass(), "type", 83);
        setIntField(term384168, term384168.getClass(), "type", 83);
        setIntField(term384238, term384238.getClass(), "type", 83);
        setIntField(term384308, term384308.getClass(), "type", 83);
        setIntField(term384378, term384378.getClass(), "type", 83);
        setIntField(term384448, term384448.getClass(), "type", 83);
        setIntField(term384518, term384518.getClass(), "type", 83);
        setIntField(term384588, term384588.getClass(), "type", 83);
        setIntField(term384658, term384658.getClass(), "type", 83);
        setIntField(term384728, term384728.getClass(), "type", 83);
        setIntField(term384798, term384798.getClass(), "type", 83);
        setIntField(term384868, term384868.getClass(), "type", 83);
        setIntField(term384938, term384938.getClass(), "type", 83);
        setIntField(term385008, term385008.getClass(), "type", 83);
        setIntField(term385078, term385078.getClass(), "type", 83);
        setIntField(term385148, term385148.getClass(), "type", 83);
        setIntField(term385218, term385218.getClass(), "type", 83);
        setIntField(term385288, term385288.getClass(), "type", 83);
        setIntField(term385358, term385358.getClass(), "type", 83);
        setIntField(term385428, term385428.getClass(), "type", 83);
        setIntField(term385498, term385498.getClass(), "type", 83);
        setIntField(term385568, term385568.getClass(), "type", 83);
        setIntField(term385638, term385638.getClass(), "type", 83);
        setIntField(term385708, term385708.getClass(), "type", 83);
        setIntField(term385778, term385778.getClass(), "type", 83);
        setIntField(term385848, term385848.getClass(), "type", 83);
        setIntField(term385918, term385918.getClass(), "type", 83);
        setIntField(term385988, term385988.getClass(), "type", 83);
        setIntField(term386058, term386058.getClass(), "type", 83);
        setIntField(term386128, term386128.getClass(), "type", 83);
        setIntField(term386198, term386198.getClass(), "type", 83);
        setIntField(term386268, term386268.getClass(), "type", 83);
        setIntField(term386338, term386338.getClass(), "type", 83);
        setIntField(term386408, term386408.getClass(), "type", 83);
        setIntField(term386478, term386478.getClass(), "type", 83);
        setIntField(term386548, term386548.getClass(), "type", 83);
        setIntField(term386618, term386618.getClass(), "type", 83);
        setIntField(term386688, term386688.getClass(), "type", 83);
        setIntField(term386758, term386758.getClass(), "type", 83);
        setIntField(term386828, term386828.getClass(), "type", 83);
        setIntField(term386898, term386898.getClass(), "type", 83);
        setIntField(term386968, term386968.getClass(), "type", 83);
        setIntField(term387038, term387038.getClass(), "type", 83);
        setIntField(term387108, term387108.getClass(), "type", 83);
        setIntField(term387178, term387178.getClass(), "type", 83);
        setIntField(term387248, term387248.getClass(), "type", 83);
        setIntField(term387318, term387318.getClass(), "type", 83);
        setIntField(term387388, term387388.getClass(), "type", 83);
        setIntField(term387458, term387458.getClass(), "type", 83);
        setIntField(term387528, term387528.getClass(), "type", 83);
        setIntField(term387598, term387598.getClass(), "type", 131);
        setField(term387528, term387528.getClass(), "first", term387598);
        setField(term387458, term387458.getClass(), "first", term387528);
        setField(term387388, term387388.getClass(), "first", term387458);
        setField(term387318, term387318.getClass(), "first", term387388);
        setField(term387248, term387248.getClass(), "first", term387318);
        setField(term387178, term387178.getClass(), "first", term387248);
        setField(term387108, term387108.getClass(), "first", term387178);
        setField(term387038, term387038.getClass(), "first", term387108);
        setField(term386968, term386968.getClass(), "first", term387038);
        setField(term386898, term386898.getClass(), "first", term386968);
        setField(term386828, term386828.getClass(), "first", term386898);
        setField(term386758, term386758.getClass(), "first", term386828);
        setField(term386688, term386688.getClass(), "first", term386758);
        setField(term386618, term386618.getClass(), "first", term386688);
        setField(term386548, term386548.getClass(), "first", term386618);
        setField(term386478, term386478.getClass(), "first", term386548);
        setField(term386408, term386408.getClass(), "first", term386478);
        setField(term386338, term386338.getClass(), "first", term386408);
        setField(term386268, term386268.getClass(), "first", term386338);
        setField(term386198, term386198.getClass(), "first", term386268);
        setField(term386128, term386128.getClass(), "first", term386198);
        setField(term386058, term386058.getClass(), "first", term386128);
        setField(term385988, term385988.getClass(), "first", term386058);
        setField(term385918, term385918.getClass(), "first", term385988);
        setField(term385848, term385848.getClass(), "first", term385918);
        setField(term385778, term385778.getClass(), "first", term385848);
        setField(term385708, term385708.getClass(), "first", term385778);
        setField(term385638, term385638.getClass(), "first", term385708);
        setField(term385568, term385568.getClass(), "first", term385638);
        setField(term385498, term385498.getClass(), "first", term385568);
        setField(term385428, term385428.getClass(), "first", term385498);
        setField(term385358, term385358.getClass(), "first", term385428);
        setField(term385288, term385288.getClass(), "first", term385358);
        setField(term385218, term385218.getClass(), "first", term385288);
        setField(term385148, term385148.getClass(), "first", term385218);
        setField(term385078, term385078.getClass(), "first", term385148);
        setField(term385008, term385008.getClass(), "first", term385078);
        setField(term384938, term384938.getClass(), "first", term385008);
        setField(term384868, term384868.getClass(), "first", term384938);
        setField(term384798, term384798.getClass(), "first", term384868);
        setField(term384728, term384728.getClass(), "first", term384798);
        setField(term384658, term384658.getClass(), "first", term384728);
        setField(term384588, term384588.getClass(), "first", term384658);
        setField(term384518, term384518.getClass(), "first", term384588);
        setField(term384448, term384448.getClass(), "first", term384518);
        setField(term384378, term384378.getClass(), "first", term384448);
        setField(term384308, term384308.getClass(), "first", term384378);
        setField(term384238, term384238.getClass(), "first", term384308);
        setField(term384168, term384168.getClass(), "first", term384238);
        setField(term384098, term384098.getClass(), "first", term384168);
        setField(term384028, term384028.getClass(), "first", term384098);
        setField(term383958, term383958.getClass(), "first", term384028);
        setField(term383888, term383888.getClass(), "first", term383958);
        setField(term383818, term383818.getClass(), "first", term383888);
        setField(term383748, term383748.getClass(), "first", term383818);
        setField(term383678, term383678.getClass(), "first", term383748);
        setField(term383608, term383608.getClass(), "first", term383678);
        setField(term383538, term383538.getClass(), "first", term383608);
        setField(term383468, term383468.getClass(), "first", term383538);
        setField(term383398, term383398.getClass(), "first", term383468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term383398;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term383328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


