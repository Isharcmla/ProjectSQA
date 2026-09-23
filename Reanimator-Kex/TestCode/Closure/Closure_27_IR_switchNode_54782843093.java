package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_switchNode_54782843093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;
     Object term785;

    public IR_switchNode_54782843093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term758, term758.getClass(), "type", -1656687479);
        setIntField(term760, term760.getClass(), "type", -249614216);
        setIntField(term762, term762.getClass(), "type", 1870727665);
        setIntField(term764, term764.getClass(), "type", -519881101);
        setIntField(term766, term766.getClass(), "type", -680920524);
        setField(term766, term766.getClass(), "next", null);
        setField(term766, term766.getClass(), "first", null);
        setField(term766, term766.getClass(), "last", null);
        setField(term766, term766.getClass(), "propListHead", null);
        setIntField(term766, term766.getClass(), "sourcePosition", 0);
        setField(term766, term766.getClass(), "jsType", null);
        setField(term766, term766.getClass(), "parent", null);
        setField(term764, term764.getClass(), "next", term766);
        setIntField(term769, term769.getClass(), "type", -916335264);
        setField(term769, term769.getClass(), "next", null);
        setField(term769, term769.getClass(), "first", null);
        setField(term769, term769.getClass(), "last", term766);
        setField(term769, term769.getClass(), "propListHead", null);
        setIntField(term769, term769.getClass(), "sourcePosition", 0);
        setField(term769, term769.getClass(), "jsType", null);
        setField(term769, term769.getClass(), "parent", null);
        setField(term764, term764.getClass(), "first", term769);
        setField(term764, term764.getClass(), "last", term762);
        setField(term764, term764.getClass(), "propListHead", null);
        setIntField(term764, term764.getClass(), "sourcePosition", 0);
        setField(term764, term764.getClass(), "jsType", null);
        setField(term764, term764.getClass(), "parent", null);
        setField(term762, term762.getClass(), "next", term764);
        setField(term762, term762.getClass(), "first", term766);
        setIntField(term773, term773.getClass(), "type", -43417861);
        setIntField(term775, term775.getClass(), "type", -1533843432);
        setField(term775, term775.getClass(), "next", null);
        setField(term775, term775.getClass(), "first", term769);
        setField(term775, term775.getClass(), "last", term764);
        setField(term775, term775.getClass(), "propListHead", null);
        setIntField(term775, term775.getClass(), "sourcePosition", 0);
        setField(term775, term775.getClass(), "jsType", null);
        setField(term775, term775.getClass(), "parent", null);
        setField(term773, term773.getClass(), "next", term775);
        setField(term773, term773.getClass(), "first", term760);
        setField(term773, term773.getClass(), "last", term760);
        setField(term773, term773.getClass(), "propListHead", null);
        setIntField(term773, term773.getClass(), "sourcePosition", 0);
        setField(term773, term773.getClass(), "jsType", null);
        setField(term773, term773.getClass(), "parent", null);
        setField(term762, term762.getClass(), "last", term773);
        setField(term762, term762.getClass(), "propListHead", null);
        setIntField(term762, term762.getClass(), "sourcePosition", 0);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term760, term760.getClass(), "next", term762);
        setIntField(term780, term780.getClass(), "type", -123338791);
        setField(term780, term780.getClass(), "next", term773);
        setField(term780, term780.getClass(), "first", term775);
        setField(term780, term780.getClass(), "last", term758);
        setField(term780, term780.getClass(), "propListHead", null);
        setIntField(term780, term780.getClass(), "sourcePosition", 0);
        setField(term780, term780.getClass(), "jsType", null);
        setField(term780, term780.getClass(), "parent", null);
        setField(term760, term760.getClass(), "first", term780);
        setField(term760, term760.getClass(), "last", term780);
        setField(term760, term760.getClass(), "propListHead", null);
        setIntField(term760, term760.getClass(), "sourcePosition", 0);
        setField(term760, term760.getClass(), "jsType", null);
        setField(term760, term760.getClass(), "parent", null);
        setField(term758, term758.getClass(), "next", term760);
        setField(term758, term758.getClass(), "first", term764);
        setField(term758, term758.getClass(), "last", term766);
        setField(term758, term758.getClass(), "propListHead", null);
        setIntField(term758, term758.getClass(), "sourcePosition", 0);
        setField(term758, term758.getClass(), "jsType", null);
        setField(term758, term758.getClass(), "parent", null);
        term785 = (Object[]) newArray("com.google.javascript.rhino.Node", 5);
        Object term786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term786, term786.getClass(), "type", -1467089634);
        setIntField(term788, term788.getClass(), "type", 413548937);
        setIntField(term790, term790.getClass(), "type", 1901317214);
        setIntField(term792, term792.getClass(), "type", 1166710220);
        setField(term792, term792.getClass(), "next", null);
        setField(term792, term792.getClass(), "first", null);
        setField(term792, term792.getClass(), "last", term790);
        setField(term792, term792.getClass(), "propListHead", null);
        setIntField(term792, term792.getClass(), "sourcePosition", 0);
        setField(term792, term792.getClass(), "jsType", null);
        setField(term792, term792.getClass(), "parent", null);
        setField(term790, term790.getClass(), "next", term792);
        setIntField(term795, term795.getClass(), "type", -1070592289);
        setField(term795, term795.getClass(), "next", null);
        setField(term795, term795.getClass(), "first", null);
        setField(term795, term795.getClass(), "last", null);
        setField(term795, term795.getClass(), "propListHead", null);
        setIntField(term795, term795.getClass(), "sourcePosition", 0);
        setField(term795, term795.getClass(), "jsType", null);
        setField(term795, term795.getClass(), "parent", null);
        setField(term790, term790.getClass(), "first", term795);
        setIntField(term798, term798.getClass(), "type", 1768204942);
        setField(term798, term798.getClass(), "next", null);
        setField(term798, term798.getClass(), "first", term788);
        setField(term798, term798.getClass(), "last", term788);
        setField(term798, term798.getClass(), "propListHead", null);
        setIntField(term798, term798.getClass(), "sourcePosition", 0);
        setField(term798, term798.getClass(), "jsType", null);
        setField(term798, term798.getClass(), "parent", null);
        setField(term790, term790.getClass(), "last", term798);
        setField(term790, term790.getClass(), "propListHead", null);
        setIntField(term790, term790.getClass(), "sourcePosition", 0);
        setField(term790, term790.getClass(), "jsType", null);
        setField(term790, term790.getClass(), "parent", null);
        setField(term788, term788.getClass(), "next", term790);
        setIntField(term802, term802.getClass(), "type", 574481092);
        setField(term802, term802.getClass(), "next", term798);
        setIntField(term804, term804.getClass(), "type", 1252951645);
        setField(term804, term804.getClass(), "next", term802);
        setField(term804, term804.getClass(), "first", null);
        setField(term804, term804.getClass(), "last", term792);
        setField(term804, term804.getClass(), "propListHead", null);
        setIntField(term804, term804.getClass(), "sourcePosition", 0);
        setField(term804, term804.getClass(), "jsType", null);
        setField(term804, term804.getClass(), "parent", null);
        setField(term802, term802.getClass(), "first", term804);
        setField(term802, term802.getClass(), "last", term786);
        setField(term802, term802.getClass(), "propListHead", null);
        setIntField(term802, term802.getClass(), "sourcePosition", 0);
        setField(term802, term802.getClass(), "jsType", null);
        setField(term802, term802.getClass(), "parent", null);
        setField(term788, term788.getClass(), "first", term802);
        setField(term788, term788.getClass(), "last", term802);
        setField(term788, term788.getClass(), "propListHead", null);
        setIntField(term788, term788.getClass(), "sourcePosition", 0);
        setField(term788, term788.getClass(), "jsType", null);
        setField(term788, term788.getClass(), "parent", null);
        setField(term786, term786.getClass(), "next", term788);
        setField(term786, term786.getClass(), "first", term792);
        setField(term786, term786.getClass(), "last", term795);
        setField(term786, term786.getClass(), "propListHead", null);
        setIntField(term786, term786.getClass(), "sourcePosition", 0);
        setField(term786, term786.getClass(), "jsType", null);
        setField(term786, term786.getClass(), "parent", null);
        setElement(term785, 0, term786);
        setElement(term785, 1, term795);
        setElement(term785, 2, term788);
        setIntField(term810, term810.getClass(), "type", 32185364);
        setField(term810, term810.getClass(), "next", term798);
        setField(term810, term810.getClass(), "first", term802);
        setField(term810, term810.getClass(), "last", term798);
        setField(term810, term810.getClass(), "propListHead", null);
        setIntField(term810, term810.getClass(), "sourcePosition", 0);
        setField(term810, term810.getClass(), "jsType", null);
        setField(term810, term810.getClass(), "parent", null);
        setElement(term785, 3, term810);
        setElement(term785, 4, term810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term758;
        args[1] = term785;
        try {
            callMethod(klass, "switchNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


