package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_180316978510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11613715;
     Object term13867089;
     Object term13867070;

    public Attributes_put_180316978510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11613715 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11613557 = (Object[]) newArray("java.lang.String", 1);
        Object[] term11613561 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term11613715, term11613715.getClass(), "size", 1);
        setField(term11613715, term11613715.getClass(), "keys", term11613557);
        setField(term11613715, term11613715.getClass(), "vals", term11613561);
        term13867089 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13867090 = (Object[]) newArray("java.lang.String", 4);
        Object[] term13867093 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term13867089, term13867089.getClass(), "size", 2);
        setElement(term13867090, 1, "");
        setField(term13867089, term13867089.getClass(), "keys", term13867090);
        setField(term13867089, term13867089.getClass(), "vals", term13867093);
        term13867070 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13867072 = (Object[]) newArray("java.lang.String", 4);
        Object[] term13867075 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term13867070, term13867070.getClass(), "size", 2);
        setElement(term13867072, 1, "");
        setField(term13867070, term13867070.getClass(), "keys", term13867072);
        setField(term13867070, term13867070.getClass(), "vals", term13867075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term11613715, args);
        assertTrue(recursiveEquals(term11613715, term13867089));
        assertTrue(recursiveEquals(retValue, term13867070));
    }

};


