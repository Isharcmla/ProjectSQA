package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_hasSimilarMethod_23041363321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1891;
     Object term2006;

    public InvocationMatcher_hasSimilarMethod_23041363321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2002 = new ArrayList();
        ((ArrayList) term2002).add((Object)null);
        ((ArrayList) term2002).add((Object)null);
        ((ArrayList) term2002).add((Object)null);
        ((ArrayList) term2002).add((Object)null);
        term1891 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1892 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1894 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1895 = (Object[]) newArray("java.lang.Object", 2);
        Object term1896 = newInstance(Class.forName("java.lang.Object"));
        Object term1897 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1898 = (Object[]) newArray("java.lang.Object", 3);
        Object term1899 = newInstance(Class.forName("java.lang.Object"));
        Object term1900 = newInstance(Class.forName("java.lang.Object"));
        Object term1901 = newInstance(Class.forName("java.lang.Object"));
        Object term1902 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2001 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1892, term1892.getClass(), "sequenceNumber", -1339778481);
        setField(term1892, term1892.getClass(), "mock", term1894);
        setField(term1892, term1892.getClass(), "method", null);
        setElement(term1895, 0, term1896);
        setElement(term1895, 1, term1897);
        setField(term1892, term1892.getClass(), "arguments", term1895);
        setElement(term1898, 0, term1899);
        setElement(term1898, 1, term1900);
        setElement(term1898, 2, term1901);
        setField(term1892, term1892.getClass(), "rawArguments", term1898);
        setField(term1902, term1902.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1892, term1892.getClass(), "location", term1902);
        setBooleanField(term1892, term1892.getClass(), "verified", false);
        setBooleanField(term1892, term1892.getClass(), "verifiedInOrder", false);
        setField(term1892, term1892.getClass(), "realMethod", null);
        setField(term2001, term2001.getClass(), "stubbedAt", null);
        setField(term1892, term1892.getClass(), "stubInfo", term2001);
        setField(term1891, term1891.getClass(), "invocation", term1892);
        setField(term1891, term1891.getClass(), "matchers", term2002);
        term2006 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2008 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2009 = (Object[]) newArray("java.lang.Object", 9);
        Object term2010 = newInstance(Class.forName("java.lang.Object"));
        Object term2011 = newInstance(Class.forName("java.lang.Object"));
        Object term2012 = newInstance(Class.forName("java.lang.Object"));
        Object term2013 = newInstance(Class.forName("java.lang.Object"));
        Object term2014 = newInstance(Class.forName("java.lang.Object"));
        Object term2015 = newInstance(Class.forName("java.lang.Object"));
        Object term2016 = newInstance(Class.forName("java.lang.Object"));
        Object term2017 = newInstance(Class.forName("java.lang.Object"));
        Object term2018 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2019 = (Object[]) newArray("java.lang.Object", 4);
        Object term2020 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2119 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2006, term2006.getClass(), "sequenceNumber", 1725571209);
        setField(term2006, term2006.getClass(), "mock", term2008);
        setField(term2006, term2006.getClass(), "method", null);
        setElement(term2009, 0, term2010);
        setElement(term2009, 1, term2011);
        setElement(term2009, 2, term2012);
        setElement(term2009, 3, term2013);
        setElement(term2009, 4, term2014);
        setElement(term2009, 5, term2015);
        setElement(term2009, 6, term2016);
        setElement(term2009, 7, term2017);
        setElement(term2009, 8, term2018);
        setField(term2006, term2006.getClass(), "arguments", term2009);
        setElement(term2019, 0, term2016);
        setElement(term2019, 1, term2017);
        setElement(term2019, 2, term2008);
        setElement(term2019, 3, term2014);
        setField(term2006, term2006.getClass(), "rawArguments", term2019);
        setField(term2020, term2020.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2006, term2006.getClass(), "location", term2020);
        setBooleanField(term2006, term2006.getClass(), "verified", true);
        setBooleanField(term2006, term2006.getClass(), "verifiedInOrder", true);
        setField(term2006, term2006.getClass(), "realMethod", null);
        setField(term2119, term2119.getClass(), "stubbedAt", null);
        setField(term2006, term2006.getClass(), "stubInfo", term2119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term2006;
        try {
            callMethod(klass, "hasSimilarMethod", argTypes, term1891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


