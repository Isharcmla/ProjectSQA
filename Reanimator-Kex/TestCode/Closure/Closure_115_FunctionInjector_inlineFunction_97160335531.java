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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_inlineFunction_97160335531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;
     Object term1284;
     Object term1311;

    public FunctionInjector_inlineFunction_97160335531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1277 = new HashMap();
        Set<Object> term5620 =  ((Map) term1277).keySet();
        HashSet term1276 = new HashSet((Collection<? extends Object>) term5620);
        term1274 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1274, term1274.getClass(), "compiler", null);
        setField(term1274, term1274.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term1274, term1274.getClass(), "allowDecomposition", true);
        setField(term1274, term1274.getClass(), "knownConstants", term1276);
        setBooleanField(term1274, term1274.getClass(), "assumeStrictThis", true);
        setBooleanField(term1274, term1274.getClass(), "assumeMinimumCapture", true);
        term1284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1284, term1284.getClass(), "type", 339854490);
        setIntField(term1286, term1286.getClass(), "type", -615654495);
        setIntField(term1288, term1288.getClass(), "type", -1476117762);
        setIntField(term1290, term1290.getClass(), "type", -341962980);
        setIntField(term1292, term1292.getClass(), "type", 1532716628);
        setField(term1292, term1292.getClass(), "next", null);
        setField(term1292, term1292.getClass(), "first", null);
        setField(term1292, term1292.getClass(), "last", null);
        setField(term1292, term1292.getClass(), "propListHead", null);
        setIntField(term1292, term1292.getClass(), "sourcePosition", 0);
        setField(term1292, term1292.getClass(), "jsType", null);
        setField(term1292, term1292.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "next", term1292);
        setIntField(term1295, term1295.getClass(), "type", -1801760683);
        setField(term1295, term1295.getClass(), "next", null);
        setField(term1295, term1295.getClass(), "first", null);
        setField(term1295, term1295.getClass(), "last", term1292);
        setField(term1295, term1295.getClass(), "propListHead", null);
        setIntField(term1295, term1295.getClass(), "sourcePosition", 0);
        setField(term1295, term1295.getClass(), "jsType", null);
        setField(term1295, term1295.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "first", term1295);
        setField(term1290, term1290.getClass(), "last", term1288);
        setField(term1290, term1290.getClass(), "propListHead", null);
        setIntField(term1290, term1290.getClass(), "sourcePosition", 0);
        setField(term1290, term1290.getClass(), "jsType", null);
        setField(term1290, term1290.getClass(), "parent", null);
        setField(term1288, term1288.getClass(), "next", term1290);
        setField(term1288, term1288.getClass(), "first", term1292);
        setIntField(term1299, term1299.getClass(), "type", 890669485);
        setIntField(term1301, term1301.getClass(), "type", 691577392);
        setField(term1301, term1301.getClass(), "next", null);
        setField(term1301, term1301.getClass(), "first", term1295);
        setField(term1301, term1301.getClass(), "last", term1290);
        setField(term1301, term1301.getClass(), "propListHead", null);
        setIntField(term1301, term1301.getClass(), "sourcePosition", 0);
        setField(term1301, term1301.getClass(), "jsType", null);
        setField(term1301, term1301.getClass(), "parent", null);
        setField(term1299, term1299.getClass(), "next", term1301);
        setField(term1299, term1299.getClass(), "first", term1286);
        setField(term1299, term1299.getClass(), "last", term1286);
        setField(term1299, term1299.getClass(), "propListHead", null);
        setIntField(term1299, term1299.getClass(), "sourcePosition", 0);
        setField(term1299, term1299.getClass(), "jsType", null);
        setField(term1299, term1299.getClass(), "parent", null);
        setField(term1288, term1288.getClass(), "last", term1299);
        setField(term1288, term1288.getClass(), "propListHead", null);
        setIntField(term1288, term1288.getClass(), "sourcePosition", 0);
        setField(term1288, term1288.getClass(), "jsType", null);
        setField(term1288, term1288.getClass(), "parent", null);
        setField(term1286, term1286.getClass(), "next", term1288);
        setIntField(term1306, term1306.getClass(), "type", -893623680);
        setField(term1306, term1306.getClass(), "next", term1299);
        setField(term1306, term1306.getClass(), "first", term1301);
        setField(term1306, term1306.getClass(), "last", term1284);
        setField(term1306, term1306.getClass(), "propListHead", null);
        setIntField(term1306, term1306.getClass(), "sourcePosition", 0);
        setField(term1306, term1306.getClass(), "jsType", null);
        setField(term1306, term1306.getClass(), "parent", null);
        setField(term1286, term1286.getClass(), "first", term1306);
        setField(term1286, term1286.getClass(), "last", term1306);
        setField(term1286, term1286.getClass(), "propListHead", null);
        setIntField(term1286, term1286.getClass(), "sourcePosition", 0);
        setField(term1286, term1286.getClass(), "jsType", null);
        setField(term1286, term1286.getClass(), "parent", null);
        setField(term1284, term1284.getClass(), "next", term1286);
        setField(term1284, term1284.getClass(), "first", term1290);
        setField(term1284, term1284.getClass(), "last", term1292);
        setField(term1284, term1284.getClass(), "propListHead", null);
        setIntField(term1284, term1284.getClass(), "sourcePosition", 0);
        setField(term1284, term1284.getClass(), "jsType", null);
        setField(term1284, term1284.getClass(), "parent", null);
        term1311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1311, term1311.getClass(), "type", -1963434938);
        setIntField(term1313, term1313.getClass(), "type", 906181092);
        setIntField(term1315, term1315.getClass(), "type", 1045657203);
        setIntField(term1317, term1317.getClass(), "type", 1386130016);
        setIntField(term1319, term1319.getClass(), "type", 1072005683);
        setField(term1319, term1319.getClass(), "next", null);
        setField(term1319, term1319.getClass(), "first", null);
        setField(term1319, term1319.getClass(), "last", null);
        setField(term1319, term1319.getClass(), "propListHead", null);
        setIntField(term1319, term1319.getClass(), "sourcePosition", 0);
        setField(term1319, term1319.getClass(), "jsType", null);
        setField(term1319, term1319.getClass(), "parent", null);
        setField(term1317, term1317.getClass(), "next", term1319);
        setIntField(term1322, term1322.getClass(), "type", 1861318859);
        setField(term1322, term1322.getClass(), "next", null);
        setField(term1322, term1322.getClass(), "first", null);
        setField(term1322, term1322.getClass(), "last", term1319);
        setField(term1322, term1322.getClass(), "propListHead", null);
        setIntField(term1322, term1322.getClass(), "sourcePosition", 0);
        setField(term1322, term1322.getClass(), "jsType", null);
        setField(term1322, term1322.getClass(), "parent", null);
        setField(term1317, term1317.getClass(), "first", term1322);
        setField(term1317, term1317.getClass(), "last", term1315);
        setField(term1317, term1317.getClass(), "propListHead", null);
        setIntField(term1317, term1317.getClass(), "sourcePosition", 0);
        setField(term1317, term1317.getClass(), "jsType", null);
        setField(term1317, term1317.getClass(), "parent", null);
        setField(term1315, term1315.getClass(), "next", term1317);
        setField(term1315, term1315.getClass(), "first", term1319);
        setIntField(term1326, term1326.getClass(), "type", 568954359);
        setIntField(term1328, term1328.getClass(), "type", 53410913);
        setField(term1328, term1328.getClass(), "next", null);
        setField(term1328, term1328.getClass(), "first", term1322);
        setField(term1328, term1328.getClass(), "last", term1317);
        setField(term1328, term1328.getClass(), "propListHead", null);
        setIntField(term1328, term1328.getClass(), "sourcePosition", 0);
        setField(term1328, term1328.getClass(), "jsType", null);
        setField(term1328, term1328.getClass(), "parent", null);
        setField(term1326, term1326.getClass(), "next", term1328);
        setField(term1326, term1326.getClass(), "first", term1313);
        setField(term1326, term1326.getClass(), "last", term1313);
        setField(term1326, term1326.getClass(), "propListHead", null);
        setIntField(term1326, term1326.getClass(), "sourcePosition", 0);
        setField(term1326, term1326.getClass(), "jsType", null);
        setField(term1326, term1326.getClass(), "parent", null);
        setField(term1315, term1315.getClass(), "last", term1326);
        setField(term1315, term1315.getClass(), "propListHead", null);
        setIntField(term1315, term1315.getClass(), "sourcePosition", 0);
        setField(term1315, term1315.getClass(), "jsType", null);
        setField(term1315, term1315.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "next", term1315);
        setIntField(term1333, term1333.getClass(), "type", -375014958);
        setField(term1333, term1333.getClass(), "next", term1326);
        setField(term1333, term1333.getClass(), "first", term1328);
        setField(term1333, term1333.getClass(), "last", term1311);
        setField(term1333, term1333.getClass(), "propListHead", null);
        setIntField(term1333, term1333.getClass(), "sourcePosition", 0);
        setField(term1333, term1333.getClass(), "jsType", null);
        setField(term1333, term1333.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "first", term1333);
        setField(term1313, term1313.getClass(), "last", term1333);
        setField(term1313, term1313.getClass(), "propListHead", null);
        setIntField(term1313, term1313.getClass(), "sourcePosition", 0);
        setField(term1313, term1313.getClass(), "jsType", null);
        setField(term1313, term1313.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "next", term1313);
        setField(term1311, term1311.getClass(), "first", term1317);
        setField(term1311, term1311.getClass(), "last", term1319);
        setField(term1311, term1311.getClass(), "propListHead", null);
        setIntField(term1311, term1311.getClass(), "sourcePosition", 0);
        setField(term1311, term1311.getClass(), "jsType", null);
        setField(term1311, term1311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1284;
        args[1] = term1311;
        args[2] = "ytSBIKXogI";
        try {
            callMethod(klass, "inlineFunction", argTypes, term1274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


