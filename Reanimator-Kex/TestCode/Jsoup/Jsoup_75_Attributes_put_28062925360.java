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

public class Attributes_put_28062925360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2862237;
     Object term3615090;
     Object term3614712;

    public Attributes_put_28062925360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2862237 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2862135 = (Object[]) newArray("java.lang.String", 0);
        Object[] term2862138 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term2862237, term2862237.getClass(), "size", 0);
        setField(term2862237, term2862237.getClass(), "keys", term2862135);
        setField(term2862237, term2862237.getClass(), "vals", term2862138);
        term3615090 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3615091 = (Object[]) newArray("java.lang.String", 4);
        Object[] term3615094 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term3615090, term3615090.getClass(), "size", 1);
        setElement(term3615091, 0, "");
        setField(term3615090, term3615090.getClass(), "keys", term3615091);
        setField(term3615090, term3615090.getClass(), "vals", term3615094);
        term3614712 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3614715 = (Object[]) newArray("java.lang.String", 4);
        Object[] term3614722 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term3614712, term3614712.getClass(), "size", 1);
        setElement(term3614715, 0, "");
        setField(term3614712, term3614712.getClass(), "keys", term3614715);
        setField(term3614712, term3614712.getClass(), "vals", term3614722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object retValue = callMethod(klass, "put", argTypes, term2862237, args);
        assertTrue(recursiveEquals(term2862237, term3615090));
        assertTrue(recursiveEquals(retValue, term3614712));
    }

};


