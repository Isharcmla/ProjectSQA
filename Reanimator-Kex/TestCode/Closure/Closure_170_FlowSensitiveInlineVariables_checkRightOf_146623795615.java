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

public class FlowSensitiveInlineVariables_checkRightOf_146623795615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term436;

    public FlowSensitiveInlineVariables_checkRightOf_146623795615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term409, term409.getClass(), "type", -556405712);
        setIntField(term411, term411.getClass(), "type", -1772434990);
        setIntField(term413, term413.getClass(), "type", -1845499264);
        setIntField(term415, term415.getClass(), "type", -505439934);
        setIntField(term417, term417.getClass(), "type", -344842608);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term415, term415.getClass(), "next", term417);
        setIntField(term420, term420.getClass(), "type", 941650513);
        setField(term420, term420.getClass(), "next", null);
        setField(term420, term420.getClass(), "first", null);
        setField(term420, term420.getClass(), "last", term417);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
        setField(term415, term415.getClass(), "first", term420);
        setField(term415, term415.getClass(), "last", term413);
        setField(term415, term415.getClass(), "propListHead", null);
        setIntField(term415, term415.getClass(), "sourcePosition", 0);
        setField(term415, term415.getClass(), "jsType", null);
        setField(term415, term415.getClass(), "parent", null);
        setField(term413, term413.getClass(), "next", term415);
        setField(term413, term413.getClass(), "first", term417);
        setIntField(term424, term424.getClass(), "type", -1034506028);
        setIntField(term426, term426.getClass(), "type", -1263114719);
        setField(term426, term426.getClass(), "next", null);
        setField(term426, term426.getClass(), "first", term420);
        setField(term426, term426.getClass(), "last", term415);
        setField(term426, term426.getClass(), "propListHead", null);
        setIntField(term426, term426.getClass(), "sourcePosition", 0);
        setField(term426, term426.getClass(), "jsType", null);
        setField(term426, term426.getClass(), "parent", null);
        setField(term424, term424.getClass(), "next", term426);
        setField(term424, term424.getClass(), "first", term411);
        setField(term424, term424.getClass(), "last", term411);
        setField(term424, term424.getClass(), "propListHead", null);
        setIntField(term424, term424.getClass(), "sourcePosition", 0);
        setField(term424, term424.getClass(), "jsType", null);
        setField(term424, term424.getClass(), "parent", null);
        setField(term413, term413.getClass(), "last", term424);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        setField(term411, term411.getClass(), "next", term413);
        setIntField(term431, term431.getClass(), "type", -894662986);
        setField(term431, term431.getClass(), "next", term424);
        setField(term431, term431.getClass(), "first", term426);
        setField(term431, term431.getClass(), "last", term409);
        setField(term431, term431.getClass(), "propListHead", null);
        setIntField(term431, term431.getClass(), "sourcePosition", 0);
        setField(term431, term431.getClass(), "jsType", null);
        setField(term431, term431.getClass(), "parent", null);
        setField(term411, term411.getClass(), "first", term431);
        setField(term411, term411.getClass(), "last", term431);
        setField(term411, term411.getClass(), "propListHead", null);
        setIntField(term411, term411.getClass(), "sourcePosition", 0);
        setField(term411, term411.getClass(), "jsType", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term409, term409.getClass(), "next", term411);
        setField(term409, term409.getClass(), "first", term415);
        setField(term409, term409.getClass(), "last", term417);
        setField(term409, term409.getClass(), "propListHead", null);
        setIntField(term409, term409.getClass(), "sourcePosition", 0);
        setField(term409, term409.getClass(), "jsType", null);
        setField(term409, term409.getClass(), "parent", null);
        term436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term436, term436.getClass(), "type", 304775596);
        setIntField(term438, term438.getClass(), "type", -1347665717);
        setIntField(term440, term440.getClass(), "type", -1888585309);
        setIntField(term442, term442.getClass(), "type", 683666002);
        setIntField(term444, term444.getClass(), "type", 1596213415);
        setField(term444, term444.getClass(), "next", null);
        setField(term444, term444.getClass(), "first", null);
        setField(term444, term444.getClass(), "last", null);
        setField(term444, term444.getClass(), "propListHead", null);
        setIntField(term444, term444.getClass(), "sourcePosition", 0);
        setField(term444, term444.getClass(), "jsType", null);
        setField(term444, term444.getClass(), "parent", null);
        setField(term442, term442.getClass(), "next", term444);
        setIntField(term447, term447.getClass(), "type", -268815336);
        setField(term447, term447.getClass(), "next", null);
        setField(term447, term447.getClass(), "first", null);
        setField(term447, term447.getClass(), "last", term444);
        setField(term447, term447.getClass(), "propListHead", null);
        setIntField(term447, term447.getClass(), "sourcePosition", 0);
        setField(term447, term447.getClass(), "jsType", null);
        setField(term447, term447.getClass(), "parent", null);
        setField(term442, term442.getClass(), "first", term447);
        setField(term442, term442.getClass(), "last", term440);
        setField(term442, term442.getClass(), "propListHead", null);
        setIntField(term442, term442.getClass(), "sourcePosition", 0);
        setField(term442, term442.getClass(), "jsType", null);
        setField(term442, term442.getClass(), "parent", null);
        setField(term440, term440.getClass(), "next", term442);
        setField(term440, term440.getClass(), "first", term444);
        setIntField(term451, term451.getClass(), "type", -663691365);
        setIntField(term453, term453.getClass(), "type", 339854490);
        setField(term453, term453.getClass(), "next", null);
        setField(term453, term453.getClass(), "first", term447);
        setField(term453, term453.getClass(), "last", term442);
        setField(term453, term453.getClass(), "propListHead", null);
        setIntField(term453, term453.getClass(), "sourcePosition", 0);
        setField(term453, term453.getClass(), "jsType", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term451, term451.getClass(), "next", term453);
        setField(term451, term451.getClass(), "first", term438);
        setField(term451, term451.getClass(), "last", term438);
        setField(term451, term451.getClass(), "propListHead", null);
        setIntField(term451, term451.getClass(), "sourcePosition", 0);
        setField(term451, term451.getClass(), "jsType", null);
        setField(term451, term451.getClass(), "parent", null);
        setField(term440, term440.getClass(), "last", term451);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term438, term438.getClass(), "next", term440);
        setIntField(term458, term458.getClass(), "type", -615654495);
        setField(term458, term458.getClass(), "next", term451);
        setField(term458, term458.getClass(), "first", term453);
        setField(term458, term458.getClass(), "last", term436);
        setField(term458, term458.getClass(), "propListHead", null);
        setIntField(term458, term458.getClass(), "sourcePosition", 0);
        setField(term458, term458.getClass(), "jsType", null);
        setField(term458, term458.getClass(), "parent", null);
        setField(term438, term438.getClass(), "first", term458);
        setField(term438, term438.getClass(), "last", term458);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term436, term436.getClass(), "next", term438);
        setField(term436, term436.getClass(), "first", term442);
        setField(term436, term436.getClass(), "last", term444);
        setField(term436, term436.getClass(), "propListHead", null);
        setIntField(term436, term436.getClass(), "sourcePosition", 0);
        setField(term436, term436.getClass(), "jsType", null);
        setField(term436, term436.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term409;
        args[1] = term436;
        args[2] = null;
        try {
            callMethod(klass, "checkRightOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


