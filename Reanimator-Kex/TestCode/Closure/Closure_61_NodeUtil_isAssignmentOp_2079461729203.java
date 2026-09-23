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

public class NodeUtil_isAssignmentOp_2079461729203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term952;
     Object term10026;

    public NodeUtil_isAssignmentOp_2079461729203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term952, term952.getClass(), "type", 833762980);
        setIntField(term954, term954.getClass(), "type", -920797484);
        setIntField(term956, term956.getClass(), "type", 0);
        setField(term956, term956.getClass(), "next", null);
        setField(term956, term956.getClass(), "first", null);
        setField(term956, term956.getClass(), "last", null);
        setField(term956, term956.getClass(), "propListHead", null);
        setIntField(term956, term956.getClass(), "sourcePosition", 0);
        setField(term956, term956.getClass(), "jsType", null);
        setField(term956, term956.getClass(), "parent", null);
        setField(term954, term954.getClass(), "next", term956);
        setIntField(term959, term959.getClass(), "type", 0);
        setField(term959, term959.getClass(), "next", null);
        setField(term959, term959.getClass(), "first", null);
        setField(term959, term959.getClass(), "last", null);
        setField(term959, term959.getClass(), "propListHead", null);
        setIntField(term959, term959.getClass(), "sourcePosition", 0);
        setField(term959, term959.getClass(), "jsType", null);
        setField(term959, term959.getClass(), "parent", null);
        setField(term954, term954.getClass(), "first", term959);
        setIntField(term962, term962.getClass(), "type", 0);
        setField(term962, term962.getClass(), "next", null);
        setField(term962, term962.getClass(), "first", null);
        setField(term962, term962.getClass(), "last", null);
        setField(term962, term962.getClass(), "propListHead", null);
        setIntField(term962, term962.getClass(), "sourcePosition", 0);
        setField(term962, term962.getClass(), "jsType", null);
        setField(term962, term962.getClass(), "parent", null);
        setField(term954, term954.getClass(), "last", term962);
        setField(term954, term954.getClass(), "propListHead", null);
        setIntField(term954, term954.getClass(), "sourcePosition", 0);
        setField(term954, term954.getClass(), "jsType", null);
        setField(term954, term954.getClass(), "parent", null);
        setField(term952, term952.getClass(), "next", term954);
        setIntField(term966, term966.getClass(), "type", 0);
        setField(term966, term966.getClass(), "next", null);
        setField(term966, term966.getClass(), "first", null);
        setField(term966, term966.getClass(), "last", null);
        setField(term966, term966.getClass(), "propListHead", null);
        setIntField(term966, term966.getClass(), "sourcePosition", 0);
        setField(term966, term966.getClass(), "jsType", null);
        setField(term966, term966.getClass(), "parent", null);
        setField(term952, term952.getClass(), "first", term966);
        setIntField(term969, term969.getClass(), "type", 0);
        setField(term969, term969.getClass(), "next", null);
        setField(term969, term969.getClass(), "first", null);
        setField(term969, term969.getClass(), "last", null);
        setField(term969, term969.getClass(), "propListHead", null);
        setIntField(term969, term969.getClass(), "sourcePosition", 0);
        setField(term969, term969.getClass(), "jsType", null);
        setField(term969, term969.getClass(), "parent", null);
        setField(term952, term952.getClass(), "last", term969);
        setField(term952, term952.getClass(), "propListHead", null);
        setIntField(term952, term952.getClass(), "sourcePosition", 0);
        setField(term952, term952.getClass(), "jsType", null);
        setField(term952, term952.getClass(), "parent", null);
        term10026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10026, term10026.getClass(), "type", 833762980);
        setIntField(term10027, term10027.getClass(), "type", -920797484);
        setIntField(term10028, term10028.getClass(), "type", 0);
        setField(term10028, term10028.getClass(), "next", null);
        setField(term10028, term10028.getClass(), "first", null);
        setField(term10028, term10028.getClass(), "last", null);
        setField(term10028, term10028.getClass(), "propListHead", null);
        setIntField(term10028, term10028.getClass(), "sourcePosition", 0);
        setField(term10028, term10028.getClass(), "jsType", null);
        setField(term10028, term10028.getClass(), "parent", null);
        setField(term10027, term10027.getClass(), "next", term10028);
        setIntField(term10029, term10029.getClass(), "type", 0);
        setField(term10029, term10029.getClass(), "next", null);
        setField(term10029, term10029.getClass(), "first", null);
        setField(term10029, term10029.getClass(), "last", null);
        setField(term10029, term10029.getClass(), "propListHead", null);
        setIntField(term10029, term10029.getClass(), "sourcePosition", 0);
        setField(term10029, term10029.getClass(), "jsType", null);
        setField(term10029, term10029.getClass(), "parent", null);
        setField(term10027, term10027.getClass(), "first", term10029);
        setIntField(term10030, term10030.getClass(), "type", 0);
        setField(term10030, term10030.getClass(), "next", null);
        setField(term10030, term10030.getClass(), "first", null);
        setField(term10030, term10030.getClass(), "last", null);
        setField(term10030, term10030.getClass(), "propListHead", null);
        setIntField(term10030, term10030.getClass(), "sourcePosition", 0);
        setField(term10030, term10030.getClass(), "jsType", null);
        setField(term10030, term10030.getClass(), "parent", null);
        setField(term10027, term10027.getClass(), "last", term10030);
        setField(term10027, term10027.getClass(), "propListHead", null);
        setIntField(term10027, term10027.getClass(), "sourcePosition", 0);
        setField(term10027, term10027.getClass(), "jsType", null);
        setField(term10027, term10027.getClass(), "parent", null);
        setField(term10026, term10026.getClass(), "next", term10027);
        setIntField(term10031, term10031.getClass(), "type", 0);
        setField(term10031, term10031.getClass(), "next", null);
        setField(term10031, term10031.getClass(), "first", null);
        setField(term10031, term10031.getClass(), "last", null);
        setField(term10031, term10031.getClass(), "propListHead", null);
        setIntField(term10031, term10031.getClass(), "sourcePosition", 0);
        setField(term10031, term10031.getClass(), "jsType", null);
        setField(term10031, term10031.getClass(), "parent", null);
        setField(term10026, term10026.getClass(), "first", term10031);
        setIntField(term10032, term10032.getClass(), "type", 0);
        setField(term10032, term10032.getClass(), "next", null);
        setField(term10032, term10032.getClass(), "first", null);
        setField(term10032, term10032.getClass(), "last", null);
        setField(term10032, term10032.getClass(), "propListHead", null);
        setIntField(term10032, term10032.getClass(), "sourcePosition", 0);
        setField(term10032, term10032.getClass(), "jsType", null);
        setField(term10032, term10032.getClass(), "parent", null);
        setField(term10026, term10026.getClass(), "last", term10032);
        setField(term10026, term10026.getClass(), "propListHead", null);
        setIntField(term10026, term10026.getClass(), "sourcePosition", 0);
        setField(term10026, term10026.getClass(), "jsType", null);
        setField(term10026, term10026.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term952;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term952, term10026));
        assertTrue(recursiveEquals(retValue, false));
    }

};


