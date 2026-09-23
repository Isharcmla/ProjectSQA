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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MaybeReachingVariableUse_computeMayUse_203095709742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95642;
     Object term95712;

    public MaybeReachingVariableUse_computeMayUse_203095709742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95642 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        term95712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95712, term95712.getClass(), "type", -1845499264);
        setIntField(term95782, term95782.getClass(), "type", 444029505);
        setField(term95782, term95782.getClass(), "last", null);
        setField(term95712, term95712.getClass(), "last", term95782);
        setField(term95852, term95852.getClass(), "next", term95782);
        setIntField(term95852, term95852.getClass(), "type", 941650513);
        setIntField(term95922, term95922.getClass(), "type", -344842608);
        setIntField(term95992, term95992.getClass(), "type", -894662986);
        setIntField(term96062, term96062.getClass(), "type", -505439934);
        setIntField(term96132, term96132.getClass(), "type", -1347665717);
        setIntField(term96202, term96202.getClass(), "type", -1845499264);
        setIntField(term96272, term96272.getClass(), "type", 444029505);
        setField(term96272, term96272.getClass(), "last", null);
        setField(term96202, term96202.getClass(), "last", term96272);
        setField(term96342, term96342.getClass(), "next", term96272);
        setIntField(term96342, term96342.getClass(), "type", 941650513);
        setIntField(term96412, term96412.getClass(), "type", -344842608);
        setIntField(term96482, term96482.getClass(), "type", -894662986);
        setIntField(term96552, term96552.getClass(), "type", -505439934);
        setIntField(term96622, term96622.getClass(), "type", -1347665717);
        setIntField(term96692, term96692.getClass(), "type", -1845499264);
        setIntField(term96762, term96762.getClass(), "type", 444029505);
        setField(term96762, term96762.getClass(), "last", null);
        setField(term96692, term96692.getClass(), "last", term96762);
        setField(term96832, term96832.getClass(), "next", term96762);
        setIntField(term96832, term96832.getClass(), "type", 941650513);
        setIntField(term96902, term96902.getClass(), "type", -344842608);
        setIntField(term96972, term96972.getClass(), "type", -894662986);
        setIntField(term97042, term97042.getClass(), "type", -505439934);
        setIntField(term97112, term97112.getClass(), "type", -1347665717);
        setIntField(term97182, term97182.getClass(), "type", -1845499264);
        setIntField(term97252, term97252.getClass(), "type", 444029505);
        setField(term97252, term97252.getClass(), "last", null);
        setField(term97182, term97182.getClass(), "last", term97252);
        setField(term97344, term97344.getClass(), "next", term97252);
        setIntField(term97344, term97344.getClass(), "type", 941650513);
        setIntField(term97414, term97414.getClass(), "type", -344842608);
        setIntField(term97484, term97484.getClass(), "type", -894662986);
        setIntField(term97554, term97554.getClass(), "type", -505439934);
        setIntField(term97624, term97624.getClass(), "type", -1347665717);
        setIntField(term97694, term97694.getClass(), "type", -1845499264);
        setField(term97694, term97694.getClass(), "last", term96272);
        setField(term97764, term97764.getClass(), "next", term96272);
        setIntField(term97764, term97764.getClass(), "type", 941650513);
        setIntField(term97834, term97834.getClass(), "type", -344842608);
        setIntField(term97904, term97904.getClass(), "type", -894662986);
        setIntField(term97974, term97974.getClass(), "type", -505439934);
        setIntField(term98044, term98044.getClass(), "type", -1347665717);
        setIntField(term98114, term98114.getClass(), "type", -1845499264);
        setField(term98114, term98114.getClass(), "last", term96272);
        setField(term98184, term98184.getClass(), "next", term96272);
        setIntField(term98184, term98184.getClass(), "type", 941650513);
        setIntField(term98254, term98254.getClass(), "type", -344842608);
        setIntField(term98324, term98324.getClass(), "type", -894662986);
        setIntField(term98394, term98394.getClass(), "type", -505439934);
        setIntField(term98464, term98464.getClass(), "type", -1347665717);
        setIntField(term98534, term98534.getClass(), "type", -1845499264);
        setField(term98534, term98534.getClass(), "last", term96272);
        setField(term98604, term98604.getClass(), "next", term96272);
        setIntField(term98604, term98604.getClass(), "type", 941650513);
        setIntField(term98674, term98674.getClass(), "type", -344842608);
        setIntField(term98744, term98744.getClass(), "type", -894662986);
        setIntField(term98814, term98814.getClass(), "type", -505439934);
        setIntField(term98884, term98884.getClass(), "type", -1347665717);
        setIntField(term98954, term98954.getClass(), "type", -1845499264);
        setField(term98954, term98954.getClass(), "last", term96272);
        setField(term99024, term99024.getClass(), "next", term96272);
        setIntField(term99024, term99024.getClass(), "type", 941650513);
        setIntField(term99094, term99094.getClass(), "type", -344842608);
        setIntField(term99164, term99164.getClass(), "type", -894662986);
        setIntField(term99234, term99234.getClass(), "type", -505439934);
        setIntField(term99304, term99304.getClass(), "type", -1347665717);
        setIntField(term99374, term99374.getClass(), "type", -1845499264);
        setField(term99374, term99374.getClass(), "last", term96272);
        setField(term99444, term99444.getClass(), "next", term96272);
        setIntField(term99444, term99444.getClass(), "type", 941650513);
        setIntField(term99514, term99514.getClass(), "type", -344842608);
        setIntField(term99584, term99584.getClass(), "type", -894662986);
        setField(term99584, term99584.getClass(), "last", term97344);
        setField(term99514, term99514.getClass(), "last", term99584);
        setField(term99444, term99444.getClass(), "last", term99514);
        setField(term99374, term99374.getClass(), "first", term99444);
        setField(term99304, term99304.getClass(), "last", term99374);
        setField(term99234, term99234.getClass(), "last", term99304);
        setField(term99164, term99164.getClass(), "last", term99234);
        setField(term99094, term99094.getClass(), "last", term99164);
        setField(term99024, term99024.getClass(), "last", term99094);
        setField(term98954, term98954.getClass(), "first", term99024);
        setField(term98884, term98884.getClass(), "last", term98954);
        setField(term98814, term98814.getClass(), "last", term98884);
        setField(term98744, term98744.getClass(), "last", term98814);
        setField(term98674, term98674.getClass(), "last", term98744);
        setField(term98604, term98604.getClass(), "last", term98674);
        setField(term98534, term98534.getClass(), "first", term98604);
        setField(term98464, term98464.getClass(), "last", term98534);
        setField(term98394, term98394.getClass(), "last", term98464);
        setField(term98324, term98324.getClass(), "last", term98394);
        setField(term98254, term98254.getClass(), "last", term98324);
        setField(term98184, term98184.getClass(), "last", term98254);
        setField(term98114, term98114.getClass(), "first", term98184);
        setField(term98044, term98044.getClass(), "last", term98114);
        setField(term97974, term97974.getClass(), "last", term98044);
        setField(term97904, term97904.getClass(), "last", term97974);
        setField(term97834, term97834.getClass(), "last", term97904);
        setField(term97764, term97764.getClass(), "last", term97834);
        setField(term97694, term97694.getClass(), "first", term97764);
        setField(term97624, term97624.getClass(), "last", term97694);
        setField(term97554, term97554.getClass(), "last", term97624);
        setField(term97484, term97484.getClass(), "last", term97554);
        setField(term97414, term97414.getClass(), "last", term97484);
        setField(term97344, term97344.getClass(), "last", term97414);
        setField(term97182, term97182.getClass(), "first", term97344);
        setField(term97112, term97112.getClass(), "last", term97182);
        setField(term97042, term97042.getClass(), "last", term97112);
        setField(term96972, term96972.getClass(), "last", term97042);
        setField(term96902, term96902.getClass(), "last", term96972);
        setField(term96832, term96832.getClass(), "last", term96902);
        setField(term96692, term96692.getClass(), "first", term96832);
        setField(term96622, term96622.getClass(), "last", term96692);
        setField(term96552, term96552.getClass(), "last", term96622);
        setField(term96482, term96482.getClass(), "last", term96552);
        setField(term96412, term96412.getClass(), "last", term96482);
        setField(term96342, term96342.getClass(), "last", term96412);
        setField(term96202, term96202.getClass(), "first", term96342);
        setField(term96132, term96132.getClass(), "last", term96202);
        setField(term96062, term96062.getClass(), "last", term96132);
        setField(term95992, term95992.getClass(), "last", term96062);
        setField(term95922, term95922.getClass(), "last", term95992);
        setField(term95852, term95852.getClass(), "last", term95922);
        setField(term95712, term95712.getClass(), "first", term95852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term95712;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMayUse", argTypes, term95642, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


