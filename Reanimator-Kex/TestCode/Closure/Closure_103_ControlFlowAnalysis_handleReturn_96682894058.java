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

public class ControlFlowAnalysis_handleReturn_96682894058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921;
     Object term1987;

    public ControlFlowAnalysis_handleReturn_96682894058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1923 = new HashMap();
        Object term1930 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1930, term1930.getClass(), "elementData", null);
        setIntField(term1930, term1930.getClass(), "size", -1608123016);
        setIntField(term1930, term1930.getClass(), "modCount", -896473214);
        Object term1933 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1933, term1933.getClass(), "elementData", null);
        setIntField(term1933, term1933.getClass(), "size", 401203924);
        setIntField(term1933, term1933.getClass(), "modCount", -1212399479);
        Object term1936 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1936, term1936.getClass(), "elementData", null);
        setIntField(term1936, term1936.getClass(), "size", 2107679041);
        setIntField(term1936, term1936.getClass(), "modCount", 2040965507);
        Object term1939 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1939, term1939.getClass(), "elementData", null);
        setIntField(term1939, term1939.getClass(), "size", -1281083262);
        setIntField(term1939, term1939.getClass(), "modCount", 1059930704);
        Object term1942 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1942, term1942.getClass(), "elementData", null);
        setIntField(term1942, term1942.getClass(), "size", -1967153290);
        setIntField(term1942, term1942.getClass(), "modCount", -1397251956);
        Object term1945 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1945, term1945.getClass(), "elementData", null);
        setIntField(term1945, term1945.getClass(), "size", -796934571);
        setIntField(term1945, term1945.getClass(), "modCount", 405295896);
        Object term1948 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1948, term1948.getClass(), "elementData", null);
        setIntField(term1948, term1948.getClass(), "size", -814977075);
        setIntField(term1948, term1948.getClass(), "modCount", 808614267);
        Object term1951 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1951, term1951.getClass(), "elementData", null);
        setIntField(term1951, term1951.getClass(), "size", 1611734632);
        setIntField(term1951, term1951.getClass(), "modCount", 868908117);
        Object term1954 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1954, term1954.getClass(), "elementData", null);
        setIntField(term1954, term1954.getClass(), "size", 1789351397);
        setIntField(term1954, term1954.getClass(), "modCount", 2145528170);
        ArrayDeque term1928 = new ArrayDeque();
        ((ArrayDeque) term1928).add(term1930);
        ((ArrayDeque) term1928).add(term1933);
        ((ArrayDeque) term1928).add(term1936);
        ((ArrayDeque) term1928).add(term1939);
        ((ArrayDeque) term1928).add(term1942);
        ((ArrayDeque) term1928).add(term1945);
        ((ArrayDeque) term1928).add(term1948);
        ((ArrayDeque) term1928).add(term1951);
        ((ArrayDeque) term1928).add(term1954);
        Object term1961 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1961, term1961.getClass(), "elementData", null);
        setIntField(term1961, term1961.getClass(), "size", -585773976);
        setIntField(term1961, term1961.getClass(), "modCount", 852806940);
        ArrayDeque term1959 = new ArrayDeque();
        ((ArrayDeque) term1959).add(term1961);
        HashMap term1966 = new HashMap();
        HashMap term1979 = new HashMap();
        term1921 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1921, term1921.getClass(), "compiler", null);
        setField(term1922, term1922.getClass(), "implicitReturn", null);
        setField(term1922, term1922.getClass(), "entry", null);
        setField(term1922, term1922.getClass(), "nodes", term1923);
        setField(term1922, term1922.getClass(), "nodeAnnotationStack", term1928);
        setField(term1922, term1922.getClass(), "edgeAnnotationStack", term1959);
        setField(term1921, term1921.getClass(), "cfg", term1922);
        setField(term1921, term1921.getClass(), "astPosition", term1966);
        setField(term1921, term1921.getClass(), "nodePriorities", term1979);
        setField(term1921, term1921.getClass(), "priorityComparator", null);
        setIntField(term1921, term1921.getClass(), "astPositionCounter", 0);
        setIntField(term1921, term1921.getClass(), "priorityCounter", 0);
        setBooleanField(term1921, term1921.getClass(), "shouldTraverseFunctions", false);
        setField(term1921, term1921.getClass(), "root", null);
        setField(term1921, term1921.getClass(), "exceptionHandler", null);
        setField(term1921, term1921.getClass(), "finallyMap", null);
        term1987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2010 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1987, term1987.getClass(), "type", 188512644);
        setIntField(term1989, term1989.getClass(), "type", 1105016932);
        setIntField(term1991, term1991.getClass(), "type", 0);
        setField(term1991, term1991.getClass(), "next", null);
        setField(term1991, term1991.getClass(), "first", null);
        setField(term1991, term1991.getClass(), "last", null);
        setField(term1991, term1991.getClass(), "propListHead", null);
        setIntField(term1991, term1991.getClass(), "sourcePosition", 0);
        setField(term1991, term1991.getClass(), "jsType", null);
        setField(term1991, term1991.getClass(), "parent", null);
        setField(term1989, term1989.getClass(), "next", term1991);
        setIntField(term1994, term1994.getClass(), "type", 0);
        setField(term1994, term1994.getClass(), "next", null);
        setField(term1994, term1994.getClass(), "first", null);
        setField(term1994, term1994.getClass(), "last", null);
        setField(term1994, term1994.getClass(), "propListHead", null);
        setIntField(term1994, term1994.getClass(), "sourcePosition", 0);
        setField(term1994, term1994.getClass(), "jsType", null);
        setField(term1994, term1994.getClass(), "parent", null);
        setField(term1989, term1989.getClass(), "first", term1994);
        setIntField(term1997, term1997.getClass(), "type", 0);
        setField(term1997, term1997.getClass(), "next", null);
        setField(term1997, term1997.getClass(), "first", null);
        setField(term1997, term1997.getClass(), "last", null);
        setField(term1997, term1997.getClass(), "propListHead", null);
        setIntField(term1997, term1997.getClass(), "sourcePosition", 0);
        setField(term1997, term1997.getClass(), "jsType", null);
        setField(term1997, term1997.getClass(), "parent", null);
        setField(term1989, term1989.getClass(), "last", term1997);
        setField(term2000, term2000.getClass(), "next", null);
        setIntField(term2000, term2000.getClass(), "type", 0);
        setIntField(term2000, term2000.getClass(), "intValue", 0);
        setField(term2000, term2000.getClass(), "objectValue", null);
        setField(term1989, term1989.getClass(), "propListHead", term2000);
        setIntField(term1989, term1989.getClass(), "sourcePosition", -1858909368);
        setField(term1989, term1989.getClass(), "jsType", null);
        setField(term1989, term1989.getClass(), "parent", null);
        setField(term1987, term1987.getClass(), "next", term1989);
        setIntField(term2004, term2004.getClass(), "type", 0);
        setField(term2004, term2004.getClass(), "next", null);
        setField(term2004, term2004.getClass(), "first", null);
        setField(term2004, term2004.getClass(), "last", null);
        setField(term2004, term2004.getClass(), "propListHead", null);
        setIntField(term2004, term2004.getClass(), "sourcePosition", 0);
        setField(term2004, term2004.getClass(), "jsType", null);
        setField(term2004, term2004.getClass(), "parent", null);
        setField(term1987, term1987.getClass(), "first", term2004);
        setIntField(term2007, term2007.getClass(), "type", 0);
        setField(term2007, term2007.getClass(), "next", null);
        setField(term2007, term2007.getClass(), "first", null);
        setField(term2007, term2007.getClass(), "last", null);
        setField(term2007, term2007.getClass(), "propListHead", null);
        setIntField(term2007, term2007.getClass(), "sourcePosition", 0);
        setField(term2007, term2007.getClass(), "jsType", null);
        setField(term2007, term2007.getClass(), "parent", null);
        setField(term1987, term1987.getClass(), "last", term2007);
        setField(term2010, term2010.getClass(), "next", null);
        setIntField(term2010, term2010.getClass(), "type", 0);
        setIntField(term2010, term2010.getClass(), "intValue", 0);
        setField(term2010, term2010.getClass(), "objectValue", null);
        setField(term1987, term1987.getClass(), "propListHead", term2010);
        setIntField(term1987, term1987.getClass(), "sourcePosition", -280113263);
        setField(term1987, term1987.getClass(), "jsType", null);
        setField(term1987, term1987.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1987;
        try {
            callMethod(klass, "handleReturn", argTypes, term1921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


