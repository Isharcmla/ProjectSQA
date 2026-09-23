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
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1161944;
     Object term1162014;

    public TypeInference_traverseReturn_1142297770430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1161944 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1162014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1165654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1162084, term1162084.getClass(), "type", 29);
        setIntField(term1162154, term1162154.getClass(), "type", 29);
        setIntField(term1162224, term1162224.getClass(), "type", 29);
        setIntField(term1162294, term1162294.getClass(), "type", 29);
        setIntField(term1162364, term1162364.getClass(), "type", 29);
        setIntField(term1162434, term1162434.getClass(), "type", 29);
        setIntField(term1162504, term1162504.getClass(), "type", 29);
        setIntField(term1162574, term1162574.getClass(), "type", 29);
        setIntField(term1162644, term1162644.getClass(), "type", 29);
        setIntField(term1162714, term1162714.getClass(), "type", 29);
        setIntField(term1162784, term1162784.getClass(), "type", 29);
        setIntField(term1162854, term1162854.getClass(), "type", 29);
        setIntField(term1162924, term1162924.getClass(), "type", 29);
        setIntField(term1162994, term1162994.getClass(), "type", 29);
        setIntField(term1163064, term1163064.getClass(), "type", 29);
        setIntField(term1163134, term1163134.getClass(), "type", 29);
        setIntField(term1163204, term1163204.getClass(), "type", 29);
        setIntField(term1163274, term1163274.getClass(), "type", 29);
        setIntField(term1163344, term1163344.getClass(), "type", 29);
        setIntField(term1163414, term1163414.getClass(), "type", 29);
        setIntField(term1163484, term1163484.getClass(), "type", 29);
        setIntField(term1163554, term1163554.getClass(), "type", 29);
        setIntField(term1163624, term1163624.getClass(), "type", 29);
        setIntField(term1163694, term1163694.getClass(), "type", 29);
        setIntField(term1163764, term1163764.getClass(), "type", 29);
        setIntField(term1163834, term1163834.getClass(), "type", 29);
        setIntField(term1163904, term1163904.getClass(), "type", 29);
        setIntField(term1163974, term1163974.getClass(), "type", 29);
        setIntField(term1164044, term1164044.getClass(), "type", 29);
        setIntField(term1164114, term1164114.getClass(), "type", 29);
        setIntField(term1164184, term1164184.getClass(), "type", 29);
        setIntField(term1164254, term1164254.getClass(), "type", 29);
        setIntField(term1164324, term1164324.getClass(), "type", 29);
        setIntField(term1164394, term1164394.getClass(), "type", 29);
        setIntField(term1164464, term1164464.getClass(), "type", 29);
        setIntField(term1164534, term1164534.getClass(), "type", 29);
        setIntField(term1164604, term1164604.getClass(), "type", 29);
        setIntField(term1164674, term1164674.getClass(), "type", 29);
        setIntField(term1164744, term1164744.getClass(), "type", 29);
        setIntField(term1164814, term1164814.getClass(), "type", 29);
        setIntField(term1164884, term1164884.getClass(), "type", 29);
        setIntField(term1164954, term1164954.getClass(), "type", 29);
        setIntField(term1165024, term1165024.getClass(), "type", 29);
        setIntField(term1165094, term1165094.getClass(), "type", 29);
        setIntField(term1165164, term1165164.getClass(), "type", 29);
        setIntField(term1165234, term1165234.getClass(), "type", 29);
        setIntField(term1165304, term1165304.getClass(), "type", 29);
        setIntField(term1165374, term1165374.getClass(), "type", 29);
        setIntField(term1165444, term1165444.getClass(), "type", 29);
        setIntField(term1165514, term1165514.getClass(), "type", 29);
        setIntField(term1165584, term1165584.getClass(), "type", 29);
        setIntField(term1165654, term1165654.getClass(), "type", 54);
        setField(term1165584, term1165584.getClass(), "first", term1165654);
        setField(term1165514, term1165514.getClass(), "first", term1165584);
        setField(term1165444, term1165444.getClass(), "first", term1165514);
        setField(term1165374, term1165374.getClass(), "first", term1165444);
        setField(term1165304, term1165304.getClass(), "first", term1165374);
        setField(term1165234, term1165234.getClass(), "first", term1165304);
        setField(term1165164, term1165164.getClass(), "first", term1165234);
        setField(term1165094, term1165094.getClass(), "first", term1165164);
        setField(term1165024, term1165024.getClass(), "first", term1165094);
        setField(term1164954, term1164954.getClass(), "first", term1165024);
        setField(term1164884, term1164884.getClass(), "first", term1164954);
        setField(term1164814, term1164814.getClass(), "first", term1164884);
        setField(term1164744, term1164744.getClass(), "first", term1164814);
        setField(term1164674, term1164674.getClass(), "first", term1164744);
        setField(term1164604, term1164604.getClass(), "first", term1164674);
        setField(term1164534, term1164534.getClass(), "first", term1164604);
        setField(term1164464, term1164464.getClass(), "first", term1164534);
        setField(term1164394, term1164394.getClass(), "first", term1164464);
        setField(term1164324, term1164324.getClass(), "first", term1164394);
        setField(term1164254, term1164254.getClass(), "first", term1164324);
        setField(term1164184, term1164184.getClass(), "first", term1164254);
        setField(term1164114, term1164114.getClass(), "first", term1164184);
        setField(term1164044, term1164044.getClass(), "first", term1164114);
        setField(term1163974, term1163974.getClass(), "first", term1164044);
        setField(term1163904, term1163904.getClass(), "first", term1163974);
        setField(term1163834, term1163834.getClass(), "first", term1163904);
        setField(term1163764, term1163764.getClass(), "first", term1163834);
        setField(term1163694, term1163694.getClass(), "first", term1163764);
        setField(term1163624, term1163624.getClass(), "first", term1163694);
        setField(term1163554, term1163554.getClass(), "first", term1163624);
        setField(term1163484, term1163484.getClass(), "first", term1163554);
        setField(term1163414, term1163414.getClass(), "first", term1163484);
        setField(term1163344, term1163344.getClass(), "first", term1163414);
        setField(term1163274, term1163274.getClass(), "first", term1163344);
        setField(term1163204, term1163204.getClass(), "first", term1163274);
        setField(term1163134, term1163134.getClass(), "first", term1163204);
        setField(term1163064, term1163064.getClass(), "first", term1163134);
        setField(term1162994, term1162994.getClass(), "first", term1163064);
        setField(term1162924, term1162924.getClass(), "first", term1162994);
        setField(term1162854, term1162854.getClass(), "first", term1162924);
        setField(term1162784, term1162784.getClass(), "first", term1162854);
        setField(term1162714, term1162714.getClass(), "first", term1162784);
        setField(term1162644, term1162644.getClass(), "first", term1162714);
        setField(term1162574, term1162574.getClass(), "first", term1162644);
        setField(term1162504, term1162504.getClass(), "first", term1162574);
        setField(term1162434, term1162434.getClass(), "first", term1162504);
        setField(term1162364, term1162364.getClass(), "first", term1162434);
        setField(term1162294, term1162294.getClass(), "first", term1162364);
        setField(term1162224, term1162224.getClass(), "first", term1162294);
        setField(term1162154, term1162154.getClass(), "first", term1162224);
        setField(term1162084, term1162084.getClass(), "first", term1162154);
        setField(term1162014, term1162014.getClass(), "first", term1162084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1162014;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1161944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


