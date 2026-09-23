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

public class InvocationMatcher_hasSimilarMethod_23041363322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1882;
     Object term1996;

    public InvocationMatcher_hasSimilarMethod_23041363322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1992 = new ArrayList();
        ((ArrayList) term1992).add((Object)null);
        ((ArrayList) term1992).add((Object)null);
        ((ArrayList) term1992).add((Object)null);
        ((ArrayList) term1992).add((Object)null);
        term1882 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term1883 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1885 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1886 = (Object[]) newArray("java.lang.Object", 2);
        Object term1887 = newInstance(Class.forName("java.lang.Object"));
        Object term1888 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1889 = (Object[]) newArray("java.lang.Object", 3);
        Object term1890 = newInstance(Class.forName("java.lang.Object"));
        Object term1891 = newInstance(Class.forName("java.lang.Object"));
        Object term1892 = newInstance(Class.forName("java.lang.Object"));
        Object term1893 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term1991 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1883, term1883.getClass(), "sequenceNumber", -1339778481);
        setField(term1883, term1883.getClass(), "mock", term1885);
        setField(term1883, term1883.getClass(), "method", null);
        setElement(term1886, 0, term1887);
        setElement(term1886, 1, term1888);
        setField(term1883, term1883.getClass(), "arguments", term1886);
        setElement(term1889, 0, term1890);
        setElement(term1889, 1, term1891);
        setElement(term1889, 2, term1892);
        setField(term1883, term1883.getClass(), "rawArguments", term1889);
        setField(term1893, term1893.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1883, term1883.getClass(), "location", term1893);
        setBooleanField(term1883, term1883.getClass(), "verified", true);
        setField(term1883, term1883.getClass(), "realMethod", null);
        setField(term1991, term1991.getClass(), "stubbedAt", null);
        setField(term1883, term1883.getClass(), "stubInfo", term1991);
        setField(term1882, term1882.getClass(), "invocation", term1883);
        setField(term1882, term1882.getClass(), "matchers", term1992);
        term1996 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1998 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1999 = (Object[]) newArray("java.lang.Object", 9);
        Object term2000 = newInstance(Class.forName("java.lang.Object"));
        Object term2001 = newInstance(Class.forName("java.lang.Object"));
        Object term2002 = newInstance(Class.forName("java.lang.Object"));
        Object term2003 = newInstance(Class.forName("java.lang.Object"));
        Object term2004 = newInstance(Class.forName("java.lang.Object"));
        Object term2005 = newInstance(Class.forName("java.lang.Object"));
        Object term2006 = newInstance(Class.forName("java.lang.Object"));
        Object term2007 = newInstance(Class.forName("java.lang.Object"));
        Object term2008 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2009 = (Object[]) newArray("java.lang.Object", 4);
        Object term2010 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term2108 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1996, term1996.getClass(), "sequenceNumber", 1725571209);
        setField(term1996, term1996.getClass(), "mock", term1998);
        setField(term1996, term1996.getClass(), "method", null);
        setElement(term1999, 0, term2000);
        setElement(term1999, 1, term2001);
        setElement(term1999, 2, term2002);
        setElement(term1999, 3, term2003);
        setElement(term1999, 4, term2004);
        setElement(term1999, 5, term2005);
        setElement(term1999, 6, term2006);
        setElement(term1999, 7, term2007);
        setElement(term1999, 8, term2008);
        setField(term1996, term1996.getClass(), "arguments", term1999);
        setElement(term2009, 0, term2006);
        setElement(term2009, 1, term2007);
        setElement(term2009, 2, term1998);
        setElement(term2009, 3, term2004);
        setField(term1996, term1996.getClass(), "rawArguments", term2009);
        setField(term2010, term2010.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1996, term1996.getClass(), "location", term2010);
        setBooleanField(term1996, term1996.getClass(), "verified", false);
        setField(term1996, term1996.getClass(), "realMethod", null);
        setField(term2108, term2108.getClass(), "stubbedAt", null);
        setField(term1996, term1996.getClass(), "stubInfo", term2108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term1996;
        try {
            callMethod(klass, "hasSimilarMethod", argTypes, term1882, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


