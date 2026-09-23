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

public class NodeUtil_isGetOrSetKey_1925895381255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2832;
     Object term16943;

    public NodeUtil_isGetOrSetKey_1925895381255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2855 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2832, term2832.getClass(), "type", 1504698817);
        setIntField(term2834, term2834.getClass(), "type", -1573760035);
        setIntField(term2836, term2836.getClass(), "type", 0);
        setField(term2836, term2836.getClass(), "next", null);
        setField(term2836, term2836.getClass(), "first", null);
        setField(term2836, term2836.getClass(), "last", null);
        setField(term2836, term2836.getClass(), "propListHead", null);
        setIntField(term2836, term2836.getClass(), "sourcePosition", 0);
        setField(term2836, term2836.getClass(), "jsType", null);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2834, term2834.getClass(), "next", term2836);
        setIntField(term2839, term2839.getClass(), "type", 0);
        setField(term2839, term2839.getClass(), "next", null);
        setField(term2839, term2839.getClass(), "first", null);
        setField(term2839, term2839.getClass(), "last", null);
        setField(term2839, term2839.getClass(), "propListHead", null);
        setIntField(term2839, term2839.getClass(), "sourcePosition", 0);
        setField(term2839, term2839.getClass(), "jsType", null);
        setField(term2839, term2839.getClass(), "parent", null);
        setField(term2834, term2834.getClass(), "first", term2839);
        setIntField(term2842, term2842.getClass(), "type", 0);
        setField(term2842, term2842.getClass(), "next", null);
        setField(term2842, term2842.getClass(), "first", null);
        setField(term2842, term2842.getClass(), "last", null);
        setField(term2842, term2842.getClass(), "propListHead", null);
        setIntField(term2842, term2842.getClass(), "sourcePosition", 0);
        setField(term2842, term2842.getClass(), "jsType", null);
        setField(term2842, term2842.getClass(), "parent", null);
        setField(term2834, term2834.getClass(), "last", term2842);
        setField(term2845, term2845.getClass(), "next", null);
        setIntField(term2845, term2845.getClass(), "type", 0);
        setIntField(term2845, term2845.getClass(), "intValue", 0);
        setField(term2845, term2845.getClass(), "objectValue", null);
        setField(term2834, term2834.getClass(), "propListHead", term2845);
        setIntField(term2834, term2834.getClass(), "sourcePosition", -1091199008);
        setField(term2834, term2834.getClass(), "jsType", null);
        setField(term2834, term2834.getClass(), "parent", null);
        setField(term2832, term2832.getClass(), "next", term2834);
        setIntField(term2849, term2849.getClass(), "type", 0);
        setField(term2849, term2849.getClass(), "next", null);
        setField(term2849, term2849.getClass(), "first", null);
        setField(term2849, term2849.getClass(), "last", null);
        setField(term2849, term2849.getClass(), "propListHead", null);
        setIntField(term2849, term2849.getClass(), "sourcePosition", 0);
        setField(term2849, term2849.getClass(), "jsType", null);
        setField(term2849, term2849.getClass(), "parent", null);
        setField(term2832, term2832.getClass(), "first", term2849);
        setIntField(term2852, term2852.getClass(), "type", 0);
        setField(term2852, term2852.getClass(), "next", null);
        setField(term2852, term2852.getClass(), "first", null);
        setField(term2852, term2852.getClass(), "last", null);
        setField(term2852, term2852.getClass(), "propListHead", null);
        setIntField(term2852, term2852.getClass(), "sourcePosition", 0);
        setField(term2852, term2852.getClass(), "jsType", null);
        setField(term2852, term2852.getClass(), "parent", null);
        setField(term2832, term2832.getClass(), "last", term2852);
        setField(term2855, term2855.getClass(), "next", null);
        setIntField(term2855, term2855.getClass(), "type", 0);
        setIntField(term2855, term2855.getClass(), "intValue", 0);
        setField(term2855, term2855.getClass(), "objectValue", null);
        setField(term2832, term2832.getClass(), "propListHead", term2855);
        setIntField(term2832, term2832.getClass(), "sourcePosition", 1837886253);
        setField(term2832, term2832.getClass(), "jsType", null);
        setField(term2832, term2832.getClass(), "parent", null);
        term16943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16948 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16951 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16943, term16943.getClass(), "type", 1504698817);
        setIntField(term16944, term16944.getClass(), "type", -1573760035);
        setIntField(term16945, term16945.getClass(), "type", 0);
        setField(term16945, term16945.getClass(), "next", null);
        setField(term16945, term16945.getClass(), "first", null);
        setField(term16945, term16945.getClass(), "last", null);
        setField(term16945, term16945.getClass(), "propListHead", null);
        setIntField(term16945, term16945.getClass(), "sourcePosition", 0);
        setField(term16945, term16945.getClass(), "jsType", null);
        setField(term16945, term16945.getClass(), "parent", null);
        setField(term16944, term16944.getClass(), "next", term16945);
        setIntField(term16946, term16946.getClass(), "type", 0);
        setField(term16946, term16946.getClass(), "next", null);
        setField(term16946, term16946.getClass(), "first", null);
        setField(term16946, term16946.getClass(), "last", null);
        setField(term16946, term16946.getClass(), "propListHead", null);
        setIntField(term16946, term16946.getClass(), "sourcePosition", 0);
        setField(term16946, term16946.getClass(), "jsType", null);
        setField(term16946, term16946.getClass(), "parent", null);
        setField(term16944, term16944.getClass(), "first", term16946);
        setIntField(term16947, term16947.getClass(), "type", 0);
        setField(term16947, term16947.getClass(), "next", null);
        setField(term16947, term16947.getClass(), "first", null);
        setField(term16947, term16947.getClass(), "last", null);
        setField(term16947, term16947.getClass(), "propListHead", null);
        setIntField(term16947, term16947.getClass(), "sourcePosition", 0);
        setField(term16947, term16947.getClass(), "jsType", null);
        setField(term16947, term16947.getClass(), "parent", null);
        setField(term16944, term16944.getClass(), "last", term16947);
        setField(term16948, term16948.getClass(), "next", null);
        setIntField(term16948, term16948.getClass(), "type", 0);
        setIntField(term16948, term16948.getClass(), "intValue", 0);
        setField(term16948, term16948.getClass(), "objectValue", null);
        setField(term16944, term16944.getClass(), "propListHead", term16948);
        setIntField(term16944, term16944.getClass(), "sourcePosition", -1091199008);
        setField(term16944, term16944.getClass(), "jsType", null);
        setField(term16944, term16944.getClass(), "parent", null);
        setField(term16943, term16943.getClass(), "next", term16944);
        setIntField(term16949, term16949.getClass(), "type", 0);
        setField(term16949, term16949.getClass(), "next", null);
        setField(term16949, term16949.getClass(), "first", null);
        setField(term16949, term16949.getClass(), "last", null);
        setField(term16949, term16949.getClass(), "propListHead", null);
        setIntField(term16949, term16949.getClass(), "sourcePosition", 0);
        setField(term16949, term16949.getClass(), "jsType", null);
        setField(term16949, term16949.getClass(), "parent", null);
        setField(term16943, term16943.getClass(), "first", term16949);
        setIntField(term16950, term16950.getClass(), "type", 0);
        setField(term16950, term16950.getClass(), "next", null);
        setField(term16950, term16950.getClass(), "first", null);
        setField(term16950, term16950.getClass(), "last", null);
        setField(term16950, term16950.getClass(), "propListHead", null);
        setIntField(term16950, term16950.getClass(), "sourcePosition", 0);
        setField(term16950, term16950.getClass(), "jsType", null);
        setField(term16950, term16950.getClass(), "parent", null);
        setField(term16943, term16943.getClass(), "last", term16950);
        setField(term16951, term16951.getClass(), "next", null);
        setIntField(term16951, term16951.getClass(), "type", 0);
        setIntField(term16951, term16951.getClass(), "intValue", 0);
        setField(term16951, term16951.getClass(), "objectValue", null);
        setField(term16943, term16943.getClass(), "propListHead", term16951);
        setIntField(term16943, term16943.getClass(), "sourcePosition", 1837886253);
        setField(term16943, term16943.getClass(), "jsType", null);
        setField(term16943, term16943.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2832;
        Object retValue = callMethod(klass, "isGetOrSetKey", argTypes, null, args);
        assertTrue(recursiveEquals(term2832, term16943));
        assertTrue(recursiveEquals(retValue, false));
    }

};


