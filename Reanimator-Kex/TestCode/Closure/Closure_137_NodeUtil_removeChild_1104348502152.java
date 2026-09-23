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

public class NodeUtil_removeChild_1104348502152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1300;
     Object term1327;

    public NodeUtil_removeChild_1104348502152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1323 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1300, term1300.getClass(), "type", 797203987);
        setIntField(term1302, term1302.getClass(), "type", 1406617209);
        setIntField(term1304, term1304.getClass(), "type", 0);
        setField(term1304, term1304.getClass(), "next", null);
        setField(term1304, term1304.getClass(), "first", null);
        setField(term1304, term1304.getClass(), "last", null);
        setField(term1304, term1304.getClass(), "propListHead", null);
        setIntField(term1304, term1304.getClass(), "sourcePosition", 0);
        setField(term1304, term1304.getClass(), "jsType", null);
        setField(term1304, term1304.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "next", term1304);
        setIntField(term1307, term1307.getClass(), "type", 0);
        setField(term1307, term1307.getClass(), "next", null);
        setField(term1307, term1307.getClass(), "first", null);
        setField(term1307, term1307.getClass(), "last", null);
        setField(term1307, term1307.getClass(), "propListHead", null);
        setIntField(term1307, term1307.getClass(), "sourcePosition", 0);
        setField(term1307, term1307.getClass(), "jsType", null);
        setField(term1307, term1307.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "first", term1307);
        setIntField(term1310, term1310.getClass(), "type", 0);
        setField(term1310, term1310.getClass(), "next", null);
        setField(term1310, term1310.getClass(), "first", null);
        setField(term1310, term1310.getClass(), "last", null);
        setField(term1310, term1310.getClass(), "propListHead", null);
        setIntField(term1310, term1310.getClass(), "sourcePosition", 0);
        setField(term1310, term1310.getClass(), "jsType", null);
        setField(term1310, term1310.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "last", term1310);
        setField(term1313, term1313.getClass(), "next", null);
        setIntField(term1313, term1313.getClass(), "type", 0);
        setIntField(term1313, term1313.getClass(), "intValue", 0);
        setField(term1313, term1313.getClass(), "objectValue", null);
        setField(term1302, term1302.getClass(), "propListHead", term1313);
        setIntField(term1302, term1302.getClass(), "sourcePosition", -1999787419);
        setField(term1302, term1302.getClass(), "jsType", null);
        setField(term1302, term1302.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "next", term1302);
        setIntField(term1317, term1317.getClass(), "type", 0);
        setField(term1317, term1317.getClass(), "next", null);
        setField(term1317, term1317.getClass(), "first", null);
        setField(term1317, term1317.getClass(), "last", null);
        setField(term1317, term1317.getClass(), "propListHead", null);
        setIntField(term1317, term1317.getClass(), "sourcePosition", 0);
        setField(term1317, term1317.getClass(), "jsType", null);
        setField(term1317, term1317.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "first", term1317);
        setIntField(term1320, term1320.getClass(), "type", 0);
        setField(term1320, term1320.getClass(), "next", null);
        setField(term1320, term1320.getClass(), "first", null);
        setField(term1320, term1320.getClass(), "last", null);
        setField(term1320, term1320.getClass(), "propListHead", null);
        setIntField(term1320, term1320.getClass(), "sourcePosition", 0);
        setField(term1320, term1320.getClass(), "jsType", null);
        setField(term1320, term1320.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "last", term1320);
        setField(term1323, term1323.getClass(), "next", null);
        setIntField(term1323, term1323.getClass(), "type", 0);
        setIntField(term1323, term1323.getClass(), "intValue", 0);
        setField(term1323, term1323.getClass(), "objectValue", null);
        setField(term1300, term1300.getClass(), "propListHead", term1323);
        setIntField(term1300, term1300.getClass(), "sourcePosition", -1224443634);
        setField(term1300, term1300.getClass(), "jsType", null);
        setField(term1300, term1300.getClass(), "parent", null);
        term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1340 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1350 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1327, term1327.getClass(), "type", -1973791064);
        setIntField(term1329, term1329.getClass(), "type", 1633913667);
        setIntField(term1331, term1331.getClass(), "type", 0);
        setField(term1331, term1331.getClass(), "next", null);
        setField(term1331, term1331.getClass(), "first", null);
        setField(term1331, term1331.getClass(), "last", null);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "next", term1331);
        setIntField(term1334, term1334.getClass(), "type", 0);
        setField(term1334, term1334.getClass(), "next", null);
        setField(term1334, term1334.getClass(), "first", null);
        setField(term1334, term1334.getClass(), "last", null);
        setField(term1334, term1334.getClass(), "propListHead", null);
        setIntField(term1334, term1334.getClass(), "sourcePosition", 0);
        setField(term1334, term1334.getClass(), "jsType", null);
        setField(term1334, term1334.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "first", term1334);
        setIntField(term1337, term1337.getClass(), "type", 0);
        setField(term1337, term1337.getClass(), "next", null);
        setField(term1337, term1337.getClass(), "first", null);
        setField(term1337, term1337.getClass(), "last", null);
        setField(term1337, term1337.getClass(), "propListHead", null);
        setIntField(term1337, term1337.getClass(), "sourcePosition", 0);
        setField(term1337, term1337.getClass(), "jsType", null);
        setField(term1337, term1337.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "last", term1337);
        setField(term1340, term1340.getClass(), "next", null);
        setIntField(term1340, term1340.getClass(), "type", 0);
        setIntField(term1340, term1340.getClass(), "intValue", 0);
        setField(term1340, term1340.getClass(), "objectValue", null);
        setField(term1329, term1329.getClass(), "propListHead", term1340);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 612177768);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1344, term1344.getClass(), "type", 0);
        setField(term1344, term1344.getClass(), "next", null);
        setField(term1344, term1344.getClass(), "first", null);
        setField(term1344, term1344.getClass(), "last", null);
        setField(term1344, term1344.getClass(), "propListHead", null);
        setIntField(term1344, term1344.getClass(), "sourcePosition", 0);
        setField(term1344, term1344.getClass(), "jsType", null);
        setField(term1344, term1344.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1344);
        setIntField(term1347, term1347.getClass(), "type", 0);
        setField(term1347, term1347.getClass(), "next", null);
        setField(term1347, term1347.getClass(), "first", null);
        setField(term1347, term1347.getClass(), "last", null);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "last", term1347);
        setField(term1350, term1350.getClass(), "next", null);
        setIntField(term1350, term1350.getClass(), "type", 0);
        setIntField(term1350, term1350.getClass(), "intValue", 0);
        setField(term1350, term1350.getClass(), "objectValue", null);
        setField(term1327, term1327.getClass(), "propListHead", term1350);
        setIntField(term1327, term1327.getClass(), "sourcePosition", -1626451656);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1300;
        args[1] = term1327;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


