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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class NodeUtil_mayBeString_1356610414196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;
     Object term1157;
     Object term10757;

    public NodeUtil_mayBeString_1356610414196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1143 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1130, term1130.getClass(), "type", -1840305774);
        setIntField(term1132, term1132.getClass(), "type", 4900410);
        setIntField(term1134, term1134.getClass(), "type", 0);
        setField(term1134, term1134.getClass(), "next", null);
        setField(term1134, term1134.getClass(), "first", null);
        setField(term1134, term1134.getClass(), "last", null);
        setField(term1134, term1134.getClass(), "propListHead", null);
        setIntField(term1134, term1134.getClass(), "sourcePosition", 0);
        setField(term1134, term1134.getClass(), "jsType", null);
        setField(term1134, term1134.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "next", term1134);
        setIntField(term1137, term1137.getClass(), "type", 0);
        setField(term1137, term1137.getClass(), "next", null);
        setField(term1137, term1137.getClass(), "first", null);
        setField(term1137, term1137.getClass(), "last", null);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "first", term1137);
        setIntField(term1140, term1140.getClass(), "type", 0);
        setField(term1140, term1140.getClass(), "next", null);
        setField(term1140, term1140.getClass(), "first", null);
        setField(term1140, term1140.getClass(), "last", null);
        setField(term1140, term1140.getClass(), "propListHead", null);
        setIntField(term1140, term1140.getClass(), "sourcePosition", 0);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
        setField(term1132, term1132.getClass(), "last", term1140);
        setField(term1143, term1143.getClass(), "next", null);
        setIntField(term1143, term1143.getClass(), "type", 0);
        setIntField(term1143, term1143.getClass(), "intValue", 0);
        setField(term1143, term1143.getClass(), "objectValue", null);
        setField(term1132, term1132.getClass(), "propListHead", term1143);
        setIntField(term1132, term1132.getClass(), "sourcePosition", 812570053);
        setField(term1132, term1132.getClass(), "jsType", null);
        setField(term1132, term1132.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "next", term1132);
        setIntField(term1147, term1147.getClass(), "type", 0);
        setField(term1147, term1147.getClass(), "next", null);
        setField(term1147, term1147.getClass(), "first", null);
        setField(term1147, term1147.getClass(), "last", null);
        setField(term1147, term1147.getClass(), "propListHead", null);
        setIntField(term1147, term1147.getClass(), "sourcePosition", 0);
        setField(term1147, term1147.getClass(), "jsType", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "first", term1147);
        setIntField(term1150, term1150.getClass(), "type", 0);
        setField(term1150, term1150.getClass(), "next", null);
        setField(term1150, term1150.getClass(), "first", null);
        setField(term1150, term1150.getClass(), "last", null);
        setField(term1150, term1150.getClass(), "propListHead", null);
        setIntField(term1150, term1150.getClass(), "sourcePosition", 0);
        setField(term1150, term1150.getClass(), "jsType", null);
        setField(term1150, term1150.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "last", term1150);
        setField(term1153, term1153.getClass(), "next", null);
        setIntField(term1153, term1153.getClass(), "type", 0);
        setIntField(term1153, term1153.getClass(), "intValue", 0);
        setField(term1153, term1153.getClass(), "objectValue", null);
        setField(term1130, term1130.getClass(), "propListHead", term1153);
        setIntField(term1130, term1130.getClass(), "sourcePosition", -1488938905);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        term1157 = new Boolean(false);
        term10757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10762 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10757, term10757.getClass(), "type", -1840305774);
        setIntField(term10758, term10758.getClass(), "type", 4900410);
        setIntField(term10759, term10759.getClass(), "type", 0);
        setField(term10759, term10759.getClass(), "next", null);
        setField(term10759, term10759.getClass(), "first", null);
        setField(term10759, term10759.getClass(), "last", null);
        setField(term10759, term10759.getClass(), "propListHead", null);
        setIntField(term10759, term10759.getClass(), "sourcePosition", 0);
        setField(term10759, term10759.getClass(), "jsType", null);
        setField(term10759, term10759.getClass(), "parent", null);
        setField(term10758, term10758.getClass(), "next", term10759);
        setIntField(term10760, term10760.getClass(), "type", 0);
        setField(term10760, term10760.getClass(), "next", null);
        setField(term10760, term10760.getClass(), "first", null);
        setField(term10760, term10760.getClass(), "last", null);
        setField(term10760, term10760.getClass(), "propListHead", null);
        setIntField(term10760, term10760.getClass(), "sourcePosition", 0);
        setField(term10760, term10760.getClass(), "jsType", null);
        setField(term10760, term10760.getClass(), "parent", null);
        setField(term10758, term10758.getClass(), "first", term10760);
        setIntField(term10761, term10761.getClass(), "type", 0);
        setField(term10761, term10761.getClass(), "next", null);
        setField(term10761, term10761.getClass(), "first", null);
        setField(term10761, term10761.getClass(), "last", null);
        setField(term10761, term10761.getClass(), "propListHead", null);
        setIntField(term10761, term10761.getClass(), "sourcePosition", 0);
        setField(term10761, term10761.getClass(), "jsType", null);
        setField(term10761, term10761.getClass(), "parent", null);
        setField(term10758, term10758.getClass(), "last", term10761);
        setField(term10762, term10762.getClass(), "next", null);
        setIntField(term10762, term10762.getClass(), "type", 0);
        setIntField(term10762, term10762.getClass(), "intValue", 0);
        setField(term10762, term10762.getClass(), "objectValue", null);
        setField(term10758, term10758.getClass(), "propListHead", term10762);
        setIntField(term10758, term10758.getClass(), "sourcePosition", 812570053);
        setField(term10758, term10758.getClass(), "jsType", null);
        setField(term10758, term10758.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "next", term10758);
        setIntField(term10763, term10763.getClass(), "type", 0);
        setField(term10763, term10763.getClass(), "next", null);
        setField(term10763, term10763.getClass(), "first", null);
        setField(term10763, term10763.getClass(), "last", null);
        setField(term10763, term10763.getClass(), "propListHead", null);
        setIntField(term10763, term10763.getClass(), "sourcePosition", 0);
        setField(term10763, term10763.getClass(), "jsType", null);
        setField(term10763, term10763.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "first", term10763);
        setIntField(term10764, term10764.getClass(), "type", 0);
        setField(term10764, term10764.getClass(), "next", null);
        setField(term10764, term10764.getClass(), "first", null);
        setField(term10764, term10764.getClass(), "last", null);
        setField(term10764, term10764.getClass(), "propListHead", null);
        setIntField(term10764, term10764.getClass(), "sourcePosition", 0);
        setField(term10764, term10764.getClass(), "jsType", null);
        setField(term10764, term10764.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "last", term10764);
        setField(term10765, term10765.getClass(), "next", null);
        setIntField(term10765, term10765.getClass(), "type", 0);
        setIntField(term10765, term10765.getClass(), "intValue", 0);
        setField(term10765, term10765.getClass(), "objectValue", null);
        setField(term10757, term10757.getClass(), "propListHead", term10765);
        setIntField(term10757, term10757.getClass(), "sourcePosition", -1488938905);
        setField(term10757, term10757.getClass(), "jsType", null);
        setField(term10757, term10757.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1130;
        args[1] = term1157;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1130, term10757));
        assertTrue(recursiveEquals(term1157, false));
    }

};


