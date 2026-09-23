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

public class TypeInference_traverseChildren_1478920219258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452671;
     Object term452741;

    public TypeInference_traverseChildren_1478920219258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452671 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term452741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term454911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term452811, term452811.getClass(), "type", 18);
        setIntField(term452881, term452881.getClass(), "type", 18);
        setIntField(term452951, term452951.getClass(), "type", 18);
        setIntField(term453021, term453021.getClass(), "type", 18);
        setIntField(term453091, term453091.getClass(), "type", 18);
        setIntField(term453161, term453161.getClass(), "type", 18);
        setIntField(term453231, term453231.getClass(), "type", 18);
        setIntField(term453301, term453301.getClass(), "type", 18);
        setIntField(term453371, term453371.getClass(), "type", 18);
        setIntField(term453441, term453441.getClass(), "type", 18);
        setIntField(term453511, term453511.getClass(), "type", 18);
        setIntField(term453581, term453581.getClass(), "type", 18);
        setIntField(term453651, term453651.getClass(), "type", 18);
        setIntField(term453721, term453721.getClass(), "type", 18);
        setIntField(term453791, term453791.getClass(), "type", 18);
        setIntField(term453861, term453861.getClass(), "type", 18);
        setIntField(term453931, term453931.getClass(), "type", 18);
        setIntField(term454001, term454001.getClass(), "type", 18);
        setIntField(term454071, term454071.getClass(), "type", 18);
        setIntField(term454141, term454141.getClass(), "type", 18);
        setIntField(term454211, term454211.getClass(), "type", 18);
        setIntField(term454281, term454281.getClass(), "type", 18);
        setIntField(term454351, term454351.getClass(), "type", 18);
        setIntField(term454421, term454421.getClass(), "type", 18);
        setIntField(term454491, term454491.getClass(), "type", 18);
        setIntField(term454561, term454561.getClass(), "type", 18);
        setIntField(term454631, term454631.getClass(), "type", 18);
        setIntField(term454701, term454701.getClass(), "type", 18);
        setIntField(term454771, term454771.getClass(), "type", 18);
        setIntField(term454841, term454841.getClass(), "type", 18);
        setIntField(term454911, term454911.getClass(), "type", 18);
        setField(term454911, term454911.getClass(), "first", term452741);
        setField(term454841, term454841.getClass(), "first", term454911);
        setField(term454771, term454771.getClass(), "first", term454841);
        setField(term454701, term454701.getClass(), "first", term454771);
        setField(term454631, term454631.getClass(), "first", term454701);
        setField(term454561, term454561.getClass(), "first", term454631);
        setField(term454491, term454491.getClass(), "first", term454561);
        setField(term454421, term454421.getClass(), "first", term454491);
        setField(term454351, term454351.getClass(), "first", term454421);
        setField(term454281, term454281.getClass(), "first", term454351);
        setField(term454211, term454211.getClass(), "first", term454281);
        setField(term454141, term454141.getClass(), "first", term454211);
        setField(term454071, term454071.getClass(), "first", term454141);
        setField(term454001, term454001.getClass(), "first", term454071);
        setField(term453931, term453931.getClass(), "first", term454001);
        setField(term453861, term453861.getClass(), "first", term453931);
        setField(term453791, term453791.getClass(), "first", term453861);
        setField(term453721, term453721.getClass(), "first", term453791);
        setField(term453651, term453651.getClass(), "first", term453721);
        setField(term453581, term453581.getClass(), "first", term453651);
        setField(term453511, term453511.getClass(), "first", term453581);
        setField(term453441, term453441.getClass(), "first", term453511);
        setField(term453371, term453371.getClass(), "first", term453441);
        setField(term453301, term453301.getClass(), "first", term453371);
        setField(term453231, term453231.getClass(), "first", term453301);
        setField(term453161, term453161.getClass(), "first", term453231);
        setField(term453091, term453091.getClass(), "first", term453161);
        setField(term453021, term453021.getClass(), "first", term453091);
        setField(term452951, term452951.getClass(), "first", term453021);
        setField(term452881, term452881.getClass(), "first", term452951);
        setField(term452811, term452811.getClass(), "first", term452881);
        setField(term452741, term452741.getClass(), "first", term452811);
        setIntField(term452741, term452741.getClass(), "type", 43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term452741;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term452671, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


