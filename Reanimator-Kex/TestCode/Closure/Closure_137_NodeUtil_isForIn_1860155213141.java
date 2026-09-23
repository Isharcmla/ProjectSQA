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

public class NodeUtil_isForIn_1860155213141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;
     Object term7031;

    public NodeUtil_isForIn_1860155213141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term949, term949.getClass(), "type", -439048495);
        setIntField(term951, term951.getClass(), "type", 787278105);
        setIntField(term953, term953.getClass(), "type", 0);
        setField(term953, term953.getClass(), "next", null);
        setField(term953, term953.getClass(), "first", null);
        setField(term953, term953.getClass(), "last", null);
        setField(term953, term953.getClass(), "propListHead", null);
        setIntField(term953, term953.getClass(), "sourcePosition", 0);
        setField(term953, term953.getClass(), "jsType", null);
        setField(term953, term953.getClass(), "parent", null);
        setField(term951, term951.getClass(), "next", term953);
        setIntField(term956, term956.getClass(), "type", 0);
        setField(term956, term956.getClass(), "next", null);
        setField(term956, term956.getClass(), "first", null);
        setField(term956, term956.getClass(), "last", null);
        setField(term956, term956.getClass(), "propListHead", null);
        setIntField(term956, term956.getClass(), "sourcePosition", 0);
        setField(term956, term956.getClass(), "jsType", null);
        setField(term956, term956.getClass(), "parent", null);
        setField(term951, term951.getClass(), "first", term956);
        setIntField(term959, term959.getClass(), "type", 0);
        setField(term959, term959.getClass(), "next", null);
        setField(term959, term959.getClass(), "first", null);
        setField(term959, term959.getClass(), "last", null);
        setField(term959, term959.getClass(), "propListHead", null);
        setIntField(term959, term959.getClass(), "sourcePosition", 0);
        setField(term959, term959.getClass(), "jsType", null);
        setField(term959, term959.getClass(), "parent", null);
        setField(term951, term951.getClass(), "last", term959);
        setField(term962, term962.getClass(), "next", null);
        setIntField(term962, term962.getClass(), "type", 0);
        setIntField(term962, term962.getClass(), "intValue", 0);
        setField(term962, term962.getClass(), "objectValue", null);
        setField(term951, term951.getClass(), "propListHead", term962);
        setIntField(term951, term951.getClass(), "sourcePosition", 320711637);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term949, term949.getClass(), "next", term951);
        setIntField(term966, term966.getClass(), "type", 0);
        setField(term966, term966.getClass(), "next", null);
        setField(term966, term966.getClass(), "first", null);
        setField(term966, term966.getClass(), "last", null);
        setField(term966, term966.getClass(), "propListHead", null);
        setIntField(term966, term966.getClass(), "sourcePosition", 0);
        setField(term966, term966.getClass(), "jsType", null);
        setField(term966, term966.getClass(), "parent", null);
        setField(term949, term949.getClass(), "first", term966);
        setIntField(term969, term969.getClass(), "type", 0);
        setField(term969, term969.getClass(), "next", null);
        setField(term969, term969.getClass(), "first", null);
        setField(term969, term969.getClass(), "last", null);
        setField(term969, term969.getClass(), "propListHead", null);
        setIntField(term969, term969.getClass(), "sourcePosition", 0);
        setField(term969, term969.getClass(), "jsType", null);
        setField(term969, term969.getClass(), "parent", null);
        setField(term949, term949.getClass(), "last", term969);
        setField(term972, term972.getClass(), "next", null);
        setIntField(term972, term972.getClass(), "type", 0);
        setIntField(term972, term972.getClass(), "intValue", 0);
        setField(term972, term972.getClass(), "objectValue", null);
        setField(term949, term949.getClass(), "propListHead", term972);
        setIntField(term949, term949.getClass(), "sourcePosition", 1241164745);
        setField(term949, term949.getClass(), "jsType", null);
        setField(term949, term949.getClass(), "parent", null);
        term7031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7036 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7039 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7031, term7031.getClass(), "type", -439048495);
        setIntField(term7032, term7032.getClass(), "type", 787278105);
        setIntField(term7033, term7033.getClass(), "type", 0);
        setField(term7033, term7033.getClass(), "next", null);
        setField(term7033, term7033.getClass(), "first", null);
        setField(term7033, term7033.getClass(), "last", null);
        setField(term7033, term7033.getClass(), "propListHead", null);
        setIntField(term7033, term7033.getClass(), "sourcePosition", 0);
        setField(term7033, term7033.getClass(), "jsType", null);
        setField(term7033, term7033.getClass(), "parent", null);
        setField(term7032, term7032.getClass(), "next", term7033);
        setIntField(term7034, term7034.getClass(), "type", 0);
        setField(term7034, term7034.getClass(), "next", null);
        setField(term7034, term7034.getClass(), "first", null);
        setField(term7034, term7034.getClass(), "last", null);
        setField(term7034, term7034.getClass(), "propListHead", null);
        setIntField(term7034, term7034.getClass(), "sourcePosition", 0);
        setField(term7034, term7034.getClass(), "jsType", null);
        setField(term7034, term7034.getClass(), "parent", null);
        setField(term7032, term7032.getClass(), "first", term7034);
        setIntField(term7035, term7035.getClass(), "type", 0);
        setField(term7035, term7035.getClass(), "next", null);
        setField(term7035, term7035.getClass(), "first", null);
        setField(term7035, term7035.getClass(), "last", null);
        setField(term7035, term7035.getClass(), "propListHead", null);
        setIntField(term7035, term7035.getClass(), "sourcePosition", 0);
        setField(term7035, term7035.getClass(), "jsType", null);
        setField(term7035, term7035.getClass(), "parent", null);
        setField(term7032, term7032.getClass(), "last", term7035);
        setField(term7036, term7036.getClass(), "next", null);
        setIntField(term7036, term7036.getClass(), "type", 0);
        setIntField(term7036, term7036.getClass(), "intValue", 0);
        setField(term7036, term7036.getClass(), "objectValue", null);
        setField(term7032, term7032.getClass(), "propListHead", term7036);
        setIntField(term7032, term7032.getClass(), "sourcePosition", 320711637);
        setField(term7032, term7032.getClass(), "jsType", null);
        setField(term7032, term7032.getClass(), "parent", null);
        setField(term7031, term7031.getClass(), "next", term7032);
        setIntField(term7037, term7037.getClass(), "type", 0);
        setField(term7037, term7037.getClass(), "next", null);
        setField(term7037, term7037.getClass(), "first", null);
        setField(term7037, term7037.getClass(), "last", null);
        setField(term7037, term7037.getClass(), "propListHead", null);
        setIntField(term7037, term7037.getClass(), "sourcePosition", 0);
        setField(term7037, term7037.getClass(), "jsType", null);
        setField(term7037, term7037.getClass(), "parent", null);
        setField(term7031, term7031.getClass(), "first", term7037);
        setIntField(term7038, term7038.getClass(), "type", 0);
        setField(term7038, term7038.getClass(), "next", null);
        setField(term7038, term7038.getClass(), "first", null);
        setField(term7038, term7038.getClass(), "last", null);
        setField(term7038, term7038.getClass(), "propListHead", null);
        setIntField(term7038, term7038.getClass(), "sourcePosition", 0);
        setField(term7038, term7038.getClass(), "jsType", null);
        setField(term7038, term7038.getClass(), "parent", null);
        setField(term7031, term7031.getClass(), "last", term7038);
        setField(term7039, term7039.getClass(), "next", null);
        setIntField(term7039, term7039.getClass(), "type", 0);
        setIntField(term7039, term7039.getClass(), "intValue", 0);
        setField(term7039, term7039.getClass(), "objectValue", null);
        setField(term7031, term7031.getClass(), "propListHead", term7039);
        setIntField(term7031, term7031.getClass(), "sourcePosition", 1241164745);
        setField(term7031, term7031.getClass(), "jsType", null);
        setField(term7031, term7031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term949;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term949, term7031));
        assertTrue(recursiveEquals(retValue, false));
    }

};


