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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_replaceWithRhs_36025316049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2942;
     Object term3004;
     Object term3031;

    public NameAnalyzer_replaceWithRhs_36025316049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2943 = new HashMap();
        HashMap term2959 = new HashMap();
        Set<Object> term12208 =  ((Map) term2959).keySet();
        HashSet term2958 = new HashSet((Collection<? extends Object>) term12208);
        ArrayList term2965 = new ArrayList();
        HashMap term2970 = new HashMap();
        Set<Object> term12209 =  ((Map) term2970).keySet();
        HashSet term2969 = new HashSet((Collection<? extends Object>) term12209);
        ArrayList term2990 = new ArrayList();
        ((ArrayList) term2990).add((Object)null);
        ((ArrayList) term2990).add((Object)null);
        ((ArrayList) term2990).add((Object)null);
        ((ArrayList) term2990).add((Object)null);
        ((ArrayList) term2990).add((Object)null);
        ((ArrayList) term2990).add((Object)null);
        HashMap term2994 = new HashMap();
        term2942 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2964 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2942, term2942.getClass(), "compiler", null);
        setField(term2942, term2942.getClass(), "allNames", term2943);
        setField(term2942, term2942.getClass(), "referenceGraph", null);
        setField(term2942, term2942.getClass(), "scopes", null);
        setBooleanField(term2942, term2942.getClass(), "removeUnreferenced", true);
        setField(term2942, term2942.getClass(), "globalNames", term2958);
        setField(term2964, term2964.getClass(), "listeners", term2965);
        setField(term2942, term2942.getClass(), "changeProxy", term2964);
        setField(term2942, term2942.getClass(), "externalNames", term2969);
        setField(term2942, term2942.getClass(), "refNodes", term2990);
        setField(term2942, term2942.getClass(), "aliases", term2994);
        term3004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3004, term3004.getClass(), "type", -344842608);
        setIntField(term3006, term3006.getClass(), "type", 941650513);
        setIntField(term3008, term3008.getClass(), "type", 444029505);
        setIntField(term3010, term3010.getClass(), "type", -1034506028);
        setIntField(term3012, term3012.getClass(), "type", -1263114719);
        setField(term3012, term3012.getClass(), "next", null);
        setField(term3012, term3012.getClass(), "first", null);
        setField(term3012, term3012.getClass(), "last", null);
        setField(term3012, term3012.getClass(), "propListHead", null);
        setIntField(term3012, term3012.getClass(), "sourcePosition", 0);
        setField(term3012, term3012.getClass(), "jsType", null);
        setField(term3012, term3012.getClass(), "parent", null);
        setField(term3010, term3010.getClass(), "next", term3012);
        setIntField(term3015, term3015.getClass(), "type", -894662986);
        setField(term3015, term3015.getClass(), "next", null);
        setField(term3015, term3015.getClass(), "first", null);
        setField(term3015, term3015.getClass(), "last", term3012);
        setField(term3015, term3015.getClass(), "propListHead", null);
        setIntField(term3015, term3015.getClass(), "sourcePosition", 0);
        setField(term3015, term3015.getClass(), "jsType", null);
        setField(term3015, term3015.getClass(), "parent", null);
        setField(term3010, term3010.getClass(), "first", term3015);
        setField(term3010, term3010.getClass(), "last", term3008);
        setField(term3010, term3010.getClass(), "propListHead", null);
        setIntField(term3010, term3010.getClass(), "sourcePosition", 0);
        setField(term3010, term3010.getClass(), "jsType", null);
        setField(term3010, term3010.getClass(), "parent", null);
        setField(term3008, term3008.getClass(), "next", term3010);
        setField(term3008, term3008.getClass(), "first", term3012);
        setIntField(term3019, term3019.getClass(), "type", -1347665717);
        setIntField(term3021, term3021.getClass(), "type", -1888585309);
        setField(term3021, term3021.getClass(), "next", null);
        setField(term3021, term3021.getClass(), "first", term3015);
        setField(term3021, term3021.getClass(), "last", term3010);
        setField(term3021, term3021.getClass(), "propListHead", null);
        setIntField(term3021, term3021.getClass(), "sourcePosition", 0);
        setField(term3021, term3021.getClass(), "jsType", null);
        setField(term3021, term3021.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "next", term3021);
        setField(term3019, term3019.getClass(), "first", term3006);
        setField(term3019, term3019.getClass(), "last", term3006);
        setField(term3019, term3019.getClass(), "propListHead", null);
        setIntField(term3019, term3019.getClass(), "sourcePosition", 0);
        setField(term3019, term3019.getClass(), "jsType", null);
        setField(term3019, term3019.getClass(), "parent", null);
        setField(term3008, term3008.getClass(), "last", term3019);
        setField(term3008, term3008.getClass(), "propListHead", null);
        setIntField(term3008, term3008.getClass(), "sourcePosition", 0);
        setField(term3008, term3008.getClass(), "jsType", null);
        setField(term3008, term3008.getClass(), "parent", null);
        setField(term3006, term3006.getClass(), "next", term3008);
        setIntField(term3026, term3026.getClass(), "type", 683666002);
        setField(term3026, term3026.getClass(), "next", term3019);
        setField(term3026, term3026.getClass(), "first", term3021);
        setField(term3026, term3026.getClass(), "last", term3004);
        setField(term3026, term3026.getClass(), "propListHead", null);
        setIntField(term3026, term3026.getClass(), "sourcePosition", 0);
        setField(term3026, term3026.getClass(), "jsType", null);
        setField(term3026, term3026.getClass(), "parent", null);
        setField(term3006, term3006.getClass(), "first", term3026);
        setField(term3006, term3006.getClass(), "last", term3026);
        setField(term3006, term3006.getClass(), "propListHead", null);
        setIntField(term3006, term3006.getClass(), "sourcePosition", 0);
        setField(term3006, term3006.getClass(), "jsType", null);
        setField(term3006, term3006.getClass(), "parent", null);
        setField(term3004, term3004.getClass(), "next", term3006);
        setField(term3004, term3004.getClass(), "first", term3010);
        setField(term3004, term3004.getClass(), "last", term3012);
        setField(term3004, term3004.getClass(), "propListHead", null);
        setIntField(term3004, term3004.getClass(), "sourcePosition", 0);
        setField(term3004, term3004.getClass(), "jsType", null);
        setField(term3004, term3004.getClass(), "parent", null);
        term3031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3031, term3031.getClass(), "type", 1596213415);
        setIntField(term3033, term3033.getClass(), "type", -268815336);
        setIntField(term3035, term3035.getClass(), "type", -1210583429);
        setIntField(term3037, term3037.getClass(), "type", -663691365);
        setIntField(term3039, term3039.getClass(), "type", 339854490);
        setField(term3039, term3039.getClass(), "next", null);
        setField(term3039, term3039.getClass(), "first", null);
        setField(term3039, term3039.getClass(), "last", null);
        setField(term3039, term3039.getClass(), "propListHead", null);
        setIntField(term3039, term3039.getClass(), "sourcePosition", 0);
        setField(term3039, term3039.getClass(), "jsType", null);
        setField(term3039, term3039.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "next", term3039);
        setIntField(term3042, term3042.getClass(), "type", -615654495);
        setField(term3042, term3042.getClass(), "next", null);
        setField(term3042, term3042.getClass(), "first", null);
        setField(term3042, term3042.getClass(), "last", term3039);
        setField(term3042, term3042.getClass(), "propListHead", null);
        setIntField(term3042, term3042.getClass(), "sourcePosition", 0);
        setField(term3042, term3042.getClass(), "jsType", null);
        setField(term3042, term3042.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "first", term3042);
        setField(term3037, term3037.getClass(), "last", term3035);
        setField(term3037, term3037.getClass(), "propListHead", null);
        setIntField(term3037, term3037.getClass(), "sourcePosition", 0);
        setField(term3037, term3037.getClass(), "jsType", null);
        setField(term3037, term3037.getClass(), "parent", null);
        setField(term3035, term3035.getClass(), "next", term3037);
        setField(term3035, term3035.getClass(), "first", term3039);
        setIntField(term3046, term3046.getClass(), "type", -341962980);
        setIntField(term3048, term3048.getClass(), "type", 1532716628);
        setField(term3048, term3048.getClass(), "next", null);
        setField(term3048, term3048.getClass(), "first", term3042);
        setField(term3048, term3048.getClass(), "last", term3037);
        setField(term3048, term3048.getClass(), "propListHead", null);
        setIntField(term3048, term3048.getClass(), "sourcePosition", 0);
        setField(term3048, term3048.getClass(), "jsType", null);
        setField(term3048, term3048.getClass(), "parent", null);
        setField(term3046, term3046.getClass(), "next", term3048);
        setField(term3046, term3046.getClass(), "first", term3033);
        setField(term3046, term3046.getClass(), "last", term3033);
        setField(term3046, term3046.getClass(), "propListHead", null);
        setIntField(term3046, term3046.getClass(), "sourcePosition", 0);
        setField(term3046, term3046.getClass(), "jsType", null);
        setField(term3046, term3046.getClass(), "parent", null);
        setField(term3035, term3035.getClass(), "last", term3046);
        setField(term3035, term3035.getClass(), "propListHead", null);
        setIntField(term3035, term3035.getClass(), "sourcePosition", 0);
        setField(term3035, term3035.getClass(), "jsType", null);
        setField(term3035, term3035.getClass(), "parent", null);
        setField(term3033, term3033.getClass(), "next", term3035);
        setIntField(term3053, term3053.getClass(), "type", -1801760683);
        setField(term3053, term3053.getClass(), "next", term3046);
        setField(term3053, term3053.getClass(), "first", term3048);
        setField(term3053, term3053.getClass(), "last", term3031);
        setField(term3053, term3053.getClass(), "propListHead", null);
        setIntField(term3053, term3053.getClass(), "sourcePosition", 0);
        setField(term3053, term3053.getClass(), "jsType", null);
        setField(term3053, term3053.getClass(), "parent", null);
        setField(term3033, term3033.getClass(), "first", term3053);
        setField(term3033, term3033.getClass(), "last", term3053);
        setField(term3033, term3033.getClass(), "propListHead", null);
        setIntField(term3033, term3033.getClass(), "sourcePosition", 0);
        setField(term3033, term3033.getClass(), "jsType", null);
        setField(term3033, term3033.getClass(), "parent", null);
        setField(term3031, term3031.getClass(), "next", term3033);
        setField(term3031, term3031.getClass(), "first", term3037);
        setField(term3031, term3031.getClass(), "last", term3039);
        setField(term3031, term3031.getClass(), "propListHead", null);
        setIntField(term3031, term3031.getClass(), "sourcePosition", 0);
        setField(term3031, term3031.getClass(), "jsType", null);
        setField(term3031, term3031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3004;
        args[1] = term3031;
        try {
            callMethod(klass, "replaceWithRhs", argTypes, term2942, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


