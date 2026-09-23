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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_removeChildAfter_1179958414316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3960;
     Object term3987;

    public Node_removeChildAfter_1179958414316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3960, term3960.getClass(), "type", -111082612);
        setIntField(term3962, term3962.getClass(), "type", 1253334988);
        setIntField(term3964, term3964.getClass(), "type", 1086709736);
        setIntField(term3966, term3966.getClass(), "type", -1606698075);
        setIntField(term3968, term3968.getClass(), "type", 90996421);
        setField(term3968, term3968.getClass(), "next", null);
        setField(term3968, term3968.getClass(), "first", null);
        setField(term3968, term3968.getClass(), "last", null);
        setField(term3968, term3968.getClass(), "propListHead", null);
        setIntField(term3968, term3968.getClass(), "sourcePosition", 0);
        setField(term3968, term3968.getClass(), "jsType", null);
        setField(term3968, term3968.getClass(), "parent", null);
        setField(term3966, term3966.getClass(), "next", term3968);
        setIntField(term3971, term3971.getClass(), "type", -1805802783);
        setField(term3971, term3971.getClass(), "next", null);
        setField(term3971, term3971.getClass(), "first", null);
        setField(term3971, term3971.getClass(), "last", term3968);
        setField(term3971, term3971.getClass(), "propListHead", null);
        setIntField(term3971, term3971.getClass(), "sourcePosition", 0);
        setField(term3971, term3971.getClass(), "jsType", null);
        setField(term3971, term3971.getClass(), "parent", null);
        setField(term3966, term3966.getClass(), "first", term3971);
        setField(term3966, term3966.getClass(), "last", term3964);
        setField(term3966, term3966.getClass(), "propListHead", null);
        setIntField(term3966, term3966.getClass(), "sourcePosition", 0);
        setField(term3966, term3966.getClass(), "jsType", null);
        setField(term3966, term3966.getClass(), "parent", null);
        setField(term3964, term3964.getClass(), "next", term3966);
        setField(term3964, term3964.getClass(), "first", term3968);
        setIntField(term3975, term3975.getClass(), "type", 1574493440);
        setIntField(term3977, term3977.getClass(), "type", 1854694585);
        setField(term3977, term3977.getClass(), "next", null);
        setField(term3977, term3977.getClass(), "first", term3971);
        setField(term3977, term3977.getClass(), "last", term3966);
        setField(term3977, term3977.getClass(), "propListHead", null);
        setIntField(term3977, term3977.getClass(), "sourcePosition", 0);
        setField(term3977, term3977.getClass(), "jsType", null);
        setField(term3977, term3977.getClass(), "parent", null);
        setField(term3975, term3975.getClass(), "next", term3977);
        setField(term3975, term3975.getClass(), "first", term3962);
        setField(term3975, term3975.getClass(), "last", term3962);
        setField(term3975, term3975.getClass(), "propListHead", null);
        setIntField(term3975, term3975.getClass(), "sourcePosition", 0);
        setField(term3975, term3975.getClass(), "jsType", null);
        setField(term3975, term3975.getClass(), "parent", null);
        setField(term3964, term3964.getClass(), "last", term3975);
        setField(term3964, term3964.getClass(), "propListHead", null);
        setIntField(term3964, term3964.getClass(), "sourcePosition", 0);
        setField(term3964, term3964.getClass(), "jsType", null);
        setField(term3964, term3964.getClass(), "parent", null);
        setField(term3962, term3962.getClass(), "next", term3964);
        setIntField(term3982, term3982.getClass(), "type", -1260562836);
        setField(term3982, term3982.getClass(), "next", term3975);
        setField(term3982, term3982.getClass(), "first", term3977);
        setField(term3982, term3982.getClass(), "last", term3960);
        setField(term3982, term3982.getClass(), "propListHead", null);
        setIntField(term3982, term3982.getClass(), "sourcePosition", 0);
        setField(term3982, term3982.getClass(), "jsType", null);
        setField(term3982, term3982.getClass(), "parent", null);
        setField(term3962, term3962.getClass(), "first", term3982);
        setField(term3962, term3962.getClass(), "last", term3982);
        setField(term3962, term3962.getClass(), "propListHead", null);
        setIntField(term3962, term3962.getClass(), "sourcePosition", 0);
        setField(term3962, term3962.getClass(), "jsType", null);
        setField(term3962, term3962.getClass(), "parent", null);
        setField(term3960, term3960.getClass(), "next", term3962);
        setField(term3960, term3960.getClass(), "first", term3966);
        setField(term3960, term3960.getClass(), "last", term3968);
        setField(term3960, term3960.getClass(), "propListHead", null);
        setIntField(term3960, term3960.getClass(), "sourcePosition", 0);
        setField(term3960, term3960.getClass(), "jsType", null);
        setField(term3960, term3960.getClass(), "parent", null);
        term3987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3987, term3987.getClass(), "type", 694100722);
        setIntField(term3989, term3989.getClass(), "type", -680529431);
        setIntField(term3991, term3991.getClass(), "type", 212698793);
        setIntField(term3993, term3993.getClass(), "type", 1169519385);
        setIntField(term3995, term3995.getClass(), "type", 1846078344);
        setField(term3995, term3995.getClass(), "next", null);
        setField(term3995, term3995.getClass(), "first", null);
        setField(term3995, term3995.getClass(), "last", null);
        setField(term3995, term3995.getClass(), "propListHead", null);
        setIntField(term3995, term3995.getClass(), "sourcePosition", 0);
        setField(term3995, term3995.getClass(), "jsType", null);
        setField(term3995, term3995.getClass(), "parent", null);
        setField(term3993, term3993.getClass(), "next", term3995);
        setIntField(term3998, term3998.getClass(), "type", 1692543802);
        setField(term3998, term3998.getClass(), "next", null);
        setField(term3998, term3998.getClass(), "first", null);
        setField(term3998, term3998.getClass(), "last", term3995);
        setField(term3998, term3998.getClass(), "propListHead", null);
        setIntField(term3998, term3998.getClass(), "sourcePosition", 0);
        setField(term3998, term3998.getClass(), "jsType", null);
        setField(term3998, term3998.getClass(), "parent", null);
        setField(term3993, term3993.getClass(), "first", term3998);
        setField(term3993, term3993.getClass(), "last", term3991);
        setField(term3993, term3993.getClass(), "propListHead", null);
        setIntField(term3993, term3993.getClass(), "sourcePosition", 0);
        setField(term3993, term3993.getClass(), "jsType", null);
        setField(term3993, term3993.getClass(), "parent", null);
        setField(term3991, term3991.getClass(), "next", term3993);
        setField(term3991, term3991.getClass(), "first", term3995);
        setIntField(term4002, term4002.getClass(), "type", -1607267243);
        setIntField(term4004, term4004.getClass(), "type", 1641377218);
        setField(term4004, term4004.getClass(), "next", null);
        setField(term4004, term4004.getClass(), "first", term3998);
        setField(term4004, term4004.getClass(), "last", term3993);
        setField(term4004, term4004.getClass(), "propListHead", null);
        setIntField(term4004, term4004.getClass(), "sourcePosition", 0);
        setField(term4004, term4004.getClass(), "jsType", null);
        setField(term4004, term4004.getClass(), "parent", null);
        setField(term4002, term4002.getClass(), "next", term4004);
        setField(term4002, term4002.getClass(), "first", term3989);
        setField(term4002, term4002.getClass(), "last", term3989);
        setField(term4002, term4002.getClass(), "propListHead", null);
        setIntField(term4002, term4002.getClass(), "sourcePosition", 0);
        setField(term4002, term4002.getClass(), "jsType", null);
        setField(term4002, term4002.getClass(), "parent", null);
        setField(term3991, term3991.getClass(), "last", term4002);
        setField(term3991, term3991.getClass(), "propListHead", null);
        setIntField(term3991, term3991.getClass(), "sourcePosition", 0);
        setField(term3991, term3991.getClass(), "jsType", null);
        setField(term3991, term3991.getClass(), "parent", null);
        setField(term3989, term3989.getClass(), "next", term3991);
        setIntField(term4009, term4009.getClass(), "type", 1235375204);
        setField(term4009, term4009.getClass(), "next", term4002);
        setField(term4009, term4009.getClass(), "first", term4004);
        setField(term4009, term4009.getClass(), "last", term3987);
        setField(term4009, term4009.getClass(), "propListHead", null);
        setIntField(term4009, term4009.getClass(), "sourcePosition", 0);
        setField(term4009, term4009.getClass(), "jsType", null);
        setField(term4009, term4009.getClass(), "parent", null);
        setField(term3989, term3989.getClass(), "first", term4009);
        setField(term3989, term3989.getClass(), "last", term4009);
        setField(term3989, term3989.getClass(), "propListHead", null);
        setIntField(term3989, term3989.getClass(), "sourcePosition", 0);
        setField(term3989, term3989.getClass(), "jsType", null);
        setField(term3989, term3989.getClass(), "parent", null);
        setField(term3987, term3987.getClass(), "next", term3989);
        setField(term3987, term3987.getClass(), "first", term3993);
        setField(term3987, term3987.getClass(), "last", term3995);
        setField(term3987, term3987.getClass(), "propListHead", null);
        setIntField(term3987, term3987.getClass(), "sourcePosition", 0);
        setField(term3987, term3987.getClass(), "jsType", null);
        setField(term3987, term3987.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3987;
        try {
            callMethod(klass, "removeChildAfter", argTypes, term3960, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


