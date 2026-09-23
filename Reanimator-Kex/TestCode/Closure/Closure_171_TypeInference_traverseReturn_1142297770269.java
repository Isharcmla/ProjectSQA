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

public class TypeInference_traverseReturn_1142297770269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428211;
     Object term428281;

    public TypeInference_traverseReturn_1142297770269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428211 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term428281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term432901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term428351, term428351.getClass(), "type", 92);
        setIntField(term428421, term428421.getClass(), "type", 92);
        setIntField(term428491, term428491.getClass(), "type", 92);
        setIntField(term428561, term428561.getClass(), "type", 92);
        setIntField(term428631, term428631.getClass(), "type", 92);
        setIntField(term428701, term428701.getClass(), "type", 92);
        setIntField(term428771, term428771.getClass(), "type", 92);
        setIntField(term428841, term428841.getClass(), "type", 92);
        setIntField(term428911, term428911.getClass(), "type", 92);
        setIntField(term428981, term428981.getClass(), "type", 92);
        setIntField(term429051, term429051.getClass(), "type", 92);
        setIntField(term429121, term429121.getClass(), "type", 92);
        setIntField(term429191, term429191.getClass(), "type", 92);
        setIntField(term429261, term429261.getClass(), "type", 92);
        setIntField(term429331, term429331.getClass(), "type", 92);
        setIntField(term429401, term429401.getClass(), "type", 92);
        setIntField(term429471, term429471.getClass(), "type", 92);
        setIntField(term429541, term429541.getClass(), "type", 92);
        setIntField(term429611, term429611.getClass(), "type", 92);
        setIntField(term429681, term429681.getClass(), "type", 92);
        setIntField(term429751, term429751.getClass(), "type", 92);
        setIntField(term429821, term429821.getClass(), "type", 92);
        setIntField(term429891, term429891.getClass(), "type", 92);
        setIntField(term429961, term429961.getClass(), "type", 92);
        setIntField(term430031, term430031.getClass(), "type", 92);
        setIntField(term430101, term430101.getClass(), "type", 92);
        setIntField(term430171, term430171.getClass(), "type", 92);
        setIntField(term430241, term430241.getClass(), "type", 92);
        setIntField(term430311, term430311.getClass(), "type", 92);
        setIntField(term430381, term430381.getClass(), "type", 92);
        setIntField(term430451, term430451.getClass(), "type", 92);
        setIntField(term430521, term430521.getClass(), "type", 92);
        setIntField(term430591, term430591.getClass(), "type", 92);
        setIntField(term430661, term430661.getClass(), "type", 92);
        setIntField(term430731, term430731.getClass(), "type", 92);
        setIntField(term430801, term430801.getClass(), "type", 92);
        setIntField(term430871, term430871.getClass(), "type", 92);
        setIntField(term430941, term430941.getClass(), "type", 92);
        setIntField(term431011, term431011.getClass(), "type", 92);
        setIntField(term431081, term431081.getClass(), "type", 92);
        setIntField(term431151, term431151.getClass(), "type", 92);
        setIntField(term431221, term431221.getClass(), "type", 92);
        setIntField(term431291, term431291.getClass(), "type", 92);
        setIntField(term431361, term431361.getClass(), "type", 92);
        setIntField(term431431, term431431.getClass(), "type", 92);
        setIntField(term431501, term431501.getClass(), "type", 92);
        setIntField(term431571, term431571.getClass(), "type", 92);
        setIntField(term431641, term431641.getClass(), "type", 92);
        setIntField(term431711, term431711.getClass(), "type", 92);
        setIntField(term431781, term431781.getClass(), "type", 92);
        setIntField(term431851, term431851.getClass(), "type", 92);
        setIntField(term431921, term431921.getClass(), "type", 92);
        setIntField(term431991, term431991.getClass(), "type", 92);
        setIntField(term432061, term432061.getClass(), "type", 92);
        setIntField(term432131, term432131.getClass(), "type", 92);
        setIntField(term432201, term432201.getClass(), "type", 92);
        setIntField(term432271, term432271.getClass(), "type", 92);
        setIntField(term432341, term432341.getClass(), "type", 92);
        setIntField(term432411, term432411.getClass(), "type", 92);
        setIntField(term432481, term432481.getClass(), "type", 92);
        setIntField(term432551, term432551.getClass(), "type", 92);
        setIntField(term432621, term432621.getClass(), "type", 92);
        setIntField(term432691, term432691.getClass(), "type", 92);
        setIntField(term432761, term432761.getClass(), "type", 92);
        setIntField(term432831, term432831.getClass(), "type", 92);
        setIntField(term432901, term432901.getClass(), "type", 109);
        setField(term432831, term432831.getClass(), "first", term432901);
        setField(term432761, term432761.getClass(), "first", term432831);
        setField(term432691, term432691.getClass(), "first", term432761);
        setField(term432621, term432621.getClass(), "first", term432691);
        setField(term432551, term432551.getClass(), "first", term432621);
        setField(term432481, term432481.getClass(), "first", term432551);
        setField(term432411, term432411.getClass(), "first", term432481);
        setField(term432341, term432341.getClass(), "first", term432411);
        setField(term432271, term432271.getClass(), "first", term432341);
        setField(term432201, term432201.getClass(), "first", term432271);
        setField(term432131, term432131.getClass(), "first", term432201);
        setField(term432061, term432061.getClass(), "first", term432131);
        setField(term431991, term431991.getClass(), "first", term432061);
        setField(term431921, term431921.getClass(), "first", term431991);
        setField(term431851, term431851.getClass(), "first", term431921);
        setField(term431781, term431781.getClass(), "first", term431851);
        setField(term431711, term431711.getClass(), "first", term431781);
        setField(term431641, term431641.getClass(), "first", term431711);
        setField(term431571, term431571.getClass(), "first", term431641);
        setField(term431501, term431501.getClass(), "first", term431571);
        setField(term431431, term431431.getClass(), "first", term431501);
        setField(term431361, term431361.getClass(), "first", term431431);
        setField(term431291, term431291.getClass(), "first", term431361);
        setField(term431221, term431221.getClass(), "first", term431291);
        setField(term431151, term431151.getClass(), "first", term431221);
        setField(term431081, term431081.getClass(), "first", term431151);
        setField(term431011, term431011.getClass(), "first", term431081);
        setField(term430941, term430941.getClass(), "first", term431011);
        setField(term430871, term430871.getClass(), "first", term430941);
        setField(term430801, term430801.getClass(), "first", term430871);
        setField(term430731, term430731.getClass(), "first", term430801);
        setField(term430661, term430661.getClass(), "first", term430731);
        setField(term430591, term430591.getClass(), "first", term430661);
        setField(term430521, term430521.getClass(), "first", term430591);
        setField(term430451, term430451.getClass(), "first", term430521);
        setField(term430381, term430381.getClass(), "first", term430451);
        setField(term430311, term430311.getClass(), "first", term430381);
        setField(term430241, term430241.getClass(), "first", term430311);
        setField(term430171, term430171.getClass(), "first", term430241);
        setField(term430101, term430101.getClass(), "first", term430171);
        setField(term430031, term430031.getClass(), "first", term430101);
        setField(term429961, term429961.getClass(), "first", term430031);
        setField(term429891, term429891.getClass(), "first", term429961);
        setField(term429821, term429821.getClass(), "first", term429891);
        setField(term429751, term429751.getClass(), "first", term429821);
        setField(term429681, term429681.getClass(), "first", term429751);
        setField(term429611, term429611.getClass(), "first", term429681);
        setField(term429541, term429541.getClass(), "first", term429611);
        setField(term429471, term429471.getClass(), "first", term429541);
        setField(term429401, term429401.getClass(), "first", term429471);
        setField(term429331, term429331.getClass(), "first", term429401);
        setField(term429261, term429261.getClass(), "first", term429331);
        setField(term429191, term429191.getClass(), "first", term429261);
        setField(term429121, term429121.getClass(), "first", term429191);
        setField(term429051, term429051.getClass(), "first", term429121);
        setField(term428981, term428981.getClass(), "first", term429051);
        setField(term428911, term428911.getClass(), "first", term428981);
        setField(term428841, term428841.getClass(), "first", term428911);
        setField(term428771, term428771.getClass(), "first", term428841);
        setField(term428701, term428701.getClass(), "first", term428771);
        setField(term428631, term428631.getClass(), "first", term428701);
        setField(term428561, term428561.getClass(), "first", term428631);
        setField(term428491, term428491.getClass(), "first", term428561);
        setField(term428421, term428421.getClass(), "first", term428491);
        setField(term428351, term428351.getClass(), "first", term428421);
        setField(term428281, term428281.getClass(), "first", term428351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term428281;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term428211, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


