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
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleThrow_21183022258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1593;
     Object term1662;

    public ControlFlowAnalysis_handleThrow_21183022258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1595 = new HashMap();
        Object term1604 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1604, term1604.getClass(), "elementData", null);
        setIntField(term1604, term1604.getClass(), "size", -1736183862);
        setIntField(term1604, term1604.getClass(), "modCount", 897010381);
        Object term1607 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1607, term1607.getClass(), "elementData", null);
        setIntField(term1607, term1607.getClass(), "size", -15712667);
        setIntField(term1607, term1607.getClass(), "modCount", 1964967720);
        Object term1610 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1610, term1610.getClass(), "elementData", null);
        setIntField(term1610, term1610.getClass(), "size", 1351900243);
        setIntField(term1610, term1610.getClass(), "modCount", -330897705);
        Object term1613 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1613, term1613.getClass(), "elementData", null);
        setIntField(term1613, term1613.getClass(), "size", 1065595802);
        setIntField(term1613, term1613.getClass(), "modCount", 21031843);
        Object term1616 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1616, term1616.getClass(), "elementData", null);
        setIntField(term1616, term1616.getClass(), "size", -380787857);
        setIntField(term1616, term1616.getClass(), "modCount", 319853052);
        Object term1619 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1619, term1619.getClass(), "elementData", null);
        setIntField(term1619, term1619.getClass(), "size", -1097563716);
        setIntField(term1619, term1619.getClass(), "modCount", 1572907769);
        Object term1622 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1622, term1622.getClass(), "elementData", null);
        setIntField(term1622, term1622.getClass(), "size", 1608016787);
        setIntField(term1622, term1622.getClass(), "modCount", -516303035);
        Object term1625 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1625, term1625.getClass(), "elementData", null);
        setIntField(term1625, term1625.getClass(), "size", -2143043890);
        setIntField(term1625, term1625.getClass(), "modCount", -2138825831);
        ArrayDeque term1602 = new ArrayDeque();
        ((ArrayDeque) term1602).add(term1604);
        ((ArrayDeque) term1602).add(term1607);
        ((ArrayDeque) term1602).add(term1610);
        ((ArrayDeque) term1602).add(term1613);
        ((ArrayDeque) term1602).add(term1616);
        ((ArrayDeque) term1602).add(term1619);
        ((ArrayDeque) term1602).add(term1622);
        ((ArrayDeque) term1602).add(term1625);
        Object term1632 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1632, term1632.getClass(), "elementData", null);
        setIntField(term1632, term1632.getClass(), "size", 1454781562);
        setIntField(term1632, term1632.getClass(), "modCount", -27944011);
        Object term1635 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1635, term1635.getClass(), "elementData", null);
        setIntField(term1635, term1635.getClass(), "size", -20614472);
        setIntField(term1635, term1635.getClass(), "modCount", 1126618861);
        ArrayDeque term1630 = new ArrayDeque();
        ((ArrayDeque) term1630).add(term1632);
        ((ArrayDeque) term1630).add(term1635);
        ((ArrayDeque) term1630).add(term1607);
        ((ArrayDeque) term1630).add(term1616);
        ((ArrayDeque) term1630).add(term1619);
        ((ArrayDeque) term1630).add(term1607);
        HashMap term1640 = new HashMap();
        HashMap term1653 = new HashMap();
        term1593 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1594 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1593, term1593.getClass(), "compiler", null);
        setField(term1594, term1594.getClass(), "implicitReturn", null);
        setField(term1594, term1594.getClass(), "entry", null);
        setField(term1594, term1594.getClass(), "nodes", term1595);
        setBooleanField(term1594, term1594.getClass(), "useNodeAnnotations", false);
        setBooleanField(term1594, term1594.getClass(), "useEdgeAnnotations", true);
        setField(term1594, term1594.getClass(), "nodeAnnotationStack", term1602);
        setField(term1594, term1594.getClass(), "edgeAnnotationStack", term1630);
        setField(term1593, term1593.getClass(), "cfg", term1594);
        setField(term1593, term1593.getClass(), "astPosition", term1640);
        setField(term1593, term1593.getClass(), "nodePriorities", term1653);
        setField(term1593, term1593.getClass(), "priorityComparator", null);
        setIntField(term1593, term1593.getClass(), "astPositionCounter", 0);
        setIntField(term1593, term1593.getClass(), "priorityCounter", 0);
        setBooleanField(term1593, term1593.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1593, term1593.getClass(), "edgeAnnotations", false);
        setField(term1593, term1593.getClass(), "root", null);
        setField(term1593, term1593.getClass(), "exceptionHandler", null);
        setField(term1593, term1593.getClass(), "finallyMap", null);
        term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1662, term1662.getClass(), "type", -509349195);
        setIntField(term1664, term1664.getClass(), "type", -1639041228);
        setIntField(term1666, term1666.getClass(), "type", 2027686272);
        setIntField(term1668, term1668.getClass(), "type", -1494356104);
        setIntField(term1670, term1670.getClass(), "type", -695279311);
        setField(term1670, term1670.getClass(), "next", null);
        setField(term1670, term1670.getClass(), "first", null);
        setField(term1670, term1670.getClass(), "last", null);
        setField(term1670, term1670.getClass(), "propListHead", null);
        setIntField(term1670, term1670.getClass(), "sourcePosition", 0);
        setField(term1670, term1670.getClass(), "jsType", null);
        setField(term1670, term1670.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "next", term1670);
        setIntField(term1673, term1673.getClass(), "type", 114279242);
        setField(term1673, term1673.getClass(), "next", null);
        setField(term1673, term1673.getClass(), "first", null);
        setField(term1673, term1673.getClass(), "last", term1670);
        setField(term1673, term1673.getClass(), "propListHead", null);
        setIntField(term1673, term1673.getClass(), "sourcePosition", 0);
        setField(term1673, term1673.getClass(), "jsType", null);
        setField(term1673, term1673.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "first", term1673);
        setField(term1668, term1668.getClass(), "last", term1666);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "next", term1668);
        setField(term1666, term1666.getClass(), "first", term1670);
        setIntField(term1677, term1677.getClass(), "type", 633598642);
        setIntField(term1679, term1679.getClass(), "type", 1862841859);
        setField(term1679, term1679.getClass(), "next", null);
        setField(term1679, term1679.getClass(), "first", term1673);
        setField(term1679, term1679.getClass(), "last", term1668);
        setField(term1679, term1679.getClass(), "propListHead", null);
        setIntField(term1679, term1679.getClass(), "sourcePosition", 0);
        setField(term1679, term1679.getClass(), "jsType", null);
        setField(term1679, term1679.getClass(), "parent", null);
        setField(term1677, term1677.getClass(), "next", term1679);
        setField(term1677, term1677.getClass(), "first", term1664);
        setField(term1677, term1677.getClass(), "last", term1664);
        setField(term1677, term1677.getClass(), "propListHead", null);
        setIntField(term1677, term1677.getClass(), "sourcePosition", 0);
        setField(term1677, term1677.getClass(), "jsType", null);
        setField(term1677, term1677.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "last", term1677);
        setField(term1666, term1666.getClass(), "propListHead", null);
        setIntField(term1666, term1666.getClass(), "sourcePosition", 0);
        setField(term1666, term1666.getClass(), "jsType", null);
        setField(term1666, term1666.getClass(), "parent", null);
        setField(term1664, term1664.getClass(), "next", term1666);
        setIntField(term1684, term1684.getClass(), "type", -1114668574);
        setField(term1684, term1684.getClass(), "next", term1677);
        setField(term1684, term1684.getClass(), "first", term1679);
        setField(term1684, term1684.getClass(), "last", term1662);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1664, term1664.getClass(), "first", term1684);
        setField(term1664, term1664.getClass(), "last", term1684);
        setField(term1664, term1664.getClass(), "propListHead", null);
        setIntField(term1664, term1664.getClass(), "sourcePosition", 0);
        setField(term1664, term1664.getClass(), "jsType", null);
        setField(term1664, term1664.getClass(), "parent", null);
        setField(term1662, term1662.getClass(), "next", term1664);
        setField(term1662, term1662.getClass(), "first", term1668);
        setField(term1662, term1662.getClass(), "last", term1670);
        setField(term1662, term1662.getClass(), "propListHead", null);
        setIntField(term1662, term1662.getClass(), "sourcePosition", 0);
        setField(term1662, term1662.getClass(), "jsType", null);
        setField(term1662, term1662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1662;
        try {
            callMethod(klass, "handleThrow", argTypes, term1593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


