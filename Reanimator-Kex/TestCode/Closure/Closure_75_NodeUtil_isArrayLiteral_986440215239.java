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

public class NodeUtil_isArrayLiteral_986440215239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2324;
     Object term15582;

    public NodeUtil_isArrayLiteral_986440215239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2337 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2324, term2324.getClass(), "type", -2027012650);
        setIntField(term2326, term2326.getClass(), "type", 2060027076);
        setIntField(term2328, term2328.getClass(), "type", 0);
        setField(term2328, term2328.getClass(), "next", null);
        setField(term2328, term2328.getClass(), "first", null);
        setField(term2328, term2328.getClass(), "last", null);
        setField(term2328, term2328.getClass(), "propListHead", null);
        setIntField(term2328, term2328.getClass(), "sourcePosition", 0);
        setField(term2328, term2328.getClass(), "jsType", null);
        setField(term2328, term2328.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "next", term2328);
        setIntField(term2331, term2331.getClass(), "type", 0);
        setField(term2331, term2331.getClass(), "next", null);
        setField(term2331, term2331.getClass(), "first", null);
        setField(term2331, term2331.getClass(), "last", null);
        setField(term2331, term2331.getClass(), "propListHead", null);
        setIntField(term2331, term2331.getClass(), "sourcePosition", 0);
        setField(term2331, term2331.getClass(), "jsType", null);
        setField(term2331, term2331.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "first", term2331);
        setIntField(term2334, term2334.getClass(), "type", 0);
        setField(term2334, term2334.getClass(), "next", null);
        setField(term2334, term2334.getClass(), "first", null);
        setField(term2334, term2334.getClass(), "last", null);
        setField(term2334, term2334.getClass(), "propListHead", null);
        setIntField(term2334, term2334.getClass(), "sourcePosition", 0);
        setField(term2334, term2334.getClass(), "jsType", null);
        setField(term2334, term2334.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "last", term2334);
        setField(term2337, term2337.getClass(), "next", null);
        setIntField(term2337, term2337.getClass(), "type", 0);
        setIntField(term2337, term2337.getClass(), "intValue", 0);
        setField(term2337, term2337.getClass(), "objectValue", null);
        setField(term2326, term2326.getClass(), "propListHead", term2337);
        setIntField(term2326, term2326.getClass(), "sourcePosition", 1425342686);
        setField(term2326, term2326.getClass(), "jsType", null);
        setField(term2326, term2326.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "next", term2326);
        setIntField(term2341, term2341.getClass(), "type", 0);
        setField(term2341, term2341.getClass(), "next", null);
        setField(term2341, term2341.getClass(), "first", null);
        setField(term2341, term2341.getClass(), "last", null);
        setField(term2341, term2341.getClass(), "propListHead", null);
        setIntField(term2341, term2341.getClass(), "sourcePosition", 0);
        setField(term2341, term2341.getClass(), "jsType", null);
        setField(term2341, term2341.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "first", term2341);
        setIntField(term2344, term2344.getClass(), "type", 0);
        setField(term2344, term2344.getClass(), "next", null);
        setField(term2344, term2344.getClass(), "first", null);
        setField(term2344, term2344.getClass(), "last", null);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "last", term2344);
        setField(term2347, term2347.getClass(), "next", null);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setIntField(term2347, term2347.getClass(), "intValue", 0);
        setField(term2347, term2347.getClass(), "objectValue", null);
        setField(term2324, term2324.getClass(), "propListHead", term2347);
        setIntField(term2324, term2324.getClass(), "sourcePosition", -1042470635);
        setField(term2324, term2324.getClass(), "jsType", null);
        setField(term2324, term2324.getClass(), "parent", null);
        term15582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15587 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15590 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15582, term15582.getClass(), "type", -2027012650);
        setIntField(term15583, term15583.getClass(), "type", 2060027076);
        setIntField(term15584, term15584.getClass(), "type", 0);
        setField(term15584, term15584.getClass(), "next", null);
        setField(term15584, term15584.getClass(), "first", null);
        setField(term15584, term15584.getClass(), "last", null);
        setField(term15584, term15584.getClass(), "propListHead", null);
        setIntField(term15584, term15584.getClass(), "sourcePosition", 0);
        setField(term15584, term15584.getClass(), "jsType", null);
        setField(term15584, term15584.getClass(), "parent", null);
        setField(term15583, term15583.getClass(), "next", term15584);
        setIntField(term15585, term15585.getClass(), "type", 0);
        setField(term15585, term15585.getClass(), "next", null);
        setField(term15585, term15585.getClass(), "first", null);
        setField(term15585, term15585.getClass(), "last", null);
        setField(term15585, term15585.getClass(), "propListHead", null);
        setIntField(term15585, term15585.getClass(), "sourcePosition", 0);
        setField(term15585, term15585.getClass(), "jsType", null);
        setField(term15585, term15585.getClass(), "parent", null);
        setField(term15583, term15583.getClass(), "first", term15585);
        setIntField(term15586, term15586.getClass(), "type", 0);
        setField(term15586, term15586.getClass(), "next", null);
        setField(term15586, term15586.getClass(), "first", null);
        setField(term15586, term15586.getClass(), "last", null);
        setField(term15586, term15586.getClass(), "propListHead", null);
        setIntField(term15586, term15586.getClass(), "sourcePosition", 0);
        setField(term15586, term15586.getClass(), "jsType", null);
        setField(term15586, term15586.getClass(), "parent", null);
        setField(term15583, term15583.getClass(), "last", term15586);
        setField(term15587, term15587.getClass(), "next", null);
        setIntField(term15587, term15587.getClass(), "type", 0);
        setIntField(term15587, term15587.getClass(), "intValue", 0);
        setField(term15587, term15587.getClass(), "objectValue", null);
        setField(term15583, term15583.getClass(), "propListHead", term15587);
        setIntField(term15583, term15583.getClass(), "sourcePosition", 1425342686);
        setField(term15583, term15583.getClass(), "jsType", null);
        setField(term15583, term15583.getClass(), "parent", null);
        setField(term15582, term15582.getClass(), "next", term15583);
        setIntField(term15588, term15588.getClass(), "type", 0);
        setField(term15588, term15588.getClass(), "next", null);
        setField(term15588, term15588.getClass(), "first", null);
        setField(term15588, term15588.getClass(), "last", null);
        setField(term15588, term15588.getClass(), "propListHead", null);
        setIntField(term15588, term15588.getClass(), "sourcePosition", 0);
        setField(term15588, term15588.getClass(), "jsType", null);
        setField(term15588, term15588.getClass(), "parent", null);
        setField(term15582, term15582.getClass(), "first", term15588);
        setIntField(term15589, term15589.getClass(), "type", 0);
        setField(term15589, term15589.getClass(), "next", null);
        setField(term15589, term15589.getClass(), "first", null);
        setField(term15589, term15589.getClass(), "last", null);
        setField(term15589, term15589.getClass(), "propListHead", null);
        setIntField(term15589, term15589.getClass(), "sourcePosition", 0);
        setField(term15589, term15589.getClass(), "jsType", null);
        setField(term15589, term15589.getClass(), "parent", null);
        setField(term15582, term15582.getClass(), "last", term15589);
        setField(term15590, term15590.getClass(), "next", null);
        setIntField(term15590, term15590.getClass(), "type", 0);
        setIntField(term15590, term15590.getClass(), "intValue", 0);
        setField(term15590, term15590.getClass(), "objectValue", null);
        setField(term15582, term15582.getClass(), "propListHead", term15590);
        setIntField(term15582, term15582.getClass(), "sourcePosition", -1042470635);
        setField(term15582, term15582.getClass(), "jsType", null);
        setField(term15582, term15582.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2324;
        Object retValue = callMethod(klass, "isArrayLiteral", argTypes, null, args);
        assertTrue(recursiveEquals(term2324, term15582));
        assertTrue(recursiveEquals(retValue, false));
    }

};


