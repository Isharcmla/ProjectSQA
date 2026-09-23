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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleContinue_182634924562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1929;
     Object term1998;

    public ControlFlowAnalysis_handleContinue_182634924562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1931 = new HashMap();
        Object term1940 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1940, term1940.getClass(), "elementData", null);
        setIntField(term1940, term1940.getClass(), "size", 470895808);
        setIntField(term1940, term1940.getClass(), "modCount", 1787325291);
        Object term1943 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1943, term1943.getClass(), "elementData", null);
        setIntField(term1943, term1943.getClass(), "size", 1470349147);
        setIntField(term1943, term1943.getClass(), "modCount", -255317272);
        Object term1946 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1946, term1946.getClass(), "elementData", null);
        setIntField(term1946, term1946.getClass(), "size", -706253892);
        setIntField(term1946, term1946.getClass(), "modCount", -1341439819);
        Object term1949 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1949, term1949.getClass(), "elementData", null);
        setIntField(term1949, term1949.getClass(), "size", -728760750);
        setIntField(term1949, term1949.getClass(), "modCount", -1617383807);
        Object term1952 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1952, term1952.getClass(), "elementData", null);
        setIntField(term1952, term1952.getClass(), "size", -1244386281);
        setIntField(term1952, term1952.getClass(), "modCount", -885788574);
        ArrayDeque term1938 = new ArrayDeque();
        ((ArrayDeque) term1938).add(term1940);
        ((ArrayDeque) term1938).add(term1943);
        ((ArrayDeque) term1938).add(term1946);
        ((ArrayDeque) term1938).add(term1949);
        ((ArrayDeque) term1938).add(term1952);
        Object term1959 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1959, term1959.getClass(), "elementData", null);
        setIntField(term1959, term1959.getClass(), "size", -865722613);
        setIntField(term1959, term1959.getClass(), "modCount", -1551355284);
        Object term1962 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1962, term1962.getClass(), "elementData", null);
        setIntField(term1962, term1962.getClass(), "size", -1381970335);
        setIntField(term1962, term1962.getClass(), "modCount", 1213549815);
        Object term1965 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1965, term1965.getClass(), "elementData", null);
        setIntField(term1965, term1965.getClass(), "size", -1518419301);
        setIntField(term1965, term1965.getClass(), "modCount", 674879025);
        Object term1968 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1968, term1968.getClass(), "elementData", null);
        setIntField(term1968, term1968.getClass(), "size", -1538936030);
        setIntField(term1968, term1968.getClass(), "modCount", -752870423);
        Object term1971 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1971, term1971.getClass(), "elementData", null);
        setIntField(term1971, term1971.getClass(), "size", -1698809299);
        setIntField(term1971, term1971.getClass(), "modCount", 401512128);
        ArrayDeque term1957 = new ArrayDeque();
        ((ArrayDeque) term1957).add(term1959);
        ((ArrayDeque) term1957).add(term1962);
        ((ArrayDeque) term1957).add(term1965);
        ((ArrayDeque) term1957).add(term1968);
        ((ArrayDeque) term1957).add(term1971);
        ((ArrayDeque) term1957).add(term1971);
        ((ArrayDeque) term1957).add(term1949);
        ((ArrayDeque) term1957).add(term1952);
        ((ArrayDeque) term1957).add(term1952);
        HashMap term1976 = new HashMap();
        HashMap term1989 = new HashMap();
        term1929 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1930 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1929, term1929.getClass(), "compiler", null);
        setField(term1930, term1930.getClass(), "implicitReturn", null);
        setField(term1930, term1930.getClass(), "entry", null);
        setField(term1930, term1930.getClass(), "nodes", term1931);
        setBooleanField(term1930, term1930.getClass(), "useNodeAnnotations", true);
        setBooleanField(term1930, term1930.getClass(), "useEdgeAnnotations", true);
        setField(term1930, term1930.getClass(), "nodeAnnotationStack", term1938);
        setField(term1930, term1930.getClass(), "edgeAnnotationStack", term1957);
        setField(term1929, term1929.getClass(), "cfg", term1930);
        setField(term1929, term1929.getClass(), "astPosition", term1976);
        setField(term1929, term1929.getClass(), "nodePriorities", term1989);
        setField(term1929, term1929.getClass(), "priorityComparator", null);
        setIntField(term1929, term1929.getClass(), "astPositionCounter", 0);
        setIntField(term1929, term1929.getClass(), "priorityCounter", 0);
        setBooleanField(term1929, term1929.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1929, term1929.getClass(), "edgeAnnotations", false);
        setField(term1929, term1929.getClass(), "root", null);
        setField(term1929, term1929.getClass(), "exceptionHandler", null);
        setField(term1929, term1929.getClass(), "finallyMap", null);
        term1998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1998, term1998.getClass(), "type", -348612876);
        setIntField(term2000, term2000.getClass(), "type", 1302807565);
        setIntField(term2002, term2002.getClass(), "type", -838848221);
        setIntField(term2004, term2004.getClass(), "type", 1163761623);
        setIntField(term2006, term2006.getClass(), "type", 718742281);
        setField(term2006, term2006.getClass(), "next", null);
        setField(term2006, term2006.getClass(), "first", null);
        setField(term2006, term2006.getClass(), "last", null);
        setField(term2006, term2006.getClass(), "propListHead", null);
        setIntField(term2006, term2006.getClass(), "sourcePosition", 0);
        setField(term2006, term2006.getClass(), "jsType", null);
        setField(term2006, term2006.getClass(), "parent", null);
        setField(term2004, term2004.getClass(), "next", term2006);
        setIntField(term2009, term2009.getClass(), "type", 1532723756);
        setField(term2009, term2009.getClass(), "next", null);
        setField(term2009, term2009.getClass(), "first", null);
        setField(term2009, term2009.getClass(), "last", term2006);
        setField(term2009, term2009.getClass(), "propListHead", null);
        setIntField(term2009, term2009.getClass(), "sourcePosition", 0);
        setField(term2009, term2009.getClass(), "jsType", null);
        setField(term2009, term2009.getClass(), "parent", null);
        setField(term2004, term2004.getClass(), "first", term2009);
        setField(term2004, term2004.getClass(), "last", term2002);
        setField(term2004, term2004.getClass(), "propListHead", null);
        setIntField(term2004, term2004.getClass(), "sourcePosition", 0);
        setField(term2004, term2004.getClass(), "jsType", null);
        setField(term2004, term2004.getClass(), "parent", null);
        setField(term2002, term2002.getClass(), "next", term2004);
        setField(term2002, term2002.getClass(), "first", term2006);
        setIntField(term2013, term2013.getClass(), "type", 777492093);
        setIntField(term2015, term2015.getClass(), "type", 1414025609);
        setField(term2015, term2015.getClass(), "next", null);
        setField(term2015, term2015.getClass(), "first", term2009);
        setField(term2015, term2015.getClass(), "last", term2004);
        setField(term2015, term2015.getClass(), "propListHead", null);
        setIntField(term2015, term2015.getClass(), "sourcePosition", 0);
        setField(term2015, term2015.getClass(), "jsType", null);
        setField(term2015, term2015.getClass(), "parent", null);
        setField(term2013, term2013.getClass(), "next", term2015);
        setField(term2013, term2013.getClass(), "first", term2000);
        setField(term2013, term2013.getClass(), "last", term2000);
        setField(term2013, term2013.getClass(), "propListHead", null);
        setIntField(term2013, term2013.getClass(), "sourcePosition", 0);
        setField(term2013, term2013.getClass(), "jsType", null);
        setField(term2013, term2013.getClass(), "parent", null);
        setField(term2002, term2002.getClass(), "last", term2013);
        setField(term2002, term2002.getClass(), "propListHead", null);
        setIntField(term2002, term2002.getClass(), "sourcePosition", 0);
        setField(term2002, term2002.getClass(), "jsType", null);
        setField(term2002, term2002.getClass(), "parent", null);
        setField(term2000, term2000.getClass(), "next", term2002);
        setIntField(term2020, term2020.getClass(), "type", 255145822);
        setField(term2020, term2020.getClass(), "next", term2013);
        setField(term2020, term2020.getClass(), "first", term2015);
        setField(term2020, term2020.getClass(), "last", term1998);
        setField(term2020, term2020.getClass(), "propListHead", null);
        setIntField(term2020, term2020.getClass(), "sourcePosition", 0);
        setField(term2020, term2020.getClass(), "jsType", null);
        setField(term2020, term2020.getClass(), "parent", null);
        setField(term2000, term2000.getClass(), "first", term2020);
        setField(term2000, term2000.getClass(), "last", term2020);
        setField(term2000, term2000.getClass(), "propListHead", null);
        setIntField(term2000, term2000.getClass(), "sourcePosition", 0);
        setField(term2000, term2000.getClass(), "jsType", null);
        setField(term2000, term2000.getClass(), "parent", null);
        setField(term1998, term1998.getClass(), "next", term2000);
        setField(term1998, term1998.getClass(), "first", term2004);
        setField(term1998, term1998.getClass(), "last", term2006);
        setField(term1998, term1998.getClass(), "propListHead", null);
        setIntField(term1998, term1998.getClass(), "sourcePosition", 0);
        setField(term1998, term1998.getClass(), "jsType", null);
        setField(term1998, term1998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1998;
        try {
            callMethod(klass, "handleContinue", argTypes, term1929, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


