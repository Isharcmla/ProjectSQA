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

public class Attributes_hasKey_92149790747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;
     Object term49136;

    public Attributes_hasKey_92149790747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term531 = (Object[]) newArray("java.lang.String", 0);
        Object[] term532 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term529, term529.getClass(), "size", -1456670397);
        setField(term529, term529.getClass(), "keys", term531);
        setField(term529, term529.getClass(), "vals", term532);
        term49136 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49137 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49138 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49136, term49136.getClass(), "size", -1456670397);
        setField(term49136, term49136.getClass(), "keys", term49137);
        setField(term49136, term49136.getClass(), "vals", term49138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        Object retValue = callMethod(klass, "hasKey", argTypes, term529, args);
        assertTrue(recursiveEquals(term529, term49136));
        assertTrue(recursiveEquals(retValue, false));
    }

};


