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

public class TypeInference_traverseAdd_838817955392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063194;
     Object term1063264;

    public TypeInference_traverseAdd_838817955392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063194 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1063264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1065994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1063334, term1063334.getClass(), "next", null);
        setIntField(term1063334, term1063334.getClass(), "type", 14);
        setIntField(term1063404, term1063404.getClass(), "type", 14);
        setIntField(term1063474, term1063474.getClass(), "type", 14);
        setIntField(term1063544, term1063544.getClass(), "type", 14);
        setIntField(term1063614, term1063614.getClass(), "type", 14);
        setIntField(term1063684, term1063684.getClass(), "type", 14);
        setIntField(term1063754, term1063754.getClass(), "type", 14);
        setIntField(term1063824, term1063824.getClass(), "type", 14);
        setIntField(term1063894, term1063894.getClass(), "type", 14);
        setIntField(term1063964, term1063964.getClass(), "type", 14);
        setIntField(term1064034, term1064034.getClass(), "type", 14);
        setIntField(term1064104, term1064104.getClass(), "type", 14);
        setIntField(term1064174, term1064174.getClass(), "type", 14);
        setIntField(term1064244, term1064244.getClass(), "type", 14);
        setIntField(term1064314, term1064314.getClass(), "type", 14);
        setIntField(term1064384, term1064384.getClass(), "type", 14);
        setIntField(term1064454, term1064454.getClass(), "type", 14);
        setIntField(term1064524, term1064524.getClass(), "type", 14);
        setIntField(term1064594, term1064594.getClass(), "type", 14);
        setIntField(term1064664, term1064664.getClass(), "type", 14);
        setIntField(term1064734, term1064734.getClass(), "type", 14);
        setIntField(term1064804, term1064804.getClass(), "type", 14);
        setIntField(term1064874, term1064874.getClass(), "type", 14);
        setIntField(term1064944, term1064944.getClass(), "type", 14);
        setIntField(term1065014, term1065014.getClass(), "type", 14);
        setIntField(term1065084, term1065084.getClass(), "type", 14);
        setIntField(term1065154, term1065154.getClass(), "type", 14);
        setIntField(term1065224, term1065224.getClass(), "type", 14);
        setIntField(term1065294, term1065294.getClass(), "type", 14);
        setIntField(term1065364, term1065364.getClass(), "type", 14);
        setIntField(term1065434, term1065434.getClass(), "type", 14);
        setIntField(term1065504, term1065504.getClass(), "type", 14);
        setIntField(term1065574, term1065574.getClass(), "type", 14);
        setIntField(term1065644, term1065644.getClass(), "type", 14);
        setIntField(term1065714, term1065714.getClass(), "type", 14);
        setIntField(term1065784, term1065784.getClass(), "type", 14);
        setIntField(term1065854, term1065854.getClass(), "type", 14);
        setIntField(term1065924, term1065924.getClass(), "type", 14);
        setIntField(term1065994, term1065994.getClass(), "type", 14);
        setIntField(term1066064, term1066064.getClass(), "type", 14);
        setIntField(term1066134, term1066134.getClass(), "type", 14);
        setIntField(term1066204, term1066204.getClass(), "type", 14);
        setIntField(term1066274, term1066274.getClass(), "type", 14);
        setIntField(term1066344, term1066344.getClass(), "type", 14);
        setIntField(term1066414, term1066414.getClass(), "type", 14);
        setIntField(term1066484, term1066484.getClass(), "type", 14);
        setIntField(term1066554, term1066554.getClass(), "type", 14);
        setIntField(term1066624, term1066624.getClass(), "type", 14);
        setIntField(term1066694, term1066694.getClass(), "type", 14);
        setIntField(term1066764, term1066764.getClass(), "type", 14);
        setIntField(term1066834, term1066834.getClass(), "type", 14);
        setIntField(term1066904, term1066904.getClass(), "type", 14);
        setIntField(term1066974, term1066974.getClass(), "type", 14);
        setIntField(term1067044, term1067044.getClass(), "type", 14);
        setIntField(term1067114, term1067114.getClass(), "type", 14);
        setIntField(term1067184, term1067184.getClass(), "type", 14);
        setIntField(term1067254, term1067254.getClass(), "type", 14);
        setIntField(term1067324, term1067324.getClass(), "type", 14);
        setIntField(term1067394, term1067394.getClass(), "type", 14);
        setIntField(term1067464, term1067464.getClass(), "type", 14);
        setIntField(term1067534, term1067534.getClass(), "type", 14);
        setIntField(term1067604, term1067604.getClass(), "type", 14);
        setIntField(term1067674, term1067674.getClass(), "type", 55);
        setField(term1067604, term1067604.getClass(), "first", term1067674);
        setField(term1067534, term1067534.getClass(), "first", term1067604);
        setField(term1067464, term1067464.getClass(), "first", term1067534);
        setField(term1067394, term1067394.getClass(), "first", term1067464);
        setField(term1067324, term1067324.getClass(), "first", term1067394);
        setField(term1067254, term1067254.getClass(), "first", term1067324);
        setField(term1067184, term1067184.getClass(), "first", term1067254);
        setField(term1067114, term1067114.getClass(), "first", term1067184);
        setField(term1067044, term1067044.getClass(), "first", term1067114);
        setField(term1066974, term1066974.getClass(), "first", term1067044);
        setField(term1066904, term1066904.getClass(), "first", term1066974);
        setField(term1066834, term1066834.getClass(), "first", term1066904);
        setField(term1066764, term1066764.getClass(), "first", term1066834);
        setField(term1066694, term1066694.getClass(), "first", term1066764);
        setField(term1066624, term1066624.getClass(), "first", term1066694);
        setField(term1066554, term1066554.getClass(), "first", term1066624);
        setField(term1066484, term1066484.getClass(), "first", term1066554);
        setField(term1066414, term1066414.getClass(), "first", term1066484);
        setField(term1066344, term1066344.getClass(), "first", term1066414);
        setField(term1066274, term1066274.getClass(), "first", term1066344);
        setField(term1066204, term1066204.getClass(), "first", term1066274);
        setField(term1066134, term1066134.getClass(), "first", term1066204);
        setField(term1066064, term1066064.getClass(), "first", term1066134);
        setField(term1065994, term1065994.getClass(), "first", term1066064);
        setField(term1065924, term1065924.getClass(), "first", term1065994);
        setField(term1065854, term1065854.getClass(), "first", term1065924);
        setField(term1065784, term1065784.getClass(), "first", term1065854);
        setField(term1065714, term1065714.getClass(), "first", term1065784);
        setField(term1065644, term1065644.getClass(), "first", term1065714);
        setField(term1065574, term1065574.getClass(), "first", term1065644);
        setField(term1065504, term1065504.getClass(), "first", term1065574);
        setField(term1065434, term1065434.getClass(), "first", term1065504);
        setField(term1065364, term1065364.getClass(), "first", term1065434);
        setField(term1065294, term1065294.getClass(), "first", term1065364);
        setField(term1065224, term1065224.getClass(), "first", term1065294);
        setField(term1065154, term1065154.getClass(), "first", term1065224);
        setField(term1065084, term1065084.getClass(), "first", term1065154);
        setField(term1065014, term1065014.getClass(), "first", term1065084);
        setField(term1064944, term1064944.getClass(), "first", term1065014);
        setField(term1064874, term1064874.getClass(), "first", term1064944);
        setField(term1064804, term1064804.getClass(), "first", term1064874);
        setField(term1064734, term1064734.getClass(), "first", term1064804);
        setField(term1064664, term1064664.getClass(), "first", term1064734);
        setField(term1064594, term1064594.getClass(), "first", term1064664);
        setField(term1064524, term1064524.getClass(), "first", term1064594);
        setField(term1064454, term1064454.getClass(), "first", term1064524);
        setField(term1064384, term1064384.getClass(), "first", term1064454);
        setField(term1064314, term1064314.getClass(), "first", term1064384);
        setField(term1064244, term1064244.getClass(), "first", term1064314);
        setField(term1064174, term1064174.getClass(), "first", term1064244);
        setField(term1064104, term1064104.getClass(), "first", term1064174);
        setField(term1064034, term1064034.getClass(), "first", term1064104);
        setField(term1063964, term1063964.getClass(), "first", term1064034);
        setField(term1063894, term1063894.getClass(), "first", term1063964);
        setField(term1063824, term1063824.getClass(), "first", term1063894);
        setField(term1063754, term1063754.getClass(), "first", term1063824);
        setField(term1063684, term1063684.getClass(), "first", term1063754);
        setField(term1063614, term1063614.getClass(), "first", term1063684);
        setField(term1063544, term1063544.getClass(), "first", term1063614);
        setField(term1063474, term1063474.getClass(), "first", term1063544);
        setField(term1063404, term1063404.getClass(), "first", term1063474);
        setField(term1063334, term1063334.getClass(), "first", term1063404);
        setField(term1063264, term1063264.getClass(), "first", term1063334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1063264;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1063194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


