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
import java.lang.Object;

public class DisambiguateProperties_process_49726452914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term196;
     Object term223;

    public DisambiguateProperties_process_49726452914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term185 = new HashMap();
        term184 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term184, term184.getClass(), "compiler", null);
        setField(term184, term184.getClass(), "typeSystem", null);
        setField(term184, term184.getClass(), "invalidationMap", null);
        setField(term184, term184.getClass(), "propertiesToErrorFor", term185);
        setField(term184, term184.getClass(), "properties", null);
        term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term196, term196.getClass(), "type", 1227103734);
        setIntField(term198, term198.getClass(), "type", -1339778481);
        setIntField(term200, term200.getClass(), "type", 1725571209);
        setIntField(term202, term202.getClass(), "type", -522618178);
        setIntField(term204, term204.getClass(), "type", 1134449235);
        setField(term204, term204.getClass(), "next", null);
        setField(term204, term204.getClass(), "first", null);
        setField(term204, term204.getClass(), "last", null);
        setField(term204, term204.getClass(), "propListHead", null);
        setIntField(term204, term204.getClass(), "sourcePosition", 0);
        setField(term204, term204.getClass(), "jsType", null);
        setField(term204, term204.getClass(), "parent", null);
        setField(term202, term202.getClass(), "next", term204);
        setIntField(term207, term207.getClass(), "type", -883034806);
        setField(term207, term207.getClass(), "next", null);
        setField(term207, term207.getClass(), "first", null);
        setField(term207, term207.getClass(), "last", term204);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term202, term202.getClass(), "first", term207);
        setField(term202, term202.getClass(), "last", term200);
        setField(term202, term202.getClass(), "propListHead", null);
        setIntField(term202, term202.getClass(), "sourcePosition", 0);
        setField(term202, term202.getClass(), "jsType", null);
        setField(term202, term202.getClass(), "parent", null);
        setField(term200, term200.getClass(), "next", term202);
        setField(term200, term200.getClass(), "first", term204);
        setIntField(term211, term211.getClass(), "type", 597278769);
        setIntField(term213, term213.getClass(), "type", -1685132342);
        setField(term213, term213.getClass(), "next", null);
        setField(term213, term213.getClass(), "first", term207);
        setField(term213, term213.getClass(), "last", term202);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term211, term211.getClass(), "next", term213);
        setField(term211, term211.getClass(), "first", term198);
        setField(term211, term211.getClass(), "last", term198);
        setField(term211, term211.getClass(), "propListHead", null);
        setIntField(term211, term211.getClass(), "sourcePosition", 0);
        setField(term211, term211.getClass(), "jsType", null);
        setField(term211, term211.getClass(), "parent", null);
        setField(term200, term200.getClass(), "last", term211);
        setField(term200, term200.getClass(), "propListHead", null);
        setIntField(term200, term200.getClass(), "sourcePosition", 0);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term198, term198.getClass(), "next", term200);
        setIntField(term218, term218.getClass(), "type", -1456670397);
        setField(term218, term218.getClass(), "next", term211);
        setField(term218, term218.getClass(), "first", term213);
        setField(term218, term218.getClass(), "last", term196);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        setField(term198, term198.getClass(), "first", term218);
        setField(term198, term198.getClass(), "last", term218);
        setField(term198, term198.getClass(), "propListHead", null);
        setIntField(term198, term198.getClass(), "sourcePosition", 0);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term196, term196.getClass(), "next", term198);
        setField(term196, term196.getClass(), "first", term202);
        setField(term196, term196.getClass(), "last", term204);
        setField(term196, term196.getClass(), "propListHead", null);
        setIntField(term196, term196.getClass(), "sourcePosition", 0);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
        term223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223, term223.getClass(), "type", 1622346318);
        setIntField(term225, term225.getClass(), "type", 1048535127);
        setIntField(term227, term227.getClass(), "type", -655067527);
        setIntField(term229, term229.getClass(), "type", -6029667);
        setIntField(term231, term231.getClass(), "type", -2068769794);
        setField(term231, term231.getClass(), "next", null);
        setField(term231, term231.getClass(), "first", null);
        setField(term231, term231.getClass(), "last", null);
        setField(term231, term231.getClass(), "propListHead", null);
        setIntField(term231, term231.getClass(), "sourcePosition", 0);
        setField(term231, term231.getClass(), "jsType", null);
        setField(term231, term231.getClass(), "parent", null);
        setField(term229, term229.getClass(), "next", term231);
        setIntField(term234, term234.getClass(), "type", -117576464);
        setField(term234, term234.getClass(), "next", null);
        setField(term234, term234.getClass(), "first", null);
        setField(term234, term234.getClass(), "last", term231);
        setField(term234, term234.getClass(), "propListHead", null);
        setIntField(term234, term234.getClass(), "sourcePosition", 0);
        setField(term234, term234.getClass(), "jsType", null);
        setField(term234, term234.getClass(), "parent", null);
        setField(term229, term229.getClass(), "first", term234);
        setField(term229, term229.getClass(), "last", term227);
        setField(term229, term229.getClass(), "propListHead", null);
        setIntField(term229, term229.getClass(), "sourcePosition", 0);
        setField(term229, term229.getClass(), "jsType", null);
        setField(term229, term229.getClass(), "parent", null);
        setField(term227, term227.getClass(), "next", term229);
        setField(term227, term227.getClass(), "first", term231);
        setIntField(term238, term238.getClass(), "type", 1135664017);
        setIntField(term240, term240.getClass(), "type", 590364439);
        setField(term240, term240.getClass(), "next", null);
        setField(term240, term240.getClass(), "first", term234);
        setField(term240, term240.getClass(), "last", term229);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term238, term238.getClass(), "next", term240);
        setField(term238, term238.getClass(), "first", term225);
        setField(term238, term238.getClass(), "last", term225);
        setField(term238, term238.getClass(), "propListHead", null);
        setIntField(term238, term238.getClass(), "sourcePosition", 0);
        setField(term238, term238.getClass(), "jsType", null);
        setField(term238, term238.getClass(), "parent", null);
        setField(term227, term227.getClass(), "last", term238);
        setField(term227, term227.getClass(), "propListHead", null);
        setIntField(term227, term227.getClass(), "sourcePosition", 0);
        setField(term227, term227.getClass(), "jsType", null);
        setField(term227, term227.getClass(), "parent", null);
        setField(term225, term225.getClass(), "next", term227);
        setIntField(term245, term245.getClass(), "type", 865208305);
        setField(term245, term245.getClass(), "next", term238);
        setField(term245, term245.getClass(), "first", term240);
        setField(term245, term245.getClass(), "last", term223);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term225, term225.getClass(), "first", term245);
        setField(term225, term225.getClass(), "last", term245);
        setField(term225, term225.getClass(), "propListHead", null);
        setIntField(term225, term225.getClass(), "sourcePosition", 0);
        setField(term225, term225.getClass(), "jsType", null);
        setField(term225, term225.getClass(), "parent", null);
        setField(term223, term223.getClass(), "next", term225);
        setField(term223, term223.getClass(), "first", term229);
        setField(term223, term223.getClass(), "last", term231);
        setField(term223, term223.getClass(), "propListHead", null);
        setIntField(term223, term223.getClass(), "sourcePosition", 0);
        setField(term223, term223.getClass(), "jsType", null);
        setField(term223, term223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term196;
        args[1] = term223;
        try {
            callMethod(klass, "process", argTypes, term184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


