package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Integer;

public class StringUtil_isActuallyWhitespace_109033991237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2032;
     Object term2033;
     Object term2044;

    public StringUtil_isActuallyWhitespace_109033991237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2032 = newInstance(Class.forName("org.jsoup.helper.StringUtil"));
        term2033 = new Integer(0);
        term2044 = (int[]) newIntArray(32);
        setIntElement(term2044, 0, 10354688);
        setIntElement(term2044, 2, 6553600);
        setIntElement(term2044, 3, 393216);
        setIntElement(term2044, 4, 3866630);
        setIntElement(term2044, 5, 1245184);
        setIntElement(term2044, 6, 3211264);
        setIntElement(term2044, 8, 6553600);
        setIntElement(term2044, 9, 393216);
        setIntElement(term2044, 10, 3866630);
        setIntElement(term2044, 11, 14352384);
        setIntElement(term2044, 12, 10354688);
        setIntElement(term2044, 13, 2883584);
        setIntElement(term2044, 14, 786432);
        setIntElement(term2044, 15, 1441792);
        setIntElement(term2044, 16, 7733248);
        setIntElement(term2044, 17, 20774912);
        setIntElement(term2044, 18, 262144);
        setIntElement(term2044, 19, 2555904);
        setIntElement(term2044, 20, 1835008);
        setIntElement(term2044, 21, 6029312);
        setIntElement(term2044, 22, 327680);
        setIntElement(term2044, 23, 1638400);
        setIntElement(term2044, 24, 720907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.StringUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2033;
        callMethod(klass, "isActuallyWhitespace", argTypes, term2032, args);
        assertTrue(recursiveEquals(term2033, term2044));
    }

};


