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
     Object term16990;

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
        term16990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16995 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16998 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16990, term16990.getClass(), "type", 1504698817);
        setIntField(term16991, term16991.getClass(), "type", -1573760035);
        setIntField(term16992, term16992.getClass(), "type", 0);
        setField(term16992, term16992.getClass(), "next", null);
        setField(term16992, term16992.getClass(), "first", null);
        setField(term16992, term16992.getClass(), "last", null);
        setField(term16992, term16992.getClass(), "propListHead", null);
        setIntField(term16992, term16992.getClass(), "sourcePosition", 0);
        setField(term16992, term16992.getClass(), "jsType", null);
        setField(term16992, term16992.getClass(), "parent", null);
        setField(term16991, term16991.getClass(), "next", term16992);
        setIntField(term16993, term16993.getClass(), "type", 0);
        setField(term16993, term16993.getClass(), "next", null);
        setField(term16993, term16993.getClass(), "first", null);
        setField(term16993, term16993.getClass(), "last", null);
        setField(term16993, term16993.getClass(), "propListHead", null);
        setIntField(term16993, term16993.getClass(), "sourcePosition", 0);
        setField(term16993, term16993.getClass(), "jsType", null);
        setField(term16993, term16993.getClass(), "parent", null);
        setField(term16991, term16991.getClass(), "first", term16993);
        setIntField(term16994, term16994.getClass(), "type", 0);
        setField(term16994, term16994.getClass(), "next", null);
        setField(term16994, term16994.getClass(), "first", null);
        setField(term16994, term16994.getClass(), "last", null);
        setField(term16994, term16994.getClass(), "propListHead", null);
        setIntField(term16994, term16994.getClass(), "sourcePosition", 0);
        setField(term16994, term16994.getClass(), "jsType", null);
        setField(term16994, term16994.getClass(), "parent", null);
        setField(term16991, term16991.getClass(), "last", term16994);
        setField(term16995, term16995.getClass(), "next", null);
        setIntField(term16995, term16995.getClass(), "type", 0);
        setIntField(term16995, term16995.getClass(), "intValue", 0);
        setField(term16995, term16995.getClass(), "objectValue", null);
        setField(term16991, term16991.getClass(), "propListHead", term16995);
        setIntField(term16991, term16991.getClass(), "sourcePosition", -1091199008);
        setField(term16991, term16991.getClass(), "jsType", null);
        setField(term16991, term16991.getClass(), "parent", null);
        setField(term16990, term16990.getClass(), "next", term16991);
        setIntField(term16996, term16996.getClass(), "type", 0);
        setField(term16996, term16996.getClass(), "next", null);
        setField(term16996, term16996.getClass(), "first", null);
        setField(term16996, term16996.getClass(), "last", null);
        setField(term16996, term16996.getClass(), "propListHead", null);
        setIntField(term16996, term16996.getClass(), "sourcePosition", 0);
        setField(term16996, term16996.getClass(), "jsType", null);
        setField(term16996, term16996.getClass(), "parent", null);
        setField(term16990, term16990.getClass(), "first", term16996);
        setIntField(term16997, term16997.getClass(), "type", 0);
        setField(term16997, term16997.getClass(), "next", null);
        setField(term16997, term16997.getClass(), "first", null);
        setField(term16997, term16997.getClass(), "last", null);
        setField(term16997, term16997.getClass(), "propListHead", null);
        setIntField(term16997, term16997.getClass(), "sourcePosition", 0);
        setField(term16997, term16997.getClass(), "jsType", null);
        setField(term16997, term16997.getClass(), "parent", null);
        setField(term16990, term16990.getClass(), "last", term16997);
        setField(term16998, term16998.getClass(), "next", null);
        setIntField(term16998, term16998.getClass(), "type", 0);
        setIntField(term16998, term16998.getClass(), "intValue", 0);
        setField(term16998, term16998.getClass(), "objectValue", null);
        setField(term16990, term16990.getClass(), "propListHead", term16998);
        setIntField(term16990, term16990.getClass(), "sourcePosition", 1837886253);
        setField(term16990, term16990.getClass(), "jsType", null);
        setField(term16990, term16990.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2832;
        Object retValue = callMethod(klass, "isGetOrSetKey", argTypes, null, args);
        assertTrue(recursiveEquals(term2832, term16990));
        assertTrue(recursiveEquals(retValue, false));
    }

};


