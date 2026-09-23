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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newCallNode_447342869292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3954;
     Object term3981;

    public NodeUtil_newCallNode_447342869292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3954, term3954.getClass(), "type", -777833461);
        setIntField(term3956, term3956.getClass(), "type", 1583691829);
        setIntField(term3958, term3958.getClass(), "type", -1468541076);
        setIntField(term3960, term3960.getClass(), "type", -1796760393);
        setIntField(term3962, term3962.getClass(), "type", -2099267271);
        setField(term3962, term3962.getClass(), "next", null);
        setField(term3962, term3962.getClass(), "first", null);
        setField(term3962, term3962.getClass(), "last", null);
        setField(term3962, term3962.getClass(), "propListHead", null);
        setIntField(term3962, term3962.getClass(), "sourcePosition", 0);
        setField(term3962, term3962.getClass(), "jsType", null);
        setField(term3962, term3962.getClass(), "parent", null);
        setField(term3960, term3960.getClass(), "next", term3962);
        setIntField(term3965, term3965.getClass(), "type", 1134565344);
        setField(term3965, term3965.getClass(), "next", null);
        setField(term3965, term3965.getClass(), "first", null);
        setField(term3965, term3965.getClass(), "last", term3962);
        setField(term3965, term3965.getClass(), "propListHead", null);
        setIntField(term3965, term3965.getClass(), "sourcePosition", 0);
        setField(term3965, term3965.getClass(), "jsType", null);
        setField(term3965, term3965.getClass(), "parent", null);
        setField(term3960, term3960.getClass(), "first", term3965);
        setField(term3960, term3960.getClass(), "last", term3958);
        setField(term3960, term3960.getClass(), "propListHead", null);
        setIntField(term3960, term3960.getClass(), "sourcePosition", 0);
        setField(term3960, term3960.getClass(), "jsType", null);
        setField(term3960, term3960.getClass(), "parent", null);
        setField(term3958, term3958.getClass(), "next", term3960);
        setField(term3958, term3958.getClass(), "first", term3962);
        setIntField(term3969, term3969.getClass(), "type", 1611620166);
        setIntField(term3971, term3971.getClass(), "type", 249657454);
        setField(term3971, term3971.getClass(), "next", null);
        setField(term3971, term3971.getClass(), "first", term3965);
        setField(term3971, term3971.getClass(), "last", term3960);
        setField(term3971, term3971.getClass(), "propListHead", null);
        setIntField(term3971, term3971.getClass(), "sourcePosition", 0);
        setField(term3971, term3971.getClass(), "jsType", null);
        setField(term3971, term3971.getClass(), "parent", null);
        setField(term3969, term3969.getClass(), "next", term3971);
        setField(term3969, term3969.getClass(), "first", term3956);
        setField(term3969, term3969.getClass(), "last", term3956);
        setField(term3969, term3969.getClass(), "propListHead", null);
        setIntField(term3969, term3969.getClass(), "sourcePosition", 0);
        setField(term3969, term3969.getClass(), "jsType", null);
        setField(term3969, term3969.getClass(), "parent", null);
        setField(term3958, term3958.getClass(), "last", term3969);
        setField(term3958, term3958.getClass(), "propListHead", null);
        setIntField(term3958, term3958.getClass(), "sourcePosition", 0);
        setField(term3958, term3958.getClass(), "jsType", null);
        setField(term3958, term3958.getClass(), "parent", null);
        setField(term3956, term3956.getClass(), "next", term3958);
        setIntField(term3976, term3976.getClass(), "type", 1734630901);
        setField(term3976, term3976.getClass(), "next", term3969);
        setField(term3976, term3976.getClass(), "first", term3971);
        setField(term3976, term3976.getClass(), "last", term3954);
        setField(term3976, term3976.getClass(), "propListHead", null);
        setIntField(term3976, term3976.getClass(), "sourcePosition", 0);
        setField(term3976, term3976.getClass(), "jsType", null);
        setField(term3976, term3976.getClass(), "parent", null);
        setField(term3956, term3956.getClass(), "first", term3976);
        setField(term3956, term3956.getClass(), "last", term3976);
        setField(term3956, term3956.getClass(), "propListHead", null);
        setIntField(term3956, term3956.getClass(), "sourcePosition", 0);
        setField(term3956, term3956.getClass(), "jsType", null);
        setField(term3956, term3956.getClass(), "parent", null);
        setField(term3954, term3954.getClass(), "next", term3956);
        setField(term3954, term3954.getClass(), "first", term3960);
        setField(term3954, term3954.getClass(), "last", term3962);
        setField(term3954, term3954.getClass(), "propListHead", null);
        setIntField(term3954, term3954.getClass(), "sourcePosition", 0);
        setField(term3954, term3954.getClass(), "jsType", null);
        setField(term3954, term3954.getClass(), "parent", null);
        term3981 = (Object[]) newArray("com.google.javascript.rhino.Node", 4);
        Object term3982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3982, term3982.getClass(), "type", -703815246);
        setIntField(term3984, term3984.getClass(), "type", 157300746);
        setIntField(term3986, term3986.getClass(), "type", -1600748613);
        setIntField(term3988, term3988.getClass(), "type", -1509192782);
        setField(term3988, term3988.getClass(), "next", null);
        setField(term3988, term3988.getClass(), "first", null);
        setField(term3988, term3988.getClass(), "last", term3986);
        setField(term3988, term3988.getClass(), "propListHead", null);
        setIntField(term3988, term3988.getClass(), "sourcePosition", 0);
        setField(term3988, term3988.getClass(), "jsType", null);
        setField(term3988, term3988.getClass(), "parent", null);
        setField(term3986, term3986.getClass(), "next", term3988);
        setIntField(term3991, term3991.getClass(), "type", -867925573);
        setField(term3991, term3991.getClass(), "next", null);
        setField(term3991, term3991.getClass(), "first", null);
        setField(term3991, term3991.getClass(), "last", null);
        setField(term3991, term3991.getClass(), "propListHead", null);
        setIntField(term3991, term3991.getClass(), "sourcePosition", 0);
        setField(term3991, term3991.getClass(), "jsType", null);
        setField(term3991, term3991.getClass(), "parent", null);
        setField(term3986, term3986.getClass(), "first", term3991);
        setIntField(term3994, term3994.getClass(), "type", 2033663549);
        setField(term3994, term3994.getClass(), "next", null);
        setField(term3994, term3994.getClass(), "first", term3984);
        setField(term3994, term3994.getClass(), "last", term3984);
        setField(term3994, term3994.getClass(), "propListHead", null);
        setIntField(term3994, term3994.getClass(), "sourcePosition", 0);
        setField(term3994, term3994.getClass(), "jsType", null);
        setField(term3994, term3994.getClass(), "parent", null);
        setField(term3986, term3986.getClass(), "last", term3994);
        setField(term3986, term3986.getClass(), "propListHead", null);
        setIntField(term3986, term3986.getClass(), "sourcePosition", 0);
        setField(term3986, term3986.getClass(), "jsType", null);
        setField(term3986, term3986.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "next", term3986);
        setIntField(term3998, term3998.getClass(), "type", 533171496);
        setField(term3998, term3998.getClass(), "next", term3994);
        setIntField(term4000, term4000.getClass(), "type", 1766479154);
        setField(term4000, term4000.getClass(), "next", term3998);
        setField(term4000, term4000.getClass(), "first", null);
        setField(term4000, term4000.getClass(), "last", term3988);
        setField(term4000, term4000.getClass(), "propListHead", null);
        setIntField(term4000, term4000.getClass(), "sourcePosition", 0);
        setField(term4000, term4000.getClass(), "jsType", null);
        setField(term4000, term4000.getClass(), "parent", null);
        setField(term3998, term3998.getClass(), "first", term4000);
        setField(term3998, term3998.getClass(), "last", term3982);
        setField(term3998, term3998.getClass(), "propListHead", null);
        setIntField(term3998, term3998.getClass(), "sourcePosition", 0);
        setField(term3998, term3998.getClass(), "jsType", null);
        setField(term3998, term3998.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "first", term3998);
        setField(term3984, term3984.getClass(), "last", term3998);
        setField(term3984, term3984.getClass(), "propListHead", null);
        setIntField(term3984, term3984.getClass(), "sourcePosition", 0);
        setField(term3984, term3984.getClass(), "jsType", null);
        setField(term3984, term3984.getClass(), "parent", null);
        setField(term3982, term3982.getClass(), "next", term3984);
        setField(term3982, term3982.getClass(), "first", term3988);
        setField(term3982, term3982.getClass(), "last", term3991);
        setField(term3982, term3982.getClass(), "propListHead", null);
        setIntField(term3982, term3982.getClass(), "sourcePosition", 0);
        setField(term3982, term3982.getClass(), "jsType", null);
        setField(term3982, term3982.getClass(), "parent", null);
        setElement(term3981, 0, term3982);
        setElement(term3981, 1, term3991);
        setElement(term3981, 2, term3984);
        setIntField(term4006, term4006.getClass(), "type", 1727771237);
        setField(term4006, term4006.getClass(), "next", term3994);
        setField(term4006, term4006.getClass(), "first", term3998);
        setField(term4006, term4006.getClass(), "last", term3994);
        setField(term4006, term4006.getClass(), "propListHead", null);
        setIntField(term4006, term4006.getClass(), "sourcePosition", 0);
        setField(term4006, term4006.getClass(), "jsType", null);
        setField(term4006, term4006.getClass(), "parent", null);
        setElement(term3981, 3, term4006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3954;
        args[1] = term3981;
        try {
            callMethod(klass, "newCallNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


