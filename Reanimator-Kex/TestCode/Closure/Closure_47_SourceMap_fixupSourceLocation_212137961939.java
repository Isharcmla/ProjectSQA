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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class SourceMap_fixupSourceLocation_212137961939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19369;
     Object term25847;

    public SourceMap_fixupSourceLocation_212137961939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19535 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term19535, term19535.getClass(), "prefix", "                                                                                                                                                                                                                                                                         ");
        Object term19687 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term19687, term19687.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        Object term19839 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term19839, term19839.getClass(), "prefix", "                                                                                                                                                                                                                                                                         ");
        Object term19991 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term19991, term19991.getClass(), "prefix", "                                                                                                                                                                                                                                                                    ");
        Object term20143 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20143, term20143.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        Object term20295 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20295, term20295.getClass(), "prefix", "                                                                                                                                                                                                                                                                         ");
        Object term20447 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20447, term20447.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                            ");
        Object term20599 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20599, term20599.getClass(), "prefix", "                                                                                                                                                                                                                                                 ");
        Object term20751 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20751, term20751.getClass(), "prefix", "                                                                                                                                                                                                                                                                         ");
        Object term20903 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term20903, term20903.getClass(), "prefix", "                                                                                                                                                                                                                                                                         ");
        Object term21055 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term21055, term21055.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        Object term21207 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term21207, term21207.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                            ");
        Object term21359 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term21359, term21359.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        ArrayList term19421 = new ArrayList();
        ((ArrayList) term19421).add(term19535);
        ((ArrayList) term19421).add(term19687);
        ((ArrayList) term19421).add(term19839);
        ((ArrayList) term19421).add(term19991);
        ((ArrayList) term19421).add(term20143);
        ((ArrayList) term19421).add(term20295);
        ((ArrayList) term19421).add(term20447);
        ((ArrayList) term19421).add(term20599);
        ((ArrayList) term19421).add(term20751);
        ((ArrayList) term19421).add(term20903);
        ((ArrayList) term19421).add(term21055);
        ((ArrayList) term19421).add(term21207);
        ((ArrayList) term19421).add(term21359);
        HashMap term21407 = new HashMap();
        ((HashMap) term21407).put("                                                                                                                                                                                                                                                                         ", "                                                                                                                                                                                                                                                                         ");
        ((HashMap) term21407).put("                                                                                                                                                                                                                                                                         ", "                                                                                                                                                                                                                                                                         ");
        term19369 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term19369, term19369.getClass(), "prefixMappings", term19421);
        setField(term19369, term19369.getClass(), "sourceLocationFixupCache", term21407);
        Object term25850 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25850, term25850.getClass(), "prefix", "");
        setField(term25850, term25850.getClass(), "replacement", null);
        Object term25852 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25852, term25852.getClass(), "prefix", "");
        setField(term25852, term25852.getClass(), "replacement", null);
        Object term25854 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25854, term25854.getClass(), "prefix", "");
        setField(term25854, term25854.getClass(), "replacement", null);
        Object term25856 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25856, term25856.getClass(), "prefix", "");
        setField(term25856, term25856.getClass(), "replacement", null);
        Object term25858 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25858, term25858.getClass(), "prefix", "");
        setField(term25858, term25858.getClass(), "replacement", null);
        Object term25860 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25860, term25860.getClass(), "prefix", "");
        setField(term25860, term25860.getClass(), "replacement", null);
        Object term25862 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25862, term25862.getClass(), "prefix", "");
        setField(term25862, term25862.getClass(), "replacement", null);
        Object term25864 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25864, term25864.getClass(), "prefix", "");
        setField(term25864, term25864.getClass(), "replacement", null);
        Object term25866 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25866, term25866.getClass(), "prefix", "");
        setField(term25866, term25866.getClass(), "replacement", null);
        Object term25868 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25868, term25868.getClass(), "prefix", "");
        setField(term25868, term25868.getClass(), "replacement", null);
        Object term25870 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25870, term25870.getClass(), "prefix", "");
        setField(term25870, term25870.getClass(), "replacement", null);
        Object term25872 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25872, term25872.getClass(), "prefix", "");
        setField(term25872, term25872.getClass(), "replacement", null);
        Object term25874 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term25874, term25874.getClass(), "prefix", "");
        setField(term25874, term25874.getClass(), "replacement", null);
        ArrayList term25848 = new ArrayList();
        ((ArrayList) term25848).add(term25850);
        ((ArrayList) term25848).add(term25852);
        ((ArrayList) term25848).add(term25854);
        ((ArrayList) term25848).add(term25856);
        ((ArrayList) term25848).add(term25858);
        ((ArrayList) term25848).add(term25860);
        ((ArrayList) term25848).add(term25862);
        ((ArrayList) term25848).add(term25864);
        ((ArrayList) term25848).add(term25866);
        ((ArrayList) term25848).add(term25868);
        ((ArrayList) term25848).add(term25870);
        ((ArrayList) term25848).add(term25872);
        ((ArrayList) term25848).add(term25874);
        HashMap term25876 = new HashMap();
        term25847 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term25847, term25847.getClass(), "generator", null);
        setField(term25847, term25847.getClass(), "prefixMappings", term25848);
        setField(term25847, term25847.getClass(), "sourceLocationFixupCache", term25876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "        \u0004                                                                                                                                                                                                                                                       ";
        Object retValue = callMethod(klass, "fixupSourceLocation", argTypes, term19369, args);
        assertTrue(recursiveEquals(term19369, term25847));
        assertTrue(recursiveEquals(retValue, "        \u0004                                                                                                                                                                                                                                                       "));
    }

};


