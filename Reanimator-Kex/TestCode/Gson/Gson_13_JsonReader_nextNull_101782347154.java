package com.google.gson.stream;

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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_nextNull_101782347154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2453;

    public JsonReader_nextNull_101782347154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2453 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2455 = (char[]) newCharArray(6);
        int[] term2481 = (int[]) newIntArray(7);
        Object[] term2490 = (Object[]) newArray("java.lang.String", 9);
        int[] term2599 = (int[]) newIntArray(7);
        setField(term2453, term2453.getClass(), "in", null);
        setBooleanField(term2453, term2453.getClass(), "lenient", true);
        setCharElement(term2455, 0, 'M');
        setCharElement(term2455, 1, 'j');
        setCharElement(term2455, 2, 'G');
        setCharElement(term2455, 3, 'Y');
        setCharElement(term2455, 4, 'S');
        setCharElement(term2455, 5, 'R');
        setField(term2453, term2453.getClass(), "buffer", term2455);
        setIntField(term2453, term2453.getClass(), "pos", 2058711405);
        setIntField(term2453, term2453.getClass(), "limit", 1743683601);
        setIntField(term2453, term2453.getClass(), "lineNumber", -945116798);
        setIntField(term2453, term2453.getClass(), "lineStart", 1593461795);
        setIntField(term2453, term2453.getClass(), "peeked", 515182546);
        setLongField(term2453, term2453.getClass(), "peekedLong", -872011222785455006L);
        setIntField(term2453, term2453.getClass(), "peekedNumberLength", -936895502);
        setField(term2453, term2453.getClass(), "peekedString", "cAPeiZHKGJ");
        setIntElement(term2481, 0, -129547140);
        setIntElement(term2481, 1, 199287428);
        setIntElement(term2481, 2, -1195339592);
        setIntElement(term2481, 3, -376422566);
        setIntElement(term2481, 4, 306847454);
        setIntElement(term2481, 5, 1745276158);
        setIntElement(term2481, 6, 2009020256);
        setField(term2453, term2453.getClass(), "stack", term2481);
        setIntField(term2453, term2453.getClass(), "stackSize", 2049577015);
        setElement(term2490, 0, "LvJFtLBaxj");
        setElement(term2490, 1, "PHvxnGHptP");
        setElement(term2490, 2, "TimdotUuNC");
        setElement(term2490, 3, "PkWMRdJcBb");
        setElement(term2490, 4, "jSpAteRute");
        setElement(term2490, 5, "swZVeJAxjt");
        setElement(term2490, 6, "xOcJIiQQDu");
        setElement(term2490, 7, "GVizqqzXpy");
        setElement(term2490, 8, "JqXGgAhZPl");
        setField(term2453, term2453.getClass(), "pathNames", term2490);
        setIntElement(term2599, 0, 1236004505);
        setIntElement(term2599, 1, 1050765721);
        setIntElement(term2599, 2, 474518942);
        setIntElement(term2599, 3, -1656687479);
        setIntElement(term2599, 4, -249614216);
        setIntElement(term2599, 5, 1870727665);
        setIntElement(term2599, 6, -519881101);
        setField(term2453, term2453.getClass(), "pathIndices", term2599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNull", argTypes, term2453, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


