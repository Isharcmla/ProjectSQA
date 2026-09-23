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

public class TypeInference_traverseReturn_1142297770567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843907;
     Object term1843977;

    public TypeInference_traverseReturn_1142297770567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843907 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1843977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1847967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1844047, term1844047.getClass(), "type", 29);
        setIntField(term1844117, term1844117.getClass(), "type", 29);
        setIntField(term1844187, term1844187.getClass(), "type", 29);
        setIntField(term1844257, term1844257.getClass(), "type", 29);
        setIntField(term1844327, term1844327.getClass(), "type", 29);
        setIntField(term1844397, term1844397.getClass(), "type", 29);
        setIntField(term1844467, term1844467.getClass(), "type", 29);
        setIntField(term1844537, term1844537.getClass(), "type", 29);
        setIntField(term1844607, term1844607.getClass(), "type", 29);
        setIntField(term1844677, term1844677.getClass(), "type", 29);
        setIntField(term1844747, term1844747.getClass(), "type", 29);
        setIntField(term1844817, term1844817.getClass(), "type", 29);
        setIntField(term1844887, term1844887.getClass(), "type", 29);
        setIntField(term1844957, term1844957.getClass(), "type", 29);
        setIntField(term1845027, term1845027.getClass(), "type", 29);
        setIntField(term1845097, term1845097.getClass(), "type", 29);
        setIntField(term1845167, term1845167.getClass(), "type", 29);
        setIntField(term1845237, term1845237.getClass(), "type", 29);
        setIntField(term1845307, term1845307.getClass(), "type", 29);
        setIntField(term1845377, term1845377.getClass(), "type", 29);
        setIntField(term1845447, term1845447.getClass(), "type", 29);
        setIntField(term1845517, term1845517.getClass(), "type", 29);
        setIntField(term1845587, term1845587.getClass(), "type", 29);
        setIntField(term1845657, term1845657.getClass(), "type", 29);
        setIntField(term1845727, term1845727.getClass(), "type", 29);
        setIntField(term1845797, term1845797.getClass(), "type", 29);
        setIntField(term1845867, term1845867.getClass(), "type", 29);
        setIntField(term1845937, term1845937.getClass(), "type", 29);
        setIntField(term1846007, term1846007.getClass(), "type", 29);
        setIntField(term1846077, term1846077.getClass(), "type", 29);
        setIntField(term1846147, term1846147.getClass(), "type", 29);
        setIntField(term1846217, term1846217.getClass(), "type", 29);
        setIntField(term1846287, term1846287.getClass(), "type", 29);
        setIntField(term1846357, term1846357.getClass(), "type", 29);
        setIntField(term1846427, term1846427.getClass(), "type", 29);
        setIntField(term1846497, term1846497.getClass(), "type", 29);
        setIntField(term1846567, term1846567.getClass(), "type", 29);
        setIntField(term1846637, term1846637.getClass(), "type", 29);
        setIntField(term1846707, term1846707.getClass(), "type", 29);
        setIntField(term1846777, term1846777.getClass(), "type", 29);
        setIntField(term1846847, term1846847.getClass(), "type", 29);
        setIntField(term1846917, term1846917.getClass(), "type", 29);
        setIntField(term1846987, term1846987.getClass(), "type", 29);
        setIntField(term1847057, term1847057.getClass(), "type", 29);
        setIntField(term1847127, term1847127.getClass(), "type", 29);
        setIntField(term1847197, term1847197.getClass(), "type", 29);
        setIntField(term1847267, term1847267.getClass(), "type", 29);
        setIntField(term1847337, term1847337.getClass(), "type", 29);
        setIntField(term1847407, term1847407.getClass(), "type", 29);
        setIntField(term1847477, term1847477.getClass(), "type", 29);
        setIntField(term1847547, term1847547.getClass(), "type", 29);
        setIntField(term1847617, term1847617.getClass(), "type", 29);
        setIntField(term1847687, term1847687.getClass(), "type", 29);
        setIntField(term1847757, term1847757.getClass(), "type", 29);
        setIntField(term1847827, term1847827.getClass(), "type", 29);
        setIntField(term1847897, term1847897.getClass(), "type", 29);
        setIntField(term1847967, term1847967.getClass(), "type", 29);
        setIntField(term1848037, term1848037.getClass(), "type", 29);
        setIntField(term1848107, term1848107.getClass(), "type", 29);
        setIntField(term1848177, term1848177.getClass(), "type", 29);
        setIntField(term1848247, term1848247.getClass(), "type", 29);
        setIntField(term1848317, term1848317.getClass(), "type", 29);
        setIntField(term1848387, term1848387.getClass(), "type", 12);
        setField(term1848317, term1848317.getClass(), "first", term1848387);
        setField(term1848247, term1848247.getClass(), "first", term1848317);
        setField(term1848177, term1848177.getClass(), "first", term1848247);
        setField(term1848107, term1848107.getClass(), "first", term1848177);
        setField(term1848037, term1848037.getClass(), "first", term1848107);
        setField(term1847967, term1847967.getClass(), "first", term1848037);
        setField(term1847897, term1847897.getClass(), "first", term1847967);
        setField(term1847827, term1847827.getClass(), "first", term1847897);
        setField(term1847757, term1847757.getClass(), "first", term1847827);
        setField(term1847687, term1847687.getClass(), "first", term1847757);
        setField(term1847617, term1847617.getClass(), "first", term1847687);
        setField(term1847547, term1847547.getClass(), "first", term1847617);
        setField(term1847477, term1847477.getClass(), "first", term1847547);
        setField(term1847407, term1847407.getClass(), "first", term1847477);
        setField(term1847337, term1847337.getClass(), "first", term1847407);
        setField(term1847267, term1847267.getClass(), "first", term1847337);
        setField(term1847197, term1847197.getClass(), "first", term1847267);
        setField(term1847127, term1847127.getClass(), "first", term1847197);
        setField(term1847057, term1847057.getClass(), "first", term1847127);
        setField(term1846987, term1846987.getClass(), "first", term1847057);
        setField(term1846917, term1846917.getClass(), "first", term1846987);
        setField(term1846847, term1846847.getClass(), "first", term1846917);
        setField(term1846777, term1846777.getClass(), "first", term1846847);
        setField(term1846707, term1846707.getClass(), "first", term1846777);
        setField(term1846637, term1846637.getClass(), "first", term1846707);
        setField(term1846567, term1846567.getClass(), "first", term1846637);
        setField(term1846497, term1846497.getClass(), "first", term1846567);
        setField(term1846427, term1846427.getClass(), "first", term1846497);
        setField(term1846357, term1846357.getClass(), "first", term1846427);
        setField(term1846287, term1846287.getClass(), "first", term1846357);
        setField(term1846217, term1846217.getClass(), "first", term1846287);
        setField(term1846147, term1846147.getClass(), "first", term1846217);
        setField(term1846077, term1846077.getClass(), "first", term1846147);
        setField(term1846007, term1846007.getClass(), "first", term1846077);
        setField(term1845937, term1845937.getClass(), "first", term1846007);
        setField(term1845867, term1845867.getClass(), "first", term1845937);
        setField(term1845797, term1845797.getClass(), "first", term1845867);
        setField(term1845727, term1845727.getClass(), "first", term1845797);
        setField(term1845657, term1845657.getClass(), "first", term1845727);
        setField(term1845587, term1845587.getClass(), "first", term1845657);
        setField(term1845517, term1845517.getClass(), "first", term1845587);
        setField(term1845447, term1845447.getClass(), "first", term1845517);
        setField(term1845377, term1845377.getClass(), "first", term1845447);
        setField(term1845307, term1845307.getClass(), "first", term1845377);
        setField(term1845237, term1845237.getClass(), "first", term1845307);
        setField(term1845167, term1845167.getClass(), "first", term1845237);
        setField(term1845097, term1845097.getClass(), "first", term1845167);
        setField(term1845027, term1845027.getClass(), "first", term1845097);
        setField(term1844957, term1844957.getClass(), "first", term1845027);
        setField(term1844887, term1844887.getClass(), "first", term1844957);
        setField(term1844817, term1844817.getClass(), "first", term1844887);
        setField(term1844747, term1844747.getClass(), "first", term1844817);
        setField(term1844677, term1844677.getClass(), "first", term1844747);
        setField(term1844607, term1844607.getClass(), "first", term1844677);
        setField(term1844537, term1844537.getClass(), "first", term1844607);
        setField(term1844467, term1844467.getClass(), "first", term1844537);
        setField(term1844397, term1844397.getClass(), "first", term1844467);
        setField(term1844327, term1844327.getClass(), "first", term1844397);
        setField(term1844257, term1844257.getClass(), "first", term1844327);
        setField(term1844187, term1844187.getClass(), "first", term1844257);
        setField(term1844117, term1844117.getClass(), "first", term1844187);
        setField(term1844047, term1844047.getClass(), "first", term1844117);
        setField(term1843977, term1843977.getClass(), "first", term1844047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1843977;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1843907, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


