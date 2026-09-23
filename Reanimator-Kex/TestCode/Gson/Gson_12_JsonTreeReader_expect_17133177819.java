package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JsonTreeReader_expect_17133177819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843;
     Object enum0;

    public JsonTreeReader_expect_17133177819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term1844 = (Object[]) newArray("java.lang.Object", 7);
        Object term1845 = newInstance(Class.forName("java.lang.Object"));
        Object term1846 = newInstance(Class.forName("java.lang.Object"));
        Object term1847 = newInstance(Class.forName("java.lang.Object"));
        Object term1848 = newInstance(Class.forName("java.lang.Object"));
        Object term1849 = newInstance(Class.forName("java.lang.Object"));
        Object term1850 = newInstance(Class.forName("java.lang.Object"));
        Object term1851 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1924 = (Object[]) newArray("java.lang.String", 7);
        int[] term2009 = (int[]) newIntArray(9);
        char[] term1889 = (char[]) newCharArray(7);
        int[] term1916 = (int[]) newIntArray(6);
        setElement(term1844, 0, term1845);
        setElement(term1844, 1, term1846);
        setElement(term1844, 2, term1847);
        setElement(term1844, 3, term1848);
        setElement(term1844, 4, term1849);
        setElement(term1844, 5, term1850);
        setElement(term1844, 6, term1851);
        setField(term1843, term1843.getClass(), "stack", term1844);
        setIntField(term1843, term1843.getClass(), "stackSize", -1222614956);
        setElement(term1924, 0, "bWWfajKbEX");
        setElement(term1924, 1, "cAPeiZHKGJ");
        setElement(term1924, 2, "LvJFtLBaxj");
        setElement(term1924, 3, "PHvxnGHptP");
        setElement(term1924, 4, "TimdotUuNC");
        setElement(term1924, 5, "PkWMRdJcBb");
        setElement(term1924, 6, "jSpAteRute");
        setField(term1843, term1843.getClass(), "pathNames", term1924);
        setIntElement(term2009, 0, -1870495012);
        setIntElement(term2009, 1, -1310015129);
        setIntElement(term2009, 2, -2104981311);
        setIntElement(term2009, 3, -571169753);
        setIntElement(term2009, 4, 318591690);
        setIntElement(term2009, 5, -165587447);
        setIntElement(term2009, 6, -1347358701);
        setIntElement(term2009, 7, 806595993);
        setIntElement(term2009, 8, 548228925);
        setField(term1843, term1843.getClass(), "pathIndices", term2009);
        setField(term1843, term1843.getClass(), "in", null);
        setBooleanField(term1843, term1843.getClass(), "lenient", false);
        setCharElement(term1889, 0, 'q');
        setCharElement(term1889, 1, 'z');
        setCharElement(term1889, 2, 'x');
        setCharElement(term1889, 3, 'x');
        setCharElement(term1889, 4, 't');
        setCharElement(term1889, 5, 'l');
        setCharElement(term1889, 6, 'P');
        setField(term1843, term1843.getClass(), "buffer", term1889);
        setIntField(term1843, term1843.getClass(), "pos", 584893196);
        setIntField(term1843, term1843.getClass(), "limit", 497269071);
        setIntField(term1843, term1843.getClass(), "lineNumber", -1899301124);
        setIntField(term1843, term1843.getClass(), "lineStart", -1882480155);
        setIntField(term1843, term1843.getClass(), "peeked", -1410220680);
        setLongField(term1843, term1843.getClass(), "peekedLong", -7237588299778557629L);
        setIntField(term1843, term1843.getClass(), "peekedNumberLength", 389427431);
        setField(term1843, term1843.getClass(), "peekedString", "jUbSRrkrYZ");
        setIntElement(term1916, 0, -1945706126);
        setIntElement(term1916, 1, 1152356969);
        setIntElement(term1916, 2, -1667990367);
        setIntElement(term1916, 3, -1214628358);
        setIntElement(term1916, 4, 1102721075);
        setIntElement(term1916, 5, -426764678);
        setField(term1843, term1843.getClass(), "stack", term1916);
        Class<? extends Object> term2254 = Class.forName((String) "com.google.gson.stream.JsonToken");
        Field term2253 = ((Class) term2254).getDeclaredField((String) "BOOLEAN");
        ((Field) term2253).setAccessible(true);
        enum0 = ((Field) term2253).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonToken");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "expect", argTypes, term1843, args);
    }

};


