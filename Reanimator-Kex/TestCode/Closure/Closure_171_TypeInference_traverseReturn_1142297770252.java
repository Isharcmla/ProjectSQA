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

public class TypeInference_traverseReturn_1142297770252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292876;
     Object term292946;

    public TypeInference_traverseReturn_1142297770252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292876 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term292946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term293016, term293016.getClass(), "type", 92);
        setIntField(term293086, term293086.getClass(), "type", 92);
        setIntField(term293156, term293156.getClass(), "type", 92);
        setIntField(term293226, term293226.getClass(), "type", 92);
        setIntField(term293296, term293296.getClass(), "type", 92);
        setIntField(term293366, term293366.getClass(), "type", 92);
        setIntField(term293436, term293436.getClass(), "type", 92);
        setIntField(term293506, term293506.getClass(), "type", 92);
        setIntField(term293576, term293576.getClass(), "type", 92);
        setIntField(term293646, term293646.getClass(), "type", 92);
        setIntField(term293716, term293716.getClass(), "type", 92);
        setIntField(term293786, term293786.getClass(), "type", 92);
        setIntField(term293856, term293856.getClass(), "type", 92);
        setIntField(term293926, term293926.getClass(), "type", 92);
        setIntField(term293996, term293996.getClass(), "type", 92);
        setIntField(term294066, term294066.getClass(), "type", 92);
        setIntField(term294136, term294136.getClass(), "type", 92);
        setIntField(term294206, term294206.getClass(), "type", 92);
        setIntField(term294276, term294276.getClass(), "type", 92);
        setIntField(term294346, term294346.getClass(), "type", 92);
        setIntField(term294416, term294416.getClass(), "type", 92);
        setIntField(term294486, term294486.getClass(), "type", 92);
        setIntField(term294556, term294556.getClass(), "type", 92);
        setIntField(term294626, term294626.getClass(), "type", 92);
        setIntField(term294696, term294696.getClass(), "type", 92);
        setIntField(term294766, term294766.getClass(), "type", 92);
        setIntField(term294836, term294836.getClass(), "type", 92);
        setIntField(term294906, term294906.getClass(), "type", 92);
        setIntField(term294976, term294976.getClass(), "type", 92);
        setIntField(term295046, term295046.getClass(), "type", 92);
        setIntField(term295116, term295116.getClass(), "type", 92);
        setIntField(term295186, term295186.getClass(), "type", 92);
        setIntField(term295256, term295256.getClass(), "type", 92);
        setIntField(term295326, term295326.getClass(), "type", 92);
        setIntField(term295396, term295396.getClass(), "type", 92);
        setIntField(term295466, term295466.getClass(), "type", 92);
        setIntField(term295536, term295536.getClass(), "type", 92);
        setIntField(term295606, term295606.getClass(), "type", 92);
        setIntField(term295676, term295676.getClass(), "type", 92);
        setIntField(term295746, term295746.getClass(), "type", 92);
        setIntField(term295816, term295816.getClass(), "type", 92);
        setIntField(term295886, term295886.getClass(), "type", 92);
        setIntField(term295956, term295956.getClass(), "type", 92);
        setIntField(term296026, term296026.getClass(), "type", 92);
        setIntField(term296096, term296096.getClass(), "type", 92);
        setIntField(term296166, term296166.getClass(), "type", 92);
        setIntField(term296236, term296236.getClass(), "type", 92);
        setIntField(term296306, term296306.getClass(), "type", 92);
        setIntField(term296376, term296376.getClass(), "type", 92);
        setIntField(term296446, term296446.getClass(), "type", 92);
        setIntField(term296516, term296516.getClass(), "type", 92);
        setIntField(term296586, term296586.getClass(), "type", 92);
        setIntField(term296656, term296656.getClass(), "type", 92);
        setIntField(term296726, term296726.getClass(), "type", 92);
        setIntField(term296796, term296796.getClass(), "type", 92);
        setIntField(term296866, term296866.getClass(), "type", 92);
        setIntField(term296936, term296936.getClass(), "type", 92);
        setIntField(term297006, term297006.getClass(), "type", 92);
        setIntField(term297076, term297076.getClass(), "type", 92);
        setIntField(term297146, term297146.getClass(), "type", 92);
        setIntField(term297216, term297216.getClass(), "type", 92);
        setIntField(term297286, term297286.getClass(), "type", 130);
        setField(term297216, term297216.getClass(), "first", term297286);
        setField(term297146, term297146.getClass(), "first", term297216);
        setField(term297076, term297076.getClass(), "first", term297146);
        setField(term297006, term297006.getClass(), "first", term297076);
        setField(term296936, term296936.getClass(), "first", term297006);
        setField(term296866, term296866.getClass(), "first", term296936);
        setField(term296796, term296796.getClass(), "first", term296866);
        setField(term296726, term296726.getClass(), "first", term296796);
        setField(term296656, term296656.getClass(), "first", term296726);
        setField(term296586, term296586.getClass(), "first", term296656);
        setField(term296516, term296516.getClass(), "first", term296586);
        setField(term296446, term296446.getClass(), "first", term296516);
        setField(term296376, term296376.getClass(), "first", term296446);
        setField(term296306, term296306.getClass(), "first", term296376);
        setField(term296236, term296236.getClass(), "first", term296306);
        setField(term296166, term296166.getClass(), "first", term296236);
        setField(term296096, term296096.getClass(), "first", term296166);
        setField(term296026, term296026.getClass(), "first", term296096);
        setField(term295956, term295956.getClass(), "first", term296026);
        setField(term295886, term295886.getClass(), "first", term295956);
        setField(term295816, term295816.getClass(), "first", term295886);
        setField(term295746, term295746.getClass(), "first", term295816);
        setField(term295676, term295676.getClass(), "first", term295746);
        setField(term295606, term295606.getClass(), "first", term295676);
        setField(term295536, term295536.getClass(), "first", term295606);
        setField(term295466, term295466.getClass(), "first", term295536);
        setField(term295396, term295396.getClass(), "first", term295466);
        setField(term295326, term295326.getClass(), "first", term295396);
        setField(term295256, term295256.getClass(), "first", term295326);
        setField(term295186, term295186.getClass(), "first", term295256);
        setField(term295116, term295116.getClass(), "first", term295186);
        setField(term295046, term295046.getClass(), "first", term295116);
        setField(term294976, term294976.getClass(), "first", term295046);
        setField(term294906, term294906.getClass(), "first", term294976);
        setField(term294836, term294836.getClass(), "first", term294906);
        setField(term294766, term294766.getClass(), "first", term294836);
        setField(term294696, term294696.getClass(), "first", term294766);
        setField(term294626, term294626.getClass(), "first", term294696);
        setField(term294556, term294556.getClass(), "first", term294626);
        setField(term294486, term294486.getClass(), "first", term294556);
        setField(term294416, term294416.getClass(), "first", term294486);
        setField(term294346, term294346.getClass(), "first", term294416);
        setField(term294276, term294276.getClass(), "first", term294346);
        setField(term294206, term294206.getClass(), "first", term294276);
        setField(term294136, term294136.getClass(), "first", term294206);
        setField(term294066, term294066.getClass(), "first", term294136);
        setField(term293996, term293996.getClass(), "first", term294066);
        setField(term293926, term293926.getClass(), "first", term293996);
        setField(term293856, term293856.getClass(), "first", term293926);
        setField(term293786, term293786.getClass(), "first", term293856);
        setField(term293716, term293716.getClass(), "first", term293786);
        setField(term293646, term293646.getClass(), "first", term293716);
        setField(term293576, term293576.getClass(), "first", term293646);
        setField(term293506, term293506.getClass(), "first", term293576);
        setField(term293436, term293436.getClass(), "first", term293506);
        setField(term293366, term293366.getClass(), "first", term293436);
        setField(term293296, term293296.getClass(), "first", term293366);
        setField(term293226, term293226.getClass(), "first", term293296);
        setField(term293156, term293156.getClass(), "first", term293226);
        setField(term293086, term293086.getClass(), "first", term293156);
        setField(term293016, term293016.getClass(), "first", term293086);
        setField(term292946, term292946.getClass(), "first", term293016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term292946;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term292876, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


